(ns org.deeplearning4j.clustering.cluster.Point
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.cluster Point]))

(defn ->point
  "Constructor.

  id - `java.lang.String`
  label - `java.lang.String`
  data - `double[]`"
  (^Point [^java.lang.String id ^java.lang.String label data]
    (new Point id label data))
  (^Point [^java.lang.String id ^org.nd4j.linalg.api.ndarray.INDArray array]
    (new Point id array))
  (^Point [^org.nd4j.linalg.api.ndarray.INDArray array]
    (new Point array)))

(defn *to-points
  "matrix - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `java.util.List<org.deeplearning4j.clustering.cluster.Point>`"
  (^java.util.List [^org.nd4j.linalg.api.ndarray.INDArray matrix]
    (Point/toPoints matrix)))

