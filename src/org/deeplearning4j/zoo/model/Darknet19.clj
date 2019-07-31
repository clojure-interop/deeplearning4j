(ns org.deeplearning4j.zoo.model.Darknet19
  "Darknet19
 Reference: https://arxiv.org/pdf/1612.08242.pdf
 ImageNet weights for this model are available and have been converted from https://pjreddie.com/darknet/imagenet/
 using https://github.com/allanzelener/YAD2K .
 There are 2 pretrained models, one for 224x224 images and one fine-tuned for 448x448 images.
 Call setInputShape() with either {3, 224, 224} or {3, 448, 448} before initialization.
 The channels of the input images need to be in RGB order (not BGR), with values normalized within [0, 1].
 The output labels are as per https://github.com/pjreddie/darknet/blob/master/data/imagenet.shortnames.list ."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model Darknet19]))

(defn pretrained-url
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `java.lang.String`"
  (^java.lang.String [^Darknet19 this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedUrl pretrained-type))))

(defn pretrained-checksum
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `long`"
  (^Long [^Darknet19 this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedChecksum pretrained-type))))

(defn model-type
  "returns: `java.lang.Class<? extends org.deeplearning4j.nn.api.Model>`"
  ([^Darknet19 this]
    (-> this (.modelType))))

(defn conf
  "returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration [^Darknet19 this]
    (-> this (.conf))))

(defn init
  "returns: `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^Darknet19 this]
    (-> this (.init))))

(defn meta-data
  "returns: `org.deeplearning4j.zoo.ModelMetaData`"
  (^org.deeplearning4j.zoo.ModelMetaData [^Darknet19 this]
    (-> this (.metaData))))

(defn set-input-shape
  "input-shape - `int[][]`"
  ([^Darknet19 this input-shape]
    (-> this (.setInputShape input-shape))))

