(ns org.nd4j.parameterserver.distributed.training.chains.CbowChain
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.training.chains CbowChain]))

(defn ->cbow-chain
  "Constructor.

  task-id - `long`
  message - `org.nd4j.parameterserver.distributed.messages.requests.CbowRequestMessage`"
  (^CbowChain [^Long task-id ^org.nd4j.parameterserver.distributed.messages.requests.CbowRequestMessage message]
    (new CbowChain task-id message))
  (^CbowChain [^org.nd4j.parameterserver.distributed.messages.requests.CbowRequestMessage message]
    (new CbowChain message)))

(defn add-element
  "message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^CbowChain this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.addElement message))))

