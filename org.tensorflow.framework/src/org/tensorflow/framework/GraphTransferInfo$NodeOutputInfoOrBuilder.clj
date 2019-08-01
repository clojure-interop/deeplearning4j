(ns org.tensorflow.framework.GraphTransferInfo$NodeOutputInfoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$NodeOutputInfoOrBuilder]))

(defn get-node-id
  "int32 node_id = 1;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeOutputInfoOrBuilder this]
    (-> this (.getNodeId))))

(defn get-max-byte-size-list
  "repeated int32 max_byte_size = 2;

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^GraphTransferInfo$NodeOutputInfoOrBuilder this]
    (-> this (.getMaxByteSizeList))))

(defn get-max-byte-size-count
  "repeated int32 max_byte_size = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeOutputInfoOrBuilder this]
    (-> this (.getMaxByteSizeCount))))

(defn get-max-byte-size
  "repeated int32 max_byte_size = 2;

  index - `int`

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeOutputInfoOrBuilder this ^Integer index]
    (-> this (.getMaxByteSize index))))

