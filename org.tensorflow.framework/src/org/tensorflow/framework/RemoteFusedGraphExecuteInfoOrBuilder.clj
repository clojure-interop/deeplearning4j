(ns org.tensorflow.framework.RemoteFusedGraphExecuteInfoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework RemoteFusedGraphExecuteInfoOrBuilder]))

(defn get-graph-input-node-name-list
  "Remote fused graph input node name
  repeated string graph_input_node_name = 2;

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RemoteFusedGraphExecuteInfoOrBuilder this]
    (-> this (.getGraphInputNodeNameList))))

(defn get-default-graph-output-tensor-shape-or-builder
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder [^RemoteFusedGraphExecuteInfoOrBuilder this ^Integer index]
    (-> this (.getDefaultGraphOutputTensorShapeOrBuilder index))))

(defn get-default-graph-input-tensor-shape-list
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  returns: `java.util.List<org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto>`"
  (^java.util.List [^RemoteFusedGraphExecuteInfoOrBuilder this]
    (-> this (.getDefaultGraphInputTensorShapeList))))

(defn get-default-graph-input-tensor-shape
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto [^RemoteFusedGraphExecuteInfoOrBuilder this ^Integer index]
    (-> this (.getDefaultGraphInputTensorShape index))))

(defn get-default-graph-output-tensor-shape-list
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  returns: `java.util.List<org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto>`"
  (^java.util.List [^RemoteFusedGraphExecuteInfoOrBuilder this]
    (-> this (.getDefaultGraphOutputTensorShapeList))))

(defn get-default-graph-output-tensor-shape-or-builder-list
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  returns: `java.util.List<? extends org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder>`"
  ([^RemoteFusedGraphExecuteInfoOrBuilder this]
    (-> this (.getDefaultGraphOutputTensorShapeOrBuilderList))))

(defn get-graph-input-node-name-count
  "Remote fused graph input node name
  repeated string graph_input_node_name = 2;

  returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfoOrBuilder this]
    (-> this (.getGraphInputNodeNameCount))))

(defn get-remote-graph-or-builder
  "Definition of remote graph
  .tensorflow.GraphDef remote_graph = 1;

  returns: `org.tensorflow.framework.GraphDefOrBuilder`"
  (^org.tensorflow.framework.GraphDefOrBuilder [^RemoteFusedGraphExecuteInfoOrBuilder this]
    (-> this (.getRemoteGraphOrBuilder))))

(defn get-graph-input-node-name
  "Remote fused graph input node name
  repeated string graph_input_node_name = 2;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^RemoteFusedGraphExecuteInfoOrBuilder this ^Integer index]
    (-> this (.getGraphInputNodeName index))))

(defn get-serialized-executor-parameters
  "Optional: Parameters given to the executor
  bytes serialized_executor_parameters = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^RemoteFusedGraphExecuteInfoOrBuilder this]
    (-> this (.getSerializedExecutorParameters))))

(defn get-graph-output-node-name-bytes
  "Remote fused graph output node name
  repeated string graph_output_node_name = 3;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^RemoteFusedGraphExecuteInfoOrBuilder this ^Integer index]
    (-> this (.getGraphOutputNodeNameBytes index))))

(defn get-default-graph-output-tensor-shape-count
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfoOrBuilder this]
    (-> this (.getDefaultGraphOutputTensorShapeCount))))

(defn get-graph-output-node-name-count
  "Remote fused graph output node name
  repeated string graph_output_node_name = 3;

  returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfoOrBuilder this]
    (-> this (.getGraphOutputNodeNameCount))))

(defn get-graph-output-node-name
  "Remote fused graph output node name
  repeated string graph_output_node_name = 3;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^RemoteFusedGraphExecuteInfoOrBuilder this ^Integer index]
    (-> this (.getGraphOutputNodeName index))))

(defn get-graph-input-node-name-bytes
  "Remote fused graph input node name
  repeated string graph_input_node_name = 2;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^RemoteFusedGraphExecuteInfoOrBuilder this ^Integer index]
    (-> this (.getGraphInputNodeNameBytes index))))

(defn get-graph-output-node-name-list
  "Remote fused graph output node name
  repeated string graph_output_node_name = 3;

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RemoteFusedGraphExecuteInfoOrBuilder this]
    (-> this (.getGraphOutputNodeNameList))))

(defn get-default-graph-input-tensor-shape-or-builder
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder [^RemoteFusedGraphExecuteInfoOrBuilder this ^Integer index]
    (-> this (.getDefaultGraphInputTensorShapeOrBuilder index))))

(defn get-default-graph-input-tensor-shape-or-builder-list
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  returns: `java.util.List<? extends org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder>`"
  ([^RemoteFusedGraphExecuteInfoOrBuilder this]
    (-> this (.getDefaultGraphInputTensorShapeOrBuilderList))))

(defn get-remote-graph
  "Definition of remote graph
  .tensorflow.GraphDef remote_graph = 1;

  returns: `org.tensorflow.framework.GraphDef`"
  (^org.tensorflow.framework.GraphDef [^RemoteFusedGraphExecuteInfoOrBuilder this]
    (-> this (.getRemoteGraph))))

(defn get-executor-name
  "Executor's name
  string executor_name = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^RemoteFusedGraphExecuteInfoOrBuilder this]
    (-> this (.getExecutorName))))

(defn get-executor-name-bytes
  "Executor's name
  string executor_name = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^RemoteFusedGraphExecuteInfoOrBuilder this]
    (-> this (.getExecutorNameBytes))))

(defn has-remote-graph?
  "Definition of remote graph
  .tensorflow.GraphDef remote_graph = 1;

  returns: `boolean`"
  (^Boolean [^RemoteFusedGraphExecuteInfoOrBuilder this]
    (-> this (.hasRemoteGraph))))

(defn get-default-graph-input-tensor-shape-count
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfoOrBuilder this]
    (-> this (.getDefaultGraphInputTensorShapeCount))))

(defn get-default-graph-output-tensor-shape
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto [^RemoteFusedGraphExecuteInfoOrBuilder this ^Integer index]
    (-> this (.getDefaultGraphOutputTensorShape index))))

