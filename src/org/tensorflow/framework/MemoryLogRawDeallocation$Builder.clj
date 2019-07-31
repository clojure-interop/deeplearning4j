(ns org.tensorflow.framework.MemoryLogRawDeallocation$Builder
  "Protobuf type tensorflow.MemoryLogRawDeallocation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryLogRawDeallocation$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (MemoryLogRawDeallocation$Builder/getDescriptor )))

(defn set-deferred
  "True if the deallocation is queued and will be performed later,
   e.g. for GPU lazy freeing of buffers.
  bool deferred = 5;

  value - `boolean`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this ^Boolean value]
    (-> this (.setDeferred value))))

(defn set-allocator-name
  "Name of the allocator used.
  string allocator_name = 4;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this ^java.lang.String value]
    (-> this (.setAllocatorName value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.MemoryLogRawDeallocation`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation [^MemoryLogRawDeallocation$Builder this]
    (-> this (.buildPartial))))

(defn set-operation
  "Name of the operation making the deallocation.
  string operation = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this ^java.lang.String value]
    (-> this (.setOperation value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^MemoryLogRawDeallocation$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.MemoryLogRawDeallocation`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation [^MemoryLogRawDeallocation$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-deferred?
  "True if the deallocation is queued and will be performed later,
   e.g. for GPU lazy freeing of buffers.
  bool deferred = 5;

  returns: `boolean`"
  (^Boolean [^MemoryLogRawDeallocation$Builder this]
    (-> this (.getDeferred))))

(defn get-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `long`"
  (^Long [^MemoryLogRawDeallocation$Builder this]
    (-> this (.getStepId))))

(defn clear-deferred
  "True if the deallocation is queued and will be performed later,
   e.g. for GPU lazy freeing of buffers.
  bool deferred = 5;

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this]
    (-> this (.clearDeferred))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-allocation-id
  "Id of the tensor buffer being deallocated, used to match to a
   corresponding allocation.
  int64 allocation_id = 3;

  returns: `long`"
  (^Long [^MemoryLogRawDeallocation$Builder this]
    (-> this (.getAllocationId))))

(defn clear-operation
  "Name of the operation making the deallocation.
  string operation = 2;

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this]
    (-> this (.clearOperation))))

(defn clear-allocation-id
  "Id of the tensor buffer being deallocated, used to match to a
   corresponding allocation.
  int64 allocation_id = 3;

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this]
    (-> this (.clearAllocationId))))

(defn get-operation-bytes
  "Name of the operation making the deallocation.
  string operation = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogRawDeallocation$Builder this]
    (-> this (.getOperationBytes))))

(defn get-allocator-name
  "Name of the allocator used.
  string allocator_name = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogRawDeallocation$Builder this]
    (-> this (.getAllocatorName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-allocator-name-bytes
  "Name of the allocator used.
  string allocator_name = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogRawDeallocation$Builder this]
    (-> this (.getAllocatorNameBytes))))

(defn set-allocator-name-bytes
  "Name of the allocator used.
  string allocator_name = 4;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setAllocatorNameBytes value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.MemoryLogRawDeallocation`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation [^MemoryLogRawDeallocation$Builder this]
    (-> this (.build))))

(defn clear-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this]
    (-> this (.clearStepId))))

(defn set-step-id
  "Process-unique step id.
  int64 step_id = 1;

  value - `long`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this ^Long value]
    (-> this (.setStepId value))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn set-allocation-id
  "Id of the tensor buffer being deallocated, used to match to a
   corresponding allocation.
  int64 allocation_id = 3;

  value - `long`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this ^Long value]
    (-> this (.setAllocationId value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^MemoryLogRawDeallocation$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this]
    (-> this (.clear))))

(defn get-operation
  "Name of the operation making the deallocation.
  string operation = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogRawDeallocation$Builder this]
    (-> this (.getOperation))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-operation-bytes
  "Name of the operation making the deallocation.
  string operation = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setOperationBytes value))))

(defn clear-allocator-name
  "Name of the allocator used.
  string allocator_name = 4;

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation$Builder this]
    (-> this (.clearAllocatorName))))

