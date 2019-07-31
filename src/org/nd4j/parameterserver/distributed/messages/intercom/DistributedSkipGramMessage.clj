(ns org.nd4j.parameterserver.distributed.messages.intercom.DistributedSkipGramMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.intercom DistributedSkipGramMessage]))

(defn ->distributed-skip-gram-message
  "Constructor.

  message - `org.nd4j.parameterserver.distributed.messages.requests.SkipGramRequestMessage`"
  (^DistributedSkipGramMessage [^org.nd4j.parameterserver.distributed.messages.requests.SkipGramRequestMessage message]
    (new DistributedSkipGramMessage message)))

(defn process-message
  "Description copied from interface: VoidMessage"
  ([^DistributedSkipGramMessage this]
    (-> this (.processMessage))))

