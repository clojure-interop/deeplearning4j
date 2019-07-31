(ns org.deeplearning4j.zoo.model.SimpleCNN
  "A simple convolutional network for generic image classification.
 Reference: https://github.com/oarriaga/face_classification/"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model SimpleCNN]))

(defn pretrained-url
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `java.lang.String`"
  (^java.lang.String [^SimpleCNN this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedUrl pretrained-type))))

(defn pretrained-checksum
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `long`"
  (^Long [^SimpleCNN this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedChecksum pretrained-type))))

(defn model-type
  "returns: `java.lang.Class<? extends org.deeplearning4j.nn.api.Model>`"
  ([^SimpleCNN this]
    (-> this (.modelType))))

(defn conf
  "returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration [^SimpleCNN this]
    (-> this (.conf))))

(defn init
  "returns: `org.deeplearning4j.nn.api.Model`"
  (^org.deeplearning4j.nn.api.Model [^SimpleCNN this]
    (-> this (.init))))

(defn meta-data
  "returns: `org.deeplearning4j.zoo.ModelMetaData`"
  (^org.deeplearning4j.zoo.ModelMetaData [^SimpleCNN this]
    (-> this (.metaData))))

(defn set-input-shape
  "input-shape - `int[][]`"
  ([^SimpleCNN this input-shape]
    (-> this (.setInputShape input-shape))))

