(ns org.deeplearning4j.zoo.model.InceptionResNetV1
  "A variant of the original FaceNet model that relies on embeddings and triplet loss.
 Reference: https://arxiv.org/abs/1503.03832
 Also based on the OpenFace implementation: http://reports-archive.adm.cs.cmu.edu/anon/2016/CMU-CS-16-118.pdf
 Revised and consolidated version by @crockpotveggies"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model InceptionResNetV1]))

(defn pretrained-url
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `java.lang.String`"
  (^java.lang.String [^InceptionResNetV1 this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedUrl pretrained-type))))

(defn pretrained-checksum
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `long`"
  (^Long [^InceptionResNetV1 this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedChecksum pretrained-type))))

(defn model-type
  "returns: `java.lang.Class<? extends org.deeplearning4j.nn.api.Model>`"
  ([^InceptionResNetV1 this]
    (-> this (.modelType))))

(defn init
  "returns: `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^InceptionResNetV1 this]
    (-> this (.init))))

(defn graph-builder
  "input - `java.lang.String`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^InceptionResNetV1 this ^java.lang.String input]
    (-> this (.graphBuilder input))))

(defn meta-data
  "returns: `org.deeplearning4j.zoo.ModelMetaData`"
  (^org.deeplearning4j.zoo.ModelMetaData [^InceptionResNetV1 this]
    (-> this (.metaData))))

(defn set-input-shape
  "input-shape - `int[][]`"
  ([^InceptionResNetV1 this input-shape]
    (-> this (.setInputShape input-shape))))

