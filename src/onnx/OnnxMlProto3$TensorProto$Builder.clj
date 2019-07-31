(ns onnx.OnnxMlProto3$TensorProto$Builder
  " A message defined to store a tensor in its serialized format.
 Protobuf type onnx.TensorProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [onnx OnnxMlProto3$TensorProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OnnxMlProto3$TensorProto$Builder/getDescriptor )))

(defn clear-doc-string
  "A human-readable documentation for this tensor. Markdown is allowed.
  string doc_string = 12;

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.clearDocString))))

(defn add-float-data
  "For float and complex64 values
   Complex64 tensors are encoded as a single array of floats,
   with the real components appearing in odd numbered positions,
   and the corresponding imaginary component apparing in the
   subsequent even numbered position. (e.g., [1.0  2.0i, 3.0  4.0i]
   is encoded as [1.0, 2.0 ,3.0 ,4.0]
   When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
  repeated float float_data = 4 [packed = true];

  value - `float`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^Float value]
    (-> this (.addFloatData value))))

(defn add-string-data
  "For strings.
   Each element of string_data is a UTF-8 encoded Unicode
   string. No trailing null, no leading BOM. The protobuf \"string\"
   scalar type is not used to match ML community conventions.
   When this field is present, the data_type field MUST be STRING
  repeated bytes string_data = 6;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.addStringData value))))

(defn clear-name
  "Optionally, a name for the tensor.
  string name = 8;

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.clearName))))

(defn get-uint-64-data-list
  "For uint64 and uint32 values
   When this field is present, the data_type field MUST be
   UINT32 or UINT64
  repeated uint64 uint64_data = 11 [packed = true];

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getUint64DataList))))

(defn set-data-type-value
  "The data type of the tensor.
  .onnx.TensorProto.DataType data_type = 2;

  value - `int`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^Integer value]
    (-> this (.setDataTypeValue value))))

(defn get-int-32-data-count
  "For int32, uint8, int8, uint16, int16, bool, and float16 values
   float16 values must be bit-wise converted to an uint16_t prior
   to writing to the buffer.
   When this field is present, the data_type field MUST be
   INT32, INT16, INT8, UINT16, INT8, BOOL, or FLOAT32
  repeated int32 int32_data = 5 [packed = true];

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getInt32DataCount))))

(defn clear-double-data
  "For double
   Complex64 tensors are encoded as a single array of doubles,
   with the real components appearing in odd numbered positions,
   and the corresponding imaginary component apparing in the
   subsequent even numbered position. (e.g., [1.0  2.0i, 3.0  4.0i]
   is encoded as [1.0, 2.0 ,3.0 ,4.0]
   When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
  repeated double double_data = 10 [packed = true];

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.clearDoubleData))))

(defn clear-segment
  ".onnx.TensorProto.Segment segment = 3;

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.clearSegment))))

(defn clear-dims
  "The shape of the tensor.
  repeated int64 dims = 1;

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.clearDims))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn add-all-string-data
  "For strings.
   Each element of string_data is a UTF-8 encoded Unicode
   string. No trailing null, no leading BOM. The protobuf \"string\"
   scalar type is not used to match ML community conventions.
   When this field is present, the data_type field MUST be STRING
  repeated bytes string_data = 6;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllStringData values))))

(defn get-string-data-list
  "For strings.
   Each element of string_data is a UTF-8 encoded Unicode
   string. No trailing null, no leading BOM. The protobuf \"string\"
   scalar type is not used to match ML community conventions.
   When this field is present, the data_type field MUST be STRING
  repeated bytes string_data = 6;

  returns: `java.util.List<com.github.os72.protobuf351.ByteString>`"
  (^java.util.List [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getStringDataList))))

(defn build-partial
  "returns: `onnx.OnnxMlProto3$TensorProto`"
  (^onnx.OnnxMlProto3$TensorProto [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.buildPartial))))

(defn get-data-type
  "The data type of the tensor.
  .onnx.TensorProto.DataType data_type = 2;

  returns: `onnx.OnnxMlProto3$TensorProto$DataType`"
  (^onnx.OnnxMlProto3$TensorProto$DataType [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getDataType))))

(defn add-double-data
  "For double
   Complex64 tensors are encoded as a single array of doubles,
   with the real components appearing in odd numbered positions,
   and the corresponding imaginary component apparing in the
   subsequent even numbered position. (e.g., [1.0  2.0i, 3.0  4.0i]
   is encoded as [1.0, 2.0 ,3.0 ,4.0]
   When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
  repeated double double_data = 10 [packed = true];

  value - `double`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^Double value]
    (-> this (.addDoubleData value))))

(defn set-doc-string
  "A human-readable documentation for this tensor. Markdown is allowed.
  string doc_string = 12;

  value - `java.lang.String`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^java.lang.String value]
    (-> this (.setDocString value))))

(defn clear-string-data
  "For strings.
   Each element of string_data is a UTF-8 encoded Unicode
   string. No trailing null, no leading BOM. The protobuf \"string\"
   scalar type is not used to match ML community conventions.
   When this field is present, the data_type field MUST be STRING
  repeated bytes string_data = 6;

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.clearStringData))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TensorProto$Builder this]
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
  (^Double [^OnnxMlProto3$TensorProto$Builder this ^Integer index]
    (-> this (.getDoubleData index))))

(defn add-uint-64-data
  "For uint64 and uint32 values
   When this field is present, the data_type field MUST be
   UINT32 or UINT64
  repeated uint64 uint64_data = 11 [packed = true];

  value - `long`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^Long value]
    (-> this (.addUint64Data value))))

(defn get-default-instance-for-type
  "returns: `onnx.OnnxMlProto3$TensorProto`"
  (^onnx.OnnxMlProto3$TensorProto [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn set-data-type
  "The data type of the tensor.
  .onnx.TensorProto.DataType data_type = 2;

  value - `onnx.OnnxMlProto3$TensorProto$DataType`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^onnx.OnnxMlProto3$TensorProto$DataType value]
    (-> this (.setDataType value))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-uint-64-data-count
  "For uint64 and uint32 values
   When this field is present, the data_type field MUST be
   UINT32 or UINT64
  repeated uint64 uint64_data = 11 [packed = true];

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getUint64DataCount))))

(defn get-doc-string-bytes
  "A human-readable documentation for this tensor. Markdown is allowed.
  string doc_string = 12;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getDocStringBytes))))

(defn set-segment
  ".onnx.TensorProto.Segment segment = 3;

  value - `onnx.OnnxMlProto3$TensorProto$Segment`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^onnx.OnnxMlProto3$TensorProto$Segment value]
    (-> this (.setSegment value))))

(defn add-int-64-data
  "For int64.
   When this field is present, the data_type field MUST be INT64
  repeated int64 int64_data = 7 [packed = true];

  value - `long`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^Long value]
    (-> this (.addInt64Data value))))

(defn clear-raw-data
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

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.clearRawData))))

(defn set-doc-string-bytes
  "A human-readable documentation for this tensor. Markdown is allowed.
  string doc_string = 12;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDocStringBytes value))))

(defn get-name-bytes
  "Optionally, a name for the tensor.
  string name = 8;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getNameBytes))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

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
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getRawData))))

(defn add-all-uint-64-data
  "For uint64 and uint32 values
   When this field is present, the data_type field MUST be
   UINT32 or UINT64
  repeated uint64 uint64_data = 11 [packed = true];

  values - `java.lang.Iterable`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllUint64Data values))))

(defn set-name
  "Optionally, a name for the tensor.
  string name = 8;

  value - `java.lang.String`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn set-double-data
  "For double
   Complex64 tensors are encoded as a single array of doubles,
   with the real components appearing in odd numbered positions,
   and the corresponding imaginary component apparing in the
   subsequent even numbered position. (e.g., [1.0  2.0i, 3.0  4.0i]
   is encoded as [1.0, 2.0 ,3.0 ,4.0]
   When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
  repeated double double_data = 10 [packed = true];

  index - `int`
  value - `double`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^Integer index ^Double value]
    (-> this (.setDoubleData index value))))

(defn get-int-32-data-list
  "For int32, uint8, int8, uint16, int16, bool, and float16 values
   float16 values must be bit-wise converted to an uint16_t prior
   to writing to the buffer.
   When this field is present, the data_type field MUST be
   INT32, INT16, INT8, UINT16, INT8, BOOL, or FLOAT32
  repeated int32 int32_data = 5 [packed = true];

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getInt32DataList))))

(defn get-doc-string
  "A human-readable documentation for this tensor. Markdown is allowed.
  string doc_string = 12;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getDocString))))

(defn add-all-float-data
  "For float and complex64 values
   Complex64 tensors are encoded as a single array of floats,
   with the real components appearing in odd numbered positions,
   and the corresponding imaginary component apparing in the
   subsequent even numbered position. (e.g., [1.0  2.0i, 3.0  4.0i]
   is encoded as [1.0, 2.0 ,3.0 ,4.0]
   When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
  repeated float float_data = 4 [packed = true];

  values - `java.lang.Iterable`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllFloatData values))))

(defn get-name
  "Optionally, a name for the tensor.
  string name = 8;

  returns: `java.lang.String`"
  (^java.lang.String [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getName))))

(defn set-string-data
  "For strings.
   Each element of string_data is a UTF-8 encoded Unicode
   string. No trailing null, no leading BOM. The protobuf \"string\"
   scalar type is not used to match ML community conventions.
   When this field is present, the data_type field MUST be STRING
  repeated bytes string_data = 6;

  index - `int`
  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^Integer index ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setStringData index value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-segment-or-builder
  ".onnx.TensorProto.Segment segment = 3;

  returns: `onnx.OnnxMlProto3$TensorProto$SegmentOrBuilder`"
  (^onnx.OnnxMlProto3$TensorProto$SegmentOrBuilder [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getSegmentOrBuilder))))

(defn set-name-bytes
  "Optionally, a name for the tensor.
  string name = 8;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn get-int-32-data
  "For int32, uint8, int8, uint16, int16, bool, and float16 values
   float16 values must be bit-wise converted to an uint16_t prior
   to writing to the buffer.
   When this field is present, the data_type field MUST be
   INT32, INT16, INT8, UINT16, INT8, BOOL, or FLOAT32
  repeated int32 int32_data = 5 [packed = true];

  index - `int`

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto$Builder this ^Integer index]
    (-> this (.getInt32Data index))))

(defn get-uint-64-data
  "For uint64 and uint32 values
   When this field is present, the data_type field MUST be
   UINT32 or UINT64
  repeated uint64 uint64_data = 11 [packed = true];

  index - `int`

  returns: `long`"
  (^Long [^OnnxMlProto3$TensorProto$Builder this ^Integer index]
    (-> this (.getUint64Data index))))

(defn add-all-int-64-data
  "For int64.
   When this field is present, the data_type field MUST be INT64
  repeated int64 int64_data = 7 [packed = true];

  values - `java.lang.Iterable`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllInt64Data values))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

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
  (^java.util.List [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getFloatDataList))))

(defn merge-segment
  ".onnx.TensorProto.Segment segment = 3;

  value - `onnx.OnnxMlProto3$TensorProto$Segment`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^onnx.OnnxMlProto3$TensorProto$Segment value]
    (-> this (.mergeSegment value))))

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
  (^Integer [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getDoubleDataCount))))

(defn set-uint-64-data
  "For uint64 and uint32 values
   When this field is present, the data_type field MUST be
   UINT32 or UINT64
  repeated uint64 uint64_data = 11 [packed = true];

  index - `int`
  value - `long`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^Integer index ^Long value]
    (-> this (.setUint64Data index value))))

(defn build
  "returns: `onnx.OnnxMlProto3$TensorProto`"
  (^onnx.OnnxMlProto3$TensorProto [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.build))))

(defn clear-int-64-data
  "For int64.
   When this field is present, the data_type field MUST be INT64
  repeated int64 int64_data = 7 [packed = true];

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.clearInt64Data))))

(defn get-int-64-data-list
  "For int64.
   When this field is present, the data_type field MUST be INT64
  repeated int64 int64_data = 7 [packed = true];

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getInt64DataList))))

(defn clear-data-type
  "The data type of the tensor.
  .onnx.TensorProto.DataType data_type = 2;

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.clearDataType))))

(defn set-raw-data
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

  value - `com.github.os72.protobuf351.ByteString`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setRawData value))))

(defn clear-int-32-data
  "For int32, uint8, int8, uint16, int16, bool, and float16 values
   float16 values must be bit-wise converted to an uint16_t prior
   to writing to the buffer.
   When this field is present, the data_type field MUST be
   INT32, INT16, INT8, UINT16, INT8, BOOL, or FLOAT32
  repeated int32 int32_data = 5 [packed = true];

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.clearInt32Data))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`

  throws: java.io.IOException"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn add-int-32-data
  "For int32, uint8, int8, uint16, int16, bool, and float16 values
   float16 values must be bit-wise converted to an uint16_t prior
   to writing to the buffer.
   When this field is present, the data_type field MUST be
   INT32, INT16, INT8, UINT16, INT8, BOOL, or FLOAT32
  repeated int32 int32_data = 5 [packed = true];

  value - `int`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^Integer value]
    (-> this (.addInt32Data value))))

(defn set-float-data
  "For float and complex64 values
   Complex64 tensors are encoded as a single array of floats,
   with the real components appearing in odd numbered positions,
   and the corresponding imaginary component apparing in the
   subsequent even numbered position. (e.g., [1.0  2.0i, 3.0  4.0i]
   is encoded as [1.0, 2.0 ,3.0 ,4.0]
   When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
  repeated float float_data = 4 [packed = true];

  index - `int`
  value - `float`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^Integer index ^Float value]
    (-> this (.setFloatData index value))))

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
  (^java.util.List [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getDoubleDataList))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn set-int-32-data
  "For int32, uint8, int8, uint16, int16, bool, and float16 values
   float16 values must be bit-wise converted to an uint16_t prior
   to writing to the buffer.
   When this field is present, the data_type field MUST be
   INT32, INT16, INT8, UINT16, INT8, BOOL, or FLOAT32
  repeated int32 int32_data = 5 [packed = true];

  index - `int`
  value - `int`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^Integer index ^Integer value]
    (-> this (.setInt32Data index value))))

(defn add-all-double-data
  "For double
   Complex64 tensors are encoded as a single array of doubles,
   with the real components appearing in odd numbered positions,
   and the corresponding imaginary component apparing in the
   subsequent even numbered position. (e.g., [1.0  2.0i, 3.0  4.0i]
   is encoded as [1.0, 2.0 ,3.0 ,4.0]
   When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
  repeated double double_data = 10 [packed = true];

  values - `java.lang.Iterable`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllDoubleData values))))

(defn clone
  "returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.clone))))

(defn get-dims
  "The shape of the tensor.
  repeated int64 dims = 1;

  index - `int`

  returns: `long`"
  (^Long [^OnnxMlProto3$TensorProto$Builder this ^Integer index]
    (-> this (.getDims index))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-segment-builder
  ".onnx.TensorProto.Segment segment = 3;

  returns: `onnx.OnnxMlProto3$TensorProto$Segment$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Segment$Builder [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getSegmentBuilder))))

(defn get-data-type-value
  "The data type of the tensor.
  .onnx.TensorProto.DataType data_type = 2;

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getDataTypeValue))))

(defn add-dims
  "The shape of the tensor.
  repeated int64 dims = 1;

  value - `long`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^Long value]
    (-> this (.addDims value))))

(defn get-int-64-data
  "For int64.
   When this field is present, the data_type field MUST be INT64
  repeated int64 int64_data = 7 [packed = true];

  index - `int`

  returns: `long`"
  (^Long [^OnnxMlProto3$TensorProto$Builder this ^Integer index]
    (-> this (.getInt64Data index))))

(defn add-all-dims
  "The shape of the tensor.
  repeated int64 dims = 1;

  values - `java.lang.Iterable`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllDims values))))

(defn clear
  "returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.clear))))

(defn get-int-64-data-count
  "For int64.
   When this field is present, the data_type field MUST be INT64
  repeated int64 int64_data = 7 [packed = true];

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getInt64DataCount))))

(defn set-dims
  "The shape of the tensor.
  repeated int64 dims = 1;

  index - `int`
  value - `long`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^Integer index ^Long value]
    (-> this (.setDims index value))))

(defn add-all-int-32-data
  "For int32, uint8, int8, uint16, int16, bool, and float16 values
   float16 values must be bit-wise converted to an uint16_t prior
   to writing to the buffer.
   When this field is present, the data_type field MUST be
   INT32, INT16, INT8, UINT16, INT8, BOOL, or FLOAT32
  repeated int32 int32_data = 5 [packed = true];

  values - `java.lang.Iterable`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllInt32Data values))))

(defn clear-float-data
  "For float and complex64 values
   Complex64 tensors are encoded as a single array of floats,
   with the real components appearing in odd numbered positions,
   and the corresponding imaginary component apparing in the
   subsequent even numbered position. (e.g., [1.0  2.0i, 3.0  4.0i]
   is encoded as [1.0, 2.0 ,3.0 ,4.0]
   When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
  repeated float float_data = 4 [packed = true];

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.clearFloatData))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-dims-list
  "The shape of the tensor.
  repeated int64 dims = 1;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^OnnxMlProto3$TensorProto$Builder this]
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
  (^Integer [^OnnxMlProto3$TensorProto$Builder this]
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
  (^Float [^OnnxMlProto3$TensorProto$Builder this ^Integer index]
    (-> this (.getFloatData index))))

(defn has-segment?
  ".onnx.TensorProto.Segment segment = 3;

  returns: `boolean`"
  (^Boolean [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.hasSegment))))

(defn clear-uint-64-data
  "For uint64 and uint32 values
   When this field is present, the data_type field MUST be
   UINT32 or UINT64
  repeated uint64 uint64_data = 11 [packed = true];

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.clearUint64Data))))

(defn get-string-data
  "For strings.
   Each element of string_data is a UTF-8 encoded Unicode
   string. No trailing null, no leading BOM. The protobuf \"string\"
   scalar type is not used to match ML community conventions.
   When this field is present, the data_type field MUST be STRING
  repeated bytes string_data = 6;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OnnxMlProto3$TensorProto$Builder this ^Integer index]
    (-> this (.getStringData index))))

(defn set-int-64-data
  "For int64.
   When this field is present, the data_type field MUST be INT64
  repeated int64 int64_data = 7 [packed = true];

  index - `int`
  value - `long`

  returns: `onnx.OnnxMlProto3$TensorProto$Builder`"
  (^onnx.OnnxMlProto3$TensorProto$Builder [^OnnxMlProto3$TensorProto$Builder this ^Integer index ^Long value]
    (-> this (.setInt64Data index value))))

(defn get-string-data-count
  "For strings.
   Each element of string_data is a UTF-8 encoded Unicode
   string. No trailing null, no leading BOM. The protobuf \"string\"
   scalar type is not used to match ML community conventions.
   When this field is present, the data_type field MUST be STRING
  repeated bytes string_data = 6;

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getStringDataCount))))

(defn get-segment
  ".onnx.TensorProto.Segment segment = 3;

  returns: `onnx.OnnxMlProto3$TensorProto$Segment`"
  (^onnx.OnnxMlProto3$TensorProto$Segment [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getSegment))))

(defn get-dims-count
  "The shape of the tensor.
  repeated int64 dims = 1;

  returns: `int`"
  (^Integer [^OnnxMlProto3$TensorProto$Builder this]
    (-> this (.getDimsCount))))

