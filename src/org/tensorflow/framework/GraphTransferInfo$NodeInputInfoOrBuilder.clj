(ns org.tensorflow.framework.GraphTransferInfo$NodeInputInfoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$NodeInputInfoOrBuilder]))

(defn get-node-id
  "int32 node_id = 1;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInputInfoOrBuilder this]
    (-> this (.getNodeId))))

(defn get-node-input-list
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$NodeInput>`"
  (^java.util.List [^GraphTransferInfo$NodeInputInfoOrBuilder this]
    (-> this (.getNodeInputList))))

(defn get-node-input
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput [^GraphTransferInfo$NodeInputInfoOrBuilder this ^Integer index]
    (-> this (.getNodeInput index))))

(defn get-node-input-count
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInputInfoOrBuilder this]
    (-> this (.getNodeInputCount))))

(defn get-node-input-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$NodeInputOrBuilder>`"
  ([^GraphTransferInfo$NodeInputInfoOrBuilder this]
    (-> this (.getNodeInputOrBuilderList))))

(defn get-node-input-or-builder
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputOrBuilder [^GraphTransferInfo$NodeInputInfoOrBuilder this ^Integer index]
    (-> this (.getNodeInputOrBuilder index))))

