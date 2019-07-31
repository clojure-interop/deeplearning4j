(ns onnx.OnnxMlProto3$TypeProto$Map
  " map<K,V>
 Protobuf type onnx.TypeProto.Map"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TypeProto$Map]))

(def *-key-type-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TypeProto$Map/KEY_TYPE_FIELD_NUMBER)

(def *-value-type-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TypeProto$Map/VALUE_TYPE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$TypeProto$Map/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$TypeProto$Map`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxMlProto3$TypeProto$Map [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxMlProto3$TypeProto$Map/parseFrom data extension-registry))
  (^onnx.OnnxMlProto3$TypeProto$Map [^java.nio.ByteBuffer data]
    (OnnxMlProto3$TypeProto$Map/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$TypeProto$Map`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$TypeProto$Map [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxMlProto3$TypeProto$Map/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxMlProto3$TypeProto$Map [^java.io.InputStream input]
    (OnnxMlProto3$TypeProto$Map/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxMlProto3$TypeProto$Map`

  returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^onnx.OnnxMlProto3$TypeProto$Map prototype]
    (OnnxMlProto3$TypeProto$Map/newBuilder prototype))
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder []
    (OnnxMlProto3$TypeProto$Map/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxMlProto3$TypeProto$Map`"
  (^onnx.OnnxMlProto3$TypeProto$Map []
    (OnnxMlProto3$TypeProto$Map/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxMlProto3$TypeProto$Map>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxMlProto3$TypeProto$Map/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxMlProto3$TypeProto$Map this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto$Map this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$TypeProto$Map`"
  (^onnx.OnnxMlProto3$TypeProto$Map [^OnnxMlProto3$TypeProto$Map this]
    (-> this (.getDefaultInstanceForType))))

(defn has-value-type?
  "This field MUST be present for this version of the IR.
  .onnx.TypeProto value_type = 2;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto$Map this]
    (-> this (.hasValueType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxMlProto3$TypeProto$Map this]
    (-> this (.getSerializedSize))))

(defn get-key-type
  "This field MUST be present for this version of the IR.
   This field MUST refer to an integral type ([U]INT{8|16|32|64}) or STRING
  .onnx.TensorProto.DataType key_type = 1;

  returns: `onnx.OnnxMlProto3$TensorProto$DataType`"
  (^onnx.OnnxMlProto3$TensorProto$DataType [^OnnxMlProto3$TypeProto$Map this]
    (-> this (.getKeyType))))

(defn get-value-type-or-builder
  "This field MUST be present for this version of the IR.
  .onnx.TypeProto value_type = 2;

  returns: `onnx.OnnxMlProto3$TypeProtoOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProtoOrBuilder [^OnnxMlProto3$TypeProto$Map this]
    (-> this (.getValueTypeOrBuilder))))

(defn get-value-type
  "This field MUST be present for this version of the IR.
  .onnx.TypeProto value_type = 2;

  returns: `onnx.OnnxMlProto3$TypeProto`"
  (^onnx.OnnxMlProto3$TypeProto [^OnnxMlProto3$TypeProto$Map this]
    (-> this (.getValueType))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxMlProto3$TypeProto$Map this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxMlProto3$TypeProto$Map this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxMlProto3$TypeProto$Map>`"
  (^com.github.os72.protobuf351.Parser [^OnnxMlProto3$TypeProto$Map this]
    (-> this (.getParserForType))))

(defn get-key-type-value
  "This field MUST be present for this version of the IR.
   This field MUST refer to an integral type ([U]INT{8|16|32|64}) or STRING
  .onnx.TensorProto.DataType key_type = 1;

  returns: `int`"
  (^Integer [^OnnxMlProto3$TypeProto$Map this]
    (-> this (.getKeyTypeValue))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TypeProto$Map this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `onnx.OnnxMlProto3$TypeProto$Map$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Map$Builder [^OnnxMlProto3$TypeProto$Map this]
    (-> this (.toBuilder))))

