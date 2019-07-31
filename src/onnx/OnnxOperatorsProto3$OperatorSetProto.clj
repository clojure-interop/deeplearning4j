(ns onnx.OnnxOperatorsProto3$OperatorSetProto
  " An OperatorSetProto represents an immutable set of immutable operator
  specifications.
  The domain of the set (OperatorSetProto.domain) is a reverse-DNS name
  that disambiguates operator sets defined by independent entities.
  The version of the set (opset_version) is a monotonically increasing
  integer that indicates changes to the membership of the operator set.
  Operator sets are uniquely identified by a two part identifier (domain, opset_version)
  Like ModelProto, OperatorSetProto is intended as a top-level file/wire format,
  and thus has the standard format headers in addition to the operator set information.
 Protobuf type onnx.OperatorSetProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxOperatorsProto3$OperatorSetProto]))

(def *-magic-field-number
  "Static Constant.

  type: int"
  OnnxOperatorsProto3$OperatorSetProto/MAGIC_FIELD_NUMBER)

(def *-ir-version-field-number
  "Static Constant.

  type: int"
  OnnxOperatorsProto3$OperatorSetProto/IR_VERSION_FIELD_NUMBER)

(def *-ir-version-prerelease-field-number
  "Static Constant.

  type: int"
  OnnxOperatorsProto3$OperatorSetProto/IR_VERSION_PRERELEASE_FIELD_NUMBER)

(def *-ir-build-metadata-field-number
  "Static Constant.

  type: int"
  OnnxOperatorsProto3$OperatorSetProto/IR_BUILD_METADATA_FIELD_NUMBER)

(def *-domain-field-number
  "Static Constant.

  type: int"
  OnnxOperatorsProto3$OperatorSetProto/DOMAIN_FIELD_NUMBER)

(def *-opset-version-field-number
  "Static Constant.

  type: int"
  OnnxOperatorsProto3$OperatorSetProto/OPSET_VERSION_FIELD_NUMBER)

(def *-doc-string-field-number
  "Static Constant.

  type: int"
  OnnxOperatorsProto3$OperatorSetProto/DOC_STRING_FIELD_NUMBER)

(def *-operator-field-number
  "Static Constant.

  type: int"
  OnnxOperatorsProto3$OperatorSetProto/OPERATOR_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxOperatorsProto3$OperatorSetProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxOperatorsProto3$OperatorSetProto/parseFrom data extension-registry))
  (^onnx.OnnxOperatorsProto3$OperatorSetProto [^java.nio.ByteBuffer data]
    (OnnxOperatorsProto3$OperatorSetProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto`

  throws: java.io.IOException"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxOperatorsProto3$OperatorSetProto/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxOperatorsProto3$OperatorSetProto [^java.io.InputStream input]
    (OnnxOperatorsProto3$OperatorSetProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxOperatorsProto3$OperatorSetProto`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^onnx.OnnxOperatorsProto3$OperatorSetProto prototype]
    (OnnxOperatorsProto3$OperatorSetProto/newBuilder prototype))
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder []
    (OnnxOperatorsProto3$OperatorSetProto/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxOperatorsProto3$OperatorSetProto`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto []
    (OnnxOperatorsProto3$OperatorSetProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxOperatorsProto3$OperatorSetProto>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxOperatorsProto3$OperatorSetProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getUnknownFields))))

(defn get-operator
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  index - `int`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto`"
  (^onnx.OnnxOperatorsProto3$OperatorProto [^OnnxOperatorsProto3$OperatorSetProto this ^Integer index]
    (-> this (.getOperator index))))

(defn get-ir-version-prerelease-bytes
  "The prerelease component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_version_prerelease = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getIrVersionPrereleaseBytes))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxOperatorsProto3$OperatorSetProto`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-doc-string-bytes
  "A human-readable documentation for this set of operators. Markdown is allowed.
  string doc_string = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getDocStringBytes))))

(defn get-ir-build-metadata
  "The build metadata component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_build_metadata = 7;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getIrBuildMetadata))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getSerializedSize))))

(defn get-domain-bytes
  "Domain name of the operator set, in reverse DNS form (e.g., com.acme.dnnops).
  string domain = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getDomainBytes))))

(defn get-operator-or-builder
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  index - `int`

  returns: `onnx.OnnxOperatorsProto3$OperatorProtoOrBuilder`"
  (^onnx.OnnxOperatorsProto3$OperatorProtoOrBuilder [^OnnxOperatorsProto3$OperatorSetProto this ^Integer index]
    (-> this (.getOperatorOrBuilder index))))

(defn get-doc-string
  "A human-readable documentation for this set of operators. Markdown is allowed.
  string doc_string = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getDocString))))

(defn get-opset-version
  "The version of the set of operators. This is a simple int value
   that is monotonically increasing as new versions of operator set
   are published. All operators in this set MUST have version
   numbers no greater than opset_version.
  int64 opset_version = 5;

  returns: `long`"
  (^Long [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getOpsetVersion))))

(defn get-magic-bytes
  "All OperatorSetProtos start with a distingushed byte sequence to disambiguate
   protobuf files containing OperatorSets from other content.
   This field MUST be \"ONNXOPSET\"
   This field MUST be present in this version of the IR
  string magic = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getMagicBytes))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxOperatorsProto3$OperatorSetProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-ir-version
  "All OperatorSetProtos indicate the version of the IR syntax and semantics
   they adhere to. It is always IR_VERSION.
   This field MUST be present in this version of the IR
  int32 ir_version = 2;

  returns: `int`"
  (^Integer [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getIrVersion))))

(defn get-operator-list
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  returns: `java.util.List<onnx.OnnxOperatorsProto3$OperatorProto>`"
  (^java.util.List [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getOperatorList))))

(defn get-operator-or-builder-list
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  returns: `java.util.List<? extends onnx.OnnxOperatorsProto3$OperatorProtoOrBuilder>`"
  ([^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getOperatorOrBuilderList))))

(defn get-domain
  "Domain name of the operator set, in reverse DNS form (e.g., com.acme.dnnops).
  string domain = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getDomain))))

(defn get-ir-version-prerelease
  "The prerelease component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_version_prerelease = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getIrVersionPrerelease))))

(defn get-magic
  "All OperatorSetProtos start with a distingushed byte sequence to disambiguate
   protobuf files containing OperatorSets from other content.
   This field MUST be \"ONNXOPSET\"
   This field MUST be present in this version of the IR
  string magic = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getMagic))))

(defn get-operator-count
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  returns: `int`"
  (^Integer [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getOperatorCount))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxOperatorsProto3$OperatorSetProto>`"
  (^com.github.os72.protobuf351.Parser [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getParserForType))))

(defn get-ir-build-metadata-bytes
  "The build metadata component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_build_metadata = 7;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.getIrBuildMetadataBytes))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxOperatorsProto3$OperatorSetProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto this]
    (-> this (.toBuilder))))

