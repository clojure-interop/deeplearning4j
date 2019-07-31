(ns org.deeplearning4j.nn.layers.BaseLayer
  "A layer with parameters"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers BaseLayer]))

(defn ->base-layer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^BaseLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray input]
    (new BaseLayer conf input))
  (^BaseLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new BaseLayer conf)))

(defn score
  "Objective function: the specified objective

  returns: the score for the objective - `double`"
  (^Double [^BaseLayer this]
    (-> this (.score))))

(defn param-table
  "Description copied from interface: Model

  backprop-params-only - If true, return backprop params only. If false: return all params (equivalent toparamsTable()) - `boolean`

  returns: Parameter table - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^BaseLayer this ^Boolean backprop-params-only]
    (-> this (.paramTable backprop-params-only)))
  (^java.util.Map [^BaseLayer this]
    (-> this (.paramTable))))

(defn fit
  "Description copied from interface: Model

  input - the data to fit the model to - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^BaseLayer this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.fit input workspace-mgr)))
  ([^BaseLayer this]
    (-> this (.fit))))

(defn set-param
  "Description copied from interface: Model

  key - the key to se t - `java.lang.String`
  val - the new ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLayer this ^java.lang.String key ^org.nd4j.linalg.api.ndarray.INDArray val]
    (-> this (.setParam key val))))

(defn gradient
  "Description copied from interface: Model

  returns: the gradient for this model, as calculated before - `org.deeplearning4j.nn.gradient.Gradient`"
  (^org.deeplearning4j.nn.gradient.Gradient [^BaseLayer this]
    (-> this (.gradient))))

(defn params
  "Returns the parameters of the neural network as a flattened row vector

  returns: the parameters of the neural network - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseLayer this]
    (-> this (.params))))

(defn compute-gradient-and-score
  "Description copied from interface: Model

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^BaseLayer this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeGradientAndScore workspace-mgr))))

(defn activate
  "Description copied from interface: Layer

  training - training or test mode - `boolean`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the activation (layer output) of the last specified input. Note that the returned array should be placed
  in the ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseLayer this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn layer-conf
  "returns: `LayerConfT`"
  ([^BaseLayer this]
    (-> this (.layerConf))))

(defn get-param
  "Description copied from interface: Model

  param - the key of the parameter - `java.lang.String`

  returns: the parameter vector/matrix with that particular key - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseLayer this ^java.lang.String param]
    (-> this (.getParam param))))

(defn get-gradients-view-array
  "returns: 1D gradients view array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseLayer this]
    (-> this (.getGradientsViewArray))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseLayer this]
    (-> this (.toString))))

(defn set-params-view-array
  "Description copied from interface: Model

  params - a 1 x nParams row vector that is a view of the larger (MLN/CG) parameters array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLayer this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParamsViewArray params))))

(defn update
  "Description copied from interface: Model

  gradient - the gradient to apply - `org.nd4j.linalg.api.ndarray.INDArray`
  param-type - `java.lang.String`"
  ([^BaseLayer this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^java.lang.String param-type]
    (-> this (.update gradient param-type)))
  ([^BaseLayer this ^org.deeplearning4j.nn.gradient.Gradient gradient]
    (-> this (.update gradient))))

(defn has-bias?
  "Does this layer have no bias term? Many layers (dense, convolutional, output, embedding) have biases by
  default, but no-bias versions are possible via configuration

  returns: True if a bias term is present, false otherwise - `boolean`"
  (^Boolean [^BaseLayer this]
    (-> this (.hasBias))))

(defn set-param-table
  "Description copied from interface: Model

  param-table - `java.util.Map`"
  ([^BaseLayer this ^java.util.Map param-table]
    (-> this (.setParamTable param-table))))

(defn clear-noise-weight-params
  ""
  ([^BaseLayer this]
    (-> this (.clearNoiseWeightParams))))

(defn set-params
  "Description copied from interface: Model

  params - the parameters for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLayer this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParams params))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^BaseLayer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: Model

  gradients - a 1 x nParams row vector that is a view of the larger (MLN/CG) gradients array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLayer this ^org.nd4j.linalg.api.ndarray.INDArray gradients]
    (-> this (.setBackpropGradientsViewArray gradients))))

(defn num-params
  "The number of parameters for the model

  returns: the number of parameters for the model - `int`"
  (^Integer [^BaseLayer this]
    (-> this (.numParams))))

(defn calc-l-1
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L1 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l1 regularization term for this layer. - `double`"
  (^Double [^BaseLayer this ^Boolean backprop-params-only]
    (-> this (.calcL1 backprop-params-only))))

(defn calc-l-2
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L2 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l2 regularization term for this layer. - `double`"
  (^Double [^BaseLayer this ^Boolean backprop-params-only]
    (-> this (.calcL2 backprop-params-only))))

(defn clone
  "returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^BaseLayer this]
    (-> this (.clone))))

(defn clear
  "Description copied from interface: Model"
  ([^BaseLayer this]
    (-> this (.clear))))

(defn get-optimizer
  "Description copied from interface: Model

  returns: this models optimizer - `org.deeplearning4j.optimize.api.ConvexOptimizer`"
  (^org.deeplearning4j.optimize.api.ConvexOptimizer [^BaseLayer this]
    (-> this (.getOptimizer))))

