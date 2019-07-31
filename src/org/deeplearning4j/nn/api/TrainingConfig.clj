(ns org.deeplearning4j.nn.api.TrainingConfig
  "Simple interface for the training configuration (updater, L1/L2 values, etc) for trainable layers/vertices."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.api TrainingConfig]))

(defn pretrain-param?
  "Is the specified parameter a layerwise pretraining only parameter?
  For example, visible bias params in an autoencoder (or, decoder params in a variational autoencoder) aren't
  used during supervised backprop.
  Layers (like DenseLayer, etc) with no pretrainable parameters will return false for all (valid) inputs.

  param-name - Parameter name/key - `java.lang.String`

  returns: True if the parameter is for layerwise pretraining only, false otherwise - `boolean`"
  (^Boolean [^TrainingConfig this ^java.lang.String param-name]
    (-> this (.isPretrainParam param-name))))

(defn get-updater-by-param
  "Get the updater for the given parameter. Typically the same updater will be used for all updaters, but this
  is not necessarily the case

  param-name - Parameter name - `java.lang.String`

  returns: IUpdater for the parameter - `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^TrainingConfig this ^java.lang.String param-name]
    (-> this (.getUpdaterByParam param-name))))

(defn pretrain?
  "returns: True if the layer is set up for layerwise pretraining - `boolean`"
  (^Boolean [^TrainingConfig this]
    (-> this (.isPretrain))))

(defn get-layer-name
  "returns: Name of the layer - `java.lang.String`"
  (^java.lang.String [^TrainingConfig this]
    (-> this (.getLayerName))))

(defn set-pretrain
  "pretrain - Whether the layer is currently undergoing layerwise unsupervised training, or multi-layer backprop - `boolean`"
  ([^TrainingConfig this ^Boolean pretrain]
    (-> this (.setPretrain pretrain))))

(defn get-l-2-by-param
  "Get the L2 coefficient for the given parameter.
  Different parameters may have different L2 values, even for a single .l2(x) configuration.
  For example, biases generally aren't L1 regularized, even if weights are

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^TrainingConfig this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

(defn get-gradient-normalization
  "returns: The gradient normalization configuration - `org.deeplearning4j.nn.conf.GradientNormalization`"
  (^org.deeplearning4j.nn.conf.GradientNormalization [^TrainingConfig this]
    (-> this (.getGradientNormalization))))

(defn get-gradient-normalization-threshold
  "returns: The gradient normalization threshold - `double`"
  (^Double [^TrainingConfig this]
    (-> this (.getGradientNormalizationThreshold))))

(defn get-l-1-by-param
  "Get the L1 coefficient for the given parameter.
  Different parameters may have different L1 values, even for a single .l1(x) configuration.
  For example, biases generally aren't L1 regularized, even if weights are

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^TrainingConfig this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

