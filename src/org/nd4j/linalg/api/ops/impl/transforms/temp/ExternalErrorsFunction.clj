(ns org.nd4j.linalg.api.ops.impl.transforms.temp.ExternalErrorsFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.temp ExternalErrorsFunction]))

(defn ->external-errors-function
  "Constructor.

  sd - `org.nd4j.autodiff.samediff.SameDiff`
  inputs - `java.util.List`
  gradients - `java.util.Map`"
  (^ExternalErrorsFunction [^org.nd4j.autodiff.samediff.SameDiff sd ^java.util.List inputs ^java.util.Map gradients]
    (new ExternalErrorsFunction sd inputs gradients))
  (^ExternalErrorsFunction []
    (new ExternalErrorsFunction )))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^ExternalErrorsFunction this]
    (-> this (.calculateOutputShape))))

(defn update-before-execution
  ""
  ([^ExternalErrorsFunction this]
    (-> this (.updateBeforeExecution))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ExternalErrorsFunction this]
    (-> this (.opName))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^ExternalErrorsFunction this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ExternalErrorsFunction this]
    (-> this (.toString))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ExternalErrorsFunction this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ExternalErrorsFunction this]
    (-> this (.tensorflowName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ExternalErrorsFunction this]
    (-> this (.onnxName))))

(defn output-variables
  "Description copied from class: DifferentialFunction

  base-name - `java.lang.String`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^ExternalErrorsFunction this ^java.lang.String base-name]
    (-> this (.outputVariables base-name))))

(defn update-variable
  "str - `java.lang.String`
  gradient - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ExternalErrorsFunction this ^java.lang.String str ^org.nd4j.linalg.api.ndarray.INDArray gradient]
    (-> this (.updateVariable str gradient))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^ExternalErrorsFunction this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

