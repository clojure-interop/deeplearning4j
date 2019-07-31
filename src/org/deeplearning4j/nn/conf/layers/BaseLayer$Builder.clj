(ns org.deeplearning4j.nn.conf.layers.BaseLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers BaseLayer$Builder]))

(defn ->builder
  "Constructor."
  (^BaseLayer$Builder []
    (new BaseLayer$Builder )))

(defn gradient-normalization-threshold
  "Threshold for gradient normalization, only used for GradientNormalization.ClipL2PerLayer,
  GradientNormalization.ClipL2PerParamType, and GradientNormalization.ClipElementWiseAbsoluteValue
  Not used otherwise.
  L2 threshold for first two types of clipping, or absolute value threshold for last type of clipping.

  threshold - `double`

  returns: `T`"
  ([^BaseLayer$Builder this ^Double threshold]
    (-> this (.gradientNormalizationThreshold threshold))))

(defn updater
  "Gradient updater. For example, Adam
  or Nesterovs

  updater - Updater to use - `org.nd4j.linalg.learning.config.IUpdater`

  returns: `T`"
  ([^BaseLayer$Builder this ^org.nd4j.linalg.learning.config.IUpdater updater]
    (-> this (.updater updater))))

(defn l-2-bias
  "L2 regularization coefficient for the bias. Default: 0. See also l2(double)

  l-2-bias - `double`

  returns: `T`"
  ([^BaseLayer$Builder this ^Double l-2-bias]
    (-> this (.l2Bias l-2-bias))))

(defn weight-init
  "Weight initialization scheme to use, for initial weight values

  weight-init - `org.deeplearning4j.nn.weights.WeightInit`

  returns: `T`"
  ([^BaseLayer$Builder this ^org.deeplearning4j.nn.weights.WeightInit weight-init]
    (-> this (.weightInit weight-init))))

(defn activation
  "Set the activation function for the layer. This overload can be used for custom IActivation instances

  activation-function - Activation function to use for the layer - `org.nd4j.linalg.activations.IActivation`

  returns: `T`"
  ([^BaseLayer$Builder this ^org.nd4j.linalg.activations.IActivation activation-function]
    (-> this (.activation activation-function))))

(defn l-1-bias
  "L1 regularization coefficient for the bias. Default: 0. See also l1(double)

  l-1-bias - `double`

  returns: `T`"
  ([^BaseLayer$Builder this ^Double l-1-bias]
    (-> this (.l1Bias l-1-bias))))

(defn weight-noise
  "Set the weight noise (such as DropConnect and
  WeightNoise) for this layer

  weight-noise - Weight noise instance to use - `org.deeplearning4j.nn.conf.weightnoise.IWeightNoise`

  returns: `T`"
  ([^BaseLayer$Builder this ^org.deeplearning4j.nn.conf.weightnoise.IWeightNoise weight-noise]
    (-> this (.weightNoise weight-noise))))

(defn l-2
  "L2 regularization coefficient (weights only). Use l2Bias(double) to configure the l2 regularization
  coefficient for the bias.

  l-2 - `double`

  returns: `T`"
  ([^BaseLayer$Builder this ^Double l-2]
    (-> this (.l2 l-2))))

(defn bias-updater
  "Gradient updater configuration, for the biases only. If not set, biases will use the updater as
  set by updater(IUpdater)

  bias-updater - Updater to use for bias parameters - `org.nd4j.linalg.learning.config.IUpdater`

  returns: `T`"
  ([^BaseLayer$Builder this ^org.nd4j.linalg.learning.config.IUpdater bias-updater]
    (-> this (.biasUpdater bias-updater))))

(defn dist
  "Distribution to sample initial weights from. Used in conjunction with
  .weightInit(WeightInit.DISTRIBUTION).

  dist - `org.deeplearning4j.nn.conf.distribution.Distribution`

  returns: `T`"
  ([^BaseLayer$Builder this ^org.deeplearning4j.nn.conf.distribution.Distribution dist]
    (-> this (.dist dist))))

(defn gradient-normalization
  "Gradient normalization strategy. Used to specify gradient renormalization, gradient clipping etc.

  gradient-normalization - Type of normalization to use. Defaults to None. - `org.deeplearning4j.nn.conf.GradientNormalization`

  returns: `T`"
  ([^BaseLayer$Builder this ^org.deeplearning4j.nn.conf.GradientNormalization gradient-normalization]
    (-> this (.gradientNormalization gradient-normalization))))

(defn l-1
  "L1 regularization coefficient (weights only). Use l1Bias(double) to configure the l1 regularization
  coefficient for the bias.

  l-1 - `double`

  returns: `T`"
  ([^BaseLayer$Builder this ^Double l-1]
    (-> this (.l1 l-1))))

(defn bias-init
  "Bias initialization value, for layers with biases. Defaults to 0

  bias-init - Value to use for initializing biases - `double`

  returns: `T`"
  ([^BaseLayer$Builder this ^Double bias-init]
    (-> this (.biasInit bias-init))))

