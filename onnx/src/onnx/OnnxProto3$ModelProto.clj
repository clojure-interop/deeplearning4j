(ns onnx.OnnxProto3$ModelProto
  " ModelProto is a top-level file/container format for bundling a ML model.
  The semantics of the model are described by the GraphProto that represents
  a parameterized computation graph against a set of named operators that are
  defined independently from the graph.
 Protobuf type onnx.ModelProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$ModelProto]))

(def *-ir-version-field-number
  "Static Constant.

  type: int"
  OnnxProto3$ModelProto/IR_VERSION_FIELD_NUMBER)

(def *-opset-import-field-number
  "Static Constant.

  type: int"
  OnnxProto3$ModelProto/OPSET_IMPORT_FIELD_NUMBER)

(def *-producer-name-field-number
  "Static Constant.

  type: int"
  OnnxProto3$ModelProto/PRODUCER_NAME_FIELD_NUMBER)

(def *-producer-version-field-number
  "Static Constant.

  type: int"
  OnnxProto3$ModelProto/PRODUCER_VERSION_FIELD_NUMBER)

(def *-domain-field-number
  "Static Constant.

  type: int"
  OnnxProto3$ModelProto/DOMAIN_FIELD_NUMBER)

(def *-model-version-field-number
  "Static Constant.

  type: int"
  OnnxProto3$ModelProto/MODEL_VERSION_FIELD_NUMBER)

(def *-doc-string-field-number
  "Static Constant.

  type: int"
  OnnxProto3$ModelProto/DOC_STRING_FIELD_NUMBER)

(def *-graph-field-number
  "Static Constant.

  type: int"
  OnnxProto3$ModelProto/GRAPH_FIELD_NUMBER)

(def *-metadata-props-field-number
  "Static Constant.

  type: int"
  OnnxProto3$ModelProto/METADATA_PROPS_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxProto3$ModelProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$ModelProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxProto3$ModelProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$ModelProto/parseFrom data extension-registry))
  (^onnx.OnnxProto3$ModelProto [^java.nio.ByteBuffer data]
    (OnnxProto3$ModelProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$ModelProto`

  throws: java.io.IOException"
  (^onnx.OnnxProto3$ModelProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$ModelProto/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxProto3$ModelProto [^java.io.InputStream input]
    (OnnxProto3$ModelProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxProto3$ModelProto`

  returns: `onnx.OnnxProto3$ModelProto$Builder`"
  (^onnx.OnnxProto3$ModelProto$Builder [^onnx.OnnxProto3$ModelProto prototype]
    (OnnxProto3$ModelProto/newBuilder prototype))
  (^onnx.OnnxProto3$ModelProto$Builder []
    (OnnxProto3$ModelProto/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxProto3$ModelProto`"
  (^onnx.OnnxProto3$ModelProto []
    (OnnxProto3$ModelProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$ModelProto>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxProto3$ModelProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxProto3$ModelProto this]
    (-> this (.getUnknownFields))))

(defn get-opset-import-count
  "The OperatorSets this model relies on.
   All ModelProtos MUST have at least one entry that
   specifies which version of the ONNX OperatorSet is
   being imported.
   All nodes in the ModelProto's graph will bind against the operator
   with the same-domain/same-op_type operator with the HIGHEST version
   in the referenced operator sets.
  repeated .onnx.OperatorSetIdProto opset_import = 8;

  returns: `int`"
  (^Integer [^OnnxProto3$ModelProto this]
    (-> this (.getOpsetImportCount))))

(defn get-metadata-props-list
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  returns: `java.util.List<onnx.OnnxProto3$StringStringEntryProto>`"
  (^java.util.List [^OnnxProto3$ModelProto this]
    (-> this (.getMetadataPropsList))))

(defn get-metadata-props
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  index - `int`

  returns: `onnx.OnnxProto3$StringStringEntryProto`"
  (^onnx.OnnxProto3$StringStringEntryProto [^OnnxProto3$ModelProto this ^Integer index]
    (-> this (.getMetadataProps index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxProto3$ModelProto this]
    (-> this (.isInitialized))))

(defn get-producer-version-bytes
  "The version of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_version = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$ModelProto this]
    (-> this (.getProducerVersionBytes))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxProto3$ModelProto`"
  (^onnx.OnnxProto3$ModelProto [^OnnxProto3$ModelProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-doc-string-bytes
  "A human-readable documentation for this model. Markdown is allowed.
  string doc_string = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$ModelProto this]
    (-> this (.getDocStringBytes))))

(defn get-metadata-props-count
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  returns: `int`"
  (^Integer [^OnnxProto3$ModelProto this]
    (-> this (.getMetadataPropsCount))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxProto3$ModelProto this]
    (-> this (.getSerializedSize))))

(defn get-domain-bytes
  "Domain name of the model.
   We use reverse domain names as name space indicators. For example:
   `com.facebook.fair` or `com.microsoft.cognitiveservices`
   Together with `model_version` and GraphProto.name, this forms the unique identity of
   the graph.
  string domain = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$ModelProto this]
    (-> this (.getDomainBytes))))

(defn get-model-version
  "The version of the graph encoded. See Version enum below.
  int64 model_version = 5;

  returns: `long`"
  (^Long [^OnnxProto3$ModelProto this]
    (-> this (.getModelVersion))))

(defn get-doc-string
  "A human-readable documentation for this model. Markdown is allowed.
  string doc_string = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$ModelProto this]
    (-> this (.getDocString))))

(defn has-graph?
  "The parameterized graph that is evaluated to execute the model.
  .onnx.GraphProto graph = 7;

  returns: `boolean`"
  (^Boolean [^OnnxProto3$ModelProto this]
    (-> this (.hasGraph))))

(defn get-opset-import-list
  "The OperatorSets this model relies on.
   All ModelProtos MUST have at least one entry that
   specifies which version of the ONNX OperatorSet is
   being imported.
   All nodes in the ModelProto's graph will bind against the operator
   with the same-domain/same-op_type operator with the HIGHEST version
   in the referenced operator sets.
  repeated .onnx.OperatorSetIdProto opset_import = 8;

  returns: `java.util.List<onnx.OnnxProto3$OperatorSetIdProto>`"
  (^java.util.List [^OnnxProto3$ModelProto this]
    (-> this (.getOpsetImportList))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxProto3$ModelProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-metadata-props-or-builder-list
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  returns: `java.util.List<? extends onnx.OnnxProto3$StringStringEntryProtoOrBuilder>`"
  ([^OnnxProto3$ModelProto this]
    (-> this (.getMetadataPropsOrBuilderList))))

(defn get-ir-version
  "The version of the IR this model targets. See Version enum above.
   This field MUST be present.
  int64 ir_version = 1;

  returns: `long`"
  (^Long [^OnnxProto3$ModelProto this]
    (-> this (.getIrVersion))))

(defn get-metadata-props-or-builder
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  index - `int`

  returns: `onnx.OnnxProto3$StringStringEntryProtoOrBuilder`"
  (^onnx.OnnxProto3$StringStringEntryProtoOrBuilder [^OnnxProto3$ModelProto this ^Integer index]
    (-> this (.getMetadataPropsOrBuilder index))))

(defn get-producer-name-bytes
  "The name of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$ModelProto this]
    (-> this (.getProducerNameBytes))))

(defn get-producer-version
  "The version of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_version = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$ModelProto this]
    (-> this (.getProducerVersion))))

(defn get-domain
  "Domain name of the model.
   We use reverse domain names as name space indicators. For example:
   `com.facebook.fair` or `com.microsoft.cognitiveservices`
   Together with `model_version` and GraphProto.name, this forms the unique identity of
   the graph.
  string domain = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$ModelProto this]
    (-> this (.getDomain))))

(defn get-opset-import-or-builder-list
  "The OperatorSets this model relies on.
   All ModelProtos MUST have at least one entry that
   specifies which version of the ONNX OperatorSet is
   being imported.
   All nodes in the ModelProto's graph will bind against the operator
   with the same-domain/same-op_type operator with the HIGHEST version
   in the referenced operator sets.
  repeated .onnx.OperatorSetIdProto opset_import = 8;

  returns: `java.util.List<? extends onnx.OnnxProto3$OperatorSetIdProtoOrBuilder>`"
  ([^OnnxProto3$ModelProto this]
    (-> this (.getOpsetImportOrBuilderList))))

(defn get-graph-or-builder
  "The parameterized graph that is evaluated to execute the model.
  .onnx.GraphProto graph = 7;

  returns: `onnx.OnnxProto3$GraphProtoOrBuilder`"
  (^onnx.OnnxProto3$GraphProtoOrBuilder [^OnnxProto3$ModelProto this]
    (-> this (.getGraphOrBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxProto3$ModelProto this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$ModelProto>`"
  (^com.github.os72.protobuf351.Parser [^OnnxProto3$ModelProto this]
    (-> this (.getParserForType))))

(defn get-opset-import
  "The OperatorSets this model relies on.
   All ModelProtos MUST have at least one entry that
   specifies which version of the ONNX OperatorSet is
   being imported.
   All nodes in the ModelProto's graph will bind against the operator
   with the same-domain/same-op_type operator with the HIGHEST version
   in the referenced operator sets.
  repeated .onnx.OperatorSetIdProto opset_import = 8;

  index - `int`

  returns: `onnx.OnnxProto3$OperatorSetIdProto`"
  (^onnx.OnnxProto3$OperatorSetIdProto [^OnnxProto3$ModelProto this ^Integer index]
    (-> this (.getOpsetImport index))))

(defn get-opset-import-or-builder
  "The OperatorSets this model relies on.
   All ModelProtos MUST have at least one entry that
   specifies which version of the ONNX OperatorSet is
   being imported.
   All nodes in the ModelProto's graph will bind against the operator
   with the same-domain/same-op_type operator with the HIGHEST version
   in the referenced operator sets.
  repeated .onnx.OperatorSetIdProto opset_import = 8;

  index - `int`

  returns: `onnx.OnnxProto3$OperatorSetIdProtoOrBuilder`"
  (^onnx.OnnxProto3$OperatorSetIdProtoOrBuilder [^OnnxProto3$ModelProto this ^Integer index]
    (-> this (.getOpsetImportOrBuilder index))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxProto3$ModelProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxProto3$ModelProto$Builder`"
  (^onnx.OnnxProto3$ModelProto$Builder [^OnnxProto3$ModelProto this]
    (-> this (.newBuilderForType))))

(defn get-producer-name
  "The name of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$ModelProto this]
    (-> this (.getProducerName))))

(defn get-graph
  "The parameterized graph that is evaluated to execute the model.
  .onnx.GraphProto graph = 7;

  returns: `onnx.OnnxProto3$GraphProto`"
  (^onnx.OnnxProto3$GraphProto [^OnnxProto3$ModelProto this]
    (-> this (.getGraph))))

(defn to-builder
  "returns: `onnx.OnnxProto3$ModelProto$Builder`"
  (^onnx.OnnxProto3$ModelProto$Builder [^OnnxProto3$ModelProto this]
    (-> this (.toBuilder))))

