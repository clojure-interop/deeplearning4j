(ns org.deeplearning4j.zoo.model.ResNet50
  "Residual networks for deep learning.
 Paperp: https://arxiv.org/abs/1512.03385
 ImageNet weights for this model are available and have been converted from https://keras.io/applications/."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model ResNet50]))

(defn pretrained-url
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `java.lang.String`"
  (^java.lang.String [^ResNet50 this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedUrl pretrained-type))))

(defn pretrained-checksum
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `long`"
  (^Long [^ResNet50 this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedChecksum pretrained-type))))

(defn model-type
  "returns: `java.lang.Class<? extends org.deeplearning4j.nn.api.Model>`"
  ([^ResNet50 this]
    (-> this (.modelType))))

(defn init
  "returns: `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^ResNet50 this]
    (-> this (.init))))

(defn graph-builder
  "returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^ResNet50 this]
    (-> this (.graphBuilder))))

(defn meta-data
  "returns: `org.deeplearning4j.zoo.ModelMetaData`"
  (^org.deeplearning4j.zoo.ModelMetaData [^ResNet50 this]
    (-> this (.metaData))))

(defn set-input-shape
  "input-shape - `int[][]`"
  ([^ResNet50 this input-shape]
    (-> this (.setInputShape input-shape))))

