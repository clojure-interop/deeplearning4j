(ns org.deeplearning4j.nn.transferlearning.FineTuneConfiguration
  "Configuration for fine tuning. Note that values set here will override values for all non-frozen layers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.transferlearning FineTuneConfiguration]))

(defn ->fine-tune-configuration
  "Constructor."
  (^FineTuneConfiguration []
    (new FineTuneConfiguration )))

(defn *builder
  "returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder []
    (FineTuneConfiguration/builder )))

(defn *from-json
  "json - `java.lang.String`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration [^java.lang.String json]
    (FineTuneConfiguration/fromJson json)))

(defn *from-yaml
  "yaml - `java.lang.String`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration [^java.lang.String yaml]
    (FineTuneConfiguration/fromYaml yaml)))

(defn applied-neural-net-configuration
  "nnc - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^FineTuneConfiguration this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration nnc]
    (-> this (.appliedNeuralNetConfiguration nnc))))

(defn apply-to-neural-net-configuration
  "nnc - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  ([^FineTuneConfiguration this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration nnc]
    (-> this (.applyToNeuralNetConfiguration nnc))))

(defn apply-to-multi-layer-configuration
  "conf - `org.deeplearning4j.nn.conf.MultiLayerConfiguration`"
  ([^FineTuneConfiguration this ^org.deeplearning4j.nn.conf.MultiLayerConfiguration conf]
    (-> this (.applyToMultiLayerConfiguration conf))))

(defn apply-to-computation-graph-configuration
  "conf - `org.deeplearning4j.nn.conf.ComputationGraphConfiguration`"
  ([^FineTuneConfiguration this ^org.deeplearning4j.nn.conf.ComputationGraphConfiguration conf]
    (-> this (.applyToComputationGraphConfiguration conf))))

(defn applied-neural-net-configuration-builder
  "returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^FineTuneConfiguration this]
    (-> this (.appliedNeuralNetConfigurationBuilder))))

(defn to-json
  "returns: `java.lang.String`"
  (^java.lang.String [^FineTuneConfiguration this]
    (-> this (.toJson))))

(defn to-yaml
  "returns: `java.lang.String`"
  (^java.lang.String [^FineTuneConfiguration this]
    (-> this (.toYaml))))

