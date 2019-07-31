(ns onnx.OnnxMlProto3$OperatorSetIdProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$OperatorSetIdProtoOrBuilder]))

(defn get-domain
  "The domain of the operator set being identified.
   The empty string (\"\") or absence of this field implies the operator
   set that is defined as part of the ONNX specification.
   This field MUST be present in this version of the IR when referring to any other operator set.
  string domain = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$OperatorSetIdProtoOrBuilder this]
    (-> this (.getDomain))))

(defn get-domain-bytes
  "The domain of the operator set being identified.
   The empty string (\"\") or absence of this field implies the operator
   set that is defined as part of the ONNX specification.
   This field MUST be present in this version of the IR when referring to any other operator set.
  string domain = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$OperatorSetIdProtoOrBuilder this]
    (-> this (.getDomainBytes))))

(defn get-version
  "The version of the operator set being identified.
   This field MUST be present in this version of the IR.
  int64 version = 2;

  returns: `long`"
  (^Long [^OnnxMlProto3$OperatorSetIdProtoOrBuilder this]
    (-> this (.getVersion))))

