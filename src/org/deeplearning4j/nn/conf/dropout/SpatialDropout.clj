(ns org.deeplearning4j.nn.conf.dropout.SpatialDropout
  "Spatial dropout: can only be applied to 4D (convolutional) activations.
 Dropout mask is generated along the depth dimension, and is applied to each x/y location in an image.
 Note that the dropout mask is generated independently for each example: i.e., a dropout mask of shape [minibatch, channels]
 is generated and applied to activations of shape [minibatch, channels, height, width]

 Reference: Efficient Object Localization Using Convolutional Networks: https://arxiv.org/abs/1411.4280"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.dropout SpatialDropout]))

(defn ->spatial-dropout
  "Constructor.

  activation-retain-probability - Probability of retaining an activation - see Dropout javadoc - `double`"
  (^SpatialDropout [^Double activation-retain-probability]
    (new SpatialDropout activation-retain-probability)))

(defn apply-dropout
  "input-activations - Input activations array - `org.nd4j.linalg.api.ndarray.INDArray`
  output - The result array (same as inputArray for in-place ops) for the post-dropout activations - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - Current iteration number - `int`
  epoch - Current epoch number - `int`
  workspace-mgr - Workspace manager, if any storage is required (use ArrayType.INPUT) - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The output (resultArray) after applying dropout - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SpatialDropout this ^org.nd4j.linalg.api.ndarray.INDArray input-activations ^org.nd4j.linalg.api.ndarray.INDArray output ^Integer iteration ^Integer epoch ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.applyDropout input-activations output iteration epoch workspace-mgr))))

(defn backprop
  "Description copied from interface: IDropout

  grad-at-output - Gradients at the output of the dropout op - i.e., dL/dOut - `org.nd4j.linalg.api.ndarray.INDArray`
  grad-at-input - Gradients at the input of the dropout op - i.e., dL/dIn. Use the same array as gradAtOutputto apply the backprop gradient in-place - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - Current iteration - `int`
  epoch - Current epoch - `int`

  returns: Same array as gradAtInput - i.e., gradient after backpropagating through dropout op - i.e., dL/dIn - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SpatialDropout this ^org.nd4j.linalg.api.ndarray.INDArray grad-at-output ^org.nd4j.linalg.api.ndarray.INDArray grad-at-input ^Integer iteration ^Integer epoch]
    (-> this (.backprop grad-at-output grad-at-input iteration epoch))))

(defn clear
  "Description copied from interface: IDropout"
  ([^SpatialDropout this]
    (-> this (.clear))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.dropout.IDropout`"
  (^org.deeplearning4j.nn.conf.dropout.IDropout [^SpatialDropout this]
    (-> this (.clone))))

