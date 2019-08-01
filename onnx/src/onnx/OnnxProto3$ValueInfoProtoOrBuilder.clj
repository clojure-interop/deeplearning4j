(ns onnx.OnnxProto3$ValueInfoProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$ValueInfoProtoOrBuilder]))

(defn get-name
  "This field MUST be present in this version of the IR.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$ValueInfoProtoOrBuilder this]
    (-> this (.getName))))

(defn get-name-bytes
  "This field MUST be present in this version of the IR.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$ValueInfoProtoOrBuilder this]
    (-> this (.getNameBytes))))

(defn has-type?
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  returns: `boolean`"
  (^Boolean [^OnnxProto3$ValueInfoProtoOrBuilder this]
    (-> this (.hasType))))

(defn get-type
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  returns: `onnx.OnnxProto3$TypeProto`"
  (^onnx.OnnxProto3$TypeProto [^OnnxProto3$ValueInfoProtoOrBuilder this]
    (-> this (.getType))))

(defn get-type-or-builder
  "This field MUST be present in this version of the IR.
  .onnx.TypeProto type = 2;

  returns: `onnx.OnnxProto3$TypeProtoOrBuilder`"
  (^onnx.OnnxProto3$TypeProtoOrBuilder [^OnnxProto3$ValueInfoProtoOrBuilder this]
    (-> this (.getTypeOrBuilder))))

(defn get-doc-string
  "A human-readable documentation for this value. Markdown is allowed.
  string doc_string = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$ValueInfoProtoOrBuilder this]
    (-> this (.getDocString))))

(defn get-doc-string-bytes
  "A human-readable documentation for this value. Markdown is allowed.
  string doc_string = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$ValueInfoProtoOrBuilder this]
    (-> this (.getDocStringBytes))))

