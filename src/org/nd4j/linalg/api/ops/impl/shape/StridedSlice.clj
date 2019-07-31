(ns org.nd4j.linalg.api.ops.impl.shape.StridedSlice
  "Strided Slice function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape StridedSlice]))

(defn ->strided-slice
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  in - `org.nd4j.autodiff.samediff.SDVariable`
  begin - `long[]`
  end - `long[]`
  strides - `long[]`
  begin-mask - `int`
  end-mask - `int`
  ellipsis-mask - `int`
  new-axis-mask - `int`
  shrink-axis-mask - `int`"
  (^StridedSlice [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable in begin end strides ^Integer begin-mask ^Integer end-mask ^Integer ellipsis-mask ^Integer new-axis-mask ^Integer shrink-axis-mask]
    (new StridedSlice same-diff in begin end strides begin-mask end-mask ellipsis-mask new-axis-mask shrink-axis-mask))
  (^StridedSlice [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable in begin end strides]
    (new StridedSlice same-diff in begin end strides))
  (^StridedSlice []
    (new StridedSlice )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^StridedSlice this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^StridedSlice this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^StridedSlice this]
    (-> this (.tensorflowName))))

(defn assert-valid-for-execution
  "Description copied from interface: CustomOp"
  ([^StridedSlice this]
    (-> this (.assertValidForExecution))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^StridedSlice this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn mappings-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.PropertyMapping>>`"
  (^java.util.Map [^StridedSlice this]
    (-> this (.mappingsForFunction))))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^StridedSlice this]
    (-> this (.propertiesForFunction))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^StridedSlice this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

