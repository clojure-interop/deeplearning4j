(ns org.tensorflow.framework.TensorProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorProtoOrBuilder]))

(defn get-float-val-count
  "DT_FLOAT.
  repeated float float_val = 5 [packed = true];

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this]
    (-> this (.getFloatValCount))))

(defn get-half-val
  "DT_HALF. Note that since protobuf has no int16 type, we'll have some
   pointless zero padding for each value here.
  repeated int32 half_val = 13 [packed = true];

  index - `int`

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this ^Integer index]
    (-> this (.getHalfVal index))))

(defn get-dtype
  ".tensorflow.DataType dtype = 1;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^TensorProtoOrBuilder this]
    (-> this (.getDtype))))

(defn get-dcomplex-val-count
  "DT_COMPLEX128. dcomplex_val(2*i) and dcomplex_val(2*i+1) are real
   and imaginary parts of i-th double precision complex.
  repeated double dcomplex_val = 12 [packed = true];

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this]
    (-> this (.getDcomplexValCount))))

(defn get-float-val-list
  "DT_FLOAT.
  repeated float float_val = 5 [packed = true];

  returns: `java.util.List<java.lang.Float>`"
  (^java.util.List [^TensorProtoOrBuilder this]
    (-> this (.getFloatValList))))

(defn get-resource-handle-val-or-builder
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  index - `int`

  returns: `org.tensorflow.framework.ResourceHandleProtoOrBuilder`"
  (^org.tensorflow.framework.ResourceHandleProtoOrBuilder [^TensorProtoOrBuilder this ^Integer index]
    (-> this (.getResourceHandleValOrBuilder index))))

(defn get-int-val-count
  "DT_INT32, DT_INT16, DT_INT8, DT_UINT8.
  repeated int32 int_val = 7 [packed = true];

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this]
    (-> this (.getIntValCount))))

(defn get-uint-32-val
  "DT_UINT32
  repeated uint32 uint32_val = 16 [packed = true];

  index - `int`

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this ^Integer index]
    (-> this (.getUint32Val index))))

(defn get-half-val-count
  "DT_HALF. Note that since protobuf has no int16 type, we'll have some
   pointless zero padding for each value here.
  repeated int32 half_val = 13 [packed = true];

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this]
    (-> this (.getHalfValCount))))

(defn get-bool-val-list
  "DT_BOOL
  repeated bool bool_val = 11 [packed = true];

  returns: `java.util.List<java.lang.Boolean>`"
  (^java.util.List [^TensorProtoOrBuilder this]
    (-> this (.getBoolValList))))

(defn get-string-val-count
  "DT_STRING
  repeated bytes string_val = 8;

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this]
    (-> this (.getStringValCount))))

(defn get-dcomplex-val-list
  "DT_COMPLEX128. dcomplex_val(2*i) and dcomplex_val(2*i+1) are real
   and imaginary parts of i-th double precision complex.
  repeated double dcomplex_val = 12 [packed = true];

  returns: `java.util.List<java.lang.Double>`"
  (^java.util.List [^TensorProtoOrBuilder this]
    (-> this (.getDcomplexValList))))

(defn get-double-val-count
  "DT_DOUBLE.
  repeated double double_val = 6 [packed = true];

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this]
    (-> this (.getDoubleValCount))))

(defn get-resource-handle-val
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  index - `int`

  returns: `org.tensorflow.framework.ResourceHandleProto`"
  (^org.tensorflow.framework.ResourceHandleProto [^TensorProtoOrBuilder this ^Integer index]
    (-> this (.getResourceHandleVal index))))

(defn get-tensor-shape
  "Shape of the tensor.  TODO(touts): sort out the 0-rank issues.
  .tensorflow.TensorShapeProto tensor_shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^TensorProtoOrBuilder this]
    (-> this (.getTensorShape))))

(defn get-int-64-val-count
  "DT_INT64
  repeated int64 int64_val = 10 [packed = true];

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this]
    (-> this (.getInt64ValCount))))

(defn get-scomplex-val-count
  "DT_COMPLEX64. scomplex_val(2*i) and scomplex_val(2*i+1) are real
   and imaginary parts of i-th single precision complex.
  repeated float scomplex_val = 9 [packed = true];

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this]
    (-> this (.getScomplexValCount))))

(defn get-scomplex-val-list
  "DT_COMPLEX64. scomplex_val(2*i) and scomplex_val(2*i+1) are real
   and imaginary parts of i-th single precision complex.
  repeated float scomplex_val = 9 [packed = true];

  returns: `java.util.List<java.lang.Float>`"
  (^java.util.List [^TensorProtoOrBuilder this]
    (-> this (.getScomplexValList))))

(defn get-uint-64-val-list
  "DT_UINT64
  repeated uint64 uint64_val = 17 [packed = true];

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^TensorProtoOrBuilder this]
    (-> this (.getUint64ValList))))

(defn get-int-64-val-list
  "DT_INT64
  repeated int64 int64_val = 10 [packed = true];

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^TensorProtoOrBuilder this]
    (-> this (.getInt64ValList))))

(defn get-int-64-val
  "DT_INT64
  repeated int64 int64_val = 10 [packed = true];

  index - `int`

  returns: `long`"
  (^Long [^TensorProtoOrBuilder this ^Integer index]
    (-> this (.getInt64Val index))))

(defn get-uint-64-val
  "DT_UINT64
  repeated uint64 uint64_val = 17 [packed = true];

  index - `int`

  returns: `long`"
  (^Long [^TensorProtoOrBuilder this ^Integer index]
    (-> this (.getUint64Val index))))

(defn get-float-val
  "DT_FLOAT.
  repeated float float_val = 5 [packed = true];

  index - `int`

  returns: `float`"
  (^Float [^TensorProtoOrBuilder this ^Integer index]
    (-> this (.getFloatVal index))))

(defn get-variant-val-list
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  returns: `java.util.List<org.tensorflow.framework.VariantTensorDataProto>`"
  (^java.util.List [^TensorProtoOrBuilder this]
    (-> this (.getVariantValList))))

(defn get-string-val
  "DT_STRING
  repeated bytes string_val = 8;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^TensorProtoOrBuilder this ^Integer index]
    (-> this (.getStringVal index))))

(defn get-uint-32-val-list
  "DT_UINT32
  repeated uint32 uint32_val = 16 [packed = true];

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^TensorProtoOrBuilder this]
    (-> this (.getUint32ValList))))

(defn get-resource-handle-val-or-builder-list
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  returns: `java.util.List<? extends org.tensorflow.framework.ResourceHandleProtoOrBuilder>`"
  ([^TensorProtoOrBuilder this]
    (-> this (.getResourceHandleValOrBuilderList))))

(defn get-resource-handle-val-count
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this]
    (-> this (.getResourceHandleValCount))))

(defn get-half-val-list
  "DT_HALF. Note that since protobuf has no int16 type, we'll have some
   pointless zero padding for each value here.
  repeated int32 half_val = 13 [packed = true];

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^TensorProtoOrBuilder this]
    (-> this (.getHalfValList))))

(defn get-variant-val-count
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this]
    (-> this (.getVariantValCount))))

(defn get-dtype-value
  ".tensorflow.DataType dtype = 1;

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this]
    (-> this (.getDtypeValue))))

(defn get-int-val
  "DT_INT32, DT_INT16, DT_INT8, DT_UINT8.
  repeated int32 int_val = 7 [packed = true];

  index - `int`

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this ^Integer index]
    (-> this (.getIntVal index))))

(defn get-variant-val-or-builder-list
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  returns: `java.util.List<? extends org.tensorflow.framework.VariantTensorDataProtoOrBuilder>`"
  ([^TensorProtoOrBuilder this]
    (-> this (.getVariantValOrBuilderList))))

(defn get-int-val-list
  "DT_INT32, DT_INT16, DT_INT8, DT_UINT8.
  repeated int32 int_val = 7 [packed = true];

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^TensorProtoOrBuilder this]
    (-> this (.getIntValList))))

(defn get-version-number
  "Version number.
   In version 0, if the \"repeated xxx\" representations contain only one
   element, that element is repeated to fill the shape.  This makes it easy
   to represent a constant Tensor with a single value.
  int32 version_number = 3;

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this]
    (-> this (.getVersionNumber))))

(defn get-string-val-list
  "DT_STRING
  repeated bytes string_val = 8;

  returns: `java.util.List<com.github.os72.protobuf351.ByteString>`"
  (^java.util.List [^TensorProtoOrBuilder this]
    (-> this (.getStringValList))))

(defn get-tensor-shape-or-builder
  "Shape of the tensor.  TODO(touts): sort out the 0-rank issues.
  .tensorflow.TensorShapeProto tensor_shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProtoOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProtoOrBuilder [^TensorProtoOrBuilder this]
    (-> this (.getTensorShapeOrBuilder))))

(defn get-bool-val-count
  "DT_BOOL
  repeated bool bool_val = 11 [packed = true];

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this]
    (-> this (.getBoolValCount))))

(defn get-double-val
  "DT_DOUBLE.
  repeated double double_val = 6 [packed = true];

  index - `int`

  returns: `double`"
  (^Double [^TensorProtoOrBuilder this ^Integer index]
    (-> this (.getDoubleVal index))))

(defn get-scomplex-val
  "DT_COMPLEX64. scomplex_val(2*i) and scomplex_val(2*i+1) are real
   and imaginary parts of i-th single precision complex.
  repeated float scomplex_val = 9 [packed = true];

  index - `int`

  returns: `float`"
  (^Float [^TensorProtoOrBuilder this ^Integer index]
    (-> this (.getScomplexVal index))))

(defn get-bool-val?
  "DT_BOOL
  repeated bool bool_val = 11 [packed = true];

  index - `int`

  returns: `boolean`"
  (^Boolean [^TensorProtoOrBuilder this ^Integer index]
    (-> this (.getBoolVal index))))

(defn get-variant-val
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  index - `int`

  returns: `org.tensorflow.framework.VariantTensorDataProto`"
  (^org.tensorflow.framework.VariantTensorDataProto [^TensorProtoOrBuilder this ^Integer index]
    (-> this (.getVariantVal index))))

(defn has-tensor-shape?
  "Shape of the tensor.  TODO(touts): sort out the 0-rank issues.
  .tensorflow.TensorShapeProto tensor_shape = 2;

  returns: `boolean`"
  (^Boolean [^TensorProtoOrBuilder this]
    (-> this (.hasTensorShape))))

(defn get-tensor-content
  "Serialized raw tensor content from either Tensor::AsProtoTensorContent or
   memcpy in tensorflow::grpc::EncodeTensorToByteBuffer. This representation
   can be used for all tensor types. The purpose of this representation is to
   reduce serialization overhead during RPC call by avoiding serialization of
   many repeated small items.
  bytes tensor_content = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^TensorProtoOrBuilder this]
    (-> this (.getTensorContent))))

(defn get-uint-64-val-count
  "DT_UINT64
  repeated uint64 uint64_val = 17 [packed = true];

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this]
    (-> this (.getUint64ValCount))))

(defn get-dcomplex-val
  "DT_COMPLEX128. dcomplex_val(2*i) and dcomplex_val(2*i+1) are real
   and imaginary parts of i-th double precision complex.
  repeated double dcomplex_val = 12 [packed = true];

  index - `int`

  returns: `double`"
  (^Double [^TensorProtoOrBuilder this ^Integer index]
    (-> this (.getDcomplexVal index))))

(defn get-double-val-list
  "DT_DOUBLE.
  repeated double double_val = 6 [packed = true];

  returns: `java.util.List<java.lang.Double>`"
  (^java.util.List [^TensorProtoOrBuilder this]
    (-> this (.getDoubleValList))))

(defn get-uint-32-val-count
  "DT_UINT32
  repeated uint32 uint32_val = 16 [packed = true];

  returns: `int`"
  (^Integer [^TensorProtoOrBuilder this]
    (-> this (.getUint32ValCount))))

(defn get-resource-handle-val-list
  "DT_RESOURCE
  repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;

  returns: `java.util.List<org.tensorflow.framework.ResourceHandleProto>`"
  (^java.util.List [^TensorProtoOrBuilder this]
    (-> this (.getResourceHandleValList))))

(defn get-variant-val-or-builder
  "DT_VARIANT
  repeated .tensorflow.VariantTensorDataProto variant_val = 15;

  index - `int`

  returns: `org.tensorflow.framework.VariantTensorDataProtoOrBuilder`"
  (^org.tensorflow.framework.VariantTensorDataProtoOrBuilder [^TensorProtoOrBuilder this ^Integer index]
    (-> this (.getVariantValOrBuilder index))))

