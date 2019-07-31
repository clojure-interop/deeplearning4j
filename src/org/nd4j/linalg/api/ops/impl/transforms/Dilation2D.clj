(ns org.nd4j.linalg.api.ops.impl.transforms.Dilation2D
  "Dilation2D op wrapper"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms Dilation2D]))

(defn ->dilation-2-d
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input-and-weights - `org.nd4j.autodiff.samediff.SDVariable[]`
  strides - `int[]`
  rates - `int[]`
  is-same-mode - `boolean`
  in-place - `boolean`"
  (^Dilation2D [^org.nd4j.autodiff.samediff.SameDiff same-diff input-and-weights strides rates ^Boolean is-same-mode ^Boolean in-place]
    (new Dilation2D same-diff input-and-weights strides rates is-same-mode in-place))
  (^Dilation2D [input-arrays outputs]
    (new Dilation2D input-arrays outputs))
  (^Dilation2D []
    (new Dilation2D )))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^Dilation2D this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn mappings-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.PropertyMapping>>`"
  (^java.util.Map [^Dilation2D this]
    (-> this (.mappingsForFunction))))

(defn attribute-adapters-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.AttributeAdapter>>`"
  (^java.util.Map [^Dilation2D this]
    (-> this (.attributeAdaptersForFunction))))

(defn config-properties?
  "Description copied from class: DifferentialFunction

  returns: `boolean`"
  (^Boolean [^Dilation2D this]
    (-> this (.isConfigProperties))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Dilation2D this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Dilation2D this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Dilation2D this]
    (-> this (.tensorflowName))))

