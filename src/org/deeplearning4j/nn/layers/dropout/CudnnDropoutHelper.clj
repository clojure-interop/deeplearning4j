(ns org.deeplearning4j.nn.layers.dropout.CudnnDropoutHelper
  "CuDNN dropout helper
 Note that for repeatability between calls (for example, for gradient checks), we need to do two things:
 (a) set the ND4J RNG seed
 (b) clear the rngStates field"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.dropout CudnnDropoutHelper]))

(defn ->cudnn-dropout-helper
  "Constructor."
  (^CudnnDropoutHelper []
    (new CudnnDropoutHelper )))

(defn apply-dropout
  "input - `org.nd4j.linalg.api.ndarray.INDArray`
  result-array - `org.nd4j.linalg.api.ndarray.INDArray`
  dropout-input-retain-prob - `double`"
  ([^CudnnDropoutHelper this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray result-array ^Double dropout-input-retain-prob]
    (-> this (.applyDropout input result-array dropout-input-retain-prob))))

(defn backprop
  "grad-at-output - `org.nd4j.linalg.api.ndarray.INDArray`
  grad-at-input - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^CudnnDropoutHelper this ^org.nd4j.linalg.api.ndarray.INDArray grad-at-output ^org.nd4j.linalg.api.ndarray.INDArray grad-at-input]
    (-> this (.backprop grad-at-output grad-at-input))))

