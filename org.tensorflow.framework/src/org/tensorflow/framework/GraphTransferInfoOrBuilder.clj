(ns org.tensorflow.framework.GraphTransferInfoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfoOrBuilder]))

(defn get-node-output-info-or-builder
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfoOrBuilder [^GraphTransferInfoOrBuilder this ^Integer index]
    (-> this (.getNodeOutputInfoOrBuilder index))))

(defn get-graph-output-node-info-count
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  returns: `int`"
  (^Integer [^GraphTransferInfoOrBuilder this]
    (-> this (.getGraphOutputNodeInfoCount))))

(defn get-node-output-info
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo [^GraphTransferInfoOrBuilder this ^Integer index]
    (-> this (.getNodeOutputInfo index))))

(defn get-const-node-info-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$ConstNodeInfoOrBuilder>`"
  ([^GraphTransferInfoOrBuilder this]
    (-> this (.getConstNodeInfoOrBuilderList))))

(defn get-node-input-info-count
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  returns: `int`"
  (^Integer [^GraphTransferInfoOrBuilder this]
    (-> this (.getNodeInputInfoCount))))

(defn get-node-info-or-builder
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfoOrBuilder [^GraphTransferInfoOrBuilder this ^Integer index]
    (-> this (.getNodeInfoOrBuilder index))))

(defn get-graph-output-node-info-list
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo>`"
  (^java.util.List [^GraphTransferInfoOrBuilder this]
    (-> this (.getGraphOutputNodeInfoList))))

(defn get-const-node-info
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo [^GraphTransferInfoOrBuilder this ^Integer index]
    (-> this (.getConstNodeInfo index))))

(defn get-node-input-info-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$NodeInputInfoOrBuilder>`"
  ([^GraphTransferInfoOrBuilder this]
    (-> this (.getNodeInputInfoOrBuilderList))))

(defn get-const-node-info-list
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo>`"
  (^java.util.List [^GraphTransferInfoOrBuilder this]
    (-> this (.getConstNodeInfoList))))

(defn get-const-node-info-count
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfoOrBuilder this]
    (-> this (.getConstNodeInfoCount))))

(defn get-node-info-count
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  returns: `int`"
  (^Integer [^GraphTransferInfoOrBuilder this]
    (-> this (.getNodeInfoCount))))

(defn get-graph-input-node-info-or-builder-list
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfoOrBuilder>`"
  ([^GraphTransferInfoOrBuilder this]
    (-> this (.getGraphInputNodeInfoOrBuilderList))))

(defn get-destination
  "Destination of graph transfer
  .tensorflow.GraphTransferInfo.Destination destination = 7;

  returns: `org.tensorflow.framework.GraphTransferInfo$Destination`"
  (^org.tensorflow.framework.GraphTransferInfo$Destination [^GraphTransferInfoOrBuilder this]
    (-> this (.getDestination))))

(defn get-graph-output-node-info-or-builder
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfoOrBuilder [^GraphTransferInfoOrBuilder this ^Integer index]
    (-> this (.getGraphOutputNodeInfoOrBuilder index))))

(defn get-graph-input-node-info-or-builder
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfoOrBuilder [^GraphTransferInfoOrBuilder this ^Integer index]
    (-> this (.getGraphInputNodeInfoOrBuilder index))))

(defn get-destination-value
  "Destination of graph transfer
  .tensorflow.GraphTransferInfo.Destination destination = 7;

  returns: `int`"
  (^Integer [^GraphTransferInfoOrBuilder this]
    (-> this (.getDestinationValue))))

(defn get-node-output-info-count
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  returns: `int`"
  (^Integer [^GraphTransferInfoOrBuilder this]
    (-> this (.getNodeOutputInfoCount))))

(defn get-const-node-info-or-builder
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfoOrBuilder [^GraphTransferInfoOrBuilder this ^Integer index]
    (-> this (.getConstNodeInfoOrBuilder index))))

(defn get-graph-input-node-info-count
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  returns: `int`"
  (^Integer [^GraphTransferInfoOrBuilder this]
    (-> this (.getGraphInputNodeInfoCount))))

(defn get-graph-output-node-info
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo [^GraphTransferInfoOrBuilder this ^Integer index]
    (-> this (.getGraphOutputNodeInfo index))))

(defn get-node-output-info-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$NodeOutputInfoOrBuilder>`"
  ([^GraphTransferInfoOrBuilder this]
    (-> this (.getNodeOutputInfoOrBuilderList))))

(defn get-node-output-info-list
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo>`"
  (^java.util.List [^GraphTransferInfoOrBuilder this]
    (-> this (.getNodeOutputInfoList))))

(defn get-node-input-info-list
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$NodeInputInfo>`"
  (^java.util.List [^GraphTransferInfoOrBuilder this]
    (-> this (.getNodeInputInfoList))))

(defn get-graph-input-node-info-list
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo>`"
  (^java.util.List [^GraphTransferInfoOrBuilder this]
    (-> this (.getGraphInputNodeInfoList))))

(defn get-node-info-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$NodeInfoOrBuilder>`"
  ([^GraphTransferInfoOrBuilder this]
    (-> this (.getNodeInfoOrBuilderList))))

(defn get-node-info
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo [^GraphTransferInfoOrBuilder this ^Integer index]
    (-> this (.getNodeInfo index))))

(defn get-node-input-info
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo [^GraphTransferInfoOrBuilder this ^Integer index]
    (-> this (.getNodeInputInfo index))))

(defn get-graph-output-node-info-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfoOrBuilder>`"
  ([^GraphTransferInfoOrBuilder this]
    (-> this (.getGraphOutputNodeInfoOrBuilderList))))

(defn get-node-info-list
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$NodeInfo>`"
  (^java.util.List [^GraphTransferInfoOrBuilder this]
    (-> this (.getNodeInfoList))))

(defn get-node-input-info-or-builder
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfoOrBuilder [^GraphTransferInfoOrBuilder this ^Integer index]
    (-> this (.getNodeInputInfoOrBuilder index))))

(defn get-graph-input-node-info
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo [^GraphTransferInfoOrBuilder this ^Integer index]
    (-> this (.getGraphInputNodeInfo index))))

