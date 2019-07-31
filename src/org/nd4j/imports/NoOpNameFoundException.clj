(ns org.nd4j.imports.NoOpNameFoundException
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.imports NoOpNameFoundException]))

(defn ->no-op-name-found-exception
  "Constructor.

  message - `java.lang.String`"
  (^NoOpNameFoundException [^java.lang.String message]
    (new NoOpNameFoundException message))
  (^NoOpNameFoundException []
    (new NoOpNameFoundException )))

