(ns org.deeplearning4j.nn.layers.wrapper.BaseWrapperLayer
  "Abstract wrapper layer. The idea: this class passes through all methods to the underlying layer.
 Then, subclasses of BaseWrapperLayer can selectively override specific methods, rather than having
 to implement every single one of the passthrough methods in each subclass."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.wrapper BaseWrapperLayer]))

(defn ->base-wrapper-layer
  "Constructor.

  underlying - `org.deeplearning4j.nn.api.Layer`"
  (^BaseWrapperLayer [^org.deeplearning4j.nn.api.Layer underlying]
    (new BaseWrapperLayer underlying)))

(defn set-input
  "Description copied from interface: Layer

  input - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^BaseWrapperLayer this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.setInput input workspace-mgr))))

(defn score
  "Description copied from interface: Model

  returns: the score for the model - `double`"
  (^Double [^BaseWrapperLayer this]
    (-> this (.score))))

(defn param-table
  "Description copied from interface: Model

  backprop-params-only - If true, return backprop params only. If false: return all params (equivalent toparamsTable()) - `boolean`

  returns: Parameter table - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^BaseWrapperLayer this ^Boolean backprop-params-only]
    (-> this (.paramTable backprop-params-only)))
  (^java.util.Map [^BaseWrapperLayer this]
    (-> this (.paramTable))))

(defn fit
  "Description copied from interface: Model

  data - the data to fit the model to - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^BaseWrapperLayer this ^org.nd4j.linalg.api.ndarray.INDArray data ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.fit data workspace-mgr)))
  ([^BaseWrapperLayer this]
    (-> this (.fit))))

(defn get-iteration-count
  "returns: The current iteration count (number of parameter updates) for the layer/network - `int`"
  (^Integer [^BaseWrapperLayer this]
    (-> this (.getIterationCount))))

(defn set-param
  "Description copied from interface: Model

  key - the key to se t - `java.lang.String`
  val - the new ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseWrapperLayer this ^java.lang.String key ^org.nd4j.linalg.api.ndarray.INDArray val]
    (-> this (.setParam key val))))

(defn get-epoch-count
  "returns: The current epoch count (number of training epochs passed) for the layer/network - `int`"
  (^Integer [^BaseWrapperLayer this]
    (-> this (.getEpochCount))))

(defn set-cache-mode
  "Description copied from interface: Layer

  mode - `org.deeplearning4j.nn.conf.CacheMode`"
  ([^BaseWrapperLayer this ^org.deeplearning4j.nn.conf.CacheMode mode]
    (-> this (.setCacheMode mode))))

(defn gradient
  "Description copied from interface: Model

  returns: the gradient for this model, as calculated before - `org.deeplearning4j.nn.gradient.Gradient`"
  (^org.deeplearning4j.nn.gradient.Gradient [^BaseWrapperLayer this]
    (-> this (.gradient))))

(defn set-conf
  "Description copied from interface: Model

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  ([^BaseWrapperLayer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (-> this (.setConf conf))))

(defn get-helper
  "returns: Get the layer helper, if any - `org.deeplearning4j.nn.layers.LayerHelper`"
  (^org.deeplearning4j.nn.layers.LayerHelper [^BaseWrapperLayer this]
    (-> this (.getHelper))))

(defn params
  "Description copied from interface: Model

  returns: the parameters of the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWrapperLayer this]
    (-> this (.params))))

(defn compute-gradient-and-score
  "Description copied from interface: Model

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^BaseWrapperLayer this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeGradientAndScore workspace-mgr))))

(defn feed-forward-mask-array
  "Description copied from interface: Layer

  mask-array - Mask array to set - `org.nd4j.linalg.api.ndarray.INDArray`
  current-mask-state - Current state of the mask - see MaskState - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - Current minibatch size. Needs to be known as it cannot always be inferred from the activationsarray due to reshaping (such as a DenseLayer within a recurrent neural network) - `int`

  returns: New mask array after this layer, along with the new mask state. - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^BaseWrapperLayer this ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArray mask-array current-mask-state minibatch-size))))

(defn set-mask-array
  "Description copied from interface: Layer

  mask-array - Mask array to set - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseWrapperLayer this ^org.nd4j.linalg.api.ndarray.INDArray mask-array]
    (-> this (.setMaskArray mask-array))))

(defn activate
  "Description copied from interface: Layer

  input - the input to use - `org.nd4j.linalg.api.ndarray.INDArray`
  training - train or test mode - `boolean`
  workspace-mgr - Workspace manager. - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Activations array. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWrapperLayer this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate input training workspace-mgr)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWrapperLayer this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn get-index
  "Description copied from interface: Layer

  returns: `int`"
  (^Integer [^BaseWrapperLayer this]
    (-> this (.getIndex))))

(defn allow-input-modification
  "Description copied from interface: Layer

  allow - If true: the input array is safe to modify. If false: the input array should be copied before itis modified (i.e., in-place modifications are un-safe) - `boolean`"
  ([^BaseWrapperLayer this ^Boolean allow]
    (-> this (.allowInputModification allow))))

(defn add-listeners
  "Description copied from interface: Model

  listener - `org.deeplearning4j.optimize.api.TrainingListener`"
  ([^BaseWrapperLayer this ^org.deeplearning4j.optimize.api.TrainingListener listener]
    (-> this (.addListeners listener))))

(defn get-param
  "Description copied from interface: Model

  param - the key of the parameter - `java.lang.String`

  returns: the parameter vector/matrix with that particular key - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWrapperLayer this ^java.lang.String param]
    (-> this (.getParam param))))

(defn get-gradients-view-array
  "returns: 1D gradients view array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWrapperLayer this]
    (-> this (.getGradientsViewArray))))

(defn batch-size
  "Description copied from interface: Model

  returns: the current inputs batch size - `int`"
  (^Integer [^BaseWrapperLayer this]
    (-> this (.batchSize))))

(defn set-params-view-array
  "Description copied from interface: Model

  params - a 1 x nParams row vector that is a view of the larger (MLN/CG) parameters array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseWrapperLayer this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParamsViewArray params))))

(defn update
  "Description copied from interface: Model

  gradient - the gradient to apply - `org.nd4j.linalg.api.ndarray.INDArray`
  param-type - `java.lang.String`"
  ([^BaseWrapperLayer this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^java.lang.String param-type]
    (-> this (.update gradient param-type)))
  ([^BaseWrapperLayer this ^org.deeplearning4j.nn.gradient.Gradient gradient]
    (-> this (.update gradient))))

(defn set-param-table
  "Description copied from interface: Model

  param-table - `java.util.Map`"
  ([^BaseWrapperLayer this ^java.util.Map param-table]
    (-> this (.setParamTable param-table))))

(defn set-input-mini-batch-size
  "Description copied from interface: Layer

  size - `int`"
  ([^BaseWrapperLayer this ^Integer size]
    (-> this (.setInputMiniBatchSize size))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^BaseWrapperLayer this]
    (-> this (.isPretrainLayer))))

(defn clear-noise-weight-params
  ""
  ([^BaseWrapperLayer this]
    (-> this (.clearNoiseWeightParams))))

(defn set-params
  "Description copied from interface: Model

  params - the parameters for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseWrapperLayer this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParams params))))

(defn set-listeners
  "Description copied from interface: Layer

  listeners - `org.deeplearning4j.optimize.api.TrainingListener`"
  ([^BaseWrapperLayer this ^org.deeplearning4j.optimize.api.TrainingListener listeners]
    (-> this (.setListeners listeners))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^BaseWrapperLayer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn conf
  "Description copied from interface: Model

  returns: the configuration for the neural network - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^BaseWrapperLayer this]
    (-> this (.conf))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: Model

  gradients - a 1 x nParams row vector that is a view of the larger (MLN/CG) gradients array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseWrapperLayer this ^org.nd4j.linalg.api.ndarray.INDArray gradients]
    (-> this (.setBackpropGradientsViewArray gradients))))

(defn num-params
  "Description copied from interface: Model

  backwards - `boolean`

  returns: the number of parameters for the model - `int`"
  (^Integer [^BaseWrapperLayer this ^Boolean backwards]
    (-> this (.numParams backwards)))
  (^Integer [^BaseWrapperLayer this]
    (-> this (.numParams))))

(defn set-index
  "Description copied from interface: Layer

  index - `int`"
  ([^BaseWrapperLayer this ^Integer index]
    (-> this (.setIndex index))))

(defn set-iteration-count
  "Description copied from interface: Layer

  iteration-count - `int`"
  ([^BaseWrapperLayer this ^Integer iteration-count]
    (-> this (.setIterationCount iteration-count))))

(defn input
  "Description copied from interface: Model

  returns: the input/feature matrix for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWrapperLayer this]
    (-> this (.input))))

(defn type
  "Description copied from interface: Layer

  returns: `org.deeplearning4j.nn.api.Layer$Type`"
  (^org.deeplearning4j.nn.api.Layer$Type [^BaseWrapperLayer this]
    (-> this (.type))))

(defn calc-l-1
  "Description copied from interface: Layer

  backprop-only-params - If true: calculate L1 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l1 regularization term for this layer. - `double`"
  (^Double [^BaseWrapperLayer this ^Boolean backprop-only-params]
    (-> this (.calcL1 backprop-only-params))))

(defn calc-l-2
  "Description copied from interface: Layer

  backprop-only-params - If true: calculate L2 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l2 regularization term for this layer. - `double`"
  (^Double [^BaseWrapperLayer this ^Boolean backprop-only-params]
    (-> this (.calcL2 backprop-only-params))))

(defn init
  "Description copied from interface: Model"
  ([^BaseWrapperLayer this]
    (-> this (.init))))

(defn get-mask-array
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWrapperLayer this]
    (-> this (.getMaskArray))))

(defn get-listeners
  "Description copied from interface: Layer

  returns: `java.util.Collection<org.deeplearning4j.optimize.api.TrainingListener>`"
  (^java.util.Collection [^BaseWrapperLayer this]
    (-> this (.getListeners))))

(defn clear
  "Description copied from interface: Model"
  ([^BaseWrapperLayer this]
    (-> this (.clear))))

(defn get-config
  "returns: Training configuration - `org.deeplearning4j.nn.api.TrainingConfig`"
  (^org.deeplearning4j.nn.api.TrainingConfig [^BaseWrapperLayer this]
    (-> this (.getConfig))))

(defn get-optimizer
  "Description copied from interface: Model

  returns: this models optimizer - `org.deeplearning4j.optimize.api.ConvexOptimizer`"
  (^org.deeplearning4j.optimize.api.ConvexOptimizer [^BaseWrapperLayer this]
    (-> this (.getOptimizer))))

(defn get-input-mini-batch-size
  "Description copied from interface: Layer

  returns: `int`"
  (^Integer [^BaseWrapperLayer this]
    (-> this (.getInputMiniBatchSize))))

(defn apply-constraints
  "Description copied from interface: Model

  iteration - `int`
  epoch - `int`"
  ([^BaseWrapperLayer this ^Integer iteration ^Integer epoch]
    (-> this (.applyConstraints iteration epoch))))

(defn gradient-and-score
  "Description copied from interface: Model

  returns: the gradient and score - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,java.lang.Double>`"
  (^org.nd4j.linalg.primitives.Pair [^BaseWrapperLayer this]
    (-> this (.gradientAndScore))))

(defn set-epoch-count
  "Description copied from interface: Layer

  epoch-count - `int`"
  ([^BaseWrapperLayer this ^Integer epoch-count]
    (-> this (.setEpochCount epoch-count))))

