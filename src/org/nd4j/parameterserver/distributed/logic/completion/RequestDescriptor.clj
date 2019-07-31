(ns org.nd4j.parameterserver.distributed.logic.completion.RequestDescriptor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.logic.completion RequestDescriptor]))

(defn ->request-descriptor
  "Constructor."
  (^RequestDescriptor []
    (new RequestDescriptor )))

(defn *create-descriptor
  "originator-id - `long`
  task-id - `long`

  returns: `org.nd4j.parameterserver.distributed.logic.completion.RequestDescriptor`"
  (^org.nd4j.parameterserver.distributed.logic.completion.RequestDescriptor [^Long originator-id ^Long task-id]
    (RequestDescriptor/createDescriptor originator-id task-id)))

