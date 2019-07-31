(ns org.nd4j.jita.allocator.Allocator
  "Allocator interface provides methods for transparent memory management"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator Allocator]))

(defn tick-host-write
  "buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  ([^Allocator this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.tickHostWrite buffer))))

(defn get-flow-controller
  "returns: `org.nd4j.jita.flow.FlowController`"
  (^org.nd4j.jita.flow.FlowController [^Allocator this]
    (-> this (.getFlowController))))

(defn memcpy-async
  "dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-pointer - `org.bytedeco.javacpp.Pointer`
  length - `long`
  dst-offset - `long`"
  ([^Allocator this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.bytedeco.javacpp.Pointer src-pointer ^Long length ^Long dst-offset]
    (-> this (.memcpyAsync dst-buffer src-pointer length dst-offset))))

(defn get-device-id-pointer
  "Returns getDeviceId() wrapped as a Pointer.

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^Allocator this]
    (-> this (.getDeviceIdPointer))))

(defn memcpy-blocking
  "dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-pointer - `org.bytedeco.javacpp.Pointer`
  length - `long`
  dst-offset - `long`"
  ([^Allocator this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.bytedeco.javacpp.Pointer src-pointer ^Long length ^Long dst-offset]
    (-> this (.memcpyBlocking dst-buffer src-pointer length dst-offset))))

(defn synchronize-host-data
  "This method should be callsd to make sure that data on host side is actualized

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Allocator this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.synchronizeHostData array))))

(defn register-action
  "context - `org.nd4j.linalg.jcublas.context.CudaContext`
  result - `org.nd4j.linalg.api.ndarray.INDArray`
  operands - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Allocator this ^org.nd4j.linalg.jcublas.context.CudaContext context ^org.nd4j.linalg.api.ndarray.INDArray result ^org.nd4j.linalg.api.ndarray.INDArray operands]
    (-> this (.registerAction context result operands))))

(defn get-constant-buffer
  "array - `int[]`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^Allocator this array]
    (-> this (.getConstantBuffer array))))

(defn memcpy-device
  "dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-pointer - `org.bytedeco.javacpp.Pointer`
  length - `long`
  dst-offset - `long`
  context - `org.nd4j.linalg.jcublas.context.CudaContext`"
  ([^Allocator this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.bytedeco.javacpp.Pointer src-pointer ^Long length ^Long dst-offset ^org.nd4j.linalg.jcublas.context.CudaContext context]
    (-> this (.memcpyDevice dst-buffer src-pointer length dst-offset context))))

(defn memcpy
  "dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  ([^Allocator this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.nd4j.linalg.api.buffer.DataBuffer src-buffer]
    (-> this (.memcpy dst-buffer src-buffer))))

(defn get-device-context
  "This method returns CudaContext for current thread

  returns: `org.nd4j.jita.allocator.context.ExternalContext`"
  (^org.nd4j.jita.allocator.context.ExternalContext [^Allocator this]
    (-> this (.getDeviceContext))))

(defn get-pointer
  "This method returns actual device pointer valid for specified shape of current object

  buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  shape - `org.nd4j.jita.allocator.impl.AllocationShape`
  is-view - `boolean`
  context - `org.nd4j.linalg.jcublas.context.CudaContext`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^Allocator this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^org.nd4j.jita.allocator.impl.AllocationShape shape ^Boolean is-view ^org.nd4j.linalg.jcublas.context.CudaContext context]
    (-> this (.getPointer buffer shape is-view context)))
  (^org.bytedeco.javacpp.Pointer [^Allocator this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^org.nd4j.linalg.jcublas.context.CudaContext context]
    (-> this (.getPointer buffer context))))

(defn allocate-memory
  "This method allocates required chunk of memory in specific location
  PLEASE NOTE: Do not use this method, unless you're 100% sure what you're doing

  buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  required-memory - `org.nd4j.jita.allocator.impl.AllocationShape`
  location - `org.nd4j.jita.allocator.enums.AllocationStatus`
  initialize - `boolean`

  returns: `org.nd4j.jita.allocator.impl.AllocationPoint`"
  (^org.nd4j.jita.allocator.impl.AllocationPoint [^Allocator this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^org.nd4j.jita.allocator.impl.AllocationShape required-memory ^org.nd4j.jita.allocator.enums.AllocationStatus location ^Boolean initialize]
    (-> this (.allocateMemory buffer required-memory location initialize)))
  (^org.nd4j.jita.allocator.impl.AllocationPoint [^Allocator this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^org.nd4j.jita.allocator.impl.AllocationShape required-memory ^Boolean initialize]
    (-> this (.allocateMemory buffer required-memory initialize))))

(defn get-host-pointer
  "This method returns actual host pointer valid for current object

  buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^Allocator this ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.getHostPointer buffer))))

(defn get-device-id
  "This method returns deviceId for current thread
  All values >= 0 are considered valid device IDs, all values < 0 are considered stubs.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Allocator this]
    (-> this (.getDeviceId))))

(defn apply-configuration
  "Consume and apply configuration passed in as argument

  configuration - configuration bean to be applied - `org.nd4j.jita.conf.Configuration`"
  ([^Allocator this ^org.nd4j.jita.conf.Configuration configuration]
    (-> this (.applyConfiguration configuration))))

(defn get-configuration
  "Returns current Allocator configuration

  returns: current configuration - `org.nd4j.jita.conf.Configuration`"
  (^org.nd4j.jita.conf.Configuration [^Allocator this]
    (-> this (.getConfiguration))))

(defn memcpy-special
  "dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-pointer - `org.bytedeco.javacpp.Pointer`
  length - `long`
  dst-offset - `long`"
  ([^Allocator this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.bytedeco.javacpp.Pointer src-pointer ^Long length ^Long dst-offset]
    (-> this (.memcpySpecial dst-buffer src-pointer length dst-offset))))

(defn get-allocation-point
  "array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.jita.allocator.impl.AllocationPoint`"
  (^org.nd4j.jita.allocator.impl.AllocationPoint [^Allocator this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.getAllocationPoint array))))

(defn get-context-pool
  "returns: `org.nd4j.jita.allocator.context.ContextPool`"
  (^org.nd4j.jita.allocator.context.ContextPool [^Allocator this]
    (-> this (.getContextPool))))

(defn tick-device-write
  "array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Allocator this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.tickDeviceWrite array))))

(defn move-to-constant
  "data-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^Allocator this ^org.nd4j.linalg.api.buffer.DataBuffer data-buffer]
    (-> this (.moveToConstant data-buffer))))

(defn set-memory-handler
  "This methods specifies Mover implementation to be used internally

  memory-handler - `org.nd4j.jita.handler.MemoryHandler`"
  ([^Allocator this ^org.nd4j.jita.handler.MemoryHandler memory-handler]
    (-> this (.setMemoryHandler memory-handler))))

(defn get-memory-handler
  "returns: `org.nd4j.jita.handler.MemoryHandler`"
  (^org.nd4j.jita.handler.MemoryHandler [^Allocator this]
    (-> this (.getMemoryHandler))))

