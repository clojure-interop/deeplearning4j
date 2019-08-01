(ns vizdoom.ViZDoomUnexpectedExitException
  (:refer-clojure :only [require comment defn ->])
  (:import [vizdoom ViZDoomUnexpectedExitException]))

(defn ->vi-z-doom-unexpected-exit-exception
  "Constructor.

  message - `java.lang.String`"
  (^ViZDoomUnexpectedExitException [^java.lang.String message]
    (new ViZDoomUnexpectedExitException message)))

