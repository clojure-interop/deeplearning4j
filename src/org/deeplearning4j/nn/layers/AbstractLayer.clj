(ns org.deeplearning4j.nn.layers.AbstractLayer
  "A layer with input and output, no parameters or gradients"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers AbstractLayer]))

(defn ->abstract-layer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^AbstractLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray input]
    (new AbstractLayer conf input))
  (^AbstractLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new AbstractLayer conf)))

(defn set-input
  "Description copied from interface: Layer

  input - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^AbstractLayer this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.setInput input workspace-mgr))))

(defn score
  "Description copied from interface: Model

  returns: the score for the model - `double`"
  (^Double [^AbstractLayer this]
    (-> this (.score))))

(defn param-table
  "Description copied from interface: Model

  backprop-params-only - If true, return backprop params only. If false: return all params (equivalent toparamsTable()) - `boolean`

  returns: Parameter table - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^AbstractLayer this ^Boolean backprop-params-only]
    (-> this (.paramTable backprop-params-only)))
  (^java.util.Map [^AbstractLayer this]
    (-> this (.paramTable))))

(defn fit
  "Description copied from interface: Model

  input - the data to fit the model to - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^AbstractLayer this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.fit input workspace-mgr)))
  ([^AbstractLayer this]
    (-> this (.fit))))

(defn set-param
  "Description copied from interface: Model

  key - the key to se t - `java.lang.String`
  val - the new ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AbstractLayer this ^java.lang.String key ^org.nd4j.linalg.api.ndarray.INDArray val]
    (-> this (.setParam key val))))

(defn get-epoch-count
  "returns: The current epoch count (number of training epochs passed) for the layer/network - `int`"
  (^Integer [^AbstractLayer this]
    (-> this (.getEpochCount))))

(defn set-cache-mode
  "Description copied from interface: Layer

  mode - `org.deeplearning4j.nn.conf.CacheMode`"
  ([^AbstractLayer this ^org.deeplearning4j.nn.conf.CacheMode mode]
    (-> this (.setCacheMode mode))))

(defn gradient
  "Description copied from interface: Model

  returns: the gradient for this model, as calculated before - `org.deeplearning4j.nn.gradient.Gradient`"
  (^org.deeplearning4j.nn.gradient.Gradient [^AbstractLayer this]
    (-> this (.gradient))))

(defn set-conf
  "Description copied from interface: Model

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  ([^AbstractLayer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (-> this (.setConf conf))))

(defn get-helper
  "returns: Get the layer helper, if any - `org.deeplearning4j.nn.layers.LayerHelper`"
  (^org.deeplearning4j.nn.layers.LayerHelper [^AbstractLayer this]
    (-> this (.getHelper))))

(defn params
  "Returns the parameters of the neural network as a flattened row vector

  returns: the parameters of the neural network - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AbstractLayer this]
    (-> this (.params))))

(defn compute-gradient-and-score
  "Description copied from interface: Model

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^AbstractLayer this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeGradientAndScore workspace-mgr))))

(defn feed-forward-mask-array
  "Description copied from interface: Layer

  mask-array - Mask array to set - `org.nd4j.linalg.api.ndarray.INDArray`
  current-mask-state - Current state of the mask - see MaskState - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - Current minibatch size. Needs to be known as it cannot always be inferred from the activationsarray due to reshaping (such as a DenseLayer within a recurrent neural network) - `int`

  returns: New mask array after this layer, along with the new mask state. - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^AbstractLayer this ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArray mask-array current-mask-state minibatch-size))))

(defn set-mask-array
  "Description copied from interface: Layer

  mask-array - Mask array to set - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AbstractLayer this ^org.nd4j.linalg.api.ndarray.INDArray mask-array]
    (-> this (.setMaskArray mask-array))))

(defn activate
  "Description copied from interface: Layer

  input - the input to use - `org.nd4j.linalg.api.ndarray.INDArray`
  training - train or test mode - `boolean`
  workspace-mgr - Workspace manager. - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Activations array. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AbstractLayer this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate input training workspace-mgr))))

(defn get-index
  "Description copied from interface: Layer

  returns: `int`"
  (^Integer [^AbstractLayer this]
    (-> this (.getIndex))))

(defn allow-input-modification
  "Description copied from interface: Layer

  allow - If true: the input array is safe to modify. If false: the input array should be copied before itis modified (i.e., in-place modifications are un-safe) - `boolean`"
  ([^AbstractLayer this ^Boolean allow]
    (-> this (.allowInputModification allow))))

(defn add-listeners
  "This method ADDS additional TrainingListener to existing listeners

  listeners - `org.deeplearning4j.optimize.api.TrainingListener`"
  ([^AbstractLayer this ^org.deeplearning4j.optimize.api.TrainingListener listeners]
    (-> this (.addListeners listeners))))

(defn get-param
  "Description copied from interface: Model

  param - the key of the parameter - `java.lang.String`

  returns: the parameter vector/matrix with that particular key - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AbstractLayer this ^java.lang.String param]
    (-> this (.getParam param))))

(defn get-gradients-view-array
  "returns: 1D gradients view array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AbstractLayer this]
    (-> this (.getGradientsViewArray))))

(defn batch-size
  "Description copied from interface: Model

  returns: the current inputs batch size - `int`"
  (^Integer [^AbstractLayer this]
    (-> this (.batchSize))))

(defn set-params-view-array
  "Description copied from interface: Model

  params - a 1 x nParams row vector that is a view of the larger (MLN/CG) parameters array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AbstractLayer this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParamsViewArray params))))

(defn update
  "Description copied from interface: Model

  gradient - the gradient to apply - `org.nd4j.linalg.api.ndarray.INDArray`
  param-type - `java.lang.String`"
  ([^AbstractLayer this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^java.lang.String param-type]
    (-> this (.update gradient param-type)))
  ([^AbstractLayer this ^org.deeplearning4j.nn.gradient.Gradient gradient]
    (-> this (.update gradient))))

(defn assert-input-set
  "backprop - `boolean`"
  ([^AbstractLayer this ^Boolean backprop]
    (-> this (.assertInputSet backprop))))

(defn get-input
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AbstractLayer this]
    (-> this (.getInput))))

(defn set-param-table
  "Description copied from interface: Model

  param-table - `java.util.Map`"
  ([^AbstractLayer this ^java.util.Map param-table]
    (-> this (.setParamTable param-table))))

(defn set-input-mini-batch-size
  "Description copied from interface: Layer

  size - `int`"
  ([^AbstractLayer this ^Integer size]
    (-> this (.setInputMiniBatchSize size))))

(defn set-params
  "Description copied from interface: Model

  params - the parameters for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AbstractLayer this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParams params))))

(defn set-listeners
  "Description copied from interface: Layer

  listeners - `java.util.Collection`"
  ([^AbstractLayer this ^java.util.Collection listeners]
    (-> this (.setListeners listeners))))

(defn conf
  "Description copied from interface: Model

  returns: the configuration for the neural network - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^AbstractLayer this]
    (-> this (.conf))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: Model

  gradients - a 1 x nParams row vector that is a view of the larger (MLN/CG) gradients array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AbstractLayer this ^org.nd4j.linalg.api.ndarray.INDArray gradients]
    (-> this (.setBackpropGradientsViewArray gradients))))

(defn num-params
  "Description copied from interface: Model

  backwards - `boolean`

  returns: the number of parameters for the model - `int`"
  (^Integer [^AbstractLayer this ^Boolean backwards]
    (-> this (.numParams backwards)))
  (^Integer [^AbstractLayer this]
    (-> this (.numParams))))

(defn set-index
  "Description copied from interface: Layer

  index - `int`"
  ([^AbstractLayer this ^Integer index]
    (-> this (.setIndex index))))

(defn input
  "Description copied from interface: Model

  returns: the input/feature matrix for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AbstractLayer this]
    (-> this (.input))))

(defn type
  "Description copied from interface: Layer

  returns: `org.deeplearning4j.nn.api.Layer$Type`"
  (^org.deeplearning4j.nn.api.Layer$Type [^AbstractLayer this]
    (-> this (.type))))

(defn calc-l-1
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L1 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l1 regularization term for this layer. - `double`"
  (^Double [^AbstractLayer this ^Boolean backprop-params-only]
    (-> this (.calcL1 backprop-params-only))))

(defn calc-l-2
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L2 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l2 regularization term for this layer. - `double`"
  (^Double [^AbstractLayer this ^Boolean backprop-params-only]
    (-> this (.calcL2 backprop-params-only))))

(defn init
  "Init the model"
  ([^AbstractLayer this]
    (-> this (.init))))

(defn get-mask-array
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AbstractLayer this]
    (-> this (.getMaskArray))))

(defn get-listeners
  "Description copied from interface: Layer

  returns: `java.util.Collection<org.deeplearning4j.optimize.api.TrainingListener>`"
  (^java.util.Collection [^AbstractLayer this]
    (-> this (.getListeners))))

(defn clear
  "Description copied from interface: Model"
  ([^AbstractLayer this]
    (-> this (.clear))))

(defn get-config
  "returns: Training configuration - `org.deeplearning4j.nn.api.TrainingConfig`"
  (^org.deeplearning4j.nn.api.TrainingConfig [^AbstractLayer this]
    (-> this (.getConfig))))

(defn get-optimizer
  "Description copied from interface: Model

  returns: this models optimizer - `org.deeplearning4j.optimize.api.ConvexOptimizer`"
  (^org.deeplearning4j.optimize.api.ConvexOptimizer [^AbstractLayer this]
    (-> this (.getOptimizer))))

(defn get-input-mini-batch-size
  "Description copied from interface: Layer

  returns: `int`"
  (^Integer [^AbstractLayer this]
    (-> this (.getInputMiniBatchSize))))

(defn apply-constraints
  "Description copied from interface: Model

  iteration - `int`
  epoch - `int`"
  ([^AbstractLayer this ^Integer iteration ^Integer epoch]
    (-> this (.applyConstraints iteration epoch))))

(defn gradient-and-score
  "Description copied from interface: Model

  returns: the gradient and score - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,java.lang.Double>`"
  (^org.nd4j.linalg.primitives.Pair [^AbstractLayer this]
    (-> this (.gradientAndScore))))

(defn set-epoch-count
  "Description copied from interface: Layer

  epoch-count - `int`"
  ([^AbstractLayer this ^Integer epoch-count]
    (-> this (.setEpochCount epoch-count))))

