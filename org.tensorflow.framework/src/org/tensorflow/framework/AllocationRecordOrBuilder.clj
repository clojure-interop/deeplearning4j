(ns org.tensorflow.framework.AllocationRecordOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AllocationRecordOrBuilder]))

(defn get-alloc-micros
  "The timestamp of the operation.
  int64 alloc_micros = 1;

  returns: `long`"
  (^Long [^AllocationRecordOrBuilder this]
    (-> this (.getAllocMicros))))

(defn get-alloc-bytes
  "Number of bytes allocated, or de-allocated if negative.
  int64 alloc_bytes = 2;

  returns: `long`"
  (^Long [^AllocationRecordOrBuilder this]
    (-> this (.getAllocBytes))))

