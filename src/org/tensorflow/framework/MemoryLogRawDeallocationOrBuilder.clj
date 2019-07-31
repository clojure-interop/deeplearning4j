(ns org.tensorflow.framework.MemoryLogRawDeallocationOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryLogRawDeallocationOrBuilder]))

(defn get-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `long`"
  (^Long [^MemoryLogRawDeallocationOrBuilder this]
    (-> this (.getStepId))))

(defn get-operation
  "Name of the operation making the deallocation.
  string operation = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogRawDeallocationOrBuilder this]
    (-> this (.getOperation))))

(defn get-operation-bytes
  "Name of the operation making the deallocation.
  string operation = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogRawDeallocationOrBuilder this]
    (-> this (.getOperationBytes))))

(defn get-allocation-id
  "Id of the tensor buffer being deallocated, used to match to a
   corresponding allocation.
  int64 allocation_id = 3;

  returns: `long`"
  (^Long [^MemoryLogRawDeallocationOrBuilder this]
    (-> this (.getAllocationId))))

(defn get-allocator-name
  "Name of the allocator used.
  string allocator_name = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogRawDeallocationOrBuilder this]
    (-> this (.getAllocatorName))))

(defn get-allocator-name-bytes
  "Name of the allocator used.
  string allocator_name = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogRawDeallocationOrBuilder this]
    (-> this (.getAllocatorNameBytes))))

(defn get-deferred?
  "True if the deallocation is queued and will be performed later,
   e.g. for GPU lazy freeing of buffers.
  bool deferred = 5;

  returns: `boolean`"
  (^Boolean [^MemoryLogRawDeallocationOrBuilder this]
    (-> this (.getDeferred))))

