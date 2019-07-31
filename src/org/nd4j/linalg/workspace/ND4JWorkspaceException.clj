(ns org.nd4j.linalg.workspace.ND4JWorkspaceException
  "An exception to specify than a workspace-related error has occurred"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.workspace ND4JWorkspaceException]))

(defn ->nd-4-j-workspace-exception
  "Constructor.

  msg - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^ND4JWorkspaceException [^java.lang.String msg ^java.lang.Throwable cause]
    (new ND4JWorkspaceException msg cause))
  (^ND4JWorkspaceException [^java.lang.Throwable cause]
    (new ND4JWorkspaceException cause))
  (^ND4JWorkspaceException []
    (new ND4JWorkspaceException )))

