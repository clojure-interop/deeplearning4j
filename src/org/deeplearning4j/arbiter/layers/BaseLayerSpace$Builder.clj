(ns org.deeplearning4j.arbiter.layers.BaseLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers BaseLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^BaseLayerSpace$Builder []
    (new BaseLayerSpace$Builder )))

(defn gradient-normalization-threshold
  "threshold - `double`

  returns: `T`"
  ([^BaseLayerSpace$Builder this ^Double threshold]
    (-> this (.gradientNormalizationThreshold threshold))))

(defn activation-fn
  "activation-function - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `T`"
  ([^BaseLayerSpace$Builder this ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace activation-function]
    (-> this (.activationFn activation-function))))

(defn updater
  "updater - `org.nd4j.linalg.learning.config.IUpdater`

  returns: `T`"
  ([^BaseLayerSpace$Builder this ^org.nd4j.linalg.learning.config.IUpdater updater]
    (-> this (.updater updater))))

(defn l-2-bias
  "l-2-bias - `double`

  returns: `T`"
  ([^BaseLayerSpace$Builder this ^Double l-2-bias]
    (-> this (.l2Bias l-2-bias))))

(defn weight-init
  "weight-init - `org.deeplearning4j.nn.weights.WeightInit`

  returns: `T`"
  ([^BaseLayerSpace$Builder this ^org.deeplearning4j.nn.weights.WeightInit weight-init]
    (-> this (.weightInit weight-init))))

(defn activation
  "activations - `org.nd4j.linalg.activations.Activation`

  returns: `T`"
  ([^BaseLayerSpace$Builder this ^org.nd4j.linalg.activations.Activation activations]
    (-> this (.activation activations))))

(defn l-1-bias
  "l-1-bias - `double`

  returns: `T`"
  ([^BaseLayerSpace$Builder this ^Double l-1-bias]
    (-> this (.l1Bias l-1-bias))))

(defn l-2
  "l-2 - `double`

  returns: `T`"
  ([^BaseLayerSpace$Builder this ^Double l-2]
    (-> this (.l2 l-2))))

(defn bias-updater
  "bias-updater - `org.nd4j.linalg.learning.config.IUpdater`

  returns: `T`"
  ([^BaseLayerSpace$Builder this ^org.nd4j.linalg.learning.config.IUpdater bias-updater]
    (-> this (.biasUpdater bias-updater))))

(defn dist
  "dist - `org.deeplearning4j.nn.conf.distribution.Distribution`

  returns: `T`"
  ([^BaseLayerSpace$Builder this ^org.deeplearning4j.nn.conf.distribution.Distribution dist]
    (-> this (.dist dist))))

(defn gradient-normalization
  "gradient-normalization - `org.deeplearning4j.nn.conf.GradientNormalization`

  returns: `T`"
  ([^BaseLayerSpace$Builder this ^org.deeplearning4j.nn.conf.GradientNormalization gradient-normalization]
    (-> this (.gradientNormalization gradient-normalization))))

(defn l-1
  "l-1 - `double`

  returns: `T`"
  ([^BaseLayerSpace$Builder this ^Double l-1]
    (-> this (.l1 l-1))))

(defn bias-init
  "bias-init - `double`

  returns: `T`"
  ([^BaseLayerSpace$Builder this ^Double bias-init]
    (-> this (.biasInit bias-init))))

