(ns onnx.OnnxOperatorsProto3$OperatorSetProto$Builder
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
  (:import [onnx OnnxOperatorsProto3$OperatorSetProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxOperatorsProto3$OperatorSetProto$Builder/getDescriptor )))

(defn get-operator
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  index - `int`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto`"
  (^onnx.OnnxOperatorsProto3$OperatorProto [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^Integer index]
    (-> this (.getOperator index))))

(defn clear-doc-string
  "A human-readable documentation for this set of operators. Markdown is allowed.
  string doc_string = 6;

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.clearDocString))))

(defn add-operator-builder
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  index - `int`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^Integer index]
    (-> this (.addOperatorBuilder index)))
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.addOperatorBuilder))))

(defn get-ir-version-prerelease-bytes
  "The prerelease component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_version_prerelease = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getIrVersionPrereleaseBytes))))

(defn clear-domain
  "Domain name of the operator set, in reverse DNS form (e.g., com.acme.dnnops).
  string domain = 4;

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.clearDomain))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn get-operator-builder
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  index - `int`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^Integer index]
    (-> this (.getOperatorBuilder index))))

(defn set-magic
  "All OperatorSetProtos start with a distingushed byte sequence to disambiguate
   protobuf files containing OperatorSets from other content.
   This field MUST be \"ONNXOPSET\"
   This field MUST be present in this version of the IR
  string magic = 1;

  value - `java.lang.String`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^java.lang.String value]
    (-> this (.setMagic value))))

(defn build-partial
  "returns: `onnx.OnnxOperatorsProto3$OperatorSetProto`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.buildPartial))))

(defn clear-operator
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.clearOperator))))

(defn set-doc-string
  "A human-readable documentation for this set of operators. Markdown is allowed.
  string doc_string = 6;

  value - `java.lang.String`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^java.lang.String value]
    (-> this (.setDocString value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.isInitialized))))

(defn set-ir-version
  "All OperatorSetProtos indicate the version of the IR syntax and semantics
   they adhere to. It is always IR_VERSION.
   This field MUST be present in this version of the IR
  int32 ir_version = 2;

  value - `int`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^Integer value]
    (-> this (.setIrVersion value))))

(defn clear-ir-version-prerelease
  "The prerelease component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_version_prerelease = 3;

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.clearIrVersionPrerelease))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxOperatorsProto3$OperatorSetProto`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-doc-string-bytes
  "A human-readable documentation for this set of operators. Markdown is allowed.
  string doc_string = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getDocStringBytes))))

(defn get-ir-build-metadata
  "The build metadata component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_build_metadata = 7;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getIrBuildMetadata))))

(defn set-doc-string-bytes
  "A human-readable documentation for this set of operators. Markdown is allowed.
  string doc_string = 6;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDocStringBytes value))))

(defn clear-ir-build-metadata
  "The build metadata component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_build_metadata = 7;

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.clearIrBuildMetadata))))

(defn get-domain-bytes
  "Domain name of the operator set, in reverse DNS form (e.g., com.acme.dnnops).
  string domain = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getDomainBytes))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-operator-builder-list
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  returns: `java.util.List<onnx.OnnxOperatorsProto3$OperatorProto$Builder>`"
  (^java.util.List [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getOperatorBuilderList))))

(defn set-magic-bytes
  "All OperatorSetProtos start with a distingushed byte sequence to disambiguate
   protobuf files containing OperatorSets from other content.
   This field MUST be \"ONNXOPSET\"
   This field MUST be present in this version of the IR
  string magic = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setMagicBytes value))))

(defn get-operator-or-builder
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  index - `int`

  returns: `onnx.OnnxOperatorsProto3$OperatorProtoOrBuilder`"
  (^onnx.OnnxOperatorsProto3$OperatorProtoOrBuilder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^Integer index]
    (-> this (.getOperatorOrBuilder index))))

(defn set-operator
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  index - `int`
  value - `onnx.OnnxOperatorsProto3$OperatorProto`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^Integer index ^onnx.OnnxOperatorsProto3$OperatorProto value]
    (-> this (.setOperator index value))))

(defn add-operator
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  index - `int`
  value - `onnx.OnnxOperatorsProto3$OperatorProto`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^Integer index ^onnx.OnnxOperatorsProto3$OperatorProto value]
    (-> this (.addOperator index value)))
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^onnx.OnnxOperatorsProto3$OperatorProto value]
    (-> this (.addOperator value))))

(defn get-doc-string
  "A human-readable documentation for this set of operators. Markdown is allowed.
  string doc_string = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getDocString))))

(defn set-ir-version-prerelease
  "The prerelease component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_version_prerelease = 3;

  value - `java.lang.String`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^java.lang.String value]
    (-> this (.setIrVersionPrerelease value))))

(defn clear-magic
  "All OperatorSetProtos start with a distingushed byte sequence to disambiguate
   protobuf files containing OperatorSets from other content.
   This field MUST be \"ONNXOPSET\"
   This field MUST be present in this version of the IR
  string magic = 1;

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.clearMagic))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn clear-ir-version
  "All OperatorSetProtos indicate the version of the IR syntax and semantics
   they adhere to. It is always IR_VERSION.
   This field MUST be present in this version of the IR
  int32 ir_version = 2;

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.clearIrVersion))))

(defn add-all-operator
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllOperator values))))

(defn get-opset-version
  "The version of the set of operators. This is a simple int value
   that is monotonically increasing as new versions of operator set
   are published. All operators in this set MUST have version
   numbers no greater than opset_version.
  int64 opset_version = 5;

  returns: `long`"
  (^Long [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getOpsetVersion))))

(defn get-magic-bytes
  "All OperatorSetProtos start with a distingushed byte sequence to disambiguate
   protobuf files containing OperatorSets from other content.
   This field MUST be \"ONNXOPSET\"
   This field MUST be present in this version of the IR
  string magic = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getMagicBytes))))

(defn set-ir-build-metadata
  "The build metadata component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_build_metadata = 7;

  value - `java.lang.String`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^java.lang.String value]
    (-> this (.setIrBuildMetadata value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `onnx.OnnxOperatorsProto3$OperatorSetProto`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.build))))

(defn get-ir-version
  "All OperatorSetProtos indicate the version of the IR syntax and semantics
   they adhere to. It is always IR_VERSION.
   This field MUST be present in this version of the IR
  int32 ir_version = 2;

  returns: `int`"
  (^Integer [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getIrVersion))))

(defn set-ir-build-metadata-bytes
  "The build metadata component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_build_metadata = 7;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setIrBuildMetadataBytes value))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-operator-list
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  returns: `java.util.List<onnx.OnnxOperatorsProto3$OperatorProto>`"
  (^java.util.List [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getOperatorList))))

(defn remove-operator
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  index - `int`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^Integer index]
    (-> this (.removeOperator index))))

(defn get-operator-or-builder-list
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  returns: `java.util.List<? extends onnx.OnnxOperatorsProto3$OperatorProtoOrBuilder>`"
  ([^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getOperatorOrBuilderList))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn get-domain
  "Domain name of the operator set, in reverse DNS form (e.g., com.acme.dnnops).
  string domain = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getDomain))))

(defn set-opset-version
  "The version of the set of operators. This is a simple int value
   that is monotonically increasing as new versions of operator set
   are published. All operators in this set MUST have version
   numbers no greater than opset_version.
  int64 opset_version = 5;

  value - `long`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^Long value]
    (-> this (.setOpsetVersion value))))

(defn clone
  "returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.clone))))

(defn get-ir-version-prerelease
  "The prerelease component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_version_prerelease = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getIrVersionPrerelease))))

(defn get-magic
  "All OperatorSetProtos start with a distingushed byte sequence to disambiguate
   protobuf files containing OperatorSets from other content.
   This field MUST be \"ONNXOPSET\"
   This field MUST be present in this version of the IR
  string magic = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getMagic))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-operator-count
  "The operators specified by this operator set.
   The (name, version) MUST be unique across all OperatorProtos in operator
  repeated .onnx.OperatorProto operator = 8;

  returns: `int`"
  (^Integer [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getOperatorCount))))

(defn clear-opset-version
  "The version of the set of operators. This is a simple int value
   that is monotonically increasing as new versions of operator set
   are published. All operators in this set MUST have version
   numbers no greater than opset_version.
  int64 opset_version = 5;

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.clearOpsetVersion))))

(defn set-domain
  "Domain name of the operator set, in reverse DNS form (e.g., com.acme.dnnops).
  string domain = 4;

  value - `java.lang.String`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^java.lang.String value]
    (-> this (.setDomain value))))

(defn clear
  "returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.clear))))

(defn set-ir-version-prerelease-bytes
  "The prerelease component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_version_prerelease = 3;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setIrVersionPrereleaseBytes value))))

(defn get-ir-build-metadata-bytes
  "The build metadata component of the SemVer of the IR.
   This field MAY be absent in this version of the IR
  string ir_build_metadata = 7;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorSetProto$Builder this]
    (-> this (.getIrBuildMetadataBytes))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-domain-bytes
  "Domain name of the operator set, in reverse DNS form (e.g., com.acme.dnnops).
  string domain = 4;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxOperatorsProto3$OperatorSetProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorSetProto$Builder [^OnnxOperatorsProto3$OperatorSetProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDomainBytes value))))

