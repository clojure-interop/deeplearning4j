(ns org.nd4j.linalg.exception.ND4JIllegalStateException
  "ND4JIllegalStateException: thrown on invalid operations (for example, matrix multiplication with invalid arrays)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.exception ND4JIllegalStateException]))

(defn ->nd-4-j-illegal-state-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^ND4JIllegalStateException [^java.lang.String message ^java.lang.Throwable cause]
    (new ND4JIllegalStateException message cause))
  (^ND4JIllegalStateException [^java.lang.String message]
    (new ND4JIllegalStateException message))
  (^ND4JIllegalStateException []
    (new ND4JIllegalStateException )))

