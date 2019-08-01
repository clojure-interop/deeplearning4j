(ns onnx.OnnxMlProto3$AttributeProto$AttributeType
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$AttributeProto$AttributeType]))

(def UNDEFINED
  "Enum Constant.

  UNDEFINED = 0;

  type: onnx.OnnxMlProto3$AttributeProto$AttributeType"
  OnnxMlProto3$AttributeProto$AttributeType/UNDEFINED)

(def FLOAT
  "Enum Constant.

  FLOAT = 1;

  type: onnx.OnnxMlProto3$AttributeProto$AttributeType"
  OnnxMlProto3$AttributeProto$AttributeType/FLOAT)

(def INT
  "Enum Constant.

  INT = 2;

  type: onnx.OnnxMlProto3$AttributeProto$AttributeType"
  OnnxMlProto3$AttributeProto$AttributeType/INT)

(def STRING
  "Enum Constant.

  STRING = 3;

  type: onnx.OnnxMlProto3$AttributeProto$AttributeType"
  OnnxMlProto3$AttributeProto$AttributeType/STRING)

(def TENSOR
  "Enum Constant.

  TENSOR = 4;

  type: onnx.OnnxMlProto3$AttributeProto$AttributeType"
  OnnxMlProto3$AttributeProto$AttributeType/TENSOR)

(def GRAPH
  "Enum Constant.

  GRAPH = 5;

  type: onnx.OnnxMlProto3$AttributeProto$AttributeType"
  OnnxMlProto3$AttributeProto$AttributeType/GRAPH)

(def FLOATS
  "Enum Constant.

  FLOATS = 6;

  type: onnx.OnnxMlProto3$AttributeProto$AttributeType"
  OnnxMlProto3$AttributeProto$AttributeType/FLOATS)

(def INTS
  "Enum Constant.

  INTS = 7;

  type: onnx.OnnxMlProto3$AttributeProto$AttributeType"
  OnnxMlProto3$AttributeProto$AttributeType/INTS)

(def STRINGS
  "Enum Constant.

  STRINGS = 8;

  type: onnx.OnnxMlProto3$AttributeProto$AttributeType"
  OnnxMlProto3$AttributeProto$AttributeType/STRINGS)

(def TENSORS
  "Enum Constant.

  TENSORS = 9;

  type: onnx.OnnxMlProto3$AttributeProto$AttributeType"
  OnnxMlProto3$AttributeProto$AttributeType/TENSORS)

(def GRAPHS
  "Enum Constant.

  GRAPHS = 10;

  type: onnx.OnnxMlProto3$AttributeProto$AttributeType"
  OnnxMlProto3$AttributeProto$AttributeType/GRAPHS)

(def UNRECOGNIZED
  "Enum Constant.

  type: onnx.OnnxMlProto3$AttributeProto$AttributeType"
  OnnxMlProto3$AttributeProto$AttributeType/UNRECOGNIZED)

(def *-undefined-value
  "Static Constant.

  UNDEFINED = 0;

  type: int"
  OnnxMlProto3$AttributeProto$AttributeType/UNDEFINED_VALUE)

(def *-float-value
  "Static Constant.

  FLOAT = 1;

  type: int"
  OnnxMlProto3$AttributeProto$AttributeType/FLOAT_VALUE)

(def *-int-value
  "Static Constant.

  INT = 2;

  type: int"
  OnnxMlProto3$AttributeProto$AttributeType/INT_VALUE)

(def *-string-value
  "Static Constant.

  STRING = 3;

  type: int"
  OnnxMlProto3$AttributeProto$AttributeType/STRING_VALUE)

(def *-tensor-value
  "Static Constant.

  TENSOR = 4;

  type: int"
  OnnxMlProto3$AttributeProto$AttributeType/TENSOR_VALUE)

(def *-graph-value
  "Static Constant.

  GRAPH = 5;

  type: int"
  OnnxMlProto3$AttributeProto$AttributeType/GRAPH_VALUE)

(def *-floats-value
  "Static Constant.

  FLOATS = 6;

  type: int"
  OnnxMlProto3$AttributeProto$AttributeType/FLOATS_VALUE)

(def *-ints-value
  "Static Constant.

  INTS = 7;

  type: int"
  OnnxMlProto3$AttributeProto$AttributeType/INTS_VALUE)

(def *-strings-value
  "Static Constant.

  STRINGS = 8;

  type: int"
  OnnxMlProto3$AttributeProto$AttributeType/STRINGS_VALUE)

(def *-tensors-value
  "Static Constant.

  TENSORS = 9;

  type: int"
  OnnxMlProto3$AttributeProto$AttributeType/TENSORS_VALUE)

(def *-graphs-value
  "Static Constant.

  GRAPHS = 10;

  type: int"
  OnnxMlProto3$AttributeProto$AttributeType/GRAPHS_VALUE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (OnnxMlProto3.AttributeProto.AttributeType c : OnnxMlProto3.AttributeProto.AttributeType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `onnx.OnnxMlProto3$AttributeProto$AttributeType[]`"
  ([]
    (OnnxMlProto3$AttributeProto$AttributeType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `onnx.OnnxMlProto3$AttributeProto$AttributeType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^onnx.OnnxMlProto3$AttributeProto$AttributeType [^java.lang.String name]
    (OnnxMlProto3$AttributeProto$AttributeType/valueOf name)))

(defn *for-number
  "value - `int`

  returns: `onnx.OnnxMlProto3$AttributeProto$AttributeType`"
  (^onnx.OnnxMlProto3$AttributeProto$AttributeType [^Integer value]
    (OnnxMlProto3$AttributeProto$AttributeType/forNumber value)))

(defn *internal-get-value-map
  "returns: `com.github.os72.protobuf351.Internal.EnumLiteMap<onnx.OnnxMlProto3$AttributeProto$AttributeType>`"
  (^com.github.os72.protobuf351.Internal.EnumLiteMap []
    (OnnxMlProto3$AttributeProto$AttributeType/internalGetValueMap )))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.EnumDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumDescriptor []
    (OnnxMlProto3$AttributeProto$AttributeType/getDescriptor )))

(defn get-number
  "returns: `int`"
  (^Integer [^OnnxMlProto3$AttributeProto$AttributeType this]
    (-> this (.getNumber))))

(defn get-value-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.EnumValueDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumValueDescriptor [^OnnxMlProto3$AttributeProto$AttributeType this]
    (-> this (.getValueDescriptor))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.EnumDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumDescriptor [^OnnxMlProto3$AttributeProto$AttributeType this]
    (-> this (.getDescriptorForType))))

