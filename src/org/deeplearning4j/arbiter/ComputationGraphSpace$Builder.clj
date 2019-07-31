(ns org.deeplearning4j.arbiter.ComputationGraphSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter ComputationGraphSpace$Builder]))

(defn ->builder
  "Constructor."
  (^ComputationGraphSpace$Builder []
    (new ComputationGraphSpace$Builder )))

(defn early-stopping-configuration
  "Early stopping configuration (optional). Note if both EarlyStoppingConfiguration and number of epochs is
  present, early stopping will be used in preference.

  early-stopping-configuration - `org.deeplearning4j.earlystopping.EarlyStoppingConfiguration`

  returns: `org.deeplearning4j.arbiter.ComputationGraphSpace$Builder`"
  (^org.deeplearning4j.arbiter.ComputationGraphSpace$Builder [^ComputationGraphSpace$Builder this ^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration early-stopping-configuration]
    (-> this (.earlyStoppingConfiguration early-stopping-configuration))))

(defn set-input-types
  "input-types - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: `org.deeplearning4j.arbiter.ComputationGraphSpace$Builder`"
  (^org.deeplearning4j.arbiter.ComputationGraphSpace$Builder [^ComputationGraphSpace$Builder this ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (-> this (.setInputTypes input-types))))

(defn training-workspace-mode
  "workspace-mode - `org.deeplearning4j.nn.conf.WorkspaceMode`

  returns: `org.deeplearning4j.arbiter.ComputationGraphSpace$Builder`"
  (^org.deeplearning4j.arbiter.ComputationGraphSpace$Builder [^ComputationGraphSpace$Builder this ^org.deeplearning4j.nn.conf.WorkspaceMode workspace-mode]
    (-> this (.trainingWorkspaceMode workspace-mode))))

(defn inference-workspace-mode
  "workspace-mode - `org.deeplearning4j.nn.conf.WorkspaceMode`

  returns: `org.deeplearning4j.arbiter.ComputationGraphSpace$Builder`"
  (^org.deeplearning4j.arbiter.ComputationGraphSpace$Builder [^ComputationGraphSpace$Builder this ^org.deeplearning4j.nn.conf.WorkspaceMode workspace-mode]
    (-> this (.inferenceWorkspaceMode workspace-mode))))

(defn add-vertex
  "vertex-name - `java.lang.String`
  vertex - `org.deeplearning4j.nn.conf.graph.GraphVertex`
  vertex-inputs - `java.lang.String`

  returns: `org.deeplearning4j.arbiter.ComputationGraphSpace$Builder`"
  (^org.deeplearning4j.arbiter.ComputationGraphSpace$Builder [^ComputationGraphSpace$Builder this ^java.lang.String vertex-name ^org.deeplearning4j.nn.conf.graph.GraphVertex vertex ^java.lang.String vertex-inputs]
    (-> this (.addVertex vertex-name vertex vertex-inputs))))

(defn add-layer
  "layer-name - `java.lang.String`
  layer-space - `org.deeplearning4j.arbiter.layers.LayerSpace`
  pre-processor - `org.deeplearning4j.nn.conf.InputPreProcessor`
  layer-inputs - `java.lang.String`

  returns: `org.deeplearning4j.arbiter.ComputationGraphSpace$Builder`"
  (^org.deeplearning4j.arbiter.ComputationGraphSpace$Builder [^ComputationGraphSpace$Builder this ^java.lang.String layer-name ^org.deeplearning4j.arbiter.layers.LayerSpace layer-space ^org.deeplearning4j.nn.conf.InputPreProcessor pre-processor ^java.lang.String layer-inputs]
    (-> this (.addLayer layer-name layer-space pre-processor layer-inputs)))
  (^org.deeplearning4j.arbiter.ComputationGraphSpace$Builder [^ComputationGraphSpace$Builder this ^java.lang.String layer-name ^org.deeplearning4j.arbiter.layers.LayerSpace layer-space ^java.lang.String layer-inputs]
    (-> this (.addLayer layer-name layer-space layer-inputs))))

(defn build
  "returns: `org.deeplearning4j.arbiter.ComputationGraphSpace`"
  (^org.deeplearning4j.arbiter.ComputationGraphSpace [^ComputationGraphSpace$Builder this]
    (-> this (.build))))

(defn add-inputs
  "network-inputs - `java.lang.String`

  returns: `org.deeplearning4j.arbiter.ComputationGraphSpace$Builder`"
  (^org.deeplearning4j.arbiter.ComputationGraphSpace$Builder [^ComputationGraphSpace$Builder this ^java.lang.String network-inputs]
    (-> this (.addInputs network-inputs))))

(defn set-outputs
  "network-outputs - `java.lang.String`

  returns: `org.deeplearning4j.arbiter.ComputationGraphSpace$Builder`"
  (^org.deeplearning4j.arbiter.ComputationGraphSpace$Builder [^ComputationGraphSpace$Builder this ^java.lang.String network-outputs]
    (-> this (.setOutputs network-outputs))))

(defn layer
  "layer-name - `java.lang.String`
  layer-space - `org.deeplearning4j.arbiter.layers.LayerSpace`
  pre-processor - `org.deeplearning4j.nn.conf.InputPreProcessor`
  layer-inputs - `java.lang.String`

  returns: `org.deeplearning4j.arbiter.ComputationGraphSpace$Builder`"
  (^org.deeplearning4j.arbiter.ComputationGraphSpace$Builder [^ComputationGraphSpace$Builder this ^java.lang.String layer-name ^org.deeplearning4j.arbiter.layers.LayerSpace layer-space ^org.deeplearning4j.nn.conf.InputPreProcessor pre-processor ^java.lang.String layer-inputs]
    (-> this (.layer layer-name layer-space pre-processor layer-inputs)))
  (^org.deeplearning4j.arbiter.ComputationGraphSpace$Builder [^ComputationGraphSpace$Builder this ^java.lang.String layer-name ^org.deeplearning4j.arbiter.layers.LayerSpace layer-space ^java.lang.String layer-inputs]
    (-> this (.layer layer-name layer-space layer-inputs))))

