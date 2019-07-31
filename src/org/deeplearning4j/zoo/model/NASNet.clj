(ns org.deeplearning4j.zoo.model.NASNet
  "U-Net
 Implementation of NASNet-A in Deeplearning4j. NASNet refers to Neural Architecture Search Network, a family of models
 that were designed automatically by learning the model architectures directly on the dataset of interest.
 This implementation uses 1056 penultimate filters and an input shape of (3, 224, 224). You can change this.
 Paper: https://arxiv.org/abs/1707.07012
 ImageNet weights for this model are available and have been converted from https://keras.io/applications/."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model NASNet]))

(defn pretrained-url
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `java.lang.String`"
  (^java.lang.String [^NASNet this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedUrl pretrained-type))))

(defn pretrained-checksum
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `long`"
  (^Long [^NASNet this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedChecksum pretrained-type))))

(defn model-type
  "returns: `java.lang.Class<? extends org.deeplearning4j.nn.api.Model>`"
  ([^NASNet this]
    (-> this (.modelType))))

(defn init
  "returns: `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^NASNet this]
    (-> this (.init))))

(defn graph-builder
  "returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^NASNet this]
    (-> this (.graphBuilder))))

(defn meta-data
  "returns: `org.deeplearning4j.zoo.ModelMetaData`"
  (^org.deeplearning4j.zoo.ModelMetaData [^NASNet this]
    (-> this (.metaData))))

(defn set-input-shape
  "input-shape - `int[][]`"
  ([^NASNet this input-shape]
    (-> this (.setInputShape input-shape))))

