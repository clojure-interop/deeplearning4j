(ns org.nd4j.linalg.memory.abstracts.Nd4jWorkspace
  "Basic implementation for
 MemoryWorkspace interface,
 further extended in corresponding backends"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.memory.abstracts Nd4jWorkspace]))

(defn ->nd-4j-workspace
  "Constructor.

  configuration - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`
  workspace-id - `java.lang.String`"
  (^Nd4jWorkspace [^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration ^java.lang.String workspace-id]
    (new Nd4jWorkspace configuration workspace-id))
  (^Nd4jWorkspace [^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration]
    (new Nd4jWorkspace configuration)))

(defn *fill-file
  "file - `java.io.File`
  length - `long`

  throws: java.lang.Exception"
  ([^java.io.File file ^Long length]
    (Nd4jWorkspace/fillFile file length)))

(defn free
  "pointer - `org.bytedeco.javacpp.Pointer`"
  ([^Nd4jWorkspace this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.free pointer))))

(defn get-cycles-count
  "returns: `long`"
  (^Long [^Nd4jWorkspace this]
    (-> this (.getCyclesCount))))

(defn tag-out-of-scope-use
  "Description copied from interface: MemoryWorkspace

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^Nd4jWorkspace this]
    (-> this (.tagOutOfScopeUse))))

(defn get-current-size
  "This method returns current amount of memory allocated for workspace.
  PLEASE NOTE: It shows only amount of HOST memory.
  If current backend assumes DEVICE/HOST memory pair,
  DEVICE memory will probably have the same size, but won't be accounted in this value.

  returns: `long`"
  (^Long [^Nd4jWorkspace this]
    (-> this (.getCurrentSize))))

(defn get-step-number
  "This method returns step number. Viable only in circular mode.

  returns: `long`"
  (^Long [^Nd4jWorkspace this]
    (-> this (.getStepNumber))))

(defn enable-debug
  "This method enabled debugging mode for this workspace

  really-enable - `boolean`"
  ([^Nd4jWorkspace this ^Boolean really-enable]
    (-> this (.enableDebug really-enable))))

(defn get-parent-workspace
  "This method returns parent Workspace, if any. Null if there's none.

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^Nd4jWorkspace this]
    (-> this (.getParentWorkspace))))

(defn initialize-workspace
  "Description copied from interface: MemoryWorkspace"
  ([^Nd4jWorkspace this]
    (-> this (.initializeWorkspace))))

(defn get-number-of-pinned-allocations
  "This method returns number of pinned allocations, they can be purged after 2 steps.
  PLEASE NOTE: This method can return non-zero calues only for circular workspace mode

  returns: `int`"
  (^Integer [^Nd4jWorkspace this]
    (-> this (.getNumberOfPinnedAllocations))))

(defn destroy-workspace
  "This method basically deallocates workspace memory

  extended - `boolean`"
  ([^Nd4jWorkspace this ^Boolean extended]
    (-> this (.destroyWorkspace extended)))
  ([^Nd4jWorkspace this]
    (-> this (.destroyWorkspace))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Nd4jWorkspace this]
    (-> this (.toString))))

(defn reset
  "This method reset host/device offsets within workspace
  PLEASE NOTE: Never call this method unless you realize all consequences"
  ([^Nd4jWorkspace this]
    (-> this (.reset))))

(defn get-initial-block-size
  "This method returns number of bytes for first block of circular workspace.

  returns: `long`"
  (^Long [^Nd4jWorkspace this]
    (-> this (.getInitialBlockSize))))

(defn get-device-offset
  "This method returns current device memory offset within workspace

  returns: `long`"
  (^Long [^Nd4jWorkspace this]
    (-> this (.getDeviceOffset))))

(defn get-last-cycle-allocations
  "This method returns number of bytes allocated during last full cycle

  returns: `long`"
  (^Long [^Nd4jWorkspace this]
    (-> this (.getLastCycleAllocations))))

(defn toggle-workspace-use
  "This method allows to temporary disable this workspace, and issue allocations directly.

  is-enabled - `boolean`"
  ([^Nd4jWorkspace this ^Boolean is-enabled]
    (-> this (.toggleWorkspaceUse is-enabled))))

(defn get-pinned-size
  "This method returns number of bytes in pinned allocations.

  returns: `long`"
  (^Long [^Nd4jWorkspace this]
    (-> this (.getPinnedSize))))

(defn get-spilled-size
  "This method returns number of bytes in spilled allocations.

  returns: `long`"
  (^Long [^Nd4jWorkspace this]
    (-> this (.getSpilledSize))))

(defn alloc
  "Description copied from interface: MemoryWorkspace

  required-memory - allocation size, in bytes - `long`
  kind - MemoryKind for allocation - `org.nd4j.linalg.api.memory.enums.MemoryKind`
  type - dataType that is going to be used - `org.nd4j.linalg.api.buffer.DataBuffer$Type`
  initialize - `boolean`

  returns: `org.nd4j.linalg.api.memory.pointers.PagedPointer`"
  (^org.nd4j.linalg.api.memory.pointers.PagedPointer [^Nd4jWorkspace this ^Long required-memory ^org.nd4j.linalg.api.memory.enums.MemoryKind kind ^org.nd4j.linalg.api.buffer.DataBuffer$Type type ^Boolean initialize]
    (-> this (.alloc required-memory kind type initialize)))
  (^org.nd4j.linalg.api.memory.pointers.PagedPointer [^Nd4jWorkspace this ^Long required-memory ^org.nd4j.linalg.api.buffer.DataBuffer$Type type ^Boolean initialize]
    (-> this (.alloc required-memory type initialize))))

(defn get-this-cycle-allocations
  "This method returns number of bytes allocated during THIS cycle

  returns: `long`"
  (^Long [^Nd4jWorkspace this]
    (-> this (.getThisCycleAllocations))))

(defn get-max-cycle-allocations
  "This method returns number of bytes of biggest cycle

  returns: `long`"
  (^Long [^Nd4jWorkspace this]
    (-> this (.getMaxCycleAllocations))))

(defn close
  "Description copied from interface: MemoryWorkspace"
  ([^Nd4jWorkspace this]
    (-> this (.close))))

(defn notify-scope-borrowed
  "This method TEMPORARY enters this workspace, without reset applied

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^Nd4jWorkspace this]
    (-> this (.notifyScopeBorrowed))))

(defn get-number-of-external-allocations
  "This method returns number of spilled allocations, that can be purged at the end of block

  returns: `int`"
  (^Integer [^Nd4jWorkspace this]
    (-> this (.getNumberOfExternalAllocations))))

(defn get-generation-id
  "Description copied from interface: MemoryWorkspace

  returns: `long`"
  (^Long [^Nd4jWorkspace this]
    (-> this (.getGenerationId))))

(defn notify-scope-entered
  "Description copied from interface: MemoryWorkspace

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^Nd4jWorkspace this]
    (-> this (.notifyScopeEntered))))

(defn notify-scope-left
  "This method is shortcut to close() method

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^Nd4jWorkspace this]
    (-> this (.notifyScopeLeft))))

(defn get-workspace-type
  "Description copied from interface: MemoryWorkspace

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace$Type`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace$Type [^Nd4jWorkspace this]
    (-> this (.getWorkspaceType))))

(defn get-host-offset
  "This method returns current host memory offset within workspace

  returns: `long`"
  (^Long [^Nd4jWorkspace this]
    (-> this (.getHostOffset))))

(defn scope-active?
  "This method returns True if scope was opened, and not closed yet.

  returns: `boolean`"
  (^Boolean [^Nd4jWorkspace this]
    (-> this (.isScopeActive))))

