(ns onnx.OnnxOperatorsProto3$OperatorSetProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxOperatorsProto3$OperatorSetProtoOrBuilder]))

(defn get-operator
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  index - `int`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto`"
  (^onnx.OnnxOperatorsProto3$OperatorProto [^OnnxOperatorsProto3$OperatorSetProtoOrBuilder this ^Integer index]
    (-> this (.getOperator index))))

(defn get-ir-version-prerelease-bytes
  "The prerelease component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_version_prerelease = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorSetProtoOrBuilder this]
    (-> this (.getIrVersionPrereleaseBytes))))

(defn get-doc-string-bytes
  "A human-readable documentation for this set of operators. Markdown is allowed.
  string doc_string = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorSetProtoOrBuilder this]
    (-> this (.getDocStringBytes))))

(defn get-ir-build-metadata
  "The build metadata component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_build_metadata = 7;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorSetProtoOrBuilder this]
    (-> this (.getIrBuildMetadata))))

(defn get-domain-bytes
  "Domain name of the operator set, in reverse DNS form (e.g., com.acme.dnnops).
  string domain = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorSetProtoOrBuilder this]
    (-> this (.getDomainBytes))))

(defn get-operator-or-builder
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  index - `int`

  returns: `onnx.OnnxOperatorsProto3$OperatorProtoOrBuilder`"
  (^onnx.OnnxOperatorsProto3$OperatorProtoOrBuilder [^OnnxOperatorsProto3$OperatorSetProtoOrBuilder this ^Integer index]
    (-> this (.getOperatorOrBuilder index))))

(defn get-doc-string
  "A human-readable documentation for this set of operators. Markdown is allowed.
  string doc_string = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorSetProtoOrBuilder this]
    (-> this (.getDocString))))

(defn get-opset-version
  "The version of the set of operators. This is a simple int value
   that is monotonically increasing as new versions of operator set
   are published. All operators in this set MUST have version
   numbers no greater than opset_version.
  int64 opset_version = 5;

  returns: `long`"
  (^Long [^OnnxOperatorsProto3$OperatorSetProtoOrBuilder this]
    (-> this (.getOpsetVersion))))

(defn get-magic-bytes
  "All OperatorSetProtos start with a distingushed byte sequence to disambiguate
   protobuf files containing OperatorSets from other content.
   This field MUST be \"ONNXOPSET\"
   This field MUST be present in this version of the IR
  string magic = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorSetProtoOrBuilder this]
    (-> this (.getMagicBytes))))

(defn get-ir-version
  "All OperatorSetProtos indicate the version of the IR syntax and semantics
   they adhere to. It is always IR_VERSION.
   This field MUST be present in this version of the IR
  int32 ir_version = 2;

  returns: `int`"
  (^Integer [^OnnxOperatorsProto3$OperatorSetProtoOrBuilder this]
    (-> this (.getIrVersion))))

(defn get-operator-list
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  returns: `java.util.List<onnx.OnnxOperatorsProto3$OperatorProto>`"
  (^java.util.List [^OnnxOperatorsProto3$OperatorSetProtoOrBuilder this]
    (-> this (.getOperatorList))))

(defn get-operator-or-builder-list
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  returns: `java.util.List<? extends onnx.OnnxOperatorsProto3$OperatorProtoOrBuilder>`"
  ([^OnnxOperatorsProto3$OperatorSetProtoOrBuilder this]
    (-> this (.getOperatorOrBuilderList))))

(defn get-domain
  "Domain name of the operator set, in reverse DNS form (e.g., com.acme.dnnops).
  string domain = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorSetProtoOrBuilder this]
    (-> this (.getDomain))))

(defn get-ir-version-prerelease
  "The prerelease component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_version_prerelease = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorSetProtoOrBuilder this]
    (-> this (.getIrVersionPrerelease))))

(defn get-magic
  "All OperatorSetProtos start with a distingushed byte sequence to disambiguate
   protobuf files containing OperatorSets from other content.
   This field MUST be \"ONNXOPSET\"
   This field MUST be present in this version of the IR
  string magic = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorSetProtoOrBuilder this]
    (-> this (.getMagic))))

(defn get-operator-count
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  returns: `int`"
  (^Integer [^OnnxOperatorsProto3$OperatorSetProtoOrBuilder this]
    (-> this (.getOperatorCount))))

(defn get-ir-build-metadata-bytes
  "The build metadata component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_build_metadata = 7;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorSetProtoOrBuilder this]
    (-> this (.getIrBuildMetadataBytes))))

