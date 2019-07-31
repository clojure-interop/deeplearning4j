(ns org.nd4j.linalg.api.ops.impl.layers.convolution.DeConv2DTF
  "DeConv2D operation, TF-wrapper"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution DeConv2DTF]))

(defn ->de-conv-2-dtf
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  inputs - `org.nd4j.autodiff.samediff.SDVariable[]`
  input-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.DeConv2DConfig`"
  (^DeConv2DTF [^org.nd4j.autodiff.samediff.SameDiff same-diff inputs input-arrays outputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.DeConv2DConfig config]
    (new DeConv2DTF same-diff inputs input-arrays outputs config)))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^DeConv2DTF this]
    (-> this (.propertiesForFunction))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^DeConv2DTF this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DeConv2DTF this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn get-value
  "Description copied from class: DifferentialFunction

  property - the property to get - `java.lang.reflect.Field`

  returns: the value for the function if it exists - `java.lang.Object`"
  (^java.lang.Object [^DeConv2DTF this ^java.lang.reflect.Field property]
    (-> this (.getValue property))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DeConv2DTF this]
    (-> this (.tensorflowName))))

(defn mappings-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.PropertyMapping>>`"
  (^java.util.Map [^DeConv2DTF this]
    (-> this (.mappingsForFunction))))

(defn config-properties?
  "Description copied from class: DifferentialFunction

  returns: `boolean`"
  (^Boolean [^DeConv2DTF this]
    (-> this (.isConfigProperties))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DeConv2DTF this]
    (-> this (.onnxName))))

(defn attribute-adapters-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.AttributeAdapter>>`"
  (^java.util.Map [^DeConv2DTF this]
    (-> this (.attributeAdaptersForFunction))))

(defn i-args
  "returns: `long[]`"
  ([^DeConv2DTF this]
    (-> this (.iArgs))))

(defn set-value-for
  "Description copied from class: DifferentialFunction

  target - the target field - `java.lang.reflect.Field`
  value - the value to set - `java.lang.Object`"
  ([^DeConv2DTF this ^java.lang.reflect.Field target ^java.lang.Object value]
    (-> this (.setValueFor target value))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^DeConv2DTF this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn config-field-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DeConv2DTF this]
    (-> this (.configFieldName))))

