(ns org.tensorflow.framework.AllocationDescription$Builder
  "Protobuf type tensorflow.AllocationDescription"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AllocationDescription$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (AllocationDescription$Builder/getDescriptor )))

(defn set-allocator-name
  "Name of the allocator used
  string allocator_name = 3;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this ^java.lang.String value]
    (-> this (.setAllocatorName value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.AllocationDescription`"
  (^org.tensorflow.framework.AllocationDescription [^AllocationDescription$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^AllocationDescription$Builder this]
    (-> this (.isInitialized))))

(defn get-allocated-bytes
  "Total number of bytes allocated if known
  int64 allocated_bytes = 2;

  returns: `long`"
  (^Long [^AllocationDescription$Builder this]
    (-> this (.getAllocatedBytes))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.AllocationDescription`"
  (^org.tensorflow.framework.AllocationDescription [^AllocationDescription$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-ptr
  "Address of the allocation.
  uint64 ptr = 6;

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this]
    (-> this (.clearPtr))))

(defn clear-has-single-reference
  "Set if this tensor only has one remaining reference
  bool has_single_reference = 5;

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this]
    (-> this (.clearHasSingleReference))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-allocation-id
  "Identifier of the allocated buffer if known
  int64 allocation_id = 4;

  returns: `long`"
  (^Long [^AllocationDescription$Builder this]
    (-> this (.getAllocationId))))

(defn get-has-single-reference?
  "Set if this tensor only has one remaining reference
  bool has_single_reference = 5;

  returns: `boolean`"
  (^Boolean [^AllocationDescription$Builder this]
    (-> this (.getHasSingleReference))))

(defn clear-requested-bytes
  "Total number of bytes requested
  int64 requested_bytes = 1;

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this]
    (-> this (.clearRequestedBytes))))

(defn clear-allocation-id
  "Identifier of the allocated buffer if known
  int64 allocation_id = 4;

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this]
    (-> this (.clearAllocationId))))

(defn set-has-single-reference
  "Set if this tensor only has one remaining reference
  bool has_single_reference = 5;

  value - `boolean`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this ^Boolean value]
    (-> this (.setHasSingleReference value))))

(defn clear-allocated-bytes
  "Total number of bytes allocated if known
  int64 allocated_bytes = 2;

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this]
    (-> this (.clearAllocatedBytes))))

(defn get-allocator-name
  "Name of the allocator used
  string allocator_name = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^AllocationDescription$Builder this]
    (-> this (.getAllocatorName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-allocator-name-bytes
  "Name of the allocator used
  string allocator_name = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^AllocationDescription$Builder this]
    (-> this (.getAllocatorNameBytes))))

(defn set-allocator-name-bytes
  "Name of the allocator used
  string allocator_name = 3;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setAllocatorNameBytes value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.AllocationDescription`"
  (^org.tensorflow.framework.AllocationDescription [^AllocationDescription$Builder this]
    (-> this (.build))))

(defn get-ptr
  "Address of the allocation.
  uint64 ptr = 6;

  returns: `long`"
  (^Long [^AllocationDescription$Builder this]
    (-> this (.getPtr))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn set-allocation-id
  "Identifier of the allocated buffer if known
  int64 allocation_id = 4;

  value - `long`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this ^Long value]
    (-> this (.setAllocationId value))))

(defn set-allocated-bytes
  "Total number of bytes allocated if known
  int64 allocated_bytes = 2;

  value - `long`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this ^Long value]
    (-> this (.setAllocatedBytes value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^AllocationDescription$Builder this]
    (-> this (.getDescriptorForType))))

(defn set-requested-bytes
  "Total number of bytes requested
  int64 requested_bytes = 1;

  value - `long`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this ^Long value]
    (-> this (.setRequestedBytes value))))

(defn clear
  "returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-ptr
  "Address of the allocation.
  uint64 ptr = 6;

  value - `long`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this ^Long value]
    (-> this (.setPtr value))))

(defn clear-allocator-name
  "Name of the allocator used
  string allocator_name = 3;

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^AllocationDescription$Builder this]
    (-> this (.clearAllocatorName))))

(defn get-requested-bytes
  "Total number of bytes requested
  int64 requested_bytes = 1;

  returns: `long`"
  (^Long [^AllocationDescription$Builder this]
    (-> this (.getRequestedBytes))))

