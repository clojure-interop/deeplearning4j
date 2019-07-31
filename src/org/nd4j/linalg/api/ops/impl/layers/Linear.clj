(ns org.nd4j.linalg.api.ops.impl.layers.Linear
  "Linear:
 a * bT"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers Linear]))

(defn ->linear
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  n-in - `int`
  n-out - `int`
  weight-init-scheme - `org.nd4j.weightinit.WeightInitScheme`
  bias-weight-init-scheme - `org.nd4j.weightinit.WeightInitScheme`"
  (^Linear [^org.nd4j.autodiff.samediff.SameDiff same-diff ^Integer n-in ^Integer n-out ^org.nd4j.weightinit.WeightInitScheme weight-init-scheme ^org.nd4j.weightinit.WeightInitScheme bias-weight-init-scheme]
    (new Linear same-diff n-in n-out weight-init-scheme bias-weight-init-scheme))
  (^Linear [^Integer n-in ^Integer n-out ^org.nd4j.weightinit.WeightInitScheme weight-init-scheme ^org.nd4j.weightinit.WeightInitScheme bias-weight-init-scheme]
    (new Linear n-in n-out weight-init-scheme bias-weight-init-scheme)))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^Linear this]
    (-> this (.calculateOutputShape))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Linear this]
    (-> this (.opName))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^Linear this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Linear this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn exec
  "inputs - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Linear this ^org.nd4j.linalg.api.ndarray.INDArray inputs]
    (-> this (.exec inputs))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Linear this]
    (-> this (.tensorflowName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Linear this]
    (-> this (.onnxName))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^Linear this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn exec-same-diff
  "input - `org.nd4j.autodiff.samediff.SDVariable`"
  ([^Linear this ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.execSameDiff input))))

