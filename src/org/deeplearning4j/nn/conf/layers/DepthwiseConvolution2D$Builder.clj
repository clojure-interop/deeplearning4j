(ns org.deeplearning4j.nn.conf.layers.DepthwiseConvolution2D$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers DepthwiseConvolution2D$Builder]))

(defn ->builder
  "Constructor.

  kernel-size - `int[]`
  stride - `int[]`
  padding - `int[]`"
  (^DepthwiseConvolution2D$Builder [kernel-size stride padding]
    (new DepthwiseConvolution2D$Builder kernel-size stride padding))
  (^DepthwiseConvolution2D$Builder [kernel-size stride]
    (new DepthwiseConvolution2D$Builder kernel-size stride))
  (^DepthwiseConvolution2D$Builder [^Integer kernel-size]
    (new DepthwiseConvolution2D$Builder kernel-size))
  (^DepthwiseConvolution2D$Builder []
    (new DepthwiseConvolution2D$Builder )))

(defn depth-multiplier
  "Instance Field.

  type: int"
  (^Integer [^DepthwiseConvolution2D$Builder this]
    (-> this .-depthMultiplier)))

(defn depth-multiplier
  "Set channels multiplier for depth-wise convolution

  depth-multiplier - integer value, for each input map we get depthMultiplieroutputs in channels-wise step. - `int`

  returns: Builder - `org.deeplearning4j.nn.conf.layers.DepthwiseConvolution2D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.DepthwiseConvolution2D$Builder [^DepthwiseConvolution2D$Builder this ^Integer depth-multiplier]
    (-> this (.depthMultiplier depth-multiplier))))

(defn kernel-size
  "Size of the convolution
  rows/columns

  kernel-size - the height and width of thekernel - `int`

  returns: `org.deeplearning4j.nn.conf.layers.DepthwiseConvolution2D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.DepthwiseConvolution2D$Builder [^DepthwiseConvolution2D$Builder this ^Integer kernel-size]
    (-> this (.kernelSize kernel-size))))

(defn stride
  "stride - `int`

  returns: `org.deeplearning4j.nn.conf.layers.DepthwiseConvolution2D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.DepthwiseConvolution2D$Builder [^DepthwiseConvolution2D$Builder this ^Integer stride]
    (-> this (.stride stride))))

(defn padding
  "padding - `int`

  returns: `org.deeplearning4j.nn.conf.layers.DepthwiseConvolution2D$Builder`"
  (^org.deeplearning4j.nn.conf.layers.DepthwiseConvolution2D$Builder [^DepthwiseConvolution2D$Builder this ^Integer padding]
    (-> this (.padding padding))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.DepthwiseConvolution2D`"
  (^org.deeplearning4j.nn.conf.layers.DepthwiseConvolution2D [^DepthwiseConvolution2D$Builder this]
    (-> this (.build))))

