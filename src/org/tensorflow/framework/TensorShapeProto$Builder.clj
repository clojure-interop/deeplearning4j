(ns org.tensorflow.framework.TensorShapeProto$Builder
  " Dimensions of a tensor.
 Protobuf type tensorflow.TensorShapeProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorShapeProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (TensorShapeProto$Builder/getDescriptor )))

(defn set-dim
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
  value - `org.tensorflow.framework.TensorShapeProto$Dim`

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this ^Integer index ^org.tensorflow.framework.TensorShapeProto$Dim value]
    (-> this (.setDim index value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^TensorShapeProto$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^TensorShapeProto$Builder this]
    (-> this (.isInitialized))))

(defn get-dim-builder
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

  returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Builder this ^Integer index]
    (-> this (.getDimBuilder index))))

(defn set-unknown-rank
  "If true, the number of dimensions in the shape is unknown.
   If true, \"dim.size()\" must be 0.
  bool unknown_rank = 3;

  value - `boolean`

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this ^Boolean value]
    (-> this (.setUnknownRank value))))

(defn get-dim-builder-list
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

  returns: `java.util.List<org.tensorflow.framework.TensorShapeProto$Dim$Builder>`"
  (^java.util.List [^TensorShapeProto$Builder this]
    (-> this (.getDimBuilderList))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^TensorShapeProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

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
  (^org.tensorflow.framework.TensorShapeProto$Dim [^TensorShapeProto$Builder this ^Integer index]
    (-> this (.getDim index))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn add-all-dim
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

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllDim values))))

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
  (^org.tensorflow.framework.TensorShapeProto$DimOrBuilder [^TensorShapeProto$Builder this ^Integer index]
    (-> this (.getDimOrBuilder index))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

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
  (^java.util.List [^TensorShapeProto$Builder this]
    (-> this (.getDimList))))

(defn build
  "returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^TensorShapeProto$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-unknown-rank?
  "If true, the number of dimensions in the shape is unknown.
   If true, \"dim.size()\" must be 0.
  bool unknown_rank = 3;

  returns: `boolean`"
  (^Boolean [^TensorShapeProto$Builder this]
    (-> this (.getUnknownRank))))

(defn clear-unknown-rank
  "If true, the number of dimensions in the shape is unknown.
   If true, \"dim.size()\" must be 0.
  bool unknown_rank = 3;

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this]
    (-> this (.clearUnknownRank))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^TensorShapeProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn add-dim
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
  value - `org.tensorflow.framework.TensorShapeProto$Dim`

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this ^Integer index ^org.tensorflow.framework.TensorShapeProto$Dim value]
    (-> this (.addDim index value)))
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this ^org.tensorflow.framework.TensorShapeProto$Dim value]
    (-> this (.addDim value))))

(defn clear
  "returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn remove-dim
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

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this ^Integer index]
    (-> this (.removeDim index))))

(defn clear-dim
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

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto$Builder this]
    (-> this (.clearDim))))

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
  ([^TensorShapeProto$Builder this]
    (-> this (.getDimOrBuilderList))))

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
  (^Integer [^TensorShapeProto$Builder this]
    (-> this (.getDimCount))))

(defn add-dim-builder
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

  returns: `org.tensorflow.framework.TensorShapeProto$Dim$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Builder this ^Integer index]
    (-> this (.addDimBuilder index)))
  (^org.tensorflow.framework.TensorShapeProto$Dim$Builder [^TensorShapeProto$Builder this]
    (-> this (.addDimBuilder))))

