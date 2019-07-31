(ns org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BaseConvBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers ConvolutionLayer$BaseConvBuilder]))

(defn kernel-size
  "Instance Field.

  type: int[]"
  ([^ConvolutionLayer$BaseConvBuilder this]
    (-> this .-kernelSize)))

(defn cudnn-fwd-mode
  "cudnn-fwd-algo - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo`

  returns: `T`"
  ([^ConvolutionLayer$BaseConvBuilder this ^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$FwdAlgo cudnn-fwd-algo]
    (-> this (.cudnnFwdMode cudnn-fwd-algo))))

(defn cudnn-algo-mode
  "Defaults to \"PREFER_FASTEST\", but \"NO_WORKSPACE\" uses less memory.

  cudnn-algo-mode - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode`

  returns: `T`"
  ([^ConvolutionLayer$BaseConvBuilder this ^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode cudnn-algo-mode]
    (-> this (.cudnnAlgoMode cudnn-algo-mode))))

(defn cudnn-allow-fallback
  "When using CuDNN and an error is encountered, should fallback to the non-CuDNN implementatation be allowed?
  If set to false, an exception in CuDNN will be propagated back to the user. If false, the built-in (non-CuDNN)
  implementation for ConvolutionLayer will be used

  allow-fallback - Whether fallback to non-CuDNN implementation should be used - `boolean`

  returns: `T`"
  ([^ConvolutionLayer$BaseConvBuilder this ^Boolean allow-fallback]
    (-> this (.cudnnAllowFallback allow-fallback))))

(defn padding
  "padding - `int`

  returns: `T`"
  ([^ConvolutionLayer$BaseConvBuilder this ^Integer padding]
    (-> this (.padding padding))))

(defn has-bias
  "If true (default): include bias parameters in the model. False: no bias.

  has-bias - If true: include bias parameters in this model - `boolean`

  returns: `T`"
  ([^ConvolutionLayer$BaseConvBuilder this ^Boolean has-bias]
    (-> this (.hasBias has-bias))))

(defn dilation
  "Kernel dilation. Default: {1, 1}, which is standard convolutions. Used for implementing dilated convolutions,
  which are also known as atrous convolutions.

  For more details, see:
  Yu and Koltun (2014) and
  Chen et al. (2014), as well as

  http://deeplearning.net/software/theano/tutorial/conv_arithmetic.html#dilated-convolutions

  dilation - Dilation for kernel - `int`

  returns: `T`"
  ([^ConvolutionLayer$BaseConvBuilder this ^Integer dilation]
    (-> this (.dilation dilation))))

(defn convolution-mode
  "Set the convolution mode for the Convolution layer.
  See ConvolutionMode for more details

  convolution-mode - Convolution mode for layer - `org.deeplearning4j.nn.conf.ConvolutionMode`

  returns: `T`"
  ([^ConvolutionLayer$BaseConvBuilder this ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode]
    (-> this (.convolutionMode convolution-mode))))

(defn cudnn-bwd-filter-mode
  "cudnn-bwd-filter-algo - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdFilterAlgo`

  returns: `T`"
  ([^ConvolutionLayer$BaseConvBuilder this ^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdFilterAlgo cudnn-bwd-filter-algo]
    (-> this (.cudnnBwdFilterMode cudnn-bwd-filter-algo))))

(defn cudnn-bwd-data-mode
  "cudnn-bwd-data-algo - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdDataAlgo`

  returns: `T`"
  ([^ConvolutionLayer$BaseConvBuilder this ^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$BwdDataAlgo cudnn-bwd-data-algo]
    (-> this (.cudnnBwdDataMode cudnn-bwd-data-algo))))

(defn kernel-size
  "kernel-size - `int`

  returns: `T`"
  ([^ConvolutionLayer$BaseConvBuilder this ^Integer kernel-size]
    (-> this (.kernelSize kernel-size))))

(defn stride
  "stride - `int`

  returns: `T`"
  ([^ConvolutionLayer$BaseConvBuilder this ^Integer stride]
    (-> this (.stride stride))))

