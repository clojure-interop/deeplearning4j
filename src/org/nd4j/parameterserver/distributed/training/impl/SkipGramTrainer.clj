(ns org.nd4j.parameterserver.distributed.training.impl.SkipGramTrainer
  "Distributed SkipGram trainer
 TrainingDriver idea is simple:
 1) We get request from Client
 2) We initiate training by issuing DotRequest
 3) Each Shard does Dot accumulation
 4) As soon as Dot aggregated, we calculate gradients independently
 5) As soon as they are ready - we just apply them to appropriate"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.training.impl SkipGramTrainer]))

(defn ->skip-gram-trainer
  "Constructor."
  (^SkipGramTrainer []
    (new SkipGramTrainer )))

(defn start-training
  "message - `org.nd4j.parameterserver.distributed.messages.requests.SkipGramRequestMessage`"
  ([^SkipGramTrainer this ^org.nd4j.parameterserver.distributed.messages.requests.SkipGramRequestMessage message]
    (-> this (.startTraining message))))

(defn pick-training
  "This method will be called from non-initialized Shard context

  message - `org.nd4j.parameterserver.distributed.messages.requests.SkipGramRequestMessage`"
  ([^SkipGramTrainer this ^org.nd4j.parameterserver.distributed.messages.requests.SkipGramRequestMessage message]
    (-> this (.pickTraining message))))

(defn target-message-class
  "returns: `java.lang.String`"
  (^java.lang.String [^SkipGramTrainer this]
    (-> this (.targetMessageClass))))

(defn aggregation-finished
  "This method is invoked after particular aggregation finished

  aggregation - `org.nd4j.parameterserver.distributed.messages.VoidAggregation`"
  ([^SkipGramTrainer this ^org.nd4j.parameterserver.distributed.messages.VoidAggregation aggregation]
    (-> this (.aggregationFinished aggregation))))

(defn finish-training
  "originator-id - `long`
  task-id - `long`"
  ([^SkipGramTrainer this ^Long originator-id ^Long task-id]
    (-> this (.finishTraining originator-id task-id))))

