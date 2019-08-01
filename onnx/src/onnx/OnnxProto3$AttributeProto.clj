(ns onnx.OnnxProto3$AttributeProto
  " A named attribute containing either singular float, integer, string
  and tensor values, or repeated float, integer, string and tensor values.
  An AttributeProto MUST contain the name field, and *only one* of the
  following content fields, effectively enforcing a C/C++ union equivalent.
 Protobuf type onnx.AttributeProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$AttributeProto]))

(def *-name-field-number
  "Static Constant.

  type: int"
  OnnxProto3$AttributeProto/NAME_FIELD_NUMBER)

(def *-doc-string-field-number
  "Static Constant.

  type: int"
  OnnxProto3$AttributeProto/DOC_STRING_FIELD_NUMBER)

(def *-type-field-number
  "Static Constant.

  type: int"
  OnnxProto3$AttributeProto/TYPE_FIELD_NUMBER)

(def *-f-field-number
  "Static Constant.

  type: int"
  OnnxProto3$AttributeProto/F_FIELD_NUMBER)

(def *-i-field-number
  "Static Constant.

  type: int"
  OnnxProto3$AttributeProto/I_FIELD_NUMBER)

(def *-s-field-number
  "Static Constant.

  type: int"
  OnnxProto3$AttributeProto/S_FIELD_NUMBER)

(def *-t-field-number
  "Static Constant.

  type: int"
  OnnxProto3$AttributeProto/T_FIELD_NUMBER)

(def *-g-field-number
  "Static Constant.

  type: int"
  OnnxProto3$AttributeProto/G_FIELD_NUMBER)

(def *-floats-field-number
  "Static Constant.

  type: int"
  OnnxProto3$AttributeProto/FLOATS_FIELD_NUMBER)

(def *-ints-field-number
  "Static Constant.

  type: int"
  OnnxProto3$AttributeProto/INTS_FIELD_NUMBER)

(def *-strings-field-number
  "Static Constant.

  type: int"
  OnnxProto3$AttributeProto/STRINGS_FIELD_NUMBER)

(def *-tensors-field-number
  "Static Constant.

  type: int"
  OnnxProto3$AttributeProto/TENSORS_FIELD_NUMBER)

(def *-graphs-field-number
  "Static Constant.

  type: int"
  OnnxProto3$AttributeProto/GRAPHS_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxProto3$AttributeProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$AttributeProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxProto3$AttributeProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$AttributeProto/parseFrom data extension-registry))
  (^onnx.OnnxProto3$AttributeProto [^java.nio.ByteBuffer data]
    (OnnxProto3$AttributeProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxProto3$AttributeProto`

  throws: java.io.IOException"
  (^onnx.OnnxProto3$AttributeProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxProto3$AttributeProto/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxProto3$AttributeProto [^java.io.InputStream input]
    (OnnxProto3$AttributeProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxProto3$AttributeProto`

  returns: `onnx.OnnxProto3$AttributeProto$Builder`"
  (^onnx.OnnxProto3$AttributeProto$Builder [^onnx.OnnxProto3$AttributeProto prototype]
    (OnnxProto3$AttributeProto/newBuilder prototype))
  (^onnx.OnnxProto3$AttributeProto$Builder []
    (OnnxProto3$AttributeProto/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxProto3$AttributeProto`"
  (^onnx.OnnxProto3$AttributeProto []
    (OnnxProto3$AttributeProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$AttributeProto>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxProto3$AttributeProto/parser )))

(defn get-f
  "Exactly ONE of the following fields must be present for this version of the IR
  float f = 2;

  returns: `float`"
  (^Float [^OnnxProto3$AttributeProto this]
    (-> this (.getF))))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxProto3$AttributeProto this]
    (-> this (.getUnknownFields))))

(defn get-g-or-builder
  "graph
  .onnx.GraphProto g = 6;

  returns: `onnx.OnnxProto3$GraphProtoOrBuilder`"
  (^onnx.OnnxProto3$GraphProtoOrBuilder [^OnnxProto3$AttributeProto this]
    (-> this (.getGOrBuilder))))

(defn get-ints-list
  "list of ints
  repeated int64 ints = 8;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^OnnxProto3$AttributeProto this]
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
  (^Integer [^OnnxProto3$AttributeProto this]
    (-> this (.getTypeValue))))

(defn get-type
  "The type field MUST be present for this version of the IR.
   For 0.0.1 versions of the IR, this field was not defined, and
   implementations needed to use has_field hueristics to determine
   which value field was in use.  For IR_VERSION 0.0.2 or later, this
   field MUST be set and match the f|i|s|t|... field in use.  This
   change was made to accomodate proto3 implementations.
  .onnx.AttributeProto.AttributeType type = 20;

  returns: `onnx.OnnxProto3$AttributeProto$AttributeType`"
  (^onnx.OnnxProto3$AttributeProto$AttributeType [^OnnxProto3$AttributeProto this]
    (-> this (.getType))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxProto3$AttributeProto this]
    (-> this (.isInitialized))))

(defn get-tensors-or-builder
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  index - `int`

  returns: `onnx.OnnxProto3$TensorProtoOrBuilder`"
  (^onnx.OnnxProto3$TensorProtoOrBuilder [^OnnxProto3$AttributeProto this ^Integer index]
    (-> this (.getTensorsOrBuilder index))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxProto3$AttributeProto`"
  (^onnx.OnnxProto3$AttributeProto [^OnnxProto3$AttributeProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-doc-string-bytes
  "A human-readable documentation for this attribute. Markdown is allowed.
  string doc_string = 13;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$AttributeProto this]
    (-> this (.getDocStringBytes))))

(defn get-floats
  "list of floats
  repeated float floats = 7;

  index - `int`

  returns: `float`"
  (^Float [^OnnxProto3$AttributeProto this ^Integer index]
    (-> this (.getFloats index))))

(defn get-name-bytes
  "The name field MUST be present for this version of the IR.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$AttributeProto this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxProto3$AttributeProto this]
    (-> this (.getSerializedSize))))

(defn get-t
  "tensor value
  .onnx.TensorProto t = 5;

  returns: `onnx.OnnxProto3$TensorProto`"
  (^onnx.OnnxProto3$TensorProto [^OnnxProto3$AttributeProto this]
    (-> this (.getT))))

(defn get-strings-count
  "list of UTF-8 strings
  repeated bytes strings = 9;

  returns: `int`"
  (^Integer [^OnnxProto3$AttributeProto this]
    (-> this (.getStringsCount))))

(defn get-graphs
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  index - `int`

  returns: `onnx.OnnxProto3$GraphProto`"
  (^onnx.OnnxProto3$GraphProto [^OnnxProto3$AttributeProto this ^Integer index]
    (-> this (.getGraphs index))))

(defn get-graphs-or-builder
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  index - `int`

  returns: `onnx.OnnxProto3$GraphProtoOrBuilder`"
  (^onnx.OnnxProto3$GraphProtoOrBuilder [^OnnxProto3$AttributeProto this ^Integer index]
    (-> this (.getGraphsOrBuilder index))))

(defn get-ints
  "list of ints
  repeated int64 ints = 8;

  index - `int`

  returns: `long`"
  (^Long [^OnnxProto3$AttributeProto this ^Integer index]
    (-> this (.getInts index))))

(defn get-doc-string
  "A human-readable documentation for this attribute. Markdown is allowed.
  string doc_string = 13;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$AttributeProto this]
    (-> this (.getDocString))))

(defn get-name
  "The name field MUST be present for this version of the IR.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxProto3$AttributeProto this]
    (-> this (.getName))))

(defn get-g
  "graph
  .onnx.GraphProto g = 6;

  returns: `onnx.OnnxProto3$GraphProto`"
  (^onnx.OnnxProto3$GraphProto [^OnnxProto3$AttributeProto this]
    (-> this (.getG))))

(defn get-floats-list
  "list of floats
  repeated float floats = 7;

  returns: `java.util.List<java.lang.Float>`"
  (^java.util.List [^OnnxProto3$AttributeProto this]
    (-> this (.getFloatsList))))

(defn has-t?
  "tensor value
  .onnx.TensorProto t = 5;

  returns: `boolean`"
  (^Boolean [^OnnxProto3$AttributeProto this]
    (-> this (.hasT))))

(defn get-ints-count
  "list of ints
  repeated int64 ints = 8;

  returns: `int`"
  (^Integer [^OnnxProto3$AttributeProto this]
    (-> this (.getIntsCount))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxProto3$AttributeProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-t-or-builder
  "tensor value
  .onnx.TensorProto t = 5;

  returns: `onnx.OnnxProto3$TensorProtoOrBuilder`"
  (^onnx.OnnxProto3$TensorProtoOrBuilder [^OnnxProto3$AttributeProto this]
    (-> this (.getTOrBuilder))))

(defn get-graphs-count
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  returns: `int`"
  (^Integer [^OnnxProto3$AttributeProto this]
    (-> this (.getGraphsCount))))

(defn get-strings
  "list of UTF-8 strings
  repeated bytes strings = 9;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$AttributeProto this ^Integer index]
    (-> this (.getStrings index))))

(defn get-i
  "int
  int64 i = 3;

  returns: `long`"
  (^Long [^OnnxProto3$AttributeProto this]
    (-> this (.getI))))

(defn get-graphs-list
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  returns: `java.util.List<onnx.OnnxProto3$GraphProto>`"
  (^java.util.List [^OnnxProto3$AttributeProto this]
    (-> this (.getGraphsList))))

(defn get-tensors
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  index - `int`

  returns: `onnx.OnnxProto3$TensorProto`"
  (^onnx.OnnxProto3$TensorProto [^OnnxProto3$AttributeProto this ^Integer index]
    (-> this (.getTensors index))))

(defn get-graphs-or-builder-list
  "list of graph
  repeated .onnx.GraphProto graphs = 11;

  returns: `java.util.List<? extends onnx.OnnxProto3$GraphProtoOrBuilder>`"
  ([^OnnxProto3$AttributeProto this]
    (-> this (.getGraphsOrBuilderList))))

(defn get-tensors-or-builder-list
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  returns: `java.util.List<? extends onnx.OnnxProto3$TensorProtoOrBuilder>`"
  ([^OnnxProto3$AttributeProto this]
    (-> this (.getTensorsOrBuilderList))))

(defn has-g?
  "graph
  .onnx.GraphProto g = 6;

  returns: `boolean`"
  (^Boolean [^OnnxProto3$AttributeProto this]
    (-> this (.hasG))))

(defn get-tensors-list
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  returns: `java.util.List<onnx.OnnxProto3$TensorProto>`"
  (^java.util.List [^OnnxProto3$AttributeProto this]
    (-> this (.getTensorsList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxProto3$AttributeProto this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxProto3$AttributeProto>`"
  (^com.github.os72.protobuf351.Parser [^OnnxProto3$AttributeProto this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxProto3$AttributeProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-strings-list
  "list of UTF-8 strings
  repeated bytes strings = 9;

  returns: `java.util.List<com.github.os72.protobuf351.ByteString>`"
  (^java.util.List [^OnnxProto3$AttributeProto this]
    (-> this (.getStringsList))))

(defn new-builder-for-type
  "returns: `onnx.OnnxProto3$AttributeProto$Builder`"
  (^onnx.OnnxProto3$AttributeProto$Builder [^OnnxProto3$AttributeProto this]
    (-> this (.newBuilderForType))))

(defn get-tensors-count
  "list of tensors
  repeated .onnx.TensorProto tensors = 10;

  returns: `int`"
  (^Integer [^OnnxProto3$AttributeProto this]
    (-> this (.getTensorsCount))))

(defn to-builder
  "returns: `onnx.OnnxProto3$AttributeProto$Builder`"
  (^onnx.OnnxProto3$AttributeProto$Builder [^OnnxProto3$AttributeProto this]
    (-> this (.toBuilder))))

(defn get-floats-count
  "list of floats
  repeated float floats = 7;

  returns: `int`"
  (^Integer [^OnnxProto3$AttributeProto this]
    (-> this (.getFloatsCount))))

(defn get-s
  "UTF-8 string
  bytes s = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxProto3$AttributeProto this]
    (-> this (.getS))))

