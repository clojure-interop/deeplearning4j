(ns org.tensorflow.framework.GraphTransferInfo$NodeInfoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$NodeInfoOrBuilder]))

(defn get-padding-id
  "int32 padding_id = 5;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInfoOrBuilder this]
    (-> this (.getPaddingId))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GraphTransferInfo$NodeInfoOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-input-count
  "int32 input_count = 6;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInfoOrBuilder this]
    (-> this (.getInputCount))))

(defn get-type-name-bytes
  "string type_name = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GraphTransferInfo$NodeInfoOrBuilder this]
    (-> this (.getTypeNameBytes))))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^GraphTransferInfo$NodeInfoOrBuilder this]
    (-> this (.getName))))

(defn get-node-id
  "int32 node_id = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInfoOrBuilder this]
    (-> this (.getNodeId))))

(defn get-output-count
  "int32 output_count = 7;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInfoOrBuilder this]
    (-> this (.getOutputCount))))

(defn get-soc-op-id
  "int32 soc_op_id = 4;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInfoOrBuilder this]
    (-> this (.getSocOpId))))

(defn get-type-name
  "string type_name = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^GraphTransferInfo$NodeInfoOrBuilder this]
    (-> this (.getTypeName))))

