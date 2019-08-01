(ns org.tensorflow.framework.TensorSliceProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorSliceProtoOrBuilder]))

(defn get-extent-list
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  returns: `java.util.List<org.tensorflow.framework.TensorSliceProto$Extent>`"
  (^java.util.List [^TensorSliceProtoOrBuilder this]
    (-> this (.getExtentList))))

(defn get-extent
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  index - `int`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent`"
  (^org.tensorflow.framework.TensorSliceProto$Extent [^TensorSliceProtoOrBuilder this ^Integer index]
    (-> this (.getExtent index))))

(defn get-extent-count
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  returns: `int`"
  (^Integer [^TensorSliceProtoOrBuilder this]
    (-> this (.getExtentCount))))

(defn get-extent-or-builder-list
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.TensorSliceProto$ExtentOrBuilder>`"
  ([^TensorSliceProtoOrBuilder this]
    (-> this (.getExtentOrBuilderList))))

(defn get-extent-or-builder
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  index - `int`

  returns: `org.tensorflow.framework.TensorSliceProto$ExtentOrBuilder`"
  (^org.tensorflow.framework.TensorSliceProto$ExtentOrBuilder [^TensorSliceProtoOrBuilder this ^Integer index]
    (-> this (.getExtentOrBuilder index))))

