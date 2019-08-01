(ns org.tensorflow.framework.GraphTransferInfo
  " Protocol buffer representing a handle to a tensorflow resource. Handles are
  not valid across executions, but can be serialized back and forth from within
  a single run.
 Protobuf type tensorflow.GraphTransferInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo]))

(def *-node-info-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo/NODE_INFO_FIELD_NUMBER)

(def *-const-node-info-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo/CONST_NODE_INFO_FIELD_NUMBER)

(def *-node-input-info-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo/NODE_INPUT_INFO_FIELD_NUMBER)

(def *-node-output-info-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo/NODE_OUTPUT_INFO_FIELD_NUMBER)

(def *-graph-input-node-info-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo/GRAPH_INPUT_NODE_INFO_FIELD_NUMBER)

(def *-graph-output-node-info-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo/GRAPH_OUTPUT_NODE_INFO_FIELD_NUMBER)

(def *-destination-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo/DESTINATION_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GraphTransferInfo/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.GraphTransferInfo [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphTransferInfo/parseFrom data extension-registry))
  (^org.tensorflow.framework.GraphTransferInfo [^java.nio.ByteBuffer data]
    (GraphTransferInfo/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GraphTransferInfo [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphTransferInfo/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.GraphTransferInfo [^java.io.InputStream input]
    (GraphTransferInfo/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.GraphTransferInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^org.tensorflow.framework.GraphTransferInfo prototype]
    (GraphTransferInfo/newBuilder prototype))
  (^org.tensorflow.framework.GraphTransferInfo$Builder []
    (GraphTransferInfo/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.GraphTransferInfo`"
  (^org.tensorflow.framework.GraphTransferInfo []
    (GraphTransferInfo/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphTransferInfo>`"
  (^com.github.os72.protobuf351.Parser []
    (GraphTransferInfo/parser )))

(defn get-node-output-info-or-builder
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfoOrBuilder [^GraphTransferInfo this ^Integer index]
    (-> this (.getNodeOutputInfoOrBuilder index))))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^GraphTransferInfo this]
    (-> this (.getUnknownFields))))

(defn get-graph-output-node-info-count
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  returns: `int`"
  (^Integer [^GraphTransferInfo this]
    (-> this (.getGraphOutputNodeInfoCount))))

(defn get-node-output-info
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo [^GraphTransferInfo this ^Integer index]
    (-> this (.getNodeOutputInfo index))))

(defn get-const-node-info-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$ConstNodeInfoOrBuilder>`"
  ([^GraphTransferInfo this]
    (-> this (.getConstNodeInfoOrBuilderList))))

(defn get-node-input-info-count
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  returns: `int`"
  (^Integer [^GraphTransferInfo this]
    (-> this (.getNodeInputInfoCount))))

(defn get-node-info-or-builder
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfoOrBuilder [^GraphTransferInfo this ^Integer index]
    (-> this (.getNodeInfoOrBuilder index))))

(defn get-graph-output-node-info-list
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo>`"
  (^java.util.List [^GraphTransferInfo this]
    (-> this (.getGraphOutputNodeInfoList))))

(defn get-const-node-info
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo [^GraphTransferInfo this ^Integer index]
    (-> this (.getConstNodeInfo index))))

(defn get-node-input-info-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$NodeInputInfoOrBuilder>`"
  ([^GraphTransferInfo this]
    (-> this (.getNodeInputInfoOrBuilderList))))

(defn get-const-node-info-list
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo>`"
  (^java.util.List [^GraphTransferInfo this]
    (-> this (.getConstNodeInfoList))))

(defn get-const-node-info-count
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo this]
    (-> this (.getConstNodeInfoCount))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GraphTransferInfo this]
    (-> this (.isInitialized))))

(defn get-node-info-count
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  returns: `int`"
  (^Integer [^GraphTransferInfo this]
    (-> this (.getNodeInfoCount))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo`"
  (^org.tensorflow.framework.GraphTransferInfo [^GraphTransferInfo this]
    (-> this (.getDefaultInstanceForType))))

(defn get-graph-input-node-info-or-builder-list
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfoOrBuilder>`"
  ([^GraphTransferInfo this]
    (-> this (.getGraphInputNodeInfoOrBuilderList))))

(defn get-destination
  "Destination of graph transfer
  .tensorflow.GraphTransferInfo.Destination destination = 7;

  returns: `org.tensorflow.framework.GraphTransferInfo$Destination`"
  (^org.tensorflow.framework.GraphTransferInfo$Destination [^GraphTransferInfo this]
    (-> this (.getDestination))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^GraphTransferInfo this]
    (-> this (.getSerializedSize))))

(defn get-graph-output-node-info-or-builder
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfoOrBuilder [^GraphTransferInfo this ^Integer index]
    (-> this (.getGraphOutputNodeInfoOrBuilder index))))

(defn get-graph-input-node-info-or-builder
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfoOrBuilder [^GraphTransferInfo this ^Integer index]
    (-> this (.getGraphInputNodeInfoOrBuilder index))))

(defn get-destination-value
  "Destination of graph transfer
  .tensorflow.GraphTransferInfo.Destination destination = 7;

  returns: `int`"
  (^Integer [^GraphTransferInfo this]
    (-> this (.getDestinationValue))))

(defn get-node-output-info-count
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  returns: `int`"
  (^Integer [^GraphTransferInfo this]
    (-> this (.getNodeOutputInfoCount))))

(defn get-const-node-info-or-builder
  "repeated .tensorflow.GraphTransferInfo.ConstNodeInfo const_node_info = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfoOrBuilder [^GraphTransferInfo this ^Integer index]
    (-> this (.getConstNodeInfoOrBuilder index))))

(defn get-graph-input-node-info-count
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  returns: `int`"
  (^Integer [^GraphTransferInfo this]
    (-> this (.getGraphInputNodeInfoCount))))

(defn get-graph-output-node-info
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo [^GraphTransferInfo this ^Integer index]
    (-> this (.getGraphOutputNodeInfo index))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^GraphTransferInfo this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-node-output-info-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$NodeOutputInfoOrBuilder>`"
  ([^GraphTransferInfo this]
    (-> this (.getNodeOutputInfoOrBuilderList))))

(defn get-node-output-info-list
  "repeated .tensorflow.GraphTransferInfo.NodeOutputInfo node_output_info = 4;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo>`"
  (^java.util.List [^GraphTransferInfo this]
    (-> this (.getNodeOutputInfoList))))

(defn get-node-input-info-list
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$NodeInputInfo>`"
  (^java.util.List [^GraphTransferInfo this]
    (-> this (.getNodeInputInfoList))))

(defn get-graph-input-node-info-list
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo>`"
  (^java.util.List [^GraphTransferInfo this]
    (-> this (.getGraphInputNodeInfoList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GraphTransferInfo this]
    (-> this (.hashCode))))

(defn get-node-info-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$NodeInfoOrBuilder>`"
  ([^GraphTransferInfo this]
    (-> this (.getNodeInfoOrBuilderList))))

(defn get-node-info
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo [^GraphTransferInfo this ^Integer index]
    (-> this (.getNodeInfo index))))

(defn get-node-input-info
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo [^GraphTransferInfo this ^Integer index]
    (-> this (.getNodeInputInfo index))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphTransferInfo>`"
  (^com.github.os72.protobuf351.Parser [^GraphTransferInfo this]
    (-> this (.getParserForType))))

(defn get-graph-output-node-info-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.GraphOutputNodeInfo graph_output_node_info = 6;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfoOrBuilder>`"
  ([^GraphTransferInfo this]
    (-> this (.getGraphOutputNodeInfoOrBuilderList))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GraphTransferInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo this]
    (-> this (.newBuilderForType))))

(defn get-node-info-list
  "repeated .tensorflow.GraphTransferInfo.NodeInfo node_info = 1;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$NodeInfo>`"
  (^java.util.List [^GraphTransferInfo this]
    (-> this (.getNodeInfoList))))

(defn to-builder
  "returns: `org.tensorflow.framework.GraphTransferInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$Builder [^GraphTransferInfo this]
    (-> this (.toBuilder))))

(defn get-node-input-info-or-builder
  "repeated .tensorflow.GraphTransferInfo.NodeInputInfo node_input_info = 3;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfoOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfoOrBuilder [^GraphTransferInfo this ^Integer index]
    (-> this (.getNodeInputInfoOrBuilder index))))

(defn get-graph-input-node-info
  "Input Node parameters of transferred graph
  repeated .tensorflow.GraphTransferInfo.GraphInputNodeInfo graph_input_node_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo [^GraphTransferInfo this ^Integer index]
    (-> this (.getGraphInputNodeInfo index))))

