(ns onnx.OnnxProto3$TensorShapeProto$Dimension
  "Protobuf type onnx.TensorShapeProto.Dimension"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$TensorShapeProto$Dimension]))

(def *-dim-value-field-number
  "Static Constant.

  type: int"
  OnnxProto3$TensorShapeProto$Dimension/DIM_VALUE_FIELD_NUMBER)

(def *-dim-param-field-number
  "Static Constant.

  type: int"
  OnnxProto3$TensorShapeProto$Dimension/DIM_PARAM_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxProto3$TensorShapeProto$Dimension/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$TensorShapeProto$Dimension`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxProto3$TensorShapeProto$Dimension [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$TensorShapeProto$Dimension/parseFrom data extension-registry))
  (^onnx.OnnxProto3$TensorShapeProto$Dimension [^java.nio.ByteBuffer data]
    (OnnxProto3$TensorShapeProto$Dimension/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$TensorShapeProto$Dimension`

  throws: java.io.IOException"
  (^onnx.OnnxProto3$TensorShapeProto$Dimension [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$TensorShapeProto$Dimension/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxProto3$TensorShapeProto$Dimension [^java.io.InputStream input]
    (OnnxProto3$TensorShapeProto$Dimension/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxProto3$TensorShapeProto$Dimension`

  returns: `onnx.OnnxProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxProto3$TensorShapeProto$Dimension$Builder [^onnx.OnnxProto3$TensorShapeProto$Dimension prototype]
    (OnnxProto3$TensorShapeProto$Dimension/newBuilder prototype))
  (^onnx.OnnxProto3$TensorShapeProto$Dimension$Builder []
    (OnnxProto3$TensorShapeProto$Dimension/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxProto3$TensorShapeProto$Dimension`"
  (^onnx.OnnxProto3$TensorShapeProto$Dimension []
    (OnnxProto3$TensorShapeProto$Dimension/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$TensorShapeProto$Dimension>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxProto3$TensorShapeProto$Dimension/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxProto3$TensorShapeProto$Dimension this]
    (-> this (.getUnknownFields))))

(defn get-dim-value
  "int64 dim_value = 1;

  returns: `long`"
  (^Long [^OnnxProto3$TensorShapeProto$Dimension this]
    (-> this (.getDimValue))))

(defn get-dim-param-bytes
  "namespace Shape
  string dim_param = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$TensorShapeProto$Dimension this]
    (-> this (.getDimParamBytes))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxProto3$TensorShapeProto$Dimension this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxProto3$TensorShapeProto$Dimension`"
  (^onnx.OnnxProto3$TensorShapeProto$Dimension [^OnnxProto3$TensorShapeProto$Dimension this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxProto3$TensorShapeProto$Dimension this]
    (-> this (.getSerializedSize))))

(defn get-dim-param
  "namespace Shape
  string dim_param = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$TensorShapeProto$Dimension this]
    (-> this (.getDimParam))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxProto3$TensorShapeProto$Dimension this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-value-case
  "returns: `onnx.OnnxProto3$TensorShapeProto$Dimension$ValueCase`"
  (^onnx.OnnxProto3$TensorShapeProto$Dimension$ValueCase [^OnnxProto3$TensorShapeProto$Dimension this]
    (-> this (.getValueCase))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxProto3$TensorShapeProto$Dimension this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$TensorShapeProto$Dimension>`"
  (^com.github.os72.protobuf351.Parser [^OnnxProto3$TensorShapeProto$Dimension this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxProto3$TensorShapeProto$Dimension this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxProto3$TensorShapeProto$Dimension$Builder [^OnnxProto3$TensorShapeProto$Dimension this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `onnx.OnnxProto3$TensorShapeProto$Dimension$Builder`"
  (^onnx.OnnxProto3$TensorShapeProto$Dimension$Builder [^OnnxProto3$TensorShapeProto$Dimension this]
    (-> this (.toBuilder))))

