(ns org.deeplearning4j.nn.conf.layers.SubsamplingLayer$BaseSubsamplingBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers SubsamplingLayer$BaseSubsamplingBuilder]))

(defn convolution-mode
  "Set the convolution mode for the Convolution layer.
  See ConvolutionMode for more details

  convolution-mode - Convolution mode for layer - `org.deeplearning4j.nn.conf.ConvolutionMode`

  returns: `T`"
  ([^SubsamplingLayer$BaseSubsamplingBuilder this ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode]
    (-> this (.convolutionMode convolution-mode))))

(defn pooling-type
  "pooling-type - `org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType`

  returns: `T`"
  ([^SubsamplingLayer$BaseSubsamplingBuilder this ^org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType pooling-type]
    (-> this (.poolingType pooling-type))))

(defn pnorm
  "pnorm - `int`

  returns: `T`"
  ([^SubsamplingLayer$BaseSubsamplingBuilder this ^Integer pnorm]
    (-> this (.pnorm pnorm))))

(defn eps
  "eps - `double`

  returns: `T`"
  ([^SubsamplingLayer$BaseSubsamplingBuilder this ^Double eps]
    (-> this (.eps eps))))

(defn cudnn-allow-fallback
  "When using CuDNN and an error is encountered, should fallback to the non-CuDNN implementatation be allowed?
  If set to false, an exception in CuDNN will be propagated back to the user. If false, the built-in (non-CuDNN)
  implementation for ConvolutionLayer will be used

  allow-fallback - Whether fallback to non-CuDNN implementation should be used - `boolean`

  returns: `T`"
  ([^SubsamplingLayer$BaseSubsamplingBuilder this ^Boolean allow-fallback]
    (-> this (.cudnnAllowFallback allow-fallback))))

