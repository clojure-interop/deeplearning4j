(ns org.nd4j.linalg.workspace.WorkspacesCloseable
  "An AutoCloseable for multiple workspaces
 NOTE: Workspaces are closed in REVERSED order to how they are provided to the costructor;
 this is to mirror nested workspace use"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.workspace WorkspacesCloseable]))

(defn ->workspaces-closeable
  "Constructor.

  workspaces - `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^WorkspacesCloseable [^org.nd4j.linalg.api.memory.MemoryWorkspace workspaces]
    (new WorkspacesCloseable workspaces)))

(defn close
  ""
  ([^WorkspacesCloseable this]
    (-> this (.close))))

