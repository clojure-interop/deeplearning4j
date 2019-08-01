(ns onnx.OnnxMlProto3$ModelProto$Builder
  " ModelProto is a top-level file/container format for bundling a ML model.
  The semantics of the model are described by the GraphProto that represents
  a parameterized computation graph against a set of named operators that are
  defined independently from the graph.
 Protobuf type onnx.ModelProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$ModelProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$ModelProto$Builder/getDescriptor )))

(defn clear-doc-string
  "A human-readable documentation for this model. Markdown is allowed.
  string doc_string = 6;

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.clearDocString))))

(defn add-all-opset-import
  "The OperatorSets this model relies on.
   All ModelProtos MUST have at least one entry that
   specifies which version of the ONNX OperatorSet is
   being imported.
   All nodes in the ModelProto's graph will bind against the operator
   with the same-domain/same-op_type operator with the HIGHEST version
   in the referenced operator sets.
  repeated .onnx.OperatorSetIdProto opset_import = 8;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllOpsetImport values))))

(defn set-producer-name-bytes
  "The name of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_name = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setProducerNameBytes value))))

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
  (^Integer [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getOpsetImportCount))))

(defn clear-domain
  "Domain name of the model.
   We use reverse domain names as name space indicators. For example:
   `com.facebook.fair` or `com.microsoft.cognitiveservices`
   Together with `model_version` and GraphProto.name, this forms the unique identity of
   the graph.
  string domain = 4;

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.clearDomain))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn clear-producer-version
  "The version of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_version = 3;

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.clearProducerVersion))))

(defn get-metadata-props-list
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  returns: `java.util.List<onnx.OnnxMlProto3$StringStringEntryProto>`"
  (^java.util.List [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getMetadataPropsList))))

(defn build-partial
  "returns: `onnx.OnnxMlProto3$ModelProto`"
  (^onnx.OnnxMlProto3$ModelProto [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.buildPartial))))

(defn set-doc-string
  "A human-readable documentation for this model. Markdown is allowed.
  string doc_string = 6;

  value - `java.lang.String`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^java.lang.String value]
    (-> this (.setDocString value))))

(defn set-model-version
  "The version of the graph encoded. See Version enum below.
  int64 model_version = 5;

  value - `long`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^Long value]
    (-> this (.setModelVersion value))))

(defn get-metadata-props
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  index - `int`

  returns: `onnx.OnnxMlProto3$StringStringEntryProto`"
  (^onnx.OnnxMlProto3$StringStringEntryProto [^OnnxMlProto3$ModelProto$Builder this ^Integer index]
    (-> this (.getMetadataProps index))))

(defn add-metadata-props-builder
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  index - `int`

  returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^Integer index]
    (-> this (.addMetadataPropsBuilder index)))
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.addMetadataPropsBuilder))))

(defn clear-opset-import
  "The OperatorSets this model relies on.
   All ModelProtos MUST have at least one entry that
   specifies which version of the ONNX OperatorSet is
   being imported.
   All nodes in the ModelProto's graph will bind against the operator
   with the same-domain/same-op_type operator with the HIGHEST version
   in the referenced operator sets.
  repeated .onnx.OperatorSetIdProto opset_import = 8;

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.clearOpsetImport))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.isInitialized))))

(defn set-ir-version
  "The version of the IR this model targets. See Version enum above.
   This field MUST be present.
  int64 ir_version = 1;

  value - `long`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^Long value]
    (-> this (.setIrVersion value))))

(defn get-producer-version-bytes
  "The version of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_version = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getProducerVersionBytes))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$ModelProto`"
  (^onnx.OnnxMlProto3$ModelProto [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-doc-string-bytes
  "A human-readable documentation for this model. Markdown is allowed.
  string doc_string = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getDocStringBytes))))

(defn get-opset-import-builder-list
  "The OperatorSets this model relies on.
   All ModelProtos MUST have at least one entry that
   specifies which version of the ONNX OperatorSet is
   being imported.
   All nodes in the ModelProto's graph will bind against the operator
   with the same-domain/same-op_type operator with the HIGHEST version
   in the referenced operator sets.
  repeated .onnx.OperatorSetIdProto opset_import = 8;

  returns: `java.util.List<onnx.OnnxMlProto3$OperatorSetIdProto$Builder>`"
  (^java.util.List [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getOpsetImportBuilderList))))

(defn set-producer-version
  "The version of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_version = 3;

  value - `java.lang.String`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^java.lang.String value]
    (-> this (.setProducerVersion value))))

(defn add-metadata-props
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  index - `int`
  value - `onnx.OnnxMlProto3$StringStringEntryProto`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^Integer index ^onnx.OnnxMlProto3$StringStringEntryProto value]
    (-> this (.addMetadataProps index value)))
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^onnx.OnnxMlProto3$StringStringEntryProto value]
    (-> this (.addMetadataProps value))))

(defn set-doc-string-bytes
  "A human-readable documentation for this model. Markdown is allowed.
  string doc_string = 6;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDocStringBytes value))))

(defn get-metadata-props-count
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  returns: `int`"
  (^Integer [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getMetadataPropsCount))))

(defn add-all-metadata-props
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllMetadataProps values))))

(defn set-opset-import
  "The OperatorSets this model relies on.
   All ModelProtos MUST have at least one entry that
   specifies which version of the ONNX OperatorSet is
   being imported.
   All nodes in the ModelProto's graph will bind against the operator
   with the same-domain/same-op_type operator with the HIGHEST version
   in the referenced operator sets.
  repeated .onnx.OperatorSetIdProto opset_import = 8;

  index - `int`
  value - `onnx.OnnxMlProto3$OperatorSetIdProto`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^Integer index ^onnx.OnnxMlProto3$OperatorSetIdProto value]
    (-> this (.setOpsetImport index value))))

(defn get-domain-bytes
  "Domain name of the model.
   We use reverse domain names as name space indicators. For example:
   `com.facebook.fair` or `com.microsoft.cognitiveservices`
   Together with `model_version` and GraphProto.name, this forms the unique identity of
   the graph.
  string domain = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getDomainBytes))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-model-version
  "The version of the graph encoded. See Version enum below.
  int64 model_version = 5;

  returns: `long`"
  (^Long [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getModelVersion))))

(defn remove-opset-import
  "The OperatorSets this model relies on.
   All ModelProtos MUST have at least one entry that
   specifies which version of the ONNX OperatorSet is
   being imported.
   All nodes in the ModelProto's graph will bind against the operator
   with the same-domain/same-op_type operator with the HIGHEST version
   in the referenced operator sets.
  repeated .onnx.OperatorSetIdProto opset_import = 8;

  index - `int`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^Integer index]
    (-> this (.removeOpsetImport index))))

(defn get-graph-builder
  "The parameterized graph that is evaluated to execute the model.
  .onnx.GraphProto graph = 7;

  returns: `onnx.OnnxMlProto3$GraphProto$Builder`"
  (^onnx.OnnxMlProto3$GraphProto$Builder [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getGraphBuilder))))

(defn add-opset-import-builder
  "The OperatorSets this model relies on.
   All ModelProtos MUST have at least one entry that
   specifies which version of the ONNX OperatorSet is
   being imported.
   All nodes in the ModelProto's graph will bind against the operator
   with the same-domain/same-op_type operator with the HIGHEST version
   in the referenced operator sets.
  repeated .onnx.OperatorSetIdProto opset_import = 8;

  index - `int`

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^Integer index]
    (-> this (.addOpsetImportBuilder index)))
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.addOpsetImportBuilder))))

(defn get-doc-string
  "A human-readable documentation for this model. Markdown is allowed.
  string doc_string = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getDocString))))

(defn has-graph?
  "The parameterized graph that is evaluated to execute the model.
  .onnx.GraphProto graph = 7;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.hasGraph))))

(defn set-metadata-props
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  index - `int`
  value - `onnx.OnnxMlProto3$StringStringEntryProto`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^Integer index ^onnx.OnnxMlProto3$StringStringEntryProto value]
    (-> this (.setMetadataProps index value))))

(defn get-opset-import-list
  "The OperatorSets this model relies on.
   All ModelProtos MUST have at least one entry that
   specifies which version of the ONNX OperatorSet is
   being imported.
   All nodes in the ModelProto's graph will bind against the operator
   with the same-domain/same-op_type operator with the HIGHEST version
   in the referenced operator sets.
  repeated .onnx.OperatorSetIdProto opset_import = 8;

  returns: `java.util.List<onnx.OnnxMlProto3$OperatorSetIdProto>`"
  (^java.util.List [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getOpsetImportList))))

(defn merge-graph
  "The parameterized graph that is evaluated to execute the model.
  .onnx.GraphProto graph = 7;

  value - `onnx.OnnxMlProto3$GraphProto`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^onnx.OnnxMlProto3$GraphProto value]
    (-> this (.mergeGraph value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn clear-ir-version
  "The version of the IR this model targets. See Version enum above.
   This field MUST be present.
  int64 ir_version = 1;

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.clearIrVersion))))

(defn set-producer-name
  "The name of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_name = 2;

  value - `java.lang.String`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^java.lang.String value]
    (-> this (.setProducerName value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn set-producer-version-bytes
  "The version of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_version = 3;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setProducerVersionBytes value))))

(defn get-metadata-props-or-builder-list
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  returns: `java.util.List<? extends onnx.OnnxMlProto3$StringStringEntryProtoOrBuilder>`"
  ([^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getMetadataPropsOrBuilderList))))

(defn build
  "returns: `onnx.OnnxMlProto3$ModelProto`"
  (^onnx.OnnxMlProto3$ModelProto [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.build))))

(defn get-ir-version
  "The version of the IR this model targets. See Version enum above.
   This field MUST be present.
  int64 ir_version = 1;

  returns: `long`"
  (^Long [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getIrVersion))))

(defn get-opset-import-builder
  "The OperatorSets this model relies on.
   All ModelProtos MUST have at least one entry that
   specifies which version of the ONNX OperatorSet is
   being imported.
   All nodes in the ModelProto's graph will bind against the operator
   with the same-domain/same-op_type operator with the HIGHEST version
   in the referenced operator sets.
  repeated .onnx.OperatorSetIdProto opset_import = 8;

  index - `int`

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto$Builder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^Integer index]
    (-> this (.getOpsetImportBuilder index))))

(defn get-metadata-props-or-builder
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  index - `int`

  returns: `onnx.OnnxMlProto3$StringStringEntryProtoOrBuilder`"
  (^onnx.OnnxMlProto3$StringStringEntryProtoOrBuilder [^OnnxMlProto3$ModelProto$Builder this ^Integer index]
    (-> this (.getMetadataPropsOrBuilder index))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-producer-name-bytes
  "The name of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getProducerNameBytes))))

(defn get-producer-version
  "The version of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_version = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getProducerVersion))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn get-domain
  "Domain name of the model.
   We use reverse domain names as name space indicators. For example:
   `com.facebook.fair` or `com.microsoft.cognitiveservices`
   Together with `model_version` and GraphProto.name, this forms the unique identity of
   the graph.
  string domain = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$ModelProto$Builder this]
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

  returns: `java.util.List<? extends onnx.OnnxMlProto3$OperatorSetIdProtoOrBuilder>`"
  ([^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getOpsetImportOrBuilderList))))

(defn get-graph-or-builder
  "The parameterized graph that is evaluated to execute the model.
  .onnx.GraphProto graph = 7;

  returns: `onnx.OnnxMlProto3$GraphProtoOrBuilder`"
  (^onnx.OnnxMlProto3$GraphProtoOrBuilder [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getGraphOrBuilder))))

(defn clone
  "returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-metadata-props-builder-list
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  returns: `java.util.List<onnx.OnnxMlProto3$StringStringEntryProto$Builder>`"
  (^java.util.List [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getMetadataPropsBuilderList))))

(defn set-domain
  "Domain name of the model.
   We use reverse domain names as name space indicators. For example:
   `com.facebook.fair` or `com.microsoft.cognitiveservices`
   Together with `model_version` and GraphProto.name, this forms the unique identity of
   the graph.
  string domain = 4;

  value - `java.lang.String`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^java.lang.String value]
    (-> this (.setDomain value))))

(defn clear-model-version
  "The version of the graph encoded. See Version enum below.
  int64 model_version = 5;

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.clearModelVersion))))

(defn clear
  "returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.clear))))

(defn get-metadata-props-builder
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  index - `int`

  returns: `onnx.OnnxMlProto3$StringStringEntryProto$Builder`"
  (^onnx.OnnxMlProto3$StringStringEntryProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^Integer index]
    (-> this (.getMetadataPropsBuilder index))))

(defn remove-metadata-props
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  index - `int`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^Integer index]
    (-> this (.removeMetadataProps index))))

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

  returns: `onnx.OnnxMlProto3$OperatorSetIdProto`"
  (^onnx.OnnxMlProto3$OperatorSetIdProto [^OnnxMlProto3$ModelProto$Builder this ^Integer index]
    (-> this (.getOpsetImport index))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn clear-metadata-props
  "Named metadata values; keys should be distinct.
  repeated .onnx.StringStringEntryProto metadata_props = 14;

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.clearMetadataProps))))

(defn clear-graph
  "The parameterized graph that is evaluated to execute the model.
  .onnx.GraphProto graph = 7;

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.clearGraph))))

(defn clear-producer-name
  "The name of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_name = 2;

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.clearProducerName))))

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

  returns: `onnx.OnnxMlProto3$OperatorSetIdProtoOrBuilder`"
  (^onnx.OnnxMlProto3$OperatorSetIdProtoOrBuilder [^OnnxMlProto3$ModelProto$Builder this ^Integer index]
    (-> this (.getOpsetImportOrBuilder index))))

(defn add-opset-import
  "The OperatorSets this model relies on.
   All ModelProtos MUST have at least one entry that
   specifies which version of the ONNX OperatorSet is
   being imported.
   All nodes in the ModelProto's graph will bind against the operator
   with the same-domain/same-op_type operator with the HIGHEST version
   in the referenced operator sets.
  repeated .onnx.OperatorSetIdProto opset_import = 8;

  index - `int`
  value - `onnx.OnnxMlProto3$OperatorSetIdProto`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^Integer index ^onnx.OnnxMlProto3$OperatorSetIdProto value]
    (-> this (.addOpsetImport index value)))
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^onnx.OnnxMlProto3$OperatorSetIdProto value]
    (-> this (.addOpsetImport value))))

(defn set-graph
  "The parameterized graph that is evaluated to execute the model.
  .onnx.GraphProto graph = 7;

  value - `onnx.OnnxMlProto3$GraphProto`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^onnx.OnnxMlProto3$GraphProto value]
    (-> this (.setGraph value))))

(defn get-producer-name
  "The name of the framework or tool used to generate this model.
   This field SHOULD be present to indicate which implementation/tool/framework
   emitted the model.
  string producer_name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getProducerName))))

(defn set-domain-bytes
  "Domain name of the model.
   We use reverse domain names as name space indicators. For example:
   `com.facebook.fair` or `com.microsoft.cognitiveservices`
   Together with `model_version` and GraphProto.name, this forms the unique identity of
   the graph.
  string domain = 4;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$ModelProto$Builder`"
  (^onnx.OnnxMlProto3$ModelProto$Builder [^OnnxMlProto3$ModelProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDomainBytes value))))

(defn get-graph
  "The parameterized graph that is evaluated to execute the model.
  .onnx.GraphProto graph = 7;

  returns: `onnx.OnnxMlProto3$GraphProto`"
  (^onnx.OnnxMlProto3$GraphProto [^OnnxMlProto3$ModelProto$Builder this]
    (-> this (.getGraph))))

