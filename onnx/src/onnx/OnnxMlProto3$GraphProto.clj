(ns onnx.OnnxMlProto3$GraphProto
  " GraphProto defines a parameterized series of nodes to form a directed acyclic graph.
  This is the equivalent of the \"network\" and \"graph\" in many deep learning
  frameworks.
 Protobuf type onnx.GraphProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$GraphProto]))

(def *-node-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$GraphProto/NODE_FIELD_NUMBER)

(def *-name-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$GraphProto/NAME_FIELD_NUMBER)

(def *-initializer-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$GraphProto/INITIALIZER_FIELD_NUMBER)

(def *-doc-string-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$GraphProto/DOC_STRING_FIELD_NUMBER)

(def *-input-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$GraphProto/INPUT_FIELD_NUMBER)

(def *-output-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$GraphProto/OUTPUT_FIELD_NUMBER)

(def *-value-info-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$GraphProto/VALUE_INFO_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$GraphProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$GraphProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxMlProto3$GraphProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxMlProto3$GraphProto/parseFrom data extension-registry))
  (^onnx.OnnxMlProto3$GraphProto [^java.nio.ByteBuffer data]
    (OnnxMlProto3$GraphProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$GraphProto`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$GraphProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxMlProto3$GraphProto/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxMlProto3$GraphProto [^java.io.InputStream input]
    (OnnxMlProto3$GraphProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxMlProto3$GraphProto`

  returns: `onnx.OnnxMlProto3$GraphProto$Builder`"
  (^onnx.OnnxMlProto3$GraphProto$Builder [^onnx.OnnxMlProto3$GraphProto prototype]
    (OnnxMlProto3$GraphProto/newBuilder prototype))
  (^onnx.OnnxMlProto3$GraphProto$Builder []
    (OnnxMlProto3$GraphProto/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxMlProto3$GraphProto`"
  (^onnx.OnnxMlProto3$GraphProto []
    (OnnxMlProto3$GraphProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxMlProto3$GraphProto>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxMlProto3$GraphProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxMlProto3$GraphProto this]
    (-> this (.getUnknownFields))))

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

  returns: `onnx.OnnxMlProto3$TensorProtoOrBuilder`"
  (^onnx.OnnxMlProto3$TensorProtoOrBuilder [^OnnxMlProto3$GraphProto this ^Integer index]
    (-> this (.getInitializerOrBuilder index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$GraphProto this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$GraphProto`"
  (^onnx.OnnxMlProto3$GraphProto [^OnnxMlProto3$GraphProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-doc-string-bytes
  "A human-readable documentation for this graph. Markdown is allowed.
  string doc_string = 10;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$GraphProto this]
    (-> this (.getDocStringBytes))))

(defn get-node-count
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  returns: `int`"
  (^Integer [^OnnxMlProto3$GraphProto this]
    (-> this (.getNodeCount))))

(defn get-value-info-count
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  returns: `int`"
  (^Integer [^OnnxMlProto3$GraphProto this]
    (-> this (.getValueInfoCount))))

(defn get-name-bytes
  "The name of the graph.
  string name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$GraphProto this]
    (-> this (.getNameBytes))))

(defn get-input-count
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  returns: `int`"
  (^Integer [^OnnxMlProto3$GraphProto this]
    (-> this (.getInputCount))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxMlProto3$GraphProto this]
    (-> this (.getSerializedSize))))

(defn get-output-or-builder
  "repeated .onnx.ValueInfoProto output = 12;

  index - `int`

  returns: `onnx.OnnxMlProto3$ValueInfoProtoOrBuilder`"
  (^onnx.OnnxMlProto3$ValueInfoProtoOrBuilder [^OnnxMlProto3$GraphProto this ^Integer index]
    (-> this (.getOutputOrBuilder index))))

(defn get-value-info-or-builder
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  index - `int`

  returns: `onnx.OnnxMlProto3$ValueInfoProtoOrBuilder`"
  (^onnx.OnnxMlProto3$ValueInfoProtoOrBuilder [^OnnxMlProto3$GraphProto this ^Integer index]
    (-> this (.getValueInfoOrBuilder index))))

(defn get-node
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  index - `int`

  returns: `onnx.OnnxMlProto3$NodeProto`"
  (^onnx.OnnxMlProto3$NodeProto [^OnnxMlProto3$GraphProto this ^Integer index]
    (-> this (.getNode index))))

(defn get-input-list
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  returns: `java.util.List<onnx.OnnxMlProto3$ValueInfoProto>`"
  (^java.util.List [^OnnxMlProto3$GraphProto this]
    (-> this (.getInputList))))

(defn get-doc-string
  "A human-readable documentation for this graph. Markdown is allowed.
  string doc_string = 10;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$GraphProto this]
    (-> this (.getDocString))))

(defn get-node-or-builder
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  index - `int`

  returns: `onnx.OnnxMlProto3$NodeProtoOrBuilder`"
  (^onnx.OnnxMlProto3$NodeProtoOrBuilder [^OnnxMlProto3$GraphProto this ^Integer index]
    (-> this (.getNodeOrBuilder index))))

(defn get-name
  "The name of the graph.
  string name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$GraphProto this]
    (-> this (.getName))))

(defn get-input-or-builder
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  index - `int`

  returns: `onnx.OnnxMlProto3$ValueInfoProtoOrBuilder`"
  (^onnx.OnnxMlProto3$ValueInfoProtoOrBuilder [^OnnxMlProto3$GraphProto this ^Integer index]
    (-> this (.getInputOrBuilder index))))

(defn get-output-list
  "repeated .onnx.ValueInfoProto output = 12;

  returns: `java.util.List<onnx.OnnxMlProto3$ValueInfoProto>`"
  (^java.util.List [^OnnxMlProto3$GraphProto this]
    (-> this (.getOutputList))))

(defn get-input
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  index - `int`

  returns: `onnx.OnnxMlProto3$ValueInfoProto`"
  (^onnx.OnnxMlProto3$ValueInfoProto [^OnnxMlProto3$GraphProto this ^Integer index]
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

  returns: `onnx.OnnxMlProto3$TensorProto`"
  (^onnx.OnnxMlProto3$TensorProto [^OnnxMlProto3$GraphProto this ^Integer index]
    (-> this (.getInitializer index))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxMlProto3$GraphProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-output-count
  "repeated .onnx.ValueInfoProto output = 12;

  returns: `int`"
  (^Integer [^OnnxMlProto3$GraphProto this]
    (-> this (.getOutputCount))))

(defn get-input-or-builder-list
  "The inputs and outputs of the graph.
  repeated .onnx.ValueInfoProto input = 11;

  returns: `java.util.List<? extends onnx.OnnxMlProto3$ValueInfoProtoOrBuilder>`"
  ([^OnnxMlProto3$GraphProto this]
    (-> this (.getInputOrBuilderList))))

(defn get-value-info-or-builder-list
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  returns: `java.util.List<? extends onnx.OnnxMlProto3$ValueInfoProtoOrBuilder>`"
  ([^OnnxMlProto3$GraphProto this]
    (-> this (.getValueInfoOrBuilderList))))

(defn get-node-or-builder-list
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  returns: `java.util.List<? extends onnx.OnnxMlProto3$NodeProtoOrBuilder>`"
  ([^OnnxMlProto3$GraphProto this]
    (-> this (.getNodeOrBuilderList))))

(defn get-output-or-builder-list
  "repeated .onnx.ValueInfoProto output = 12;

  returns: `java.util.List<? extends onnx.OnnxMlProto3$ValueInfoProtoOrBuilder>`"
  ([^OnnxMlProto3$GraphProto this]
    (-> this (.getOutputOrBuilderList))))

(defn get-value-info
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  index - `int`

  returns: `onnx.OnnxMlProto3$ValueInfoProto`"
  (^onnx.OnnxMlProto3$ValueInfoProto [^OnnxMlProto3$GraphProto this ^Integer index]
    (-> this (.getValueInfo index))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxMlProto3$GraphProto this]
    (-> this (.hashCode))))

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
  (^Integer [^OnnxMlProto3$GraphProto this]
    (-> this (.getInitializerCount))))

(defn get-output
  "repeated .onnx.ValueInfoProto output = 12;

  index - `int`

  returns: `onnx.OnnxMlProto3$ValueInfoProto`"
  (^onnx.OnnxMlProto3$ValueInfoProto [^OnnxMlProto3$GraphProto this ^Integer index]
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

  returns: `java.util.List<onnx.OnnxMlProto3$TensorProto>`"
  (^java.util.List [^OnnxMlProto3$GraphProto this]
    (-> this (.getInitializerList))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxMlProto3$GraphProto>`"
  (^com.github.os72.protobuf351.Parser [^OnnxMlProto3$GraphProto this]
    (-> this (.getParserForType))))

(defn get-initializer-or-builder-list
  "A list of named tensor values (constants), used to specify default
   values for some of the inputs of the graph.
   Each TensorProto entry must have a distinct name (within the list) that
   also appears in the input list.
   In an evaluation, the default value specified here is used if and only if
   user specifies no value for the corresponding input parameter.
   May be used to pass serialized parameters for networks.
  repeated .onnx.TensorProto initializer = 5;

  returns: `java.util.List<? extends onnx.OnnxMlProto3$TensorProtoOrBuilder>`"
  ([^OnnxMlProto3$GraphProto this]
    (-> this (.getInitializerOrBuilderList))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$GraphProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-value-info-list
  "Information for the values in the graph. The ValueInfoProto.name's
   must be distinct. It is optional for a value to appear in value_info list.
  repeated .onnx.ValueInfoProto value_info = 13;

  returns: `java.util.List<onnx.OnnxMlProto3$ValueInfoProto>`"
  (^java.util.List [^OnnxMlProto3$GraphProto this]
    (-> this (.getValueInfoList))))

(defn new-builder-for-type
  "returns: `onnx.OnnxMlProto3$GraphProto$Builder`"
  (^onnx.OnnxMlProto3$GraphProto$Builder [^OnnxMlProto3$GraphProto this]
    (-> this (.newBuilderForType))))

(defn get-node-list
  "The nodes in the graph.
  repeated .onnx.NodeProto node = 1;

  returns: `java.util.List<onnx.OnnxMlProto3$NodeProto>`"
  (^java.util.List [^OnnxMlProto3$GraphProto this]
    (-> this (.getNodeList))))

(defn to-builder
  "returns: `onnx.OnnxMlProto3$GraphProto$Builder`"
  (^onnx.OnnxMlProto3$GraphProto$Builder [^OnnxMlProto3$GraphProto this]
    (-> this (.toBuilder))))

