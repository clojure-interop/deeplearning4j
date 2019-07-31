(ns org.nd4j.linalg.api.blas.params.GemvParameters
  "Gemv parameters:
 The parameters for general matrix
 vector operations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas.params GemvParameters]))

(defn ->gemv-parameters
  "Constructor.

  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^GemvParameters [^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new GemvParameters a x y)))

