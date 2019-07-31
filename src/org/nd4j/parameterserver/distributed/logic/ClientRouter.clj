(ns org.nd4j.parameterserver.distributed.logic.ClientRouter
  "This interface describes routing for messaging
 flowing in Client->Shard direction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.logic ClientRouter]))

(defn init
  "void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  transport - `org.nd4j.parameterserver.distributed.transport.Transport`"
  ([^ClientRouter this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.transport.Transport transport]
    (-> this (.init void-configuration transport))))

(defn assign-target
  "message - `org.nd4j.parameterserver.distributed.messages.TrainingMessage`

  returns: `int`"
  (^Integer [^ClientRouter this ^org.nd4j.parameterserver.distributed.messages.TrainingMessage message]
    (-> this (.assignTarget message))))

(defn set-originator
  "message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^ClientRouter this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.setOriginator message))))

