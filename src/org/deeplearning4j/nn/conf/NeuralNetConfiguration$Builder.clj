(ns org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder
  "NeuralNetConfiguration builder, used as a starting point for creating a MultiLayerConfiguration or
 ComputationGraphConfiguration.
 Note that values set here on the layer will be applied to all relevant layers - unless the value is overridden
 on a layer's configuration"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf NeuralNetConfiguration$Builder]))

(defn ->builder
  "Constructor.

  new-conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^NeuralNetConfiguration$Builder [^org.deeplearning4j.nn.conf.NeuralNetConfiguration new-conf]
    (new NeuralNetConfiguration$Builder new-conf))
  (^NeuralNetConfiguration$Builder []
    (new NeuralNetConfiguration$Builder )))

(defn gradient-normalization-threshold
  "Threshold for gradient normalization, only used for GradientNormalization.ClipL2PerLayer,
  GradientNormalization.ClipL2PerParamType, and GradientNormalization.ClipElementWiseAbsoluteValue
  Not used otherwise.
  L2 threshold for first two types of clipping, or absolute value threshold for last type of clipping.
  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  threshold - `double`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^Double threshold]
    (-> this (.gradientNormalizationThreshold threshold))))

(defn graph-builder
  "Create a GraphBuilder (for creating a ComputationGraphConfiguration).

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration$GraphBuilder [^NeuralNetConfiguration$Builder this]
    (-> this (.graphBuilder))))

(defn list
  "Create a ListBuilder (for creating a MultiLayerConfiguration) with the specified layers
  Usage:


    .list(
        new DenseLayer.Builder()...build(),
        ...,
        new OutputLayer.Builder()...build())

  layers - The layer configurations for the network - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$ListBuilder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$ListBuilder [^NeuralNetConfiguration$Builder this ^org.deeplearning4j.nn.conf.layers.Layer layers]
    (-> this (.list layers)))
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$ListBuilder [^NeuralNetConfiguration$Builder this]
    (-> this (.list))))

(defn cudnn-algo-mode
  "Sets the cuDNN algo mode for convolutional layers, which impacts performance and memory usage of cuDNN.
  See ConvolutionLayer.AlgoMode for details. Defaults to \"PREFER_FASTEST\", but \"NO_WORKSPACE\" uses less memory.

  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  cudnn-algo-mode - cuDNN algo mode to use - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.deeplearning4j.nn.conf.layers.ConvolutionLayer$AlgoMode cudnn-algo-mode]
    (-> this (.cudnnAlgoMode cudnn-algo-mode))))

(defn updater
  "Gradient updater configuration. For example, Adam
  or Nesterovs
  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  updater - Updater to use - `org.nd4j.linalg.learning.config.IUpdater`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.nd4j.linalg.learning.config.IUpdater updater]
    (-> this (.updater updater))))

(defn l-2-bias
  "L2 regularization coefficient for the bias.
  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  l-2-bias - `double`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^Double l-2-bias]
    (-> this (.l2Bias l-2-bias))))

(defn weight-init
  "Weight initialization scheme.
  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  weight-init - `org.deeplearning4j.nn.weights.WeightInit`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.deeplearning4j.nn.weights.WeightInit weight-init]
    (-> this (.weightInit weight-init))))

(defn constrain-bias
  "Set constraints to be applied to all layers. Default: no constraints.
  Constraints can be used to enforce certain conditions (non-negativity of parameters, max-norm regularization,
  etc). These constraints are applied at each iteration, after the parameters have been updated.
  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  constraints - Constraints to apply to all bias parameters of all layers - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainBias constraints))))

(defn activation
  "Activation function / neuron non-linearity
  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  activation-function - `org.nd4j.linalg.activations.IActivation`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.nd4j.linalg.activations.IActivation activation-function]
    (-> this (.activation activation-function))))

(defn minimize
  "Objective function to minimize or maximize cost function
  Default set to minimize true.

  minimize - `boolean`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^Boolean minimize]
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


  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  input-retain-probability - Dropout probability (probability of retaining each input activation value for a layer) - `double`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^Double input-retain-probability]
    (-> this (.dropOut input-retain-probability))))

(defn l-1-bias
  "L1 regularization coefficient for the bias.
  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  l-1-bias - `double`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^Double l-1-bias]
    (-> this (.l1Bias l-1-bias))))

(defn training-workspace-mode
  "This method defines Workspace mode being used during training:
  NONE: workspace won't be used
  ENABLED: workspaces will be used for training (reduced memory and better performance)

  workspace-mode - Workspace mode for training - `org.deeplearning4j.nn.conf.WorkspaceMode`

  returns: Builder - `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.deeplearning4j.nn.conf.WorkspaceMode workspace-mode]
    (-> this (.trainingWorkspaceMode workspace-mode))))

(defn constrain-weights
  "Set constraints to be applied to all layers. Default: no constraints.
  Constraints can be used to enforce certain conditions (non-negativity of parameters, max-norm regularization,
  etc). These constraints are applied at each iteration, after the parameters have been updated.
  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  constraints - Constraints to apply to all weight parameters of all layers - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainWeights constraints))))

(defn inference-workspace-mode
  "This method defines Workspace mode being used during inference:
  NONE: workspace won't be used
  ENABLED: workspaces will be used for inference (reduced memory and better performance)

  workspace-mode - Workspace mode for inference - `org.deeplearning4j.nn.conf.WorkspaceMode`

  returns: Builder - `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.deeplearning4j.nn.conf.WorkspaceMode workspace-mode]
    (-> this (.inferenceWorkspaceMode workspace-mode))))

(defn optimization-algo
  "Optimization algorithm to use. Most common: OptimizationAlgorithm.STOCHASTIC_GRADIENT_DESCENT

  optimization-algo - Optimization algorithm to use when training - `org.deeplearning4j.nn.api.OptimizationAlgorithm`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.deeplearning4j.nn.api.OptimizationAlgorithm optimization-algo]
    (-> this (.optimizationAlgo optimization-algo))))

(defn seed
  "Random number generator seed. Used for reproducability between runs

  seed - `long`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^Long seed]
    (-> this (.seed seed))))

(defn build
  "Return a configuration based on this builder

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^NeuralNetConfiguration$Builder this]
    (-> this (.build))))

(defn mini-batch
  "Process input as minibatch vs full dataset.
  Default set to true.

  mini-batch - `boolean`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^Boolean mini-batch]
    (-> this (.miniBatch mini-batch))))

(defn weight-noise
  "Set the weight noise (such as DropConnect and
  WeightNoise) for the layers in this network.
  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  weight-noise - Weight noise instance to use - `org.deeplearning4j.nn.conf.weightnoise.IWeightNoise`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.deeplearning4j.nn.conf.weightnoise.IWeightNoise weight-noise]
    (-> this (.weightNoise weight-noise))))

(defn constrain-all-parameters
  "Set constraints to be applied to all layers. Default: no constraints.
  Constraints can be used to enforce certain conditions (non-negativity of parameters, max-norm regularization,
  etc). These constraints are applied at each iteration, after the parameters have been updated.
  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  constraints - Constraints to apply to all parameters of all layers - `org.deeplearning4j.nn.api.layers.LayerConstraint`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.deeplearning4j.nn.api.layers.LayerConstraint constraints]
    (-> this (.constrainAllParameters constraints))))

(defn cache-mode
  "This method defines how/if preOutput cache is handled:
  NONE: cache disabled (default value)
  HOST: Host memory will be used
  DEVICE: GPU memory will be used (on CPU backends effect will be the same as for HOST)

  cache-mode - Cache mode to use - `org.deeplearning4j.nn.conf.CacheMode`

  returns: Builder - `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.deeplearning4j.nn.conf.CacheMode cache-mode]
    (-> this (.cacheMode cache-mode))))

(defn convolution-mode
  "Sets the convolution mode for convolutional layers, which impacts padding and output sizes.
  See ConvolutionMode for details. Defaults to ConvolutionMode.TRUNCATE
  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  convolution-mode - Convolution mode to use - `org.deeplearning4j.nn.conf.ConvolutionMode`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.deeplearning4j.nn.conf.ConvolutionMode convolution-mode]
    (-> this (.convolutionMode convolution-mode))))

(defn l-2
  "L2 regularization coefficient for the weights.
  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  l-2 - `double`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^Double l-2]
    (-> this (.l2 l-2))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this]
    (-> this (.clone))))

(defn bias-updater
  "Gradient updater configuration, for the biases only. If not set, biases will use the updater as
  set by updater(IUpdater)
  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  updater - Updater to use for bias parameters - `org.nd4j.linalg.learning.config.IUpdater`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.nd4j.linalg.learning.config.IUpdater updater]
    (-> this (.biasUpdater updater))))

(defn layer
  "Layer class.

  layer - `org.deeplearning4j.nn.conf.layers.Layer`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (-> this (.layer layer))))

(defn dist
  "Distribution to sample initial weights from. Used in conjunction with
  .weightInit(WeightInit.DISTRIBUTION).
  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  dist - `org.deeplearning4j.nn.conf.distribution.Distribution`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.deeplearning4j.nn.conf.distribution.Distribution dist]
    (-> this (.dist dist))))

(defn gradient-normalization
  "Gradient normalization strategy. Used to specify gradient renormalization, gradient clipping etc.
  See GradientNormalization for details
  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  gradient-normalization - Type of normalization to use. Defaults to None. - `org.deeplearning4j.nn.conf.GradientNormalization`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.deeplearning4j.nn.conf.GradientNormalization gradient-normalization]
    (-> this (.gradientNormalization gradient-normalization))))

(defn max-num-line-search-iterations
  "Maximum number of line search iterations.
  Only applies for line search optimizers: Line Search SGD, Conjugate Gradient, LBFGS
  is NOT applicable for standard SGD

  max-num-line-search-iterations - > 0 - `int`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^Integer max-num-line-search-iterations]
    (-> this (.maxNumLineSearchIterations max-num-line-search-iterations))))

(defn l-1
  "L1 regularization coefficient for the weights.
  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  l-1 - `double`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^Double l-1]
    (-> this (.l1 l-1))))

(defn bias-init
  "Constant for bias initialization. Default: 0.0
  Note: values set by this method will be applied to all applicable layers in the network, unless a different
  value is explicitly set on a given layer. In other words: values set via this method are used as the default
  value, and can be overridden on a per-layer basis.

  bias-init - Constant for bias initialization - `double`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^Double bias-init]
    (-> this (.biasInit bias-init))))

(defn step-function
  "Deprecated.

  step-function - `org.deeplearning4j.nn.conf.stepfunctions.StepFunction`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder [^NeuralNetConfiguration$Builder this ^org.deeplearning4j.nn.conf.stepfunctions.StepFunction step-function]
    (-> this (.stepFunction step-function))))

