(ns onnx.OnnxProto3$OperatorSetIdProto
  " OperatorSets are uniquely identified by a (domain, opset_version) pair.
 Protobuf type onnx.OperatorSetIdProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$OperatorSetIdProto]))

(def *-domain-field-number
  "Static Constant.

  type: int"
  OnnxProto3$OperatorSetIdProto/DOMAIN_FIELD_NUMBER)

(def *-version-field-number
  "Static Constant.

  type: int"
  OnnxProto3$OperatorSetIdProto/VERSION_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxProto3$OperatorSetIdProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$OperatorSetIdProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxProto3$OperatorSetIdProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$OperatorSetIdProto/parseFrom data extension-registry))
  (^onnx.OnnxProto3$OperatorSetIdProto [^java.nio.ByteBuffer data]
    (OnnxProto3$OperatorSetIdProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$OperatorSetIdProto`

  throws: java.io.IOException"
  (^onnx.OnnxProto3$OperatorSetIdProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$OperatorSetIdProto/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxProto3$OperatorSetIdProto [^java.io.InputStream input]
    (OnnxProto3$OperatorSetIdProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxProto3$OperatorSetIdProto`

  returns: `onnx.OnnxProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxProto3$OperatorSetIdProto$Builder [^onnx.OnnxProto3$OperatorSetIdProto prototype]
    (OnnxProto3$OperatorSetIdProto/newBuilder prototype))
  (^onnx.OnnxProto3$OperatorSetIdProto$Builder []
    (OnnxProto3$OperatorSetIdProto/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxProto3$OperatorSetIdProto`"
  (^onnx.OnnxProto3$OperatorSetIdProto []
    (OnnxProto3$OperatorSetIdProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$OperatorSetIdProto>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxProto3$OperatorSetIdProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxProto3$OperatorSetIdProto this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxProto3$OperatorSetIdProto this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxProto3$OperatorSetIdProto`"
  (^onnx.OnnxProto3$OperatorSetIdProto [^OnnxProto3$OperatorSetIdProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxProto3$OperatorSetIdProto this]
    (-> this (.getSerializedSize))))

(defn get-domain-bytes
  "The domain of the operator set being identified.
   The empty string (\"\") or absence of this field implies the operator
   set that is defined as part of the ONNX specification.
   This field MUST be present in this version of the IR when referring to any other operator set.
  string domain = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$OperatorSetIdProto this]
    (-> this (.getDomainBytes))))

(defn get-version
  "The version of the operator set being identified.
   This field MUST be present in this version of the IR.
  int64 version = 2;

  returns: `long`"
  (^Long [^OnnxProto3$OperatorSetIdProto this]
    (-> this (.getVersion))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxProto3$OperatorSetIdProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-domain
  "The domain of the operator set being identified.
   The empty string (\"\") or absence of this field implies the operator
   set that is defined as part of the ONNX specification.
   This field MUST be present in this version of the IR when referring to any other operator set.
  string domain = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$OperatorSetIdProto this]
    (-> this (.getDomain))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxProto3$OperatorSetIdProto this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$OperatorSetIdProto>`"
  (^com.github.os72.protobuf351.Parser [^OnnxProto3$OperatorSetIdProto this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxProto3$OperatorSetIdProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxProto3$OperatorSetIdProto$Builder [^OnnxProto3$OperatorSetIdProto this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `onnx.OnnxProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxProto3$OperatorSetIdProto$Builder [^OnnxProto3$OperatorSetIdProto this]
    (-> this (.toBuilder))))

