(ns org.tensorflow.framework.AllocatorMemoryUsed$Builder
  "Protobuf type tensorflow.AllocatorMemoryUsed"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AllocatorMemoryUsed$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (AllocatorMemoryUsed$Builder/getDescriptor )))

(defn set-allocator-name
  "string allocator_name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^java.lang.String value]
    (-> this (.setAllocatorName value))))

(defn set-allocation-records
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  index - `int`
  value - `org.tensorflow.framework.AllocationRecord`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^Integer index ^org.tensorflow.framework.AllocationRecord value]
    (-> this (.setAllocationRecords index value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.AllocatorMemoryUsed`"
  (^org.tensorflow.framework.AllocatorMemoryUsed [^AllocatorMemoryUsed$Builder this]
    (-> this (.buildPartial))))

(defn set-total-bytes
  "These are per-node allocator memory stats.
  int64 total_bytes = 2;

  value - `long`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^Long value]
    (-> this (.setTotalBytes value))))

(defn get-allocation-records
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  index - `int`

  returns: `org.tensorflow.framework.AllocationRecord`"
  (^org.tensorflow.framework.AllocationRecord [^AllocatorMemoryUsed$Builder this ^Integer index]
    (-> this (.getAllocationRecords index))))

(defn remove-allocation-records
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  index - `int`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^Integer index]
    (-> this (.removeAllocationRecords index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^AllocatorMemoryUsed$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.AllocatorMemoryUsed`"
  (^org.tensorflow.framework.AllocatorMemoryUsed [^AllocatorMemoryUsed$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-allocation-records-list
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  returns: `java.util.List<org.tensorflow.framework.AllocationRecord>`"
  (^java.util.List [^AllocatorMemoryUsed$Builder this]
    (-> this (.getAllocationRecordsList))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-allocation-records-builder-list
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  returns: `java.util.List<org.tensorflow.framework.AllocationRecord$Builder>`"
  (^java.util.List [^AllocatorMemoryUsed$Builder this]
    (-> this (.getAllocationRecordsBuilderList))))

(defn get-live-bytes
  "The bytes that are not deallocated.
  int64 live_bytes = 4;

  returns: `long`"
  (^Long [^AllocatorMemoryUsed$Builder this]
    (-> this (.getLiveBytes))))

(defn get-allocation-records-builder
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  index - `int`

  returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocatorMemoryUsed$Builder this ^Integer index]
    (-> this (.getAllocationRecordsBuilder index))))

(defn set-allocator-bytes-in-use
  "These are snapshots of the overall allocator memory stats.
   The number of live bytes currently allocated by the allocator.
  int64 allocator_bytes_in_use = 5;

  value - `long`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^Long value]
    (-> this (.setAllocatorBytesInUse value))))

(defn get-allocation-records-count
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  returns: `int`"
  (^Integer [^AllocatorMemoryUsed$Builder this]
    (-> this (.getAllocationRecordsCount))))

(defn get-allocator-name
  "string allocator_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^AllocatorMemoryUsed$Builder this]
    (-> this (.getAllocatorName))))

(defn add-allocation-records-builder
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  index - `int`

  returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocatorMemoryUsed$Builder this ^Integer index]
    (-> this (.addAllocationRecordsBuilder index)))
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocatorMemoryUsed$Builder this]
    (-> this (.addAllocationRecordsBuilder))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-allocator-name-bytes
  "string allocator_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^AllocatorMemoryUsed$Builder this]
    (-> this (.getAllocatorNameBytes))))

(defn get-allocation-records-or-builder-list
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  returns: `java.util.List<? extends org.tensorflow.framework.AllocationRecordOrBuilder>`"
  ([^AllocatorMemoryUsed$Builder this]
    (-> this (.getAllocationRecordsOrBuilderList))))

(defn set-allocator-name-bytes
  "string allocator_name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setAllocatorNameBytes value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.AllocatorMemoryUsed`"
  (^org.tensorflow.framework.AllocatorMemoryUsed [^AllocatorMemoryUsed$Builder this]
    (-> this (.build))))

(defn get-total-bytes
  "These are per-node allocator memory stats.
  int64 total_bytes = 2;

  returns: `long`"
  (^Long [^AllocatorMemoryUsed$Builder this]
    (-> this (.getTotalBytes))))

(defn get-allocator-bytes-in-use
  "These are snapshots of the overall allocator memory stats.
   The number of live bytes currently allocated by the allocator.
  int64 allocator_bytes_in_use = 5;

  returns: `long`"
  (^Long [^AllocatorMemoryUsed$Builder this]
    (-> this (.getAllocatorBytesInUse))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn add-allocation-records
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  index - `int`
  value - `org.tensorflow.framework.AllocationRecord`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^Integer index ^org.tensorflow.framework.AllocationRecord value]
    (-> this (.addAllocationRecords index value)))
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^org.tensorflow.framework.AllocationRecord value]
    (-> this (.addAllocationRecords value))))

(defn set-peak-bytes
  "int64 peak_bytes = 3;

  value - `long`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^Long value]
    (-> this (.setPeakBytes value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clear-peak-bytes
  "int64 peak_bytes = 3;

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this]
    (-> this (.clearPeakBytes))))

(defn clear-live-bytes
  "The bytes that are not deallocated.
  int64 live_bytes = 4;

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this]
    (-> this (.clearLiveBytes))))

(defn clone
  "returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^AllocatorMemoryUsed$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this]
    (-> this (.clear))))

(defn set-live-bytes
  "The bytes that are not deallocated.
  int64 live_bytes = 4;

  value - `long`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^Long value]
    (-> this (.setLiveBytes value))))

(defn clear-allocation-records
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this]
    (-> this (.clearAllocationRecords))))

(defn get-peak-bytes
  "int64 peak_bytes = 3;

  returns: `long`"
  (^Long [^AllocatorMemoryUsed$Builder this]
    (-> this (.getPeakBytes))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-allocation-records-or-builder
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  index - `int`

  returns: `org.tensorflow.framework.AllocationRecordOrBuilder`"
  (^org.tensorflow.framework.AllocationRecordOrBuilder [^AllocatorMemoryUsed$Builder this ^Integer index]
    (-> this (.getAllocationRecordsOrBuilder index))))

(defn clear-total-bytes
  "These are per-node allocator memory stats.
  int64 total_bytes = 2;

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this]
    (-> this (.clearTotalBytes))))

(defn clear-allocator-bytes-in-use
  "These are snapshots of the overall allocator memory stats.
   The number of live bytes currently allocated by the allocator.
  int64 allocator_bytes_in_use = 5;

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this]
    (-> this (.clearAllocatorBytesInUse))))

(defn add-all-allocation-records
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this ^java.lang.Iterable values]
    (-> this (.addAllAllocationRecords values))))

(defn clear-allocator-name
  "string allocator_name = 1;

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed$Builder this]
    (-> this (.clearAllocatorName))))

