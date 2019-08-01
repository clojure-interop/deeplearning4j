(ns onnx.OnnxOperatorsProto3$OperatorProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxOperatorsProto3$OperatorProtoOrBuilder]))

(defn get-op-type
  "The name of the operator within a domain.
   This field MUST be present in this version of the IR.
  string op_type = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorProtoOrBuilder this]
    (-> this (.getOpType))))

(defn get-op-type-bytes
  "The name of the operator within a domain.
   This field MUST be present in this version of the IR.
  string op_type = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorProtoOrBuilder this]
    (-> this (.getOpTypeBytes))))

(defn get-since-version
  "The version of the operator set that first introduced this
   operator. This value MUST be the same value as the
   opset_version of the operator set that first published this operator.
   Subsequent versions of the operator set MUST NOT alter the signature
   or semantics of the operator once published as STABLE.
   This field MUST be present in this version of the IR.
  int64 since_version = 2;

  returns: `long`"
  (^Long [^OnnxOperatorsProto3$OperatorProtoOrBuilder this]
    (-> this (.getSinceVersion))))

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
  (^Integer [^OnnxOperatorsProto3$OperatorProtoOrBuilder this]
    (-> this (.getStatusValue))))

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
  (^onnx.OnnxOperatorsProto3$OperatorProto$OperatorStatus [^OnnxOperatorsProto3$OperatorProtoOrBuilder this]
    (-> this (.getStatus))))

(defn get-doc-string
  "A human-readable documentation for this operator. Markdown is allowed.
  string doc_string = 10;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxOperatorsProto3$OperatorProtoOrBuilder this]
    (-> this (.getDocString))))

(defn get-doc-string-bytes
  "A human-readable documentation for this operator. Markdown is allowed.
  string doc_string = 10;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxOperatorsProto3$OperatorProtoOrBuilder this]
    (-> this (.getDocStringBytes))))

