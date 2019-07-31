(ns org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling3D
  "Pooling3D operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution Pooling3D]))

(defn ->pooling-3-d
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  inputs - `org.nd4j.autodiff.samediff.SDVariable[]`
  input-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  in-place - `boolean`
  pooling-3-d-config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling3DConfig`
  type - `org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling3D$Pooling3DType`"
  (^Pooling3D [^org.nd4j.autodiff.samediff.SameDiff same-diff inputs input-arrays outputs ^Boolean in-place ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling3DConfig pooling-3-d-config ^org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling3D$Pooling3DType type]
    (new Pooling3D same-diff inputs input-arrays outputs in-place pooling-3-d-config type))
  (^Pooling3D []
    (new Pooling3D )))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^Pooling3D this]
    (-> this (.propertiesForFunction))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Pooling3D this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Pooling3D this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Pooling3D this]
    (-> this (.tensorflowName))))

(defn config-properties?
  "Description copied from class: DifferentialFunction

  returns: `boolean`"
  (^Boolean [^Pooling3D this]
    (-> this (.isConfigProperties))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Pooling3D this]
    (-> this (.onnxName))))

(defn i-args
  "returns: `long[]`"
  ([^Pooling3D this]
    (-> this (.iArgs))))

(defn set-value-for
  "Description copied from class: DifferentialFunction

  target - the target field - `java.lang.reflect.Field`
  value - the value to set - `java.lang.Object`"
  ([^Pooling3D this ^java.lang.reflect.Field target ^java.lang.Object value]
    (-> this (.setValueFor target value))))

(defn get-pooling-prefix
  "returns: `java.lang.String`"
  (^java.lang.String [^Pooling3D this]
    (-> this (.getPoolingPrefix))))

(defn config-field-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Pooling3D this]
    (-> this (.configFieldName))))

