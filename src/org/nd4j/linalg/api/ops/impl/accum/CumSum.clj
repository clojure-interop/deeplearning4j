(ns org.nd4j.linalg.api.ops.impl.accum.CumSum
  "Cumulative sum operation, optionally along dimension."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum CumSum]))

(defn ->cum-sum
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  x - `org.nd4j.autodiff.samediff.SDVariable`
  exclusive - `boolean`
  reverse - `boolean`
  axis - `int`"
  (^CumSum [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable x ^Boolean exclusive ^Boolean reverse ^Integer axis]
    (new CumSum same-diff x exclusive reverse axis))
  (^CumSum [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable x ^Integer axis]
    (new CumSum same-diff x axis))
  (^CumSum []
    (new CumSum )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^CumSum this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^CumSum this]
    (-> this (.tensorflowName))))

(defn attribute-adapters-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.AttributeAdapter>>`"
  (^java.util.Map [^CumSum this]
    (-> this (.attributeAdaptersForFunction))))

(defn mappings-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.PropertyMapping>>`"
  (^java.util.Map [^CumSum this]
    (-> this (.mappingsForFunction))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^CumSum this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^CumSum this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  grad - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^CumSum this ^java.util.List grad]
    (-> this (.doDiff grad))))

