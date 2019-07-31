(ns org.deeplearning4j.clustering.randomprojection.RPTree
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.randomprojection RPTree]))

(defn ->rp-tree
  "Constructor.

  dim - the dimension of the vectors - `int`
  max-size - the max size of the leaves - `int`
  similarity-function - `java.lang.String`"
  (^RPTree [^Integer dim ^Integer max-size ^java.lang.String similarity-function]
    (new RPTree dim max-size similarity-function))
  (^RPTree [^Integer dim ^Integer max-size]
    (new RPTree dim max-size)))

(defn build-tree
  "Build the tree with the given input data

  x - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^RPTree this ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.buildTree x))))

(defn add-node-at-index
  "idx - `int`
  to-add - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^RPTree this ^Integer idx ^org.nd4j.linalg.api.ndarray.INDArray to-add]
    (-> this (.addNodeAtIndex idx to-add))))

(defn get-leaves
  "returns: `java.util.List<org.deeplearning4j.clustering.randomprojection.RPNode>`"
  (^java.util.List [^RPTree this]
    (-> this (.getLeaves))))

(defn query-with-distances
  "Query all with the distances
  sorted by index

  query - the query vector - `org.nd4j.linalg.api.ndarray.INDArray`
  num-results - the number of results to return - `int`

  returns: a list of samples - `java.util.List<org.nd4j.linalg.primitives.Pair<java.lang.Double,java.lang.Integer>>`"
  (^java.util.List [^RPTree this ^org.nd4j.linalg.api.ndarray.INDArray query ^Integer num-results]
    (-> this (.queryWithDistances query num-results))))

(defn query
  "query - `org.nd4j.linalg.api.ndarray.INDArray`
  num-results - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RPTree this ^org.nd4j.linalg.api.ndarray.INDArray query ^Integer num-results]
    (-> this (.query query num-results))))

(defn get-candidates
  "target - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^RPTree this ^org.nd4j.linalg.api.ndarray.INDArray target]
    (-> this (.getCandidates target))))

