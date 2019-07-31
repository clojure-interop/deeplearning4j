(ns org.deeplearning4j.nn.conf.misc.DummyConfig
  "A 'dummy' training configuration for use in frozen layers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.misc DummyConfig]))

(defn ->dummy-config
  "Constructor."
  (^DummyConfig []
    (new DummyConfig )))

(defn pretrain-param?
  "Description copied from interface: TrainingConfig

  param-name - Parameter name/key - `java.lang.String`

  returns: True if the parameter is for layerwise pretraining only, false otherwise - `boolean`"
  (^Boolean [^DummyConfig this ^java.lang.String param-name]
    (-> this (.isPretrainParam param-name))))

(defn get-updater-by-param
  "Description copied from interface: TrainingConfig

  param-name - Parameter name - `java.lang.String`

  returns: IUpdater for the parameter - `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^DummyConfig this ^java.lang.String param-name]
    (-> this (.getUpdaterByParam param-name))))

(defn pretrain?
  "returns: True if the layer is set up for layerwise pretraining - `boolean`"
  (^Boolean [^DummyConfig this]
    (-> this (.isPretrain))))

(defn get-layer-name
  "returns: Name of the layer - `java.lang.String`"
  (^java.lang.String [^DummyConfig this]
    (-> this (.getLayerName))))

(defn set-pretrain
  "pretrain - Whether the layer is currently undergoing layerwise unsupervised training, or multi-layer backprop - `boolean`"
  ([^DummyConfig this ^Boolean pretrain]
    (-> this (.setPretrain pretrain))))

(defn get-l-2-by-param
  "Description copied from interface: TrainingConfig

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^DummyConfig this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

(defn get-gradient-normalization
  "returns: The gradient normalization configuration - `org.deeplearning4j.nn.conf.GradientNormalization`"
  (^org.deeplearning4j.nn.conf.GradientNormalization [^DummyConfig this]
    (-> this (.getGradientNormalization))))

(defn get-gradient-normalization-threshold
  "returns: The gradient normalization threshold - `double`"
  (^Double [^DummyConfig this]
    (-> this (.getGradientNormalizationThreshold))))

(defn get-l-1-by-param
  "Description copied from interface: TrainingConfig

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^DummyConfig this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

