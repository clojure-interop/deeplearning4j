(ns org.nd4j.linalg.memory.provider.BasicWorkspaceManager
  "Workspace manager implementation. Please note, this class is supposed to be used via Nd4j.getWorkspaceManager(), to provide consistency between different threads within given JVM process"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.memory.provider BasicWorkspaceManager]))

(defn ->basic-workspace-manager
  "Constructor.

  default-configuration - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`"
  (^BasicWorkspaceManager [^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration default-configuration]
    (new BasicWorkspaceManager default-configuration))
  (^BasicWorkspaceManager []
    (new BasicWorkspaceManager )))

(def *-workspace-deallocator-thread-name
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  BasicWorkspaceManager/WorkspaceDeallocatorThreadName)

(defn set-workspace-for-current-thread
  "Description copied from interface: MemoryWorkspaceManager

  workspace - `org.nd4j.linalg.api.memory.MemoryWorkspace`
  id - `java.lang.String`"
  ([^BasicWorkspaceManager this ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace ^java.lang.String id]
    (-> this (.setWorkspaceForCurrentThread workspace id)))
  ([^BasicWorkspaceManager this ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace]
    (-> this (.setWorkspaceForCurrentThread workspace))))

(defn get-workspace-for-current-thread
  "Description copied from interface: MemoryWorkspaceManager

  id - `java.lang.String`

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^BasicWorkspaceManager this ^java.lang.String id]
    (-> this (.getWorkspaceForCurrentThread id)))
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^BasicWorkspaceManager this]
    (-> this (.getWorkspaceForCurrentThread))))

(defn set-default-workspace-configuration
  "This method allows to specify \"Default\" configuration, that will be used in signatures which do not have WorkspaceConfiguration argument

  configuration - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`"
  ([^BasicWorkspaceManager this ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration]
    (-> this (.setDefaultWorkspaceConfiguration configuration))))

(defn print-allocation-statistics-for-current-thread
  "This method prints out basic statistics for workspaces allocated in current thread"
  ([^BasicWorkspaceManager this]
    (-> this (.printAllocationStatisticsForCurrentThread))))

(defn destroy-workspace
  "This method destroys given workspace

  workspace - `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  ([^BasicWorkspaceManager this ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace]
    (-> this (.destroyWorkspace workspace)))
  ([^BasicWorkspaceManager this]
    (-> this (.destroyWorkspace))))

(defn scope-out-of-workspaces
  "This method temporary opens block out of any workspace scope.

  PLEASE NOTE: Do not forget to close this block.

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^BasicWorkspaceManager this]
    (-> this (.scopeOutOfWorkspaces))))

(defn get-all-workspaces-ids-for-current-thread
  "Description copied from interface: MemoryWorkspaceManager

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BasicWorkspaceManager this]
    (-> this (.getAllWorkspacesIdsForCurrentThread))))

(defn check-if-workspace-exists-and-active
  "Description copied from interface: MemoryWorkspaceManager

  id - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^BasicWorkspaceManager this ^java.lang.String id]
    (-> this (.checkIfWorkspaceExistsAndActive id))))

(defn get-and-activate-workspace
  "This method gets & activates default with a given configuration and Id

  configuration - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`
  id - `java.lang.String`

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^BasicWorkspaceManager this ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration ^java.lang.String id]
    (-> this (.getAndActivateWorkspace configuration id)))
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^BasicWorkspaceManager this ^java.lang.String id]
    (-> this (.getAndActivateWorkspace id)))
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^BasicWorkspaceManager this]
    (-> this (.getAndActivateWorkspace))))

(defn get-all-workspaces-for-current-thread
  "Description copied from interface: MemoryWorkspaceManager

  returns: `java.util.List<org.nd4j.linalg.api.memory.MemoryWorkspace>`"
  (^java.util.List [^BasicWorkspaceManager this]
    (-> this (.getAllWorkspacesForCurrentThread))))

(defn get-uuid
  "Returns globally unique ID

  returns: `java.lang.String`"
  (^java.lang.String [^BasicWorkspaceManager this]
    (-> this (.getUUID))))

(defn any-workspace-active-for-current-thread
  "Description copied from interface: MemoryWorkspaceManager

  returns: True if any workspaces are open for this thread, false otherwise - `boolean`"
  (^Boolean [^BasicWorkspaceManager this]
    (-> this (.anyWorkspaceActiveForCurrentThread))))

(defn set-debug-mode
  "Description copied from interface: MemoryWorkspaceManager

  mode - `org.nd4j.linalg.api.memory.enums.DebugMode`"
  ([^BasicWorkspaceManager this ^org.nd4j.linalg.api.memory.enums.DebugMode mode]
    (-> this (.setDebugMode mode))))

(defn check-if-workspace-exists
  "This method checks, if Workspace with a given Id was created before this call

  id - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^BasicWorkspaceManager this ^java.lang.String id]
    (-> this (.checkIfWorkspaceExists id))))

(defn get-debug-mode
  "Description copied from interface: MemoryWorkspaceManager

  returns: `org.nd4j.linalg.api.memory.enums.DebugMode`"
  (^org.nd4j.linalg.api.memory.enums.DebugMode [^BasicWorkspaceManager this]
    (-> this (.getDebugMode))))

(defn destroy-all-workspaces-for-current-thread
  "This method destroys all workspaces allocated in current thread"
  ([^BasicWorkspaceManager this]
    (-> this (.destroyAllWorkspacesForCurrentThread))))

