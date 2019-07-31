(ns org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling2D
  "Pooling2D operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution Pooling2D]))

(defn ->pooling-2-d
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  inputs - `org.nd4j.autodiff.samediff.SDVariable[]`
  array-inputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  array-outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling2DConfig`"
  (^Pooling2D [^org.nd4j.autodiff.samediff.SameDiff same-diff inputs array-inputs array-outputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling2DConfig config]
    (new Pooling2D same-diff inputs array-inputs array-outputs config))
  (^Pooling2D []
    (new Pooling2D )))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^Pooling2D this]
    (-> this (.propertiesForFunction))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Pooling2D this]
    (-> this (.opName))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^Pooling2D this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Pooling2D this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Pooling2D this]
    (-> this (.tensorflowName))))

(defn config-properties?
  "Description copied from class: DifferentialFunction

  returns: `boolean`"
  (^Boolean [^Pooling2D this]
    (-> this (.isConfigProperties))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Pooling2D this]
    (-> this (.onnxName))))

(defn i-args
  "returns: `long[]`"
  ([^Pooling2D this]
    (-> this (.iArgs))))

(defn set-value-for
  "Description copied from class: DifferentialFunction

  target - the target field - `java.lang.reflect.Field`
  value - the value to set - `java.lang.Object`"
  ([^Pooling2D this ^java.lang.reflect.Field target ^java.lang.Object value]
    (-> this (.setValueFor target value))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^Pooling2D this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn get-pooling-prefix
  "returns: `java.lang.String`"
  (^java.lang.String [^Pooling2D this]
    (-> this (.getPoolingPrefix))))

(defn config-field-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Pooling2D this]
    (-> this (.configFieldName))))

