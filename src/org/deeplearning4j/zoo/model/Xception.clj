(ns org.deeplearning4j.zoo.model.Xception
  "U-Net
 An implementation of Xception in Deeplearning4j. A novel deep convolutional neural network architecture inspired by Inception, where Inception modules have been replaced with depthwise separable convolutions.
 Paper: https://arxiv.org/abs/1610.02357
 ImageNet weights for this model are available and have been converted from https://keras.io/applications/."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model Xception]))

(defn pretrained-url
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `java.lang.String`"
  (^java.lang.String [^Xception this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedUrl pretrained-type))))

(defn pretrained-checksum
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `long`"
  (^Long [^Xception this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedChecksum pretrained-type))))

(defn model-type
  "returns: `java.lang.Class<? extends org.deeplearning4j.nn.api.Model>`"
  ([^Xception this]
    (-> this (.modelType))))

(defn init
  "returns: `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^Xception this]
    (-> this (.init))))

(defn graph-builder
  "returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^Xception this]
    (-> this (.graphBuilder))))

(defn meta-data
  "returns: `org.deeplearning4j.zoo.ModelMetaData`"
  (^org.deeplearning4j.zoo.ModelMetaData [^Xception this]
    (-> this (.metaData))))

(defn set-input-shape
  "input-shape - `int[][]`"
  ([^Xception this input-shape]
    (-> this (.setInputShape input-shape))))

