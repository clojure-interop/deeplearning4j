(ns org.nd4j.jita.allocator.impl.AtomicAllocator
  "Just-in-Time Allocator for CUDA
 This method is a basement for pre-allocated memory management for cuda.
 Basically that's sophisticated garbage collector for both zero-copy memory, and multiple device memory.
 There's multiple possible data movement directions, but general path is:
 host memory (issued on JVM side) ->
 zero-copy pinned memory (which is allocated for everything out there) ->
 device memory (where data gets moved from zero-copy, if used actively enough)
 And the backward movement, if memory isn't used anymore (like if originating INDArray was trashed by JVM GC), or it's not popular enough to hold in device memory
 Mechanism is as lock-free, as possible. This achieved using three-state memory state signalling: Tick/Tack/Toe.
 Tick: memory chunk (or its part) is accessed on on device
 Tack: memory chink (or its part) device access session was finished
 Toe: memory chunk is locked for some reason. Possible reasons:
 Memory synchronization is ongoing, host->gpu or gpu->host
 Memory relocation is ongoing, zero->gpu, or gpu->zero, or gpu->host
 Memory removal is ongoing.
 So, basically memory being used for internal calculations, not interfered with manual changes (aka putRow etc), are always available without locks"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.impl AtomicAllocator]))

(defn *get-instance
  "returns: `org.nd4j.jita.allocator.impl.AtomicAllocator`"
  (^org.nd4j.jita.allocator.impl.AtomicAllocator []
    (AtomicAllocator/getInstance )))

(defn tick-host-write
  "buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  ([^AtomicAllocator this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.tickHostWrite buffer))))

(defn get-flow-controller
  "returns: `org.nd4j.jita.flow.FlowController`"
  (^org.nd4j.jita.flow.FlowController [^AtomicAllocator this]
    (-> this (.getFlowController))))

(defn memcpy-async
  "This method implements asynchronous memcpy, if that's available on current hardware

  dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-pointer - `org.bytedeco.javacpp.Pointer`
  length - `long`
  dst-offset - `long`"
  ([^AtomicAllocator this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.bytedeco.javacpp.Pointer src-pointer ^Long length ^Long dst-offset]
    (-> this (.memcpyAsync dst-buffer src-pointer length dst-offset))))

(defn get-device-id-pointer
  "Returns getDeviceId() wrapped as a Pointer.

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^AtomicAllocator this]
    (-> this (.getDeviceIdPointer))))

(defn memcpy-blocking
  "This method implements blocking memcpy

  dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-pointer - `org.bytedeco.javacpp.Pointer`
  length - `long`
  dst-offset - `long`"
  ([^AtomicAllocator this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.bytedeco.javacpp.Pointer src-pointer ^Long length ^Long dst-offset]
    (-> this (.memcpyBlocking dst-buffer src-pointer length dst-offset))))

(defn synchronize-host-data
  "This method should be called to make sure that data on host side is actualized

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AtomicAllocator this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.synchronizeHostData array))))

(defn register-action
  "context - `org.nd4j.linalg.jcublas.context.CudaContext`
  result - `org.nd4j.linalg.api.ndarray.INDArray`
  operands - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AtomicAllocator this ^org.nd4j.linalg.jcublas.context.CudaContext context ^org.nd4j.linalg.api.ndarray.INDArray result ^org.nd4j.linalg.api.ndarray.INDArray operands]
    (-> this (.registerAction context result operands))))

(defn get-constant-buffer
  "array - `int[]`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^AtomicAllocator this array]
    (-> this (.getConstantBuffer array))))

(defn memcpy-device
  "dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-pointer - `org.bytedeco.javacpp.Pointer`
  length - `long`
  dst-offset - `long`
  context - `org.nd4j.linalg.jcublas.context.CudaContext`"
  ([^AtomicAllocator this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.bytedeco.javacpp.Pointer src-pointer ^Long length ^Long dst-offset ^org.nd4j.linalg.jcublas.context.CudaContext context]
    (-> this (.memcpyDevice dst-buffer src-pointer length dst-offset context))))

(defn memcpy
  "This method implements blocking memcpy

  dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  ([^AtomicAllocator this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.nd4j.linalg.api.buffer.DataBuffer src-buffer]
    (-> this (.memcpy dst-buffer src-buffer))))

(defn get-device-context
  "This method returns CudaContext for current thread

  returns: `org.nd4j.jita.allocator.context.ExternalContext`"
  (^org.nd4j.jita.allocator.context.ExternalContext [^AtomicAllocator this]
    (-> this (.getDeviceContext))))

(defn get-pointer
  "This method returns actual device pointer valid for current object

  buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  context - `org.nd4j.linalg.jcublas.context.CudaContext`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^AtomicAllocator this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^org.nd4j.linalg.jcublas.context.CudaContext context]
    (-> this (.getPointer buffer context)))
  (^org.bytedeco.javacpp.Pointer [^AtomicAllocator this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.getPointer buffer)))
  (^org.bytedeco.javacpp.Pointer [^AtomicAllocator this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^org.nd4j.jita.allocator.impl.AllocationShape shape ^Boolean is-view ^org.nd4j.linalg.jcublas.context.CudaContext context]
    (-> this (.getPointer buffer shape is-view context))))

(defn allocate-memory
  "This method allocates required chunk of memory in specific location

  PLEASE NOTE: Do not use this method, unless you're 100% sure what you're doing

  buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  required-memory - `org.nd4j.jita.allocator.impl.AllocationShape`
  location - `org.nd4j.jita.allocator.enums.AllocationStatus`
  initialize - `boolean`

  returns: `org.nd4j.jita.allocator.impl.AllocationPoint`"
  (^org.nd4j.jita.allocator.impl.AllocationPoint [^AtomicAllocator this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^org.nd4j.jita.allocator.impl.AllocationShape required-memory ^org.nd4j.jita.allocator.enums.AllocationStatus location ^Boolean initialize]
    (-> this (.allocateMemory buffer required-memory location initialize)))
  (^org.nd4j.jita.allocator.impl.AllocationPoint [^AtomicAllocator this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^org.nd4j.jita.allocator.impl.AllocationShape required-memory ^Boolean initialize]
    (-> this (.allocateMemory buffer required-memory initialize))))

(defn get-host-pointer
  "This method returns actual host pointer valid for current object

  array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^AtomicAllocator this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.getHostPointer array))))

(defn get-device-id
  "This method returns CUDA deviceId for specified buffer

  array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^AtomicAllocator this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.getDeviceId array)))
  (^java.lang.Integer [^AtomicAllocator this]
    (-> this (.getDeviceId))))

(defn apply-configuration
  "Consume and apply configuration passed in as argument
  PLEASE NOTE: This method should only be used BEFORE any calculations were started.

  configuration - configuration bean to be applied - `org.nd4j.jita.conf.Configuration`"
  ([^AtomicAllocator this ^org.nd4j.jita.conf.Configuration configuration]
    (-> this (.applyConfiguration configuration)))
  ([^AtomicAllocator this]
    (-> this (.applyConfiguration))))

(defn get-configuration
  "Returns current Allocator configuration

  returns: current configuration - `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^AtomicAllocator this]
    (-> this (.getConfiguration))))

(defn get-total-allocated-host-memory
  "This method returns the number of tracked zero-copy allocations

  returns: `long`"
  (^Long [^AtomicAllocator this]
    (-> this (.getTotalAllocatedHostMemory))))

(defn memcpy-special
  "dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-pointer - `org.bytedeco.javacpp.Pointer`
  length - `long`
  dst-offset - `long`"
  ([^AtomicAllocator this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.bytedeco.javacpp.Pointer src-pointer ^Long length ^Long dst-offset]
    (-> this (.memcpySpecial dst-buffer src-pointer length dst-offset))))

(defn get-allocation-point
  "array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.jita.allocator.impl.AllocationPoint`"
  (^org.nd4j.jita.allocator.impl.AllocationPoint [^AtomicAllocator this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.getAllocationPoint array))))

(defn free-memory
  "This method releases memory allocated for this allocation point

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^AtomicAllocator this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.freeMemory point))))

(defn get-context-pool
  "returns: `org.nd4j.jita.allocator.context.ContextPool`"
  (^org.nd4j.jita.allocator.context.ContextPool [^AtomicAllocator this]
    (-> this (.getContextPool))))

(defn tick-device-write
  "array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AtomicAllocator this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.tickDeviceWrite array))))

(defn move-to-constant
  "data-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^AtomicAllocator this ^org.nd4j.linalg.api.buffer.DataBuffer data-buffer]
    (-> this (.moveToConstant data-buffer))))

(defn get-total-allocated-device-memory
  "This method returns total amount of memory allocated on specified device

  device-id - `java.lang.Integer`

  returns: `long`"
  (^Long [^AtomicAllocator this ^java.lang.Integer device-id]
    (-> this (.getTotalAllocatedDeviceMemory device-id))))

(defn set-memory-handler
  "This method specifies Mover implementation to be used internally

  memory-handler - `org.nd4j.jita.handler.MemoryHandler`"
  ([^AtomicAllocator this ^org.nd4j.jita.handler.MemoryHandler memory-handler]
    (-> this (.setMemoryHandler memory-handler))))

