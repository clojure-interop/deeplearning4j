(ns org.deeplearning4j.nn.conf.layers.BaseLayer
  "A neural network layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers BaseLayer]))

(defn ->base-layer
  "Constructor.

  builder - `org.deeplearning4j.nn.conf.layers.BaseLayer$Builder`"
  (^BaseLayer [^org.deeplearning4j.nn.conf.layers.BaseLayer$Builder builder]
    (new BaseLayer builder)))

(defn reset-layer-default-config
  "Reset the learning related configs of the layer to default. When instantiated with a global neural network configuration
  the parameters specified in the neural network configuration will be used.
  For internal use with the transfer learning API. Users should not have to call this method directly."
  ([^BaseLayer this]
    (-> this (.resetLayerDefaultConfig))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.layers.BaseLayer`"
  (^org.deeplearning4j.nn.conf.layers.BaseLayer [^BaseLayer this]
    (-> this (.clone))))

(defn get-updater-by-param
  "Get the updater for the given parameter. Typically the same updater will be used for all updaters, but this
  is not necessarily the case

  param-name - Parameter name - `java.lang.String`

  returns: IUpdater for the parameter - `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^BaseLayer this ^java.lang.String param-name]
    (-> this (.getUpdaterByParam param-name))))

(defn get-gradient-normalization
  "returns: The gradient normalization configuration - `org.deeplearning4j.nn.conf.GradientNormalization`"
  (^org.deeplearning4j.nn.conf.GradientNormalization [^BaseLayer this]
    (-> this (.getGradientNormalization))))

