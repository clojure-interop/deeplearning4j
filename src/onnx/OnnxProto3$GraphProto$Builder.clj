(ns onnx.OnnxProto3$GraphProto$Builder
  " GraphProto defines a parameterized series of nodes to form a directed acyclic graph.
  This is the equivalent of the \"network\" and \"graph\" in many deep learning
  frameworks.
 Protobuf type onnx.GraphProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$GraphProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxProto3$GraphProto$Builder/getDescriptor )))

(defn clear-doc-string
  "A human-readable documentation for this graph. Markdown is allowed.
  string doc_string = 10;

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this]
    (-> this (.clearDocString))))

(defn clear-output
  "repeated .onnx.ValueInfoProto output = 12;

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this]
    (-> this (.clearOutput))))

(defn get-input-builder
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxProto3$ValueInfoProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.getInputBuilder index))))

(defn clear-name
  "The name of the graph.
  string name = 2;

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this]
    (-> this (.clearName))))

(defn set-input
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  index - `int`
  value - `onnx.OnnxProto3$ValueInfoProto`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index ^onnx.OnnxProto3$ValueInfoProto value]
    (-> this (.setInput index value))))

(defn remove-initializer
  "A list of named tensor values (constants), used to specify default
   values for some of the inputs of the graph.
   Each TensorProto entry must have a distinct name (within the list) that
   also appears in the input list.
   In an evaluation, the default value specified here is used if and only if
   user specifies no value for the corresponding input parameter.
   May be used to pass serialized parameters for networks.
  repeated .onnx.TensorProto initializer = 5;

  index - `int`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.removeInitializer index))))

(defn add-output-builder
  "repeated .onnx.ValueInfoProto output = 12;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxProto3$ValueInfoProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.addOutputBuilder index)))
  (^onnx.OnnxProto3$ValueInfoProto$Builder [^OnnxProto3$GraphProto$Builder this]
    (-> this (.addOutputBuilder))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn add-all-node
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllNode values))))

(defn get-initializer-or-builder
  "A list of named tensor values (constants), used to specify default
   values for some of the inputs of the graph.
   Each TensorProto entry must have a distinct name (within the list) that
   also appears in the input list.
   In an evaluation, the default value specified here is used if and only if
   user specifies no value for the corresponding input parameter.
   May be used to pass serialized parameters for networks.
  repeated .onnx.TensorProto initializer = 5;

  index - `int`

  returns: `onnx.OnnxProto3$TensorProtoOrBuilder`"
  (^onnx.OnnxProto3$TensorProtoOrBuilder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.getInitializerOrBuilder index))))

(defn remove-input
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  index - `int`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.removeInput index))))

(defn build-partial
  "returns: `onnx.OnnxProto3$GraphProto`"
  (^onnx.OnnxProto3$GraphProto [^OnnxProto3$GraphProto$Builder this]
    (-> this (.buildPartial))))

(defn set-doc-string
  "A human-readable documentation for this graph. Markdown is allowed.
  string doc_string = 10;

  value - `java.lang.String`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^java.lang.String value]
    (-> this (.setDocString value))))

(defn clear-initializer
  "A list of named tensor values (constants), used to specify default
   values for some of the inputs of the graph.
   Each TensorProto entry must have a distinct name (within the list) that
   also appears in the input list.
   In an evaluation, the default value specified here is used if and only if
   user specifies no value for the corresponding input parameter.
   May be used to pass serialized parameters for networks.
  repeated .onnx.TensorProto initializer = 5;

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this]
    (-> this (.clearInitializer))))

(defn add-input-builder
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxProto3$ValueInfoProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.addInputBuilder index)))
  (^onnx.OnnxProto3$ValueInfoProto$Builder [^OnnxProto3$GraphProto$Builder this]
    (-> this (.addInputBuilder))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxProto3$GraphProto$Builder this]
    (-> this (.isInitialized))))

(defn remove-output
  "repeated .onnx.ValueInfoProto output = 12;

  index - `int`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.removeOutput index))))

(defn get-output-builder-list
  "repeated .onnx.ValueInfoProto output = 12;

  returns: `java.util.List<onnx.OnnxProto3$ValueInfoProto$Builder>`"
  (^java.util.List [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getOutputBuilderList))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxProto3$GraphProto`"
  (^onnx.OnnxProto3$GraphProto [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-doc-string-bytes
  "A human-readable documentation for this graph. Markdown is allowed.
  string doc_string = 10;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getDocStringBytes))))

(defn get-node-count
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  returns: `int`"
  (^Integer [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getNodeCount))))

(defn get-value-info-count
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  returns: `int`"
  (^Integer [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getValueInfoCount))))

(defn set-doc-string-bytes
  "A human-readable documentation for this graph. Markdown is allowed.
  string doc_string = 10;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDocStringBytes value))))

(defn get-name-bytes
  "The name of the graph.
  string name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getNameBytes))))

(defn add-node
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  index - `int`
  value - `onnx.OnnxProto3$NodeProto`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index ^onnx.OnnxProto3$NodeProto value]
    (-> this (.addNode index value)))
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^onnx.OnnxProto3$NodeProto value]
    (-> this (.addNode value))))

(defn get-input-count
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  returns: `int`"
  (^Integer [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getInputCount))))

(defn set-output
  "repeated .onnx.ValueInfoProto output = 12;

  index - `int`
  value - `onnx.OnnxProto3$ValueInfoProto`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index ^onnx.OnnxProto3$ValueInfoProto value]
    (-> this (.setOutput index value))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-node-builder
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  index - `int`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.getNodeBuilder index))))

(defn set-name
  "The name of the graph.
  string name = 2;

  value - `java.lang.String`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn get-output-or-builder
  "repeated .onnx.ValueInfoProto output = 12;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProtoOrBuilder`"
  (^onnx.OnnxProto3$ValueInfoProtoOrBuilder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.getOutputOrBuilder index))))

(defn get-value-info-or-builder
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProtoOrBuilder`"
  (^onnx.OnnxProto3$ValueInfoProtoOrBuilder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.getValueInfoOrBuilder index))))

(defn clear-value-info
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this]
    (-> this (.clearValueInfo))))

(defn set-node
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  index - `int`
  value - `onnx.OnnxProto3$NodeProto`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index ^onnx.OnnxProto3$NodeProto value]
    (-> this (.setNode index value))))

(defn get-initializer-builder-list
  "A list of named tensor values (constants), used to specify default
   values for some of the inputs of the graph.
   Each TensorProto entry must have a distinct name (within the list) that
   also appears in the input list.
   In an evaluation, the default value specified here is used if and only if
   user specifies no value for the corresponding input parameter.
   May be used to pass serialized parameters for networks.
  repeated .onnx.TensorProto initializer = 5;

  returns: `java.util.List<onnx.OnnxProto3$TensorProto$Builder>`"
  (^java.util.List [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getInitializerBuilderList))))

(defn get-node
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  index - `int`

  returns: `onnx.OnnxProto3$NodeProto`"
  (^onnx.OnnxProto3$NodeProto [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.getNode index))))

(defn add-all-input
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllInput values))))

(defn get-input-list
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  returns: `java.util.List<onnx.OnnxProto3$ValueInfoProto>`"
  (^java.util.List [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getInputList))))

(defn get-doc-string
  "A human-readable documentation for this graph. Markdown is allowed.
  string doc_string = 10;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getDocString))))

(defn remove-value-info
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  index - `int`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.removeValueInfo index))))

(defn get-node-or-builder
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  index - `int`

  returns: `onnx.OnnxProto3$NodeProtoOrBuilder`"
  (^onnx.OnnxProto3$NodeProtoOrBuilder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.getNodeOrBuilder index))))

(defn get-name
  "The name of the graph.
  string name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-input-or-builder
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProtoOrBuilder`"
  (^onnx.OnnxProto3$ValueInfoProtoOrBuilder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.getInputOrBuilder index))))

(defn set-name-bytes
  "The name of the graph.
  string name = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn get-initializer-builder
  "A list of named tensor values (constants), used to specify default
   values for some of the inputs of the graph.
   Each TensorProto entry must have a distinct name (within the list) that
   also appears in the input list.
   In an evaluation, the default value specified here is used if and only if
   user specifies no value for the corresponding input parameter.
   May be used to pass serialized parameters for networks.
  repeated .onnx.TensorProto initializer = 5;

  index - `int`

  returns: `onnx.OnnxProto3$TensorProto$Builder`"
  (^onnx.OnnxProto3$TensorProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.getInitializerBuilder index))))

(defn add-all-output
  "repeated .onnx.ValueInfoProto output = 12;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllOutput values))))

(defn get-output-list
  "repeated .onnx.ValueInfoProto output = 12;

  returns: `java.util.List<onnx.OnnxProto3$ValueInfoProto>`"
  (^java.util.List [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getOutputList))))

(defn get-input
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProto`"
  (^onnx.OnnxProto3$ValueInfoProto [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.getInput index))))

(defn get-initializer
  "A list of named tensor values (constants), used to specify default
   values for some of the inputs of the graph.
   Each TensorProto entry must have a distinct name (within the list) that
   also appears in the input list.
   In an evaluation, the default value specified here is used if and only if
   user specifies no value for the corresponding input parameter.
   May be used to pass serialized parameters for networks.
  repeated .onnx.TensorProto initializer = 5;

  index - `int`

  returns: `onnx.OnnxProto3$TensorProto`"
  (^onnx.OnnxProto3$TensorProto [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.getInitializer index))))

(defn clear-input
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this]
    (-> this (.clearInput))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn remove-node
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  index - `int`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.removeNode index))))

(defn add-value-info-builder
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxProto3$ValueInfoProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.addValueInfoBuilder index)))
  (^onnx.OnnxProto3$ValueInfoProto$Builder [^OnnxProto3$GraphProto$Builder this]
    (-> this (.addValueInfoBuilder))))

(defn build
  "returns: `onnx.OnnxProto3$GraphProto`"
  (^onnx.OnnxProto3$GraphProto [^OnnxProto3$GraphProto$Builder this]
    (-> this (.build))))

(defn get-value-info-builder-list
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  returns: `java.util.List<onnx.OnnxProto3$ValueInfoProto$Builder>`"
  (^java.util.List [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getValueInfoBuilderList))))

(defn get-output-builder
  "repeated .onnx.ValueInfoProto output = 12;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxProto3$ValueInfoProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.getOutputBuilder index))))

(defn get-input-builder-list
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  returns: `java.util.List<onnx.OnnxProto3$ValueInfoProto$Builder>`"
  (^java.util.List [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getInputBuilderList))))

(defn get-output-count
  "repeated .onnx.ValueInfoProto output = 12;

  returns: `int`"
  (^Integer [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getOutputCount))))

(defn clear-node
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this]
    (-> this (.clearNode))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$GraphProto$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-input-or-builder-list
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  returns: `java.util.List<? extends onnx.OnnxProto3$ValueInfoProtoOrBuilder>`"
  ([^OnnxProto3$GraphProto$Builder this]
    (-> this (.getInputOrBuilderList))))

(defn get-value-info-or-builder-list
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  returns: `java.util.List<? extends onnx.OnnxProto3$ValueInfoProtoOrBuilder>`"
  ([^OnnxProto3$GraphProto$Builder this]
    (-> this (.getValueInfoOrBuilderList))))

(defn add-initializer-builder
  "A list of named tensor values (constants), used to specify default
   values for some of the inputs of the graph.
   Each TensorProto entry must have a distinct name (within the list) that
   also appears in the input list.
   In an evaluation, the default value specified here is used if and only if
   user specifies no value for the corresponding input parameter.
   May be used to pass serialized parameters for networks.
  repeated .onnx.TensorProto initializer = 5;

  index - `int`

  returns: `onnx.OnnxProto3$TensorProto$Builder`"
  (^onnx.OnnxProto3$TensorProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.addInitializerBuilder index)))
  (^onnx.OnnxProto3$TensorProto$Builder [^OnnxProto3$GraphProto$Builder this]
    (-> this (.addInitializerBuilder))))

(defn add-output
  "repeated .onnx.ValueInfoProto output = 12;

  index - `int`
  value - `onnx.OnnxProto3$ValueInfoProto`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index ^onnx.OnnxProto3$ValueInfoProto value]
    (-> this (.addOutput index value)))
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^onnx.OnnxProto3$ValueInfoProto value]
    (-> this (.addOutput value))))

(defn add-value-info
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  index - `int`
  value - `onnx.OnnxProto3$ValueInfoProto`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index ^onnx.OnnxProto3$ValueInfoProto value]
    (-> this (.addValueInfo index value)))
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^onnx.OnnxProto3$ValueInfoProto value]
    (-> this (.addValueInfo value))))

(defn get-node-or-builder-list
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  returns: `java.util.List<? extends onnx.OnnxProto3$NodeProtoOrBuilder>`"
  ([^OnnxProto3$GraphProto$Builder this]
    (-> this (.getNodeOrBuilderList))))

(defn set-initializer
  "A list of named tensor values (constants), used to specify default
   values for some of the inputs of the graph.
   Each TensorProto entry must have a distinct name (within the list) that
   also appears in the input list.
   In an evaluation, the default value specified here is used if and only if
   user specifies no value for the corresponding input parameter.
   May be used to pass serialized parameters for networks.
  repeated .onnx.TensorProto initializer = 5;

  index - `int`
  value - `onnx.OnnxProto3$TensorProto`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index ^onnx.OnnxProto3$TensorProto value]
    (-> this (.setInitializer index value))))

(defn get-output-or-builder-list
  "repeated .onnx.ValueInfoProto output = 12;

  returns: `java.util.List<? extends onnx.OnnxProto3$ValueInfoProtoOrBuilder>`"
  ([^OnnxProto3$GraphProto$Builder this]
    (-> this (.getOutputOrBuilderList))))

(defn get-value-info
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProto`"
  (^onnx.OnnxProto3$ValueInfoProto [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.getValueInfo index))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn add-input
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  index - `int`
  value - `onnx.OnnxProto3$ValueInfoProto`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index ^onnx.OnnxProto3$ValueInfoProto value]
    (-> this (.addInput index value)))
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^onnx.OnnxProto3$ValueInfoProto value]
    (-> this (.addInput value))))

(defn clone
  "returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-initializer-count
  "A list of named tensor values (constants), used to specify default
   values for some of the inputs of the graph.
   Each TensorProto entry must have a distinct name (within the list) that
   also appears in the input list.
   In an evaluation, the default value specified here is used if and only if
   user specifies no value for the corresponding input parameter.
   May be used to pass serialized parameters for networks.
  repeated .onnx.TensorProto initializer = 5;

  returns: `int`"
  (^Integer [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getInitializerCount))))

(defn add-all-value-info
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllValueInfo values))))

(defn get-output
  "repeated .onnx.ValueInfoProto output = 12;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProto`"
  (^onnx.OnnxProto3$ValueInfoProto [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.getOutput index))))

(defn get-initializer-list
  "A list of named tensor values (constants), used to specify default
   values for some of the inputs of the graph.
   Each TensorProto entry must have a distinct name (within the list) that
   also appears in the input list.
   In an evaluation, the default value specified here is used if and only if
   user specifies no value for the corresponding input parameter.
   May be used to pass serialized parameters for networks.
  repeated .onnx.TensorProto initializer = 5;

  returns: `java.util.List<onnx.OnnxProto3$TensorProto>`"
  (^java.util.List [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getInitializerList))))

(defn clear
  "returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this]
    (-> this (.clear))))

(defn get-initializer-or-builder-list
  "A list of named tensor values (constants), used to specify default
   values for some of the inputs of the graph.
   Each TensorProto entry must have a distinct name (within the list) that
   also appears in the input list.
   In an evaluation, the default value specified here is used if and only if
   user specifies no value for the corresponding input parameter.
   May be used to pass serialized parameters for networks.
  repeated .onnx.TensorProto initializer = 5;

  returns: `java.util.List<? extends onnx.OnnxProto3$TensorProtoOrBuilder>`"
  ([^OnnxProto3$GraphProto$Builder this]
    (-> this (.getInitializerOrBuilderList))))

(defn set-value-info
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  index - `int`
  value - `onnx.OnnxProto3$ValueInfoProto`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index ^onnx.OnnxProto3$ValueInfoProto value]
    (-> this (.setValueInfo index value))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn add-all-initializer
  "A list of named tensor values (constants), used to specify default
   values for some of the inputs of the graph.
   Each TensorProto entry must have a distinct name (within the list) that
   also appears in the input list.
   In an evaluation, the default value specified here is used if and only if
   user specifies no value for the corresponding input parameter.
   May be used to pass serialized parameters for networks.
  repeated .onnx.TensorProto initializer = 5;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllInitializer values))))

(defn get-value-info-builder
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProto$Builder`"
  (^onnx.OnnxProto3$ValueInfoProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.getValueInfoBuilder index))))

(defn get-node-builder-list
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  returns: `java.util.List<onnx.OnnxProto3$NodeProto$Builder>`"
  (^java.util.List [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getNodeBuilderList))))

(defn get-value-info-list
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  returns: `java.util.List<onnx.OnnxProto3$ValueInfoProto>`"
  (^java.util.List [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getValueInfoList))))

(defn add-initializer
  "A list of named tensor values (constants), used to specify default
   values for some of the inputs of the graph.
   Each TensorProto entry must have a distinct name (within the list) that
   also appears in the input list.
   In an evaluation, the default value specified here is used if and only if
   user specifies no value for the corresponding input parameter.
   May be used to pass serialized parameters for networks.
  repeated .onnx.TensorProto initializer = 5;

  index - `int`
  value - `onnx.OnnxProto3$TensorProto`

  returns: `onnx.OnnxProto3$GraphProto$Builder`"
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index ^onnx.OnnxProto3$TensorProto value]
    (-> this (.addInitializer index value)))
  (^onnx.OnnxProto3$GraphProto$Builder [^OnnxProto3$GraphProto$Builder this ^onnx.OnnxProto3$TensorProto value]
    (-> this (.addInitializer value))))

(defn add-node-builder
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  index - `int`

  returns: `onnx.OnnxProto3$NodeProto$Builder`"
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$GraphProto$Builder this ^Integer index]
    (-> this (.addNodeBuilder index)))
  (^onnx.OnnxProto3$NodeProto$Builder [^OnnxProto3$GraphProto$Builder this]
    (-> this (.addNodeBuilder))))

(defn get-node-list
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  returns: `java.util.List<onnx.OnnxProto3$NodeProto>`"
  (^java.util.List [^OnnxProto3$GraphProto$Builder this]
    (-> this (.getNodeList))))

