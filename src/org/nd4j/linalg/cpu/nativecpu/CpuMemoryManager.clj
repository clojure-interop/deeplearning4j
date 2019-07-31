(ns org.nd4j.linalg.cpu.nativecpu.CpuMemoryManager
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu CpuMemoryManager]))

(defn ->cpu-memory-manager
  "Constructor."
  (^CpuMemoryManager []
    (new CpuMemoryManager )))

(defn allocate
  "This method returns
  PLEASE NOTE: Cache options depend on specific implementations

  bytes - `long`
  kind - `org.nd4j.linalg.api.memory.enums.MemoryKind`
  initialize - `boolean`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^CpuMemoryManager this ^Long bytes ^org.nd4j.linalg.api.memory.enums.MemoryKind kind ^Boolean initialize]
    (-> this (.allocate bytes kind initialize))))

(defn release
  "This method releases previously allocated memory chunk

  pointer - `org.bytedeco.javacpp.Pointer`
  kind - `org.nd4j.linalg.api.memory.enums.MemoryKind`"
  ([^CpuMemoryManager this ^org.bytedeco.javacpp.Pointer pointer ^org.nd4j.linalg.api.memory.enums.MemoryKind kind]
    (-> this (.release pointer kind))))

(defn collect
  "This method detaches off-heap memory from passed INDArray instances, and optionally stores them in cache for future reuse
  PLEASE NOTE: Cache options depend on specific implementations

  arrays - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^CpuMemoryManager this ^org.nd4j.linalg.api.ndarray.INDArray arrays]
    (-> this (.collect arrays))))

(defn periodic-gc-active?
  "Nd4j-native backend doesn't use periodic GC. This method will always return false.

  returns: `boolean`"
  (^Boolean [^CpuMemoryManager this]
    (-> this (.isPeriodicGcActive))))

(defn memset
  "Description copied from interface: MemoryManager

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^CpuMemoryManager this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.memset array))))

(defn get-bandwidth-use
  "Description copied from interface: MemoryManager

  returns: `java.util.Map<java.lang.Integer,java.lang.Long>`"
  (^java.util.Map [^CpuMemoryManager this]
    (-> this (.getBandwidthUse))))

