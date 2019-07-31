(ns org.nd4j.parameterserver.distributed.training.BaseTrainer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.training BaseTrainer]))

(defn ->base-trainer
  "Constructor."
  (^BaseTrainer []
    (new BaseTrainer )))

(defn init
  "void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  transport - `org.nd4j.parameterserver.distributed.transport.Transport`
  storage - `org.nd4j.parameterserver.distributed.logic.Storage`
  clipboard - `org.nd4j.parameterserver.distributed.logic.completion.Clipboard`"
  ([^BaseTrainer this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.transport.Transport transport ^org.nd4j.parameterserver.distributed.logic.Storage storage ^org.nd4j.parameterserver.distributed.logic.completion.Clipboard clipboard]
    (-> this (.init void-configuration transport storage clipboard))))

(defn add-completion-hook
  "originator-id - `long`
  frame-id - `long`
  message-id - `long`"
  ([^BaseTrainer this ^Long originator-id ^Long frame-id ^Long message-id]
    (-> this (.addCompletionHook originator-id frame-id message-id))))

