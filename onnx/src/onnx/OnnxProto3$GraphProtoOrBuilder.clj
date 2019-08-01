(ns onnx.OnnxProto3$GraphProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$GraphProtoOrBuilder]))

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
  (^onnx.OnnxProto3$TensorProtoOrBuilder [^OnnxProto3$GraphProtoOrBuilder this ^Integer index]
    (-> this (.getInitializerOrBuilder index))))

(defn get-doc-string-bytes
  "A human-readable documentation for this graph. Markdown is allowed.
  string doc_string = 10;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getDocStringBytes))))

(defn get-node-count
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  returns: `int`"
  (^Integer [^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getNodeCount))))

(defn get-value-info-count
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  returns: `int`"
  (^Integer [^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getValueInfoCount))))

(defn get-name-bytes
  "The name of the graph.
  string name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-input-count
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  returns: `int`"
  (^Integer [^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getInputCount))))

(defn get-output-or-builder
  "repeated .onnx.ValueInfoProto output = 12;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProtoOrBuilder`"
  (^onnx.OnnxProto3$ValueInfoProtoOrBuilder [^OnnxProto3$GraphProtoOrBuilder this ^Integer index]
    (-> this (.getOutputOrBuilder index))))

(defn get-value-info-or-builder
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProtoOrBuilder`"
  (^onnx.OnnxProto3$ValueInfoProtoOrBuilder [^OnnxProto3$GraphProtoOrBuilder this ^Integer index]
    (-> this (.getValueInfoOrBuilder index))))

(defn get-node
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  index - `int`

  returns: `onnx.OnnxProto3$NodeProto`"
  (^onnx.OnnxProto3$NodeProto [^OnnxProto3$GraphProtoOrBuilder this ^Integer index]
    (-> this (.getNode index))))

(defn get-input-list
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  returns: `java.util.List<onnx.OnnxProto3$ValueInfoProto>`"
  (^java.util.List [^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getInputList))))

(defn get-doc-string
  "A human-readable documentation for this graph. Markdown is allowed.
  string doc_string = 10;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getDocString))))

(defn get-node-or-builder
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  index - `int`

  returns: `onnx.OnnxProto3$NodeProtoOrBuilder`"
  (^onnx.OnnxProto3$NodeProtoOrBuilder [^OnnxProto3$GraphProtoOrBuilder this ^Integer index]
    (-> this (.getNodeOrBuilder index))))

(defn get-name
  "The name of the graph.
  string name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getName))))

(defn get-input-or-builder
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProtoOrBuilder`"
  (^onnx.OnnxProto3$ValueInfoProtoOrBuilder [^OnnxProto3$GraphProtoOrBuilder this ^Integer index]
    (-> this (.getInputOrBuilder index))))

(defn get-output-list
  "repeated .onnx.ValueInfoProto output = 12;

  returns: `java.util.List<onnx.OnnxProto3$ValueInfoProto>`"
  (^java.util.List [^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getOutputList))))

(defn get-input
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProto`"
  (^onnx.OnnxProto3$ValueInfoProto [^OnnxProto3$GraphProtoOrBuilder this ^Integer index]
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
  (^onnx.OnnxProto3$TensorProto [^OnnxProto3$GraphProtoOrBuilder this ^Integer index]
    (-> this (.getInitializer index))))

(defn get-output-count
  "repeated .onnx.ValueInfoProto output = 12;

  returns: `int`"
  (^Integer [^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getOutputCount))))

(defn get-input-or-builder-list
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  returns: `java.util.List<? extends onnx.OnnxProto3$ValueInfoProtoOrBuilder>`"
  ([^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getInputOrBuilderList))))

(defn get-value-info-or-builder-list
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  returns: `java.util.List<? extends onnx.OnnxProto3$ValueInfoProtoOrBuilder>`"
  ([^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getValueInfoOrBuilderList))))

(defn get-node-or-builder-list
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  returns: `java.util.List<? extends onnx.OnnxProto3$NodeProtoOrBuilder>`"
  ([^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getNodeOrBuilderList))))

(defn get-output-or-builder-list
  "repeated .onnx.ValueInfoProto output = 12;

  returns: `java.util.List<? extends onnx.OnnxProto3$ValueInfoProtoOrBuilder>`"
  ([^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getOutputOrBuilderList))))

(defn get-value-info
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProto`"
  (^onnx.OnnxProto3$ValueInfoProto [^OnnxProto3$GraphProtoOrBuilder this ^Integer index]
    (-> this (.getValueInfo index))))

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
  (^Integer [^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getInitializerCount))))

(defn get-output
  "repeated .onnx.ValueInfoProto output = 12;

  index - `int`

  returns: `onnx.OnnxProto3$ValueInfoProto`"
  (^onnx.OnnxProto3$ValueInfoProto [^OnnxProto3$GraphProtoOrBuilder this ^Integer index]
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
  (^java.util.List [^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getInitializerList))))

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
  ([^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getInitializerOrBuilderList))))

(defn get-value-info-list
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  returns: `java.util.List<onnx.OnnxProto3$ValueInfoProto>`"
  (^java.util.List [^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getValueInfoList))))

(defn get-node-list
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  returns: `java.util.List<onnx.OnnxProto3$NodeProto>`"
  (^java.util.List [^OnnxProto3$GraphProtoOrBuilder this]
    (-> this (.getNodeList))))

