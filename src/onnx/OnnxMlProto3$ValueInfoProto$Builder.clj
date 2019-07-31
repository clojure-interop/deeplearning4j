(ns onnx.OnnxMlProto3$ValueInfoProto$Builder
  " Defines information on value, including the name, the type, and
  the shape of the value.
 Protobuf type onnx.ValueInfoProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$ValueInfoProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$ValueInfoProto$Builder/getDescriptor )))

(defn clear-doc-string
  "A human-readable documentation for this value. Markdown is allowed.
  string doc_string = 3;

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.clearDocString))))

(defn clear-name
  "This field MUST be present in this version of the IR.
  string name = 1;

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.clearName))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `onnx.OnnxMlProto3$ValueInfoProto`"
  (^onnx.OnnxMlProto3$ValueInfoProto [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.buildPartial))))

(defn set-doc-string
  "A human-readable documentation for this value. Markdown is allowed.
  string doc_string = 3;

  value - `java.lang.String`

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this ^java.lang.String value]
    (-> this (.setDocString value))))

(defn get-type
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  returns: `onnx.OnnxMlProto3$TypeProto`"
  (^onnx.OnnxMlProto3$TypeProto [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.getType))))

(defn get-type-or-builder
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  returns: `onnx.OnnxMlProto3$TypeProtoOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProtoOrBuilder [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.getTypeOrBuilder))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$ValueInfoProto`"
  (^onnx.OnnxMlProto3$ValueInfoProto [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-doc-string-bytes
  "A human-readable documentation for this value. Markdown is allowed.
  string doc_string = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.getDocStringBytes))))

(defn merge-type
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  value - `onnx.OnnxMlProto3$TypeProto`

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this ^onnx.OnnxMlProto3$TypeProto value]
    (-> this (.mergeType value))))

(defn set-type
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  value - `onnx.OnnxMlProto3$TypeProto`

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this ^onnx.OnnxMlProto3$TypeProto value]
    (-> this (.setType value))))

(defn set-doc-string-bytes
  "A human-readable documentation for this value. Markdown is allowed.
  string doc_string = 3;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDocStringBytes value))))

(defn get-name-bytes
  "This field MUST be present in this version of the IR.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.getNameBytes))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-name
  "This field MUST be present in this version of the IR.
  string name = 1;

  value - `java.lang.String`

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn get-doc-string
  "A human-readable documentation for this value. Markdown is allowed.
  string doc_string = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.getDocString))))

(defn has-type?
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.hasType))))

(defn get-name
  "This field MUST be present in this version of the IR.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-type-builder
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  returns: `onnx.OnnxMlProto3$TypeProto$Builder`"
  (^onnx.OnnxMlProto3$TypeProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.getTypeBuilder))))

(defn set-name-bytes
  "This field MUST be present in this version of the IR.
  string name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `onnx.OnnxMlProto3$ValueInfoProto`"
  (^onnx.OnnxMlProto3$ValueInfoProto [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-type
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.clearType))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxMlProto3$ValueInfoProto$Builder [^OnnxMlProto3$ValueInfoProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

