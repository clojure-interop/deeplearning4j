(ns org.deeplearning4j.arbiter.BaseNetworkSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter BaseNetworkSpace$Builder]))

(defn gradient-normalization-threshold
  "threshold - `double`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^Double threshold]
    (-> this (.gradientNormalizationThreshold threshold))))

(defn activation-fn
  "activation-function - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace activation-function]
    (-> this (.activationFn activation-function))))

(defn tbptt-bwd-length
  "tbptt-bwd-length - `int`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^Integer tbptt-bwd-length]
    (-> this (.tbpttBwdLength tbptt-bwd-length))))

(defn updater
  "updater - `org.nd4j.linalg.learning.config.IUpdater`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^org.nd4j.linalg.learning.config.IUpdater updater]
    (-> this (.updater updater))))

(defn l-2-bias
  "l-2-bias - `double`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^Double l-2-bias]
    (-> this (.l2Bias l-2-bias))))

(defn weight-init
  "weight-init - `org.deeplearning4j.nn.weights.WeightInit`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^org.deeplearning4j.nn.weights.WeightInit weight-init]
    (-> this (.weightInit weight-init))))

(defn constrain-bias
  "constraints - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainBias constraints))))

(defn activation
  "activation-function - `org.nd4j.linalg.activations.Activation`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^org.nd4j.linalg.activations.Activation activation-function]
    (-> this (.activation activation-function))))

(defn idrop-out
  "idrop-out - `org.deeplearning4j.nn.conf.dropout.IDropout`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^org.deeplearning4j.nn.conf.dropout.IDropout idrop-out]
    (-> this (.idropOut idrop-out))))

(defn minimize
  "minimize - `boolean`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^Boolean minimize]
    (-> this (.minimize minimize))))

(defn drop-out
  "dropout - `double`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^Double dropout]
    (-> this (.dropOut dropout))))

(defn l-1-bias
  "l-1-bias - `double`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^Double l-1-bias]
    (-> this (.l1Bias l-1-bias))))

(defn pretrain
  "pretrain - `boolean`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^Boolean pretrain]
    (-> this (.pretrain pretrain))))

(defn tbptt-fwd-length
  "tbptt-fwd-length - `int`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^Integer tbptt-fwd-length]
    (-> this (.tbpttFwdLength tbptt-fwd-length))))

(defn constrain-weights
  "constraints - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainWeights constraints))))

(defn backprop
  "backprop - `boolean`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^Boolean backprop]
    (-> this (.backprop backprop))))

(defn optimization-algo
  "optimization-algorithm - `org.deeplearning4j.nn.api.OptimizationAlgorithm`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^org.deeplearning4j.nn.api.OptimizationAlgorithm optimization-algorithm]
    (-> this (.optimizationAlgo optimization-algorithm))))

(defn seed
  "seed - `long`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^Long seed]
    (-> this (.seed seed))))

(defn num-epochs
  "Fixed number of training epochs. Default: 1
  Note if both EarlyStoppingConfiguration and number of epochs is present, early stopping will be used in preference.

  num-epochs - `int`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^Integer num-epochs]
    (-> this (.numEpochs num-epochs))))

(defn build
  "returns: `<E extends org.deeplearning4j.arbiter.BaseNetworkSpace> E`"
  ([^BaseNetworkSpace$Builder this]
    (-> this (.build))))

(defn constrain-all-params
  "constraints - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainAllParams constraints))))

(defn mini-batch
  "minibatch - `boolean`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^Boolean minibatch]
    (-> this (.miniBatch minibatch))))

(defn weight-noise
  "weight-noise - `org.deeplearning4j.nn.conf.weightnoise.IWeightNoise`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^org.deeplearning4j.nn.conf.weightnoise.IWeightNoise weight-noise]
    (-> this (.weightNoise weight-noise))))

(defn convolution-mode
  "convolution-mode - `org.deeplearning4j.nn.conf.ConvolutionMode`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode]
    (-> this (.convolutionMode convolution-mode))))

(defn l-2
  "l-2 - `double`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^Double l-2]
    (-> this (.l2 l-2))))

(defn backprop-type
  "backprop-type - `org.deeplearning4j.nn.conf.BackpropType`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^org.deeplearning4j.nn.conf.BackpropType backprop-type]
    (-> this (.backpropType backprop-type))))

(defn bias-updater
  "bias-updater - `org.nd4j.linalg.learning.config.IUpdater`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^org.nd4j.linalg.learning.config.IUpdater bias-updater]
    (-> this (.biasUpdater bias-updater))))

(defn dist
  "dist - `org.deeplearning4j.nn.conf.distribution.Distribution`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^org.deeplearning4j.nn.conf.distribution.Distribution dist]
    (-> this (.dist dist))))

(defn gradient-normalization
  "gradient-normalization - `org.deeplearning4j.nn.conf.GradientNormalization`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^org.deeplearning4j.nn.conf.GradientNormalization gradient-normalization]
    (-> this (.gradientNormalization gradient-normalization))))

(defn max-num-line-search-iterations
  "max-num-line-search-iterations - `int`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^Integer max-num-line-search-iterations]
    (-> this (.maxNumLineSearchIterations max-num-line-search-iterations))))

(defn l-1
  "l-1 - `double`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^Double l-1]
    (-> this (.l1 l-1))))

(defn bias-init
  "bias-init - `double`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^Double bias-init]
    (-> this (.biasInit bias-init))))

(defn step-function
  "step-function - `org.deeplearning4j.nn.conf.stepfunctions.StepFunction`

  returns: `T`"
  ([^BaseNetworkSpace$Builder this ^org.deeplearning4j.nn.conf.stepfunctions.StepFunction step-function]
    (-> this (.stepFunction step-function))))

