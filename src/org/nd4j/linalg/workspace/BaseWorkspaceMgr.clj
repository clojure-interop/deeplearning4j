(ns org.nd4j.linalg.workspace.BaseWorkspaceMgr
  "A standard/baseline WorkspaceMgr implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.workspace BaseWorkspaceMgr]))

(defn assert-open
  "Description copied from interface: WorkspaceMgr

  array-type - Array type to check - `T`
  msg - May be null. If non-null: include this in the exception - `java.lang.String`

  throws: org.nd4j.linalg.workspace.ND4JWorkspaceException - If the specified workspace is not open"
  ([^BaseWorkspaceMgr this array-type ^java.lang.String msg]
    (-> this (.assertOpen array-type msg))))

(defn assert-current-workspace
  "Description copied from interface: WorkspaceMgr

  array-type - Array type to check - `T`
  msg - May be null. Message to include in the exception - `java.lang.String`"
  ([^BaseWorkspaceMgr this array-type ^java.lang.String msg]
    (-> this (.assertCurrentWorkspace array-type msg))))

(defn validate-array-location
  "Description copied from interface: WorkspaceMgr

  array-type - Array type of the array - `T`
  array - Array to check - `org.nd4j.linalg.api.ndarray.INDArray`
  migrate-if-invalid - if true, and array is in the wrong WS: migrate the array and return. If false and inthe wrong WS: exception - `boolean`
  exception-if-detached - If true: if the workspace is detached, but is expected to be in a workspace: should anexception be thrown? - `boolean`

  returns: The original array, or (if required, and if migrateIfInvalid == true) the migrated array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWorkspaceMgr this array-type ^org.nd4j.linalg.api.ndarray.INDArray array ^Boolean migrate-if-invalid ^Boolean exception-if-detached]
    (-> this (.validateArrayLocation array-type array migrate-if-invalid exception-if-detached))))

(defn workspace-open?
  "Description copied from interface: WorkspaceMgr

  array-type - Array type - `T`

  returns: True if the workspace is open (or array type is set to scoped out) - `boolean`"
  (^Boolean [^BaseWorkspaceMgr this array-type]
    (-> this (.isWorkspaceOpen array-type))))

(defn set-workspace-name
  "Description copied from interface: WorkspaceMgr

  array-type - Array type to set the workspace name for - `T`
  name - Workspace name to set - `java.lang.String`"
  ([^BaseWorkspaceMgr this array-type ^java.lang.String name]
    (-> this (.setWorkspaceName array-type name))))

(defn set-workspace
  "Description copied from interface: WorkspaceMgr

  for-enum - Array type - `T`
  ws-name - Workspace name - `java.lang.String`
  configuration - Workspace configuration - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`"
  ([^BaseWorkspaceMgr this for-enum ^java.lang.String ws-name ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration]
    (-> this (.setWorkspace for-enum ws-name configuration))))

(defn scoped-out?
  "array-type - Array type - `T`

  returns: True if the specified array type is set to be scoped out - `boolean`"
  (^Boolean [^BaseWorkspaceMgr this array-type]
    (-> this (.isScopedOut array-type))))

(defn has-configuration?
  "Description copied from interface: WorkspaceMgr

  array-type - Array type to check - `T`

  returns: True if the array type has been configured (either scoped out, or a workspace has been set for this
  array type) - `boolean`"
  (^Boolean [^BaseWorkspaceMgr this array-type]
    (-> this (.hasConfiguration array-type))))

(defn get-workspace-name
  "array-type - Array type to get the workspace name for (if set) - `T`

  returns: The workspace name for the specified array type (or null, if none has been set) - `java.lang.String`"
  (^java.lang.String [^BaseWorkspaceMgr this array-type]
    (-> this (.getWorkspaceName array-type))))

(defn set-scoped-out-for
  "Description copied from interface: WorkspaceMgr

  array-type - Array type to set scoped out for - `T`"
  ([^BaseWorkspaceMgr this array-type]
    (-> this (.setScopedOutFor array-type))))

(defn get-configuration
  "array-type - Array type to get the workspace configuration for - `T`

  returns: Workspace configuration for the specified array type (or note, if no configuration has been set) - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`"
  (^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration [^BaseWorkspaceMgr this array-type]
    (-> this (.getConfiguration array-type))))

(defn notify-scope-borrowed
  "Description copied from interface: WorkspaceMgr

  array-type - Array type to borrow the scope for - `T`

  returns: Workspace - `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^BaseWorkspaceMgr this array-type]
    (-> this (.notifyScopeBorrowed array-type))))

(defn leverage-to
  "Description copied from interface: WorkspaceMgr

  array-type - Array type's workspace to move the array to - `T`
  array - Array to leverage - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Leveraged array (if leveraged, or original array otherwise) - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWorkspaceMgr this array-type ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.leverageTo array-type array))))

(defn create
  "Description copied from interface: WorkspaceMgr

  array-type - Array type - `T`
  shape - Shape - `int[]`
  order - Order of the array - `char`

  returns: Created arary - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWorkspaceMgr this array-type shape ^Character order]
    (-> this (.create array-type shape order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWorkspaceMgr this array-type shape]
    (-> this (.create array-type shape))))

(defn create-uninitialized
  "Description copied from interface: WorkspaceMgr

  array-type - Array type - `T`
  shape - Shape - `int[]`
  order - Order of the array - `char`

  returns: Created array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWorkspaceMgr this array-type shape ^Character order]
    (-> this (.createUninitialized array-type shape order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWorkspaceMgr this array-type shape]
    (-> this (.createUninitialized array-type shape))))

(defn dup
  "Description copied from interface: WorkspaceMgr

  array-type - Array type for the result - `T`
  to-dup - Array to duplicate - `org.nd4j.linalg.api.ndarray.INDArray`
  order - Order for the duplicated array - `char`

  returns: Duplicated array in the specified array type's workspace - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWorkspaceMgr this array-type ^org.nd4j.linalg.api.ndarray.INDArray to-dup ^Character order]
    (-> this (.dup array-type to-dup order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWorkspaceMgr this array-type ^org.nd4j.linalg.api.ndarray.INDArray to-dup]
    (-> this (.dup array-type to-dup))))

(defn notify-scope-entered
  "Description copied from interface: WorkspaceMgr

  array-types - Open the specified workspaces - `T`

  returns: Closeable for the specified workspaces - `org.nd4j.linalg.workspace.WorkspacesCloseable`"
  (^org.nd4j.linalg.workspace.WorkspacesCloseable [^BaseWorkspaceMgr this array-types]
    (-> this (.notifyScopeEntered array-types))))

(defn assert-not-open
  "Description copied from interface: WorkspaceMgr

  array-type - Array type to check - `T`
  msg - May be null. If non-null: include this in the exception - `java.lang.String`"
  ([^BaseWorkspaceMgr this array-type ^java.lang.String msg]
    (-> this (.assertNotOpen array-type msg))))

(defn set-configuration
  "Description copied from interface: WorkspaceMgr

  array-type - Type of array to set the configuration for - `T`
  configuration - Configuration for the specified array type - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`"
  ([^BaseWorkspaceMgr this array-type ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration]
    (-> this (.setConfiguration array-type configuration))))

