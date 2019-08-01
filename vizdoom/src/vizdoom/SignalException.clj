(ns vizdoom.SignalException
  (:refer-clojure :only [require comment defn ->])
  (:import [vizdoom SignalException]))

(defn ->signal-exception
  "Constructor.

  message - `java.lang.String`"
  (^SignalException [^java.lang.String message]
    (new SignalException message)))

