(ns org.deeplearning4j.nn.conf.NeuralNetConfiguration
  "A Serializable configuration
 for neural nets that covers per layer parameters"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf NeuralNetConfiguration]))

(defn ->neural-net-configuration
  "Constructor."
  (^NeuralNetConfiguration []
    (new NeuralNetConfiguration )))

(defn *from-yaml
  "Create a neural net configuration from json

  json - the neural net configuration from json - `java.lang.String`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^java.lang.String json]
    (NeuralNetConfiguration/fromYaml json)))

(defn *from-json
  "Create a neural net configuration from json

  json - the neural net configuration from json - `java.lang.String`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^java.lang.String json]
    (NeuralNetConfiguration/fromJson json)))

(defn *mapper-yaml
  "Object mapper for serialization of configurations

  returns: `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper []
    (NeuralNetConfiguration/mapperYaml )))

(defn *mapper
  "Object mapper for serialization of configurations

  returns: `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper []
    (NeuralNetConfiguration/mapper )))

(defn *register-legacy-custom-classes-for-json
  "Register a set of classes (Layer, GraphVertex, InputPreProcessor, IActivation, ILossFunction, ReconstructionDistribution
  ONLY) for JSON deserialization.

  This is required ONLY when BOTH of the following conditions are met:
  1. You want to load a serialized net, saved in 1.0.0-alpha or before, AND
  2. The serialized net has a custom Layer, GraphVertex, etc (i.e., one not defined in DL4J)

  By passing the classes of these layers here, DL4J should be able to deserialize them, in spite of the JSON
  format change between versions.

  classes - Classes to register - `java.lang.Class`"
  ([^java.lang.Class classes]
    (NeuralNetConfiguration/registerLegacyCustomClassesForJSON classes)))

(defn *register-legacy-custom-classes-for-json-list
  "classes - `java.util.List`"
  ([^java.util.List classes]
    (NeuralNetConfiguration/registerLegacyCustomClassesForJSONList classes)))

(defn clone
  "Creates and returns a deep copy of the configuration.

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^NeuralNetConfiguration this]
    (-> this (.clone))))

(defn variables
  "copy - `boolean`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NeuralNetConfiguration this ^Boolean copy]
    (-> this (.variables copy)))
  (^java.util.List [^NeuralNetConfiguration this]
    (-> this (.variables))))

(defn add-variable
  "variable - `java.lang.String`"
  ([^NeuralNetConfiguration this ^java.lang.String variable]
    (-> this (.addVariable variable))))

(defn clear-variables
  ""
  ([^NeuralNetConfiguration this]
    (-> this (.clearVariables))))

(defn set-pretrain
  "pretrain - `boolean`"
  ([^NeuralNetConfiguration this ^Boolean pretrain]
    (-> this (.setPretrain pretrain))))

(defn to-yaml
  "Return this configuration as json

  returns: this configuration represented as json - `java.lang.String`"
  (^java.lang.String [^NeuralNetConfiguration this]
    (-> this (.toYaml))))

(defn to-json
  "Return this configuration as json

  returns: this configuration represented as json - `java.lang.String`"
  (^java.lang.String [^NeuralNetConfiguration this]
    (-> this (.toJson))))

