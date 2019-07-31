(ns org.nd4j.linalg.api.ops.impl.shape.Unstack
  "Unstack op conversion"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape Unstack]))

(defn ->unstack
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  value - `org.nd4j.autodiff.samediff.SDVariable`
  axis - `int`
  num - `int`"
  (^Unstack [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable value ^Integer axis ^Integer num]
    (new Unstack same-diff value axis num))
  (^Unstack [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable value ^Integer axis]
    (new Unstack same-diff value axis))
  (^Unstack []
    (new Unstack )))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^Unstack this]
    (-> this (.propertiesForFunction))))

(defn add-args
  ""
  ([^Unstack this]
    (-> this (.addArgs))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Unstack this]
    (-> this (.opName))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^Unstack this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn tensorflow-names
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String[]`"
  ([^Unstack this]
    (-> this (.tensorflowNames))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Unstack this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn get-num-outputs
  "returns: `int`"
  (^Integer [^Unstack this]
    (-> this (.getNumOutputs))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Unstack this]
    (-> this (.tensorflowName))))

(defn mappings-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.PropertyMapping>>`"
  (^java.util.Map [^Unstack this]
    (-> this (.mappingsForFunction))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^Unstack this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

