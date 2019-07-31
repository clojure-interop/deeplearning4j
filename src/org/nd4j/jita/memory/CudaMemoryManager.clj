(ns org.nd4j.jita.memory.CudaMemoryManager
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.memory CudaMemoryManager]))

(defn ->cuda-memory-manager
  "Constructor."
  (^CudaMemoryManager []
    (new CudaMemoryManager )))

(defn allocate
  "This method returns Pointer to allocated memory chunk
  PLEASE NOTE: Cache options depend on specific implementations

  bytes - `long`
  kind - `org.nd4j.linalg.api.memory.enums.MemoryKind`
  initialize - `boolean`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^CudaMemoryManager this ^Long bytes ^org.nd4j.linalg.api.memory.enums.MemoryKind kind ^Boolean initialize]
    (-> this (.allocate bytes kind initialize))))

(defn collect
  "This method detaches off-heap memory from passed INDArray instances, and optionally stores them in cache for future reuse
  PLEASE NOTE: Cache options depend on specific implementations

  arrays - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^CudaMemoryManager this ^org.nd4j.linalg.api.ndarray.INDArray arrays]
    (-> this (.collect arrays))))

(defn purge-caches
  "This method purges all cached memory chunks
  PLEASE NOTE: This method SHOULD NOT EVER BE USED without being 146% clear of all consequences."
  ([^CudaMemoryManager this]
    (-> this (.purgeCaches))))

(defn memcpy
  "This method provides basic memcpy functionality with respect to target environment

  dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  ([^CudaMemoryManager this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.nd4j.linalg.api.buffer.DataBuffer src-buffer]
    (-> this (.memcpy dst-buffer src-buffer))))

(defn release
  "This method releases previously allocated memory chunk

  pointer - `org.bytedeco.javacpp.Pointer`
  kind - `org.nd4j.linalg.api.memory.enums.MemoryKind`"
  ([^CudaMemoryManager this ^org.bytedeco.javacpp.Pointer pointer ^org.nd4j.linalg.api.memory.enums.MemoryKind kind]
    (-> this (.release pointer kind))))

(defn set-auto-gc-window
  "Description copied from interface: MemoryManager

  window-millis - minimal time milliseconds between calls. - `int`"
  ([^CudaMemoryManager this ^Integer window-millis]
    (-> this (.setAutoGcWindow window-millis))))

(defn memset
  "Description copied from interface: MemoryManager

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^CudaMemoryManager this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.memset array))))

(defn get-bandwidth-use
  "Description copied from interface: MemoryManager

  returns: `java.util.Map<java.lang.Integer,java.lang.Long>`"
  (^java.util.Map [^CudaMemoryManager this]
    (-> this (.getBandwidthUse))))

