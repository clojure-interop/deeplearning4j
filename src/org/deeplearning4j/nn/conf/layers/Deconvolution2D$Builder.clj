(ns org.deeplearning4j.nn.conf.layers.Deconvolution2D$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers Deconvolution2D$Builder]))

(defn ->builder
  "Constructor.

  kernel-size - `int[]`
  stride - `int[]`
  padding - `int[]`"
  (^Deconvolution2D$Builder [kernel-size stride padding]
    (new Deconvolution2D$Builder kernel-size stride padding))
  (^Deconvolution2D$Builder [kernel-size stride]
    (new Deconvolution2D$Builder kernel-size stride))
  (^Deconvolution2D$Builder [^Integer kernel-size]
    (new Deconvolution2D$Builder kernel-size))
  (^Deconvolution2D$Builder []
    (new Deconvolution2D$Builder )))

(defn convolution-mode
  "Set the convolution mode for the Convolution layer.
  See ConvolutionMode for more details

  convolution-mode - Convolution mode for layer - `org.deeplearning4j.nn.conf.ConvolutionMode`

  returns: `org.deeplearning4j.nn.conf.layers.Deconvolution2D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Deconvolution2D$Builder [^Deconvolution2D$Builder this ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode]
    (-> this (.convolutionMode convolution-mode))))

(defn kernel-size
  "Size of the convolution
  rows/columns

  kernel-size - the height and width of thekernel - `int`

  returns: `org.deeplearning4j.nn.conf.layers.Deconvolution2D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Deconvolution2D$Builder [^Deconvolution2D$Builder this ^Integer kernel-size]
    (-> this (.kernelSize kernel-size))))

(defn stride
  "stride - `int`

  returns: `org.deeplearning4j.nn.conf.layers.Deconvolution2D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Deconvolution2D$Builder [^Deconvolution2D$Builder this ^Integer stride]
    (-> this (.stride stride))))

(defn padding
  "padding - `int`

  returns: `org.deeplearning4j.nn.conf.layers.Deconvolution2D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Deconvolution2D$Builder [^Deconvolution2D$Builder this ^Integer padding]
    (-> this (.padding padding))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.Deconvolution2D`"
  (^org.deeplearning4j.nn.conf.layers.Deconvolution2D [^Deconvolution2D$Builder this]
    (-> this (.build))))

