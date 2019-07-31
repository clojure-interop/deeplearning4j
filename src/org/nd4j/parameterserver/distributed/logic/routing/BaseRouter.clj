(ns org.nd4j.parameterserver.distributed.logic.routing.BaseRouter
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.logic.routing BaseRouter]))

(defn ->base-router
  "Constructor."
  (^BaseRouter []
    (new BaseRouter )))

(defn init
  "void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  transport - `org.nd4j.parameterserver.distributed.transport.Transport`"
  ([^BaseRouter this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.transport.Transport transport]
    (-> this (.init void-configuration transport))))

(defn set-originator
  "message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^BaseRouter this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.setOriginator message))))

