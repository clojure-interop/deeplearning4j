(ns org.nd4j.parameterserver.distributed.logic.SequenceProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.logic SequenceProvider]))

(defn get-next-value
  "returns: `java.lang.Long`"
  (^java.lang.Long [^SequenceProvider this]
    (-> this (.getNextValue))))

