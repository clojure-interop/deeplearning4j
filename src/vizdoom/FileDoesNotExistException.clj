(ns vizdoom.FileDoesNotExistException
  (:refer-clojure :only [require comment defn ->])
  (:import [vizdoom FileDoesNotExistException]))

(defn ->file-does-not-exist-exception
  "Constructor.

  message - `java.lang.String`"
  (^FileDoesNotExistException [^java.lang.String message]
    (new FileDoesNotExistException message)))

