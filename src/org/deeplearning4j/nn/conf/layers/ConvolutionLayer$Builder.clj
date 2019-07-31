(ns org.deeplearning4j.nn.conf.layers.ConvolutionLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers ConvolutionLayer$Builder]))

(defn ->builder
  "Constructor.

  kernel-size - `int[]`
  stride - `int[]`
  padding - `int[]`"
  (^ConvolutionLayer$Builder [kernel-size stride padding]
    (new ConvolutionLayer$Builder kernel-size stride padding))
  (^ConvolutionLayer$Builder [kernel-size stride]
    (new ConvolutionLayer$Builder kernel-size stride))
  (^ConvolutionLayer$Builder [^Integer kernel-size]
    (new ConvolutionLayer$Builder kernel-size))
  (^ConvolutionLayer$Builder []
    (new ConvolutionLayer$Builder )))

(defn kernel-size
  "Size of the convolution
  rows/columns

  kernel-size - the height and width of thekernel - `int`

  returns: `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$Builder [^ConvolutionLayer$Builder this ^Integer kernel-size]
    (-> this (.kernelSize kernel-size))))

(defn stride
  "stride - `int`

  returns: `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$Builder [^ConvolutionLayer$Builder this ^Integer stride]
    (-> this (.stride stride))))

(defn padding
  "padding - `int`

  returns: `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$Builder [^ConvolutionLayer$Builder this ^Integer padding]
    (-> this (.padding padding))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.ConvolutionLayer`"
  (^org.deeplearning4j.nn.conf.layers.ConvolutionLayer [^ConvolutionLayer$Builder this]
    (-> this (.build))))

