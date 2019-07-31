(ns org.nd4j.parameterserver.distributed.logic.sequence.BasicSequenceProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.logic.sequence BasicSequenceProvider]))

(defn *get-instance
  "returns: `org.nd4j.parameterserver.distributed.logic.sequence.BasicSequenceProvider`"
  (^org.nd4j.parameterserver.distributed.logic.sequence.BasicSequenceProvider []
    (BasicSequenceProvider/getInstance )))

(defn get-next-value
  "returns: `java.lang.Long`"
  (^java.lang.Long [^BasicSequenceProvider this]
    (-> this (.getNextValue))))

