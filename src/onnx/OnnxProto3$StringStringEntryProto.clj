(ns onnx.OnnxProto3$StringStringEntryProto
  " StringStringEntryProto follows the pattern for cross-proto-version maps.
  See https://developers.google.com/protocol-buffers/docs/proto3#maps
 Protobuf type onnx.StringStringEntryProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$StringStringEntryProto]))

(def *-key-field-number
  "Static Constant.

  type: int"
  OnnxProto3$StringStringEntryProto/KEY_FIELD_NUMBER)

(def *-value-field-number
  "Static Constant.

  type: int"
  OnnxProto3$StringStringEntryProto/VALUE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxProto3$StringStringEntryProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$StringStringEntryProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxProto3$StringStringEntryProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$StringStringEntryProto/parseFrom data extension-registry))
  (^onnx.OnnxProto3$StringStringEntryProto [^java.nio.ByteBuffer data]
    (OnnxProto3$StringStringEntryProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$StringStringEntryProto`

  throws: java.io.IOException"
  (^onnx.OnnxProto3$StringStringEntryProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$StringStringEntryProto/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxProto3$StringStringEntryProto [^java.io.InputStream input]
    (OnnxProto3$StringStringEntryProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxProto3$StringStringEntryProto`

  returns: `onnx.OnnxProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxProto3$StringStringEntryProto$Builder [^onnx.OnnxProto3$StringStringEntryProto prototype]
    (OnnxProto3$StringStringEntryProto/newBuilder prototype))
  (^onnx.OnnxProto3$StringStringEntryProto$Builder []
    (OnnxProto3$StringStringEntryProto/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxProto3$StringStringEntryProto`"
  (^onnx.OnnxProto3$StringStringEntryProto []
    (OnnxProto3$StringStringEntryProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$StringStringEntryProto>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxProto3$StringStringEntryProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxProto3$StringStringEntryProto this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxProto3$StringStringEntryProto this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxProto3$StringStringEntryProto`"
  (^onnx.OnnxProto3$StringStringEntryProto [^OnnxProto3$StringStringEntryProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxProto3$StringStringEntryProto this]
    (-> this (.getSerializedSize))))

(defn get-key
  "string key = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$StringStringEntryProto this]
    (-> this (.getKey))))

(defn get-value
  "string value = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$StringStringEntryProto this]
    (-> this (.getValue))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxProto3$StringStringEntryProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-key-bytes
  "string key = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$StringStringEntryProto this]
    (-> this (.getKeyBytes))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxProto3$StringStringEntryProto this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$StringStringEntryProto>`"
  (^com.github.os72.protobuf351.Parser [^OnnxProto3$StringStringEntryProto this]
    (-> this (.getParserForType))))

(defn get-value-bytes
  "string value = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$StringStringEntryProto this]
    (-> this (.getValueBytes))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxProto3$StringStringEntryProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxProto3$StringStringEntryProto$Builder [^OnnxProto3$StringStringEntryProto this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `onnx.OnnxProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxProto3$StringStringEntryProto$Builder [^OnnxProto3$StringStringEntryProto this]
    (-> this (.toBuilder))))

