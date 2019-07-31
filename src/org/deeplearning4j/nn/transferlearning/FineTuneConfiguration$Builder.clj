(ns org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.transferlearning FineTuneConfiguration$Builder]))

(defn ->builder
  "Constructor."
  (^FineTuneConfiguration$Builder []
    (new FineTuneConfiguration$Builder )))

(defn gradient-normalization-threshold
  "Threshold for gradient normalization, only used for GradientNormalization.ClipL2PerLayer,
  GradientNormalization.ClipL2PerParamType, and GradientNormalization.ClipElementWiseAbsoluteValue
  Not used otherwise.
  L2 threshold for first two types of clipping, or absolute value threshold for last type of clipping

  gradient-normalization-threshold - `double`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^Double gradient-normalization-threshold]
    (-> this (.gradientNormalizationThreshold gradient-normalization-threshold))))

(defn cudnn-algo-mode
  "Sets the cuDNN algo mode for convolutional layers, which impacts performance and memory usage of cuDNN.
  See ConvolutionLayer.AlgoMode for details. Defaults to \"PREFER_FASTEST\", but \"NO_WORKSPACE\" uses less memory.

  cudnn-algo-mode - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode cudnn-algo-mode]
    (-> this (.cudnnAlgoMode cudnn-algo-mode))))

(defn updater
  "Gradient updater configuration. For example, Adam
  or Nesterovs

  updater - Updater to use - `org.nd4j.linalg.learning.config.IUpdater`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^org.nd4j.linalg.learning.config.IUpdater updater]
    (-> this (.updater updater))))

(defn l-2-bias
  "L2 regularization coefficient for the bias parameters

  l-2-bias - `double`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^Double l-2-bias]
    (-> this (.l2Bias l-2-bias))))

(defn weight-init
  "Weight initialization scheme

  weight-init - `org.deeplearning4j.nn.weights.WeightInit`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^org.deeplearning4j.nn.weights.WeightInit weight-init]
    (-> this (.weightInit weight-init))))

(defn activation
  "Activation function / neuron non-linearity

  activation-fn - `org.nd4j.linalg.activations.IActivation`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^org.nd4j.linalg.activations.IActivation activation-fn]
    (-> this (.activation activation-fn))))

(defn constraints
  "Set constraints to be applied to all layers. Default: no constraints.
  Constraints can be used to enforce certain conditions (non-negativity of parameters, max-norm regularization,
  etc). These constraints are applied at each iteration, after the parameters have been updated.

  constraints - Constraints to apply to all parameters of all layers - `java.util.List`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^java.util.List constraints]
    (-> this (.constraints constraints))))

(defn minimize
  "minimize - `boolean`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^Boolean minimize]
    (-> this (.minimize minimize))))

(defn drop-out
  "Dropout probability. This is the probability of retaining each input activation value for a layer.
  dropOut(x) will keep an input activation with probability x, and set to 0 with probability 1-x.
  dropOut(0.0) is a special value / special case - when set to 0.0., dropout is disabled (not applied). Note
  that a dropout value of 1.0 is functionally equivalent to no dropout: i.e., 100% probability of retaining
  each input activation.

  Note 1: Dropout is applied at training time only - and is automatically not applied at test time
  (for evaluation, etc)
  Note 2: This sets the probability per-layer. Care should be taken when setting lower values for
  complex networks (too much information may be lost with aggressive (very low) dropout values).
  Note 3: Frequently, dropout is not applied to (or, has higher retain probability for) input (first layer)
  layers. Dropout is also often not applied to output layers. This needs to be handled MANUALLY by the user
  - set .dropout(0) on those layers when using global dropout setting.
  Note 4: Implementation detail (most users can ignore): DL4J uses inverted dropout, as described here:
  http://cs231n.github.io/neural-networks-2/

  input-retain-probability - Dropout probability (probability of retaining each input activation value for a layer) - `double`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^Double input-retain-probability]
    (-> this (.dropOut input-retain-probability))))

(defn l-1-bias
  "L1 regularization coefficient for the bias parameters

  l-1-bias - `double`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^Double l-1-bias]
    (-> this (.l1Bias l-1-bias))))

(defn pretrain
  "pretrain - `boolean`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^Boolean pretrain]
    (-> this (.pretrain pretrain))))

(defn tbptt-fwd-length
  "When doing truncated BPTT: how many steps of forward pass should we do
  before doing (truncated) backprop?
  Only applicable when doing backpropType(BackpropType.TruncatedBPTT)
  Typically tBPTTForwardLength parameter is same as the tBPTTBackwardLength parameter,
  but may be larger than it in some circumstances (but never smaller)
  Ideally your training data time series length should be divisible by this
  This is the k1 parameter on pg23 of
  http://www.cs.utoronto.ca/~ilya/pubs/ilya_sutskever_phd_thesis.pdf

  tbptt-fwd-length - Forward length > 0, >= backwardLength - `int`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^Integer tbptt-fwd-length]
    (-> this (.tbpttFwdLength tbptt-fwd-length))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FineTuneConfiguration$Builder this]
    (-> this (.toString))))

(defn training-workspace-mode
  "This method defines Workspace mode being used during training:
  NONE: workspace won't be used
  ENABLED: workspaces will be used for training (reduced memory and better performance)

  training-workspace-mode - Workspace mode for training - `org.deeplearning4j.nn.conf.WorkspaceMode`

  returns: Builder - `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^org.deeplearning4j.nn.conf.WorkspaceMode training-workspace-mode]
    (-> this (.trainingWorkspaceMode training-workspace-mode))))

(defn inference-workspace-mode
  "This method defines Workspace mode being used during inference:
  NONE: workspace won't be used
  ENABLED: workspaces will be used for inference (reduced memory and better performance)

  inference-workspace-mode - Workspace mode for inference - `org.deeplearning4j.nn.conf.WorkspaceMode`

  returns: Builder - `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^org.deeplearning4j.nn.conf.WorkspaceMode inference-workspace-mode]
    (-> this (.inferenceWorkspaceMode inference-workspace-mode))))

(defn tbptt-back-length
  "When doing truncated BPTT: how many steps of backward should we do?
  Only applicable when doing backpropType(BackpropType.TruncatedBPTT)
  This is the k2 parameter on pg23 of
  http://www.cs.utoronto.ca/~ilya/pubs/ilya_sutskever_phd_thesis.pdf

  tbptt-back-length - <= forwardLength - `int`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^Integer tbptt-back-length]
    (-> this (.tbpttBackLength tbptt-back-length))))

(defn backprop
  "backprop - `boolean`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^Boolean backprop]
    (-> this (.backprop backprop))))

(defn optimization-algo
  "optimization-algo - `org.deeplearning4j.nn.api.OptimizationAlgorithm`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^org.deeplearning4j.nn.api.OptimizationAlgorithm optimization-algo]
    (-> this (.optimizationAlgo optimization-algo))))

(defn seed
  "RNG seed for reproducibility

  seed - RNG seed to use - `long`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^Long seed]
    (-> this (.seed seed))))

(defn build
  "returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration [^FineTuneConfiguration$Builder this]
    (-> this (.build))))

(defn mini-batch
  "Whether scores and gradients should be divided by the minibatch size.
  Most users should leave this ast he default value of true.

  mini-batch - `boolean`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^Boolean mini-batch]
    (-> this (.miniBatch mini-batch))))

(defn weight-noise
  "Set the weight noise (such as DropConnect and
  WeightNoise)

  weight-noise - Weight noise instance to use - `org.deeplearning4j.nn.conf.weightnoise.IWeightNoise`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^org.deeplearning4j.nn.conf.weightnoise.IWeightNoise weight-noise]
    (-> this (.weightNoise weight-noise))))

(defn convolution-mode
  "Sets the convolution mode for convolutional layers, which impacts padding and output sizes.
  See ConvolutionMode for details. Defaults to ConvolutionMode.TRUNCATE

  convolution-mode - Convolution mode to use - `org.deeplearning4j.nn.conf.ConvolutionMode`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode]
    (-> this (.convolutionMode convolution-mode))))

(defn l-2
  "L2 regularization coefficient for the weights

  l-2 - `double`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^Double l-2]
    (-> this (.l2 l-2))))

(defn backprop-type
  "The type of backprop. Default setting is used for most networks (MLP, CNN etc),
  but optionally truncated BPTT can be used for training recurrent neural networks.
  If using TruncatedBPTT make sure you set both tBPTTForwardLength() and tBPTTBackwardLength()

  backprop-type - Type of backprop. Default: BackpropType.Standard - `org.deeplearning4j.nn.conf.BackpropType`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^org.deeplearning4j.nn.conf.BackpropType backprop-type]
    (-> this (.backpropType backprop-type))))

(defn bias-updater
  "Gradient updater configuration, for the biases only. If not set, biases will use the updater as
  set by updater(IUpdater)

  bias-updater - Updater to use for bias parameters - `org.nd4j.linalg.learning.config.IUpdater`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^org.nd4j.linalg.learning.config.IUpdater bias-updater]
    (-> this (.biasUpdater bias-updater))))

(defn dist
  "Distribution to sample initial weights from. Used in conjunction with .weightInit(WeightInit.DISTRIBUTION)

  dist - `org.deeplearning4j.nn.conf.distribution.Distribution`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^org.deeplearning4j.nn.conf.distribution.Distribution dist]
    (-> this (.dist dist))))

(defn dropout
  "Set the dropout

  dropout - Dropout, such as Dropout, GaussianDropout,GaussianNoise etc - `org.deeplearning4j.nn.conf.dropout.IDropout`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^org.deeplearning4j.nn.conf.dropout.IDropout dropout]
    (-> this (.dropout dropout))))

(defn gradient-normalization
  "Gradient normalization strategy. Used to specify gradient renormalization, gradient clipping etc.
  See GradientNormalization for details

  gradient-normalization - Type of normalization to use. Defaults to None. - `org.deeplearning4j.nn.conf.GradientNormalization`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^org.deeplearning4j.nn.conf.GradientNormalization gradient-normalization]
    (-> this (.gradientNormalization gradient-normalization))))

(defn max-num-line-search-iterations
  "max-num-line-search-iterations - `int`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^Integer max-num-line-search-iterations]
    (-> this (.maxNumLineSearchIterations max-num-line-search-iterations))))

(defn l-1
  "L1 regularization coefficient for the weights

  l-1 - `double`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^Double l-1]
    (-> this (.l1 l-1))))

(defn bias-init
  "Constant for bias initialization. Default: 0.0

  bias-init - Constant for bias initialization - `double`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^Double bias-init]
    (-> this (.biasInit bias-init))))

(defn step-function
  "step-function - `org.deeplearning4j.nn.conf.stepfunctions.StepFunction`

  returns: `org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder`"
  (^org.deeplearning4j.nn.transferlearning.FineTuneConfiguration$Builder [^FineTuneConfiguration$Builder this ^org.deeplearning4j.nn.conf.stepfunctions.StepFunction step-function]
    (-> this (.stepFunction step-function))))

