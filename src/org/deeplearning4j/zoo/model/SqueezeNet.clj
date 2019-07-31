(ns org.deeplearning4j.zoo.model.SqueezeNet
  "U-Net
 An implementation of SqueezeNet. Touts similar accuracy to AlexNet with a fraction of the parameters.
 Paper: https://arxiv.org/abs/1602.07360
 ImageNet weights for this model are available and have been converted from https://github.com/rcmalli/keras-squeezenet/."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model SqueezeNet]))

(defn pretrained-url
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `java.lang.String`"
  (^java.lang.String [^SqueezeNet this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedUrl pretrained-type))))

(defn pretrained-checksum
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `long`"
  (^Long [^SqueezeNet this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedChecksum pretrained-type))))

(defn model-type
  "returns: `java.lang.Class<? extends org.deeplearning4j.nn.api.Model>`"
  ([^SqueezeNet this]
    (-> this (.modelType))))

(defn init
  "returns: `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^SqueezeNet this]
    (-> this (.init))))

(defn graph-builder
  "returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^SqueezeNet this]
    (-> this (.graphBuilder))))

(defn meta-data
  "returns: `org.deeplearning4j.zoo.ModelMetaData`"
  (^org.deeplearning4j.zoo.ModelMetaData [^SqueezeNet this]
    (-> this (.metaData))))

(defn set-input-shape
  "input-shape - `int[][]`"
  ([^SqueezeNet this input-shape]
    (-> this (.setInputShape input-shape))))

