(ns onnx.OnnxOperatorsProto3$OperatorProto
  " An OperatorProto represents the immutable specification of the signature
  and semantics of an operator.
  Operators are declared as part of an OperatorSet, which also defines the
  domain name for the set.
  Operators are uniquely identified by a three part identifier
    (domain, op_type, since_version)
  where
    *domain* is the domain of an operator set that
       contains this operator specification.
    *op_type* is the name of the operator as referenced by a
       NodeProto.op_type
    *since_version* is the version of the operator set that
       this operator was initially declared in.
 Protobuf type onnx.OperatorProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxOperatorsProto3$OperatorProto]))

(def *-op-type-field-number
  "Static Constant.

  type: int"
  OnnxOperatorsProto3$OperatorProto/OP_TYPE_FIELD_NUMBER)

(def *-since-version-field-number
  "Static Constant.

  type: int"
  OnnxOperatorsProto3$OperatorProto/SINCE_VERSION_FIELD_NUMBER)

(def *-status-field-number
  "Static Constant.

  type: int"
  OnnxOperatorsProto3$OperatorProto/STATUS_FIELD_NUMBER)

(def *-doc-string-field-number
  "Static Constant.

  type: int"
  OnnxOperatorsProto3$OperatorProto/DOC_STRING_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxOperatorsProto3$OperatorProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxOperatorsProto3$OperatorProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxOperatorsProto3$OperatorProto/parseFrom data extension-registry))
  (^onnx.OnnxOperatorsProto3$OperatorProto [^java.nio.ByteBuffer data]
    (OnnxOperatorsProto3$OperatorProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto`

  throws: java.io.IOException"
  (^onnx.OnnxOperatorsProto3$OperatorProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxOperatorsProto3$OperatorProto/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxOperatorsProto3$OperatorProto [^java.io.InputStream input]
    (OnnxOperatorsProto3$OperatorProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxOperatorsProto3$OperatorProto`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^onnx.OnnxOperatorsProto3$OperatorProto prototype]
    (OnnxOperatorsProto3$OperatorProto/newBuilder prototype))
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder []
    (OnnxOperatorsProto3$OperatorProto/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxOperatorsProto3$OperatorProto`"
  (^onnx.OnnxOperatorsProto3$OperatorProto []
    (OnnxOperatorsProto3$OperatorProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxOperatorsProto3$OperatorProto>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxOperatorsProto3$OperatorProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxOperatorsProto3$OperatorProto this]
    (-> this (.getUnknownFields))))

(defn get-since-version
  "The version of the operator set that first introduced this
   operator. This value MUST be the same value as the
   opset_version of the operator set that first published this operator.
   Subsequent versions of the operator set MUST NOT alter the signature
   or semantics of the operator once published as STABLE.
   This field MUST be present in this version of the IR.
  int64 since_version = 2;

  returns: `long`"
  (^Long [^OnnxOperatorsProto3$OperatorProto this]
    (-> this (.getSinceVersion))))

(defn get-op-type
  "The name of the operator within a domain.
   This field MUST be present in this version of the IR.
  string op_type = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorProto this]
    (-> this (.getOpType))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxOperatorsProto3$OperatorProto this]
    (-> this (.isInitialized))))

(defn get-status
  "This field indicates whether the syntax, semantics, or presence
   of this operator is in an experimental or stable stage. Once an
   operator is published as STABLE, it's syntax and semantics MUST NOT
   change in subsequent versions of the operator set.
   When an operator is published as EXPERIMENTAL, the syntax and semantics
   of the operator MAY change across operator set versions.
   Operators \"become\" stable by deprecating the experimental version and
   introducing a new stable operator with the same op_type.
  .onnx.OperatorProto.OperatorStatus status = 3;

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$OperatorStatus`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$OperatorStatus [^OnnxOperatorsProto3$OperatorProto this]
    (-> this (.getStatus))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxOperatorsProto3$OperatorProto`"
  (^onnx.OnnxOperatorsProto3$OperatorProto [^OnnxOperatorsProto3$OperatorProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-doc-string-bytes
  "A human-readable documentation for this operator. Markdown is allowed.
  string doc_string = 10;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorProto this]
    (-> this (.getDocStringBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxOperatorsProto3$OperatorProto this]
    (-> this (.getSerializedSize))))

(defn get-op-type-bytes
  "The name of the operator within a domain.
   This field MUST be present in this version of the IR.
  string op_type = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorProto this]
    (-> this (.getOpTypeBytes))))

(defn get-doc-string
  "A human-readable documentation for this operator. Markdown is allowed.
  string doc_string = 10;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorProto this]
    (-> this (.getDocString))))

(defn get-status-value
  "This field indicates whether the syntax, semantics, or presence
   of this operator is in an experimental or stable stage. Once an
   operator is published as STABLE, it's syntax and semantics MUST NOT
   change in subsequent versions of the operator set.
   When an operator is published as EXPERIMENTAL, the syntax and semantics
   of the operator MAY change across operator set versions.
   Operators \"become\" stable by deprecating the experimental version and
   introducing a new stable operator with the same op_type.
  .onnx.OperatorProto.OperatorStatus status = 3;

  returns: `int`"
  (^Integer [^OnnxOperatorsProto3$OperatorProto this]
    (-> this (.getStatusValue))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxOperatorsProto3$OperatorProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxOperatorsProto3$OperatorProto this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxOperatorsProto3$OperatorProto>`"
  (^com.github.os72.protobuf351.Parser [^OnnxOperatorsProto3$OperatorProto this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxOperatorsProto3$OperatorProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto this]
    (-> this (.toBuilder))))

