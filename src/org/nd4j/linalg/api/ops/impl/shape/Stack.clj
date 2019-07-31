(ns org.nd4j.linalg.api.ops.impl.shape.Stack
  "Stack operation. Stacks n input tensors along provided axis."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape Stack]))

(defn ->stack
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  values - `org.nd4j.autodiff.samediff.SDVariable[]`
  axis - `int`"
  (^Stack [^org.nd4j.autodiff.samediff.SameDiff same-diff values ^Integer axis]
    (new Stack same-diff values axis))
  (^Stack []
    (new Stack )))

(defn add-args
  ""
  ([^Stack this]
    (-> this (.addArgs))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Stack this]
    (-> this (.opName))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^Stack this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn tensorflow-names
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String[]`"
  ([^Stack this]
    (-> this (.tensorflowNames))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Stack this]
    (-> this (.toString))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Stack this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Stack this]
    (-> this (.tensorflowName))))

(defn mappings-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.PropertyMapping>>`"
  (^java.util.Map [^Stack this]
    (-> this (.mappingsForFunction))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Stack this]
    (-> this (.onnxName))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^Stack this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

