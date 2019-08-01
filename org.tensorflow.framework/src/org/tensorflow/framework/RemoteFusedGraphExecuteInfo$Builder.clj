(ns org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder
  " Protocol buffer representing a handle to a tensorflow resource. Handles are
  not valid across executions, but can be serialized back and forth from within
  a single run.
 Protobuf type tensorflow.RemoteFusedGraphExecuteInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework RemoteFusedGraphExecuteInfo$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (RemoteFusedGraphExecuteInfo$Builder/getDescriptor )))

(defn get-graph-input-node-name-list
  "Remote fused graph input node name
  repeated string graph_input_node_name = 2;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getGraphInputNodeNameList))))

(defn add-graph-input-node-name
  "Remote fused graph input node name
  repeated string graph_input_node_name = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^java.lang.String value]
    (-> this (.addGraphInputNodeName value))))

(defn add-all-default-graph-output-tensor-shape
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^java.lang.Iterable values]
    (-> this (.addAllDefaultGraphOutputTensorShape values))))

(defn add-graph-output-node-name-bytes
  "Remote fused graph output node name
  repeated string graph_output_node_name = 3;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.addGraphOutputNodeNameBytes value))))

(defn get-default-graph-output-tensor-shape-or-builder
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index]
    (-> this (.getDefaultGraphOutputTensorShapeOrBuilder index))))

(defn get-default-graph-output-tensor-shape-builder
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index]
    (-> this (.getDefaultGraphOutputTensorShapeBuilder index))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn add-all-default-graph-input-tensor-shape
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^java.lang.Iterable values]
    (-> this (.addAllDefaultGraphInputTensorShape values))))

(defn get-default-graph-input-tensor-shape-list
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  returns: `java.util.List<org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto>`"
  (^java.util.List [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getDefaultGraphInputTensorShapeList))))

(defn build-partial
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.buildPartial))))

(defn get-default-graph-output-tensor-shape-builder-list
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  returns: `java.util.List<org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder>`"
  (^java.util.List [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getDefaultGraphOutputTensorShapeBuilderList))))

(defn get-default-graph-input-tensor-shape
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index]
    (-> this (.getDefaultGraphInputTensorShape index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.isInitialized))))

(defn clear-graph-input-node-name
  "Remote fused graph input node name
  repeated string graph_input_node_name = 2;

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.clearGraphInputNodeName))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn add-graph-output-node-name
  "Remote fused graph output node name
  repeated string graph_output_node_name = 3;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^java.lang.String value]
    (-> this (.addGraphOutputNodeName value))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-executor-name-bytes
  "Executor's name
  string executor_name = 4;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setExecutorNameBytes value))))

(defn set-graph-output-node-name
  "Remote fused graph output node name
  repeated string graph_output_node_name = 3;

  index - `int`
  value - `java.lang.String`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index ^java.lang.String value]
    (-> this (.setGraphOutputNodeName index value))))

(defn get-default-graph-output-tensor-shape-list
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  returns: `java.util.List<org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto>`"
  (^java.util.List [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getDefaultGraphOutputTensorShapeList))))

(defn get-default-graph-output-tensor-shape-or-builder-list
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  returns: `java.util.List<? extends org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder>`"
  ([^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getDefaultGraphOutputTensorShapeOrBuilderList))))

(defn add-all-graph-output-node-name
  "Remote fused graph output node name
  repeated string graph_output_node_name = 3;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^java.lang.Iterable values]
    (-> this (.addAllGraphOutputNodeName values))))

(defn clear-default-graph-input-tensor-shape
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.clearDefaultGraphInputTensorShape))))

(defn get-graph-input-node-name-count
  "Remote fused graph input node name
  repeated string graph_input_node_name = 2;

  returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getGraphInputNodeNameCount))))

(defn add-default-graph-output-tensor-shape
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  index - `int`
  value - `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index ^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto value]
    (-> this (.addDefaultGraphOutputTensorShape index value)))
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto value]
    (-> this (.addDefaultGraphOutputTensorShape value))))

(defn set-executor-name
  "Executor's name
  string executor_name = 4;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^java.lang.String value]
    (-> this (.setExecutorName value))))

(defn clear-executor-name
  "Executor's name
  string executor_name = 4;

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.clearExecutorName))))

(defn get-remote-graph-or-builder
  "Definition of remote graph
  .tensorflow.GraphDef remote_graph = 1;

  returns: `org.tensorflow.framework.GraphDefOrBuilder`"
  (^org.tensorflow.framework.GraphDefOrBuilder [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getRemoteGraphOrBuilder))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn merge-remote-graph
  "Definition of remote graph
  .tensorflow.GraphDef remote_graph = 1;

  value - `org.tensorflow.framework.GraphDef`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^org.tensorflow.framework.GraphDef value]
    (-> this (.mergeRemoteGraph value))))

(defn clear-default-graph-output-tensor-shape
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.clearDefaultGraphOutputTensorShape))))

(defn get-default-graph-input-tensor-shape-builder
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index]
    (-> this (.getDefaultGraphInputTensorShapeBuilder index))))

(defn add-default-graph-input-tensor-shape
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  index - `int`
  value - `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index ^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto value]
    (-> this (.addDefaultGraphInputTensorShape index value)))
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto value]
    (-> this (.addDefaultGraphInputTensorShape value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.build))))

(defn set-serialized-executor-parameters
  "Optional: Parameters given to the executor
  bytes serialized_executor_parameters = 5;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setSerializedExecutorParameters value))))

(defn add-all-graph-input-node-name
  "Remote fused graph input node name
  repeated string graph_input_node_name = 2;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^java.lang.Iterable values]
    (-> this (.addAllGraphInputNodeName values))))

(defn get-graph-input-node-name
  "Remote fused graph input node name
  repeated string graph_input_node_name = 2;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index]
    (-> this (.getGraphInputNodeName index))))

(defn set-default-graph-input-tensor-shape
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  index - `int`
  value - `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index ^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto value]
    (-> this (.setDefaultGraphInputTensorShape index value))))

(defn add-default-graph-input-tensor-shape-builder
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index]
    (-> this (.addDefaultGraphInputTensorShapeBuilder index)))
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.addDefaultGraphInputTensorShapeBuilder))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-remote-graph-builder
  "Definition of remote graph
  .tensorflow.GraphDef remote_graph = 1;

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getRemoteGraphBuilder))))

(defn get-serialized-executor-parameters
  "Optional: Parameters given to the executor
  bytes serialized_executor_parameters = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getSerializedExecutorParameters))))

(defn get-graph-output-node-name-bytes
  "Remote fused graph output node name
  repeated string graph_output_node_name = 3;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index]
    (-> this (.getGraphOutputNodeNameBytes index))))

(defn add-default-graph-output-tensor-shape-builder
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index]
    (-> this (.addDefaultGraphOutputTensorShapeBuilder index)))
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.addDefaultGraphOutputTensorShapeBuilder))))

(defn add-graph-input-node-name-bytes
  "Remote fused graph input node name
  repeated string graph_input_node_name = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.addGraphInputNodeNameBytes value))))

(defn get-default-graph-input-tensor-shape-builder-list
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  returns: `java.util.List<org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder>`"
  (^java.util.List [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getDefaultGraphInputTensorShapeBuilderList))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clear-serialized-executor-parameters
  "Optional: Parameters given to the executor
  bytes serialized_executor_parameters = 5;

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.clearSerializedExecutorParameters))))

(defn get-default-graph-output-tensor-shape-count
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getDefaultGraphOutputTensorShapeCount))))

(defn clone
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.clone))))

(defn get-graph-output-node-name-count
  "Remote fused graph output node name
  repeated string graph_output_node_name = 3;

  returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getGraphOutputNodeNameCount))))

(defn remove-default-graph-output-tensor-shape
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index]
    (-> this (.removeDefaultGraphOutputTensorShape index))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getDescriptorForType))))

(defn set-graph-input-node-name
  "Remote fused graph input node name
  repeated string graph_input_node_name = 2;

  index - `int`
  value - `java.lang.String`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index ^java.lang.String value]
    (-> this (.setGraphInputNodeName index value))))

(defn get-graph-output-node-name
  "Remote fused graph output node name
  repeated string graph_output_node_name = 3;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index]
    (-> this (.getGraphOutputNodeName index))))

(defn get-graph-input-node-name-bytes
  "Remote fused graph input node name
  repeated string graph_input_node_name = 2;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index]
    (-> this (.getGraphInputNodeNameBytes index))))

(defn set-remote-graph
  "Definition of remote graph
  .tensorflow.GraphDef remote_graph = 1;

  value - `org.tensorflow.framework.GraphDef`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^org.tensorflow.framework.GraphDef value]
    (-> this (.setRemoteGraph value))))

(defn get-graph-output-node-name-list
  "Remote fused graph output node name
  repeated string graph_output_node_name = 3;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getGraphOutputNodeNameList))))

(defn set-default-graph-output-tensor-shape
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  index - `int`
  value - `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index ^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto value]
    (-> this (.setDefaultGraphOutputTensorShape index value))))

(defn get-default-graph-input-tensor-shape-or-builder
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index]
    (-> this (.getDefaultGraphInputTensorShapeOrBuilder index))))

(defn get-default-graph-input-tensor-shape-or-builder-list
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  returns: `java.util.List<? extends org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProtoOrBuilder>`"
  ([^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getDefaultGraphInputTensorShapeOrBuilderList))))

(defn get-remote-graph
  "Definition of remote graph
  .tensorflow.GraphDef remote_graph = 1;

  returns: `org.tensorflow.framework.GraphDef`"
  (^org.tensorflow.framework.GraphDef [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getRemoteGraph))))

(defn clear
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.clear))))

(defn get-executor-name
  "Executor's name
  string executor_name = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getExecutorName))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn remove-default-graph-input-tensor-shape
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index]
    (-> this (.removeDefaultGraphInputTensorShape index))))

(defn get-executor-name-bytes
  "Executor's name
  string executor_name = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getExecutorNameBytes))))

(defn clear-graph-output-node-name
  "Remote fused graph output node name
  repeated string graph_output_node_name = 3;

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.clearGraphOutputNodeName))))

(defn has-remote-graph?
  "Definition of remote graph
  .tensorflow.GraphDef remote_graph = 1;

  returns: `boolean`"
  (^Boolean [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.hasRemoteGraph))))

(defn get-default-graph-input-tensor-shape-count
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_input_tensor_shape = 6;

  returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.getDefaultGraphInputTensorShapeCount))))

(defn clear-remote-graph
  "Definition of remote graph
  .tensorflow.GraphDef remote_graph = 1;

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$Builder [^RemoteFusedGraphExecuteInfo$Builder this]
    (-> this (.clearRemoteGraph))))

(defn get-default-graph-output-tensor-shape
  "Optional: Default graph input tensor shape used to allocate memory
   before executing op
   TODO(satok): Remote output tensor shape once shape information is stored
   in NodeDef
  repeated .tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto default_graph_output_tensor_shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto [^RemoteFusedGraphExecuteInfo$Builder this ^Integer index]
    (-> this (.getDefaultGraphOutputTensorShape index))))

