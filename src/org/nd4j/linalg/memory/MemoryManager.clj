(ns org.nd4j.linalg.memory.MemoryManager
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.memory MemoryManager]))

(defn release
  "This method releases previously allocated memory chunk

  pointer - `org.bytedeco.javacpp.Pointer`
  kind - `org.nd4j.linalg.api.memory.enums.MemoryKind`"
  ([^MemoryManager this ^org.bytedeco.javacpp.Pointer pointer ^org.nd4j.linalg.api.memory.enums.MemoryKind kind]
    (-> this (.release pointer kind))))

(defn purge-caches
  "This method purges all cached memory chunks"
  ([^MemoryManager this]
    (-> this (.purgeCaches))))

(defn set-auto-gc-window
  "This method enables/disables periodic System.gc() calls.
  Set to 0 to disable this option.

  window-millis - minimal time milliseconds between calls. - `int`"
  ([^MemoryManager this ^Integer window-millis]
    (-> this (.setAutoGcWindow window-millis))))

(defn get-current-workspace
  "returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryManager this]
    (-> this (.getCurrentWorkspace))))

(defn get-auto-gc-window
  "This method reutrns

  returns: `int`"
  (^Integer [^MemoryManager this]
    (-> this (.getAutoGcWindow))))

(defn toggle-averaging
  "This method enables/disables calculation of average time spent within loops
  Default: false

  enabled - `boolean`"
  ([^MemoryManager this ^Boolean enabled]
    (-> this (.toggleAveraging enabled))))

(defn memset
  "This method fills given INDArray with zeroes.
  PLEASE NOTE: Can't be efficiently used on views, .assign(0.0) will be used instead

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MemoryManager this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.memset array))))

(defn memcpy
  "This method does memcpy from source buffer to destination buffer
  PLEASE NOTE: This method is NOT safe.

  dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  ([^MemoryManager this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.nd4j.linalg.api.buffer.DataBuffer src-buffer]
    (-> this (.memcpy dst-buffer src-buffer))))

(defn allocate
  "This method returns pointer to allocated memory
  PLEASE NOTE: Cache options depend on specific implementations

  bytes - `long`
  kind - `org.nd4j.linalg.api.memory.enums.MemoryKind`
  initialize - `boolean`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^MemoryManager this ^Long bytes ^org.nd4j.linalg.api.memory.enums.MemoryKind kind ^Boolean initialize]
    (-> this (.allocate bytes kind initialize))))

(defn scope-out-of-workspaces
  "This method temporary opens block out of any workspace scope.
  PLEASE NOTE: Do not forget to close this block.

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryManager this]
    (-> this (.scopeOutOfWorkspaces))))

(defn get-average-loop-time
  "This method returns average time between invokeGCOccasionally() calls

  returns: `int`"
  (^Integer [^MemoryManager this]
    (-> this (.getAverageLoopTime))))

(defn get-last-gc-time
  "This method returns time (in milliseconds) of the las System.gc() call

  returns: `long`"
  (^Long [^MemoryManager this]
    (-> this (.getLastGcTime))))

(defn get-occasional-gc-frequency
  "This method returns

  returns: `int`"
  (^Integer [^MemoryManager this]
    (-> this (.getOccasionalGcFrequency))))

(defn set-occasional-gc-frequency
  "Sets manual GC invocation frequency. If you set it to 5, only 1/5 of calls will result in GC invocation
  If 0 is used as frequency, it'll disable all manual invocation hooks.
  default value: 5

  frequency - `int`"
  ([^MemoryManager this ^Integer frequency]
    (-> this (.setOccasionalGcFrequency frequency))))

(defn set-current-workspace
  "workspace - `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  ([^MemoryManager this ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace]
    (-> this (.setCurrentWorkspace workspace))))

(defn invoke-gc-occasionally
  "This method calls for GC, and if frequency is met - System.gc() will be called"
  ([^MemoryManager this]
    (-> this (.invokeGcOccasionally))))

(defn collect
  "This method detaches off-heap memory from passed INDArray instances, and optionally stores them in cache for future reuse
  PLEASE NOTE: Cache options depend on specific implementations

  arrays - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^MemoryManager this ^org.nd4j.linalg.api.ndarray.INDArray arrays]
    (-> this (.collect arrays))))

(defn periodic-gc-active?
  "This method returns true, if periodic GC is active. False otherwise.

  returns: `boolean`"
  (^Boolean [^MemoryManager this]
    (-> this (.isPeriodicGcActive))))

(defn get-bandwidth-use
  "This method returns per-device bandwidth use for memory transfers

  returns: `java.util.Map<java.lang.Integer,java.lang.Long>`"
  (^java.util.Map [^MemoryManager this]
    (-> this (.getBandwidthUse))))

(defn invoke-gc
  "This method calls for GC."
  ([^MemoryManager this]
    (-> this (.invokeGc))))

(defn notify-scope-entered
  "PLEASE NOTE: This method is under development yet. Do not use it."
  ([^MemoryManager this]
    (-> this (.notifyScopeEntered))))

(defn notify-scope-left
  "PLEASE NOTE: This method is under development yet. Do not use it."
  ([^MemoryManager this]
    (-> this (.notifyScopeLeft))))

(defn toggle-periodic-gc
  "This method enables/disables periodic GC

  enabled - `boolean`"
  ([^MemoryManager this ^Boolean enabled]
    (-> this (.togglePeriodicGc enabled))))

