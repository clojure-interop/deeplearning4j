(ns org.deeplearning4j.nn.layers.pooling.GlobalPoolingLayer
  "Global pooling layer - used to do pooling over time for RNNs, and 2d pooling for CNNs.
 Supports the following PoolingTypes: SUM, AVG, MAX, PNORM
 Global pooling layer can also handle mask arrays when dealing with variable length inputs.
 mask arrays are assumed to be 2d, and are fed forward through the network during
 training or post-training forward pass:
 - Time series (RNNs, 1d CNNs): mask arrays are shape [miniBatchSize, maxTimeSeriesLength] and contain values 0 or 1 only
 - CNNs (2d): mask have shape [miniBatchSize, 1, height, 1] or [miniBatchSize, 1, 1, width] or [minibatch, 1, height, width].
 When used activations of shape [minibatch, channels, height, width] the size 1 dimensions are broadcast along the input

 Behaviour with default settings:
 - 3d (time series) input with shape [miniBatchSize, vectorSize, timeSeriesLength] -> 2d output [miniBatchSize, vectorSize]
 - 4d (CNN) input with shape [miniBatchSize, channels, height, width] -> 2d output [miniBatchSize, channels]
 - 5d (CNN3D) input with shape [miniBatchSize, channels, depth, height, width] -> 2d output [miniBatchSize, channels]

 Alternatively, by setting collapseDimensions = false in the configuration, it is possible to retain the reduced dimensions
 as 1s: this gives
 - [miniBatchSize, vectorSize, 1] for RNN output,
 - [miniBatchSize, channels, 1, 1] for CNN output, and
 - [miniBatchSize, channels, 1, 1, 1] for CNN3D output."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.pooling GlobalPoolingLayer]))

(defn ->global-pooling-layer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^GlobalPoolingLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new GlobalPoolingLayer conf)))

(defn feed-forward-mask-array
  "Description copied from interface: Layer

  mask-array - Mask array to set - `org.nd4j.linalg.api.ndarray.INDArray`
  current-mask-state - Current state of the mask - see MaskState - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - Current minibatch size. Needs to be known as it cannot always be inferred from the activationsarray due to reshaping (such as a DenseLayer within a recurrent neural network) - `int`

  returns: New mask array after this layer, along with the new mask state. - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^GlobalPoolingLayer this ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArray mask-array current-mask-state minibatch-size))))

(defn activate
  "Description copied from interface: Layer

  training - training or test mode - `boolean`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the activation (layer output) of the last specified input. Note that the returned array should be placed
  in the ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GlobalPoolingLayer this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^GlobalPoolingLayer this]
    (-> this (.isPretrainLayer))))

(defn clear-noise-weight-params
  ""
  ([^GlobalPoolingLayer this]
    (-> this (.clearNoiseWeightParams))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^GlobalPoolingLayer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn type
  "Description copied from interface: Layer

  returns: `org.deeplearning4j.nn.api.Layer$Type`"
  (^org.deeplearning4j.nn.api.Layer$Type [^GlobalPoolingLayer this]
    (-> this (.type))))

(defn calc-l-1
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L1 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l1 regularization term for this layer. - `double`"
  (^Double [^GlobalPoolingLayer this ^Boolean backprop-params-only]
    (-> this (.calcL1 backprop-params-only))))

(defn calc-l-2
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L2 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l2 regularization term for this layer. - `double`"
  (^Double [^GlobalPoolingLayer this ^Boolean backprop-params-only]
    (-> this (.calcL2 backprop-params-only))))

(defn clone
  "returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^GlobalPoolingLayer this]
    (-> this (.clone))))

