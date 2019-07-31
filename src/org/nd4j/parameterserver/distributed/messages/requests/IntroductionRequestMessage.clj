(ns org.nd4j.parameterserver.distributed.messages.requests.IntroductionRequestMessage
  "This message will be sent by each shard, during meeting"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.requests IntroductionRequestMessage]))

(defn ->introduction-request-message
  "Constructor.

  ip - `java.lang.String`
  port - `int`"
  (^IntroductionRequestMessage [^java.lang.String ip ^Integer port]
    (new IntroductionRequestMessage ip port))
  (^IntroductionRequestMessage []
    (new IntroductionRequestMessage )))

(defn process-message
  "Description copied from interface: VoidMessage"
  ([^IntroductionRequestMessage this]
    (-> this (.processMessage))))

(defn blocking-message?
  "returns: `boolean`"
  (^Boolean [^IntroductionRequestMessage this]
    (-> this (.isBlockingMessage))))

