(ns org.tensorflow.framework.TensorShapeProto
  " Dimensions of a tensor.
 Protobuf type tensorflow.TensorShapeProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorShapeProto]))

(def *-dim-field-number
  "Static Constant.

  type: int"
  TensorShapeProto/DIM_FIELD_NUMBER)

(def *-unknown-rank-field-number
  "Static Constant.

  type: int"
  TensorShapeProto/UNKNOWN_RANK_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (TensorShapeProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.TensorShapeProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.TensorShapeProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (TensorShapeProto/parseFrom data extension-registry))
  (^org.tensorflow.framework.TensorShapeProto [^java.nio.ByteBuffer data]
    (TensorShapeProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.TensorShapeProto`

  throws: java.io.IOException"
  (^org.tensorflow.framework.TensorShapeProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (TensorShapeProto/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.TensorShapeProto [^java.io.InputStream input]
    (TensorShapeProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.TensorShapeProto`

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^org.tensorflow.framework.TensorShapeProto prototype]
    (TensorShapeProto/newBuilder prototype))
  (^org.tensorflow.framework.TensorShapeProto$Builder []
    (TensorShapeProto/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto []
    (TensorShapeProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.TensorShapeProto>`"
  (^com.github.os72.protobuf351.Parser []
    (TensorShapeProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^TensorShapeProto this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^TensorShapeProto this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^TensorShapeProto this]
    (-> this (.getDefaultInstanceForType))))

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
  (^org.tensorflow.framework.TensorShapeProto$Dim [^TensorShapeProto this ^Integer index]
    (-> this (.getDim index))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^TensorShapeProto this]
    (-> this (.getSerializedSize))))

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
  (^org.tensorflow.framework.TensorShapeProto$DimOrBuilder [^TensorShapeProto this ^Integer index]
    (-> this (.getDimOrBuilder index))))

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
  (^java.util.List [^TensorShapeProto this]
    (-> this (.getDimList))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^TensorShapeProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-unknown-rank?
  "If true, the number of dimensions in the shape is unknown.
   If true, \"dim.size()\" must be 0.
  bool unknown_rank = 3;

  returns: `boolean`"
  (^Boolean [^TensorShapeProto this]
    (-> this (.getUnknownRank))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TensorShapeProto this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.TensorShapeProto>`"
  (^com.github.os72.protobuf351.Parser [^TensorShapeProto this]
    (-> this (.getParserForType))))

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
  ([^TensorShapeProto this]
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
  (^Integer [^TensorShapeProto this]
    (-> this (.getDimCount))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TensorShapeProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^TensorShapeProto this]
    (-> this (.toBuilder))))

