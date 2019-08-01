(ns org.tensorflow.framework.MemoryLogTensorDeallocationOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryLogTensorDeallocationOrBuilder]))

(defn get-allocation-id
  "Id of the tensor buffer being deallocated, used to match to a
   corresponding allocation.
  int64 allocation_id = 1;

  returns: `long`"
  (^Long [^MemoryLogTensorDeallocationOrBuilder this]
    (-> this (.getAllocationId))))

(defn get-allocator-name
  "Name of the allocator used.
  string allocator_name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogTensorDeallocationOrBuilder this]
    (-> this (.getAllocatorName))))

(defn get-allocator-name-bytes
  "Name of the allocator used.
  string allocator_name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogTensorDeallocationOrBuilder this]
    (-> this (.getAllocatorNameBytes))))

