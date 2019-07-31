(ns org.deeplearning4j.nn.layers.variational.VariationalAutoencoder
  "Variational Autoencoder layer

 See: Kingma & Welling, 2013: Auto-Encoding Variational Bayes - https://arxiv.org/abs/1312.6114

 This implementation allows multiple encoder and decoder layers, the number and sizes of which can be set independently.

 A note on scores during pretraining: This implementation minimizes the negative of the variational lower bound objective
 as described in Kingma & Welling; the mathematics in that paper is based on maximization of the variational lower bound instead.
 Thus, scores reported during pretraining in DL4J are the negative of the variational lower bound equation in the paper.
 The backpropagation and learning procedure is otherwise as described there."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.variational VariationalAutoencoder]))

(defn ->variational-autoencoder
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^VariationalAutoencoder [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new VariationalAutoencoder conf)))

(defn set-input
  "Description copied from interface: Layer

  input - `org.nd4j.linalg.api.ndarray.INDArray`
  layer-workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^VariationalAutoencoder this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr layer-workspace-mgr]
    (-> this (.setInput input layer-workspace-mgr))))

(defn score
  "Description copied from interface: Model

  returns: the score for the model - `double`"
  (^Double [^VariationalAutoencoder this]
    (-> this (.score))))

(defn param-table
  "Description copied from interface: Model

  backprop-params-only - If true, return backprop params only. If false: return all params (equivalent toparamsTable()) - `boolean`

  returns: Parameter table - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^VariationalAutoencoder this ^Boolean backprop-params-only]
    (-> this (.paramTable backprop-params-only)))
  (^java.util.Map [^VariationalAutoencoder this]
    (-> this (.paramTable))))

(defn fit
  "Description copied from interface: Model

  data - the data to fit the model to - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^VariationalAutoencoder this ^org.nd4j.linalg.api.ndarray.INDArray data ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.fit data workspace-mgr)))
  ([^VariationalAutoencoder this]
    (-> this (.fit))))

(defn set-param
  "Description copied from interface: Model

  key - the key to se t - `java.lang.String`
  val - the new ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^VariationalAutoencoder this ^java.lang.String key ^org.nd4j.linalg.api.ndarray.INDArray val]
    (-> this (.setParam key val))))

(defn set-cache-mode
  "Description copied from interface: Layer

  mode - `org.deeplearning4j.nn.conf.CacheMode`"
  ([^VariationalAutoencoder this ^org.deeplearning4j.nn.conf.CacheMode mode]
    (-> this (.setCacheMode mode))))

(defn gradient
  "Description copied from interface: Model

  returns: the gradient for this model, as calculated before - `org.deeplearning4j.nn.gradient.Gradient`"
  (^org.deeplearning4j.nn.gradient.Gradient [^VariationalAutoencoder this]
    (-> this (.gradient))))

(defn set-conf
  "Description copied from interface: Model

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  ([^VariationalAutoencoder this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (-> this (.setConf conf))))

(defn get-helper
  "returns: Get the layer helper, if any - `org.deeplearning4j.nn.layers.LayerHelper`"
  (^org.deeplearning4j.nn.layers.LayerHelper [^VariationalAutoencoder this]
    (-> this (.getHelper))))

(defn params
  "Description copied from interface: Model

  returns: the parameters of the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VariationalAutoencoder this]
    (-> this (.params))))

(defn compute-gradient-and-score
  "Description copied from interface: Model

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^VariationalAutoencoder this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeGradientAndScore workspace-mgr))))

(defn feed-forward-mask-array
  "Description copied from interface: Layer

  mask-array - Mask array to set - `org.nd4j.linalg.api.ndarray.INDArray`
  current-mask-state - Current state of the mask - see MaskState - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - Current minibatch size. Needs to be known as it cannot always be inferred from the activationsarray due to reshaping (such as a DenseLayer within a recurrent neural network) - `int`

  returns: New mask array after this layer, along with the new mask state. - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^VariationalAutoencoder this ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArray mask-array current-mask-state minibatch-size))))

(defn pretrain-param?
  "param - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^VariationalAutoencoder this ^java.lang.String param]
    (-> this (.isPretrainParam param))))

(defn set-mask-array
  "Description copied from interface: Layer

  mask-array - Mask array to set - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^VariationalAutoencoder this ^org.nd4j.linalg.api.ndarray.INDArray mask-array]
    (-> this (.setMaskArray mask-array))))

(defn activate
  "Description copied from interface: Layer

  input - the input to use - `org.nd4j.linalg.api.ndarray.INDArray`
  training - train or test mode - `boolean`
  workspace-mgr - Workspace manager. - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Activations array. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VariationalAutoencoder this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate input training workspace-mgr)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^VariationalAutoencoder this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn get-index
  "Description copied from interface: Layer

  returns: `int`"
  (^Integer [^VariationalAutoencoder this]
    (-> this (.getIndex))))

(defn reconstruction-probability
  "Calculate the reconstruction probability, as described in An & Cho, 2015 - \"Variational Autoencoder based
  Anomaly Detection using Reconstruction Probability\" (Algorithm 4)
  The authors describe it as follows: \"This is essentially the probability of the data being generated from a given
  latent variable drawn from the approximate posterior distribution.\"

  Specifically, for each example x in the input, calculate p(x). Note however that p(x) is a stochastic (Monte-Carlo)
  estimate of the true p(x), based on the specified number of samples. More samples will produce a more accurate
  (lower variance) estimate of the true p(x) for the current model parameters.

  Internally uses reconstructionLogProbability(INDArray, int) for the actual implementation.
  That method may be more numerically stable in some cases.

  The returned array is a column vector of reconstruction probabilities, for each example. Thus, reconstruction probabilities
  can (and should, for efficiency) be calculated in a batched manner.

  data - The data to calculate the reconstruction probability for - `org.nd4j.linalg.api.ndarray.INDArray`
  num-samples - Number of samples with which to base the reconstruction probability on. - `int`

  returns: Column vector of reconstruction probabilities for each example (shape: [numExamples,1]) - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VariationalAutoencoder this ^org.nd4j.linalg.api.ndarray.INDArray data ^Integer num-samples]
    (-> this (.reconstructionProbability data num-samples))))

(defn allow-input-modification
  "Description copied from interface: Layer

  allow - If true: the input array is safe to modify. If false: the input array should be copied before itis modified (i.e., in-place modifications are un-safe) - `boolean`"
  ([^VariationalAutoencoder this ^Boolean allow]
    (-> this (.allowInputModification allow))))

(defn add-listeners
  "This method ADDS additional TrainingListener to existing listeners

  listeners - `org.deeplearning4j.optimize.api.TrainingListener`"
  ([^VariationalAutoencoder this ^org.deeplearning4j.optimize.api.TrainingListener listeners]
    (-> this (.addListeners listeners))))

(defn get-param
  "Description copied from interface: Model

  param - the key of the parameter - `java.lang.String`

  returns: the parameter vector/matrix with that particular key - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VariationalAutoencoder this ^java.lang.String param]
    (-> this (.getParam param))))

(defn generate-random-given-z
  "Given a specified values for the latent space as input (latent space being z in p(z|data)), randomly generate output
  x, where x ~ P(x|z)

  latent-space-values - Values for the latent space. size(1) must equal nOut configuration parameter - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Sample of data: x ~ P(x|z) - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VariationalAutoencoder this ^org.nd4j.linalg.api.ndarray.INDArray latent-space-values ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.generateRandomGivenZ latent-space-values workspace-mgr))))

(defn get-gradients-view-array
  "returns: 1D gradients view array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VariationalAutoencoder this]
    (-> this (.getGradientsViewArray))))

(defn batch-size
  "Description copied from interface: Model

  returns: the current inputs batch size - `int`"
  (^Integer [^VariationalAutoencoder this]
    (-> this (.batchSize))))

(defn generate-at-mean-given-z
  "Given a specified values for the latent space as input (latent space being z in p(z|data)), generate output
  from P(x|z), where x = E[P(x|z)]
  i.e., return the mean value for the distribution P(x|z)

  latent-space-values - Values for the latent space. size(1) must equal nOut configuration parameter - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Sample of data: E[P(x|z)] - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VariationalAutoencoder this ^org.nd4j.linalg.api.ndarray.INDArray latent-space-values]
    (-> this (.generateAtMeanGivenZ latent-space-values))))

(defn set-params-view-array
  "Description copied from interface: Model

  params - a 1 x nParams row vector that is a view of the larger (MLN/CG) parameters array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^VariationalAutoencoder this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParamsViewArray params))))

(defn update
  "Description copied from interface: Model

  gradient - the gradient to apply - `org.nd4j.linalg.api.ndarray.INDArray`
  param-type - `java.lang.String`"
  ([^VariationalAutoencoder this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^java.lang.String param-type]
    (-> this (.update gradient param-type)))
  ([^VariationalAutoencoder this ^org.deeplearning4j.nn.gradient.Gradient gradient]
    (-> this (.update gradient))))

(defn assert-input-set
  "backprop - `boolean`"
  ([^VariationalAutoencoder this ^Boolean backprop]
    (-> this (.assertInputSet backprop))))

(defn has-loss-function?
  "Does the reconstruction distribution have a loss function (such as mean squared error) or is it a standard
  probabilistic reconstruction distribution?

  returns: `boolean`"
  (^Boolean [^VariationalAutoencoder this]
    (-> this (.hasLossFunction))))

(defn set-param-table
  "Description copied from interface: Model

  param-table - `java.util.Map`"
  ([^VariationalAutoencoder this ^java.util.Map param-table]
    (-> this (.setParamTable param-table))))

(defn set-input-mini-batch-size
  "Description copied from interface: Layer

  size - `int`"
  ([^VariationalAutoencoder this ^Integer size]
    (-> this (.setInputMiniBatchSize size))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^VariationalAutoencoder this]
    (-> this (.isPretrainLayer))))

(defn clear-noise-weight-params
  ""
  ([^VariationalAutoencoder this]
    (-> this (.clearNoiseWeightParams))))

(defn set-params
  "Description copied from interface: Model

  params - the parameters for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^VariationalAutoencoder this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParams params))))

(defn set-listeners
  "Description copied from interface: Layer

  listeners - `org.deeplearning4j.optimize.api.TrainingListener`"
  ([^VariationalAutoencoder this ^org.deeplearning4j.optimize.api.TrainingListener listeners]
    (-> this (.setListeners listeners))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^VariationalAutoencoder this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn conf
  "Description copied from interface: Model

  returns: the configuration for the neural network - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^VariationalAutoencoder this]
    (-> this (.conf))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: Model

  gradients - a 1 x nParams row vector that is a view of the larger (MLN/CG) gradients array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^VariationalAutoencoder this ^org.nd4j.linalg.api.ndarray.INDArray gradients]
    (-> this (.setBackpropGradientsViewArray gradients))))

(defn num-params
  "Description copied from interface: Model

  backwards - `boolean`

  returns: the number of parameters for the model - `int`"
  (^Integer [^VariationalAutoencoder this ^Boolean backwards]
    (-> this (.numParams backwards)))
  (^Integer [^VariationalAutoencoder this]
    (-> this (.numParams))))

(defn set-index
  "Description copied from interface: Layer

  index - `int`"
  ([^VariationalAutoencoder this ^Integer index]
    (-> this (.setIndex index))))

(defn input
  "Description copied from interface: Model

  returns: the input/feature matrix for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VariationalAutoencoder this]
    (-> this (.input))))

(defn type
  "Description copied from interface: Layer

  returns: `org.deeplearning4j.nn.api.Layer$Type`"
  (^org.deeplearning4j.nn.api.Layer$Type [^VariationalAutoencoder this]
    (-> this (.type))))

(defn calc-l-1
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L1 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l1 regularization term for this layer. - `double`"
  (^Double [^VariationalAutoencoder this ^Boolean backprop-params-only]
    (-> this (.calcL1 backprop-params-only))))

(defn calc-l-2
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L2 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l2 regularization term for this layer. - `double`"
  (^Double [^VariationalAutoencoder this ^Boolean backprop-params-only]
    (-> this (.calcL2 backprop-params-only))))

(defn init
  "Init the model"
  ([^VariationalAutoencoder this]
    (-> this (.init))))

(defn reconstruction-error
  "Return the reconstruction error for this variational autoencoder.
  NOTE (important): This method is used ONLY for VAEs that have a standard neural network loss function (i.e.,
  an ILossFunction instance such as mean squared error) instead of using a
  probabilistic reconstruction distribution P(x|z) for the reconstructions (as presented in the VAE architecture by
  Kingma and Welling).
  You can check if the VAE has a loss function using hasLossFunction()
  Consequently, the reconstruction error is a simple deterministic function (no Monte-Carlo sampling is required,
  unlike reconstructionProbability(INDArray, int) and reconstructionLogProbability(INDArray, int))

  data - The data to calculate the reconstruction error on - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Column vector of reconstruction errors for each example (shape: [numExamples,1]) - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VariationalAutoencoder this ^org.nd4j.linalg.api.ndarray.INDArray data]
    (-> this (.reconstructionError data))))

(defn get-mask-array
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VariationalAutoencoder this]
    (-> this (.getMaskArray))))

(defn pre-output
  "training - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VariationalAutoencoder this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.preOutput training workspace-mgr))))

(defn get-listeners
  "Description copied from interface: Layer

  returns: `java.util.Collection<org.deeplearning4j.optimize.api.TrainingListener>`"
  (^java.util.Collection [^VariationalAutoencoder this]
    (-> this (.getListeners))))

(defn clear
  "Description copied from interface: Model"
  ([^VariationalAutoencoder this]
    (-> this (.clear))))

(defn reconstruction-log-probability
  "Return the log reconstruction probability given the specified number of samples.
  See reconstructionLogProbability(INDArray, int) for more details

  data - The data to calculate the log reconstruction probability - `org.nd4j.linalg.api.ndarray.INDArray`
  num-samples - Number of samples with which to base the reconstruction probability on. - `int`

  returns: Column vector of reconstruction log probabilities for each example (shape: [numExamples,1]) - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VariationalAutoencoder this ^org.nd4j.linalg.api.ndarray.INDArray data ^Integer num-samples]
    (-> this (.reconstructionLogProbability data num-samples))))

(defn get-config
  "returns: Training configuration - `org.deeplearning4j.nn.api.TrainingConfig`"
  (^org.deeplearning4j.nn.api.TrainingConfig [^VariationalAutoencoder this]
    (-> this (.getConfig))))

(defn get-optimizer
  "Description copied from interface: Model

  returns: this models optimizer - `org.deeplearning4j.optimize.api.ConvexOptimizer`"
  (^org.deeplearning4j.optimize.api.ConvexOptimizer [^VariationalAutoencoder this]
    (-> this (.getOptimizer))))

(defn get-input-mini-batch-size
  "Description copied from interface: Layer

  returns: `int`"
  (^Integer [^VariationalAutoencoder this]
    (-> this (.getInputMiniBatchSize))))

(defn apply-constraints
  "Description copied from interface: Model

  iteration - `int`
  epoch - `int`"
  ([^VariationalAutoencoder this ^Integer iteration ^Integer epoch]
    (-> this (.applyConstraints iteration epoch))))

(defn gradient-and-score
  "Description copied from interface: Model

  returns: the gradient and score - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,java.lang.Double>`"
  (^org.nd4j.linalg.primitives.Pair [^VariationalAutoencoder this]
    (-> this (.gradientAndScore))))

