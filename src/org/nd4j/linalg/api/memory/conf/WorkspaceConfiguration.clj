(ns org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration
  "This class is configuration bean for MemoryWorkspace.
 It allows you to specify workspace parameters, and will define workspace behaviour."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.memory.conf WorkspaceConfiguration]))

(defn ->workspace-configuration
  "Constructor."
  (^WorkspaceConfiguration []
    (new WorkspaceConfiguration )))

