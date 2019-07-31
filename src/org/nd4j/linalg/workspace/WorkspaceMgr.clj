(ns org.nd4j.linalg.workspace.WorkspaceMgr
  "WorkspaceMgr is an interface for managing a set of workspaces, for a set of array types (where the array types
 are specified by an enumeration).
 Note that multiple array types may be stored in the one underlying workspace"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.workspace WorkspaceMgr]))

(defn assert-open
  "Assert thath the workspace for the specified array type is open.
  For array types that are set to scoped out, this will be treated as a no-op

  array-type - Array type to check - `T`
  msg - May be null. If non-null: include this in the exception - `java.lang.String`

  throws: org.nd4j.linalg.workspace.ND4JWorkspaceException - If the specified workspace is not open"
  ([^WorkspaceMgr this array-type ^java.lang.String msg]
    (-> this (.assertOpen array-type msg))))

(defn assert-current-workspace
  "Assert that the current workspace is the one for the specified array type.
  As per isWorkspaceOpen(Enum) scoped out array types are ignored here.

  array-type - Array type to check - `T`
  msg - May be null. Message to include in the exception - `java.lang.String`

  throws: org.nd4j.linalg.workspace.ND4JWorkspaceException"
  ([^WorkspaceMgr this array-type ^java.lang.String msg]
    (-> this (.assertCurrentWorkspace array-type msg))))

(defn validate-array-location
  "Validate that the specified array type is actually in the workspace it's supposed to be in

  array-type - Array type of the array - `T`
  array - Array to check - `org.nd4j.linalg.api.ndarray.INDArray`
  migrate-if-invalid - if true, and array is in the wrong WS: migrate the array and return. If false and inthe wrong WS: exception - `boolean`
  exception-if-detached - If true: if the workspace is detached, but is expected to be in a workspace: should anexception be thrown? - `boolean`

  returns: The original array, or (if required, and if migrateIfInvalid == true) the migrated array - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: org.nd4j.linalg.workspace.ND4JWorkspaceException - If the array is in the incorrect workspace (and migrateIfInvalid == false)"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WorkspaceMgr this array-type ^org.nd4j.linalg.api.ndarray.INDArray array ^Boolean migrate-if-invalid ^Boolean exception-if-detached]
    (-> this (.validateArrayLocation array-type array migrate-if-invalid exception-if-detached))))

(defn workspace-open?
  "Check if the workspace for the specified array type is open. If the array type is set to be scoped out,
  this will return true

  array-type - Array type - `T`

  returns: True if the workspace is open (or array type is set to scoped out) - `boolean`"
  (^Boolean [^WorkspaceMgr this array-type]
    (-> this (.isWorkspaceOpen array-type))))

(defn set-workspace-name
  "Set the workspace name for the specified array type

  array-type - Array type to set the workspace name for - `T`
  ws-name - Workspace name to set - `java.lang.String`"
  ([^WorkspaceMgr this array-type ^java.lang.String ws-name]
    (-> this (.setWorkspaceName array-type ws-name))))

(defn set-workspace
  "Seth the workspace name and configuration for the specified array type

  array-type - Array type - `T`
  ws-name - Workspace name - `java.lang.String`
  configuration - Workspace configuration - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`"
  ([^WorkspaceMgr this array-type ^java.lang.String ws-name ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration]
    (-> this (.setWorkspace array-type ws-name configuration))))

(defn scoped-out?
  "array-type - Array type - `T`

  returns: True if the specified array type is set to be scoped out - `boolean`"
  (^Boolean [^WorkspaceMgr this array-type]
    (-> this (.isScopedOut array-type))))

(defn has-configuration?
  "Has the specified array type been configured in this workspace manager?

  array-type - Array type to check - `T`

  returns: True if the array type has been configured (either scoped out, or a workspace has been set for this
  array type) - `boolean`"
  (^Boolean [^WorkspaceMgr this array-type]
    (-> this (.hasConfiguration array-type))))

(defn get-workspace-name
  "array-type - Array type to get the workspace name for (if set) - `T`

  returns: The workspace name for the specified array type (or null, if none has been set) - `java.lang.String`"
  (^java.lang.String [^WorkspaceMgr this array-type]
    (-> this (.getWorkspaceName array-type))))

(defn set-scoped-out-for
  "Set arrays to be scoped out (not in any workspace) for the specified array type.
  This means that create, dup, leverage etc methods will return result arrays that are not attached to any workspace

  array-type - Array type to set scoped out for - `T`"
  ([^WorkspaceMgr this array-type]
    (-> this (.setScopedOutFor array-type))))

(defn get-configuration
  "array-type - Array type to get the workspace configuration for - `T`

  returns: Workspace configuration for the specified array type (or note, if no configuration has been set) - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`"
  (^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration [^WorkspaceMgr this array-type]
    (-> this (.getConfiguration array-type))))

(defn notify-scope-borrowed
  "Borrow the scope for the specified array type

  array-type - Array type to borrow the scope for - `T`

  returns: Workspace - `org.nd4j.linalg.api.memory.MemoryWorkspace`"
  (^org.nd4j.linalg.api.memory.MemoryWorkspace [^WorkspaceMgr this array-type]
    (-> this (.notifyScopeBorrowed array-type))))

(defn leverage-to
  "Leverage the array to the specified array type's workspace (or detach if required).
  If the array is not attached (not defined in a workspace) - array is returned unmodified

  to-workspace - Array type's workspace to move the array to - `T`
  array - Array to leverage - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Leveraged array (if leveraged, or original array otherwise) - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WorkspaceMgr this to-workspace ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.leverageTo to-workspace array))))

(defn create
  "Create an array in the specified array type's workspace (or detached if none is specified).
  Equivalent to Nd4j.create(int[],char), other than the array location

  array-type - Array type - `T`
  shape - Shape - `int[]`
  ordering - Order of the array - `char`

  returns: Created arary - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WorkspaceMgr this array-type shape ^Character ordering]
    (-> this (.create array-type shape ordering)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^WorkspaceMgr this array-type shape]
    (-> this (.create array-type shape))))

(defn create-uninitialized
  "Create an uninitialized array in the specified array type's workspace (or detached if none is specified).
  Equivalent to Nd4j.createUninitialized(int[], char)}, other than the array location

  array-type - Array type - `T`
  shape - Shape - `int[]`
  order - Order of the array - `char`

  returns: Created array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WorkspaceMgr this array-type shape ^Character order]
    (-> this (.createUninitialized array-type shape order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^WorkspaceMgr this array-type shape]
    (-> this (.createUninitialized array-type shape))))

(defn dup
  "Duplicate the array, where the array is put into the specified array type's workspace (if applicable)

  array-type - Array type for the result - `T`
  to-dup - Array to duplicate - `org.nd4j.linalg.api.ndarray.INDArray`
  order - Order for the duplicated array - `char`

  returns: Duplicated array in the specified array type's workspace - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WorkspaceMgr this array-type ^org.nd4j.linalg.api.ndarray.INDArray to-dup ^Character order]
    (-> this (.dup array-type to-dup order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^WorkspaceMgr this array-type ^org.nd4j.linalg.api.ndarray.INDArray to-dup]
    (-> this (.dup array-type to-dup))))

(defn notify-scope-entered
  "Open/enter multiple workspaces. This is equivalent to nested opening of the specified workspaces

  array-types - Open the specified workspaces - `T`

  returns: Closeable for the specified workspaces - `org.nd4j.linalg.workspace.WorkspacesCloseable`"
  (^org.nd4j.linalg.workspace.WorkspacesCloseable [^WorkspaceMgr this array-types]
    (-> this (.notifyScopeEntered array-types))))

(defn assert-not-open
  "Assert thath the workspace for the specified array type is not open.
  For array types that are set to scoped out, this will be treated as a no-op

  array-type - Array type to check - `T`
  msg - May be null. If non-null: include this in the exception - `java.lang.String`

  throws: org.nd4j.linalg.workspace.ND4JWorkspaceException - If the specified workspace is open"
  ([^WorkspaceMgr this array-type ^java.lang.String msg]
    (-> this (.assertNotOpen array-type msg))))

(defn set-configuration
  "Set the workspace configuration for the specified array type

  array-type - Type of array to set the configuration for - `T`
  configuration - Configuration for the specified array type - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`"
  ([^WorkspaceMgr this array-type ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration]
    (-> this (.setConfiguration array-type configuration))))

