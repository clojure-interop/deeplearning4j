(ns org.deeplearning4j.zoo.model.VGG19
  "VGG-19, from Very Deep Convolutional Networks for Large-Scale Image Recognition
 https://arxiv.org/abs/1409.1556)
 ImageNet weights for this model are available and have been converted from https://github.com/fchollet/keras/tree/1.1.2/keras/applications."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model VGG19]))

(defn pretrained-url
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `java.lang.String`"
  (^java.lang.String [^VGG19 this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedUrl pretrained-type))))

(defn pretrained-checksum
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `long`"
  (^Long [^VGG19 this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedChecksum pretrained-type))))

(defn model-type
  "returns: `java.lang.Class<? extends org.deeplearning4j.nn.api.Model>`"
  ([^VGG19 this]
    (-> this (.modelType))))

(defn conf
  "returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration [^VGG19 this]
    (-> this (.conf))))

(defn init
  "returns: `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^VGG19 this]
    (-> this (.init))))

(defn meta-data
  "returns: `org.deeplearning4j.zoo.ModelMetaData`"
  (^org.deeplearning4j.zoo.ModelMetaData [^VGG19 this]
    (-> this (.metaData))))

(defn set-input-shape
  "input-shape - `int[][]`"
  ([^VGG19 this input-shape]
    (-> this (.setInputShape input-shape))))

