(ns org.deeplearning4j.nn.conf.layers.SubsamplingLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers SubsamplingLayer$Builder]))

(defn ->builder
  "Constructor.

  pooling-type - `org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType`
  kernel-size - `int[]`
  stride - `int[]`
  padding - `int[]`"
  (^SubsamplingLayer$Builder [^org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType pooling-type kernel-size stride padding]
    (new SubsamplingLayer$Builder pooling-type kernel-size stride padding))
  (^SubsamplingLayer$Builder [^org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType pooling-type kernel-size stride]
    (new SubsamplingLayer$Builder pooling-type kernel-size stride))
  (^SubsamplingLayer$Builder [^org.deeplearning4j.nn.conf.layers.SubsamplingLayer$PoolingType pooling-type kernel-size]
    (new SubsamplingLayer$Builder pooling-type kernel-size))
  (^SubsamplingLayer$Builder [^Integer kernel-size]
    (new SubsamplingLayer$Builder kernel-size)))

(defn kernel-size
  "Kernel size

  kernel-size - kernel size in height and width dimensions - `int`

  returns: `org.deeplearning4j.nn.conf.layers.SubsamplingLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.SubsamplingLayer$Builder [^SubsamplingLayer$Builder this ^Integer kernel-size]
    (-> this (.kernelSize kernel-size))))

(defn stride
  "Stride

  stride - stride in height and width dimensions - `int`

  returns: `org.deeplearning4j.nn.conf.layers.SubsamplingLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.SubsamplingLayer$Builder [^SubsamplingLayer$Builder this ^Integer stride]
    (-> this (.stride stride))))

(defn padding
  "Padding

  padding - padding in the height and width dimensions - `int`

  returns: `org.deeplearning4j.nn.conf.layers.SubsamplingLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.SubsamplingLayer$Builder [^SubsamplingLayer$Builder this ^Integer padding]
    (-> this (.padding padding))))

(defn dilation
  "Kernel dilation. Default: {1, 1}, which is standard convolutions. Used for implementing dilated convolutions,
  which are also known as atrous convolutions.
  NOTE: Kernel dilation is less common in practice for subsampling layers, compared to convolutional layers.
  For more details, see:
  Yu and Koltun (2014) and
  Chen et al. (2014), as well as

  http://deeplearning.net/software/theano/tutorial/conv_arithmetic.html#dilated-convolutions

  dilation - Dilation for kernel - `int`

  returns: `org.deeplearning4j.nn.conf.layers.SubsamplingLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.SubsamplingLayer$Builder [^SubsamplingLayer$Builder this ^Integer dilation]
    (-> this (.dilation dilation))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.SubsamplingLayer`"
  (^org.deeplearning4j.nn.conf.layers.SubsamplingLayer [^SubsamplingLayer$Builder this]
    (-> this (.build))))

