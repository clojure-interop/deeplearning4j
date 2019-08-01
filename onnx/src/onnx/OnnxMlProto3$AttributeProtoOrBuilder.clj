(ns onnx.OnnxMlProto3$AttributeProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$AttributeProtoOrBuilder]))

(defn get-f
  "Exactly ONE of the following fields must be present for this version of the IR
  float f = 2;

  returns: `float`"
  (^Float [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getF))))

(defn get-g-or-builder
  "graph
  .onnx.GraphProto g = 6;

  returns: `onnx.OnnxMlProto3$GraphProtoOrBuilder`"
  (^onnx.OnnxMlProto3$GraphProtoOrBuilder [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getGOrBuilder))))

(defn get-ints-list
  "list of ints
  repeated int64 ints = 8;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getIntsList))))

(defn get-type-value
  "The type field MUST be present for this version of the IR.
   For 0.0.1 versions of the IR, this field was not defined, and
   implementations needed to use has_field hueristics to determine
   which value field was in use.  For IR_VERSION 0.0.2 or later, this
   field MUST be set and match the f|i|s|t|... field in use.  This
   change was made to accomodate proto3 implementations.
  .onnx.AttributeProto.AttributeType type = 20;

  returns: `int`"
  (^Integer [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getTypeValue))))

(defn get-type
  "The type field MUST be present for this version of the IR.
   For 0.0.1 versions of the IR, this field was not defined, and
   implementations needed to use has_field hueristics to determine
   which value field was in use.  For IR_VERSION 0.0.2 or later, this
   field MUST be set and match the f|i|s|t|... field in use.  This
   change was made to accomodate proto3 implementations.
  .onnx.AttributeProto.AttributeType type = 20;

  returns: `onnx.OnnxMlProto3$AttributeProto$AttributeType`"
  (^onnx.OnnxMlProto3$AttributeProto$AttributeType [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getType))))

(defn get-tensors-or-builder
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  index - `int`

  returns: `onnx.OnnxMlProto3$TensorProtoOrBuilder`"
  (^onnx.OnnxMlProto3$TensorProtoOrBuilder [^OnnxMlProto3$AttributeProtoOrBuilder this ^Integer index]
    (-> this (.getTensorsOrBuilder index))))

(defn get-doc-string-bytes
  "A human-readable documentation for this attribute. Markdown is allowed.
  string doc_string = 13;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getDocStringBytes))))

(defn get-floats
  "list of floats
  repeated float floats = 7;

  index - `int`

  returns: `float`"
  (^Float [^OnnxMlProto3$AttributeProtoOrBuilder this ^Integer index]
    (-> this (.getFloats index))))

(defn get-name-bytes
  "The name field MUST be present for this version of the IR.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-t
  "tensor value
  .onnx.TensorProto t = 5;

  returns: `onnx.OnnxMlProto3$TensorProto`"
  (^onnx.OnnxMlProto3$TensorProto [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getT))))

(defn get-strings-count
  "list of UTF-8 strings
  repeated bytes strings = 9;

  returns: `int`"
  (^Integer [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getStringsCount))))

(defn get-graphs
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  index - `int`

  returns: `onnx.OnnxMlProto3$GraphProto`"
  (^onnx.OnnxMlProto3$GraphProto [^OnnxMlProto3$AttributeProtoOrBuilder this ^Integer index]
    (-> this (.getGraphs index))))

(defn get-graphs-or-builder
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  index - `int`

  returns: `onnx.OnnxMlProto3$GraphProtoOrBuilder`"
  (^onnx.OnnxMlProto3$GraphProtoOrBuilder [^OnnxMlProto3$AttributeProtoOrBuilder this ^Integer index]
    (-> this (.getGraphsOrBuilder index))))

(defn get-ints
  "list of ints
  repeated int64 ints = 8;

  index - `int`

  returns: `long`"
  (^Long [^OnnxMlProto3$AttributeProtoOrBuilder this ^Integer index]
    (-> this (.getInts index))))

(defn get-doc-string
  "A human-readable documentation for this attribute. Markdown is allowed.
  string doc_string = 13;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getDocString))))

(defn get-name
  "The name field MUST be present for this version of the IR.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getName))))

(defn get-g
  "graph
  .onnx.GraphProto g = 6;

  returns: `onnx.OnnxMlProto3$GraphProto`"
  (^onnx.OnnxMlProto3$GraphProto [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getG))))

(defn get-floats-list
  "list of floats
  repeated float floats = 7;

  returns: `java.util.List<java.lang.Float>`"
  (^java.util.List [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getFloatsList))))

(defn has-t?
  "tensor value
  .onnx.TensorProto t = 5;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.hasT))))

(defn get-ints-count
  "list of ints
  repeated int64 ints = 8;

  returns: `int`"
  (^Integer [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getIntsCount))))

(defn get-t-or-builder
  "tensor value
  .onnx.TensorProto t = 5;

  returns: `onnx.OnnxMlProto3$TensorProtoOrBuilder`"
  (^onnx.OnnxMlProto3$TensorProtoOrBuilder [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getTOrBuilder))))

(defn get-graphs-count
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  returns: `int`"
  (^Integer [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getGraphsCount))))

(defn get-strings
  "list of UTF-8 strings
  repeated bytes strings = 9;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$AttributeProtoOrBuilder this ^Integer index]
    (-> this (.getStrings index))))

(defn get-i
  "int
  int64 i = 3;

  returns: `long`"
  (^Long [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getI))))

(defn get-graphs-list
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  returns: `java.util.List<onnx.OnnxMlProto3$GraphProto>`"
  (^java.util.List [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getGraphsList))))

(defn get-tensors
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  index - `int`

  returns: `onnx.OnnxMlProto3$TensorProto`"
  (^onnx.OnnxMlProto3$TensorProto [^OnnxMlProto3$AttributeProtoOrBuilder this ^Integer index]
    (-> this (.getTensors index))))

(defn get-graphs-or-builder-list
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  returns: `java.util.List<? extends onnx.OnnxMlProto3$GraphProtoOrBuilder>`"
  ([^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getGraphsOrBuilderList))))

(defn get-tensors-or-builder-list
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  returns: `java.util.List<? extends onnx.OnnxMlProto3$TensorProtoOrBuilder>`"
  ([^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getTensorsOrBuilderList))))

(defn has-g?
  "graph
  .onnx.GraphProto g = 6;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.hasG))))

(defn get-tensors-list
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  returns: `java.util.List<onnx.OnnxMlProto3$TensorProto>`"
  (^java.util.List [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getTensorsList))))

(defn get-strings-list
  "list of UTF-8 strings
  repeated bytes strings = 9;

  returns: `java.util.List<com.github.os72.protobuf351.ByteString>`"
  (^java.util.List [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getStringsList))))

(defn get-tensors-count
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  returns: `int`"
  (^Integer [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getTensorsCount))))

(defn get-floats-count
  "list of floats
  repeated float floats = 7;

  returns: `int`"
  (^Integer [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getFloatsCount))))

(defn get-s
  "UTF-8 string
  bytes s = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$AttributeProtoOrBuilder this]
    (-> this (.getS))))

