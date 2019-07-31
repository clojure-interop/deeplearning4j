(ns org.nd4j.linalg.api.ops.impl.transforms.dtype.Cast
  "Cast op wrapper. This op changes data type of input array."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.dtype Cast]))

(defn ->cast
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  arg - `org.nd4j.autodiff.samediff.SDVariable`
  dst - `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^Cast [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable arg ^org.nd4j.linalg.api.buffer.DataBuffer$Type dst]
    (new Cast same-diff arg dst))
  (^Cast []
    (new Cast )))

(defn set-value-for
  "Description copied from class: DifferentialFunction

  target - the target field - `java.lang.reflect.Field`
  value - the value to set - `java.lang.Object`"
  ([^Cast this ^java.lang.reflect.Field target ^java.lang.Object value]
    (-> this (.setValueFor target value))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^Cast this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn attribute-adapters-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.AttributeAdapter>>`"
  (^java.util.Map [^Cast this]
    (-> this (.attributeAdaptersForFunction))))

(defn mappings-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.PropertyMapping>>`"
  (^java.util.Map [^Cast this]
    (-> this (.mappingsForFunction))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Cast this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Cast this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Cast this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

