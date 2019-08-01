(ns org.tensorflow.framework.MemoryLogRawAllocationOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryLogRawAllocationOrBuilder]))

(defn get-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `long`"
  (^Long [^MemoryLogRawAllocationOrBuilder this]
    (-> this (.getStepId))))

(defn get-operation
  "Name of the operation making the allocation.
  string operation = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogRawAllocationOrBuilder this]
    (-> this (.getOperation))))

(defn get-operation-bytes
  "Name of the operation making the allocation.
  string operation = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogRawAllocationOrBuilder this]
    (-> this (.getOperationBytes))))

(defn get-num-bytes
  "Number of bytes in the allocation.
  int64 num_bytes = 3;

  returns: `long`"
  (^Long [^MemoryLogRawAllocationOrBuilder this]
    (-> this (.getNumBytes))))

(defn get-ptr
  "Address of the allocation.
  uint64 ptr = 4;

  returns: `long`"
  (^Long [^MemoryLogRawAllocationOrBuilder this]
    (-> this (.getPtr))))

(defn get-allocation-id
  "Id of the tensor buffer being allocated, used to match to a
   corresponding deallocation.
  int64 allocation_id = 5;

  returns: `long`"
  (^Long [^MemoryLogRawAllocationOrBuilder this]
    (-> this (.getAllocationId))))

(defn get-allocator-name
  "Name of the allocator used.
  string allocator_name = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogRawAllocationOrBuilder this]
    (-> this (.getAllocatorName))))

(defn get-allocator-name-bytes
  "Name of the allocator used.
  string allocator_name = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogRawAllocationOrBuilder this]
    (-> this (.getAllocatorNameBytes))))

