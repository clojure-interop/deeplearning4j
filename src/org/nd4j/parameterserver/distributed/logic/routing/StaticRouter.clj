(ns org.nd4j.parameterserver.distributed.logic.routing.StaticRouter
  "Static router implementation, the same Shard will be used for all messages
 PLEASE NOTE: Never use this router in real world! It's suitable for debugging only."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.logic.routing StaticRouter]))

(defn ->static-router
  "Constructor.

  target-index - `int`"
  (^StaticRouter [^Integer target-index]
    (new StaticRouter target-index)))

(defn init
  "void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  transport - `org.nd4j.parameterserver.distributed.transport.Transport`"
  ([^StaticRouter this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.transport.Transport transport]
    (-> this (.init void-configuration transport))))

(defn assign-target
  "message - `org.nd4j.parameterserver.distributed.messages.TrainingMessage`

  returns: `int`"
  (^Integer [^StaticRouter this ^org.nd4j.parameterserver.distributed.messages.TrainingMessage message]
    (-> this (.assignTarget message))))

