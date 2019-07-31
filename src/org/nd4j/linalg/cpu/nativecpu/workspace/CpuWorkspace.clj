(ns org.nd4j.linalg.cpu.nativecpu.workspace.CpuWorkspace
  "CPU-only MemoryWorkspace implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu.workspace CpuWorkspace]))

(defn ->cpu-workspace
  "Constructor.

  configuration - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`
  workspace-id - `java.lang.String`
  device-id - `java.lang.Integer`"
  (^CpuWorkspace [^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration ^java.lang.String workspace-id ^java.lang.Integer device-id]
    (new CpuWorkspace configuration workspace-id device-id))
  (^CpuWorkspace [^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration ^java.lang.String workspace-id]
    (new CpuWorkspace configuration workspace-id))
  (^CpuWorkspace [^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration]
    (new CpuWorkspace configuration)))

(defn destroy-workspace
  "Description copied from class: Nd4jWorkspace

  extended - `boolean`"
  ([^CpuWorkspace this ^Boolean extended]
    (-> this (.destroyWorkspace extended))))

