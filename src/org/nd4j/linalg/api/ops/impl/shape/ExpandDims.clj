(ns org.nd4j.linalg.api.ops.impl.shape.ExpandDims
  "ExpandDims function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape ExpandDims]))

(defn ->expand-dims
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  axis - `int`"
  (^ExpandDims [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Integer axis]
    (new ExpandDims same-diff args axis))
  (^ExpandDims [^org.nd4j.autodiff.samediff.SameDiff same-diff args]
    (new ExpandDims same-diff args))
  (^ExpandDims []
    (new ExpandDims )))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^ExpandDims this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^ExpandDims this]
    (-> this (.propertiesForFunction))))

(defn mappings-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.PropertyMapping>>`"
  (^java.util.Map [^ExpandDims this]
    (-> this (.mappingsForFunction))))

(defn assert-valid-for-execution
  "Description copied from interface: CustomOp"
  ([^ExpandDims this]
    (-> this (.assertValidForExecution))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^ExpandDims this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ExpandDims this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ExpandDims this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ExpandDims this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

