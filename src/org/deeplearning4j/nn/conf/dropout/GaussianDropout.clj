(ns org.deeplearning4j.nn.conf.dropout.GaussianDropout
  "Gaussian dropout. This is a multiplicative Gaussian noise (mean 1) on the input activations.

 Each input activation x is independently set to:
 x <- x * y, where y ~ N(1, stdev = sqrt((1-rate)/rate))
 Dropout schedules (i.e., varying probability p as a function of iteration/epoch) are also supported.

 Note 1: As per all IDropout instances, GaussianDropout is applied at training time only - and is automatically not
 applied at test time (for evaluation, etc)
 Note 2: Frequently, dropout is not applied to (or, has higher retain probability for) input (first layer)
 layers. Dropout is also often not applied to output layers.

 See: \"Multiplicative Gaussian Noise\" in Srivastava et al. 2014: Dropout: A Simple Way to Prevent Neural Networks from
 Overfitting http://www.cs.toronto.edu/~rsalakhu/papers/srivastava14a.pdf"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.dropout GaussianDropout]))

(defn ->gaussian-dropout
  "Constructor.

  rate - Rate parameter, see GaussianDropout - `double`"
  (^GaussianDropout [^Double rate]
    (new GaussianDropout rate)))

(defn apply-dropout
  "input-activations - Input activations array - `org.nd4j.linalg.api.ndarray.INDArray`
  output - The result array (same as inputArray for in-place ops) for the post-dropout activations - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - Current iteration number - `int`
  epoch - Current epoch number - `int`
  workspace-mgr - Workspace manager, if any storage is required (use ArrayType.INPUT) - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The output (resultArray) after applying dropout - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GaussianDropout this ^org.nd4j.linalg.api.ndarray.INDArray input-activations ^org.nd4j.linalg.api.ndarray.INDArray output ^Integer iteration ^Integer epoch ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.applyDropout input-activations output iteration epoch workspace-mgr))))

(defn backprop
  "Description copied from interface: IDropout

  grad-at-output - Gradients at the output of the dropout op - i.e., dL/dOut - `org.nd4j.linalg.api.ndarray.INDArray`
  grad-at-input - Gradients at the input of the dropout op - i.e., dL/dIn. Use the same array as gradAtOutputto apply the backprop gradient in-place - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - Current iteration - `int`
  epoch - Current epoch - `int`

  returns: Same array as gradAtInput - i.e., gradient after backpropagating through dropout op - i.e., dL/dIn - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GaussianDropout this ^org.nd4j.linalg.api.ndarray.INDArray grad-at-output ^org.nd4j.linalg.api.ndarray.INDArray grad-at-input ^Integer iteration ^Integer epoch]
    (-> this (.backprop grad-at-output grad-at-input iteration epoch))))

(defn clear
  "Description copied from interface: IDropout"
  ([^GaussianDropout this]
    (-> this (.clear))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.dropout.GaussianDropout`"
  (^org.deeplearning4j.nn.conf.dropout.GaussianDropout [^GaussianDropout this]
    (-> this (.clone))))

