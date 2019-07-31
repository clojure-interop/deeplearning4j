(ns org.deeplearning4j.nn.workspace.LayerWorkspaceMgr
  "WorkspaceMgr for DL4J layers.
 Used to flexibly specify which workspaces a given array type (defined by ArrayType) should be placed in"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.workspace LayerWorkspaceMgr]))

(defn ->layer-workspace-mgr
  "Constructor.

  scope-out-of-ws - `java.util.Set`
  config-map - `java.util.Map`
  workspace-names - `java.util.Map`"
  (^LayerWorkspaceMgr [^java.util.Set scope-out-of-ws ^java.util.Map config-map ^java.util.Map workspace-names]
    (new LayerWorkspaceMgr scope-out-of-ws config-map workspace-names)))

(defn *-cudnn-workspace-key
  "Static Field.

  type: java.lang.String"
  []
  LayerWorkspaceMgr/CUDNN_WORKSPACE_KEY)

(defn *builder
  "returns: `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr$Builder`"
  (^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr$Builder []
    (LayerWorkspaceMgr/builder )))

(defn *no-workspaces
  "helper-workspace-pointers - Helper pointers - see getHelperWorkspace(String) for details - `java.util.Map`

  returns: Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  (^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr [^java.util.Map helper-workspace-pointers]
    (LayerWorkspaceMgr/noWorkspaces helper-workspace-pointers))
  (^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr []
    (LayerWorkspaceMgr/noWorkspaces )))

(defn *no-workspaces-immutable
  "returns: `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  (^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr []
    (LayerWorkspaceMgr/noWorkspacesImmutable )))

(defn set-no-leverage-override
  "ws-name - `java.lang.String`"
  ([^LayerWorkspaceMgr this ^java.lang.String ws-name]
    (-> this (.setNoLeverageOverride ws-name))))

(defn leverage-to
  "Description copied from interface: WorkspaceMgr

  array-type - Array type's workspace to move the array to - `org.deeplearning4j.nn.workspace.ArrayType`
  array - Array to leverage - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Leveraged array (if leveraged, or original array otherwise) - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LayerWorkspaceMgr this ^org.deeplearning4j.nn.workspace.ArrayType array-type ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.leverageTo array-type array))))

(defn validate-array-location
  "Description copied from interface: WorkspaceMgr

  array-type - Array type of the array - `org.deeplearning4j.nn.workspace.ArrayType`
  array - Array to check - `org.nd4j.linalg.api.ndarray.INDArray`
  migrate-if-invalid - if true, and array is in the wrong WS: migrate the array and return. If false and inthe wrong WS: exception - `boolean`
  exception-if-detached - If true: if the workspace is detached, but is expected to be in a workspace: should anexception be thrown? - `boolean`

  returns: The original array, or (if required, and if migrateIfInvalid == true) the migrated array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LayerWorkspaceMgr this ^org.deeplearning4j.nn.workspace.ArrayType array-type ^org.nd4j.linalg.api.ndarray.INDArray array ^Boolean migrate-if-invalid ^Boolean exception-if-detached]
    (-> this (.validateArrayLocation array-type array migrate-if-invalid exception-if-detached))))

(defn get-helper-workspace
  "Get the pointer to the helper memory. Usually used for CUDNN workspace memory sharing.
  NOTE: Don't use this method unless you are fully aware of how it is used to manage CuDNN memory!
  Will (by design) throw a NPE if the underlying map (set from MultiLayerNetwork or ComputationGraph) is not set.

  key - Key for the helper workspace pointer - `java.lang.String`

  returns: Pointer for that key, or null if none exists - `<T extends org.bytedeco.javacpp.Pointer> T`"
  ([^LayerWorkspaceMgr this ^java.lang.String key]
    (-> this (.getHelperWorkspace key))))

(defn set-helper-workspace
  "Set the pointer to the helper memory. Usually used for CuDNN workspace memory sharing.
  NOTE: Don't use this method unless you are fully aware of how it is used to manage CuDNN memory!
  Will (by design) throw a NPE if the underlying map (set from MultiLayerNetwork or ComputationGraph) is not set.

  key - Key for the helper workspace pointer - `java.lang.String`
  value - Pointer - `org.bytedeco.javacpp.Pointer`"
  ([^LayerWorkspaceMgr this ^java.lang.String key ^org.bytedeco.javacpp.Pointer value]
    (-> this (.setHelperWorkspace key value))))

