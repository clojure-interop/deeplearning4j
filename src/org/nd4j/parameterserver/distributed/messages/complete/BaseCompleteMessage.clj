(ns org.nd4j.parameterserver.distributed.messages.complete.BaseCompleteMessage
  "This message contains information about finished computations for specific batch, being sent earlier"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.complete BaseCompleteMessage]))

(defn ->base-complete-message
  "Constructor.

  message-type - `int`"
  (^BaseCompleteMessage [^Integer message-type]
    (new BaseCompleteMessage message-type))
  (^BaseCompleteMessage []
    (new BaseCompleteMessage )))

(defn process-message
  "Description copied from interface: VoidMessage"
  ([^BaseCompleteMessage this]
    (-> this (.processMessage))))

