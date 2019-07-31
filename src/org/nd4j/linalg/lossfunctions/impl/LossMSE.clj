(ns org.nd4j.linalg.lossfunctions.impl.LossMSE
  "Mean Squared Error loss function: L = 1/N sum_i (actual_i - predicted)^2
 See also LossL2 for a mathematically similar loss function (LossL2 does not have division by N, where N is output size)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.lossfunctions.impl LossMSE]))

(defn ->loss-mse
  "Constructor.

  Mean Squared Error loss function where each the output is (optionally) weighted/scaled by a flags scalar value.
  Note that the weights array must be a row vector, of length equal to the labels/output dimension 1 size.
  A weight vector of 1s should give identical results to no weight vector.

  weights - Weights array (row vector). May be null. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^LossMSE [^org.nd4j.linalg.api.ndarray.INDArray weights]
    (new LossMSE weights))
  (^LossMSE []
    (new LossMSE )))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^LossMSE this]
    (-> this (.opType))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LossMSE this]
    (-> this (.opName))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^LossMSE this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn compute-score
  "Description copied from interface: ILossFunction

  labels - Label/expected preOutput - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-output - Output of the model (neural network) - `org.nd4j.linalg.api.ndarray.INDArray`
  activation-fn - Activation function that should be applied to preOutput - `org.nd4j.linalg.activations.IActivation`
  mask - Mask array; may be null - `org.nd4j.linalg.api.ndarray.INDArray`
  average - Whether the score should be averaged (divided by number of rows in labels/preOutput) or not @return Loss function value - `boolean`

  returns: `double`"
  (^Double [^LossMSE this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray pre-output ^org.nd4j.linalg.activations.IActivation activation-fn ^org.nd4j.linalg.api.ndarray.INDArray mask ^Boolean average]
    (-> this (.computeScore labels pre-output activation-fn mask average))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LossMSE this]
    (-> this (.toString))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^LossMSE this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn compute-gradient
  "Description copied from interface: ILossFunction

  labels - Label/expected output - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-output - Output of the model (neural network), before the activation function is applied - `org.nd4j.linalg.api.ndarray.INDArray`
  activation-fn - Activation function that should be applied to preOutput - `org.nd4j.linalg.activations.IActivation`
  mask - Mask array; may be null - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Gradient dL/dPreOut - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LossMSE this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray pre-output ^org.nd4j.linalg.activations.IActivation activation-fn ^org.nd4j.linalg.api.ndarray.INDArray mask]
    (-> this (.computeGradient labels pre-output activation-fn mask))))

(defn name
  "The opName of this function

  returns: `java.lang.String`"
  (^java.lang.String [^LossMSE this]
    (-> this (.name))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LossMSE this]
    (-> this (.tensorflowName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LossMSE this]
    (-> this (.onnxName))))

(defn compute-score-array
  "Description copied from interface: ILossFunction

  labels - Labels/expected output - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-output - Output of the model (neural network) - `org.nd4j.linalg.api.ndarray.INDArray`
  activation-fn - Activation function that should be applied to preOutput - `org.nd4j.linalg.activations.IActivation`
  mask - @return Loss function value for each example; column vector - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LossMSE this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray pre-output ^org.nd4j.linalg.activations.IActivation activation-fn ^org.nd4j.linalg.api.ndarray.INDArray mask]
    (-> this (.computeScoreArray labels pre-output activation-fn mask))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^LossMSE this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

