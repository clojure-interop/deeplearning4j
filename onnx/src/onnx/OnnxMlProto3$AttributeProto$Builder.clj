(ns onnx.OnnxMlProto3$AttributeProto$Builder
  " A named attribute containing either singular float, integer, string
  and tensor values, or repeated float, integer, string and tensor values.
  An AttributeProto MUST contain the name field, and *only one* of the
  following content fields, effectively enforcing a C/C++ union equivalent.
 Protobuf type onnx.AttributeProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$AttributeProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$AttributeProto$Builder/getDescriptor )))

(defn get-f
  "Exactly ONE of the following fields must be present for this version of the IR
  float f = 2;

  returns: `float`"
  (^Float [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getF))))

(defn clear-doc-string
  "A human-readable documentation for this attribute. Markdown is allowed.
  string doc_string = 13;

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.clearDocString))))

(defn get-g-or-builder
  "graph
  .onnx.GraphProto g = 6;

  returns: `onnx.OnnxMlProto3$GraphProtoOrBuilder`"
  (^onnx.OnnxMlProto3$GraphProtoOrBuilder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getGOrBuilder))))

(defn clear-s
  "UTF-8 string
  bytes s = 4;

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.clearS))))

(defn clear-name
  "The name field MUST be present for this version of the IR.
  string name = 1;

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.clearName))))

(defn get-ints-list
  "list of ints
  repeated int64 ints = 8;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getIntsList))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn set-tensors
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  index - `int`
  value - `onnx.OnnxMlProto3$TensorProto`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Integer index ^onnx.OnnxMlProto3$TensorProto value]
    (-> this (.setTensors index value))))

(defn merge-g
  "graph
  .onnx.GraphProto g = 6;

  value - `onnx.OnnxMlProto3$GraphProto`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^onnx.OnnxMlProto3$GraphProto value]
    (-> this (.mergeG value))))

(defn get-type-value
  "The type field MUST be present for this version of the IR.
   For 0.0.1 versions of the IR, this field was not defined, and
   implementations needed to use has_field hueristics to determine
   which value field was in use.  For IR_VERSION 0.0.2 or later, this
   field MUST be set and match the f|i|s|t|... field in use.  This
   change was made to accomodate proto3 implementations.
  .onnx.AttributeProto.AttributeType type = 20;

  returns: `int`"
  (^Integer [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getTypeValue))))

(defn clear-i
  "int
  int64 i = 3;

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.clearI))))

(defn add-all-graphs
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllGraphs values))))

(defn build-partial
  "returns: `onnx.OnnxMlProto3$AttributeProto`"
  (^onnx.OnnxMlProto3$AttributeProto [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.buildPartial))))

(defn set-doc-string
  "A human-readable documentation for this attribute. Markdown is allowed.
  string doc_string = 13;

  value - `java.lang.String`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^java.lang.String value]
    (-> this (.setDocString value))))

(defn get-type
  "The type field MUST be present for this version of the IR.
   For 0.0.1 versions of the IR, this field was not defined, and
   implementations needed to use has_field hueristics to determine
   which value field was in use.  For IR_VERSION 0.0.2 or later, this
   field MUST be set and match the f|i|s|t|... field in use.  This
   change was made to accomodate proto3 implementations.
  .onnx.AttributeProto.AttributeType type = 20;

  returns: `onnx.OnnxMlProto3$AttributeProto$AttributeType`"
  (^onnx.OnnxMlProto3$AttributeProto$AttributeType [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getType))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.isInitialized))))

(defn get-tensors-or-builder
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  index - `int`

  returns: `onnx.OnnxMlProto3$TensorProtoOrBuilder`"
  (^onnx.OnnxMlProto3$TensorProtoOrBuilder [^OnnxMlProto3$AttributeProto$Builder this ^Integer index]
    (-> this (.getTensorsOrBuilder index))))

(defn get-g-builder
  "graph
  .onnx.GraphProto g = 6;

  returns: `onnx.OnnxMlProto3$GraphProto$Builder`"
  (^onnx.OnnxMlProto3$GraphProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getGBuilder))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$AttributeProto`"
  (^onnx.OnnxMlProto3$AttributeProto [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-graphs
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.clearGraphs))))

(defn get-doc-string-bytes
  "A human-readable documentation for this attribute. Markdown is allowed.
  string doc_string = 13;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getDocStringBytes))))

(defn add-floats
  "list of floats
  repeated float floats = 7;

  value - `float`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Float value]
    (-> this (.addFloats value))))

(defn get-floats
  "list of floats
  repeated float floats = 7;

  index - `int`

  returns: `float`"
  (^Float [^OnnxMlProto3$AttributeProto$Builder this ^Integer index]
    (-> this (.getFloats index))))

(defn set-type
  "The type field MUST be present for this version of the IR.
   For 0.0.1 versions of the IR, this field was not defined, and
   implementations needed to use has_field hueristics to determine
   which value field was in use.  For IR_VERSION 0.0.2 or later, this
   field MUST be set and match the f|i|s|t|... field in use.  This
   change was made to accomodate proto3 implementations.
  .onnx.AttributeProto.AttributeType type = 20;

  value - `onnx.OnnxMlProto3$AttributeProto$AttributeType`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^onnx.OnnxMlProto3$AttributeProto$AttributeType value]
    (-> this (.setType value))))

(defn merge-t
  "tensor value
  .onnx.TensorProto t = 5;

  value - `onnx.OnnxMlProto3$TensorProto`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^onnx.OnnxMlProto3$TensorProto value]
    (-> this (.mergeT value))))

(defn set-doc-string-bytes
  "A human-readable documentation for this attribute. Markdown is allowed.
  string doc_string = 13;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDocStringBytes value))))

(defn get-name-bytes
  "The name field MUST be present for this version of the IR.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getNameBytes))))

(defn set-ints
  "list of ints
  repeated int64 ints = 8;

  index - `int`
  value - `long`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Integer index ^Long value]
    (-> this (.setInts index value))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn clear-floats
  "list of floats
  repeated float floats = 7;

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.clearFloats))))

(defn set-name
  "The name field MUST be present for this version of the IR.
  string name = 1;

  value - `java.lang.String`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn set-floats
  "list of floats
  repeated float floats = 7;

  index - `int`
  value - `float`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Integer index ^Float value]
    (-> this (.setFloats index value))))

(defn add-all-ints
  "list of ints
  repeated int64 ints = 8;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllInts values))))

(defn get-t
  "tensor value
  .onnx.TensorProto t = 5;

  returns: `onnx.OnnxMlProto3$TensorProto`"
  (^onnx.OnnxMlProto3$TensorProto [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getT))))

(defn get-strings-count
  "list of UTF-8 strings
  repeated bytes strings = 9;

  returns: `int`"
  (^Integer [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getStringsCount))))

(defn add-strings
  "list of UTF-8 strings
  repeated bytes strings = 9;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.addStrings value))))

(defn get-tensors-builder
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  index - `int`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Integer index]
    (-> this (.getTensorsBuilder index))))

(defn get-graphs
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  index - `int`

  returns: `onnx.OnnxMlProto3$GraphProto`"
  (^onnx.OnnxMlProto3$GraphProto [^OnnxMlProto3$AttributeProto$Builder this ^Integer index]
    (-> this (.getGraphs index))))

(defn get-graphs-or-builder
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  index - `int`

  returns: `onnx.OnnxMlProto3$GraphProtoOrBuilder`"
  (^onnx.OnnxMlProto3$GraphProtoOrBuilder [^OnnxMlProto3$AttributeProto$Builder this ^Integer index]
    (-> this (.getGraphsOrBuilder index))))

(defn get-ints
  "list of ints
  repeated int64 ints = 8;

  index - `int`

  returns: `long`"
  (^Long [^OnnxMlProto3$AttributeProto$Builder this ^Integer index]
    (-> this (.getInts index))))

(defn add-tensors-builder
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  index - `int`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Integer index]
    (-> this (.addTensorsBuilder index)))
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.addTensorsBuilder))))

(defn get-doc-string
  "A human-readable documentation for this attribute. Markdown is allowed.
  string doc_string = 13;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getDocString))))

(defn add-all-floats
  "list of floats
  repeated float floats = 7;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllFloats values))))

(defn clear-g
  "graph
  .onnx.GraphProto g = 6;

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.clearG))))

(defn get-name
  "The name field MUST be present for this version of the IR.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getName))))

(defn set-s
  "UTF-8 string
  bytes s = 4;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setS value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-g
  "graph
  .onnx.GraphProto g = 6;

  returns: `onnx.OnnxMlProto3$GraphProto`"
  (^onnx.OnnxMlProto3$GraphProto [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getG))))

(defn get-floats-list
  "list of floats
  repeated float floats = 7;

  returns: `java.util.List<java.lang.Float>`"
  (^java.util.List [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getFloatsList))))

(defn get-tensors-builder-list
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  returns: `java.util.List<onnx.OnnxMlProto3$TensorProto$Builder>`"
  (^java.util.List [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getTensorsBuilderList))))

(defn set-name-bytes
  "The name field MUST be present for this version of the IR.
  string name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn has-t?
  "tensor value
  .onnx.TensorProto t = 5;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.hasT))))

(defn set-t
  "tensor value
  .onnx.TensorProto t = 5;

  value - `onnx.OnnxMlProto3$TensorProto`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^onnx.OnnxMlProto3$TensorProto value]
    (-> this (.setT value))))

(defn get-ints-count
  "list of ints
  repeated int64 ints = 8;

  returns: `int`"
  (^Integer [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getIntsCount))))

(defn get-graphs-builder-list
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  returns: `java.util.List<onnx.OnnxMlProto3$GraphProto$Builder>`"
  (^java.util.List [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getGraphsBuilderList))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `onnx.OnnxMlProto3$AttributeProto`"
  (^onnx.OnnxMlProto3$AttributeProto [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.build))))

(defn get-t-or-builder
  "tensor value
  .onnx.TensorProto t = 5;

  returns: `onnx.OnnxMlProto3$TensorProtoOrBuilder`"
  (^onnx.OnnxMlProto3$TensorProtoOrBuilder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getTOrBuilder))))

(defn get-graphs-count
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  returns: `int`"
  (^Integer [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getGraphsCount))))

(defn get-strings
  "list of UTF-8 strings
  repeated bytes strings = 9;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$AttributeProto$Builder this ^Integer index]
    (-> this (.getStrings index))))

(defn get-i
  "int
  int64 i = 3;

  returns: `long`"
  (^Long [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getI))))

(defn get-graphs-list
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  returns: `java.util.List<onnx.OnnxMlProto3$GraphProto>`"
  (^java.util.List [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getGraphsList))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn set-graphs
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  index - `int`
  value - `onnx.OnnxMlProto3$GraphProto`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Integer index ^onnx.OnnxMlProto3$GraphProto value]
    (-> this (.setGraphs index value))))

(defn clear-type
  "The type field MUST be present for this version of the IR.
   For 0.0.1 versions of the IR, this field was not defined, and
   implementations needed to use has_field hueristics to determine
   which value field was in use.  For IR_VERSION 0.0.2 or later, this
   field MUST be set and match the f|i|s|t|... field in use.  This
   change was made to accomodate proto3 implementations.
  .onnx.AttributeProto.AttributeType type = 20;

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.clearType))))

(defn get-tensors
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  index - `int`

  returns: `onnx.OnnxMlProto3$TensorProto`"
  (^onnx.OnnxMlProto3$TensorProto [^OnnxMlProto3$AttributeProto$Builder this ^Integer index]
    (-> this (.getTensors index))))

(defn add-graphs-builder
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  index - `int`

  returns: `onnx.OnnxMlProto3$GraphProto$Builder`"
  (^onnx.OnnxMlProto3$GraphProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Integer index]
    (-> this (.addGraphsBuilder index)))
  (^onnx.OnnxMlProto3$GraphProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.addGraphsBuilder))))

(defn get-graphs-builder
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  index - `int`

  returns: `onnx.OnnxMlProto3$GraphProto$Builder`"
  (^onnx.OnnxMlProto3$GraphProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Integer index]
    (-> this (.getGraphsBuilder index))))

(defn clear-ints
  "list of ints
  repeated int64 ints = 8;

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.clearInts))))

(defn add-ints
  "list of ints
  repeated int64 ints = 8;

  value - `long`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Long value]
    (-> this (.addInts value))))

(defn get-graphs-or-builder-list
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  returns: `java.util.List<? extends onnx.OnnxMlProto3$GraphProtoOrBuilder>`"
  ([^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getGraphsOrBuilderList))))

(defn clear-strings
  "list of UTF-8 strings
  repeated bytes strings = 9;

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.clearStrings))))

(defn remove-tensors
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  index - `int`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Integer index]
    (-> this (.removeTensors index))))

(defn clear-f
  "Exactly ONE of the following fields must be present for this version of the IR
  float f = 2;

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.clearF))))

(defn set-type-value
  "The type field MUST be present for this version of the IR.
   For 0.0.1 versions of the IR, this field was not defined, and
   implementations needed to use has_field hueristics to determine
   which value field was in use.  For IR_VERSION 0.0.2 or later, this
   field MUST be set and match the f|i|s|t|... field in use.  This
   change was made to accomodate proto3 implementations.
  .onnx.AttributeProto.AttributeType type = 20;

  value - `int`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Integer value]
    (-> this (.setTypeValue value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn get-tensors-or-builder-list
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  returns: `java.util.List<? extends onnx.OnnxMlProto3$TensorProtoOrBuilder>`"
  ([^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getTensorsOrBuilderList))))

(defn set-f
  "Exactly ONE of the following fields must be present for this version of the IR
  float f = 2;

  value - `float`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Float value]
    (-> this (.setF value))))

(defn has-g?
  "graph
  .onnx.GraphProto g = 6;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.hasG))))

(defn clone
  "returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.clone))))

(defn get-tensors-list
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  returns: `java.util.List<onnx.OnnxMlProto3$TensorProto>`"
  (^java.util.List [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getTensorsList))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn add-all-tensors
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllTensors values))))

(defn clear
  "returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-i
  "int
  int64 i = 3;

  value - `long`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Long value]
    (-> this (.setI value))))

(defn clear-tensors
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.clearTensors))))

(defn add-all-strings
  "list of UTF-8 strings
  repeated bytes strings = 9;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllStrings values))))

(defn get-t-builder
  "tensor value
  .onnx.TensorProto t = 5;

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getTBuilder))))

(defn get-strings-list
  "list of UTF-8 strings
  repeated bytes strings = 9;

  returns: `java.util.List<com.github.os72.protobuf351.ByteString>`"
  (^java.util.List [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getStringsList))))

(defn add-graphs
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  index - `int`
  value - `onnx.OnnxMlProto3$GraphProto`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Integer index ^onnx.OnnxMlProto3$GraphProto value]
    (-> this (.addGraphs index value)))
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^onnx.OnnxMlProto3$GraphProto value]
    (-> this (.addGraphs value))))

(defn remove-graphs
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  index - `int`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Integer index]
    (-> this (.removeGraphs index))))

(defn set-g
  "graph
  .onnx.GraphProto g = 6;

  value - `onnx.OnnxMlProto3$GraphProto`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^onnx.OnnxMlProto3$GraphProto value]
    (-> this (.setG value))))

(defn set-strings
  "list of UTF-8 strings
  repeated bytes strings = 9;

  index - `int`
  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Integer index ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setStrings index value))))

(defn add-tensors
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  index - `int`
  value - `onnx.OnnxMlProto3$TensorProto`

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^Integer index ^onnx.OnnxMlProto3$TensorProto value]
    (-> this (.addTensors index value)))
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this ^onnx.OnnxMlProto3$TensorProto value]
    (-> this (.addTensors value))))

(defn get-tensors-count
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  returns: `int`"
  (^Integer [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getTensorsCount))))

(defn get-floats-count
  "list of floats
  repeated float floats = 7;

  returns: `int`"
  (^Integer [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getFloatsCount))))

(defn clear-t
  "tensor value
  .onnx.TensorProto t = 5;

  returns: `onnx.OnnxMlProto3$AttributeProto$Builder`"
  (^onnx.OnnxMlProto3$AttributeProto$Builder [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.clearT))))

(defn get-s
  "UTF-8 string
  bytes s = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$AttributeProto$Builder this]
    (-> this (.getS))))

