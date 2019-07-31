(ns org.deeplearning4j.nn.conf.layers.Subsampling3DLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers Subsampling3DLayer$Builder]))

(defn ->builder
  "Constructor.

  pooling-type - `org.deeplearning4j.nn.conf.layers.Subsampling3DLayer$PoolingType`
  kernel-size - `int[]`
  stride - `int[]`
  padding - `int[]`"
  (^Subsampling3DLayer$Builder [^org.deeplearning4j.nn.conf.layers.Subsampling3DLayer$PoolingType pooling-type kernel-size stride padding]
    (new Subsampling3DLayer$Builder pooling-type kernel-size stride padding))
  (^Subsampling3DLayer$Builder [^org.deeplearning4j.nn.conf.layers.Subsampling3DLayer$PoolingType pooling-type kernel-size stride]
    (new Subsampling3DLayer$Builder pooling-type kernel-size stride))
  (^Subsampling3DLayer$Builder [^org.deeplearning4j.nn.conf.layers.Subsampling3DLayer$PoolingType pooling-type kernel-size]
    (new Subsampling3DLayer$Builder pooling-type kernel-size))
  (^Subsampling3DLayer$Builder [^Integer kernel-size]
    (new Subsampling3DLayer$Builder kernel-size)))

(defn kernel-size
  "Kernel size

  kernel-size - kernel size in height and width dimensions - `int`

  returns: `org.deeplearning4j.nn.conf.layers.Subsampling3DLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Subsampling3DLayer$Builder [^Subsampling3DLayer$Builder this ^Integer kernel-size]
    (-> this (.kernelSize kernel-size))))

(defn stride
  "Stride

  stride - stride in height and width dimensions - `int`

  returns: `org.deeplearning4j.nn.conf.layers.Subsampling3DLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Subsampling3DLayer$Builder [^Subsampling3DLayer$Builder this ^Integer stride]
    (-> this (.stride stride))))

(defn padding
  "Padding

  padding - padding in the height and width dimensions - `int`

  returns: `org.deeplearning4j.nn.conf.layers.Subsampling3DLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.Subsampling3DLayer$Builder [^Subsampling3DLayer$Builder this ^Integer padding]
    (-> this (.padding padding))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.Subsampling3DLayer`"
  (^org.deeplearning4j.nn.conf.layers.Subsampling3DLayer [^Subsampling3DLayer$Builder this]
    (-> this (.build))))

