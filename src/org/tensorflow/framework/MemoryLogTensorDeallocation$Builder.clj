(ns org.tensorflow.framework.MemoryLogTensorDeallocation$Builder
  "Protobuf type tensorflow.MemoryLogTensorDeallocation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryLogTensorDeallocation$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (MemoryLogTensorDeallocation$Builder/getDescriptor )))

(defn set-allocator-name
  "Name of the allocator used.
  string allocator_name = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation$Builder this ^java.lang.String value]
    (-> this (.setAllocatorName value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.MemoryLogTensorDeallocation`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation [^MemoryLogTensorDeallocation$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^MemoryLogTensorDeallocation$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.MemoryLogTensorDeallocation`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation [^MemoryLogTensorDeallocation$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-allocation-id
  "Id of the tensor buffer being deallocated, used to match to a
   corresponding allocation.
  int64 allocation_id = 1;

  returns: `long`"
  (^Long [^MemoryLogTensorDeallocation$Builder this]
    (-> this (.getAllocationId))))

(defn clear-allocation-id
  "Id of the tensor buffer being deallocated, used to match to a
   corresponding allocation.
  int64 allocation_id = 1;

  returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation$Builder this]
    (-> this (.clearAllocationId))))

(defn get-allocator-name
  "Name of the allocator used.
  string allocator_name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogTensorDeallocation$Builder this]
    (-> this (.getAllocatorName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-allocator-name-bytes
  "Name of the allocator used.
  string allocator_name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogTensorDeallocation$Builder this]
    (-> this (.getAllocatorNameBytes))))

(defn set-allocator-name-bytes
  "Name of the allocator used.
  string allocator_name = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setAllocatorNameBytes value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.MemoryLogTensorDeallocation`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation [^MemoryLogTensorDeallocation$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn set-allocation-id
  "Id of the tensor buffer being deallocated, used to match to a
   corresponding allocation.
  int64 allocation_id = 1;

  value - `long`

  returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation$Builder this ^Long value]
    (-> this (.setAllocationId value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^MemoryLogTensorDeallocation$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn clear-allocator-name
  "Name of the allocator used.
  string allocator_name = 2;

  returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation$Builder this]
    (-> this (.clearAllocatorName))))

