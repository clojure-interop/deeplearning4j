(ns org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$GraphInputNodeInfoOrBuilder]))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^GraphTransferInfo$GraphInputNodeInfoOrBuilder this]
    (-> this (.getName))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GraphTransferInfo$GraphInputNodeInfoOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-shape-list
  "repeated int64 shape = 2;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^GraphTransferInfo$GraphInputNodeInfoOrBuilder this]
    (-> this (.getShapeList))))

(defn get-shape-count
  "repeated int64 shape = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$GraphInputNodeInfoOrBuilder this]
    (-> this (.getShapeCount))))

(defn get-shape
  "repeated int64 shape = 2;

  index - `int`

  returns: `long`"
  (^Long [^GraphTransferInfo$GraphInputNodeInfoOrBuilder this ^Integer index]
    (-> this (.getShape index))))

(defn get-dtype-value
  ".tensorflow.DataType dtype = 3;

  returns: `int`"
  (^Integer [^GraphTransferInfo$GraphInputNodeInfoOrBuilder this]
    (-> this (.getDtypeValue))))

(defn get-dtype
  ".tensorflow.DataType dtype = 3;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^GraphTransferInfo$GraphInputNodeInfoOrBuilder this]
    (-> this (.getDtype))))

