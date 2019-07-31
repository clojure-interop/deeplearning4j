(ns org.nd4j.linalg.api.ops.LossFunction
  "A loss function for computing
 the delta between two arrays"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops LossFunction]))

(defn input
  "The true

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LossFunction this]
    (-> this (.input))))

(defn output
  "The guess

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LossFunction this]
    (-> this (.output))))

