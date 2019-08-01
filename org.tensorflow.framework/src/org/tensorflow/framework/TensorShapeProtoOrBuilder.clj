(ns org.tensorflow.framework.TensorShapeProtoOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorShapeProtoOrBuilder]))

(defn get-dim-list
  "Dimensions of the tensor, such as {\"input\", 30}, {\"output\", 40}
   for a 30 x 40 2D tensor.  If an entry has size -1, this
   corresponds to a dimension of unknown size. The names are
   optional.
   The order of entries in \"dim\" matters: It indicates the layout of the
   values in the tensor in-memory representation.
   The first entry in \"dim\" is the outermost dimension used to layout the
   values, the last entry is the innermost dimension.  This matches the
   in-memory layout of RowMajor Eigen tensors.
   If \"dim.size()\" > 0, \"unknown_rank\" must be false.
  repeated .tensorflow.TensorShapeProto.Dim dim = 2;

  returns: `java.util.List<org.tensorflow.framework.TensorShapeProto$Dim>`"
  (^java.util.List [^TensorShapeProtoOrBuilder this]
    (-> this (.getDimList))))

(defn get-dim
  "Dimensions of the tensor, such as {\"input\", 30}, {\"output\", 40}
   for a 30 x 40 2D tensor.  If an entry has size -1, this
   corresponds to a dimension of unknown size. The names are
   optional.
   The order of entries in \"dim\" matters: It indicates the layout of the
   values in the tensor in-memory representation.
   The first entry in \"dim\" is the outermost dimension used to layout the
   values, the last entry is the innermost dimension.  This matches the
   in-memory layout of RowMajor Eigen tensors.
   If \"dim.size()\" > 0, \"unknown_rank\" must be false.
  repeated .tensorflow.TensorShapeProto.Dim dim = 2;

  index - `int`

  returns: `org.tensorflow.framework.TensorShapeProto$Dim`"
  (^org.tensorflow.framework.TensorShapeProto$Dim [^TensorShapeProtoOrBuilder this ^Integer index]
    (-> this (.getDim index))))

(defn get-dim-count
  "Dimensions of the tensor, such as {\"input\", 30}, {\"output\", 40}
   for a 30 x 40 2D tensor.  If an entry has size -1, this
   corresponds to a dimension of unknown size. The names are
   optional.
   The order of entries in \"dim\" matters: It indicates the layout of the
   values in the tensor in-memory representation.
   The first entry in \"dim\" is the outermost dimension used to layout the
   values, the last entry is the innermost dimension.  This matches the
   in-memory layout of RowMajor Eigen tensors.
   If \"dim.size()\" > 0, \"unknown_rank\" must be false.
  repeated .tensorflow.TensorShapeProto.Dim dim = 2;

  returns: `int`"
  (^Integer [^TensorShapeProtoOrBuilder this]
    (-> this (.getDimCount))))

(defn get-dim-or-builder-list
  "Dimensions of the tensor, such as {\"input\", 30}, {\"output\", 40}
   for a 30 x 40 2D tensor.  If an entry has size -1, this
   corresponds to a dimension of unknown size. The names are
   optional.
   The order of entries in \"dim\" matters: It indicates the layout of the
   values in the tensor in-memory representation.
   The first entry in \"dim\" is the outermost dimension used to layout the
   values, the last entry is the innermost dimension.  This matches the
   in-memory layout of RowMajor Eigen tensors.
   If \"dim.size()\" > 0, \"unknown_rank\" must be false.
  repeated .tensorflow.TensorShapeProto.Dim dim = 2;

  returns: `java.util.List<? extends org.tensorflow.framework.TensorShapeProto$DimOrBuilder>`"
  ([^TensorShapeProtoOrBuilder this]
    (-> this (.getDimOrBuilderList))))

(defn get-dim-or-builder
  "Dimensions of the tensor, such as {\"input\", 30}, {\"output\", 40}
   for a 30 x 40 2D tensor.  If an entry has size -1, this
   corresponds to a dimension of unknown size. The names are
   optional.
   The order of entries in \"dim\" matters: It indicates the layout of the
   values in the tensor in-memory representation.
   The first entry in \"dim\" is the outermost dimension used to layout the
   values, the last entry is the innermost dimension.  This matches the
   in-memory layout of RowMajor Eigen tensors.
   If \"dim.size()\" > 0, \"unknown_rank\" must be false.
  repeated .tensorflow.TensorShapeProto.Dim dim = 2;

  index - `int`

  returns: `org.tensorflow.framework.TensorShapeProto$DimOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProto$DimOrBuilder [^TensorShapeProtoOrBuilder this ^Integer index]
    (-> this (.getDimOrBuilder index))))

(defn get-unknown-rank?
  "If true, the number of dimensions in the shape is unknown.
   If true, \"dim.size()\" must be 0.
  bool unknown_rank = 3;

  returns: `boolean`"
  (^Boolean [^TensorShapeProtoOrBuilder this]
    (-> this (.getUnknownRank))))

