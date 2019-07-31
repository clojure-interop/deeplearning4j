(ns org.nd4j.parameterserver.distributed.messages.requests.ShutdownRequestMessage
  "This message"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.requests ShutdownRequestMessage]))

(defn ->shutdown-request-message
  "Constructor."
  (^ShutdownRequestMessage []
    (new ShutdownRequestMessage )))

(defn process-message
  "Description copied from interface: VoidMessage"
  ([^ShutdownRequestMessage this]
    (-> this (.processMessage))))

