(ns org.tensorflow.framework.DataType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework DataType]))

(def DT_INVALID
  "Enum Constant.

  Not a legal value for DataType.  Used to indicate a DataType field
   has not been set.
  DT_INVALID = 0;

  type: org.tensorflow.framework.DataType"
  DataType/DT_INVALID)

(def DT_FLOAT
  "Enum Constant.

  Data types that all computation devices are expected to be
   capable to support.
  DT_FLOAT = 1;

  type: org.tensorflow.framework.DataType"
  DataType/DT_FLOAT)

(def DT_DOUBLE
  "Enum Constant.

  DT_DOUBLE = 2;

  type: org.tensorflow.framework.DataType"
  DataType/DT_DOUBLE)

(def DT_INT32
  "Enum Constant.

  DT_INT32 = 3;

  type: org.tensorflow.framework.DataType"
  DataType/DT_INT32)

(def DT_UINT8
  "Enum Constant.

  DT_UINT8 = 4;

  type: org.tensorflow.framework.DataType"
  DataType/DT_UINT8)

(def DT_INT16
  "Enum Constant.

  DT_INT16 = 5;

  type: org.tensorflow.framework.DataType"
  DataType/DT_INT16)

(def DT_INT8
  "Enum Constant.

  DT_INT8 = 6;

  type: org.tensorflow.framework.DataType"
  DataType/DT_INT8)

(def DT_STRING
  "Enum Constant.

  DT_STRING = 7;

  type: org.tensorflow.framework.DataType"
  DataType/DT_STRING)

(def DT_COMPLEX64
  "Enum Constant.

  Single-precision complex
  DT_COMPLEX64 = 8;

  type: org.tensorflow.framework.DataType"
  DataType/DT_COMPLEX64)

(def DT_INT64
  "Enum Constant.

  DT_INT64 = 9;

  type: org.tensorflow.framework.DataType"
  DataType/DT_INT64)

(def DT_BOOL
  "Enum Constant.

  DT_BOOL = 10;

  type: org.tensorflow.framework.DataType"
  DataType/DT_BOOL)

(def DT_QINT8
  "Enum Constant.

  Quantized int8
  DT_QINT8 = 11;

  type: org.tensorflow.framework.DataType"
  DataType/DT_QINT8)

(def DT_QUINT8
  "Enum Constant.

  Quantized uint8
  DT_QUINT8 = 12;

  type: org.tensorflow.framework.DataType"
  DataType/DT_QUINT8)

(def DT_QINT32
  "Enum Constant.

  Quantized int32
  DT_QINT32 = 13;

  type: org.tensorflow.framework.DataType"
  DataType/DT_QINT32)

(def DT_BFLOAT16
  "Enum Constant.

  Float32 truncated to 16 bits.  Only for cast ops.
  DT_BFLOAT16 = 14;

  type: org.tensorflow.framework.DataType"
  DataType/DT_BFLOAT16)

(def DT_QINT16
  "Enum Constant.

  Quantized int16
  DT_QINT16 = 15;

  type: org.tensorflow.framework.DataType"
  DataType/DT_QINT16)

(def DT_QUINT16
  "Enum Constant.

  Quantized uint16
  DT_QUINT16 = 16;

  type: org.tensorflow.framework.DataType"
  DataType/DT_QUINT16)

(def DT_UINT16
  "Enum Constant.

  DT_UINT16 = 17;

  type: org.tensorflow.framework.DataType"
  DataType/DT_UINT16)

(def DT_COMPLEX128
  "Enum Constant.

  Double-precision complex
  DT_COMPLEX128 = 18;

  type: org.tensorflow.framework.DataType"
  DataType/DT_COMPLEX128)

(def DT_HALF
  "Enum Constant.

  DT_HALF = 19;

  type: org.tensorflow.framework.DataType"
  DataType/DT_HALF)

(def DT_RESOURCE
  "Enum Constant.

  DT_RESOURCE = 20;

  type: org.tensorflow.framework.DataType"
  DataType/DT_RESOURCE)

(def DT_VARIANT
  "Enum Constant.

  Arbitrary C++ data types
  DT_VARIANT = 21;

  type: org.tensorflow.framework.DataType"
  DataType/DT_VARIANT)

(def DT_UINT32
  "Enum Constant.

  DT_UINT32 = 22;

  type: org.tensorflow.framework.DataType"
  DataType/DT_UINT32)

(def DT_UINT64
  "Enum Constant.

  DT_UINT64 = 23;

  type: org.tensorflow.framework.DataType"
  DataType/DT_UINT64)

(def DT_FLOAT_REF
  "Enum Constant.

  Do not use!  These are only for parameters.  Every enum above
   should have a corresponding value below (verified by types_test).
  DT_FLOAT_REF = 101;

  type: org.tensorflow.framework.DataType"
  DataType/DT_FLOAT_REF)

(def DT_DOUBLE_REF
  "Enum Constant.

  DT_DOUBLE_REF = 102;

  type: org.tensorflow.framework.DataType"
  DataType/DT_DOUBLE_REF)

(def DT_INT32_REF
  "Enum Constant.

  DT_INT32_REF = 103;

  type: org.tensorflow.framework.DataType"
  DataType/DT_INT32_REF)

(def DT_UINT8_REF
  "Enum Constant.

  DT_UINT8_REF = 104;

  type: org.tensorflow.framework.DataType"
  DataType/DT_UINT8_REF)

(def DT_INT16_REF
  "Enum Constant.

  DT_INT16_REF = 105;

  type: org.tensorflow.framework.DataType"
  DataType/DT_INT16_REF)

(def DT_INT8_REF
  "Enum Constant.

  DT_INT8_REF = 106;

  type: org.tensorflow.framework.DataType"
  DataType/DT_INT8_REF)

(def DT_STRING_REF
  "Enum Constant.

  DT_STRING_REF = 107;

  type: org.tensorflow.framework.DataType"
  DataType/DT_STRING_REF)

(def DT_COMPLEX64_REF
  "Enum Constant.

  DT_COMPLEX64_REF = 108;

  type: org.tensorflow.framework.DataType"
  DataType/DT_COMPLEX64_REF)

(def DT_INT64_REF
  "Enum Constant.

  DT_INT64_REF = 109;

  type: org.tensorflow.framework.DataType"
  DataType/DT_INT64_REF)

(def DT_BOOL_REF
  "Enum Constant.

  DT_BOOL_REF = 110;

  type: org.tensorflow.framework.DataType"
  DataType/DT_BOOL_REF)

(def DT_QINT8_REF
  "Enum Constant.

  DT_QINT8_REF = 111;

  type: org.tensorflow.framework.DataType"
  DataType/DT_QINT8_REF)

(def DT_QUINT8_REF
  "Enum Constant.

  DT_QUINT8_REF = 112;

  type: org.tensorflow.framework.DataType"
  DataType/DT_QUINT8_REF)

(def DT_QINT32_REF
  "Enum Constant.

  DT_QINT32_REF = 113;

  type: org.tensorflow.framework.DataType"
  DataType/DT_QINT32_REF)

(def DT_BFLOAT16_REF
  "Enum Constant.

  DT_BFLOAT16_REF = 114;

  type: org.tensorflow.framework.DataType"
  DataType/DT_BFLOAT16_REF)

(def DT_QINT16_REF
  "Enum Constant.

  DT_QINT16_REF = 115;

  type: org.tensorflow.framework.DataType"
  DataType/DT_QINT16_REF)

(def DT_QUINT16_REF
  "Enum Constant.

  DT_QUINT16_REF = 116;

  type: org.tensorflow.framework.DataType"
  DataType/DT_QUINT16_REF)

(def DT_UINT16_REF
  "Enum Constant.

  DT_UINT16_REF = 117;

  type: org.tensorflow.framework.DataType"
  DataType/DT_UINT16_REF)

(def DT_COMPLEX128_REF
  "Enum Constant.

  DT_COMPLEX128_REF = 118;

  type: org.tensorflow.framework.DataType"
  DataType/DT_COMPLEX128_REF)

(def DT_HALF_REF
  "Enum Constant.

  DT_HALF_REF = 119;

  type: org.tensorflow.framework.DataType"
  DataType/DT_HALF_REF)

(def DT_RESOURCE_REF
  "Enum Constant.

  DT_RESOURCE_REF = 120;

  type: org.tensorflow.framework.DataType"
  DataType/DT_RESOURCE_REF)

(def DT_VARIANT_REF
  "Enum Constant.

  DT_VARIANT_REF = 121;

  type: org.tensorflow.framework.DataType"
  DataType/DT_VARIANT_REF)

(def DT_UINT32_REF
  "Enum Constant.

  DT_UINT32_REF = 122;

  type: org.tensorflow.framework.DataType"
  DataType/DT_UINT32_REF)

(def DT_UINT64_REF
  "Enum Constant.

  DT_UINT64_REF = 123;

  type: org.tensorflow.framework.DataType"
  DataType/DT_UINT64_REF)

(def UNRECOGNIZED
  "Enum Constant.

  type: org.tensorflow.framework.DataType"
  DataType/UNRECOGNIZED)

(def *-dt-invalid-value
  "Static Constant.

  Not a legal value for DataType.  Used to indicate a DataType field
   has not been set.
  DT_INVALID = 0;

  type: int"
  DataType/DT_INVALID_VALUE)

(def *-dt-float-value
  "Static Constant.

  Data types that all computation devices are expected to be
   capable to support.
  DT_FLOAT = 1;

  type: int"
  DataType/DT_FLOAT_VALUE)

(def *-dt-double-value
  "Static Constant.

  DT_DOUBLE = 2;

  type: int"
  DataType/DT_DOUBLE_VALUE)

(def *-dt-int-32-value
  "Static Constant.

  DT_INT32 = 3;

  type: int"
  DataType/DT_INT32_VALUE)

(def *-dt-uint-8-value
  "Static Constant.

  DT_UINT8 = 4;

  type: int"
  DataType/DT_UINT8_VALUE)

(def *-dt-int-16-value
  "Static Constant.

  DT_INT16 = 5;

  type: int"
  DataType/DT_INT16_VALUE)

(def *-dt-int-8-value
  "Static Constant.

  DT_INT8 = 6;

  type: int"
  DataType/DT_INT8_VALUE)

(def *-dt-string-value
  "Static Constant.

  DT_STRING = 7;

  type: int"
  DataType/DT_STRING_VALUE)

(def *-dt-complex-64-value
  "Static Constant.

  Single-precision complex
  DT_COMPLEX64 = 8;

  type: int"
  DataType/DT_COMPLEX64_VALUE)

(def *-dt-int-64-value
  "Static Constant.

  DT_INT64 = 9;

  type: int"
  DataType/DT_INT64_VALUE)

(def *-dt-bool-value
  "Static Constant.

  DT_BOOL = 10;

  type: int"
  DataType/DT_BOOL_VALUE)

(def *-dt-qint-8-value
  "Static Constant.

  Quantized int8
  DT_QINT8 = 11;

  type: int"
  DataType/DT_QINT8_VALUE)

(def *-dt-quint-8-value
  "Static Constant.

  Quantized uint8
  DT_QUINT8 = 12;

  type: int"
  DataType/DT_QUINT8_VALUE)

(def *-dt-qint-32-value
  "Static Constant.

  Quantized int32
  DT_QINT32 = 13;

  type: int"
  DataType/DT_QINT32_VALUE)

(def *-dt-bfloat-16-value
  "Static Constant.

  Float32 truncated to 16 bits.  Only for cast ops.
  DT_BFLOAT16 = 14;

  type: int"
  DataType/DT_BFLOAT16_VALUE)

(def *-dt-qint-16-value
  "Static Constant.

  Quantized int16
  DT_QINT16 = 15;

  type: int"
  DataType/DT_QINT16_VALUE)

(def *-dt-quint-16-value
  "Static Constant.

  Quantized uint16
  DT_QUINT16 = 16;

  type: int"
  DataType/DT_QUINT16_VALUE)

(def *-dt-uint-16-value
  "Static Constant.

  DT_UINT16 = 17;

  type: int"
  DataType/DT_UINT16_VALUE)

(def *-dt-complex-128-value
  "Static Constant.

  Double-precision complex
  DT_COMPLEX128 = 18;

  type: int"
  DataType/DT_COMPLEX128_VALUE)

(def *-dt-half-value
  "Static Constant.

  DT_HALF = 19;

  type: int"
  DataType/DT_HALF_VALUE)

(def *-dt-resource-value
  "Static Constant.

  DT_RESOURCE = 20;

  type: int"
  DataType/DT_RESOURCE_VALUE)

(def *-dt-variant-value
  "Static Constant.

  Arbitrary C++ data types
  DT_VARIANT = 21;

  type: int"
  DataType/DT_VARIANT_VALUE)

(def *-dt-uint-32-value
  "Static Constant.

  DT_UINT32 = 22;

  type: int"
  DataType/DT_UINT32_VALUE)

(def *-dt-uint-64-value
  "Static Constant.

  DT_UINT64 = 23;

  type: int"
  DataType/DT_UINT64_VALUE)

(def *-dt-float-ref-value
  "Static Constant.

  Do not use!  These are only for parameters.  Every enum above
   should have a corresponding value below (verified by types_test).
  DT_FLOAT_REF = 101;

  type: int"
  DataType/DT_FLOAT_REF_VALUE)

(def *-dt-double-ref-value
  "Static Constant.

  DT_DOUBLE_REF = 102;

  type: int"
  DataType/DT_DOUBLE_REF_VALUE)

(def *-dt-int-32-ref-value
  "Static Constant.

  DT_INT32_REF = 103;

  type: int"
  DataType/DT_INT32_REF_VALUE)

(def *-dt-uint-8-ref-value
  "Static Constant.

  DT_UINT8_REF = 104;

  type: int"
  DataType/DT_UINT8_REF_VALUE)

(def *-dt-int-16-ref-value
  "Static Constant.

  DT_INT16_REF = 105;

  type: int"
  DataType/DT_INT16_REF_VALUE)

(def *-dt-int-8-ref-value
  "Static Constant.

  DT_INT8_REF = 106;

  type: int"
  DataType/DT_INT8_REF_VALUE)

(def *-dt-string-ref-value
  "Static Constant.

  DT_STRING_REF = 107;

  type: int"
  DataType/DT_STRING_REF_VALUE)

(def *-dt-complex-64-ref-value
  "Static Constant.

  DT_COMPLEX64_REF = 108;

  type: int"
  DataType/DT_COMPLEX64_REF_VALUE)

(def *-dt-int-64-ref-value
  "Static Constant.

  DT_INT64_REF = 109;

  type: int"
  DataType/DT_INT64_REF_VALUE)

(def *-dt-bool-ref-value
  "Static Constant.

  DT_BOOL_REF = 110;

  type: int"
  DataType/DT_BOOL_REF_VALUE)

(def *-dt-qint-8-ref-value
  "Static Constant.

  DT_QINT8_REF = 111;

  type: int"
  DataType/DT_QINT8_REF_VALUE)

(def *-dt-quint-8-ref-value
  "Static Constant.

  DT_QUINT8_REF = 112;

  type: int"
  DataType/DT_QUINT8_REF_VALUE)

(def *-dt-qint-32-ref-value
  "Static Constant.

  DT_QINT32_REF = 113;

  type: int"
  DataType/DT_QINT32_REF_VALUE)

(def *-dt-bfloat-16-ref-value
  "Static Constant.

  DT_BFLOAT16_REF = 114;

  type: int"
  DataType/DT_BFLOAT16_REF_VALUE)

(def *-dt-qint-16-ref-value
  "Static Constant.

  DT_QINT16_REF = 115;

  type: int"
  DataType/DT_QINT16_REF_VALUE)

(def *-dt-quint-16-ref-value
  "Static Constant.

  DT_QUINT16_REF = 116;

  type: int"
  DataType/DT_QUINT16_REF_VALUE)

(def *-dt-uint-16-ref-value
  "Static Constant.

  DT_UINT16_REF = 117;

  type: int"
  DataType/DT_UINT16_REF_VALUE)

(def *-dt-complex-128-ref-value
  "Static Constant.

  DT_COMPLEX128_REF = 118;

  type: int"
  DataType/DT_COMPLEX128_REF_VALUE)

(def *-dt-half-ref-value
  "Static Constant.

  DT_HALF_REF = 119;

  type: int"
  DataType/DT_HALF_REF_VALUE)

(def *-dt-resource-ref-value
  "Static Constant.

  DT_RESOURCE_REF = 120;

  type: int"
  DataType/DT_RESOURCE_REF_VALUE)

(def *-dt-variant-ref-value
  "Static Constant.

  DT_VARIANT_REF = 121;

  type: int"
  DataType/DT_VARIANT_REF_VALUE)

(def *-dt-uint-32-ref-value
  "Static Constant.

  DT_UINT32_REF = 122;

  type: int"
  DataType/DT_UINT32_REF_VALUE)

(def *-dt-uint-64-ref-value
  "Static Constant.

  DT_UINT64_REF = 123;

  type: int"
  DataType/DT_UINT64_REF_VALUE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (DataType c : DataType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.tensorflow.framework.DataType[]`"
  ([]
    (DataType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.tensorflow.framework.DataType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.tensorflow.framework.DataType [^java.lang.String name]
    (DataType/valueOf name)))

(defn *for-number
  "value - `int`

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^Integer value]
    (DataType/forNumber value)))

(defn *internal-get-value-map
  "returns: `com.github.os72.protobuf351.Internal.EnumLiteMap<org.tensorflow.framework.DataType>`"
  (^com.github.os72.protobuf351.Internal.EnumLiteMap []
    (DataType/internalGetValueMap )))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.EnumDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumDescriptor []
    (DataType/getDescriptor )))

(defn get-number
  "returns: `int`"
  (^Integer [^DataType this]
    (-> this (.getNumber))))

(defn get-value-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.EnumValueDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumValueDescriptor [^DataType this]
    (-> this (.getValueDescriptor))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.EnumDescriptor`"
  (^com.github.os72.protobuf351.Descriptors.EnumDescriptor [^DataType this]
    (-> this (.getDescriptorForType))))

