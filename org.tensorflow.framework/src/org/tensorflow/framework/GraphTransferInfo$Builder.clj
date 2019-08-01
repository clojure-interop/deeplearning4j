(ns org.tensorflow.framework.GraphTransferInfo$Builder
  " Protocol buffer representing a handle to a tensorflow resource. Handles are
  not valid across executions, but can be serialized back and forth from within
  a single run.
 Protobuf type tensorflow.GraphTransferInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GraphTransferInfo$Builder/getDescriptor )))

(defn get-node-output-info-or-builder
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfoOrBuilder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getNodeOutputInfoOrBuilder index))))

(defn set-node-info
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  index - `int`
  value - `org.tensorflow.framework.GraphTransferInfo$NodeInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index ^org.tensorflow.framework.GraphTransferInfo$NodeInfo value]
    (-> this (.setNodeInfo index value))))

(defn get-graph-output-node-info-count
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  returns: `int`"
  (^Integer [^GraphTransferInfo$Builder this]
    (-> this (.getGraphOutputNodeInfoCount))))

(defn add-graph-input-node-info-builder
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.addGraphInputNodeInfoBuilder index)))
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo$Builder [^GraphTransferInfo$Builder this]
    (-> this (.addGraphInputNodeInfoBuilder))))

(defn get-node-output-info
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getNodeOutputInfo index))))

(defn get-const-node-info-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$ConstNodeInfoOrBuilder>`"
  ([^GraphTransferInfo$Builder this]
    (-> this (.getConstNodeInfoOrBuilderList))))

(defn get-graph-input-node-info-builder
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getGraphInputNodeInfoBuilder index))))

(defn set-const-node-info
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  index - `int`
  value - `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index ^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo value]
    (-> this (.setConstNodeInfo index value))))

(defn add-node-input-info-builder
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.addNodeInputInfoBuilder index)))
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$Builder this]
    (-> this (.addNodeInputInfoBuilder))))

(defn get-node-input-info-count
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  returns: `int`"
  (^Integer [^GraphTransferInfo$Builder this]
    (-> this (.getNodeInputInfoCount))))

(defn set-destination
  "Destination of graph transfer
  .tensorflow.GraphTransferInfo.Destination destination = 7;

  value - `org.tensorflow.framework.GraphTransferInfo$Destination`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^org.tensorflow.framework.GraphTransferInfo$Destination value]
    (-> this (.setDestination value))))

(defn set-node-input-info
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  index - `int`
  value - `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index ^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo value]
    (-> this (.setNodeInputInfo index value))))

(defn get-node-info-or-builder
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfoOrBuilder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getNodeInfoOrBuilder index))))

(defn get-graph-output-node-info-list
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo>`"
  (^java.util.List [^GraphTransferInfo$Builder this]
    (-> this (.getGraphOutputNodeInfoList))))

(defn get-graph-output-node-info-builder
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getGraphOutputNodeInfoBuilder index))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn get-const-node-info
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getConstNodeInfo index))))

(defn clear-destination
  "Destination of graph transfer
  .tensorflow.GraphTransferInfo.Destination destination = 7;

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this]
    (-> this (.clearDestination))))

(defn get-const-node-info-builder
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getConstNodeInfoBuilder index))))

(defn build-partial
  "returns: `org.tensorflow.framework.GraphTransferInfo`"
  (^org.tensorflow.framework.GraphTransferInfo [^GraphTransferInfo$Builder this]
    (-> this (.buildPartial))))

(defn clear-node-output-info
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this]
    (-> this (.clearNodeOutputInfo))))

(defn get-node-input-info-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$NodeInputInfoOrBuilder>`"
  ([^GraphTransferInfo$Builder this]
    (-> this (.getNodeInputInfoOrBuilderList))))

(defn get-graph-output-node-info-builder-list
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo$Builder>`"
  (^java.util.List [^GraphTransferInfo$Builder this]
    (-> this (.getGraphOutputNodeInfoBuilderList))))

(defn get-const-node-info-list
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo>`"
  (^java.util.List [^GraphTransferInfo$Builder this]
    (-> this (.getConstNodeInfoList))))

(defn get-const-node-info-count
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$Builder this]
    (-> this (.getConstNodeInfoCount))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GraphTransferInfo$Builder this]
    (-> this (.isInitialized))))

(defn set-destination-value
  "Destination of graph transfer
  .tensorflow.GraphTransferInfo.Destination destination = 7;

  value - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer value]
    (-> this (.setDestinationValue value))))

(defn set-graph-input-node-info
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  index - `int`
  value - `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index ^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo value]
    (-> this (.setGraphInputNodeInfo index value))))

(defn get-node-info-count
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  returns: `int`"
  (^Integer [^GraphTransferInfo$Builder this]
    (-> this (.getNodeInfoCount))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo`"
  (^org.tensorflow.framework.GraphTransferInfo [^GraphTransferInfo$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-graph-input-node-info-or-builder-list
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfoOrBuilder>`"
  ([^GraphTransferInfo$Builder this]
    (-> this (.getGraphInputNodeInfoOrBuilderList))))

(defn add-graph-input-node-info
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  index - `int`
  value - `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index ^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo value]
    (-> this (.addGraphInputNodeInfo index value)))
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo value]
    (-> this (.addGraphInputNodeInfo value))))

(defn remove-node-output-info
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.removeNodeOutputInfo index))))

(defn get-destination
  "Destination of graph transfer
  .tensorflow.GraphTransferInfo.Destination destination = 7;

  returns: `org.tensorflow.framework.GraphTransferInfo$Destination`"
  (^org.tensorflow.framework.GraphTransferInfo$Destination [^GraphTransferInfo$Builder this]
    (-> this (.getDestination))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-const-node-info-builder-list
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder>`"
  (^java.util.List [^GraphTransferInfo$Builder this]
    (-> this (.getConstNodeInfoBuilderList))))

(defn add-graph-output-node-info-builder
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.addGraphOutputNodeInfoBuilder index)))
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo$Builder [^GraphTransferInfo$Builder this]
    (-> this (.addGraphOutputNodeInfoBuilder))))

(defn remove-const-node-info
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.removeConstNodeInfo index))))

(defn add-all-graph-output-node-info
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^java.lang.Iterable values]
    (-> this (.addAllGraphOutputNodeInfo values))))

(defn add-node-info-builder
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.addNodeInfoBuilder index)))
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$Builder this]
    (-> this (.addNodeInfoBuilder))))

(defn set-node-output-info
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  index - `int`
  value - `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index ^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo value]
    (-> this (.setNodeOutputInfo index value))))

(defn clear-const-node-info
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this]
    (-> this (.clearConstNodeInfo))))

(defn clear-graph-input-node-info
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this]
    (-> this (.clearGraphInputNodeInfo))))

(defn get-graph-output-node-info-or-builder
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfoOrBuilder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getGraphOutputNodeInfoOrBuilder index))))

(defn get-graph-input-node-info-or-builder
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfoOrBuilder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getGraphInputNodeInfoOrBuilder index))))

(defn get-destination-value
  "Destination of graph transfer
  .tensorflow.GraphTransferInfo.Destination destination = 7;

  returns: `int`"
  (^Integer [^GraphTransferInfo$Builder this]
    (-> this (.getDestinationValue))))

(defn get-node-input-info-builder-list
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder>`"
  (^java.util.List [^GraphTransferInfo$Builder this]
    (-> this (.getNodeInputInfoBuilderList))))

(defn get-node-output-info-count
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  returns: `int`"
  (^Integer [^GraphTransferInfo$Builder this]
    (-> this (.getNodeOutputInfoCount))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-const-node-info-or-builder
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfoOrBuilder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getConstNodeInfoOrBuilder index))))

(defn get-node-info-builder-list
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder>`"
  (^java.util.List [^GraphTransferInfo$Builder this]
    (-> this (.getNodeInfoBuilderList))))

(defn get-graph-input-node-info-count
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  returns: `int`"
  (^Integer [^GraphTransferInfo$Builder this]
    (-> this (.getGraphInputNodeInfoCount))))

(defn get-graph-output-node-info
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getGraphOutputNodeInfo index))))

(defn add-const-node-info
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  index - `int`
  value - `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index ^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo value]
    (-> this (.addConstNodeInfo index value)))
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo value]
    (-> this (.addConstNodeInfo value))))

(defn clear-node-info
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this]
    (-> this (.clearNodeInfo))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn add-all-node-info
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^java.lang.Iterable values]
    (-> this (.addAllNodeInfo values))))

(defn add-all-node-output-info
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^java.lang.Iterable values]
    (-> this (.addAllNodeOutputInfo values))))

(defn build
  "returns: `org.tensorflow.framework.GraphTransferInfo`"
  (^org.tensorflow.framework.GraphTransferInfo [^GraphTransferInfo$Builder this]
    (-> this (.build))))

(defn clear-graph-output-node-info
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this]
    (-> this (.clearGraphOutputNodeInfo))))

(defn remove-node-input-info
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.removeNodeInputInfo index))))

(defn add-graph-output-node-info
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  index - `int`
  value - `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index ^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo value]
    (-> this (.addGraphOutputNodeInfo index value)))
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo value]
    (-> this (.addGraphOutputNodeInfo value))))

(defn get-node-output-info-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$NodeOutputInfoOrBuilder>`"
  ([^GraphTransferInfo$Builder this]
    (-> this (.getNodeOutputInfoOrBuilderList))))

(defn remove-node-info
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.removeNodeInfo index))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-node-output-info-list
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo>`"
  (^java.util.List [^GraphTransferInfo$Builder this]
    (-> this (.getNodeOutputInfoList))))

(defn get-node-input-info-list
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$NodeInputInfo>`"
  (^java.util.List [^GraphTransferInfo$Builder this]
    (-> this (.getNodeInputInfoList))))

(defn get-graph-input-node-info-list
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo>`"
  (^java.util.List [^GraphTransferInfo$Builder this]
    (-> this (.getGraphInputNodeInfoList))))

(defn get-node-output-info-builder-list
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder>`"
  (^java.util.List [^GraphTransferInfo$Builder this]
    (-> this (.getNodeOutputInfoBuilderList))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clear-node-input-info
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this]
    (-> this (.clearNodeInputInfo))))

(defn clone
  "returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^GraphTransferInfo$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-node-input-info-builder
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getNodeInputInfoBuilder index))))

(defn add-all-node-input-info
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^java.lang.Iterable values]
    (-> this (.addAllNodeInputInfo values))))

(defn add-node-info
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  index - `int`
  value - `org.tensorflow.framework.GraphTransferInfo$NodeInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index ^org.tensorflow.framework.GraphTransferInfo$NodeInfo value]
    (-> this (.addNodeInfo index value)))
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^org.tensorflow.framework.GraphTransferInfo$NodeInfo value]
    (-> this (.addNodeInfo value))))

(defn add-node-input-info
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  index - `int`
  value - `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index ^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo value]
    (-> this (.addNodeInputInfo index value)))
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo value]
    (-> this (.addNodeInputInfo value))))

(defn get-node-info-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$NodeInfoOrBuilder>`"
  ([^GraphTransferInfo$Builder this]
    (-> this (.getNodeInfoOrBuilderList))))

(defn get-node-info
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getNodeInfo index))))

(defn get-node-input-info
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getNodeInputInfo index))))

(defn remove-graph-output-node-info
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.removeGraphOutputNodeInfo index))))

(defn get-graph-output-node-info-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfoOrBuilder>`"
  ([^GraphTransferInfo$Builder this]
    (-> this (.getGraphOutputNodeInfoOrBuilderList))))

(defn clear
  "returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this]
    (-> this (.clear))))

(defn get-node-info-builder
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getNodeInfoBuilder index))))

(defn add-const-node-info-builder
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.addConstNodeInfoBuilder index)))
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$Builder this]
    (-> this (.addConstNodeInfoBuilder))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-graph-input-node-info-builder-list
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo$Builder>`"
  (^java.util.List [^GraphTransferInfo$Builder this]
    (-> this (.getGraphInputNodeInfoBuilderList))))

(defn add-node-output-info
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  index - `int`
  value - `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index ^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo value]
    (-> this (.addNodeOutputInfo index value)))
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo value]
    (-> this (.addNodeOutputInfo value))))

(defn set-graph-output-node-info
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  index - `int`
  value - `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index ^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo value]
    (-> this (.setGraphOutputNodeInfo index value))))

(defn add-all-const-node-info
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^java.lang.Iterable values]
    (-> this (.addAllConstNodeInfo values))))

(defn get-node-output-info-builder
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getNodeOutputInfoBuilder index))))

(defn remove-graph-input-node-info
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.removeGraphInputNodeInfo index))))

(defn add-all-graph-input-node-info
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo$Builder this ^java.lang.Iterable values]
    (-> this (.addAllGraphInputNodeInfo values))))

(defn add-node-output-info-builder
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.addNodeOutputInfoBuilder index)))
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$Builder this]
    (-> this (.addNodeOutputInfoBuilder))))

(defn get-node-info-list
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$NodeInfo>`"
  (^java.util.List [^GraphTransferInfo$Builder this]
    (-> this (.getNodeInfoList))))

(defn get-node-input-info-or-builder
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfoOrBuilder [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getNodeInputInfoOrBuilder index))))

(defn get-graph-input-node-info
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo [^GraphTransferInfo$Builder this ^Integer index]
    (-> this (.getGraphInputNodeInfo index))))

