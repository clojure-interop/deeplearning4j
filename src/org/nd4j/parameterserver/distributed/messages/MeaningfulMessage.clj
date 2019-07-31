(ns org.nd4j.parameterserver.distributed.messages.MeaningfulMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages MeaningfulMessage]))

(defn get-payload
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^MeaningfulMessage this]
    (-> this (.getPayload))))

