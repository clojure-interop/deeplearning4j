(ns org.nd4j.parameterserver.distributed.messages.complete.FrameCompleteMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.complete FrameCompleteMessage]))

(defn ->frame-complete-message
  "Constructor.

  task-id - `long`"
  (^FrameCompleteMessage [^Long task-id]
    (new FrameCompleteMessage task-id)))

