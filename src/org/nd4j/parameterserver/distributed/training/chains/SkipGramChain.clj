(ns org.nd4j.parameterserver.distributed.training.chains.SkipGramChain
  "Chain implementation for SkipGram"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.training.chains SkipGramChain]))

(defn ->skip-gram-chain
  "Constructor.

  originator-id - `long`
  task-id - `long`
  frame-id - `long`"
  (^SkipGramChain [^Long originator-id ^Long task-id ^Long frame-id]
    (new SkipGramChain originator-id task-id frame-id))
  (^SkipGramChain [^Long task-id ^org.nd4j.parameterserver.distributed.messages.requests.SkipGramRequestMessage message]
    (new SkipGramChain task-id message))
  (^SkipGramChain [^org.nd4j.parameterserver.distributed.messages.requests.SkipGramRequestMessage message]
    (new SkipGramChain message)))

(defn get-task-id
  "returns: `long`"
  (^Long [^SkipGramChain this]
    (-> this (.getTaskId))))

(defn add-element
  "message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^SkipGramChain this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.addElement message))))

