(ns org.nd4j.parameterserver.distributed.training.TrainerProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.training TrainerProvider]))

(defn *get-instance
  "returns: `org.nd4j.parameterserver.distributed.training.TrainerProvider`"
  (^org.nd4j.parameterserver.distributed.training.TrainerProvider []
    (TrainerProvider/getInstance )))

(defn init
  "void-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  transport - `org.nd4j.parameterserver.distributed.transport.Transport`
  storage - `org.nd4j.parameterserver.distributed.logic.Storage`
  clipboard - `org.nd4j.parameterserver.distributed.logic.completion.Clipboard`"
  ([^TrainerProvider this ^org.nd4j.parameterserver.distributed.conf.VoidConfiguration void-configuration ^org.nd4j.parameterserver.distributed.transport.Transport transport ^org.nd4j.parameterserver.distributed.logic.Storage storage ^org.nd4j.parameterserver.distributed.logic.completion.Clipboard clipboard]
    (-> this (.init void-configuration transport storage clipboard))))

(defn do-training
  "message - `T`

  returns: `<T extends org.nd4j.parameterserver.distributed.messages.TrainingMessage> void`"
  ([^TrainerProvider this message]
    (-> this (.doTraining message))))

