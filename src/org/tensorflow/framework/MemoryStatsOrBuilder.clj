(ns org.tensorflow.framework.MemoryStatsOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryStatsOrBuilder]))

(defn get-host-persistent-tensor-alloc-ids-list
  "repeated int64 host_persistent_tensor_alloc_ids = 5;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^MemoryStatsOrBuilder this]
    (-> this (.getHostPersistentTensorAllocIdsList))))

(defn get-device-persistent-memory-size
  "int64 device_persistent_memory_size = 4;

  returns: `long`"
  (^Long [^MemoryStatsOrBuilder this]
    (-> this (.getDevicePersistentMemorySize))))

(defn get-device-persistent-tensor-alloc-ids
  "repeated int64 device_persistent_tensor_alloc_ids = 6;

  index - `int`

  returns: `long`"
  (^Long [^MemoryStatsOrBuilder this ^Integer index]
    (-> this (.getDevicePersistentTensorAllocIds index))))

(defn get-host-persistent-tensor-alloc-ids-count
  "repeated int64 host_persistent_tensor_alloc_ids = 5;

  returns: `int`"
  (^Integer [^MemoryStatsOrBuilder this]
    (-> this (.getHostPersistentTensorAllocIdsCount))))

(defn get-host-persistent-tensor-alloc-ids
  "repeated int64 host_persistent_tensor_alloc_ids = 5;

  index - `int`

  returns: `long`"
  (^Long [^MemoryStatsOrBuilder this ^Integer index]
    (-> this (.getHostPersistentTensorAllocIds index))))

(defn get-device-persistent-tensor-alloc-ids-count
  "repeated int64 device_persistent_tensor_alloc_ids = 6;

  returns: `int`"
  (^Integer [^MemoryStatsOrBuilder this]
    (-> this (.getDevicePersistentTensorAllocIdsCount))))

(defn get-device-temp-memory-size
  "int64 device_temp_memory_size = 2;

  returns: `long`"
  (^Long [^MemoryStatsOrBuilder this]
    (-> this (.getDeviceTempMemorySize))))

(defn get-host-temp-memory-size
  "int64 host_temp_memory_size = 1;

  returns: `long`"
  (^Long [^MemoryStatsOrBuilder this]
    (-> this (.getHostTempMemorySize))))

(defn get-device-persistent-tensor-alloc-ids-list
  "repeated int64 device_persistent_tensor_alloc_ids = 6;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^MemoryStatsOrBuilder this]
    (-> this (.getDevicePersistentTensorAllocIdsList))))

(defn get-host-persistent-memory-size
  "int64 host_persistent_memory_size = 3;

  returns: `long`"
  (^Long [^MemoryStatsOrBuilder this]
    (-> this (.getHostPersistentMemorySize))))

