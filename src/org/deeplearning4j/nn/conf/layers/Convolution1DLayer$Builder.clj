(ns org.deeplearning4j.nn.conf.layers.Convolution1DLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers Convolution1DLayer$Builder]))

(defn ->builder
  "Constructor.

  kernel-size - `int`
  stride - `int`
  padding - `int`"
  (^Convolution1DLayer$Builder [^Integer kernel-size ^Integer stride ^Integer padding]
    (new Convolution1DLayer$Builder kernel-size stride padding))
  (^Convolution1DLayer$Builder [^Integer kernel-size ^Integer stride]
    (new Convolution1DLayer$Builder kernel-size stride))
  (^Convolution1DLayer$Builder [^Integer kernel-size]
    (new Convolution1DLayer$Builder kernel-size))
  (^Convolution1DLayer$Builder []
    (new Convolution1DLayer$Builder )))

(defn kernel-size
  "Size of the convolution

  kernel-size - the length of the kernel - `int`

  returns: `org.deeplearning4j.nn.conf.layers.Convolution1DLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Convolution1DLayer$Builder [^Convolution1DLayer$Builder this ^Integer kernel-size]
    (-> this (.kernelSize kernel-size))))

(defn stride
  "stride - `int`

  returns: `org.deeplearning4j.nn.conf.layers.Convolution1DLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Convolution1DLayer$Builder [^Convolution1DLayer$Builder this ^Integer stride]
    (-> this (.stride stride))))

(defn padding
  "padding - `int`

  returns: `org.deeplearning4j.nn.conf.layers.Convolution1DLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Convolution1DLayer$Builder [^Convolution1DLayer$Builder this ^Integer padding]
    (-> this (.padding padding))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.Convolution1DLayer`"
  (^org.deeplearning4j.nn.conf.layers.Convolution1DLayer [^Convolution1DLayer$Builder this]
    (-> this (.build))))

