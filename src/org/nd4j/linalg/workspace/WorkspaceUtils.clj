(ns org.nd4j.linalg.workspace.WorkspaceUtils
  "Workspace utility methods"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.workspace WorkspaceUtils]))

(defn *assert-no-workspaces-open
  "Assert that no workspaces are currently open

  msg - Message to include in the exception, if required - `java.lang.String`

  throws: org.nd4j.linalg.workspace.ND4JWorkspaceException"
  ([^java.lang.String msg]
    (WorkspaceUtils/assertNoWorkspacesOpen msg)))

(defn *assert-open-and-active
  "Assert that the specified workspace is open and active

  ws - Name of the workspace to assert open and active - `java.lang.String`
  error-msg - Message to include in the exception, if required - `java.lang.String`

  throws: org.nd4j.linalg.workspace.ND4JWorkspaceException"
  ([^java.lang.String ws ^java.lang.String error-msg]
    (WorkspaceUtils/assertOpenAndActive ws error-msg)))

(defn *assert-open-active-and-current
  "Assert that the specified workspace is open, active, and is the current workspace

  ws - Name of the workspace to assert open/active/current - `java.lang.String`
  error-msg - Message to include in the exception, if required - `java.lang.String`

  throws: org.nd4j.linalg.workspace.ND4JWorkspaceException"
  ([^java.lang.String ws ^java.lang.String error-msg]
    (WorkspaceUtils/assertOpenActiveAndCurrent ws error-msg)))

(defn *assert-valid-array
  "Assert that the specified array is valid, in terms of workspaces: i.e., if it is attached (and not in a circular
  workspace), assert that the workspace is open, and that the data is not from an old generation.

  array - Array to check - `org.nd4j.linalg.api.ndarray.INDArray`
  msg - Message (prefix) to include in the exception, if required. May be null - `java.lang.String`"
  ([^org.nd4j.linalg.api.ndarray.INDArray array ^java.lang.String msg]
    (WorkspaceUtils/assertValidArray array msg)))

