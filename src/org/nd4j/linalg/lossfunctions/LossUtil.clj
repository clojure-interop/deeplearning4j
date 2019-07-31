(ns org.nd4j.linalg.lossfunctions.LossUtil
  "Created by Alex on 14/09/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.lossfunctions LossUtil]))

(defn ->loss-util
  "Constructor."
  (^LossUtil []
    (new LossUtil )))

(defn *per-output-masking?
  "to - `org.nd4j.linalg.api.ndarray.INDArray`
  mask - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `boolean`"
  (^Boolean [^org.nd4j.linalg.api.ndarray.INDArray to ^org.nd4j.linalg.api.ndarray.INDArray mask]
    (LossUtil/isPerOutputMasking to mask)))

(defn *apply-mask
  "to - `org.nd4j.linalg.api.ndarray.INDArray`
  mask - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray to ^org.nd4j.linalg.api.ndarray.INDArray mask]
    (LossUtil/applyMask to mask)))

