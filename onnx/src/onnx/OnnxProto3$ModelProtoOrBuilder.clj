(ns onnx.OnnxProto3$ModelProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$ModelProtoOrBuilder]))

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
  (^Integer [^OnnxProto3$ModelProtoOrBuilder this]
    (-> this (.getOpsetImportCount))))

(defn get-metadata-props-list
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  returns: `java.util.List<onnx.OnnxProto3$StringStringEntryProto>`"
  (^java.util.List [^OnnxProto3$ModelProtoOrBuilder this]
    (-> this (.getMetadataPropsList))))

(defn get-metadata-props
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  index - `int`

  returns: `onnx.OnnxProto3$StringStringEntryProto`"
  (^onnx.OnnxProto3$StringStringEntryProto [^OnnxProto3$ModelProtoOrBuilder this ^Integer index]
    (-> this (.getMetadataProps index))))

(defn get-producer-version-bytes
  "The version of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_version = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$ModelProtoOrBuilder this]
    (-> this (.getProducerVersionBytes))))

(defn get-doc-string-bytes
  "A human-readable documentation for this model. Markdown is allowed.
  string doc_string = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$ModelProtoOrBuilder this]
    (-> this (.getDocStringBytes))))

(defn get-metadata-props-count
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  returns: `int`"
  (^Integer [^OnnxProto3$ModelProtoOrBuilder this]
    (-> this (.getMetadataPropsCount))))

(defn get-domain-bytes
  "Domain name of the model.
   We use reverse domain names as name space indicators. For example:
   `com.facebook.fair` or `com.microsoft.cognitiveservices`
   Together with `model_version` and GraphProto.name, this forms the unique identity of
   the graph.
  string domain = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$ModelProtoOrBuilder this]
    (-> this (.getDomainBytes))))

(defn get-model-version
  "The version of the graph encoded. See Version enum below.
  int64 model_version = 5;

  returns: `long`"
  (^Long [^OnnxProto3$ModelProtoOrBuilder this]
    (-> this (.getModelVersion))))

(defn get-doc-string
  "A human-readable documentation for this model. Markdown is allowed.
  string doc_string = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$ModelProtoOrBuilder this]
    (-> this (.getDocString))))

(defn has-graph?
  "The parameterized graph that is evaluated to execute the model.
  .onnx.GraphProto graph = 7;

  returns: `boolean`"
  (^Boolean [^OnnxProto3$ModelProtoOrBuilder this]
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
  (^java.util.List [^OnnxProto3$ModelProtoOrBuilder this]
    (-> this (.getOpsetImportList))))

(defn get-metadata-props-or-builder-list
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  returns: `java.util.List<? extends onnx.OnnxProto3$StringStringEntryProtoOrBuilder>`"
  ([^OnnxProto3$ModelProtoOrBuilder this]
    (-> this (.getMetadataPropsOrBuilderList))))

(defn get-ir-version
  "The version of the IR this model targets. See Version enum above.
   This field MUST be present.
  int64 ir_version = 1;

  returns: `long`"
  (^Long [^OnnxProto3$ModelProtoOrBuilder this]
    (-> this (.getIrVersion))))

(defn get-metadata-props-or-builder
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  index - `int`

  returns: `onnx.OnnxProto3$StringStringEntryProtoOrBuilder`"
  (^onnx.OnnxProto3$StringStringEntryProtoOrBuilder [^OnnxProto3$ModelProtoOrBuilder this ^Integer index]
    (-> this (.getMetadataPropsOrBuilder index))))

(defn get-producer-name-bytes
  "The name of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$ModelProtoOrBuilder this]
    (-> this (.getProducerNameBytes))))

(defn get-producer-version
  "The version of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_version = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$ModelProtoOrBuilder this]
    (-> this (.getProducerVersion))))

(defn get-domain
  "Domain name of the model.
   We use reverse domain names as name space indicators. For example:
   `com.facebook.fair` or `com.microsoft.cognitiveservices`
   Together with `model_version` and GraphProto.name, this forms the unique identity of
   the graph.
  string domain = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$ModelProtoOrBuilder this]
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
  ([^OnnxProto3$ModelProtoOrBuilder this]
    (-> this (.getOpsetImportOrBuilderList))))

(defn get-graph-or-builder
  "The parameterized graph that is evaluated to execute the model.
  .onnx.GraphProto graph = 7;

  returns: `onnx.OnnxProto3$GraphProtoOrBuilder`"
  (^onnx.OnnxProto3$GraphProtoOrBuilder [^OnnxProto3$ModelProtoOrBuilder this]
    (-> this (.getGraphOrBuilder))))

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
  (^onnx.OnnxProto3$OperatorSetIdProto [^OnnxProto3$ModelProtoOrBuilder this ^Integer index]
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
  (^onnx.OnnxProto3$OperatorSetIdProtoOrBuilder [^OnnxProto3$ModelProtoOrBuilder this ^Integer index]
    (-> this (.getOpsetImportOrBuilder index))))

(defn get-producer-name
  "The name of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$ModelProtoOrBuilder this]
    (-> this (.getProducerName))))

(defn get-graph
  "The parameterized graph that is evaluated to execute the model.
  .onnx.GraphProto graph = 7;

  returns: `onnx.OnnxProto3$GraphProto`"
  (^onnx.OnnxProto3$GraphProto [^OnnxProto3$ModelProtoOrBuilder this]
    (-> this (.getGraph))))

