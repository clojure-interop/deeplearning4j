(ns org.nd4j.linalg.api.blas.params.GemmParams
  "Used for setting the gemm parameters
 Separates blas logic from
 the run time itself."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas.params GemmParams]))

(defn ->gemm-params
  "Constructor.

  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  c - `org.nd4j.linalg.api.ndarray.INDArray`
  transpose-a - `boolean`
  transpose-b - `boolean`"
  (^GemmParams [^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^org.nd4j.linalg.api.ndarray.INDArray c ^Boolean transpose-a ^Boolean transpose-b]
    (new GemmParams a b c transpose-a transpose-b))
  (^GemmParams [^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^org.nd4j.linalg.api.ndarray.INDArray c]
    (new GemmParams a b c)))

