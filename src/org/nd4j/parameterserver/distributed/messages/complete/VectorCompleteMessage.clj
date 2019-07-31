(ns org.nd4j.parameterserver.distributed.messages.complete.VectorCompleteMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.complete VectorCompleteMessage]))

(defn ->vector-complete-message
  "Constructor.

  task-id - `long`
  vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^VectorCompleteMessage [^Long task-id ^org.nd4j.linalg.api.ndarray.INDArray vector]
    (new VectorCompleteMessage task-id vector)))

