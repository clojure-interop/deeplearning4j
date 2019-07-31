(ns org.tensorflow.framework.TensorSliceProto$Builder
  " Can only be interpreted if you know the corresponding TensorShape.
 Protobuf type tensorflow.TensorSliceProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorSliceProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (TensorSliceProto$Builder/getDescriptor )))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorSliceProto$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn clear-extent
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  returns: `org.tensorflow.framework.TensorSliceProto$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto$Builder this]
    (-> this (.clearExtent))))

(defn build-partial
  "returns: `org.tensorflow.framework.TensorSliceProto`"
  (^org.tensorflow.framework.TensorSliceProto [^TensorSliceProto$Builder this]
    (-> this (.buildPartial))))

(defn get-extent-list
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  returns: `java.util.List<org.tensorflow.framework.TensorSliceProto$Extent>`"
  (^java.util.List [^TensorSliceProto$Builder this]
    (-> this (.getExtentList))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^TensorSliceProto$Builder this]
    (-> this (.isInitialized))))

(defn get-extent-or-builder
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  index - `int`

  returns: `org.tensorflow.framework.TensorSliceProto$ExtentOrBuilder`"
  (^org.tensorflow.framework.TensorSliceProto$ExtentOrBuilder [^TensorSliceProto$Builder this ^Integer index]
    (-> this (.getExtentOrBuilder index))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.TensorSliceProto`"
  (^org.tensorflow.framework.TensorSliceProto [^TensorSliceProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.TensorSliceProto$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-extent
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  index - `int`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent`"
  (^org.tensorflow.framework.TensorSliceProto$Extent [^TensorSliceProto$Builder this ^Integer index]
    (-> this (.getExtent index))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.TensorSliceProto$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-extent
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  index - `int`
  value - `org.tensorflow.framework.TensorSliceProto$Extent`

  returns: `org.tensorflow.framework.TensorSliceProto$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto$Builder this ^Integer index ^org.tensorflow.framework.TensorSliceProto$Extent value]
    (-> this (.setExtent index value))))

(defn get-extent-builder
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  index - `int`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Builder this ^Integer index]
    (-> this (.getExtentBuilder index))))

(defn remove-extent
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  index - `int`

  returns: `org.tensorflow.framework.TensorSliceProto$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto$Builder this ^Integer index]
    (-> this (.removeExtent index))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorSliceProto$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-extent-count
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  returns: `int`"
  (^Integer [^TensorSliceProto$Builder this]
    (-> this (.getExtentCount))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorSliceProto$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.TensorSliceProto`"
  (^org.tensorflow.framework.TensorSliceProto [^TensorSliceProto$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.TensorSliceProto$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn add-extent
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  index - `int`
  value - `org.tensorflow.framework.TensorSliceProto$Extent`

  returns: `org.tensorflow.framework.TensorSliceProto$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto$Builder this ^Integer index ^org.tensorflow.framework.TensorSliceProto$Extent value]
    (-> this (.addExtent index value)))
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto$Builder this ^org.tensorflow.framework.TensorSliceProto$Extent value]
    (-> this (.addExtent value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.TensorSliceProto$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.TensorSliceProto$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^TensorSliceProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn add-all-extent
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.TensorSliceProto$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto$Builder this ^java.lang.Iterable values]
    (-> this (.addAllExtent values))))

(defn clear
  "returns: `org.tensorflow.framework.TensorSliceProto$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.TensorSliceProto$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Builder [^TensorSliceProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-extent-builder-list
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  returns: `java.util.List<org.tensorflow.framework.TensorSliceProto$Extent$Builder>`"
  (^java.util.List [^TensorSliceProto$Builder this]
    (-> this (.getExtentBuilderList))))

(defn get-extent-or-builder-list
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.TensorSliceProto$ExtentOrBuilder>`"
  ([^TensorSliceProto$Builder this]
    (-> this (.getExtentOrBuilderList))))

(defn add-extent-builder
  "Extent of the slice in all tensor dimensions.
   Must have one entry for each of the dimension of the tensor that this
   slice belongs to.  The order of sizes is the same as the order of
   dimensions in the TensorShape.
  repeated .tensorflow.TensorSliceProto.Extent extent = 1;

  index - `int`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Builder this ^Integer index]
    (-> this (.addExtentBuilder index)))
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Builder this]
    (-> this (.addExtentBuilder))))

