(ns org.nd4j.linalg.memory.BasicMemoryManager
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.memory BasicMemoryManager]))

(defn ->basic-memory-manager
  "Constructor."
  (^BasicMemoryManager []
    (new BasicMemoryManager )))

(defn purge-caches
  "This method purges all cached memory chunks"
  ([^BasicMemoryManager this]
    (-> this (.purgeCaches))))

(defn set-auto-gc-window
  "Description copied from interface: MemoryManager

  window-millis - minimal time milliseconds between calls. - `int`"
  ([^BasicMemoryManager this ^Integer window-millis]
    (-> this (.setAutoGcWindow window-millis))))

(defn get-current-workspace
  "returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^BasicMemoryManager this]
    (-> this (.getCurrentWorkspace))))

(defn get-auto-gc-window
  "Description copied from interface: MemoryManager

  returns: `int`"
  (^Integer [^BasicMemoryManager this]
    (-> this (.getAutoGcWindow))))

(defn toggle-averaging
  "Description copied from interface: MemoryManager

  enabled - `boolean`"
  ([^BasicMemoryManager this ^Boolean enabled]
    (-> this (.toggleAveraging enabled))))

(defn memcpy
  "Description copied from interface: MemoryManager

  dst-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  src-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  ([^BasicMemoryManager this ^org.nd4j.linalg.api.buffer.DataBuffer dst-buffer ^org.nd4j.linalg.api.buffer.DataBuffer src-buffer]
    (-> this (.memcpy dst-buffer src-buffer))))

(defn allocate
  "This method returns
  PLEASE NOTE: Cache options
  depend on specific implementations

  bytes - `long`
  kind - `org.nd4j.linalg.api.memory.enums.MemoryKind`
  initialize - `boolean`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^BasicMemoryManager this ^Long bytes ^org.nd4j.linalg.api.memory.enums.MemoryKind kind ^Boolean initialize]
    (-> this (.allocate bytes kind initialize))))

(defn scope-out-of-workspaces
  "Description copied from interface: MemoryManager

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^BasicMemoryManager this]
    (-> this (.scopeOutOfWorkspaces))))

(defn get-average-loop-time
  "Description copied from interface: MemoryManager

  returns: `int`"
  (^Integer [^BasicMemoryManager this]
    (-> this (.getAverageLoopTime))))

(defn get-last-gc-time
  "Description copied from interface: MemoryManager

  returns: `long`"
  (^Long [^BasicMemoryManager this]
    (-> this (.getLastGcTime))))

(defn get-occasional-gc-frequency
  "Description copied from interface: MemoryManager

  returns: `int`"
  (^Integer [^BasicMemoryManager this]
    (-> this (.getOccasionalGcFrequency))))

(defn set-occasional-gc-frequency
  "Description copied from interface: MemoryManager

  frequency - `int`"
  ([^BasicMemoryManager this ^Integer frequency]
    (-> this (.setOccasionalGcFrequency frequency))))

(defn set-current-workspace
  "workspace - `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  ([^BasicMemoryManager this ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace]
    (-> this (.setCurrentWorkspace workspace))))

(defn invoke-gc-occasionally
  "Description copied from interface: MemoryManager"
  ([^BasicMemoryManager this]
    (-> this (.invokeGcOccasionally))))

(defn collect
  "This method detaches off-heap memory from passed INDArray instances, and optionally stores them in cache for future reuse
  PLEASE NOTE: Cache options depend on specific implementations

  arrays - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BasicMemoryManager this ^org.nd4j.linalg.api.ndarray.INDArray arrays]
    (-> this (.collect arrays))))

(defn periodic-gc-active?
  "Description copied from interface: MemoryManager

  returns: `boolean`"
  (^Boolean [^BasicMemoryManager this]
    (-> this (.isPeriodicGcActive))))

(defn invoke-gc
  "Description copied from interface: MemoryManager"
  ([^BasicMemoryManager this]
    (-> this (.invokeGc))))

(defn notify-scope-entered
  "Description copied from interface: MemoryManager"
  ([^BasicMemoryManager this]
    (-> this (.notifyScopeEntered))))

(defn notify-scope-left
  "Description copied from interface: MemoryManager"
  ([^BasicMemoryManager this]
    (-> this (.notifyScopeLeft))))

(defn toggle-periodic-gc
  "Description copied from interface: MemoryManager

  enabled - `boolean`"
  ([^BasicMemoryManager this ^Boolean enabled]
    (-> this (.togglePeriodicGc enabled))))

