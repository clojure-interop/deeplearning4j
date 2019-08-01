(ns vizdoom.ViZDoomIsNotRunningException
  (:refer-clojure :only [require comment defn ->])
  (:import [vizdoom ViZDoomIsNotRunningException]))

(defn ->vi-z-doom-is-not-running-exception
  "Constructor.

  message - `java.lang.String`"
  (^ViZDoomIsNotRunningException [^java.lang.String message]
    (new ViZDoomIsNotRunningException message)))

