(ns org.tensorflow.framework.AllocatorMemoryUsed
  "Protobuf type tensorflow.AllocatorMemoryUsed"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AllocatorMemoryUsed]))

(def *-allocator-name-field-number
  "Static Constant.

  type: int"
  AllocatorMemoryUsed/ALLOCATOR_NAME_FIELD_NUMBER)

(def *-total-bytes-field-number
  "Static Constant.

  type: int"
  AllocatorMemoryUsed/TOTAL_BYTES_FIELD_NUMBER)

(def *-peak-bytes-field-number
  "Static Constant.

  type: int"
  AllocatorMemoryUsed/PEAK_BYTES_FIELD_NUMBER)

(def *-live-bytes-field-number
  "Static Constant.

  type: int"
  AllocatorMemoryUsed/LIVE_BYTES_FIELD_NUMBER)

(def *-allocation-records-field-number
  "Static Constant.

  type: int"
  AllocatorMemoryUsed/ALLOCATION_RECORDS_FIELD_NUMBER)

(def *-allocator-bytes-in-use-field-number
  "Static Constant.

  type: int"
  AllocatorMemoryUsed/ALLOCATOR_BYTES_IN_USE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (AllocatorMemoryUsed/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.AllocatorMemoryUsed [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (AllocatorMemoryUsed/parseFrom data extension-registry))
  (^org.tensorflow.framework.AllocatorMemoryUsed [^java.nio.ByteBuffer data]
    (AllocatorMemoryUsed/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed`

  throws: java.io.IOException"
  (^org.tensorflow.framework.AllocatorMemoryUsed [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (AllocatorMemoryUsed/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.AllocatorMemoryUsed [^java.io.InputStream input]
    (AllocatorMemoryUsed/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.AllocatorMemoryUsed`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^org.tensorflow.framework.AllocatorMemoryUsed prototype]
    (AllocatorMemoryUsed/newBuilder prototype))
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder []
    (AllocatorMemoryUsed/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.AllocatorMemoryUsed`"
  (^org.tensorflow.framework.AllocatorMemoryUsed []
    (AllocatorMemoryUsed/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.AllocatorMemoryUsed>`"
  (^com.github.os72.protobuf351.Parser []
    (AllocatorMemoryUsed/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^AllocatorMemoryUsed this]
    (-> this (.getUnknownFields))))

(defn get-allocation-records
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  index - `int`

  returns: `org.tensorflow.framework.AllocationRecord`"
  (^org.tensorflow.framework.AllocationRecord [^AllocatorMemoryUsed this ^Integer index]
    (-> this (.getAllocationRecords index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^AllocatorMemoryUsed this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.AllocatorMemoryUsed`"
  (^org.tensorflow.framework.AllocatorMemoryUsed [^AllocatorMemoryUsed this]
    (-> this (.getDefaultInstanceForType))))

(defn get-allocation-records-list
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  returns: `java.util.List<org.tensorflow.framework.AllocationRecord>`"
  (^java.util.List [^AllocatorMemoryUsed this]
    (-> this (.getAllocationRecordsList))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^AllocatorMemoryUsed this]
    (-> this (.getSerializedSize))))

(defn get-live-bytes
  "The bytes that are not deallocated.
  int64 live_bytes = 4;

  returns: `long`"
  (^Long [^AllocatorMemoryUsed this]
    (-> this (.getLiveBytes))))

(defn get-allocation-records-count
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  returns: `int`"
  (^Integer [^AllocatorMemoryUsed this]
    (-> this (.getAllocationRecordsCount))))

(defn get-allocator-name
  "string allocator_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^AllocatorMemoryUsed this]
    (-> this (.getAllocatorName))))

(defn get-allocator-name-bytes
  "string allocator_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^AllocatorMemoryUsed this]
    (-> this (.getAllocatorNameBytes))))

(defn get-allocation-records-or-builder-list
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  returns: `java.util.List<? extends org.tensorflow.framework.AllocationRecordOrBuilder>`"
  ([^AllocatorMemoryUsed this]
    (-> this (.getAllocationRecordsOrBuilderList))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^AllocatorMemoryUsed this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-total-bytes
  "These are per-node allocator memory stats.
  int64 total_bytes = 2;

  returns: `long`"
  (^Long [^AllocatorMemoryUsed this]
    (-> this (.getTotalBytes))))

(defn get-allocator-bytes-in-use
  "These are snapshots of the overall allocator memory stats.
   The number of live bytes currently allocated by the allocator.
  int64 allocator_bytes_in_use = 5;

  returns: `long`"
  (^Long [^AllocatorMemoryUsed this]
    (-> this (.getAllocatorBytesInUse))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AllocatorMemoryUsed this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.AllocatorMemoryUsed>`"
  (^com.github.os72.protobuf351.Parser [^AllocatorMemoryUsed this]
    (-> this (.getParserForType))))

(defn get-peak-bytes
  "int64 peak_bytes = 3;

  returns: `long`"
  (^Long [^AllocatorMemoryUsed this]
    (-> this (.getPeakBytes))))

(defn get-allocation-records-or-builder
  "The allocation and deallocation timeline.
  repeated .tensorflow.AllocationRecord allocation_records = 6;

  index - `int`

  returns: `org.tensorflow.framework.AllocationRecordOrBuilder`"
  (^org.tensorflow.framework.AllocationRecordOrBuilder [^AllocatorMemoryUsed this ^Integer index]
    (-> this (.getAllocationRecordsOrBuilder index))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AllocatorMemoryUsed this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^AllocatorMemoryUsed this]
    (-> this (.toBuilder))))

