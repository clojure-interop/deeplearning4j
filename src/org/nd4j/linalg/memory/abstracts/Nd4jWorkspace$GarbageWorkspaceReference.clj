(ns org.nd4j.linalg.memory.abstracts.Nd4jWorkspace$GarbageWorkspaceReference
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.memory.abstracts Nd4jWorkspace$GarbageWorkspaceReference]))

(defn ->garbage-workspace-reference
  "Constructor.

  referent - `org.nd4j.linalg.api.memory.MemoryWorkspace`
  queue - `java.lang.ref.ReferenceQueue`"
  (^Nd4jWorkspace$GarbageWorkspaceReference [^org.nd4j.linalg.api.memory.MemoryWorkspace referent ^java.lang.ref.ReferenceQueue queue]
    (new Nd4jWorkspace$GarbageWorkspaceReference referent queue)))

