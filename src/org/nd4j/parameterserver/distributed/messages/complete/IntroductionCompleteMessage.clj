(ns org.nd4j.parameterserver.distributed.messages.complete.IntroductionCompleteMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.complete IntroductionCompleteMessage]))

(defn ->introduction-complete-message
  "Constructor.

  task-id - `long`"
  (^IntroductionCompleteMessage [^Long task-id]
    (new IntroductionCompleteMessage task-id)))

