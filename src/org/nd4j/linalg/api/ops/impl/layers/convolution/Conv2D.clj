(ns org.nd4j.linalg.api.ops.impl.layers.convolution.Conv2D
  "Conv2D operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution Conv2D]))

(defn ->conv-2-d
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input-functions - `org.nd4j.autodiff.samediff.SDVariable[]`
  input-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig`"
  (^Conv2D [^org.nd4j.autodiff.samediff.SameDiff same-diff input-functions input-arrays outputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (new Conv2D same-diff input-functions input-arrays outputs config)))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^Conv2D this]
    (-> this (.propertiesForFunction))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Conv2D this]
    (-> this (.opName))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^Conv2D this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn tensorflow-names
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String[]`"
  ([^Conv2D this]
    (-> this (.tensorflowNames))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Conv2D this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn get-value
  "Description copied from class: DifferentialFunction

  property - the property to get - `java.lang.reflect.Field`

  returns: the value for the function if it exists - `java.lang.Object`"
  (^java.lang.Object [^Conv2D this ^java.lang.reflect.Field property]
    (-> this (.getValue property))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Conv2D this]
    (-> this (.tensorflowName))))

(defn mappings-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.PropertyMapping>>`"
  (^java.util.Map [^Conv2D this]
    (-> this (.mappingsForFunction))))

(defn config-properties?
  "Description copied from class: DifferentialFunction

  returns: `boolean`"
  (^Boolean [^Conv2D this]
    (-> this (.isConfigProperties))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Conv2D this]
    (-> this (.onnxName))))

(defn attribute-adapters-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.AttributeAdapter>>`"
  (^java.util.Map [^Conv2D this]
    (-> this (.attributeAdaptersForFunction))))

(defn i-args
  "returns: `long[]`"
  ([^Conv2D this]
    (-> this (.iArgs))))

(defn set-value-for
  "Description copied from class: DifferentialFunction

  target - the target field - `java.lang.reflect.Field`
  value - the value to set - `java.lang.Object`"
  ([^Conv2D this ^java.lang.reflect.Field target ^java.lang.Object value]
    (-> this (.setValueFor target value))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^Conv2D this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn config-field-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Conv2D this]
    (-> this (.configFieldName))))

