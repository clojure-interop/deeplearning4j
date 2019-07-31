(ns org.deeplearning4j.nn.conf.dropout.DropoutHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.dropout DropoutHelper]))

(defn check-supported
  "returns: `boolean`"
  (^Boolean [^DropoutHelper this]
    (-> this (.checkSupported))))

(defn apply-dropout
  "input-activations - `org.nd4j.linalg.api.ndarray.INDArray`
  result-array - `org.nd4j.linalg.api.ndarray.INDArray`
  dropout-input-retain-prob - `double`"
  ([^DropoutHelper this ^org.nd4j.linalg.api.ndarray.INDArray input-activations ^org.nd4j.linalg.api.ndarray.INDArray result-array ^Double dropout-input-retain-prob]
    (-> this (.applyDropout input-activations result-array dropout-input-retain-prob))))

(defn backprop
  "grad-at-output - `org.nd4j.linalg.api.ndarray.INDArray`
  grad-at-input - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DropoutHelper this ^org.nd4j.linalg.api.ndarray.INDArray grad-at-output ^org.nd4j.linalg.api.ndarray.INDArray grad-at-input]
    (-> this (.backprop grad-at-output grad-at-input))))

