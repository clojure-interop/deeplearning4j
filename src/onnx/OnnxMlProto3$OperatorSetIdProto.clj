(ns onnx.OnnxMlProto3$OperatorSetIdProto
  " OperatorSets are uniquely identified by a (domain, opset_version) pair.
 Protobuf type onnx.OperatorSetIdProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$OperatorSetIdProto]))

(def *-domain-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$OperatorSetIdProto/DOMAIN_FIELD_NUMBER)

(def *-version-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$OperatorSetIdProto/VERSION_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$OperatorSetIdProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxMlProto3$OperatorSetIdProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxMlProto3$OperatorSetIdProto/parseFrom data extension-registry))
  (^onnx.OnnxMlProto3$OperatorSetIdProto [^java.nio.ByteBuffer data]
    (OnnxMlProto3$OperatorSetIdProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$OperatorSetIdProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxMlProto3$OperatorSetIdProto/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxMlProto3$OperatorSetIdProto [^java.io.InputStream input]
    (OnnxMlProto3$OperatorSetIdProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxMlProto3$OperatorSetIdProto`

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^onnx.OnnxMlProto3$OperatorSetIdProto prototype]
    (OnnxMlProto3$OperatorSetIdProto/newBuilder prototype))
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder []
    (OnnxMlProto3$OperatorSetIdProto/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxMlProto3$OperatorSetIdProto`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto []
    (OnnxMlProto3$OperatorSetIdProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxMlProto3$OperatorSetIdProto>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxMlProto3$OperatorSetIdProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxMlProto3$OperatorSetIdProto this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$OperatorSetIdProto this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$OperatorSetIdProto`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto [^OnnxMlProto3$OperatorSetIdProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxMlProto3$OperatorSetIdProto this]
    (-> this (.getSerializedSize))))

(defn get-domain-bytes
  "The domain of the operator set being identified.
   The empty string (\"\") or absence of this field implies the operator
   set that is defined as part of the ONNX specification.
   This field MUST be present in this version of the IR when referring to any other operator set.
  string domain = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$OperatorSetIdProto this]
    (-> this (.getDomainBytes))))

(defn get-version
  "The version of the operator set being identified.
   This field MUST be present in this version of the IR.
  int64 version = 2;

  returns: `long`"
  (^Long [^OnnxMlProto3$OperatorSetIdProto this]
    (-> this (.getVersion))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxMlProto3$OperatorSetIdProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-domain
  "The domain of the operator set being identified.
   The empty string (\"\") or absence of this field implies the operator
   set that is defined as part of the ONNX specification.
   This field MUST be present in this version of the IR when referring to any other operator set.
  string domain = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$OperatorSetIdProto this]
    (-> this (.getDomain))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxMlProto3$OperatorSetIdProto this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxMlProto3$OperatorSetIdProto>`"
  (^com.github.os72.protobuf351.Parser [^OnnxMlProto3$OperatorSetIdProto this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$OperatorSetIdProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$OperatorSetIdProto this]
    (-> this (.toBuilder))))

