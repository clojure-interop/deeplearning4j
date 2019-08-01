(ns org.tensorflow.framework.TensorProto$Builder
  " Protocol buffer representing a tensor.
 Protobuf type tensorflow.TensorProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (TensorProto$Builder/getDescriptor )))

(defn set-tensor-shape
  "Shape of the tensor.  TODO(touts): sort out the 0-rank issues.
  .tensorflow.TensorShapeProto tensor_shape = 2;

  value - `org.tensorflow.framework.TensorShapeProto`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^org.tensorflow.framework.TensorShapeProto value]
    (-> this (.setTensorShape value))))

(defn get-float-val-count
  "DT_FLOAT.
  repeated float float_val = 5 [packed = true];

  returns: `int`"
  (^Integer [^TensorProto$Builder this]
    (-> this (.getFloatValCount))))

(defn get-half-val
  "DT_HALF. Note that since protobuf has no int16 type, we'll have some
   pointless zero padding for each value here.
  repeated int32 half_val = 13 [packed = true];

  index - `int`

  returns: `int`"
  (^Integer [^TensorProto$Builder this ^Integer index]
    (-> this (.getHalfVal index))))

(defn clear-string-val
  "DT_STRING
  repeated bytes string_val = 8;

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clearStringVal))))

(defn get-dtype
  ".tensorflow.DataType dtype = 1;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^TensorProto$Builder this]
    (-> this (.getDtype))))

(defn add-resource-handle-val-builder
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  index - `int`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^TensorProto$Builder this ^Integer index]
    (-> this (.addResourceHandleValBuilder index)))
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^TensorProto$Builder this]
    (-> this (.addResourceHandleValBuilder))))

(defn clear-scomplex-val
  "DT_COMPLEX64. scomplex_val(2*i) and scomplex_val(2*i+1) are real
   and imaginary parts of i-th single precision complex.
  repeated float scomplex_val = 9 [packed = true];

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clearScomplexVal))))

(defn clear-half-val
  "DT_HALF. Note that since protobuf has no int16 type, we'll have some
   pointless zero padding for each value here.
  repeated int32 half_val = 13 [packed = true];

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clearHalfVal))))

(defn add-uint-32-val
  "DT_UINT32
  repeated uint32 uint32_val = 16 [packed = true];

  value - `int`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer value]
    (-> this (.addUint32Val value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn remove-variant-val
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  index - `int`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer index]
    (-> this (.removeVariantVal index))))

(defn remove-resource-handle-val
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  index - `int`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer index]
    (-> this (.removeResourceHandleVal index))))

(defn get-dcomplex-val-count
  "DT_COMPLEX128. dcomplex_val(2*i) and dcomplex_val(2*i+1) are real
   and imaginary parts of i-th double precision complex.
  repeated double dcomplex_val = 12 [packed = true];

  returns: `int`"
  (^Integer [^TensorProto$Builder this]
    (-> this (.getDcomplexValCount))))

(defn get-float-val-list
  "DT_FLOAT.
  repeated float float_val = 5 [packed = true];

  returns: `java.util.List<java.lang.Float>`"
  (^java.util.List [^TensorProto$Builder this]
    (-> this (.getFloatValList))))

(defn build-partial
  "returns: `org.tensorflow.framework.TensorProto`"
  (^org.tensorflow.framework.TensorProto [^TensorProto$Builder this]
    (-> this (.buildPartial))))

(defn add-resource-handle-val
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  index - `int`
  value - `org.tensorflow.framework.ResourceHandleProto`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer index ^org.tensorflow.framework.ResourceHandleProto value]
    (-> this (.addResourceHandleVal index value)))
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^org.tensorflow.framework.ResourceHandleProto value]
    (-> this (.addResourceHandleVal value))))

(defn clear-dtype
  ".tensorflow.DataType dtype = 1;

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clearDtype))))

(defn get-resource-handle-val-or-builder
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  index - `int`

  returns: `org.tensorflow.framework.ResourceHandleProtoOrBuilder`"
  (^org.tensorflow.framework.ResourceHandleProtoOrBuilder [^TensorProto$Builder this ^Integer index]
    (-> this (.getResourceHandleValOrBuilder index))))

(defn get-resource-handle-val-builder-list
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  returns: `java.util.List<org.tensorflow.framework.ResourceHandleProto$Builder>`"
  (^java.util.List [^TensorProto$Builder this]
    (-> this (.getResourceHandleValBuilderList))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^TensorProto$Builder this]
    (-> this (.isInitialized))))

(defn get-int-val-count
  "DT_INT32, DT_INT16, DT_INT8, DT_UINT8.
  repeated int32 int_val = 7 [packed = true];

  returns: `int`"
  (^Integer [^TensorProto$Builder this]
    (-> this (.getIntValCount))))

(defn get-uint-32-val
  "DT_UINT32
  repeated uint32 uint32_val = 16 [packed = true];

  index - `int`

  returns: `int`"
  (^Integer [^TensorProto$Builder this ^Integer index]
    (-> this (.getUint32Val index))))

(defn clear-double-val
  "DT_DOUBLE.
  repeated double double_val = 6 [packed = true];

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clearDoubleVal))))

(defn clear-bool-val
  "DT_BOOL
  repeated bool bool_val = 11 [packed = true];

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clearBoolVal))))

(defn clear-tensor-content
  "Serialized raw tensor content from either Tensor::AsProtoTensorContent or
   memcpy in tensorflow::grpc::EncodeTensorToByteBuffer. This representation
   can be used for all tensor types. The purpose of this representation is to
   reduce serialization overhead during RPC call by avoiding serialization of
   many repeated small items.
  bytes tensor_content = 4;

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clearTensorContent))))

(defn get-half-val-count
  "DT_HALF. Note that since protobuf has no int16 type, we'll have some
   pointless zero padding for each value here.
  repeated int32 half_val = 13 [packed = true];

  returns: `int`"
  (^Integer [^TensorProto$Builder this]
    (-> this (.getHalfValCount))))

(defn add-int-val
  "DT_INT32, DT_INT16, DT_INT8, DT_UINT8.
  repeated int32 int_val = 7 [packed = true];

  value - `int`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer value]
    (-> this (.addIntVal value))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.TensorProto`"
  (^org.tensorflow.framework.TensorProto [^TensorProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn set-double-val
  "DT_DOUBLE.
  repeated double double_val = 6 [packed = true];

  index - `int`
  value - `double`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer index ^Double value]
    (-> this (.setDoubleVal index value))))

(defn get-bool-val-list
  "DT_BOOL
  repeated bool bool_val = 11 [packed = true];

  returns: `java.util.List<java.lang.Boolean>`"
  (^java.util.List [^TensorProto$Builder this]
    (-> this (.getBoolValList))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-uint-64-val
  "DT_UINT64
  repeated uint64 uint64_val = 17 [packed = true];

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clearUint64Val))))

(defn get-string-val-count
  "DT_STRING
  repeated bytes string_val = 8;

  returns: `int`"
  (^Integer [^TensorProto$Builder this]
    (-> this (.getStringValCount))))

(defn add-all-half-val
  "DT_HALF. Note that since protobuf has no int16 type, we'll have some
   pointless zero padding for each value here.
  repeated int32 half_val = 13 [packed = true];

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllHalfVal values))))

(defn get-dcomplex-val-list
  "DT_COMPLEX128. dcomplex_val(2*i) and dcomplex_val(2*i+1) are real
   and imaginary parts of i-th double precision complex.
  repeated double dcomplex_val = 12 [packed = true];

  returns: `java.util.List<java.lang.Double>`"
  (^java.util.List [^TensorProto$Builder this]
    (-> this (.getDcomplexValList))))

(defn get-double-val-count
  "DT_DOUBLE.
  repeated double double_val = 6 [packed = true];

  returns: `int`"
  (^Integer [^TensorProto$Builder this]
    (-> this (.getDoubleValCount))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-tensor-content
  "Serialized raw tensor content from either Tensor::AsProtoTensorContent or
   memcpy in tensorflow::grpc::EncodeTensorToByteBuffer. This representation
   can be used for all tensor types. The purpose of this representation is to
   reduce serialization overhead during RPC call by avoiding serialization of
   many repeated small items.
  bytes tensor_content = 4;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setTensorContent value))))

(defn get-resource-handle-val
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  index - `int`

  returns: `org.tensorflow.framework.ResourceHandleProto`"
  (^org.tensorflow.framework.ResourceHandleProto [^TensorProto$Builder this ^Integer index]
    (-> this (.getResourceHandleVal index))))

(defn get-tensor-shape
  "Shape of the tensor.  TODO(touts): sort out the 0-rank issues.
  .tensorflow.TensorShapeProto tensor_shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^TensorProto$Builder this]
    (-> this (.getTensorShape))))

(defn add-all-int-val
  "DT_INT32, DT_INT16, DT_INT8, DT_UINT8.
  repeated int32 int_val = 7 [packed = true];

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllIntVal values))))

(defn get-int-64-val-count
  "DT_INT64
  repeated int64 int64_val = 10 [packed = true];

  returns: `int`"
  (^Integer [^TensorProto$Builder this]
    (-> this (.getInt64ValCount))))

(defn add-int-64-val
  "DT_INT64
  repeated int64 int64_val = 10 [packed = true];

  value - `long`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Long value]
    (-> this (.addInt64Val value))))

(defn set-scomplex-val
  "DT_COMPLEX64. scomplex_val(2*i) and scomplex_val(2*i+1) are real
   and imaginary parts of i-th single precision complex.
  repeated float scomplex_val = 9 [packed = true];

  index - `int`
  value - `float`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer index ^Float value]
    (-> this (.setScomplexVal index value))))

(defn get-scomplex-val-count
  "DT_COMPLEX64. scomplex_val(2*i) and scomplex_val(2*i+1) are real
   and imaginary parts of i-th single precision complex.
  repeated float scomplex_val = 9 [packed = true];

  returns: `int`"
  (^Integer [^TensorProto$Builder this]
    (-> this (.getScomplexValCount))))

(defn get-scomplex-val-list
  "DT_COMPLEX64. scomplex_val(2*i) and scomplex_val(2*i+1) are real
   and imaginary parts of i-th single precision complex.
  repeated float scomplex_val = 9 [packed = true];

  returns: `java.util.List<java.lang.Float>`"
  (^java.util.List [^TensorProto$Builder this]
    (-> this (.getScomplexValList))))

(defn get-uint-64-val-list
  "DT_UINT64
  repeated uint64 uint64_val = 17 [packed = true];

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^TensorProto$Builder this]
    (-> this (.getUint64ValList))))

(defn set-resource-handle-val
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  index - `int`
  value - `org.tensorflow.framework.ResourceHandleProto`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer index ^org.tensorflow.framework.ResourceHandleProto value]
    (-> this (.setResourceHandleVal index value))))

(defn clear-int-64-val
  "DT_INT64
  repeated int64 int64_val = 10 [packed = true];

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clearInt64Val))))

(defn get-variant-val-builder
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  index - `int`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^TensorProto$Builder this ^Integer index]
    (-> this (.getVariantValBuilder index))))

(defn clear-variant-val
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clearVariantVal))))

(defn get-int-64-val-list
  "DT_INT64
  repeated int64 int64_val = 10 [packed = true];

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^TensorProto$Builder this]
    (-> this (.getInt64ValList))))

(defn set-dcomplex-val
  "DT_COMPLEX128. dcomplex_val(2*i) and dcomplex_val(2*i+1) are real
   and imaginary parts of i-th double precision complex.
  repeated double dcomplex_val = 12 [packed = true];

  index - `int`
  value - `double`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer index ^Double value]
    (-> this (.setDcomplexVal index value))))

(defn set-uint-32-val
  "DT_UINT32
  repeated uint32 uint32_val = 16 [packed = true];

  index - `int`
  value - `int`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer index ^Integer value]
    (-> this (.setUint32Val index value))))

(defn set-int-val
  "DT_INT32, DT_INT16, DT_INT8, DT_UINT8.
  repeated int32 int_val = 7 [packed = true];

  index - `int`
  value - `int`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer index ^Integer value]
    (-> this (.setIntVal index value))))

(defn get-int-64-val
  "DT_INT64
  repeated int64 int64_val = 10 [packed = true];

  index - `int`

  returns: `long`"
  (^Long [^TensorProto$Builder this ^Integer index]
    (-> this (.getInt64Val index))))

(defn set-uint-64-val
  "DT_UINT64
  repeated uint64 uint64_val = 17 [packed = true];

  index - `int`
  value - `long`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer index ^Long value]
    (-> this (.setUint64Val index value))))

(defn set-dtype
  ".tensorflow.DataType dtype = 1;

  value - `org.tensorflow.framework.DataType`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^org.tensorflow.framework.DataType value]
    (-> this (.setDtype value))))

(defn get-uint-64-val
  "DT_UINT64
  repeated uint64 uint64_val = 17 [packed = true];

  index - `int`

  returns: `long`"
  (^Long [^TensorProto$Builder this ^Integer index]
    (-> this (.getUint64Val index))))

(defn add-all-float-val
  "DT_FLOAT.
  repeated float float_val = 5 [packed = true];

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllFloatVal values))))

(defn add-scomplex-val
  "DT_COMPLEX64. scomplex_val(2*i) and scomplex_val(2*i+1) are real
   and imaginary parts of i-th single precision complex.
  repeated float scomplex_val = 9 [packed = true];

  value - `float`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Float value]
    (-> this (.addScomplexVal value))))

(defn add-string-val
  "DT_STRING
  repeated bytes string_val = 8;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.addStringVal value))))

(defn get-float-val
  "DT_FLOAT.
  repeated float float_val = 5 [packed = true];

  index - `int`

  returns: `float`"
  (^Float [^TensorProto$Builder this ^Integer index]
    (-> this (.getFloatVal index))))

(defn set-float-val
  "DT_FLOAT.
  repeated float float_val = 5 [packed = true];

  index - `int`
  value - `float`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer index ^Float value]
    (-> this (.setFloatVal index value))))

(defn get-variant-val-list
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  returns: `java.util.List<org.tensorflow.framework.VariantTensorDataProto>`"
  (^java.util.List [^TensorProto$Builder this]
    (-> this (.getVariantValList))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn clear-tensor-shape
  "Shape of the tensor.  TODO(touts): sort out the 0-rank issues.
  .tensorflow.TensorShapeProto tensor_shape = 2;

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clearTensorShape))))

(defn add-all-int-64-val
  "DT_INT64
  repeated int64 int64_val = 10 [packed = true];

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllInt64Val values))))

(defn get-string-val
  "DT_STRING
  repeated bytes string_val = 8;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^TensorProto$Builder this ^Integer index]
    (-> this (.getStringVal index))))

(defn get-uint-32-val-list
  "DT_UINT32
  repeated uint32 uint32_val = 16 [packed = true];

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^TensorProto$Builder this]
    (-> this (.getUint32ValList))))

(defn get-resource-handle-val-or-builder-list
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  returns: `java.util.List<? extends org.tensorflow.framework.ResourceHandleProtoOrBuilder>`"
  ([^TensorProto$Builder this]
    (-> this (.getResourceHandleValOrBuilderList))))

(defn clear-float-val
  "DT_FLOAT.
  repeated float float_val = 5 [packed = true];

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clearFloatVal))))

(defn get-resource-handle-val-count
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  returns: `int`"
  (^Integer [^TensorProto$Builder this]
    (-> this (.getResourceHandleValCount))))

(defn set-version-number
  "Version number.
   In version 0, if the \"repeated xxx\" representations contain only one
   element, that element is repeated to fill the shape.  This makes it easy
   to represent a constant Tensor with a single value.
  int32 version_number = 3;

  value - `int`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer value]
    (-> this (.setVersionNumber value))))

(defn add-bool-val
  "DT_BOOL
  repeated bool bool_val = 11 [packed = true];

  value - `boolean`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Boolean value]
    (-> this (.addBoolVal value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn get-half-val-list
  "DT_HALF. Note that since protobuf has no int16 type, we'll have some
   pointless zero padding for each value here.
  repeated int32 half_val = 13 [packed = true];

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^TensorProto$Builder this]
    (-> this (.getHalfValList))))

(defn add-dcomplex-val
  "DT_COMPLEX128. dcomplex_val(2*i) and dcomplex_val(2*i+1) are real
   and imaginary parts of i-th double precision complex.
  repeated double dcomplex_val = 12 [packed = true];

  value - `double`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Double value]
    (-> this (.addDcomplexVal value))))

(defn get-variant-val-count
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  returns: `int`"
  (^Integer [^TensorProto$Builder this]
    (-> this (.getVariantValCount))))

(defn build
  "returns: `org.tensorflow.framework.TensorProto`"
  (^org.tensorflow.framework.TensorProto [^TensorProto$Builder this]
    (-> this (.build))))

(defn add-all-resource-handle-val
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllResourceHandleVal values))))

(defn add-all-scomplex-val
  "DT_COMPLEX64. scomplex_val(2*i) and scomplex_val(2*i+1) are real
   and imaginary parts of i-th single precision complex.
  repeated float scomplex_val = 9 [packed = true];

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllScomplexVal values))))

(defn get-dtype-value
  ".tensorflow.DataType dtype = 1;

  returns: `int`"
  (^Integer [^TensorProto$Builder this]
    (-> this (.getDtypeValue))))

(defn get-int-val
  "DT_INT32, DT_INT16, DT_INT8, DT_UINT8.
  repeated int32 int_val = 7 [packed = true];

  index - `int`

  returns: `int`"
  (^Integer [^TensorProto$Builder this ^Integer index]
    (-> this (.getIntVal index))))

(defn get-variant-val-or-builder-list
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  returns: `java.util.List<? extends org.tensorflow.framework.VariantTensorDataProtoOrBuilder>`"
  ([^TensorProto$Builder this]
    (-> this (.getVariantValOrBuilderList))))

(defn get-int-val-list
  "DT_INT32, DT_INT16, DT_INT8, DT_UINT8.
  repeated int32 int_val = 7 [packed = true];

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^TensorProto$Builder this]
    (-> this (.getIntValList))))

(defn get-version-number
  "Version number.
   In version 0, if the \"repeated xxx\" representations contain only one
   element, that element is repeated to fill the shape.  This makes it easy
   to represent a constant Tensor with a single value.
  int32 version_number = 3;

  returns: `int`"
  (^Integer [^TensorProto$Builder this]
    (-> this (.getVersionNumber))))

(defn get-string-val-list
  "DT_STRING
  repeated bytes string_val = 8;

  returns: `java.util.List<com.github.os72.protobuf351.ByteString>`"
  (^java.util.List [^TensorProto$Builder this]
    (-> this (.getStringValList))))

(defn set-variant-val
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  index - `int`
  value - `org.tensorflow.framework.VariantTensorDataProto`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer index ^org.tensorflow.framework.VariantTensorDataProto value]
    (-> this (.setVariantVal index value))))

(defn get-tensor-shape-or-builder
  "Shape of the tensor.  TODO(touts): sort out the 0-rank issues.
  .tensorflow.TensorShapeProto tensor_shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProtoOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProtoOrBuilder [^TensorProto$Builder this]
    (-> this (.getTensorShapeOrBuilder))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.TensorProto$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn add-all-dcomplex-val
  "DT_COMPLEX128. dcomplex_val(2*i) and dcomplex_val(2*i+1) are real
   and imaginary parts of i-th double precision complex.
  repeated double dcomplex_val = 12 [packed = true];

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllDcomplexVal values))))

(defn get-bool-val-count
  "DT_BOOL
  repeated bool bool_val = 11 [packed = true];

  returns: `int`"
  (^Integer [^TensorProto$Builder this]
    (-> this (.getBoolValCount))))

(defn add-all-uint-64-val
  "DT_UINT64
  repeated uint64 uint64_val = 17 [packed = true];

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllUint64Val values))))

(defn get-double-val
  "DT_DOUBLE.
  repeated double double_val = 6 [packed = true];

  index - `int`

  returns: `double`"
  (^Double [^TensorProto$Builder this ^Integer index]
    (-> this (.getDoubleVal index))))

(defn get-scomplex-val
  "DT_COMPLEX64. scomplex_val(2*i) and scomplex_val(2*i+1) are real
   and imaginary parts of i-th single precision complex.
  repeated float scomplex_val = 9 [packed = true];

  index - `int`

  returns: `float`"
  (^Float [^TensorProto$Builder this ^Integer index]
    (-> this (.getScomplexVal index))))

(defn get-bool-val?
  "DT_BOOL
  repeated bool bool_val = 11 [packed = true];

  index - `int`

  returns: `boolean`"
  (^Boolean [^TensorProto$Builder this ^Integer index]
    (-> this (.getBoolVal index))))

(defn set-half-val
  "DT_HALF. Note that since protobuf has no int16 type, we'll have some
   pointless zero padding for each value here.
  repeated int32 half_val = 13 [packed = true];

  index - `int`
  value - `int`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer index ^Integer value]
    (-> this (.setHalfVal index value))))

(defn get-variant-val
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  index - `int`

  returns: `org.tensorflow.framework.VariantTensorDataProto`"
  (^org.tensorflow.framework.VariantTensorDataProto [^TensorProto$Builder this ^Integer index]
    (-> this (.getVariantVal index))))

(defn get-tensor-shape-builder
  "Shape of the tensor.  TODO(touts): sort out the 0-rank issues.
  .tensorflow.TensorShapeProto tensor_shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorProto$Builder this]
    (-> this (.getTensorShapeBuilder))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^TensorProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn set-int-64-val
  "DT_INT64
  repeated int64 int64_val = 10 [packed = true];

  index - `int`
  value - `long`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer index ^Long value]
    (-> this (.setInt64Val index value))))

(defn clear-dcomplex-val
  "DT_COMPLEX128. dcomplex_val(2*i) and dcomplex_val(2*i+1) are real
   and imaginary parts of i-th double precision complex.
  repeated double dcomplex_val = 12 [packed = true];

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clearDcomplexVal))))

(defn clear-int-val
  "DT_INT32, DT_INT16, DT_INT8, DT_UINT8.
  repeated int32 int_val = 7 [packed = true];

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clearIntVal))))

(defn add-half-val
  "DT_HALF. Note that since protobuf has no int16 type, we'll have some
   pointless zero padding for each value here.
  repeated int32 half_val = 13 [packed = true];

  value - `int`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer value]
    (-> this (.addHalfVal value))))

(defn merge-tensor-shape
  "Shape of the tensor.  TODO(touts): sort out the 0-rank issues.
  .tensorflow.TensorShapeProto tensor_shape = 2;

  value - `org.tensorflow.framework.TensorShapeProto`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^org.tensorflow.framework.TensorShapeProto value]
    (-> this (.mergeTensorShape value))))

(defn set-bool-val
  "DT_BOOL
  repeated bool bool_val = 11 [packed = true];

  index - `int`
  value - `boolean`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer index ^Boolean value]
    (-> this (.setBoolVal index value))))

(defn has-tensor-shape?
  "Shape of the tensor.  TODO(touts): sort out the 0-rank issues.
  .tensorflow.TensorShapeProto tensor_shape = 2;

  returns: `boolean`"
  (^Boolean [^TensorProto$Builder this]
    (-> this (.hasTensorShape))))

(defn get-resource-handle-val-builder
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  index - `int`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^TensorProto$Builder this ^Integer index]
    (-> this (.getResourceHandleValBuilder index))))

(defn clear
  "returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clear))))

(defn add-float-val
  "DT_FLOAT.
  repeated float float_val = 5 [packed = true];

  value - `float`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Float value]
    (-> this (.addFloatVal value))))

(defn add-variant-val-builder
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  index - `int`

  returns: `org.tensorflow.framework.VariantTensorDataProto$Builder`"
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^TensorProto$Builder this ^Integer index]
    (-> this (.addVariantValBuilder index)))
  (^org.tensorflow.framework.VariantTensorDataProto$Builder [^TensorProto$Builder this]
    (-> this (.addVariantValBuilder))))

(defn add-all-double-val
  "DT_DOUBLE.
  repeated double double_val = 6 [packed = true];

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllDoubleVal values))))

(defn clear-version-number
  "Version number.
   In version 0, if the \"repeated xxx\" representations contain only one
   element, that element is repeated to fill the shape.  This makes it easy
   to represent a constant Tensor with a single value.
  int32 version_number = 3;

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clearVersionNumber))))

(defn get-tensor-content
  "Serialized raw tensor content from either Tensor::AsProtoTensorContent or
   memcpy in tensorflow::grpc::EncodeTensorToByteBuffer. This representation
   can be used for all tensor types. The purpose of this representation is to
   reduce serialization overhead during RPC call by avoiding serialization of
   many repeated small items.
  bytes tensor_content = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^TensorProto$Builder this]
    (-> this (.getTensorContent))))

(defn clear-uint-32-val
  "DT_UINT32
  repeated uint32 uint32_val = 16 [packed = true];

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clearUint32Val))))

(defn set-string-val
  "DT_STRING
  repeated bytes string_val = 8;

  index - `int`
  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer index ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setStringVal index value))))

(defn add-all-string-val
  "DT_STRING
  repeated bytes string_val = 8;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllStringVal values))))

(defn add-variant-val
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  index - `int`
  value - `org.tensorflow.framework.VariantTensorDataProto`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer index ^org.tensorflow.framework.VariantTensorDataProto value]
    (-> this (.addVariantVal index value)))
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^org.tensorflow.framework.VariantTensorDataProto value]
    (-> this (.addVariantVal value))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-uint-64-val-count
  "DT_UINT64
  repeated uint64 uint64_val = 17 [packed = true];

  returns: `int`"
  (^Integer [^TensorProto$Builder this]
    (-> this (.getUint64ValCount))))

(defn clear-resource-handle-val
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this]
    (-> this (.clearResourceHandleVal))))

(defn add-uint-64-val
  "DT_UINT64
  repeated uint64 uint64_val = 17 [packed = true];

  value - `long`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Long value]
    (-> this (.addUint64Val value))))

(defn get-dcomplex-val
  "DT_COMPLEX128. dcomplex_val(2*i) and dcomplex_val(2*i+1) are real
   and imaginary parts of i-th double precision complex.
  repeated double dcomplex_val = 12 [packed = true];

  index - `int`

  returns: `double`"
  (^Double [^TensorProto$Builder this ^Integer index]
    (-> this (.getDcomplexVal index))))

(defn get-double-val-list
  "DT_DOUBLE.
  repeated double double_val = 6 [packed = true];

  returns: `java.util.List<java.lang.Double>`"
  (^java.util.List [^TensorProto$Builder this]
    (-> this (.getDoubleValList))))

(defn get-uint-32-val-count
  "DT_UINT32
  repeated uint32 uint32_val = 16 [packed = true];

  returns: `int`"
  (^Integer [^TensorProto$Builder this]
    (-> this (.getUint32ValCount))))

(defn get-resource-handle-val-list
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  returns: `java.util.List<org.tensorflow.framework.ResourceHandleProto>`"
  (^java.util.List [^TensorProto$Builder this]
    (-> this (.getResourceHandleValList))))

(defn set-dtype-value
  ".tensorflow.DataType dtype = 1;

  value - `int`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Integer value]
    (-> this (.setDtypeValue value))))

(defn add-double-val
  "DT_DOUBLE.
  repeated double double_val = 6 [packed = true];

  value - `double`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^Double value]
    (-> this (.addDoubleVal value))))

(defn add-all-variant-val
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllVariantVal values))))

(defn add-all-uint-32-val
  "DT_UINT32
  repeated uint32 uint32_val = 16 [packed = true];

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllUint32Val values))))

(defn add-all-bool-val
  "DT_BOOL
  repeated bool bool_val = 11 [packed = true];

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^TensorProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllBoolVal values))))

(defn get-variant-val-or-builder
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  index - `int`

  returns: `org.tensorflow.framework.VariantTensorDataProtoOrBuilder`"
  (^org.tensorflow.framework.VariantTensorDataProtoOrBuilder [^TensorProto$Builder this ^Integer index]
    (-> this (.getVariantValOrBuilder index))))

(defn get-variant-val-builder-list
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  returns: `java.util.List<org.tensorflow.framework.VariantTensorDataProto$Builder>`"
  (^java.util.List [^TensorProto$Builder this]
    (-> this (.getVariantValBuilderList))))

