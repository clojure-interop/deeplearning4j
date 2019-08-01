(ns org.tensorflow.framework.TensorSliceProto$Extent$Builder
  " Extent of the slice in one dimension.
 Protobuf type tensorflow.TensorSliceProto.Extent"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorSliceProto$Extent$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (TensorSliceProto$Extent$Builder/getDescriptor )))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.TensorSliceProto$Extent`"
  (^org.tensorflow.framework.TensorSliceProto$Extent [^TensorSliceProto$Extent$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^TensorSliceProto$Extent$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.TensorSliceProto$Extent`"
  (^org.tensorflow.framework.TensorSliceProto$Extent [^TensorSliceProto$Extent$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn clear-start
  "Start index of the slice, starting at 0.
  int64 start = 1;

  returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent$Builder this]
    (-> this (.clearStart))))

(defn set-length
  "int64 length = 2;

  value - `long`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent$Builder this ^Long value]
    (-> this (.setLength value))))

(defn clear-has-length
  "returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent$Builder this]
    (-> this (.clearHasLength))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn clear-length
  "int64 length = 2;

  returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent$Builder this]
    (-> this (.clearLength))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.TensorSliceProto$Extent`"
  (^org.tensorflow.framework.TensorSliceProto$Extent [^TensorSliceProto$Extent$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-length
  "int64 length = 2;

  returns: `long`"
  (^Long [^TensorSliceProto$Extent$Builder this]
    (-> this (.getLength))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^TensorSliceProto$Extent$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-start
  "Start index of the slice, starting at 0.
  int64 start = 1;

  returns: `long`"
  (^Long [^TensorSliceProto$Extent$Builder this]
    (-> this (.getStart))))

(defn clear
  "returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent$Builder this]
    (-> this (.clear))))

(defn set-start
  "Start index of the slice, starting at 0.
  int64 start = 1;

  value - `long`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent$Builder this ^Long value]
    (-> this (.setStart value))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent$Builder`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$Builder [^TensorSliceProto$Extent$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-has-length-case
  "returns: `org.tensorflow.framework.TensorSliceProto$Extent$HasLengthCase`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$HasLengthCase [^TensorSliceProto$Extent$Builder this]
    (-> this (.getHasLengthCase))))

