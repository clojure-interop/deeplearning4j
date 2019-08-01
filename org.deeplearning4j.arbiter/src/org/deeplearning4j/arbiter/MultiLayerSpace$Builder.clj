(ns org.deeplearning4j.arbiter.MultiLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter MultiLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^MultiLayerSpace$Builder []
    (new MultiLayerSpace$Builder )))

(defn set-input-type
  "input-type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: `org.deeplearning4j.arbiter.MultiLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.MultiLayerSpace$Builder [^MultiLayerSpace$Builder this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.setInputType input-type))))

(defn layer
  "layer-space - `org.deeplearning4j.arbiter.layers.LayerSpace`
  num-layers-distribution - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `org.deeplearning4j.arbiter.MultiLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.MultiLayerSpace$Builder [^MultiLayerSpace$Builder this ^org.deeplearning4j.arbiter.layers.LayerSpace layer-space ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace num-layers-distribution]
    (-> this (.layer layer-space num-layers-distribution)))
  (^org.deeplearning4j.arbiter.MultiLayerSpace$Builder [^MultiLayerSpace$Builder this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.layer layer))))

(defn add-layer
  "layer-space - `org.deeplearning4j.arbiter.layers.LayerSpace`
  num-layers-distribution - Distribution for number of layers to generate - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `org.deeplearning4j.arbiter.MultiLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.MultiLayerSpace$Builder [^MultiLayerSpace$Builder this ^org.deeplearning4j.arbiter.layers.LayerSpace layer-space ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace num-layers-distribution]
    (-> this (.addLayer layer-space num-layers-distribution)))
  (^org.deeplearning4j.arbiter.MultiLayerSpace$Builder [^MultiLayerSpace$Builder this ^org.deeplearning4j.arbiter.layers.LayerSpace layer-space]
    (-> this (.addLayer layer-space)))
  (^org.deeplearning4j.arbiter.MultiLayerSpace$Builder [^MultiLayerSpace$Builder this ^org.deeplearning4j.arbiter.layers.LayerSpace layer-space ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace num-layers-distribution ^Boolean duplicate-config]
    (-> this (.addLayer layer-space num-layers-distribution duplicate-config))))

(defn early-stopping-configuration
  "Early stopping configuration (optional). Note if both EarlyStoppingConfiguration and number of epochs is
  present, early stopping will be used in preference.

  early-stopping-configuration - `org.deeplearning4j.earlystopping.EarlyStoppingConfiguration`

  returns: `org.deeplearning4j.arbiter.MultiLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.MultiLayerSpace$Builder [^MultiLayerSpace$Builder this ^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration early-stopping-configuration]
    (-> this (.earlyStoppingConfiguration early-stopping-configuration))))

(defn set-input-pre-processors
  "input-pre-processors - Input preprocessors to set for the model - `java.util.Map`

  returns: `org.deeplearning4j.arbiter.MultiLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.MultiLayerSpace$Builder [^MultiLayerSpace$Builder this ^java.util.Map input-pre-processors]
    (-> this (.setInputPreProcessors input-pre-processors))))

(defn training-workspace-mode
  "workspace-mode - `org.deeplearning4j.nn.conf.WorkspaceMode`

  returns: `org.deeplearning4j.arbiter.MultiLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.MultiLayerSpace$Builder [^MultiLayerSpace$Builder this ^org.deeplearning4j.nn.conf.WorkspaceMode workspace-mode]
    (-> this (.trainingWorkspaceMode workspace-mode))))

(defn inference-workspace-mode
  "workspace-mode - `org.deeplearning4j.nn.conf.WorkspaceMode`

  returns: `org.deeplearning4j.arbiter.MultiLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.MultiLayerSpace$Builder [^MultiLayerSpace$Builder this ^org.deeplearning4j.nn.conf.WorkspaceMode workspace-mode]
    (-> this (.inferenceWorkspaceMode workspace-mode))))

(defn build
  "returns: `org.deeplearning4j.arbiter.MultiLayerSpace`"
  (^org.deeplearning4j.arbiter.MultiLayerSpace [^MultiLayerSpace$Builder this]
    (-> this (.build))))

