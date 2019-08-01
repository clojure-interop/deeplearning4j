(ns org.tensorflow.framework.MemoryLogRawAllocation$Builder
  "Protobuf type tensorflow.MemoryLogRawAllocation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryLogRawAllocation$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (MemoryLogRawAllocation$Builder/getDescriptor )))

(defn set-allocator-name
  "Name of the allocator used.
  string allocator_name = 6;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this ^java.lang.String value]
    (-> this (.setAllocatorName value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.MemoryLogRawAllocation`"
  (^org.tensorflow.framework.MemoryLogRawAllocation [^MemoryLogRawAllocation$Builder this]
    (-> this (.buildPartial))))

(defn set-operation
  "Name of the operation making the allocation.
  string operation = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this ^java.lang.String value]
    (-> this (.setOperation value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^MemoryLogRawAllocation$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.MemoryLogRawAllocation`"
  (^org.tensorflow.framework.MemoryLogRawAllocation [^MemoryLogRawAllocation$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-ptr
  "Address of the allocation.
  uint64 ptr = 4;

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this]
    (-> this (.clearPtr))))

(defn get-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `long`"
  (^Long [^MemoryLogRawAllocation$Builder this]
    (-> this (.getStepId))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-allocation-id
  "Id of the tensor buffer being allocated, used to match to a
   corresponding deallocation.
  int64 allocation_id = 5;

  returns: `long`"
  (^Long [^MemoryLogRawAllocation$Builder this]
    (-> this (.getAllocationId))))

(defn clear-operation
  "Name of the operation making the allocation.
  string operation = 2;

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this]
    (-> this (.clearOperation))))

(defn clear-allocation-id
  "Id of the tensor buffer being allocated, used to match to a
   corresponding deallocation.
  int64 allocation_id = 5;

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this]
    (-> this (.clearAllocationId))))

(defn get-operation-bytes
  "Name of the operation making the allocation.
  string operation = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogRawAllocation$Builder this]
    (-> this (.getOperationBytes))))

(defn get-allocator-name
  "Name of the allocator used.
  string allocator_name = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogRawAllocation$Builder this]
    (-> this (.getAllocatorName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-allocator-name-bytes
  "Name of the allocator used.
  string allocator_name = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogRawAllocation$Builder this]
    (-> this (.getAllocatorNameBytes))))

(defn set-allocator-name-bytes
  "Name of the allocator used.
  string allocator_name = 6;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setAllocatorNameBytes value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.MemoryLogRawAllocation`"
  (^org.tensorflow.framework.MemoryLogRawAllocation [^MemoryLogRawAllocation$Builder this]
    (-> this (.build))))

(defn get-ptr
  "Address of the allocation.
  uint64 ptr = 4;

  returns: `long`"
  (^Long [^MemoryLogRawAllocation$Builder this]
    (-> this (.getPtr))))

(defn set-num-bytes
  "Number of bytes in the allocation.
  int64 num_bytes = 3;

  value - `long`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this ^Long value]
    (-> this (.setNumBytes value))))

(defn clear-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this]
    (-> this (.clearStepId))))

(defn set-step-id
  "Process-unique step id.
  int64 step_id = 1;

  value - `long`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this ^Long value]
    (-> this (.setStepId value))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn set-allocation-id
  "Id of the tensor buffer being allocated, used to match to a
   corresponding deallocation.
  int64 allocation_id = 5;

  value - `long`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this ^Long value]
    (-> this (.setAllocationId value))))

(defn get-num-bytes
  "Number of bytes in the allocation.
  int64 num_bytes = 3;

  returns: `long`"
  (^Long [^MemoryLogRawAllocation$Builder this]
    (-> this (.getNumBytes))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^MemoryLogRawAllocation$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this]
    (-> this (.clear))))

(defn get-operation
  "Name of the operation making the allocation.
  string operation = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogRawAllocation$Builder this]
    (-> this (.getOperation))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn clear-num-bytes
  "Number of bytes in the allocation.
  int64 num_bytes = 3;

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this]
    (-> this (.clearNumBytes))))

(defn set-ptr
  "Address of the allocation.
  uint64 ptr = 4;

  value - `long`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this ^Long value]
    (-> this (.setPtr value))))

(defn set-operation-bytes
  "Name of the operation making the allocation.
  string operation = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setOperationBytes value))))

(defn clear-allocator-name
  "Name of the allocator used.
  string allocator_name = 6;

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation$Builder this]
    (-> this (.clearAllocatorName))))

