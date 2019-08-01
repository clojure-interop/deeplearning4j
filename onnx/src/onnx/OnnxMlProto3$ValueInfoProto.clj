(ns onnx.OnnxMlProto3$ValueInfoProto
  " Defines information on value, including the name, the type, and
  the shape of the value.
 Protobuf type onnx.ValueInfoProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$ValueInfoProto]))

(def *-name-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$ValueInfoProto/NAME_FIELD_NUMBER)

(def *-type-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$ValueInfoProto/TYPE_FIELD_NUMBER)

(def *-doc-string-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$ValueInfoProto/DOC_STRING_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$ValueInfoProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$ValueInfoProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxMlProto3$ValueInfoProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxMlProto3$ValueInfoProto/parseFrom data extension-registry))
  (^onnx.OnnxMlProto3$ValueInfoProto [^java.nio.ByteBuffer data]
    (OnnxMlProto3$ValueInfoProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$ValueInfoProto`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$ValueInfoProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxMlProto3$ValueInfoProto/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxMlProto3$ValueInfoProto [^java.io.InputStream input]
    (OnnxMlProto3$ValueInfoProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxMlProto3$ValueInfoProto`

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^onnx.OnnxMlProto3$ValueInfoProto prototype]
    (OnnxMlProto3$ValueInfoProto/newBuilder prototype))
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder []
    (OnnxMlProto3$ValueInfoProto/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxMlProto3$ValueInfoProto`"
  (^onnx.OnnxMlProto3$ValueInfoProto []
    (OnnxMlProto3$ValueInfoProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxMlProto3$ValueInfoProto>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxMlProto3$ValueInfoProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxMlProto3$ValueInfoProto this]
    (-> this (.getUnknownFields))))

(defn get-type
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  returns: `onnx.OnnxMlProto3$TypeProto`"
  (^onnx.OnnxMlProto3$TypeProto [^OnnxMlProto3$ValueInfoProto this]
    (-> this (.getType))))

(defn get-type-or-builder
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  returns: `onnx.OnnxMlProto3$TypeProtoOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProtoOrBuilder [^OnnxMlProto3$ValueInfoProto this]
    (-> this (.getTypeOrBuilder))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$ValueInfoProto this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$ValueInfoProto`"
  (^onnx.OnnxMlProto3$ValueInfoProto [^OnnxMlProto3$ValueInfoProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-doc-string-bytes
  "A human-readable documentation for this value. Markdown is allowed.
  string doc_string = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$ValueInfoProto this]
    (-> this (.getDocStringBytes))))

(defn get-name-bytes
  "This field MUST be present in this version of the IR.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$ValueInfoProto this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxMlProto3$ValueInfoProto this]
    (-> this (.getSerializedSize))))

(defn get-doc-string
  "A human-readable documentation for this value. Markdown is allowed.
  string doc_string = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$ValueInfoProto this]
    (-> this (.getDocString))))

(defn has-type?
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$ValueInfoProto this]
    (-> this (.hasType))))

(defn get-name
  "This field MUST be present in this version of the IR.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$ValueInfoProto this]
    (-> this (.getName))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxMlProto3$ValueInfoProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxMlProto3$ValueInfoProto this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxMlProto3$ValueInfoProto>`"
  (^com.github.os72.protobuf351.Parser [^OnnxMlProto3$ValueInfoProto this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$ValueInfoProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto this]
    (-> this (.toBuilder))))

