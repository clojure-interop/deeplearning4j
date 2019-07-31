(ns org.deeplearning4j.zoo.model.LeNet
  "LeNet was an early promising achiever on the ImageNet dataset.
 References:
 - http://yann.lecun.com/exdb/publis/pdf/lecun-98.pdf
 - https://github.com/BVLC/caffe/blob/master/examples/mnist/lenet.prototxt
 MNIST weights for this model are available and have been converted from https://github.com/f00-/mnist-lenet-keras."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model LeNet]))

(defn pretrained-url
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `java.lang.String`"
  (^java.lang.String [^LeNet this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedUrl pretrained-type))))

(defn pretrained-checksum
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `long`"
  (^Long [^LeNet this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedChecksum pretrained-type))))

(defn model-type
  "returns: `java.lang.Class<? extends org.deeplearning4j.nn.api.Model>`"
  ([^LeNet this]
    (-> this (.modelType))))

(defn conf
  "returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration [^LeNet this]
    (-> this (.conf))))

(defn init
  "returns: `org.deeplearning4j.nn.api.Model`"
  (^org.deeplearning4j.nn.api.Model [^LeNet this]
    (-> this (.init))))

(defn meta-data
  "returns: `org.deeplearning4j.zoo.ModelMetaData`"
  (^org.deeplearning4j.zoo.ModelMetaData [^LeNet this]
    (-> this (.metaData))))

(defn set-input-shape
  "input-shape - `int[][]`"
  ([^LeNet this input-shape]
    (-> this (.setInputShape input-shape))))

