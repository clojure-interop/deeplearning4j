(ns org.deeplearning4j.clustering.kdtree.KDTree
  "KDTree based on: https://github.com/nicky-zs/kdtree-python/blob/master/kdtree.py"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.kdtree KDTree]))

(defn ->kd-tree
  "Constructor.

  dims - `int`"
  (^KDTree [^Integer dims]
    (new KDTree dims)))

(def *-greater
  "Static Constant.

  type: int"
  KDTree/GREATER)

(def *-less
  "Static Constant.

  type: int"
  KDTree/LESS)

(defn insert
  "Insert a point in to the tree

  point - the point to insert - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^KDTree this ^org.nd4j.linalg.api.ndarray.INDArray point]
    (-> this (.insert point))))

(defn delete
  "point - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.deeplearning4j.clustering.kdtree.KDTree$KDNode`"
  (^org.deeplearning4j.clustering.kdtree.KDTree$KDNode [^KDTree this ^org.nd4j.linalg.api.ndarray.INDArray point]
    (-> this (.delete point))))

(defn knn
  "point - `org.nd4j.linalg.api.ndarray.INDArray`
  distance - `double`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<java.lang.Double,org.nd4j.linalg.api.ndarray.INDArray>>`"
  (^java.util.List [^KDTree this ^org.nd4j.linalg.api.ndarray.INDArray point ^Double distance]
    (-> this (.knn point distance))))

(defn nn
  "Query for nearest neighbor. Returns the distance and point

  point - the point to query for - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.primitives.Pair<java.lang.Double,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^KDTree this ^org.nd4j.linalg.api.ndarray.INDArray point]
    (-> this (.nn point))))

(defn size
  "The number of elements in the tree

  returns: the number of elements in the tree - `int`"
  (^Integer [^KDTree this]
    (-> this (.size))))

