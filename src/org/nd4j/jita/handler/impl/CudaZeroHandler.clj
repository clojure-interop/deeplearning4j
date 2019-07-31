(ns org.nd4j.jita.handler.impl.CudaZeroHandler
  "This Mover implementation uses following techs:
 1. Unified Memory Architecture
 2. Zero-Copy Pinned Memory (if available)
 3. Pageable memory (if zero-copy pinned memory isn't supported by device)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.handler.impl CudaZeroHandler]))

(defn ->cuda-zero-handler
  "Constructor."
  (^CudaZeroHandler []
    (new CudaZeroHandler )))

(defn free
  "This method frees memory chunk specified by pointer and location

  point - Pointer - `org.nd4j.jita.allocator.impl.AllocationPoint`
  target - `org.nd4j.jita.allocator.enums.AllocationStatus`"
  ([^CudaZeroHandler this ^org.nd4j.jita.allocator.impl.AllocationPoint point ^org.nd4j.jita.allocator.enums.AllocationStatus target]
    (-> this (.free point target))))

(defn forget
  "Description copied from interface: MemoryHandler

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`
  location - `org.nd4j.jita.allocator.enums.AllocationStatus`"
  ([^CudaZeroHandler this ^org.nd4j.jita.allocator.impl.AllocationPoint point ^org.nd4j.jita.allocator.enums.AllocationStatus location]
    (-> this (.forget point location))))

(defn get-allocated-host-memory
  "This method returns total amount of host memory allocated within this MemoryHandler

  returns: `long`"
  (^Long [^CudaZeroHandler this]
    (-> this (.getAllocatedHostMemory))))

(defn promote-object
  "This method moves specific object from zero-copy memory to device memory
  PLEASE NOTE: DO NOT EVER USE THIS METHOD MANUALLY, UNLESS YOU 100% HAVE TO

  buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `boolean`"
  (^Boolean [^CudaZeroHandler this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.promoteObject buffer))))

(defn get-flow-controller
  "returns: `org.nd4j.jita.flow.FlowController`"
  (^org.nd4j.jita.flow.FlowController [^CudaZeroHandler this]
    (-> this (.getFlowController))))

(defn memcpy-async
  "Asynchronous version of memcpy
  PLEASE NOTE: This is device-dependent method, if it's not supported in your environment, blocking call will be used instead.

  dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-pointer - `org.bytedeco.javacpp.Pointer`
  length - `long`
  dst-offset - `long`"
  ([^CudaZeroHandler this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.bytedeco.javacpp.Pointer src-pointer ^Long length ^Long dst-offset]
    (-> this (.memcpyAsync dst-buffer src-pointer length dst-offset))))

(defn get-device-id-pointer
  "Returns getDeviceId() wrapped as a Pointer.

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^CudaZeroHandler this]
    (-> this (.getDeviceIdPointer))))

(defn get-host-tracking-points
  "This method returns sets of allocation tracking IDs for specific bucket

  bucket-id - `java.lang.Long`

  returns: `java.util.Set<java.lang.Long>`"
  (^java.util.Set [^CudaZeroHandler this ^java.lang.Long bucket-id]
    (-> this (.getHostTrackingPoints bucket-id))))

(defn memcpy-blocking
  "Synchronous version of memcpy.

  dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-pointer - `org.bytedeco.javacpp.Pointer`
  length - `long`
  dst-offset - `long`"
  ([^CudaZeroHandler this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.bytedeco.javacpp.Pointer src-pointer ^Long length ^Long dst-offset]
    (-> this (.memcpyBlocking dst-buffer src-pointer length dst-offset))))

(defn ping-device-for-free-memory
  "This method checks if specified device has free memory

  device-id - `java.lang.Integer`
  required-memory - `long`

  returns: `boolean`"
  (^Boolean [^CudaZeroHandler this ^java.lang.Integer device-id ^Long required-memory]
    (-> this (.pingDeviceForFreeMemory device-id required-memory))))

(defn get-allocated-host-objects
  "This method returns number of allocated objects within specific bucket

  bucket-id - `java.lang.Long`

  returns: `long`"
  (^Long [^CudaZeroHandler this ^java.lang.Long bucket-id]
    (-> this (.getAllocatedHostObjects bucket-id)))
  (^Long [^CudaZeroHandler this]
    (-> this (.getAllocatedHostObjects))))

(defn get-device-pointer
  "PLEASE NOTE: Specific implementation, on systems without special devices can return HostPointer here

  buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  context - `org.nd4j.linalg.jcublas.context.CudaContext`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^CudaZeroHandler this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^org.nd4j.linalg.jcublas.context.CudaContext context]
    (-> this (.getDevicePointer buffer context))))

(defn register-action
  "context - `org.nd4j.linalg.jcublas.context.CudaContext`
  result - `org.nd4j.linalg.api.ndarray.INDArray`
  operands - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^CudaZeroHandler this ^org.nd4j.linalg.jcublas.context.CudaContext context ^org.nd4j.linalg.api.ndarray.INDArray result ^org.nd4j.linalg.api.ndarray.INDArray operands]
    (-> this (.registerAction context result operands))))

(defn copyback
  "Deprecated.

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`
  shape - `org.nd4j.jita.allocator.impl.AllocationShape`"
  ([^CudaZeroHandler this ^org.nd4j.jita.allocator.impl.AllocationPoint point ^org.nd4j.jita.allocator.impl.AllocationShape shape]
    (-> this (.copyback point shape))))

(defn purge-zero-object
  "This method explicitly removes object from zero-copy memory.

  bucket-id - `java.lang.Long`
  object-id - `java.lang.Long`
  point - `org.nd4j.jita.allocator.impl.AllocationPoint`
  copyback - if TRUE, corresponding memory block on JVM side will be updated, if FALSE - memory will be just discarded - `boolean`"
  ([^CudaZeroHandler this ^java.lang.Long bucket-id ^java.lang.Long object-id ^org.nd4j.jita.allocator.impl.AllocationPoint point ^Boolean copyback]
    (-> this (.purgeZeroObject bucket-id object-id point copyback))))

(defn memcpy-device
  "dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-pointer - `org.bytedeco.javacpp.Pointer`
  length - `long`
  dst-offset - `long`
  context - `org.nd4j.linalg.jcublas.context.CudaContext`"
  ([^CudaZeroHandler this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.bytedeco.javacpp.Pointer src-pointer ^Long length ^Long dst-offset ^org.nd4j.linalg.jcublas.context.CudaContext context]
    (-> this (.memcpyDevice dst-buffer src-pointer length dst-offset context))))

(defn synchronize-thread-device
  "This method causes memory synchronization on host side.
  Viable only for Device-dependant MemoryHandlers

  thread-id - `java.lang.Long`
  device-id - `java.lang.Integer`
  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^CudaZeroHandler this ^java.lang.Long thread-id ^java.lang.Integer device-id ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.synchronizeThreadDevice thread-id device-id point))))

(defn memcpy
  "Synchronous version of memcpy.

  dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  ([^CudaZeroHandler this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.nd4j.linalg.api.buffer.DataBuffer src-buffer]
    (-> this (.memcpy dst-buffer src-buffer))))

(defn get-initial-location
  "This method returns initial allocation location. So, it can be HOST, or DEVICE if environment allows that.

  returns: `org.nd4j.jita.allocator.enums.AllocationStatus`"
  (^org.nd4j.jita.allocator.enums.AllocationStatus [^CudaZeroHandler this]
    (-> this (.getInitialLocation))))

(defn get-device-context
  "This method returns ExternalContext wrapper (if applicable)

  returns: `org.nd4j.jita.allocator.context.ExternalContext`"
  (^org.nd4j.jita.allocator.context.ExternalContext [^CudaZeroHandler this]
    (-> this (.getDeviceContext))))

(defn copyforward
  "Deprecated.

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`
  shape - `org.nd4j.jita.allocator.impl.AllocationShape`"
  ([^CudaZeroHandler this ^org.nd4j.jita.allocator.impl.AllocationPoint point ^org.nd4j.jita.allocator.impl.AllocationShape shape]
    (-> this (.copyforward point shape))))

(defn get-host-pointer
  "PLEASE NOTE: This method always returns pointer within OS memory space

  buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^CudaZeroHandler this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.getHostPointer buffer))))

(defn get-allocated-device-memory
  "This method returns total amount of memory allocated at specified device

  device - `java.lang.Integer`

  returns: `long`"
  (^Long [^CudaZeroHandler this ^java.lang.Integer device]
    (-> this (.getAllocatedDeviceMemory device))))

(defn alloc
  "Allocate specified memory chunk on specified device/host

  target-mode - valid arguments are DEVICE, ZERO - `org.nd4j.jita.allocator.enums.AllocationStatus`
  point - `org.nd4j.jita.allocator.impl.AllocationPoint`
  shape - `org.nd4j.jita.allocator.impl.AllocationShape`
  initialize - `boolean`

  returns: `org.nd4j.jita.allocator.pointers.PointersPair`"
  (^org.nd4j.jita.allocator.pointers.PointersPair [^CudaZeroHandler this ^org.nd4j.jita.allocator.enums.AllocationStatus target-mode ^org.nd4j.jita.allocator.impl.AllocationPoint point ^org.nd4j.jita.allocator.impl.AllocationShape shape ^Boolean initialize]
    (-> this (.alloc target-mode point shape initialize))))

(defn get-device-tracking-points
  "This method returns set of allocation tracking IDs for specific device

  device-id - `java.lang.Integer`

  returns: `java.util.Set<java.lang.Long>`"
  (^java.util.Set [^CudaZeroHandler this ^java.lang.Integer device-id]
    (-> this (.getDeviceTrackingPoints device-id))))

(defn relocate-object
  "buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  ([^CudaZeroHandler this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.relocateObject buffer))))

(defn get-device-id
  "This method returns CUDA deviceId for current thread

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^CudaZeroHandler this]
    (-> this (.getDeviceId))))

(defn purge-device-object
  "This method explicitly removes object from device memory.

  thread-id - `java.lang.Long`
  device-id - `java.lang.Integer`
  object-id - `java.lang.Long`
  point - `org.nd4j.jita.allocator.impl.AllocationPoint`
  copyback - if TRUE, corresponding memory block on JVM side will be updated, if FALSE - memory will be just discarded - `boolean`"
  ([^CudaZeroHandler this ^java.lang.Long thread-id ^java.lang.Integer device-id ^java.lang.Long object-id ^org.nd4j.jita.allocator.impl.AllocationPoint point ^Boolean copyback]
    (-> this (.purgeDeviceObject thread-id device-id object-id point copyback))))

(defn initialize-device
  "This method initializes specific device for current thread

  thread-id - `java.lang.Long`
  device-id - `java.lang.Integer`"
  ([^CudaZeroHandler this ^java.lang.Long thread-id ^java.lang.Integer device-id]
    (-> this (.initializeDevice thread-id device-id))))

(defn fallback
  "Deprecated.

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`
  shape - `org.nd4j.jita.allocator.impl.AllocationShape`"
  ([^CudaZeroHandler this ^org.nd4j.jita.allocator.impl.AllocationPoint point ^org.nd4j.jita.allocator.impl.AllocationShape shape]
    (-> this (.fallback point shape))))

(defn memcpy-special
  "Special memcpy version, addressing shapeInfoDataBuffer copies
  PLEASE NOTE: Blocking H->H, Async H->D

  dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-pointer - `org.bytedeco.javacpp.Pointer`
  length - `long`
  dst-offset - `long`"
  ([^CudaZeroHandler this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.bytedeco.javacpp.Pointer src-pointer ^Long length ^Long dst-offset]
    (-> this (.memcpySpecial dst-buffer src-pointer length dst-offset))))

(defn device-dependant?
  "This method returns if this MemoryHandler instance is device-dependant (i.e. CUDA)

  returns: TRUE if dependant, FALSE otherwise - `boolean`"
  (^Boolean [^CudaZeroHandler this]
    (-> this (.isDeviceDependant))))

(defn get-allocation-statistics
  "This method returns total amount of memory allocated within system

  returns: `com.google.common.collect.Table<org.nd4j.jita.allocator.enums.AllocationStatus,java.lang.Integer,java.lang.Long>`"
  (^com.google.common.collect.Table [^CudaZeroHandler this]
    (-> this (.getAllocationStatistics))))

(defn init
  "This method gets called from Allocator, during Allocator/MemoryHandler initialization

  configuration - `org.nd4j.jita.conf.Configuration`
  allocator - `org.nd4j.jita.allocator.Allocator`"
  ([^CudaZeroHandler this ^org.nd4j.jita.conf.Configuration configuration ^org.nd4j.jita.allocator.Allocator allocator]
    (-> this (.init configuration allocator))))

(defn get-allocated-device-objects
  "This method returns total number of object allocated on specified device

  device-id - `java.lang.Integer`

  returns: `long`"
  (^Long [^CudaZeroHandler this ^java.lang.Integer device-id]
    (-> this (.getAllocatedDeviceObjects device-id))))

(defn get-context-pool
  "returns: `org.nd4j.jita.allocator.context.ContextPool`"
  (^org.nd4j.jita.allocator.context.ContextPool [^CudaZeroHandler this]
    (-> this (.getContextPool))))

(defn relocate
  "Copies specific chunk of memory from one storage to another
  Possible directions: HOST -> DEVICE, DEVICE -> HOST

  current-status - `org.nd4j.jita.allocator.enums.AllocationStatus`
  target-status - `org.nd4j.jita.allocator.enums.AllocationStatus`
  point - `org.nd4j.jita.allocator.impl.AllocationPoint`
  shape - `org.nd4j.jita.allocator.impl.AllocationShape`
  context - `org.nd4j.linalg.jcublas.context.CudaContext`"
  ([^CudaZeroHandler this ^org.nd4j.jita.allocator.enums.AllocationStatus current-status ^org.nd4j.jita.allocator.enums.AllocationStatus target-status ^org.nd4j.jita.allocator.impl.AllocationPoint point ^org.nd4j.jita.allocator.impl.AllocationShape shape ^org.nd4j.linalg.jcublas.context.CudaContext context]
    (-> this (.relocate current-status target-status point shape context))))

(defn get-available-devices
  "This method returns set of available devices

  returns: `java.util.Set<java.lang.Integer>`"
  (^java.util.Set [^CudaZeroHandler this]
    (-> this (.getAvailableDevices))))

(defn get-cuda-context
  "This method returns CudaContext for current thread. If context doesn't exist - it gets created first.

  returns: `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^org.nd4j.linalg.jcublas.context.CudaContext [^CudaZeroHandler this]
    (-> this (.getCudaContext))))

