(ns org.deeplearning4j.arbiter.layers.BaseConvolutionLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers BaseConvolutionLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^BaseConvolutionLayerSpace$Builder []
    (new BaseConvolutionLayerSpace$Builder )))

(defn dilation
  "dilation - `int`

  returns: `T`"
  ([^BaseConvolutionLayerSpace$Builder this ^Integer dilation]
    (-> this (.dilation dilation))))

(defn kernel-size
  "kernel-size - `int`

  returns: `T`"
  ([^BaseConvolutionLayerSpace$Builder this ^Integer kernel-size]
    (-> this (.kernelSize kernel-size))))

(defn stride
  "stride - `int`

  returns: `T`"
  ([^BaseConvolutionLayerSpace$Builder this ^Integer stride]
    (-> this (.stride stride))))

(defn padding
  "padding - `int`

  returns: `T`"
  ([^BaseConvolutionLayerSpace$Builder this ^Integer padding]
    (-> this (.padding padding))))

(defn convolution-mode
  "convolution-mode - `org.deeplearning4j.nn.conf.ConvolutionMode`

  returns: `T`"
  ([^BaseConvolutionLayerSpace$Builder this ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode]
    (-> this (.convolutionMode convolution-mode))))

(defn has-bias
  "has-bias - `boolean`

  returns: `T`"
  ([^BaseConvolutionLayerSpace$Builder this ^Boolean has-bias]
    (-> this (.hasBias has-bias))))

