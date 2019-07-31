(ns org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers SubsamplingLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^SubsamplingLayerSpace$Builder []
    (new SubsamplingLayerSpace$Builder )))

(defn pnorm
  "pnorm - `int`

  returns: `org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace$Builder [^SubsamplingLayerSpace$Builder this ^Integer pnorm]
    (-> this (.pnorm pnorm))))

(defn padding
  "padding - `int`

  returns: `org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace$Builder [^SubsamplingLayerSpace$Builder this ^Integer padding]
    (-> this (.padding padding))))

(defn eps
  "eps - `double`

  returns: `org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace$Builder [^SubsamplingLayerSpace$Builder this ^Double eps]
    (-> this (.eps eps))))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace [^SubsamplingLayerSpace$Builder this]
    (-> this (.build))))

(defn dilation
  "dilation - `int`

  returns: `org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace$Builder [^SubsamplingLayerSpace$Builder this ^Integer dilation]
    (-> this (.dilation dilation))))

(defn convolution-mode
  "convolution-mode - `org.deeplearning4j.nn.conf.ConvolutionMode`

  returns: `org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace$Builder [^SubsamplingLayerSpace$Builder this ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode]
    (-> this (.convolutionMode convolution-mode))))

(defn kernel-size
  "kernel-size - `int`

  returns: `org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace$Builder [^SubsamplingLayerSpace$Builder this ^Integer kernel-size]
    (-> this (.kernelSize kernel-size))))

(defn pooling-type
  "pooling-type - `org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType`

  returns: `org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace$Builder [^SubsamplingLayerSpace$Builder this ^org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType pooling-type]
    (-> this (.poolingType pooling-type))))

(defn stride
  "stride - `int`

  returns: `org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace$Builder [^SubsamplingLayerSpace$Builder this ^Integer stride]
    (-> this (.stride stride))))

