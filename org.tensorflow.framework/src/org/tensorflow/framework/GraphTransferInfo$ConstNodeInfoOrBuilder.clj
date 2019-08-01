(ns org.tensorflow.framework.GraphTransferInfo$ConstNodeInfoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$ConstNodeInfoOrBuilder]))

(defn get-shape-list
  "repeated int64 shape = 3;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^GraphTransferInfo$ConstNodeInfoOrBuilder this]
    (-> this (.getShapeList))))

(defn get-dtype
  ".tensorflow.DataType dtype = 5;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^GraphTransferInfo$ConstNodeInfoOrBuilder this]
    (-> this (.getDtype))))

(defn get-shape-count
  "repeated int64 shape = 3;

  returns: `int`"
  (^Integer [^GraphTransferInfo$ConstNodeInfoOrBuilder this]
    (-> this (.getShapeCount))))

(defn get-data
  "bytes data = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GraphTransferInfo$ConstNodeInfoOrBuilder this]
    (-> this (.getData))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GraphTransferInfo$ConstNodeInfoOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^GraphTransferInfo$ConstNodeInfoOrBuilder this]
    (-> this (.getName))))

(defn get-node-id
  "int32 node_id = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$ConstNodeInfoOrBuilder this]
    (-> this (.getNodeId))))

(defn get-dtype-value
  ".tensorflow.DataType dtype = 5;

  returns: `int`"
  (^Integer [^GraphTransferInfo$ConstNodeInfoOrBuilder this]
    (-> this (.getDtypeValue))))

(defn get-shape
  "repeated int64 shape = 3;

  index - `int`

  returns: `long`"
  (^Long [^GraphTransferInfo$ConstNodeInfoOrBuilder this ^Integer index]
    (-> this (.getShape index))))

