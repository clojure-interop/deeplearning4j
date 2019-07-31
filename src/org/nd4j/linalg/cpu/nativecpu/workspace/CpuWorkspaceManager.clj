(ns org.nd4j.linalg.cpu.nativecpu.workspace.CpuWorkspaceManager
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu.workspace CpuWorkspaceManager]))

(defn ->cpu-workspace-manager
  "Constructor."
  (^CpuWorkspaceManager []
    (new CpuWorkspaceManager )))

(defn create-new-workspace
  "Description copied from interface: MemoryWorkspaceManager

  configuration - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`
  id - `java.lang.String`
  device-id - `java.lang.Integer`

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^CpuWorkspaceManager this ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration ^java.lang.String id ^java.lang.Integer device-id]
    (-> this (.createNewWorkspace configuration id device-id)))
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^CpuWorkspaceManager this ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration ^java.lang.String id]
    (-> this (.createNewWorkspace configuration id)))
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^CpuWorkspaceManager this ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration]
    (-> this (.createNewWorkspace configuration)))
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^CpuWorkspaceManager this]
    (-> this (.createNewWorkspace))))

(defn get-workspace-for-current-thread
  "Description copied from interface: MemoryWorkspaceManager

  configuration - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`
  id - `java.lang.String`

  returns: `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^CpuWorkspaceManager this ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration ^java.lang.String id]
    (-> this (.getWorkspaceForCurrentThread configuration id))))

