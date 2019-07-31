(ns org.deeplearning4j.zoo.ZooModel
  "A zoo model is instantiable, returns information about itself, and can download
 pretrained models if available."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo ZooModel]))

(defn ->zoo-model
  "Constructor."
  (^ZooModel []
    (new ZooModel )))

(defn pretrained-available
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `boolean`"
  (^Boolean [^ZooModel this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedAvailable pretrained-type))))

(defn init-pretrained
  "Returns a pretrained model for the given dataset, if available.

  pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `<M extends org.deeplearning4j.nn.api.Model> M`

  throws: java.io.IOException"
  ([^ZooModel this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.initPretrained pretrained-type)))
  (^org.deeplearning4j.nn.api.Model [^ZooModel this]
    (-> this (.initPretrained))))

(defn model-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ZooModel this]
    (-> this (.modelName))))

