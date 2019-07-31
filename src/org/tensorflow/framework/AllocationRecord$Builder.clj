(ns org.tensorflow.framework.AllocationRecord$Builder
  " An allocation/de-allocation operation performed by the allocator.
 Protobuf type tensorflow.AllocationRecord"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AllocationRecord$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (AllocationRecord$Builder/getDescriptor )))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocationRecord$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.AllocationRecord`"
  (^org.tensorflow.framework.AllocationRecord [^AllocationRecord$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^AllocationRecord$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.AllocationRecord`"
  (^org.tensorflow.framework.AllocationRecord [^AllocationRecord$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocationRecord$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-alloc-micros
  "The timestamp of the operation.
  int64 alloc_micros = 1;

  returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocationRecord$Builder this]
    (-> this (.clearAllocMicros))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocationRecord$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocationRecord$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocationRecord$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.AllocationRecord`"
  (^org.tensorflow.framework.AllocationRecord [^AllocationRecord$Builder this]
    (-> this (.build))))

(defn clear-alloc-bytes
  "Number of bytes allocated, or de-allocated if negative.
  int64 alloc_bytes = 2;

  returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocationRecord$Builder this]
    (-> this (.clearAllocBytes))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.AllocationRecord$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocationRecord$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocationRecord$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocationRecord$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn set-alloc-bytes
  "Number of bytes allocated, or de-allocated if negative.
  int64 alloc_bytes = 2;

  value - `long`

  returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocationRecord$Builder this ^Long value]
    (-> this (.setAllocBytes value))))

(defn clone
  "returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocationRecord$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^AllocationRecord$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-alloc-bytes
  "Number of bytes allocated, or de-allocated if negative.
  int64 alloc_bytes = 2;

  returns: `long`"
  (^Long [^AllocationRecord$Builder this]
    (-> this (.getAllocBytes))))

(defn clear
  "returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocationRecord$Builder this]
    (-> this (.clear))))

(defn get-alloc-micros
  "The timestamp of the operation.
  int64 alloc_micros = 1;

  returns: `long`"
  (^Long [^AllocationRecord$Builder this]
    (-> this (.getAllocMicros))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocationRecord$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-alloc-micros
  "The timestamp of the operation.
  int64 alloc_micros = 1;

  value - `long`

  returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocationRecord$Builder this ^Long value]
    (-> this (.setAllocMicros value))))

