(ns org.nd4j.linalg.api.ops.impl.layers.convolution.MaxPooling2D
  "Max Pooling2D operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution MaxPooling2D]))

(defn ->max-pooling-2-d
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input - `org.nd4j.autodiff.samediff.SDVariable`
  array-input - `org.nd4j.linalg.api.ndarray.INDArray`
  array-output - `org.nd4j.linalg.api.ndarray.INDArray`
  config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling2DConfig`"
  (^MaxPooling2D [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ndarray.INDArray array-input ^org.nd4j.linalg.api.ndarray.INDArray array-output ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling2DConfig config]
    (new MaxPooling2D same-diff input array-input array-output config))
  (^MaxPooling2D []
    (new MaxPooling2D )))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^MaxPooling2D this]
    (-> this (.propertiesForFunction))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^MaxPooling2D this]
    (-> this (.opName))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^MaxPooling2D this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^MaxPooling2D this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^MaxPooling2D this]
    (-> this (.tensorflowName))))

(defn mappings-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.nd4j.imports.descriptors.properties.PropertyMapping>>`"
  (^java.util.Map [^MaxPooling2D this]
    (-> this (.mappingsForFunction))))

(defn config-properties?
  "Description copied from class: DifferentialFunction

  returns: `boolean`"
  (^Boolean [^MaxPooling2D this]
    (-> this (.isConfigProperties))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^MaxPooling2D this]
    (-> this (.onnxName))))

(defn set-value-for
  "Description copied from class: DifferentialFunction

  target - the target field - `java.lang.reflect.Field`
  value - the value to set - `java.lang.Object`"
  ([^MaxPooling2D this ^java.lang.reflect.Field target ^java.lang.Object value]
    (-> this (.setValueFor target value))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^MaxPooling2D this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn get-pooling-prefix
  "returns: `java.lang.String`"
  (^java.lang.String [^MaxPooling2D this]
    (-> this (.getPoolingPrefix))))

(defn config-field-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^MaxPooling2D this]
    (-> this (.configFieldName))))

