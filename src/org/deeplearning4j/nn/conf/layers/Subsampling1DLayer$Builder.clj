(ns org.deeplearning4j.nn.conf.layers.Subsampling1DLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers Subsampling1DLayer$Builder]))

(defn ->builder
  "Constructor.

  pooling-type - `org.deeplearning4j.nn.conf.layers.PoolingType`
  kernel-size - `int`
  stride - `int`
  padding - `int`"
  (^Subsampling1DLayer$Builder [^org.deeplearning4j.nn.conf.layers.PoolingType pooling-type ^Integer kernel-size ^Integer stride ^Integer padding]
    (new Subsampling1DLayer$Builder pooling-type kernel-size stride padding))
  (^Subsampling1DLayer$Builder [^org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType pooling-type ^Integer kernel-size ^Integer stride]
    (new Subsampling1DLayer$Builder pooling-type kernel-size stride))
  (^Subsampling1DLayer$Builder [^org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType pooling-type ^Integer kernel-size]
    (new Subsampling1DLayer$Builder pooling-type kernel-size))
  (^Subsampling1DLayer$Builder [^Integer kernel-size]
    (new Subsampling1DLayer$Builder kernel-size))
  (^Subsampling1DLayer$Builder []
    (new Subsampling1DLayer$Builder )))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.Subsampling1DLayer`"
  (^org.deeplearning4j.nn.conf.layers.Subsampling1DLayer [^Subsampling1DLayer$Builder this]
    (-> this (.build))))

(defn kernel-size
  "Kernel size

  kernel-size - kernel size in height and width dimensions - `int`

  returns: `org.deeplearning4j.nn.conf.layers.Subsampling1DLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Subsampling1DLayer$Builder [^Subsampling1DLayer$Builder this ^Integer kernel-size]
    (-> this (.kernelSize kernel-size))))

(defn stride
  "Stride

  stride - stride value - `int`

  returns: `org.deeplearning4j.nn.conf.layers.Subsampling1DLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Subsampling1DLayer$Builder [^Subsampling1DLayer$Builder this ^Integer stride]
    (-> this (.stride stride))))

(defn padding
  "Padding

  padding - padding value - `int`

  returns: `org.deeplearning4j.nn.conf.layers.Subsampling1DLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Subsampling1DLayer$Builder [^Subsampling1DLayer$Builder this ^Integer padding]
    (-> this (.padding padding))))

