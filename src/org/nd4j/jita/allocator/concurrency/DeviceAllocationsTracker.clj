(ns org.nd4j.jita.allocator.concurrency.DeviceAllocationsTracker
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.concurrency DeviceAllocationsTracker]))

(defn ->device-allocations-tracker
  "Constructor.

  configuration - `org.nd4j.jita.conf.Configuration`"
  (^DeviceAllocationsTracker [^org.nd4j.jita.conf.Configuration configuration]
    (new DeviceAllocationsTracker configuration)))

(defn add-to-allocation
  "thread-id - `java.lang.Long`
  device-id - `java.lang.Integer`
  memory-size - `long`

  returns: `long`"
  (^Long [^DeviceAllocationsTracker this ^java.lang.Long thread-id ^java.lang.Integer device-id ^Long memory-size]
    (-> this (.addToAllocation thread-id device-id memory-size))))

(defn sub-from-allocation
  "thread-id - `java.lang.Long`
  device-id - `java.lang.Integer`
  memory-size - `long`

  returns: `long`"
  (^Long [^DeviceAllocationsTracker this ^java.lang.Long thread-id ^java.lang.Integer device-id ^Long memory-size]
    (-> this (.subFromAllocation thread-id device-id memory-size))))

(defn reserve-allocation-if-possible
  "This method \"reserves\" memory within allocator

  thread-id - `java.lang.Long`
  device-id - `java.lang.Integer`
  memory-size - `long`

  returns: `boolean`"
  (^Boolean [^DeviceAllocationsTracker this ^java.lang.Long thread-id ^java.lang.Integer device-id ^Long memory-size]
    (-> this (.reserveAllocationIfPossible thread-id device-id memory-size))))

(defn get-allocated-size
  "thread-id - `java.lang.Long`
  device-id - `java.lang.Integer`

  returns: `long`"
  (^Long [^DeviceAllocationsTracker this ^java.lang.Long thread-id ^java.lang.Integer device-id]
    (-> this (.getAllocatedSize thread-id device-id)))
  (^Long [^DeviceAllocationsTracker this ^java.lang.Integer device-id]
    (-> this (.getAllocatedSize device-id))))

(defn get-reserved-space
  "device-id - `java.lang.Integer`

  returns: `long`"
  (^Long [^DeviceAllocationsTracker this ^java.lang.Integer device-id]
    (-> this (.getReservedSpace device-id))))

