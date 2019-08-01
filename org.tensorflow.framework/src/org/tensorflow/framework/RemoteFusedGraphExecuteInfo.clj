(ns org.tensorflow.framework.RemoteFusedGraphExecuteInfo
  " Protocol buffer representing a handle to a tensorflow resource. Handles are
  not valid across executions, but can be serialized back and forth from within
  a single run.
 Protobuf type tensorflow.RemoteFusedGraphExecuteInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework RemoteFusedGraphExecuteInfo]))

(def *-remote-graph-field-number
  "Static Constant.

  type: int"
  RemoteFusedGraphExecuteInfo/REMOTE_GRAPH_FIELD_NUMBER)

(def *-graph-input-node-name-field-number
  "Static Constant.

  type: int"
  RemoteFusedGraphExecuteInfo/GRAPH_INPUT_NODE_NAME_FIELD_NUMBER)

(def *-graph-output-node-name-field-number
  "Static Constant.

  type: int"
  RemoteFusedGraphExecuteInfo/GRAPH_OUTPUT_NODE_NAME_FIELD_NUMBER)

(def *-executor-name-field-number
  "Static Constant.

  type: int"
  RemoteFusedGraphExecuteInfo/EXECUTOR_NAME_FIELD_NUMBER)

(def *-serialized-executor-parameters-field-number
  "Static Constant.

  type: int"
  RemoteFusedGraphExecuteInfo/SERIALIZED_EXECUTOR_PARAMETERS_FIELD_NUMBER)

(def *-default-graph-input-tensor-shape-field-number
  "Static Constant.

  type: int"
  RemoteFusedGraphExecuteInfo/DEFAULT_GRAPH_INPUT_TENSOR_SHAPE_FIELD_NUMBER)

(def *-default-graph-output-tensor-shape-field-number
  "Static Constant.

  type: int"
  RemoteFusedGraphExecuteInfo/DEFAULT_GRAPH_OUTPUT_TENSOR_SHAPE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (RemoteFusedGraphExecuteInfo/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (RemoteFusedGraphExecuteInfo/parseFrom data extension-registry))
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo [^java.nio.ByteBuffer data]
    (RemoteFusedGraphExecuteInfo/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo`

  throws: java.io.IOException"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (RemoteFusedGraphExecuteInfo/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo [^java.io.InputStream input]
    (RemoteFusedGraphExecuteInfo/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.RemoteFusedGraphExecuteInfo`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^org.tensorflow.framework.RemoteFusedGraphExecuteInfo prototype]
    (RemoteFusedGraphExecuteInfo/newBuilder prototype))
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder []
    (RemoteFusedGraphExecuteInfo/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo []
    (RemoteFusedGraphExecuteInfo/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.RemoteFusedGraphExecuteInfo>`"
  (^com.github.os72.protobuf351.Parser []
    (RemoteFusedGraphExecuteInfo/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^RemoteFusedGraphExecuteInfo this]
    (-> this (.getUnknownFields))))

(defn get-graph-input-node-name-list
  "Remote fused graph input node name
  repeated string graph_input_node_name = 2;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^RemoteFusedGraphExecuteInfo this]
    (-> this (.getGraphInputNodeNameList))))

(defn get-default-graph-output-tensor-shape-or-builder
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder [^RemoteFusedGraphExecuteInfo this ^Integer index]
    (-> this (.getDefaultGraphOutputTensorShapeOrBuilder index))))

(defn get-default-graph-input-tensor-shape-list
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  returns: `java.util.List<org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto>`"
  (^java.util.List [^RemoteFusedGraphExecuteInfo this]
    (-> this (.getDefaultGraphInputTensorShapeList))))

(defn get-default-graph-input-tensor-shape
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto [^RemoteFusedGraphExecuteInfo this ^Integer index]
    (-> this (.getDefaultGraphInputTensorShape index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^RemoteFusedGraphExecuteInfo this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo [^RemoteFusedGraphExecuteInfo this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfo this]
    (-> this (.getSerializedSize))))

(defn get-default-graph-output-tensor-shape-list
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  returns: `java.util.List<org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto>`"
  (^java.util.List [^RemoteFusedGraphExecuteInfo this]
    (-> this (.getDefaultGraphOutputTensorShapeList))))

(defn get-default-graph-output-tensor-shape-or-builder-list
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  returns: `java.util.List<? extends org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder>`"
  ([^RemoteFusedGraphExecuteInfo this]
    (-> this (.getDefaultGraphOutputTensorShapeOrBuilderList))))

(defn get-graph-input-node-name-count
  "Remote fused graph input node name
  repeated string graph_input_node_name = 2;

  returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfo this]
    (-> this (.getGraphInputNodeNameCount))))

(defn get-remote-graph-or-builder
  "Definition of remote graph
  .tensorflow.GraphDef remote_graph = 1;

  returns: `org.tensorflow.framework.GraphDefOrBuilder`"
  (^org.tensorflow.framework.GraphDefOrBuilder [^RemoteFusedGraphExecuteInfo this]
    (-> this (.getRemoteGraphOrBuilder))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^RemoteFusedGraphExecuteInfo this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-graph-input-node-name
  "Remote fused graph input node name
  repeated string graph_input_node_name = 2;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^RemoteFusedGraphExecuteInfo this ^Integer index]
    (-> this (.getGraphInputNodeName index))))

(defn get-serialized-executor-parameters
  "Optional: Parameters given to the executor
  bytes serialized_executor_parameters = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^RemoteFusedGraphExecuteInfo this]
    (-> this (.getSerializedExecutorParameters))))

(defn get-graph-output-node-name-bytes
  "Remote fused graph output node name
  repeated string graph_output_node_name = 3;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^RemoteFusedGraphExecuteInfo this ^Integer index]
    (-> this (.getGraphOutputNodeNameBytes index))))

(defn get-default-graph-output-tensor-shape-count
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfo this]
    (-> this (.getDefaultGraphOutputTensorShapeCount))))

(defn get-graph-output-node-name-count
  "Remote fused graph output node name
  repeated string graph_output_node_name = 3;

  returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfo this]
    (-> this (.getGraphOutputNodeNameCount))))

(defn get-graph-output-node-name
  "Remote fused graph output node name
  repeated string graph_output_node_name = 3;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^RemoteFusedGraphExecuteInfo this ^Integer index]
    (-> this (.getGraphOutputNodeName index))))

(defn get-graph-input-node-name-bytes
  "Remote fused graph input node name
  repeated string graph_input_node_name = 2;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^RemoteFusedGraphExecuteInfo this ^Integer index]
    (-> this (.getGraphInputNodeNameBytes index))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfo this]
    (-> this (.hashCode))))

(defn get-graph-output-node-name-list
  "Remote fused graph output node name
  repeated string graph_output_node_name = 3;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^RemoteFusedGraphExecuteInfo this]
    (-> this (.getGraphOutputNodeNameList))))

(defn get-default-graph-input-tensor-shape-or-builder
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder [^RemoteFusedGraphExecuteInfo this ^Integer index]
    (-> this (.getDefaultGraphInputTensorShapeOrBuilder index))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.RemoteFusedGraphExecuteInfo>`"
  (^com.github.os72.protobuf351.Parser [^RemoteFusedGraphExecuteInfo this]
    (-> this (.getParserForType))))

(defn get-default-graph-input-tensor-shape-or-builder-list
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  returns: `java.util.List<? extends org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder>`"
  ([^RemoteFusedGraphExecuteInfo this]
    (-> this (.getDefaultGraphInputTensorShapeOrBuilderList))))

(defn get-remote-graph
  "Definition of remote graph
  .tensorflow.GraphDef remote_graph = 1;

  returns: `org.tensorflow.framework.GraphDef`"
  (^org.tensorflow.framework.GraphDef [^RemoteFusedGraphExecuteInfo this]
    (-> this (.getRemoteGraph))))

(defn get-executor-name
  "Executor's name
  string executor_name = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^RemoteFusedGraphExecuteInfo this]
    (-> this (.getExecutorName))))

(defn get-executor-name-bytes
  "Executor's name
  string executor_name = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^RemoteFusedGraphExecuteInfo this]
    (-> this (.getExecutorNameBytes))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RemoteFusedGraphExecuteInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn has-remote-graph?
  "Definition of remote graph
  .tensorflow.GraphDef remote_graph = 1;

  returns: `boolean`"
  (^Boolean [^RemoteFusedGraphExecuteInfo this]
    (-> this (.hasRemoteGraph))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo this]
    (-> this (.newBuilderForType))))

(defn get-default-graph-input-tensor-shape-count
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfo this]
    (-> this (.getDefaultGraphInputTensorShapeCount))))

(defn get-default-graph-output-tensor-shape
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto [^RemoteFusedGraphExecuteInfo this ^Integer index]
    (-> this (.getDefaultGraphOutputTensorShape index))))

(defn to-builder
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo this]
    (-> this (.toBuilder))))

