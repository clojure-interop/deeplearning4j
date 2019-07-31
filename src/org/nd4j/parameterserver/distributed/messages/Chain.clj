(ns org.nd4j.parameterserver.distributed.messages.Chain
  "This interface describes number of actions happening within VoidParameterServer in distributed manner"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages Chain]))

(defn get-originator-id
  "returns: `long`"
  (^Long [^Chain this]
    (-> this (.getOriginatorId))))

(defn get-task-id
  "returns: `long`"
  (^Long [^Chain this]
    (-> this (.getTaskId))))

(defn add-element
  "message - `org.nd4j.parameterserver.distributed.messages.VoidMessage`"
  ([^Chain this ^org.nd4j.parameterserver.distributed.messages.VoidMessage message]
    (-> this (.addElement message))))

