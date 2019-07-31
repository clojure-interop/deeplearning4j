(ns org.nd4j.parameterserver.distributed.logic.retransmission.DefaultRetransmissionHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.logic.retransmission DefaultRetransmissionHandler]))

(defn ->default-retransmission-handler
  "Constructor."
  (^DefaultRetransmissionHandler []
    (new DefaultRetransmissionHandler )))

(defn init
  "configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  transport - `org.nd4j.parameterserver.distributed.transport.Transport`"
  ([^DefaultRetransmissionHandler this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration configuration ^org.nd4j.parameterserver.distributed.transport.Transport transport]
    (-> this (.init configuration transport))))

(defn on-back-pressure
  ""
  ([^DefaultRetransmissionHandler this]
    (-> this (.onBackPressure))))

(defn handle-message
  "message - `org.nd4j.parameterserver.distributed.messages.TrainingMessage`"
  ([^DefaultRetransmissionHandler this ^org.nd4j.parameterserver.distributed.messages.TrainingMessage message]
    (-> this (.handleMessage message))))

