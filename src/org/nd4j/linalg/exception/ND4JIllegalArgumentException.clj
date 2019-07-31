(ns org.nd4j.linalg.exception.ND4JIllegalArgumentException
  "ND4JIllegalStateException: thrown on invalid arguments"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.exception ND4JIllegalArgumentException]))

(defn ->nd-4-j-illegal-argument-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^ND4JIllegalArgumentException [^java.lang.String message ^java.lang.Throwable cause]
    (new ND4JIllegalArgumentException message cause))
  (^ND4JIllegalArgumentException [^java.lang.String message]
    (new ND4JIllegalArgumentException message))
  (^ND4JIllegalArgumentException []
    (new ND4JIllegalArgumentException )))

