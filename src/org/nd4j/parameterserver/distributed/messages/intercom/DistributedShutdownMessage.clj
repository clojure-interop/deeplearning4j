(ns org.nd4j.parameterserver.distributed.messages.intercom.DistributedShutdownMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.intercom DistributedShutdownMessage]))

(defn ->distributed-shutdown-message
  "Constructor."
  (^DistributedShutdownMessage []
    (new DistributedShutdownMessage )))

(defn process-message
  "Description copied from interface: VoidMessage"
  ([^DistributedShutdownMessage this]
    (-> this (.processMessage))))

