(ns org.deeplearning4j.nn.conf.preprocessor.BaseInputPreProcessor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.preprocessor BaseInputPreProcessor]))

(defn ->base-input-pre-processor
  "Constructor."
  (^BaseInputPreProcessor []
    (new BaseInputPreProcessor )))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.preprocessor.BaseInputPreProcessor`"
  (^org.deeplearning4j.nn.conf.preprocessor.BaseInputPreProcessor [^BaseInputPreProcessor this]
    (-> this (.clone))))

(defn feed-forward-mask-array
  "mask-array - `org.nd4j.linalg.api.ndarray.INDArray`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^BaseInputPreProcessor this ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArray mask-array current-mask-state minibatch-size))))

