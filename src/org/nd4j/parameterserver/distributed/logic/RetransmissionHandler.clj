(ns org.nd4j.parameterserver.distributed.logic.RetransmissionHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.logic RetransmissionHandler]))

(defn init
  "configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  transport - `org.nd4j.parameterserver.distributed.transport.Transport`"
  ([^RetransmissionHandler this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration configuration ^org.nd4j.parameterserver.distributed.transport.Transport transport]
    (-> this (.init configuration transport))))

(defn handle-message
  "message - `org.nd4j.parameterserver.distributed.messages.TrainingMessage`"
  ([^RetransmissionHandler this ^org.nd4j.parameterserver.distributed.messages.TrainingMessage message]
    (-> this (.handleMessage message))))

(defn on-back-pressure
  ""
  ([^RetransmissionHandler this]
    (-> this (.onBackPressure))))

(defn *get-transmission-status
  "resp - `long`

  returns: `org.nd4j.parameterserver.distributed.logic.RetransmissionHandler$TransmissionStatus`"
  (^org.nd4j.parameterserver.distributed.logic.RetransmissionHandler$TransmissionStatus [^Long resp]
    (RetransmissionHandler/getTransmissionStatus resp)))

