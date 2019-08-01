(ns org.tensorflow.framework.AllocationDescriptionOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AllocationDescriptionOrBuilder]))

(defn get-requested-bytes
  "Total number of bytes requested
  int64 requested_bytes = 1;

  returns: `long`"
  (^Long [^AllocationDescriptionOrBuilder this]
    (-> this (.getRequestedBytes))))

(defn get-allocated-bytes
  "Total number of bytes allocated if known
  int64 allocated_bytes = 2;

  returns: `long`"
  (^Long [^AllocationDescriptionOrBuilder this]
    (-> this (.getAllocatedBytes))))

(defn get-allocator-name
  "Name of the allocator used
  string allocator_name = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^AllocationDescriptionOrBuilder this]
    (-> this (.getAllocatorName))))

(defn get-allocator-name-bytes
  "Name of the allocator used
  string allocator_name = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^AllocationDescriptionOrBuilder this]
    (-> this (.getAllocatorNameBytes))))

(defn get-allocation-id
  "Identifier of the allocated buffer if known
  int64 allocation_id = 4;

  returns: `long`"
  (^Long [^AllocationDescriptionOrBuilder this]
    (-> this (.getAllocationId))))

(defn get-has-single-reference?
  "Set if this tensor only has one remaining reference
  bool has_single_reference = 5;

  returns: `boolean`"
  (^Boolean [^AllocationDescriptionOrBuilder this]
    (-> this (.getHasSingleReference))))

(defn get-ptr
  "Address of the allocation.
  uint64 ptr = 6;

  returns: `long`"
  (^Long [^AllocationDescriptionOrBuilder this]
    (-> this (.getPtr))))

