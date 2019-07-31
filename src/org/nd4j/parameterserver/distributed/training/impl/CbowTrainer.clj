(ns org.nd4j.parameterserver.distributed.training.impl.CbowTrainer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.training.impl CbowTrainer]))

(defn ->cbow-trainer
  "Constructor."
  (^CbowTrainer []
    (new CbowTrainer )))

(defn start-training
  "message - `org.nd4j.parameterserver.distributed.messages.requests.CbowRequestMessage`"
  ([^CbowTrainer this ^org.nd4j.parameterserver.distributed.messages.requests.CbowRequestMessage message]
    (-> this (.startTraining message))))

(defn pick-training
  "message - `org.nd4j.parameterserver.distributed.messages.requests.CbowRequestMessage`"
  ([^CbowTrainer this ^org.nd4j.parameterserver.distributed.messages.requests.CbowRequestMessage message]
    (-> this (.pickTraining message))))

(defn aggregation-finished
  "aggregation - `org.nd4j.parameterserver.distributed.messages.VoidAggregation`"
  ([^CbowTrainer this ^org.nd4j.parameterserver.distributed.messages.VoidAggregation aggregation]
    (-> this (.aggregationFinished aggregation))))

(defn finish-training
  "originator-id - `long`
  task-id - `long`"
  ([^CbowTrainer this ^Long originator-id ^Long task-id]
    (-> this (.finishTraining originator-id task-id))))

(defn target-message-class
  "returns: `java.lang.String`"
  (^java.lang.String [^CbowTrainer this]
    (-> this (.targetMessageClass))))

