(ns org.nd4j.linalg.api.ops.performance.PerformanceTracker
  "This class provides routines for performance tracking and holder for corresponding results"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.performance PerformanceTracker]))

(defn *get-instance
  "returns: `org.nd4j.linalg.api.ops.performance.PerformanceTracker`"
  (^org.nd4j.linalg.api.ops.performance.PerformanceTracker []
    (PerformanceTracker/getInstance )))

(defn add-memory-transaction
  "This method stores bandwidth used for given transaction.
  PLEASE NOTE: Bandwidth is stored in per millisecond value.

  device-id - device used for this transaction - `int`
  time-spent-nanos - `long`
  number-of-bytes - number of bytes - `long`
  direction - direction for the given memory transaction - `org.nd4j.linalg.memory.MemcpyDirection`

  returns: `long`"
  (^Long [^PerformanceTracker this ^Integer device-id ^Long time-spent-nanos ^Long number-of-bytes ^org.nd4j.linalg.memory.MemcpyDirection direction]
    (-> this (.addMemoryTransaction device-id time-spent-nanos number-of-bytes direction)))
  (^Long [^PerformanceTracker this ^Integer device-id ^Long time-spent-nanos ^Long number-of-bytes]
    (-> this (.addMemoryTransaction device-id time-spent-nanos number-of-bytes))))

(defn clear
  ""
  ([^PerformanceTracker this]
    (-> this (.clear))))

(defn helper-start-transaction
  "returns: `long`"
  (^Long [^PerformanceTracker this]
    (-> this (.helperStartTransaction))))

(defn helper-register-transaction
  "device-id - `int`
  time-spent-nanos - `long`
  number-of-bytes - `long`
  direction - `org.nd4j.linalg.memory.MemcpyDirection`"
  ([^PerformanceTracker this ^Integer device-id ^Long time-spent-nanos ^Long number-of-bytes ^org.nd4j.linalg.memory.MemcpyDirection direction]
    (-> this (.helperRegisterTransaction device-id time-spent-nanos number-of-bytes direction))))

(defn get-current-bandwidth
  "returns: `java.util.Map<java.lang.Integer,java.util.Map<org.nd4j.linalg.memory.MemcpyDirection,java.lang.Long>>`"
  (^java.util.Map [^PerformanceTracker this]
    (-> this (.getCurrentBandwidth))))

