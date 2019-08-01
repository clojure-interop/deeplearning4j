(ns onnx.OnnxProto3$TensorProto$DataType
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxProto3$TensorProto$DataType]))

(def UNDEFINED
  "Enum Constant.

  UNDEFINED = 0;

  type: onnx.OnnxProto3$TensorProto$DataType"
  OnnxProto3$TensorProto$DataType/UNDEFINED)

(def FLOAT
  "Enum Constant.

  Basic types.
  FLOAT = 1;

  type: onnx.OnnxProto3$TensorProto$DataType"
  OnnxProto3$TensorProto$DataType/FLOAT)

(def UINT8
  "Enum Constant.

  uint8_t
  UINT8 = 2;

  type: onnx.OnnxProto3$TensorProto$DataType"
  OnnxProto3$TensorProto$DataType/UINT8)

(def INT8
  "Enum Constant.

  int8_t
  INT8 = 3;

  type: onnx.OnnxProto3$TensorProto$DataType"
  OnnxProto3$TensorProto$DataType/INT8)

(def UINT16
  "Enum Constant.

  uint16_t
  UINT16 = 4;

  type: onnx.OnnxProto3$TensorProto$DataType"
  OnnxProto3$TensorProto$DataType/UINT16)

(def INT16
  "Enum Constant.

  int16_t
  INT16 = 5;

  type: onnx.OnnxProto3$TensorProto$DataType"
  OnnxProto3$TensorProto$DataType/INT16)

(def INT32
  "Enum Constant.

  int32_t
  INT32 = 6;

  type: onnx.OnnxProto3$TensorProto$DataType"
  OnnxProto3$TensorProto$DataType/INT32)

(def INT64
  "Enum Constant.

  int64_t
  INT64 = 7;

  type: onnx.OnnxProto3$TensorProto$DataType"
  OnnxProto3$TensorProto$DataType/INT64)

(def STRING
  "Enum Constant.

  string
  STRING = 8;

  type: onnx.OnnxProto3$TensorProto$DataType"
  OnnxProto3$TensorProto$DataType/STRING)

(def BOOL
  "Enum Constant.

  bool
  BOOL = 9;

  type: onnx.OnnxProto3$TensorProto$DataType"
  OnnxProto3$TensorProto$DataType/BOOL)

(def FLOAT16
  "Enum Constant.

  Advanced types
  FLOAT16 = 10;

  type: onnx.OnnxProto3$TensorProto$DataType"
  OnnxProto3$TensorProto$DataType/FLOAT16)

(def DOUBLE
  "Enum Constant.

  DOUBLE = 11;

  type: onnx.OnnxProto3$TensorProto$DataType"
  OnnxProto3$TensorProto$DataType/DOUBLE)

(def UINT32
  "Enum Constant.

  UINT32 = 12;

  type: onnx.OnnxProto3$TensorProto$DataType"
  OnnxProto3$TensorProto$DataType/UINT32)

(def UINT64
  "Enum Constant.

  UINT64 = 13;

  type: onnx.OnnxProto3$TensorProto$DataType"
  OnnxProto3$TensorProto$DataType/UINT64)

(def COMPLEX64
  "Enum Constant.

  complex with float32 real and imaginary components
  COMPLEX64 = 14;

  type: onnx.OnnxProto3$TensorProto$DataType"
  OnnxProto3$TensorProto$DataType/COMPLEX64)

(def COMPLEX128
  "Enum Constant.

  complex with float64 real and imaginary components
  COMPLEX128 = 15;

  type: onnx.OnnxProto3$TensorProto$DataType"
  OnnxProto3$TensorProto$DataType/COMPLEX128)

(def UNRECOGNIZED
  "Enum Constant.

  type: onnx.OnnxProto3$TensorProto$DataType"
  OnnxProto3$TensorProto$DataType/UNRECOGNIZED)

(def *-undefined-value
  "Static Constant.

  UNDEFINED = 0;

  type: int"
  OnnxProto3$TensorProto$DataType/UNDEFINED_VALUE)

(def *-float-value
  "Static Constant.

  Basic types.
  FLOAT = 1;

  type: int"
  OnnxProto3$TensorProto$DataType/FLOAT_VALUE)

(def *-uint-8-value
  "Static Constant.

  uint8_t
  UINT8 = 2;

  type: int"
  OnnxProto3$TensorProto$DataType/UINT8_VALUE)

(def *-int-8-value
  "Static Constant.

  int8_t
  INT8 = 3;

  type: int"
  OnnxProto3$TensorProto$DataType/INT8_VALUE)

(def *-uint-16-value
  "Static Constant.

  uint16_t
  UINT16 = 4;

  type: int"
  OnnxProto3$TensorProto$DataType/UINT16_VALUE)

(def *-int-16-value
  "Static Constant.

  int16_t
  INT16 = 5;

  type: int"
  OnnxProto3$TensorProto$DataType/INT16_VALUE)

(def *-int-32-value
  "Static Constant.

  int32_t
  INT32 = 6;

  type: int"
  OnnxProto3$TensorProto$DataType/INT32_VALUE)

(def *-int-64-value
  "Static Constant.

  int64_t
  INT64 = 7;

  type: int"
  OnnxProto3$TensorProto$DataType/INT64_VALUE)

(def *-string-value
  "Static Constant.

  string
  STRING = 8;

  type: int"
  OnnxProto3$TensorProto$DataType/STRING_VALUE)

(def *-bool-value
  "Static Constant.

  bool
  BOOL = 9;

  type: int"
  OnnxProto3$TensorProto$DataType/BOOL_VALUE)

(def *-float-16-value
  "Static Constant.

  Advanced types
  FLOAT16 = 10;

  type: int"
  OnnxProto3$TensorProto$DataType/FLOAT16_VALUE)

(def *-double-value
  "Static Constant.

  DOUBLE = 11;

  type: int"
  OnnxProto3$TensorProto$DataType/DOUBLE_VALUE)

(def *-uint-32-value
  "Static Constant.

  UINT32 = 12;

  type: int"
  OnnxProto3$TensorProto$DataType/UINT32_VALUE)

(def *-uint-64-value
  "Static Constant.

  UINT64 = 13;

  type: int"
  OnnxProto3$TensorProto$DataType/UINT64_VALUE)

(def *-complex-64-value
  "Static Constant.

  complex with float32 real and imaginary components
  COMPLEX64 = 14;

  type: int"
  OnnxProto3$TensorProto$DataType/COMPLEX64_VALUE)

(def *-complex-128-value
  "Static Constant.

  complex with float64 real and imaginary components
  COMPLEX128 = 15;

  type: int"
  OnnxProto3$TensorProto$DataType/COMPLEX128_VALUE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (OnnxProto3.TensorProto.DataType c : OnnxProto3.TensorProto.DataType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `onnx.OnnxProto3$TensorProto$DataType[]`"
  ([]
    (OnnxProto3$TensorProto$DataType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `onnx.OnnxProto3$TensorProto$DataType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^onnx.OnnxProto3$TensorProto$DataType [^java.lang.String name]
    (OnnxProto3$TensorProto$DataType/valueOf name)))

(defn *for-number
  "value - `int`

  returns: `onnx.OnnxProto3$TensorProto$DataType`"
  (^onnx.OnnxProto3$TensorProto$DataType [^Integer value]
    (OnnxProto3$TensorProto$DataType/forNumber value)))

(defn *internal-get-value-map
  "returns: `com.github.os72.protobuf351.Internal.EnumLiteMap<onnx.OnnxProto3$TensorProto$DataType>`"
  (^com.github.os72.protobuf351.Internal.EnumLiteMap []
    (OnnxProto3$TensorProto$DataType/internalGetValueMap )))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.EnumDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumDescriptor []
    (OnnxProto3$TensorProto$DataType/getDescriptor )))

(defn get-number
  "returns: `int`"
  (^Integer [^OnnxProto3$TensorProto$DataType this]
    (-> this (.getNumber))))

(defn get-value-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.EnumValueDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumValueDescriptor [^OnnxProto3$TensorProto$DataType this]
    (-> this (.getValueDescriptor))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.EnumDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumDescriptor [^OnnxProto3$TensorProto$DataType this]
    (-> this (.getDescriptorForType))))

