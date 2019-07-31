(ns org.deeplearning4j.nn.conf.dropout.Dropout
  "Implements standard (inverted) dropout.

 Regarding dropout probability. This is the probability of retaining each input activation value for a layer.
 Thus, each input activation x is independently set to:
 x <- 0, with probability 1-p
 x <- x/p with probability p
 Note that this \"inverted\" dropout scheme maintains the expected value of activations - i.e., E(x) is the same before
 and after dropout.
 Dropout schedules (i.e., varying probability p as a function of iteration/epoch) are also supported.

 Other libraries (notably, Keras) use p == probability(dropping an activation)
 In DL4J, new Dropout(x) will keep an input activation with probability x, and set to 0 with probability 1-x.
 Thus, a dropout value of 1.0 is functionally equivalent to no dropout: i.e., 100% probability of retaining
 each input activation.

 Note 1: As per all IDropout instances, dropout is applied at training time only - and is automatically not applied at
 test time (for evaluation, etc)
 Note 2: Care should be taken when setting lower (probability of retaining) values for (too much information may be
 lost with aggressive (very low) dropout values).
 Note 3: Frequently, dropout is not applied to (or, has higher retain probability for) input (first layer)
 layers. Dropout is also often not applied to output layers.
 Note 4: Implementation detail (most users can ignore): DL4J uses inverted dropout, as described here:
 http://cs231n.github.io/neural-networks-2/


 See: Srivastava et al. 2014: Dropout: A Simple Way to Prevent Neural Networks from Overfitting
 http://www.cs.toronto.edu/~rsalakhu/papers/srivastava14a.pdf"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.dropout Dropout]))

(defn ->dropout
  "Constructor.

  activation-retain-probability - Probability of retaining an activation - see Dropout javadoc - `double`"
  (^Dropout [^Double activation-retain-probability]
    (new Dropout activation-retain-probability)))

(defn apply-dropout
  "input-activations - Input activations array - `org.nd4j.linalg.api.ndarray.INDArray`
  output - The result array (same as inputArray for in-place ops) for the post-dropout activations - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - Current iteration number - `int`
  epoch - Current epoch number - `int`
  workspace-mgr - Workspace manager, if any storage is required (use ArrayType.INPUT) - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The output (resultArray) after applying dropout - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Dropout this ^org.nd4j.linalg.api.ndarray.INDArray input-activations ^org.nd4j.linalg.api.ndarray.INDArray output ^Integer iteration ^Integer epoch ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.applyDropout input-activations output iteration epoch workspace-mgr))))

(defn backprop
  "Description copied from interface: IDropout

  grad-at-output - Gradients at the output of the dropout op - i.e., dL/dOut - `org.nd4j.linalg.api.ndarray.INDArray`
  grad-at-input - Gradients at the input of the dropout op - i.e., dL/dIn. Use the same array as gradAtOutputto apply the backprop gradient in-place - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - Current iteration - `int`
  epoch - Current epoch - `int`

  returns: Same array as gradAtInput - i.e., gradient after backpropagating through dropout op - i.e., dL/dIn - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Dropout this ^org.nd4j.linalg.api.ndarray.INDArray grad-at-output ^org.nd4j.linalg.api.ndarray.INDArray grad-at-input ^Integer iteration ^Integer epoch]
    (-> this (.backprop grad-at-output grad-at-input iteration epoch))))

(defn clear
  "Description copied from interface: IDropout"
  ([^Dropout this]
    (-> this (.clear))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.dropout.Dropout`"
  (^org.deeplearning4j.nn.conf.dropout.Dropout [^Dropout this]
    (-> this (.clone))))

