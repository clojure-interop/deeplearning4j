(ns org.nd4j.linalg.api.ops.impl.shape.OneHot
  "Created by susaneraly on 3/14/18."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape OneHot]))

(defn ->one-hot
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  indices - `org.nd4j.autodiff.samediff.SDVariable`
  depth - `int`
  axis - `int`
  on - `double`
  off - `double`"
  (^OneHot [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable indices ^Integer depth ^Integer axis ^Double on ^Double off]
    (new OneHot same-diff indices depth axis on off))
  (^OneHot [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable indices ^Integer depth]
    (new OneHot same-diff indices depth))
  (^OneHot []
    (new OneHot )))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^OneHot this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn mappings-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.PropertyMapping>>`"
  (^java.util.Map [^OneHot this]
    (-> this (.mappingsForFunction))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^OneHot this]
    (-> this (.tensorflowName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^OneHot this]
    (-> this (.onnxName))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^OneHot this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^OneHot this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

