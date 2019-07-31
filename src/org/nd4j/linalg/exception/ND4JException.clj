(ns org.nd4j.linalg.exception.ND4JException
  "Base (unchecked) exception for ND4J errors"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.exception ND4JException]))

(defn ->nd-4-j-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^ND4JException [^java.lang.String message ^java.lang.Throwable cause]
    (new ND4JException message cause))
  (^ND4JException [^java.lang.String message]
    (new ND4JException message))
  (^ND4JException []
    (new ND4JException )))

