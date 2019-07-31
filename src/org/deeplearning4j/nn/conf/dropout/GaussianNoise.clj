(ns org.deeplearning4j.nn.conf.dropout.GaussianNoise
  "Applies additive, mean-zero Gaussian noise to the input - i.e., x = x  N(0,stddev).
 Note that this differs from GaussianDropout, which applies multiplicative mean-1 N(1,s) noise.
 Note also that schedules for the standard deviation value can also be used."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.dropout GaussianNoise]))

(defn ->gaussian-noise
  "Constructor.

  stddev - Standard deviation for the mean 0 Gaussian noise - `double`"
  (^GaussianNoise [^Double stddev]
    (new GaussianNoise stddev)))

(defn apply-dropout
  "input-activations - Input activations array - `org.nd4j.linalg.api.ndarray.INDArray`
  output - The result array (same as inputArray for in-place ops) for the post-dropout activations - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - Current iteration number - `int`
  epoch - Current epoch number - `int`
  workspace-mgr - Workspace manager, if any storage is required (use ArrayType.INPUT) - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The output (resultArray) after applying dropout - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GaussianNoise this ^org.nd4j.linalg.api.ndarray.INDArray input-activations ^org.nd4j.linalg.api.ndarray.INDArray output ^Integer iteration ^Integer epoch ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.applyDropout input-activations output iteration epoch workspace-mgr))))

(defn backprop
  "Description copied from interface: IDropout

  grad-at-output - Gradients at the output of the dropout op - i.e., dL/dOut - `org.nd4j.linalg.api.ndarray.INDArray`
  grad-at-input - Gradients at the input of the dropout op - i.e., dL/dIn. Use the same array as gradAtOutputto apply the backprop gradient in-place - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - Current iteration - `int`
  epoch - Current epoch - `int`

  returns: Same array as gradAtInput - i.e., gradient after backpropagating through dropout op - i.e., dL/dIn - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GaussianNoise this ^org.nd4j.linalg.api.ndarray.INDArray grad-at-output ^org.nd4j.linalg.api.ndarray.INDArray grad-at-input ^Integer iteration ^Integer epoch]
    (-> this (.backprop grad-at-output grad-at-input iteration epoch))))

(defn clear
  "Description copied from interface: IDropout"
  ([^GaussianNoise this]
    (-> this (.clear))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.dropout.IDropout`"
  (^org.deeplearning4j.nn.conf.dropout.IDropout [^GaussianNoise this]
    (-> this (.clone))))

