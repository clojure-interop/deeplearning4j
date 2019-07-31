(ns org.deeplearning4j.zoo.model.FaceNetNN4Small2
  "A variant of the original FaceNet model that relies on embeddings and triplet loss.
 Reference: https://arxiv.org/abs/1503.03832
 Also based on the OpenFace implementation: http://reports-archive.adm.cs.cmu.edu/anon/2016/CMU-CS-16-118.pdf
 Revised and consolidated version by @crockpotveggies"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model FaceNetNN4Small2]))

(defn pretrained-url
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `java.lang.String`"
  (^java.lang.String [^FaceNetNN4Small2 this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedUrl pretrained-type))))

(defn pretrained-checksum
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `long`"
  (^Long [^FaceNetNN4Small2 this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedChecksum pretrained-type))))

(defn model-type
  "returns: `java.lang.Class<? extends org.deeplearning4j.nn.api.Model>`"
  ([^FaceNetNN4Small2 this]
    (-> this (.modelType))))

(defn conf
  "returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration [^FaceNetNN4Small2 this]
    (-> this (.conf))))

(defn init
  "returns: `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^FaceNetNN4Small2 this]
    (-> this (.init))))

(defn meta-data
  "returns: `org.deeplearning4j.zoo.ModelMetaData`"
  (^org.deeplearning4j.zoo.ModelMetaData [^FaceNetNN4Small2 this]
    (-> this (.metaData))))

(defn set-input-shape
  "input-shape - `int[][]`"
  ([^FaceNetNN4Small2 this input-shape]
    (-> this (.setInputShape input-shape))))

