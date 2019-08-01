(ns org.tensorflow.framework.AllocatorMemoryUsedOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AllocatorMemoryUsedOrBuilder]))

(defn get-allocation-records
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  index - `int`

  returns: `org.tensorflow.framework.AllocationRecord`"
  (^org.tensorflow.framework.AllocationRecord [^AllocatorMemoryUsedOrBuilder this ^Integer index]
    (-> this (.getAllocationRecords index))))

(defn get-allocation-records-list
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  returns: `java.util.List<org.tensorflow.framework.AllocationRecord>`"
  (^java.util.List [^AllocatorMemoryUsedOrBuilder this]
    (-> this (.getAllocationRecordsList))))

(defn get-live-bytes
  "The bytes that are not deallocated.
  int64 live_bytes = 4;

  returns: `long`"
  (^Long [^AllocatorMemoryUsedOrBuilder this]
    (-> this (.getLiveBytes))))

(defn get-allocation-records-count
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  returns: `int`"
  (^Integer [^AllocatorMemoryUsedOrBuilder this]
    (-> this (.getAllocationRecordsCount))))

(defn get-allocator-name
  "string allocator_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^AllocatorMemoryUsedOrBuilder this]
    (-> this (.getAllocatorName))))

(defn get-allocator-name-bytes
  "string allocator_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^AllocatorMemoryUsedOrBuilder this]
    (-> this (.getAllocatorNameBytes))))

(defn get-allocation-records-or-builder-list
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  returns: `java.util.List<? extends org.tensorflow.framework.AllocationRecordOrBuilder>`"
  ([^AllocatorMemoryUsedOrBuilder this]
    (-> this (.getAllocationRecordsOrBuilderList))))

(defn get-total-bytes
  "These are per-node allocator memory stats.
  int64 total_bytes = 2;

  returns: `long`"
  (^Long [^AllocatorMemoryUsedOrBuilder this]
    (-> this (.getTotalBytes))))

(defn get-allocator-bytes-in-use
  "These are snapshots of the overall allocator memory stats.
   The number of live bytes currently allocated by the allocator.
  int64 allocator_bytes_in_use = 5;

  returns: `long`"
  (^Long [^AllocatorMemoryUsedOrBuilder this]
    (-> this (.getAllocatorBytesInUse))))

(defn get-peak-bytes
  "int64 peak_bytes = 3;

  returns: `long`"
  (^Long [^AllocatorMemoryUsedOrBuilder this]
    (-> this (.getPeakBytes))))

(defn get-allocation-records-or-builder
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  index - `int`

  returns: `org.tensorflow.framework.AllocationRecordOrBuilder`"
  (^org.tensorflow.framework.AllocationRecordOrBuilder [^AllocatorMemoryUsedOrBuilder this ^Integer index]
    (-> this (.getAllocationRecordsOrBuilder index))))

