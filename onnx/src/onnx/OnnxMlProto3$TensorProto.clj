(ns onnx.OnnxMlProto3$TensorProto
  " A message defined to store a tensor in its serialized format.
 Protobuf type onnx.TensorProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TensorProto]))

(def *-dims-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TensorProto/DIMS_FIELD_NUMBER)

(def *-data-type-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TensorProto/DATA_TYPE_FIELD_NUMBER)

(def *-segment-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TensorProto/SEGMENT_FIELD_NUMBER)

(def *-float-data-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TensorProto/FLOAT_DATA_FIELD_NUMBER)

(def *-int-32-data-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TensorProto/INT32_DATA_FIELD_NUMBER)

(def *-string-data-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TensorProto/STRING_DATA_FIELD_NUMBER)

(def *-int-64-data-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TensorProto/INT64_DATA_FIELD_NUMBER)

(def *-name-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TensorProto/NAME_FIELD_NUMBER)

(def *-doc-string-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TensorProto/DOC_STRING_FIELD_NUMBER)

(def *-raw-data-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TensorProto/RAW_DATA_FIELD_NUMBER)

(def *-double-data-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TensorProto/DOUBLE_DATA_FIELD_NUMBER)

(def *-uint-64-data-field-number
  "Static Constant.

  type: int"
  OnnxMlProto3$TensorProto/UINT64_DATA_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$TensorProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$TensorProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^onnx.OnnxMlProto3$TensorProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxMlProto3$TensorProto/parseFrom data extension-registry))
  (^onnx.OnnxMlProto3$TensorProto [^java.nio.ByteBuffer data]
    (OnnxMlProto3$TensorProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$TensorProto`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$TensorProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OnnxMlProto3$TensorProto/parseDelimitedFrom input extension-registry))
  (^onnx.OnnxMlProto3$TensorProto [^java.io.InputStream input]
    (OnnxMlProto3$TensorProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `onnx.OnnxMlProto3$TensorProto`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^onnx.OnnxMlProto3$TensorProto prototype]
    (OnnxMlProto3$TensorProto/newBuilder prototype))
  (^onnx.OnnxMlProto3$TensorProto$Builder []
    (OnnxMlProto3$TensorProto/newBuilder )))

(defn *get-default-instance
  "returns: `onnx.OnnxMlProto3$TensorProto`"
  (^onnx.OnnxMlProto3$TensorProto []
    (OnnxMlProto3$TensorProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxMlProto3$TensorProto>`"
  (^com.github.os72.protobuf351.Parser []
    (OnnxMlProto3$TensorProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OnnxMlProto3$TensorProto this]
    (-> this (.getUnknownFields))))

(defn get-uint-64-data-list
  "For uint64 and uint32 values
   When this field is present, the data_type field MUST be
   UINT32 or UINT64
  repeated uint64 uint64_data = 11 [packed = true];

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^OnnxMlProto3$TensorProto this]
    (-> this (.getUint64DataList))))

(defn get-int-32-data-count
  "For int32, uint8, int8, uint16, int16, bool, and float16 values
   float16 values must be bit-wise converted to an uint16_t prior
   to writing to the buffer.
   When this field is present, the data_type field MUST be
   INT32, INT16, INT8, UINT16, INT8, BOOL, or FLOAT32
  repeated int32 int32_data = 5 [packed = true];

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto this]
    (-> this (.getInt32DataCount))))

(defn get-string-data-list
  "For strings.
   Each element of string_data is a UTF-8 encoded Unicode
   string. No trailing null, no leading BOM. The protobuf \"string\"
   scalar type is not used to match ML community conventions.
   When this field is present, the data_type field MUST be STRING
  repeated bytes string_data = 6;

  returns: `java.util.List<com.github.os72.protobuf351.ByteString>`"
  (^java.util.List [^OnnxMlProto3$TensorProto this]
    (-> this (.getStringDataList))))

(defn get-data-type
  "The data type of the tensor.
  .onnx.TensorProto.DataType data_type = 2;

  returns: `onnx.OnnxMlProto3$TensorProto$DataType`"
  (^onnx.OnnxMlProto3$TensorProto$DataType [^OnnxMlProto3$TensorProto this]
    (-> this (.getDataType))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TensorProto this]
    (-> this (.isInitialized))))

(defn get-double-data
  "For double
   Complex64 tensors are encoded as a single array of doubles,
   with the real components appearing in odd numbered positions,
   and the corresponding imaginary component apparing in the
   subsequent even numbered position. (e.g., [1.0  2.0i, 3.0  4.0i]
   is encoded as [1.0, 2.0 ,3.0 ,4.0]
   When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
  repeated double double_data = 10 [packed = true];

  index - `int`

  returns: `double`"
  (^Double [^OnnxMlProto3$TensorProto this ^Integer index]
    (-> this (.getDoubleData index))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$TensorProto`"
  (^onnx.OnnxMlProto3$TensorProto [^OnnxMlProto3$TensorProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-uint-64-data-count
  "For uint64 and uint32 values
   When this field is present, the data_type field MUST be
   UINT32 or UINT64
  repeated uint64 uint64_data = 11 [packed = true];

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto this]
    (-> this (.getUint64DataCount))))

(defn get-doc-string-bytes
  "A human-readable documentation for this tensor. Markdown is allowed.
  string doc_string = 12;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$TensorProto this]
    (-> this (.getDocStringBytes))))

(defn get-name-bytes
  "Optionally, a name for the tensor.
  string name = 8;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$TensorProto this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto this]
    (-> this (.getSerializedSize))))

(defn get-raw-data
  "Serializations can either use one of the fields above, or use this
   raw bytes field. The only exception is the string case, where one is
   required to store the content in the repeated bytes string_data field.
   When this raw_data field is used to store tensor value, elements MUST
   be stored in as fixed-width, little-endian order.
   Floating-point data types MUST be stored in IEEE 754 format.
   Complex64 elements must be written as two consecutive FLOAT values, real component first.
   Complex128 elements must be written as two consecutive DOUBLE values, real component first.
   Boolean type MUST be written one byte per tensor element (00000001 for true, 00000000 for false).
   Note: the advantage of specific field rather than the raw_data field is
   that in some cases (e.g. int data), protobuf does a better packing via
   variable length storage, and may lead to smaller binary footprint.
   When this field is present, the data_type field MUST NOT be STRING or UNDEFINED
  bytes raw_data = 9;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$TensorProto this]
    (-> this (.getRawData))))

(defn get-int-32-data-list
  "For int32, uint8, int8, uint16, int16, bool, and float16 values
   float16 values must be bit-wise converted to an uint16_t prior
   to writing to the buffer.
   When this field is present, the data_type field MUST be
   INT32, INT16, INT8, UINT16, INT8, BOOL, or FLOAT32
  repeated int32 int32_data = 5 [packed = true];

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^OnnxMlProto3$TensorProto this]
    (-> this (.getInt32DataList))))

(defn get-doc-string
  "A human-readable documentation for this tensor. Markdown is allowed.
  string doc_string = 12;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$TensorProto this]
    (-> this (.getDocString))))

(defn get-name
  "Optionally, a name for the tensor.
  string name = 8;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$TensorProto this]
    (-> this (.getName))))

(defn get-segment-or-builder
  ".onnx.TensorProto.Segment segment = 3;

  returns: `onnx.OnnxMlProto3$TensorProto$SegmentOrBuilder`"
  (^onnx.OnnxMlProto3$TensorProto$SegmentOrBuilder [^OnnxMlProto3$TensorProto this]
    (-> this (.getSegmentOrBuilder))))

(defn get-int-32-data
  "For int32, uint8, int8, uint16, int16, bool, and float16 values
   float16 values must be bit-wise converted to an uint16_t prior
   to writing to the buffer.
   When this field is present, the data_type field MUST be
   INT32, INT16, INT8, UINT16, INT8, BOOL, or FLOAT32
  repeated int32 int32_data = 5 [packed = true];

  index - `int`

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto this ^Integer index]
    (-> this (.getInt32Data index))))

(defn get-uint-64-data
  "For uint64 and uint32 values
   When this field is present, the data_type field MUST be
   UINT32 or UINT64
  repeated uint64 uint64_data = 11 [packed = true];

  index - `int`

  returns: `long`"
  (^Long [^OnnxMlProto3$TensorProto this ^Integer index]
    (-> this (.getUint64Data index))))

(defn get-float-data-list
  "For float and complex64 values
   Complex64 tensors are encoded as a single array of floats,
   with the real components appearing in odd numbered positions,
   and the corresponding imaginary component apparing in the
   subsequent even numbered position. (e.g., [1.0  2.0i, 3.0  4.0i]
   is encoded as [1.0, 2.0 ,3.0 ,4.0]
   When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
  repeated float float_data = 4 [packed = true];

  returns: `java.util.List<java.lang.Float>`"
  (^java.util.List [^OnnxMlProto3$TensorProto this]
    (-> this (.getFloatDataList))))

(defn get-double-data-count
  "For double
   Complex64 tensors are encoded as a single array of doubles,
   with the real components appearing in odd numbered positions,
   and the corresponding imaginary component apparing in the
   subsequent even numbered position. (e.g., [1.0  2.0i, 3.0  4.0i]
   is encoded as [1.0, 2.0 ,3.0 ,4.0]
   When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
  repeated double double_data = 10 [packed = true];

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto this]
    (-> this (.getDoubleDataCount))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OnnxMlProto3$TensorProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-int-64-data-list
  "For int64.
   When this field is present, the data_type field MUST be INT64
  repeated int64 int64_data = 7 [packed = true];

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^OnnxMlProto3$TensorProto this]
    (-> this (.getInt64DataList))))

(defn get-double-data-list
  "For double
   Complex64 tensors are encoded as a single array of doubles,
   with the real components appearing in odd numbered positions,
   and the corresponding imaginary component apparing in the
   subsequent even numbered position. (e.g., [1.0  2.0i, 3.0  4.0i]
   is encoded as [1.0, 2.0 ,3.0 ,4.0]
   When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
  repeated double double_data = 10 [packed = true];

  returns: `java.util.List<java.lang.Double>`"
  (^java.util.List [^OnnxMlProto3$TensorProto this]
    (-> this (.getDoubleDataList))))

(defn get-dims
  "The shape of the tensor.
  repeated int64 dims = 1;

  index - `int`

  returns: `long`"
  (^Long [^OnnxMlProto3$TensorProto this ^Integer index]
    (-> this (.getDims index))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto this]
    (-> this (.hashCode))))

(defn get-data-type-value
  "The data type of the tensor.
  .onnx.TensorProto.DataType data_type = 2;

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto this]
    (-> this (.getDataTypeValue))))

(defn get-int-64-data
  "For int64.
   When this field is present, the data_type field MUST be INT64
  repeated int64 int64_data = 7 [packed = true];

  index - `int`

  returns: `long`"
  (^Long [^OnnxMlProto3$TensorProto this ^Integer index]
    (-> this (.getInt64Data index))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<onnx.OnnxMlProto3$TensorProto>`"
  (^com.github.os72.protobuf351.Parser [^OnnxMlProto3$TensorProto this]
    (-> this (.getParserForType))))

(defn get-int-64-data-count
  "For int64.
   When this field is present, the data_type field MUST be INT64
  repeated int64 int64_data = 7 [packed = true];

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto this]
    (-> this (.getInt64DataCount))))

(defn get-dims-list
  "The shape of the tensor.
  repeated int64 dims = 1;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^OnnxMlProto3$TensorProto this]
    (-> this (.getDimsList))))

(defn get-float-data-count
  "For float and complex64 values
   Complex64 tensors are encoded as a single array of floats,
   with the real components appearing in odd numbered positions,
   and the corresponding imaginary component apparing in the
   subsequent even numbered position. (e.g., [1.0  2.0i, 3.0  4.0i]
   is encoded as [1.0, 2.0 ,3.0 ,4.0]
   When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
  repeated float float_data = 4 [packed = true];

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto this]
    (-> this (.getFloatDataCount))))

(defn get-float-data
  "For float and complex64 values
   Complex64 tensors are encoded as a single array of floats,
   with the real components appearing in odd numbered positions,
   and the corresponding imaginary component apparing in the
   subsequent even numbered position. (e.g., [1.0  2.0i, 3.0  4.0i]
   is encoded as [1.0, 2.0 ,3.0 ,4.0]
   When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
  repeated float float_data = 4 [packed = true];

  index - `int`

  returns: `float`"
  (^Float [^OnnxMlProto3$TensorProto this ^Integer index]
    (-> this (.getFloatData index))))

(defn has-segment?
  ".onnx.TensorProto.Segment segment = 3;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TensorProto this]
    (-> this (.hasSegment))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TensorProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto this]
    (-> this (.newBuilderForType))))

(defn get-string-data
  "For strings.
   Each element of string_data is a UTF-8 encoded Unicode
   string. No trailing null, no leading BOM. The protobuf \"string\"
   scalar type is not used to match ML community conventions.
   When this field is present, the data_type field MUST be STRING
  repeated bytes string_data = 6;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$TensorProto this ^Integer index]
    (-> this (.getStringData index))))

(defn to-builder
  "returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto this]
    (-> this (.toBuilder))))

(defn get-string-data-count
  "For strings.
   Each element of string_data is a UTF-8 encoded Unicode
   string. No trailing null, no leading BOM. The protobuf \"string\"
   scalar type is not used to match ML community conventions.
   When this field is present, the data_type field MUST be STRING
  repeated bytes string_data = 6;

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto this]
    (-> this (.getStringDataCount))))

(defn get-segment
  ".onnx.TensorProto.Segment segment = 3;

  returns: `onnx.OnnxMlProto3$TensorProto$Segment`"
  (^onnx.OnnxMlProto3$TensorProto$Segment [^OnnxMlProto3$TensorProto this]
    (-> this (.getSegment))))

(defn get-dims-count
  "The shape of the tensor.
  repeated int64 dims = 1;

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto this]
    (-> this (.getDimsCount))))

