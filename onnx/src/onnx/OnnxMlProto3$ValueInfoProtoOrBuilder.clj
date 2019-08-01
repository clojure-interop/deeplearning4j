(ns onnx.OnnxMlProto3$ValueInfoProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$ValueInfoProtoOrBuilder]))

(defn get-name
  "This field MUST be present in this version of the IR.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$ValueInfoProtoOrBuilder this]
    (-> this (.getName))))

(defn get-name-bytes
  "This field MUST be present in this version of the IR.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$ValueInfoProtoOrBuilder this]
    (-> this (.getNameBytes))))

(defn has-type?
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$ValueInfoProtoOrBuilder this]
    (-> this (.hasType))))

(defn get-type
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  returns: `onnx.OnnxMlProto3$TypeProto`"
  (^onnx.OnnxMlProto3$TypeProto [^OnnxMlProto3$ValueInfoProtoOrBuilder this]
    (-> this (.getType))))

(defn get-type-or-builder
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  returns: `onnx.OnnxMlProto3$TypeProtoOrBuilder`"
  (^onnx.OnnxMlProto3$TypeProtoOrBuilder [^OnnxMlProto3$ValueInfoProtoOrBuilder this]
    (-> this (.getTypeOrBuilder))))

(defn get-doc-string
  "A human-readable documentation for this value. Markdown is allowed.
  string doc_string = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$ValueInfoProtoOrBuilder this]
    (-> this (.getDocString))))

(defn get-doc-string-bytes
  "A human-readable documentation for this value. Markdown is allowed.
  string doc_string = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$ValueInfoProtoOrBuilder this]
    (-> this (.getDocStringBytes))))

