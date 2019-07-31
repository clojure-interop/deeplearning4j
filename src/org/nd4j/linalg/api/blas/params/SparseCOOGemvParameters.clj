(ns org.nd4j.linalg.api.blas.params.SparseCOOGemvParameters
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas.params SparseCOOGemvParameters]))

(defn ->sparse-coo-gemv-parameters
  "Constructor.

  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^SparseCOOGemvParameters [^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new SparseCOOGemvParameters a x y)))

