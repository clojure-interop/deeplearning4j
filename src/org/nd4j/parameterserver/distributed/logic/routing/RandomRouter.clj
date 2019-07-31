(ns org.nd4j.parameterserver.distributed.logic.routing.RandomRouter
  "Basic implementation for ClientRouter: we route each message to random Shard"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.logic.routing RandomRouter]))

(defn ->random-router
  "Constructor."
  (^RandomRouter []
    (new RandomRouter )))

(defn init
  "void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  transport - `org.nd4j.parameterserver.distributed.transport.Transport`"
  ([^RandomRouter this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.transport.Transport transport]
    (-> this (.init void-configuration transport))))

(defn assign-target
  "message - `org.nd4j.parameterserver.distributed.messages.TrainingMessage`

  returns: `int`"
  (^Integer [^RandomRouter this ^org.nd4j.parameterserver.distributed.messages.TrainingMessage message]
    (-> this (.assignTarget message))))

