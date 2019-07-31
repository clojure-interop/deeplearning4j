(ns org.nd4j.linalg.api.blas.params.MMulTranspose
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas.params MMulTranspose]))

(defn ->m-mul-transpose
  "Constructor.

  transpose-a - `boolean`
  transpose-b - `boolean`
  transpose-result - `boolean`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^MMulTranspose [^Boolean transpose-a ^Boolean transpose-b ^Boolean transpose-result ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b]
    (new MMulTranspose transpose-a transpose-b transpose-result a b)))

(defn *all-false
  "Returns the default transpose
  where all are false

  returns: `org.nd4j.linalg.api.blas.params.MMulTranspose`"
  (^org.nd4j.linalg.api.blas.params.MMulTranspose []
    (MMulTranspose/allFalse )))

