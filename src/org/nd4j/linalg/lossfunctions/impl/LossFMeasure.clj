(ns org.nd4j.linalg.lossfunctions.impl.LossFMeasure
  "F–measure loss function is a loss function design for training on imbalanced datasets.
 Essentially, this loss function is a continuous approximation of the F_Beta evaluation measure, of which F_1 is
 a special case.

 Note: this implementation differs from that described in the original paper by Pastor-Pellicer et al. in
 one important way: instead of maximizing the F-measure loss function as presented there (equations 2/3), we minimize
 1.0 - FMeasure. Consequently, a score of 0 is the minimum possible value (optimal predictions) and a score of 1.0 is
 the maximum possible value.

 This implementation supports 2 types of operation:
 - Binary: single output/label (Typically sigmoid activation function)
 - Binary: 2-output/label (softmax activation function  1-hot labels)
 Note that the beta value can be configured via the constructor.

 The following situations are NOT currently supported, may be added in the future:
 - Multi-label (multiple independent binary outputs)
 - Multiclass (via micro or macro averaging)

 Reference: Pastor-Pellicer et al. (2013), F-Measure as the Error Function to Train Neural Networks,

 https://link.springer.com/chapter/10.1007/978-3-642-38679-4_37"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.lossfunctions.impl LossFMeasure]))

(defn ->loss-f-measure
  "Constructor.

  beta - `double`"
  (^LossFMeasure [^Double beta]
    (new LossFMeasure beta))
  (^LossFMeasure []
    (new LossFMeasure )))

(def *-default-beta
  "Static Constant.

  type: double"
  LossFMeasure/DEFAULT_BETA)

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^LossFMeasure this]
    (-> this (.opType))))

(defn compute-gradient-and-score
  "Description copied from interface: ILossFunction

  labels - Label/expected output - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-output - Output of the model (neural network) - `org.nd4j.linalg.api.ndarray.INDArray`
  activation-fn - Activation function that should be applied to preOutput - `org.nd4j.linalg.activations.IActivation`
  mask - Mask array; may be null - `org.nd4j.linalg.api.ndarray.INDArray`
  average - Whether the score should be averaged (divided by number of rows in labels/output) or not - `boolean`

  returns: The score (loss function value) and gradient - `org.nd4j.linalg.primitives.Pair<java.lang.Double,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^LossFMeasure this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray pre-output ^org.nd4j.linalg.activations.IActivation activation-fn ^org.nd4j.linalg.api.ndarray.INDArray mask ^Boolean average]
    (-> this (.computeGradientAndScore labels pre-output activation-fn mask average))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LossFMeasure this]
    (-> this (.opName))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^LossFMeasure this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn compute-score
  "Description copied from interface: ILossFunction

  labels - Label/expected preOutput - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-output - Output of the model (neural network) - `org.nd4j.linalg.api.ndarray.INDArray`
  activation-fn - Activation function that should be applied to preOutput - `org.nd4j.linalg.activations.IActivation`
  mask - Mask array; may be null - `org.nd4j.linalg.api.ndarray.INDArray`
  average - Whether the score should be averaged (divided by number of rows in labels/preOutput) or not @return Loss function value - `boolean`

  returns: `double`"
  (^Double [^LossFMeasure this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray pre-output ^org.nd4j.linalg.activations.IActivation activation-fn ^org.nd4j.linalg.api.ndarray.INDArray mask ^Boolean average]
    (-> this (.computeScore labels pre-output activation-fn mask average))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LossFMeasure this]
    (-> this (.toString))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^LossFMeasure this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn compute-gradient
  "Description copied from interface: ILossFunction

  labels - Label/expected output - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-output - Output of the model (neural network), before the activation function is applied - `org.nd4j.linalg.api.ndarray.INDArray`
  activation-fn - Activation function that should be applied to preOutput - `org.nd4j.linalg.activations.IActivation`
  mask - Mask array; may be null - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Gradient dL/dPreOut - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LossFMeasure this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray pre-output ^org.nd4j.linalg.activations.IActivation activation-fn ^org.nd4j.linalg.api.ndarray.INDArray mask]
    (-> this (.computeGradient labels pre-output activation-fn mask))))

(defn name
  "The opName of this function

  returns: `java.lang.String`"
  (^java.lang.String [^LossFMeasure this]
    (-> this (.name))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LossFMeasure this]
    (-> this (.tensorflowName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LossFMeasure this]
    (-> this (.onnxName))))

(defn output-variables
  "Description copied from class: DifferentialFunction

  base-name - `java.lang.String`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^LossFMeasure this ^java.lang.String base-name]
    (-> this (.outputVariables base-name)))
  ([^LossFMeasure this]
    (-> this (.outputVariables))))

(defn compute-score-array
  "Description copied from interface: ILossFunction

  labels - Labels/expected output - `org.nd4j.linalg.api.ndarray.INDArray`
  pre-output - Output of the model (neural network) - `org.nd4j.linalg.api.ndarray.INDArray`
  activation-fn - Activation function that should be applied to preOutput - `org.nd4j.linalg.activations.IActivation`
  mask - @return Loss function value for each example; column vector - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LossFMeasure this ^org.nd4j.linalg.api.ndarray.INDArray labels ^org.nd4j.linalg.api.ndarray.INDArray pre-output ^org.nd4j.linalg.activations.IActivation activation-fn ^org.nd4j.linalg.api.ndarray.INDArray mask]
    (-> this (.computeScoreArray labels pre-output activation-fn mask))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^LossFMeasure this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

