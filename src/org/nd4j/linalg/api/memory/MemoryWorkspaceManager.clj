(ns org.nd4j.linalg.api.memory.MemoryWorkspaceManager
  "This interface describes backend-specific implementations of MemoryWorkspaceManager, basically Factory  Thread-based provider"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.memory MemoryWorkspaceManager]))

(defn set-workspace-for-current-thread
  "This method allows you to set given Workspace for spacific Id for current Thread

  workspace - `org.nd4j.linalg.api.memory.MemoryWorkspace`
  id - `java.lang.String`"
  ([^MemoryWorkspaceManager this ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace ^java.lang.String id]
    (-> this (.setWorkspaceForCurrentThread workspace id)))
  ([^MemoryWorkspaceManager this ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace]
    (-> this (.setWorkspaceForCurrentThread workspace))))

(defn create-new-workspace
  "This method builds new Workspace with given configuration

  configuration - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`
  id - `java.lang.String`
  device-id - `java.lang.Integer`

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryWorkspaceManager this ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration ^java.lang.String id ^java.lang.Integer device-id]
    (-> this (.createNewWorkspace configuration id device-id)))
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryWorkspaceManager this ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration ^java.lang.String id]
    (-> this (.createNewWorkspace configuration id)))
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryWorkspaceManager this ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration]
    (-> this (.createNewWorkspace configuration)))
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryWorkspaceManager this]
    (-> this (.createNewWorkspace))))

(defn get-workspace-for-current-thread
  "This method returns you Workspace for a given Id for current Thread
  PLEASE NOTE: If Workspace wasn't defined, new Workspace will be created using given configuration

  configuration - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`
  id - `java.lang.String`

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryWorkspaceManager this ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration ^java.lang.String id]
    (-> this (.getWorkspaceForCurrentThread configuration id)))
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryWorkspaceManager this ^java.lang.String id]
    (-> this (.getWorkspaceForCurrentThread id)))
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryWorkspaceManager this]
    (-> this (.getWorkspaceForCurrentThread))))

(defn set-default-workspace-configuration
  "This method sets default workspace configuration for this provider instance

  configuration - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`"
  ([^MemoryWorkspaceManager this ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration]
    (-> this (.setDefaultWorkspaceConfiguration configuration))))

(defn print-allocation-statistics-for-current-thread
  "This method prints out allocation statistics for current thread"
  ([^MemoryWorkspaceManager this]
    (-> this (.printAllocationStatisticsForCurrentThread))))

(defn destroy-workspace
  "This method allows you to destroy given Workspace

  workspace - `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  ([^MemoryWorkspaceManager this ^org.nd4j.linalg.api.memory.MemoryWorkspace workspace]
    (-> this (.destroyWorkspace workspace)))
  ([^MemoryWorkspaceManager this]
    (-> this (.destroyWorkspace))))

(defn scope-out-of-workspaces
  "This method temporary opens block out of any workspace scope.
  PLEASE NOTE: Do not forget to close this block.

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryWorkspaceManager this]
    (-> this (.scopeOutOfWorkspaces))))

(defn get-all-workspaces-ids-for-current-thread
  "This method returns list of workspace IDs for current thread

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^MemoryWorkspaceManager this]
    (-> this (.getAllWorkspacesIdsForCurrentThread))))

(defn check-if-workspace-exists-and-active
  "This method checks, if Workspace with a given Id was created before this call, AND is active at the moment of call

  id - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^MemoryWorkspaceManager this ^java.lang.String id]
    (-> this (.checkIfWorkspaceExistsAndActive id))))

(defn get-and-activate-workspace
  "This method gets & activates default with a given configuration and Id

  configuration - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`
  id - `java.lang.String`

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryWorkspaceManager this ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration ^java.lang.String id]
    (-> this (.getAndActivateWorkspace configuration id)))
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryWorkspaceManager this ^java.lang.String id]
    (-> this (.getAndActivateWorkspace id)))
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^MemoryWorkspaceManager this]
    (-> this (.getAndActivateWorkspace))))

(defn get-all-workspaces-for-current-thread
  "This method returns all workspaces for current thread

  returns: `java.util.List<org.nd4j.linalg.api.memory.MemoryWorkspace>`"
  (^java.util.List [^MemoryWorkspaceManager this]
    (-> this (.getAllWorkspacesForCurrentThread))))

(defn get-uuid
  "Returns globally unique ID

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryWorkspaceManager this]
    (-> this (.getUUID))))

(defn any-workspace-active-for-current-thread
  "Determine if there are any workspaces open for the current thread.

  returns: True if any workspaces are open for this thread, false otherwise - `boolean`"
  (^Boolean [^MemoryWorkspaceManager this]
    (-> this (.anyWorkspaceActiveForCurrentThread))))

(defn set-debug-mode
  "This method allows to enable (and pick one) global debug mode for workspaces
  Default value: DISABLED

  mode - `org.nd4j.linalg.api.memory.enums.DebugMode`"
  ([^MemoryWorkspaceManager this ^org.nd4j.linalg.api.memory.enums.DebugMode mode]
    (-> this (.setDebugMode mode))))

(defn check-if-workspace-exists
  "This method checks, if Workspace with a given Id was created before this call

  id - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^MemoryWorkspaceManager this ^java.lang.String id]
    (-> this (.checkIfWorkspaceExists id))))

(defn get-debug-mode
  "This method returns current debug mode active in this JVM

  returns: `org.nd4j.linalg.api.memory.enums.DebugMode`"
  (^org.nd4j.linalg.api.memory.enums.DebugMode [^MemoryWorkspaceManager this]
    (-> this (.getDebugMode))))

(defn destroy-all-workspaces-for-current-thread
  "This method destroys & deallocates all Workspaces for a calling Thread
  PLEASE NOTE: This method is NOT safe"
  ([^MemoryWorkspaceManager this]
    (-> this (.destroyAllWorkspacesForCurrentThread))))

