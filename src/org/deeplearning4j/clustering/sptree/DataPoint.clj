(ns org.deeplearning4j.clustering.sptree.DataPoint
  "A vector with an index and function for distance"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.sptree DataPoint]))

(defn ->data-point
  "Constructor.

  index - `int`
  point - `org.nd4j.linalg.api.ndarray.INDArray`
  function-name - `java.lang.String`
  invert - `boolean`"
  (^DataPoint [^Integer index ^org.nd4j.linalg.api.ndarray.INDArray point ^java.lang.String function-name ^Boolean invert]
    (new DataPoint index point function-name invert))
  (^DataPoint [^Integer index ^org.nd4j.linalg.api.ndarray.INDArray point ^Boolean invert]
    (new DataPoint index point invert))
  (^DataPoint [^Integer index ^org.nd4j.linalg.api.ndarray.INDArray point]
    (new DataPoint index point)))

(defn distance
  "Euclidean distance

  point - the distance from this point to the given point - `org.deeplearning4j.clustering.sptree.DataPoint`

  returns: the distance between the two points - `float`"
  (^Float [^DataPoint this ^org.deeplearning4j.clustering.sptree.DataPoint point]
    (-> this (.distance point))))

