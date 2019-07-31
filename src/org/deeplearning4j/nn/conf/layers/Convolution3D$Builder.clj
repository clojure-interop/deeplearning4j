(ns org.deeplearning4j.nn.conf.layers.Convolution3D$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers Convolution3D$Builder]))

(defn ->builder
  "Constructor.

  kernel-size - `int[]`
  stride - `int[]`
  padding - `int[]`
  dilation - `int[]`"
  (^Convolution3D$Builder [kernel-size stride padding dilation]
    (new Convolution3D$Builder kernel-size stride padding dilation))
  (^Convolution3D$Builder [kernel-size stride padding]
    (new Convolution3D$Builder kernel-size stride padding))
  (^Convolution3D$Builder [kernel-size stride]
    (new Convolution3D$Builder kernel-size stride))
  (^Convolution3D$Builder [^Integer kernel-size]
    (new Convolution3D$Builder kernel-size))
  (^Convolution3D$Builder []
    (new Convolution3D$Builder )))

(defn kernel-size
  "Set kernel size for 3D convolutions in (depth, height, width) order

  kernel-size - kernel size - `int`

  returns: 3D convolution layer builder - `org.deeplearning4j.nn.conf.layers.Convolution3D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Convolution3D$Builder [^Convolution3D$Builder this ^Integer kernel-size]
    (-> this (.kernelSize kernel-size))))

(defn stride
  "Set stride size for 3D convolutions in (depth, height, width) order

  stride - kernel size - `int`

  returns: 3D convolution layer builder - `org.deeplearning4j.nn.conf.layers.Convolution3D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Convolution3D$Builder [^Convolution3D$Builder this ^Integer stride]
    (-> this (.stride stride))))

(defn padding
  "Set padding size for 3D convolutions in (depth, height, width) order

  padding - kernel size - `int`

  returns: 3D convolution layer builder - `org.deeplearning4j.nn.conf.layers.Convolution3D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Convolution3D$Builder [^Convolution3D$Builder this ^Integer padding]
    (-> this (.padding padding))))

(defn dilation
  "Set dilation size for 3D convolutions in (depth, height, width) order

  dilation - kernel size - `int`

  returns: 3D convolution layer builder - `org.deeplearning4j.nn.conf.layers.Convolution3D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Convolution3D$Builder [^Convolution3D$Builder this ^Integer dilation]
    (-> this (.dilation dilation))))

(defn convolution-mode
  "Description copied from class: ConvolutionLayer.BaseConvBuilder

  mode - Convolution mode for layer - `org.deeplearning4j.nn.conf.ConvolutionMode`

  returns: `org.deeplearning4j.nn.conf.layers.Convolution3D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Convolution3D$Builder [^Convolution3D$Builder this ^org.deeplearning4j.nn.conf.ConvolutionMode mode]
    (-> this (.convolutionMode mode))))

(defn data-format
  "data-format - `org.deeplearning4j.nn.conf.layers.Convolution3D$DataFormat`

  returns: `org.deeplearning4j.nn.conf.layers.Convolution3D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Convolution3D$Builder [^Convolution3D$Builder this ^org.deeplearning4j.nn.conf.layers.Convolution3D$DataFormat data-format]
    (-> this (.dataFormat data-format))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.Convolution3D`"
  (^org.deeplearning4j.nn.conf.layers.Convolution3D [^Convolution3D$Builder this]
    (-> this (.build))))

