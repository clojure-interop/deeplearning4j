(ns org.nd4j.parameterserver.distributed.training.TrainingDriver
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.training TrainingDriver]))

(defn init
  "void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  transport - `org.nd4j.parameterserver.distributed.transport.Transport`
  storage - `org.nd4j.parameterserver.distributed.logic.Storage`
  clipboard - `org.nd4j.parameterserver.distributed.logic.completion.Clipboard`"
  ([^TrainingDriver this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.transport.Transport transport ^org.nd4j.parameterserver.distributed.logic.Storage storage ^org.nd4j.parameterserver.distributed.logic.completion.Clipboard clipboard]
    (-> this (.init void-configuration transport storage clipboard))))

(defn start-training
  "message - `T`"
  ([^TrainingDriver this message]
    (-> this (.startTraining message))))

(defn pick-training
  "message - `T`"
  ([^TrainingDriver this message]
    (-> this (.pickTraining message))))

(defn aggregation-finished
  "aggregation - `org.nd4j.parameterserver.distributed.messages.VoidAggregation`"
  ([^TrainingDriver this ^org.nd4j.parameterserver.distributed.messages.VoidAggregation aggregation]
    (-> this (.aggregationFinished aggregation))))

(defn finish-training
  "originator-id - `long`
  task-id - `long`"
  ([^TrainingDriver this ^Long originator-id ^Long task-id]
    (-> this (.finishTraining originator-id task-id))))

(defn add-completion-hook
  "originator-id - `long`
  frame-id - `long`
  message-id - `long`"
  ([^TrainingDriver this ^Long originator-id ^Long frame-id ^Long message-id]
    (-> this (.addCompletionHook originator-id frame-id message-id))))

(defn target-message-class
  "returns: `java.lang.String`"
  (^java.lang.String [^TrainingDriver this]
    (-> this (.targetMessageClass))))

