(ns org.nd4j.linalg.exception.Nd4jNoSuchWorkspaceException
  "An unchecked (runtime) exception that specifies that the requested workspace does not exist"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.exception Nd4jNoSuchWorkspaceException]))

(defn ->nd-4j-no-such-workspace-exception
  "Constructor.

  msg - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^Nd4jNoSuchWorkspaceException [^java.lang.String msg ^java.lang.Throwable cause]
    (new Nd4jNoSuchWorkspaceException msg cause))
  (^Nd4jNoSuchWorkspaceException [^java.lang.String msg]
    (new Nd4jNoSuchWorkspaceException msg)))

