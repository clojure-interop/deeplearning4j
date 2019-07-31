(ns org.nd4j.jita.allocator.impl.AllocationPoint
  "This class describes top-level allocation unit.
 Every buffer passed into CUDA wii have allocation point entry, describing allocation state."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.impl AllocationPoint]))

(defn ->allocation-point
  "Constructor."
  (^AllocationPoint []
    (new AllocationPoint )))

(defn mark-enqueued
  "really-enqueued - `boolean`"
  ([^AllocationPoint this ^Boolean really-enqueued]
    (-> this (.markEnqueued really-enqueued))))

(defn tick-host-write
  "This method sets time when this point was changed on host"
  ([^AllocationPoint this]
    (-> this (.tickHostWrite))))

(defn attach-reference
  "reference - `org.nd4j.jita.allocator.garbage.GarbageBufferReference`"
  ([^AllocationPoint this ^org.nd4j.jita.allocator.garbage.GarbageBufferReference reference]
    (-> this (.attachReference reference))))

(defn get-buffer
  "This method returns previously stored BaseCudaDataBuffer instance
  PLEASE NOTE: Return value CAN be null

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^AllocationPoint this]
    (-> this (.getBuffer))))

(defn tick-device-read
  ""
  ([^AllocationPoint this]
    (-> this (.tickDeviceRead))))

(defn actual-on-device-side?
  "This method returns, if device side has actual copy of data

  returns: `boolean`"
  (^Boolean [^AllocationPoint this]
    (-> this (.isActualOnDeviceSide))))

(defn add-read-lane
  "event - `org.nd4j.jita.allocator.pointers.cuda.cudaEvent_t`"
  ([^AllocationPoint this ^org.nd4j.jita.allocator.pointers.cuda.cudaEvent_t event]
    (-> this (.addReadLane event))))

(defn get-current-context
  "returns: `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^org.nd4j.linalg.jcublas.context.CudaContext [^AllocationPoint this]
    (-> this (.getCurrentContext))))

(defn get-device-ticks
  "returns: `long`"
  (^Long [^AllocationPoint this]
    (-> this (.getDeviceTicks))))

(defn get-device-pointer
  "This method returns CUDA pointer object for this allocation.
  It can be either device pointer or pinned memory pointer, or null.
  PLEASE NOTE: Thread safety is guaranteed by reentrant read/write lock

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^AllocationPoint this]
    (-> this (.getDevicePointer))))

(defn set-device-id
  "device-id - `int`"
  ([^AllocationPoint this ^Integer device-id]
    (-> this (.setDeviceId device-id))))

(defn tick-host-read
  ""
  ([^AllocationPoint this]
    (-> this (.tickHostRead))))

(defn attach-buffer
  "This method stores WeakReference to original BaseCudaDataBuffer

  buffer - `org.nd4j.linalg.api.buffer.BaseDataBuffer`"
  ([^AllocationPoint this ^org.nd4j.linalg.api.buffer.BaseDataBuffer buffer]
    (-> this (.attachBuffer buffer))))

(defn acquire-lock
  ""
  ([^AllocationPoint this]
    (-> this (.acquireLock))))

(defn set-pointers
  "This method sets CUDA pointer for this allocation.
  It can be either device pointer, or pinned memory pointer, or null.
  PLEASE NOTE: Thread safety is guaranteed by reentrant read/write lock

  pointer-info - CUDA pointers wrapped into DevicePointerInfo - `org.nd4j.jita.allocator.pointers.PointersPair`"
  ([^AllocationPoint this ^org.nd4j.jita.allocator.pointers.PointersPair pointer-info]
    (-> this (.setPointers pointer-info))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AllocationPoint this]
    (-> this (.toString))))

(defn get-allocation-status
  "This method returns current AllocationStatus for this point

  returns: `org.nd4j.jita.allocator.enums.AllocationStatus`"
  (^org.nd4j.jita.allocator.enums.AllocationStatus [^AllocationPoint this]
    (-> this (.getAllocationStatus))))

(defn get-host-pointer
  "This method returns CUDA pointer object for this allocation.
  It can be either device pointer or pinned memory pointer, or null.
  PLEASE NOTE: Thread safety is guaranteed by reentrant read/write lock

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^AllocationPoint this]
    (-> this (.getHostPointer))))

(defn set-allocation-status
  "This method sets specified AllocationStatus for this point

  status - `org.nd4j.jita.allocator.enums.AllocationStatus`"
  ([^AllocationPoint this ^org.nd4j.jita.allocator.enums.AllocationStatus status]
    (-> this (.setAllocationStatus status))))

(defn get-host-read-time
  "Returns time, in milliseconds, when this point was accessed on host side

  returns: `long`"
  (^Long [^AllocationPoint this]
    (-> this (.getHostReadTime))))

(defn get-device-id
  "returns: `int`"
  (^Integer [^AllocationPoint this]
    (-> this (.getDeviceId))))

(defn enqueued?
  "returns: `boolean`"
  (^Boolean [^AllocationPoint this]
    (-> this (.isEnqueued))))

(defn tick-device-to-host
  "This method sets device access time equal to host write time"
  ([^AllocationPoint this]
    (-> this (.tickDeviceToHost))))

(defn get-threads-trace
  "returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^AllocationPoint this]
    (-> this (.getThreadsTrace))))

(defn get-real-device-access-time
  "returns: `long`"
  (^Long [^AllocationPoint this]
    (-> this (.getRealDeviceAccessTime))))

(defn release-lock
  ""
  ([^AllocationPoint this]
    (-> this (.releaseLock))))

(defn get-pointers
  "returns: `org.nd4j.jita.allocator.pointers.PointersPair`"
  (^org.nd4j.jita.allocator.pointers.PointersPair [^AllocationPoint this]
    (-> this (.getPointers))))

(defn actual-on-host-side?
  "This method returns, if host side has actual copy of data

  returns: true, if data is actual, false otherwise - `boolean`"
  (^Boolean [^AllocationPoint this]
    (-> this (.isActualOnHostSide))))

(defn set-last-event
  "event - `org.nd4j.jita.allocator.pointers.cuda.cudaEvent_t`"
  ([^AllocationPoint this ^org.nd4j.jita.allocator.pointers.cuda.cudaEvent_t event]
    (-> this (.setLastEvent event))))

(defn get-device-access-time
  "Returns time, in milliseconds, when this point was accessed on device side

  returns: `long`"
  (^Long [^AllocationPoint this]
    (-> this (.getDeviceAccessTime))))

(defn tick-device-write
  "This method sets time when this point was changed on device"
  ([^AllocationPoint this]
    (-> this (.tickDeviceWrite))))

(defn get-device-write-time
  "Returns time when point was written on device last time

  returns: `long`"
  (^Long [^AllocationPoint this]
    (-> this (.getDeviceWriteTime))))

(defn get-host-write-time
  "returns: `long`"
  (^Long [^AllocationPoint this]
    (-> this (.getHostWriteTime))))

(defn set-current-context
  "context - `org.nd4j.linalg.jcublas.context.CudaContext`"
  ([^AllocationPoint this ^org.nd4j.linalg.jcublas.context.CudaContext context]
    (-> this (.setCurrentContext context))))

(defn tack-device
  ""
  ([^AllocationPoint this]
    (-> this (.tackDevice))))

(defn add-thread-to-trace
  "thread-id - `java.lang.Long`"
  ([^AllocationPoint this ^java.lang.Long thread-id]
    (-> this (.addThreadToTrace thread-id))))

(defn get-number-of-bytes
  "returns: `long`"
  (^Long [^AllocationPoint this]
    (-> this (.getNumberOfBytes))))

(defn get-last-event
  "returns: `org.nd4j.jita.allocator.pointers.cuda.cudaEvent_t`"
  (^org.nd4j.jita.allocator.pointers.cuda.cudaEvent_t [^AllocationPoint this]
    (-> this (.getLastEvent))))

