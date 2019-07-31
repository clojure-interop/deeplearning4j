(ns org.deeplearning4j.nn.api.Layer
  "Interface for a layer of a neural network.
 This has an activation function, an input and output size,
 weights, and a bias"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.api Layer]))

(defn set-input
  "Set the layer input.

  input - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^Layer this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.setInput input workspace-mgr))))

(defn get-iteration-count
  "returns: The current iteration count (number of parameter updates) for the layer/network - `int`"
  (^Integer [^Layer this]
    (-> this (.getIterationCount))))

(defn get-epoch-count
  "returns: The current epoch count (number of training epochs passed) for the layer/network - `int`"
  (^Integer [^Layer this]
    (-> this (.getEpochCount))))

(defn set-cache-mode
  "This method sets given CacheMode for current layer

  mode - `org.deeplearning4j.nn.conf.CacheMode`"
  ([^Layer this ^org.deeplearning4j.nn.conf.CacheMode mode]
    (-> this (.setCacheMode mode))))

(defn get-helper
  "returns: Get the layer helper, if any - `org.deeplearning4j.nn.layers.LayerHelper`"
  (^org.deeplearning4j.nn.layers.LayerHelper [^Layer this]
    (-> this (.getHelper))))

(defn feed-forward-mask-array
  "Feed forward the input mask array, setting in in the layer as appropriate. This allows different layers to
  handle masks differently - for example, bidirectional RNNs and normal RNNs operate differently with masks (the
  former sets activations to 0 outside of the data present region (and keeps the mask active for future layers like
  dense layers), whereas normal RNNs don't zero out the activations/errors )instead relying on backpropagated error
  arrays to handle the variable length case.
  This is also used for example for networks that contain global pooling layers, arbitrary preprocessors, etc.

  mask-array - Mask array to set - `org.nd4j.linalg.api.ndarray.INDArray`
  current-mask-state - Current state of the mask - see MaskState - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - Current minibatch size. Needs to be known as it cannot always be inferred from the activationsarray due to reshaping (such as a DenseLayer within a recurrent neural network) - `int`

  returns: New mask array after this layer, along with the new mask state. - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^Layer this ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArray mask-array current-mask-state minibatch-size))))

(defn set-mask-array
  "Set the mask array. Note: In general, feedForwardMaskArray(INDArray, MaskState, int) should be used in
  preference to this.

  mask-array - Mask array to set - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Layer this ^org.nd4j.linalg.api.ndarray.INDArray mask-array]
    (-> this (.setMaskArray mask-array))))

(defn activate
  "Perform forward pass and return the activations array with the specified input

  input - the input to use - `org.nd4j.linalg.api.ndarray.INDArray`
  training - train or test mode - `boolean`
  mgr - Workspace manager. - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Activations array. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Layer this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr mgr]
    (-> this (.activate input training mgr)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Layer this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn get-index
  "Get the layer index.

  returns: `int`"
  (^Integer [^Layer this]
    (-> this (.getIndex))))

(defn allow-input-modification
  "A performance optimization: mark whether the layer is allowed to modify its input array in-place. In many cases,
  this is totally safe - in others, the input array will be shared by multiple layers, and hence it's not safe to
  modify the input array.
  This is usually used by ops such as dropout.

  allow - If true: the input array is safe to modify. If false: the input array should be copied before itis modified (i.e., in-place modifications are un-safe) - `boolean`"
  ([^Layer this ^Boolean allow]
    (-> this (.allowInputModification allow))))

(defn set-input-mini-batch-size
  "Set current/last input mini-batch size.
  Used for score and gradient calculations. Mini batch size may be different from
  getInput().size(0) due to reshaping operations - for example, when using RNNs with
  DenseLayer and OutputLayer. Called automatically during forward pass.

  size - `int`"
  ([^Layer this ^Integer size]
    (-> this (.setInputMiniBatchSize size))))

(defn pretrain-layer?
  "Returns true if the layer can be trained in an unsupervised/pretrain manner (AE, VAE, etc)

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^Layer this]
    (-> this (.isPretrainLayer))))

(defn clear-noise-weight-params
  ""
  ([^Layer this]
    (-> this (.clearNoiseWeightParams))))

(defn set-listeners
  "Set the iteration listeners for this layer.

  listeners - `org.deeplearning4j.optimize.api.TrainingListener`"
  ([^Layer this ^org.deeplearning4j.optimize.api.TrainingListener listeners]
    (-> this (.setListeners listeners))))

(defn backprop-gradient
  "Calculate the gradient relative to the error in the next layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^Layer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn set-index
  "Set the layer index.

  index - `int`"
  ([^Layer this ^Integer index]
    (-> this (.setIndex index))))

(defn set-iteration-count
  "Set the current iteration count (number of parameter updates) for the layer/network

  iteration-count - `int`"
  ([^Layer this ^Integer iteration-count]
    (-> this (.setIterationCount iteration-count))))

(defn type
  "Returns the layer type

  returns: `org.deeplearning4j.nn.api.Layer$Type`"
  (^org.deeplearning4j.nn.api.Layer$Type [^Layer this]
    (-> this (.type))))

(defn calc-l-1
  "Calculate the l1 regularization term
  0.0 if regularization is not used. Or l1Coeff * l1Magnitude otherwise.
  Note that this does not divide by mini-batch size

  backprop-only-params - If true: calculate L1 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l1 regularization term for this layer. - `double`"
  (^Double [^Layer this ^Boolean backprop-only-params]
    (-> this (.calcL1 backprop-only-params))))

(defn calc-l-2
  "Calculate the l2 regularization term
  0.0 if regularization is not used. Or 0.5 * l2Coeff * l2Magnitude otherwise.
  Note that this does not divide by mini-batch size

  backprop-only-params - If true: calculate L2 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l2 regularization term for this layer. - `double`"
  (^Double [^Layer this ^Boolean backprop-only-params]
    (-> this (.calcL2 backprop-only-params))))

(defn get-mask-array
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Layer this]
    (-> this (.getMaskArray))))

(defn get-listeners
  "Get the iteration listeners for this layer.

  returns: `java.util.Collection<org.deeplearning4j.optimize.api.TrainingListener>`"
  (^java.util.Collection [^Layer this]
    (-> this (.getListeners))))

(defn get-input-mini-batch-size
  "Get current/last input mini-batch size, as set by setInputMiniBatchSize(int)

  returns: `int`"
  (^Integer [^Layer this]
    (-> this (.getInputMiniBatchSize))))

(defn set-epoch-count
  "Set the current epoch count (number of epochs passed ) for the layer/network

  epoch-count - `int`"
  ([^Layer this ^Integer epoch-count]
    (-> this (.setEpochCount epoch-count))))

