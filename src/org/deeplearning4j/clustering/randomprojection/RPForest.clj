(ns org.deeplearning4j.clustering.randomprojection.RPForest
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.randomprojection RPForest]))

(defn ->rp-forest
  "Constructor.

  Create the rp forest with the specified number of trees

  num-trees - the number of trees in the forest - `int`
  max-size - the max size of each tree - `int`
  similarity-function - the distance function to use - `java.lang.String`"
  (^RPForest [^Integer num-trees ^Integer max-size ^java.lang.String similarity-function]
    (new RPForest num-trees max-size similarity-function)))

(defn fit
  "Build the trees from the given dataset

  x - the input dataset (should be a 2d matrix) - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^RPForest this ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.fit x))))

(defn get-all-candidates
  "Get all candidates relative to a specific datapoint.

  input - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RPForest this ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.getAllCandidates input))))

(defn query-all
  "Query results up to length n
  nearest neighbors

  to-query - the query item - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of nearest neighbors for the given data point - `int`

  returns: the indices for the nearest neighbors - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RPForest this ^org.nd4j.linalg.api.ndarray.INDArray to-query ^Integer n]
    (-> this (.queryAll to-query n))))

(defn query-with-distances
  "Query all with the distances
  sorted by index

  query - the query vector - `org.nd4j.linalg.api.ndarray.INDArray`
  num-results - the number of results to return - `int`

  returns: a list of samples - `java.util.List<org.nd4j.linalg.primitives.Pair<java.lang.Double,java.lang.Integer>>`"
  (^java.util.List [^RPForest this ^org.nd4j.linalg.api.ndarray.INDArray query ^Integer num-results]
    (-> this (.queryWithDistances query num-results))))

