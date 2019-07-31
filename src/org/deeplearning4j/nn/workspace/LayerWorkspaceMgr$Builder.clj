(ns org.deeplearning4j.nn.workspace.LayerWorkspaceMgr$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.workspace LayerWorkspaceMgr$Builder]))

(defn ->builder
  "Constructor."
  (^LayerWorkspaceMgr$Builder []
    (new LayerWorkspaceMgr$Builder )))

(defn default-no-workspace
  "Set the default to be scoped out for all array types.
  NOTE: Will not override the configuration for any array types that have already been configured

  returns: Builder - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr$Builder`"
  (^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr$Builder [^LayerWorkspaceMgr$Builder this]
    (-> this (.defaultNoWorkspace))))

(defn no-workspace-for
  "Specify that no workspace should be used for array of the specified type - i.e., these arrays should all
  be scoped out.

  type - Array type to set scoped out for - `org.deeplearning4j.nn.workspace.ArrayType`

  returns: Builder - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr$Builder`"
  (^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr$Builder [^LayerWorkspaceMgr$Builder this ^org.deeplearning4j.nn.workspace.ArrayType type]
    (-> this (.noWorkspaceFor type))))

(defn default-workspace
  "Set the default workspace for all array types to the specified workspace name/configuration
  NOTE: This will NOT override any settings previously set.

  workspace-name - Name of the workspace to use for all (not set) arrray types - `java.lang.String`
  configuration - Configuration to use for all (not set) arrray types - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`

  returns: Builder - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr$Builder`"
  (^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr$Builder [^LayerWorkspaceMgr$Builder this ^java.lang.String workspace-name ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration]
    (-> this (.defaultWorkspace workspace-name configuration))))

(defn with
  "Configure the workspace (name, configuration) for the specified array type

  type - Array type - `org.deeplearning4j.nn.workspace.ArrayType`
  workspace-name - Workspace name for the specified array type - `java.lang.String`
  configuration - Configuration for the specified array type - `org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration`

  returns: Builder - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr$Builder`"
  (^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr$Builder [^LayerWorkspaceMgr$Builder this ^org.deeplearning4j.nn.workspace.ArrayType type ^java.lang.String workspace-name ^org.nd4j.linalg.api.memory.conf.WorkspaceConfiguration configuration]
    (-> this (.with type workspace-name configuration))))

(defn build
  "returns: `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  (^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr [^LayerWorkspaceMgr$Builder this]
    (-> this (.build))))

