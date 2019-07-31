(ns vizdoom.SharedMemoryException
  (:refer-clojure :only [require comment defn ->])
  (:import [vizdoom SharedMemoryException]))

(defn ->shared-memory-exception
  "Constructor.

  message - `java.lang.String`"
  (^SharedMemoryException [^java.lang.String message]
    (new SharedMemoryException message)))

