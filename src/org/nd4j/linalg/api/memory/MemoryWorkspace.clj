(ns org.nd4j.linalg.api.memory.MemoryWorkspace
  "This interface describes reusable memory chunks abstraction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.memory MemoryWorkspace]))

(defn tag-out-of-scope-use
  "This method temporary disables this workspace

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryWorkspace this]
    (-> this (.tagOutOfScopeUse))))

(defn get-current-size
  "This methos returns current allocated size of this workspace

  returns: `long`"
  (^Long [^MemoryWorkspace this]
    (-> this (.getCurrentSize))))

(defn get-thread-id
  "This method returns threadId where this workspace was created

  returns: `java.lang.Long`"
  (^java.lang.Long [^MemoryWorkspace this]
    (-> this (.getThreadId))))

(defn enable-debug
  "This method enabled debugging mode for this workspace

  really-enable - `boolean`"
  ([^MemoryWorkspace this ^Boolean really-enable]
    (-> this (.enableDebug really-enable))))

(defn get-parent-workspace
  "This method returns parent Workspace, if any. Null if there's none.

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryWorkspace this]
    (-> this (.getParentWorkspace))))

(defn set-previous-workspace
  "Set the previous workspace, if any
  NOTE: this method should only be used if you are fully aware of the consequences of doing so. Incorrect use
  of this method may leave workspace management in an invalid/indeterminant state!

  memory-workspace - Workspace to set as the previous workspace. This is the workspace that will become activewhen this workspace is closed. - `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  ([^MemoryWorkspace this ^org.nd4j.linalg.api.memory.MemoryWorkspace memory-workspace]
    (-> this (.setPreviousWorkspace memory-workspace))))

(defn initialize-workspace
  "This method causes Workspace initialization
  PLEASE NOTE: This call will have no effect on previously initialized Workspace"
  ([^MemoryWorkspace this]
    (-> this (.initializeWorkspace))))

(defn destroy-workspace
  "This method causes Workspace destruction: all memory allocations are released after this call."
  ([^MemoryWorkspace this]
    (-> this (.destroyWorkspace)))
  ([^MemoryWorkspace this ^Boolean extended]
    (-> this (.destroyWorkspace extended))))

(defn get-last-cycle-allocations
  "This method returns amount of memory consumed in last successful cycle, in bytes

  returns: `long`"
  (^Long [^MemoryWorkspace this]
    (-> this (.getLastCycleAllocations))))

(defn toggle-workspace-use
  "This method allows you to temporary disable/enable given Workspace use.
  If turned off - direct memory allocations will be used.

  is-enabled - `boolean`"
  ([^MemoryWorkspace this ^Boolean is-enabled]
    (-> this (.toggleWorkspaceUse is-enabled))))

(defn alloc
  "This method does allocation from a given Workspace

  required-memory - allocation size, in bytes - `long`
  kind - MemoryKind for allocation - `org.nd4j.linalg.api.memory.enums.MemoryKind`
  data-type - dataType that is going to be used - `org.nd4j.linalg.api.buffer.DataBuffer$Type`
  initialize - `boolean`

  returns: `org.nd4j.linalg.api.memory.pointers.PagedPointer`"
  (^org.nd4j.linalg.api.memory.pointers.PagedPointer [^MemoryWorkspace this ^Long required-memory ^org.nd4j.linalg.api.memory.enums.MemoryKind kind ^org.nd4j.linalg.api.buffer.DataBuffer$Type data-type ^Boolean initialize]
    (-> this (.alloc required-memory kind data-type initialize)))
  (^org.nd4j.linalg.api.memory.pointers.PagedPointer [^MemoryWorkspace this ^Long required-memory ^org.nd4j.linalg.api.buffer.DataBuffer$Type data-type ^Boolean initialize]
    (-> this (.alloc required-memory data-type initialize))))

(defn get-this-cycle-allocations
  "This method returns amount of memory consumed in current cycle, in bytes

  returns: `long`"
  (^Long [^MemoryWorkspace this]
    (-> this (.getThisCycleAllocations))))

(defn get-device-id
  "Returns deviceId for this workspace

  returns: `int`"
  (^Integer [^MemoryWorkspace this]
    (-> this (.getDeviceId))))

(defn get-max-cycle-allocations
  "This method returns amount of memory consumed by largest successful cycle, in bytes

  returns: `long`"
  (^Long [^MemoryWorkspace this]
    (-> this (.getMaxCycleAllocations))))

(defn get-id
  "This method returns Id of this workspace

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryWorkspace this]
    (-> this (.getId))))

(defn close
  "This method is for compatibility with \"try-with-resources\" java blocks.
  Internally it should be equal to notifyScopeLeft() method"
  ([^MemoryWorkspace this]
    (-> this (.close))))

(defn notify-scope-borrowed
  "This method TEMPORARY enters this workspace, without reset applied

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryWorkspace this]
    (-> this (.notifyScopeBorrowed))))

(defn get-workspace-configuration
  "This method returns WorkspaceConfiguration bean that was used for given Workspace instance

  returns: `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`"
  (^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration [^MemoryWorkspace this]
    (-> this (.getWorkspaceConfiguration))))

(defn get-generation-id
  "This method returns current generation Id

  returns: `long`"
  (^Long [^MemoryWorkspace this]
    (-> this (.getGenerationId))))

(defn notify-scope-entered
  "This method notifies given Workspace that new use cycle is starting now

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryWorkspace this]
    (-> this (.notifyScopeEntered))))

(defn notify-scope-left
  "This method notifies given Workspace that use cycle just ended

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryWorkspace this]
    (-> this (.notifyScopeLeft))))

(defn get-workspace-type
  "This method returns Type of this workspace

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace$Type`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace$Type [^MemoryWorkspace this]
    (-> this (.getWorkspaceType))))

(defn scope-active?
  "This method returns True if scope was opened, and not closed yet.

  returns: `boolean`"
  (^Boolean [^MemoryWorkspace this]
    (-> this (.isScopeActive))))

