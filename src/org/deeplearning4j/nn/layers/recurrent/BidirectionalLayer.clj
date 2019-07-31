(ns org.deeplearning4j.nn.layers.recurrent.BidirectionalLayer
  "Bidirectional is a \"wrapper\" layer: it wraps any uni-directional RNN layer to make it bidirectional.
 Note that multiple different modes are supported - these specify how the activations should be combined from
 the forward and backward RNN networks. See Bidirectional.Mode javadoc for more details.
 Parameters are not shared here - there are 2 separate copies of the wrapped RNN layer, each with separate parameters.

 Usage: .layer(new Bidirectional(new LSTM.Builder()....build())"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.recurrent BidirectionalLayer]))

(defn ->bidirectional-layer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  fwd - `org.deeplearning4j.nn.api.Layer`
  bwd - `org.deeplearning4j.nn.api.Layer`
  params-view - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^BidirectionalLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.deeplearning4j.nn.api.Layer fwd ^org.deeplearning4j.nn.api.Layer bwd ^org.nd4j.linalg.api.ndarray.INDArray params-view]
    (new BidirectionalLayer conf fwd bwd params-view)))

(defn rnn-set-previous-state
  "Description copied from interface: RecurrentLayer

  state-map - `java.util.Map`"
  ([^BidirectionalLayer this ^java.util.Map state-map]
    (-> this (.rnnSetPreviousState state-map))))

(defn set-input
  "Description copied from interface: Layer

  input - `org.nd4j.linalg.api.ndarray.INDArray`
  layer-workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^BidirectionalLayer this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr layer-workspace-mgr]
    (-> this (.setInput input layer-workspace-mgr))))

(defn score
  "Description copied from interface: Model

  returns: the score for the model - `double`"
  (^Double [^BidirectionalLayer this]
    (-> this (.score))))

(defn param-table
  "Description copied from interface: Model

  backprop-params-only - If true, return backprop params only. If false: return all params (equivalent toparamsTable()) - `boolean`

  returns: Parameter table - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^BidirectionalLayer this ^Boolean backprop-params-only]
    (-> this (.paramTable backprop-params-only)))
  (^java.util.Map [^BidirectionalLayer this]
    (-> this (.paramTable))))

(defn rnn-get-previous-state
  "Description copied from interface: RecurrentLayer

  returns: `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^BidirectionalLayer this]
    (-> this (.rnnGetPreviousState))))

(defn fit
  "Description copied from interface: Model

  data - the data to fit the model to - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^BidirectionalLayer this ^org.nd4j.linalg.api.ndarray.INDArray data ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.fit data workspace-mgr)))
  ([^BidirectionalLayer this]
    (-> this (.fit))))

(defn get-iteration-count
  "returns: The current iteration count (number of parameter updates) for the layer/network - `int`"
  (^Integer [^BidirectionalLayer this]
    (-> this (.getIterationCount))))

(defn set-param
  "Description copied from interface: Model

  key - the key to se t - `java.lang.String`
  val - the new ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BidirectionalLayer this ^java.lang.String key ^org.nd4j.linalg.api.ndarray.INDArray val]
    (-> this (.setParam key val))))

(defn get-epoch-count
  "returns: The current epoch count (number of training epochs passed) for the layer/network - `int`"
  (^Integer [^BidirectionalLayer this]
    (-> this (.getEpochCount))))

(defn set-cache-mode
  "Description copied from interface: Layer

  mode - `org.deeplearning4j.nn.conf.CacheMode`"
  ([^BidirectionalLayer this ^org.deeplearning4j.nn.conf.CacheMode mode]
    (-> this (.setCacheMode mode))))

(defn gradient
  "Description copied from interface: Model

  returns: the gradient for this model, as calculated before - `org.deeplearning4j.nn.gradient.Gradient`"
  (^org.deeplearning4j.nn.gradient.Gradient [^BidirectionalLayer this]
    (-> this (.gradient))))

(defn set-conf
  "Description copied from interface: Model

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  ([^BidirectionalLayer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (-> this (.setConf conf))))

(defn get-helper
  "returns: Get the layer helper, if any - `org.deeplearning4j.nn.layers.LayerHelper`"
  (^org.deeplearning4j.nn.layers.LayerHelper [^BidirectionalLayer this]
    (-> this (.getHelper))))

(defn params
  "Description copied from interface: Model

  returns: the parameters of the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BidirectionalLayer this]
    (-> this (.params))))

(defn compute-gradient-and-score
  "Description copied from interface: Model

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^BidirectionalLayer this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeGradientAndScore workspace-mgr))))

(defn rnn-clear-previous-state
  "Description copied from interface: RecurrentLayer"
  ([^BidirectionalLayer this]
    (-> this (.rnnClearPreviousState))))

(defn feed-forward-mask-array
  "Description copied from interface: Layer

  mask-array - Mask array to set - `org.nd4j.linalg.api.ndarray.INDArray`
  current-mask-state - Current state of the mask - see MaskState - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - Current minibatch size. Needs to be known as it cannot always be inferred from the activationsarray due to reshaping (such as a DenseLayer within a recurrent neural network) - `int`

  returns: New mask array after this layer, along with the new mask state. - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^BidirectionalLayer this ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArray mask-array current-mask-state minibatch-size))))

(defn set-mask-array
  "Description copied from interface: Layer

  mask-array - Mask array to set - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BidirectionalLayer this ^org.nd4j.linalg.api.ndarray.INDArray mask-array]
    (-> this (.setMaskArray mask-array))))

(defn activate
  "Description copied from interface: Layer

  input - the input to use - `org.nd4j.linalg.api.ndarray.INDArray`
  training - train or test mode - `boolean`
  workspace-mgr - Workspace manager. - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Activations array. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BidirectionalLayer this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate input training workspace-mgr)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BidirectionalLayer this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn get-index
  "Description copied from interface: Layer

  returns: `int`"
  (^Integer [^BidirectionalLayer this]
    (-> this (.getIndex))))

(defn allow-input-modification
  "Description copied from interface: Layer

  allow - If true: the input array is safe to modify. If false: the input array should be copied before itis modified (i.e., in-place modifications are un-safe) - `boolean`"
  ([^BidirectionalLayer this ^Boolean allow]
    (-> this (.allowInputModification allow))))

(defn add-listeners
  "Description copied from interface: Model

  listener - `org.deeplearning4j.optimize.api.TrainingListener`"
  ([^BidirectionalLayer this ^org.deeplearning4j.optimize.api.TrainingListener listener]
    (-> this (.addListeners listener))))

(defn get-param
  "Description copied from interface: Model

  param - the key of the parameter - `java.lang.String`

  returns: the parameter vector/matrix with that particular key - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BidirectionalLayer this ^java.lang.String param]
    (-> this (.getParam param))))

(defn get-gradients-view-array
  "returns: 1D gradients view array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BidirectionalLayer this]
    (-> this (.getGradientsViewArray))))

(defn batch-size
  "Description copied from interface: Model

  returns: the current inputs batch size - `int`"
  (^Integer [^BidirectionalLayer this]
    (-> this (.batchSize))))

(defn set-params-view-array
  "Description copied from interface: Model

  params - a 1 x nParams row vector that is a view of the larger (MLN/CG) parameters array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BidirectionalLayer this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParamsViewArray params))))

(defn update
  "Description copied from interface: Model

  gradient - the gradient to apply - `org.nd4j.linalg.api.ndarray.INDArray`
  param-type - `java.lang.String`"
  ([^BidirectionalLayer this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^java.lang.String param-type]
    (-> this (.update gradient param-type)))
  ([^BidirectionalLayer this ^org.deeplearning4j.nn.gradient.Gradient gradient]
    (-> this (.update gradient))))

(defn set-param-table
  "Description copied from interface: Model

  param-table - `java.util.Map`"
  ([^BidirectionalLayer this ^java.util.Map param-table]
    (-> this (.setParamTable param-table))))

(defn set-input-mini-batch-size
  "Description copied from interface: Layer

  size - `int`"
  ([^BidirectionalLayer this ^Integer size]
    (-> this (.setInputMiniBatchSize size))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^BidirectionalLayer this]
    (-> this (.isPretrainLayer))))

(defn clear-noise-weight-params
  ""
  ([^BidirectionalLayer this]
    (-> this (.clearNoiseWeightParams))))

(defn set-params
  "Description copied from interface: Model

  params - the parameters for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BidirectionalLayer this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParams params))))

(defn set-listeners
  "Description copied from interface: Layer

  listeners - `org.deeplearning4j.optimize.api.TrainingListener`"
  ([^BidirectionalLayer this ^org.deeplearning4j.optimize.api.TrainingListener listeners]
    (-> this (.setListeners listeners))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^BidirectionalLayer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn conf
  "Description copied from interface: Model

  returns: the configuration for the neural network - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^BidirectionalLayer this]
    (-> this (.conf))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: Model

  gradients - a 1 x nParams row vector that is a view of the larger (MLN/CG) gradients array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BidirectionalLayer this ^org.nd4j.linalg.api.ndarray.INDArray gradients]
    (-> this (.setBackpropGradientsViewArray gradients))))

(defn rnn-get-tbptt-state
  "Description copied from interface: RecurrentLayer

  returns: State for the RNN layer - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^BidirectionalLayer this]
    (-> this (.rnnGetTBPTTState))))

(defn num-params
  "Description copied from interface: Model

  backwards - `boolean`

  returns: the number of parameters for the model - `int`"
  (^Integer [^BidirectionalLayer this ^Boolean backwards]
    (-> this (.numParams backwards)))
  (^Integer [^BidirectionalLayer this]
    (-> this (.numParams))))

(defn set-index
  "Description copied from interface: Layer

  index - `int`"
  ([^BidirectionalLayer this ^Integer index]
    (-> this (.setIndex index))))

(defn set-iteration-count
  "Description copied from interface: Layer

  iteration-count - `int`"
  ([^BidirectionalLayer this ^Integer iteration-count]
    (-> this (.setIterationCount iteration-count))))

(defn input
  "Description copied from interface: Model

  returns: the input/feature matrix for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BidirectionalLayer this]
    (-> this (.input))))

(defn rnn-set-tbptt-state
  "Description copied from interface: RecurrentLayer

  state - TBPTT state to set - `java.util.Map`"
  ([^BidirectionalLayer this ^java.util.Map state]
    (-> this (.rnnSetTBPTTState state))))

(defn type
  "Description copied from interface: Layer

  returns: `org.deeplearning4j.nn.api.Layer$Type`"
  (^org.deeplearning4j.nn.api.Layer$Type [^BidirectionalLayer this]
    (-> this (.type))))

(defn calc-l-1
  "Description copied from interface: Layer

  backprop-only-params - If true: calculate L1 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l1 regularization term for this layer. - `double`"
  (^Double [^BidirectionalLayer this ^Boolean backprop-only-params]
    (-> this (.calcL1 backprop-only-params))))

(defn calc-l-2
  "Description copied from interface: Layer

  backprop-only-params - If true: calculate L2 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l2 regularization term for this layer. - `double`"
  (^Double [^BidirectionalLayer this ^Boolean backprop-only-params]
    (-> this (.calcL2 backprop-only-params))))

(defn init
  "Description copied from interface: Model"
  ([^BidirectionalLayer this]
    (-> this (.init))))

(defn get-mask-array
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BidirectionalLayer this]
    (-> this (.getMaskArray))))

(defn get-listeners
  "Description copied from interface: Layer

  returns: `java.util.Collection<org.deeplearning4j.optimize.api.TrainingListener>`"
  (^java.util.Collection [^BidirectionalLayer this]
    (-> this (.getListeners))))

(defn clear
  "Description copied from interface: Model"
  ([^BidirectionalLayer this]
    (-> this (.clear))))

(defn rnn-time-step
  "Description copied from interface: RecurrentLayer

  input - Input to this layer - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: activations - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BidirectionalLayer this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.rnnTimeStep input workspace-mgr))))

(defn rnn-activate-using-stored-state
  "Description copied from interface: RecurrentLayer

  input - Layer input - `org.nd4j.linalg.api.ndarray.INDArray`
  training - if true: training. Otherwise: test - `boolean`
  store-last-for-tbptt - If true: store the final state in tBpttStateMap for use in truncated BPTT training - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Layer activations - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BidirectionalLayer this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^Boolean store-last-for-tbptt ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.rnnActivateUsingStoredState input training store-last-for-tbptt workspace-mgr))))

(defn get-config
  "returns: Training configuration - `org.deeplearning4j.nn.api.TrainingConfig`"
  (^org.deeplearning4j.nn.api.TrainingConfig [^BidirectionalLayer this]
    (-> this (.getConfig))))

(defn get-optimizer
  "Description copied from interface: Model

  returns: this models optimizer - `org.deeplearning4j.optimize.api.ConvexOptimizer`"
  (^org.deeplearning4j.optimize.api.ConvexOptimizer [^BidirectionalLayer this]
    (-> this (.getOptimizer))))

(defn get-input-mini-batch-size
  "Description copied from interface: Layer

  returns: `int`"
  (^Integer [^BidirectionalLayer this]
    (-> this (.getInputMiniBatchSize))))

(defn apply-constraints
  "Description copied from interface: Model

  iteration - `int`
  epoch - `int`"
  ([^BidirectionalLayer this ^Integer iteration ^Integer epoch]
    (-> this (.applyConstraints iteration epoch))))

(defn gradient-and-score
  "Description copied from interface: Model

  returns: the gradient and score - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,java.lang.Double>`"
  (^org.nd4j.linalg.primitives.Pair [^BidirectionalLayer this]
    (-> this (.gradientAndScore))))

(defn set-epoch-count
  "Description copied from interface: Layer

  epoch-count - `int`"
  ([^BidirectionalLayer this ^Integer epoch-count]
    (-> this (.setEpochCount epoch-count))))

(defn tbptt-backprop-gradient
  "Description copied from interface: RecurrentLayer

  epsilon - `org.nd4j.linalg.api.ndarray.INDArray`
  tbptt-back-length - `int`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^BidirectionalLayer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^Integer tbptt-back-length ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.tbpttBackpropGradient epsilon tbptt-back-length workspace-mgr))))

