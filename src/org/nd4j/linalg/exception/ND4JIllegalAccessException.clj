(ns org.nd4j.linalg.exception.ND4JIllegalAccessException
  "ND4JIllegalAccessException is thrown on illegal access cases, i.e. bad concurrent access on object that doesn't support that"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.exception ND4JIllegalAccessException]))

(defn ->nd-4-j-illegal-access-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^ND4JIllegalAccessException [^java.lang.String message ^java.lang.Throwable cause]
    (new ND4JIllegalAccessException message cause))
  (^ND4JIllegalAccessException [^java.lang.String message]
    (new ND4JIllegalAccessException message))
  (^ND4JIllegalAccessException []
    (new ND4JIllegalAccessException )))

