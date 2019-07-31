(ns org.deeplearning4j.clustering.vptree.VPTree
  "Vantage point tree implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.vptree VPTree]))

(defn ->vp-tree
  "Constructor.

  items - the items to use - `java.util.List`
  similarity-function - the similarity function to use - `java.lang.String`
  workers - number of parallel workers for tree building (increases memory requirements!) - `int`
  invert - whether to invert the metric (different optimization objective) - `boolean`"
  (^VPTree [^java.util.List items ^java.lang.String similarity-function ^Integer workers ^Boolean invert]
    (new VPTree items similarity-function workers invert))
  (^VPTree [^org.nd4j.linalg.api.ndarray.INDArray points ^Boolean invert ^Integer workers]
    (new VPTree points invert workers))
  (^VPTree [^org.nd4j.linalg.api.ndarray.INDArray points ^Boolean invert]
    (new VPTree points invert))
  (^VPTree [^org.nd4j.linalg.api.ndarray.INDArray items]
    (new VPTree items)))

(def *-euclidean
  "Static Constant.

  type: java.lang.String"
  VPTree/EUCLIDEAN)

(defn *build-from-data
  "Create an ndarray
  from the datapoints

  data - `java.util.List`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.util.List data]
    (VPTree/buildFromData data)))

(defn calc-distances-relative-to
  "items - `org.nd4j.linalg.api.ndarray.INDArray`
  base-point - `org.nd4j.linalg.api.ndarray.INDArray`
  distances-arr - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^VPTree this ^org.nd4j.linalg.api.ndarray.INDArray items ^org.nd4j.linalg.api.ndarray.INDArray base-point ^org.nd4j.linalg.api.ndarray.INDArray distances-arr]
    (-> this (.calcDistancesRelativeTo items base-point distances-arr)))
  ([^VPTree this ^org.nd4j.linalg.api.ndarray.INDArray base-point ^org.nd4j.linalg.api.ndarray.INDArray distances-arr]
    (-> this (.calcDistancesRelativeTo base-point distances-arr))))

(defn distance
  "Euclidean distance

  arr-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  arr-2 - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the distance between the two points - `float`"
  (^Float [^VPTree this ^org.nd4j.linalg.api.ndarray.INDArray arr-1 ^org.nd4j.linalg.api.ndarray.INDArray arr-2]
    (-> this (.distance arr-1 arr-2))))

(defn search
  "node - `org.deeplearning4j.clustering.vptree.VPTree$Node`
  target - `org.nd4j.linalg.api.ndarray.INDArray`
  k - `int`
  pq - `java.util.PriorityQueue`
  c-tau - `double`"
  ([^VPTree this ^org.deeplearning4j.clustering.vptree.VPTree$Node node ^org.nd4j.linalg.api.ndarray.INDArray target ^Integer k ^java.util.PriorityQueue pq ^Double c-tau]
    (-> this (.search node target k pq c-tau)))
  ([^VPTree this ^org.nd4j.linalg.api.ndarray.INDArray target ^Integer k ^java.util.List results ^java.util.List distances]
    (-> this (.search target k results distances))))

