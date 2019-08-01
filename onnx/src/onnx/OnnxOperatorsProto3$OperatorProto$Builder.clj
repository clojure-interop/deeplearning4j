(ns onnx.OnnxOperatorsProto3$OperatorProto$Builder
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
  (:import [onnx OnnxOperatorsProto3$OperatorProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxOperatorsProto3$OperatorProto$Builder/getDescriptor )))

(defn clear-doc-string
  "A human-readable documentation for this operator. Markdown is allowed.
  string doc_string = 10;

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.clearDocString))))

(defn get-since-version
  "The version of the operator set that first introduced this
   operator. This value MUST be the same value as the
   opset_version of the operator set that first published this operator.
   Subsequent versions of the operator set MUST NOT alter the signature
   or semantics of the operator once published as STABLE.
   This field MUST be present in this version of the IR.
  int64 since_version = 2;

  returns: `long`"
  (^Long [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.getSinceVersion))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn get-op-type
  "The name of the operator within a domain.
   This field MUST be present in this version of the IR.
  string op_type = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.getOpType))))

(defn build-partial
  "returns: `onnx.OnnxOperatorsProto3$OperatorProto`"
  (^onnx.OnnxOperatorsProto3$OperatorProto [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.buildPartial))))

(defn set-doc-string
  "A human-readable documentation for this operator. Markdown is allowed.
  string doc_string = 10;

  value - `java.lang.String`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this ^java.lang.String value]
    (-> this (.setDocString value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.isInitialized))))

(defn set-op-type-bytes
  "The name of the operator within a domain.
   This field MUST be present in this version of the IR.
  string op_type = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setOpTypeBytes value))))

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
  (^onnx.OnnxOperatorsProto3$OperatorProto$OperatorStatus [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.getStatus))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxOperatorsProto3$OperatorProto`"
  (^onnx.OnnxOperatorsProto3$OperatorProto [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-doc-string-bytes
  "A human-readable documentation for this operator. Markdown is allowed.
  string doc_string = 10;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.getDocStringBytes))))

(defn set-op-type
  "The name of the operator within a domain.
   This field MUST be present in this version of the IR.
  string op_type = 1;

  value - `java.lang.String`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this ^java.lang.String value]
    (-> this (.setOpType value))))

(defn set-doc-string-bytes
  "A human-readable documentation for this operator. Markdown is allowed.
  string doc_string = 10;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDocStringBytes value))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-op-type-bytes
  "The name of the operator within a domain.
   This field MUST be present in this version of the IR.
  string op_type = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.getOpTypeBytes))))

(defn get-doc-string
  "A human-readable documentation for this operator. Markdown is allowed.
  string doc_string = 10;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.getDocString))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

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
  (^Integer [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.getStatusValue))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `onnx.OnnxOperatorsProto3$OperatorProto`"
  (^onnx.OnnxOperatorsProto3$OperatorProto [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-op-type
  "The name of the operator within a domain.
   This field MUST be present in this version of the IR.
  string op_type = 1;

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.clearOpType))))

(defn clear-status
  "This field indicates whether the syntax, semantics, or presence
   of this operator is in an experimental or stable stage. Once an
   operator is published as STABLE, it's syntax and semantics MUST NOT
   change in subsequent versions of the operator set.
   When an operator is published as EXPERIMENTAL, the syntax and semantics
   of the operator MAY change across operator set versions.
   Operators \"become\" stable by deprecating the experimental version and
   introducing a new stable operator with the same op_type.
  .onnx.OperatorProto.OperatorStatus status = 3;

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.clearStatus))))

(defn set-status-value
  "This field indicates whether the syntax, semantics, or presence
   of this operator is in an experimental or stable stage. Once an
   operator is published as STABLE, it's syntax and semantics MUST NOT
   change in subsequent versions of the operator set.
   When an operator is published as EXPERIMENTAL, the syntax and semantics
   of the operator MAY change across operator set versions.
   Operators \"become\" stable by deprecating the experimental version and
   introducing a new stable operator with the same op_type.
  .onnx.OperatorProto.OperatorStatus status = 3;

  value - `int`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this ^Integer value]
    (-> this (.setStatusValue value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear-since-version
  "The version of the operator set that first introduced this
   operator. This value MUST be the same value as the
   opset_version of the operator set that first published this operator.
   Subsequent versions of the operator set MUST NOT alter the signature
   or semantics of the operator once published as STABLE.
   This field MUST be present in this version of the IR.
  int64 since_version = 2;

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.clearSinceVersion))))

(defn clear
  "returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-since-version
  "The version of the operator set that first introduced this
   operator. This value MUST be the same value as the
   opset_version of the operator set that first published this operator.
   Subsequent versions of the operator set MUST NOT alter the signature
   or semantics of the operator once published as STABLE.
   This field MUST be present in this version of the IR.
  int64 since_version = 2;

  value - `long`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this ^Long value]
    (-> this (.setSinceVersion value))))

(defn set-status
  "This field indicates whether the syntax, semantics, or presence
   of this operator is in an experimental or stable stage. Once an
   operator is published as STABLE, it's syntax and semantics MUST NOT
   change in subsequent versions of the operator set.
   When an operator is published as EXPERIMENTAL, the syntax and semantics
   of the operator MAY change across operator set versions.
   Operators \"become\" stable by deprecating the experimental version and
   introducing a new stable operator with the same op_type.
  .onnx.OperatorProto.OperatorStatus status = 3;

  value - `onnx.OnnxOperatorsProto3$OperatorProto$OperatorStatus`

  returns: `onnx.OnnxOperatorsProto3$OperatorProto$Builder`"
  (^onnx.OnnxOperatorsProto3$OperatorProto$Builder [^OnnxOperatorsProto3$OperatorProto$Builder this ^onnx.OnnxOperatorsProto3$OperatorProto$OperatorStatus value]
    (-> this (.setStatus value))))

