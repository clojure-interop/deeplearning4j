(ns vizdoom.MessageQueueException
  (:refer-clojure :only [require comment defn ->])
  (:import [vizdoom MessageQueueException]))

(defn ->message-queue-exception
  "Constructor.

  message - `java.lang.String`"
  (^MessageQueueException [^java.lang.String message]
    (new MessageQueueException message)))

