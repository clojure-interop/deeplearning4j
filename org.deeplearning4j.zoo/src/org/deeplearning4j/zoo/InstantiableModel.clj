(ns org.deeplearning4j.zoo.InstantiableModel
  "Interface for defining a model that can be instantiated and return
 information about itself."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo InstantiableModel]))

(defn set-input-shape
  "input-shape - `int[][]`"
  ([^InstantiableModel this input-shape]
    (-> this (.setInputShape input-shape))))

(defn init
  "returns: `<M extends org.deeplearning4j.nn.api.Model> M`"
  ([^InstantiableModel this]
    (-> this (.init))))

(defn meta-data
  "Deprecated. No longer used, will be removed in a future release

  returns: `org.deeplearning4j.zoo.ModelMetaData`"
  (^org.deeplearning4j.zoo.ModelMetaData [^InstantiableModel this]
    (-> this (.metaData))))

(defn model-type
  "returns: `java.lang.Class<? extends org.deeplearning4j.nn.api.Model>`"
  ([^InstantiableModel this]
    (-> this (.modelType))))

(defn pretrained-url
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `java.lang.String`"
  (^java.lang.String [^InstantiableModel this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedUrl pretrained-type))))

(defn pretrained-checksum
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `long`"
  (^Long [^InstantiableModel this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedChecksum pretrained-type))))

(defn model-name
  "returns: `java.lang.String`"
  (^java.lang.String [^InstantiableModel this]
    (-> this (.modelName))))

