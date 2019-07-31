(ns org.nd4j.jita.workspace.CudaWorkspace
  "CUDA-aware MemoryWorkspace implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.workspace CudaWorkspace]))

(defn ->cuda-workspace
  "Constructor.

  configuration - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`
  workspace-id - `java.lang.String`
  device-id - `java.lang.Integer`"
  (^CudaWorkspace [^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration ^java.lang.String workspace-id ^java.lang.Integer device-id]
    (new CudaWorkspace configuration workspace-id device-id))
  (^CudaWorkspace [^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration ^java.lang.String workspace-id]
    (new CudaWorkspace configuration workspace-id))
  (^CudaWorkspace [^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration]
    (new CudaWorkspace configuration)))

(defn alloc
  "Description copied from interface: MemoryWorkspace

  required-memory - allocation size, in bytes - `long`
  kind - MemoryKind for allocation - `org.nd4j.linalg.api.memory.enums.MemoryKind`
  type - dataType that is going to be used - `org.nd4j.linalg.api.buffer.DataBuffer$Type`
  initialize - `boolean`

  returns: `org.nd4j.linalg.api.memory.pointers.PagedPointer`"
  (^org.nd4j.linalg.api.memory.pointers.PagedPointer [^CudaWorkspace this ^Long required-memory ^org.nd4j.linalg.api.memory.enums.MemoryKind kind ^org.nd4j.linalg.api.buffer.DataBuffer$Type type ^Boolean initialize]
    (-> this (.alloc required-memory kind type initialize)))
  (^org.nd4j.linalg.api.memory.pointers.PagedPointer [^CudaWorkspace this ^Long required-memory ^org.nd4j.linalg.api.buffer.DataBuffer$Type type ^Boolean initialize]
    (-> this (.alloc required-memory type initialize))))

(defn destroy-workspace
  "Description copied from class: Nd4jWorkspace

  extended - `boolean`"
  ([^CudaWorkspace this ^Boolean extended]
    (-> this (.destroyWorkspace extended))))

