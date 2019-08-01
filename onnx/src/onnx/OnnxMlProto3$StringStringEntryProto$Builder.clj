(ns onnx.OnnxMlProto3$StringStringEntryProto$Builder
  " StringStringEntryProto follows the pattern for cross-proto-version maps.
  See https://developers.google.com/protocol-buffers/docs/proto3#maps
 Protobuf type onnx.StringStringEntryProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$StringStringEntryProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$StringStringEntryProto$Builder/getDescriptor )))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$StringStringEntryProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `onnx.OnnxMlProto3$StringStringEntryProto`"
  (^onnx.OnnxMlProto3$StringStringEntryProto [^OnnxMlProto3$StringStringEntryProto$Builder this]
    (-> this (.buildPartial))))

(defn clear-key
  "string key = 1;

  returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$StringStringEntryProto$Builder this]
    (-> this (.clearKey))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$StringStringEntryProto$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$StringStringEntryProto`"
  (^onnx.OnnxMlProto3$StringStringEntryProto [^OnnxMlProto3$StringStringEntryProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$StringStringEntryProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$StringStringEntryProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-key
  "string key = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$StringStringEntryProto$Builder this]
    (-> this (.getKey))))

(defn clear-value
  "string value = 2;

  returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$StringStringEntryProto$Builder this]
    (-> this (.clearValue))))

(defn get-value
  "string value = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$StringStringEntryProto$Builder this]
    (-> this (.getValue))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$StringStringEntryProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$StringStringEntryProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn set-key-bytes
  "string key = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$StringStringEntryProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setKeyBytes value))))

(defn build
  "returns: `onnx.OnnxMlProto3$StringStringEntryProto`"
  (^onnx.OnnxMlProto3$StringStringEntryProto [^OnnxMlProto3$StringStringEntryProto$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$StringStringEntryProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$StringStringEntryProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn set-key
  "string key = 1;

  value - `java.lang.String`

  returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$StringStringEntryProto$Builder this ^java.lang.String value]
    (-> this (.setKey value))))

(defn set-value
  "string value = 2;

  value - `java.lang.String`

  returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$StringStringEntryProto$Builder this ^java.lang.String value]
    (-> this (.setValue value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$StringStringEntryProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn get-key-bytes
  "string key = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$StringStringEntryProto$Builder this]
    (-> this (.getKeyBytes))))

(defn clone
  "returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$StringStringEntryProto$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxMlProto3$StringStringEntryProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn set-value-bytes
  "string value = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$StringStringEntryProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setValueBytes value))))

(defn clear
  "returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$StringStringEntryProto$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$StringStringEntryProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-value-bytes
  "string value = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$StringStringEntryProto$Builder this]
    (-> this (.getValueBytes))))

