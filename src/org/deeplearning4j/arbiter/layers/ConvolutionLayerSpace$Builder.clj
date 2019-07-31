(ns org.deeplearning4j.arbiter.layers.ConvolutionLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers ConvolutionLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^ConvolutionLayerSpace$Builder []
    (new ConvolutionLayerSpace$Builder )))

(defn dilation
  "dilation - `int`

  returns: `org.deeplearning4j.arbiter.layers.ConvolutionLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.ConvolutionLayerSpace$Builder [^ConvolutionLayerSpace$Builder this ^Integer dilation]
    (-> this (.dilation dilation))))

(defn kernel-size
  "kernel-size - `int`

  returns: `org.deeplearning4j.arbiter.layers.ConvolutionLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.ConvolutionLayerSpace$Builder [^ConvolutionLayerSpace$Builder this ^Integer kernel-size]
    (-> this (.kernelSize kernel-size))))

(defn stride
  "stride - `int`

  returns: `org.deeplearning4j.arbiter.layers.ConvolutionLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.ConvolutionLayerSpace$Builder [^ConvolutionLayerSpace$Builder this ^Integer stride]
    (-> this (.stride stride))))

(defn padding
  "padding - `int`

  returns: `org.deeplearning4j.arbiter.layers.ConvolutionLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.ConvolutionLayerSpace$Builder [^ConvolutionLayerSpace$Builder this ^Integer padding]
    (-> this (.padding padding))))

(defn convolution-mode
  "convolution-mode - `org.deeplearning4j.nn.conf.ConvolutionMode`

  returns: `org.deeplearning4j.arbiter.layers.ConvolutionLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.ConvolutionLayerSpace$Builder [^ConvolutionLayerSpace$Builder this ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode]
    (-> this (.convolutionMode convolution-mode))))

(defn has-bias
  "has-bias - `boolean`

  returns: `org.deeplearning4j.arbiter.layers.ConvolutionLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.ConvolutionLayerSpace$Builder [^ConvolutionLayerSpace$Builder this ^Boolean has-bias]
    (-> this (.hasBias has-bias))))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.ConvolutionLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.ConvolutionLayerSpace [^ConvolutionLayerSpace$Builder this]
    (-> this (.build))))

