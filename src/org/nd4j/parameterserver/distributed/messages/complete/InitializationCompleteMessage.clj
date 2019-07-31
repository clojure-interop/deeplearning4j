(ns org.nd4j.parameterserver.distributed.messages.complete.InitializationCompleteMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.complete InitializationCompleteMessage]))

(defn ->initialization-complete-message
  "Constructor.

  task-id - `long`"
  (^InitializationCompleteMessage [^Long task-id]
    (new InitializationCompleteMessage task-id)))

