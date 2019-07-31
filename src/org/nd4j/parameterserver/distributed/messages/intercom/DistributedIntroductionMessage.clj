(ns org.nd4j.parameterserver.distributed.messages.intercom.DistributedIntroductionMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.intercom DistributedIntroductionMessage]))

(defn ->distributed-introduction-message
  "Constructor.

  ip - `java.lang.String`
  port - `int`"
  (^DistributedIntroductionMessage [^java.lang.String ip ^Integer port]
    (new DistributedIntroductionMessage ip port)))

(defn process-message
  "Description copied from interface: VoidMessage"
  ([^DistributedIntroductionMessage this]
    (-> this (.processMessage))))

