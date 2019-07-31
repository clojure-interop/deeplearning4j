(ns org.deeplearning4j.nn.layers.BasePretrainNetwork
  "Baseline class for any Neural Network used
 as a layer in a deep network *"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers BasePretrainNetwork]))

(defn ->base-pretrain-network
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^BasePretrainNetwork [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray input]
    (new BasePretrainNetwork conf input))
  (^BasePretrainNetwork [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new BasePretrainNetwork conf)))

(defn get-corrupted-input
  "Corrupts the given input by doing a binomial sampling
  given the corruption level

  x - the input to corrupt - `org.nd4j.linalg.api.ndarray.INDArray`
  corruption-level - the corruption value - `double`

  returns: the binomial sampled corrupted input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BasePretrainNetwork this ^org.nd4j.linalg.api.ndarray.INDArray x ^Double corruption-level]
    (-> this (.getCorruptedInput x corruption-level))))

(defn param-table
  "Description copied from interface: Model

  backprop-params-only - If true, return backprop params only. If false: return all params (equivalent toparamsTable()) - `boolean`

  returns: Parameter table - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^BasePretrainNetwork this ^Boolean backprop-params-only]
    (-> this (.paramTable backprop-params-only))))

(defn params
  "Description copied from class: BaseLayer

  returns: the parameters of the neural network - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BasePretrainNetwork this]
    (-> this (.params))))

(defn sample-visible-given-hidden
  "Sample the visible distribution given the hidden

  h - the hidden to sample from - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the mean and sample - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^BasePretrainNetwork this ^org.nd4j.linalg.api.ndarray.INDArray h]
    (-> this (.sampleVisibleGivenHidden h))))

(defn set-params
  "Description copied from interface: Model

  params - the parameters for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BasePretrainNetwork this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParams params))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^BasePretrainNetwork this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn num-params
  "Description copied from interface: Model

  backwards - `boolean`

  returns: the number of parameters for the model - `int`"
  (^Integer [^BasePretrainNetwork this ^Boolean backwards]
    (-> this (.numParams backwards)))
  (^Integer [^BasePretrainNetwork this]
    (-> this (.numParams))))

(defn calc-l-1
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L1 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l1 regularization term for this layer. - `double`"
  (^Double [^BasePretrainNetwork this ^Boolean backprop-params-only]
    (-> this (.calcL1 backprop-params-only))))

(defn calc-l-2
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L2 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l2 regularization term for this layer. - `double`"
  (^Double [^BasePretrainNetwork this ^Boolean backprop-params-only]
    (-> this (.calcL2 backprop-params-only))))

(defn sample-hidden-given-visible
  "Sample the hidden distribution given the visible

  v - the visible to sample from - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the hidden mean and sample - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^BasePretrainNetwork this ^org.nd4j.linalg.api.ndarray.INDArray v]
    (-> this (.sampleHiddenGivenVisible v))))

