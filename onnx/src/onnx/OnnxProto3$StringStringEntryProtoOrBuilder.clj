(ns onnx.OnnxProto3$StringStringEntryProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$StringStringEntryProtoOrBuilder]))

(defn get-key
  "string key = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$StringStringEntryProtoOrBuilder this]
    (-> this (.getKey))))

(defn get-key-bytes
  "string key = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$StringStringEntryProtoOrBuilder this]
    (-> this (.getKeyBytes))))

(defn get-value
  "string value = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$StringStringEntryProtoOrBuilder this]
    (-> this (.getValue))))

(defn get-value-bytes
  "string value = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$StringStringEntryProtoOrBuilder this]
    (-> this (.getValueBytes))))

