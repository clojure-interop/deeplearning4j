(ns vizdoom.ViZDoomErrorException
  (:refer-clojure :only [require comment defn ->])
  (:import [vizdoom ViZDoomErrorException]))

(defn ->vi-z-doom-error-exception
  "Constructor.

  message - `java.lang.String`"
  (^ViZDoomErrorException [^java.lang.String message]
    (new ViZDoomErrorException message)))

