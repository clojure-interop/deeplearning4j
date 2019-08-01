(ns onnx.OnnxProto3$ValueInfoProto
  " Defines information on value, including the name, the type, and
  the shape of the value.
 Protobuf type onnx.ValueInfoProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$ValueInfoProto]))

(def *-name-field-number
  "Static Constant.

  type: int"
  OnnxProto3$ValueInfoProto/NAME_FIELD_NUMBER)

(def *-type-field-number
  "Static Constant.

  type: int"
  OnnxProto3$ValueInfoProto/TYPE_FIELD_NUMBER)

(def *-doc-string-field-number
  "Static Constant.

  type: int"
  OnnxProto3$ValueInfoProto/DOC_STRING_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxProto3$ValueInfoProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$ValueInfoProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxProto3$ValueInfoProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$ValueInfoProto/parseFrom data extension-registry))
  (^onnx.OnnxProto3$ValueInfoProto [^java.nio.ByteBuffer data]
    (OnnxProto3$ValueInfoProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$ValueInfoProto`

  throws: java.io.IOException"
  (^onnx.OnnxProto3$ValueInfoProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$ValueInfoProto/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxProto3$ValueInfoProto [^java.io.InputStream input]
    (OnnxProto3$ValueInfoProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxProto3$ValueInfoProto`

  returns: `onnx.OnnxProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxProto3$ValueInfoProto$Builder [^onnx.OnnxProto3$ValueInfoProto prototype]
    (OnnxProto3$ValueInfoProto/newBuilder prototype))
  (^onnx.OnnxProto3$ValueInfoProto$Builder []
    (OnnxProto3$ValueInfoProto/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxProto3$ValueInfoProto`"
  (^onnx.OnnxProto3$ValueInfoProto []
    (OnnxProto3$ValueInfoProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$ValueInfoProto>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxProto3$ValueInfoProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxProto3$ValueInfoProto this]
    (-> this (.getUnknownFields))))

(defn get-type
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  returns: `onnx.OnnxProto3$TypeProto`"
  (^onnx.OnnxProto3$TypeProto [^OnnxProto3$ValueInfoProto this]
    (-> this (.getType))))

(defn get-type-or-builder
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  returns: `onnx.OnnxProto3$TypeProtoOrBuilder`"
  (^onnx.OnnxProto3$TypeProtoOrBuilder [^OnnxProto3$ValueInfoProto this]
    (-> this (.getTypeOrBuilder))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxProto3$ValueInfoProto this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxProto3$ValueInfoProto`"
  (^onnx.OnnxProto3$ValueInfoProto [^OnnxProto3$ValueInfoProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-doc-string-bytes
  "A human-readable documentation for this value. Markdown is allowed.
  string doc_string = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$ValueInfoProto this]
    (-> this (.getDocStringBytes))))

(defn get-name-bytes
  "This field MUST be present in this version of the IR.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$ValueInfoProto this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxProto3$ValueInfoProto this]
    (-> this (.getSerializedSize))))

(defn get-doc-string
  "A human-readable documentation for this value. Markdown is allowed.
  string doc_string = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$ValueInfoProto this]
    (-> this (.getDocString))))

(defn has-type?
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  returns: `boolean`"
  (^Boolean [^OnnxProto3$ValueInfoProto this]
    (-> this (.hasType))))

(defn get-name
  "This field MUST be present in this version of the IR.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$ValueInfoProto this]
    (-> this (.getName))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxProto3$ValueInfoProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxProto3$ValueInfoProto this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$ValueInfoProto>`"
  (^com.github.os72.protobuf351.Parser [^OnnxProto3$ValueInfoProto this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxProto3$ValueInfoProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxProto3$ValueInfoProto$Builder [^OnnxProto3$ValueInfoProto this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `onnx.OnnxProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxProto3$ValueInfoProto$Builder [^OnnxProto3$ValueInfoProto this]
    (-> this (.toBuilder))))

