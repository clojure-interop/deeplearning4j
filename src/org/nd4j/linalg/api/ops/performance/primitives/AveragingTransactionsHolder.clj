(ns org.nd4j.linalg.api.ops.performance.primitives.AveragingTransactionsHolder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.performance.primitives AveragingTransactionsHolder]))

(defn ->averaging-transactions-holder
  "Constructor."
  (^AveragingTransactionsHolder []
    (new AveragingTransactionsHolder )))

(defn clear
  ""
  ([^AveragingTransactionsHolder this]
    (-> this (.clear))))

(defn add-value
  "direction - `org.nd4j.linalg.memory.MemcpyDirection`
  value - `java.lang.Long`"
  ([^AveragingTransactionsHolder this ^org.nd4j.linalg.memory.MemcpyDirection direction ^java.lang.Long value]
    (-> this (.addValue direction value))))

(defn get-average-value
  "direction - `org.nd4j.linalg.memory.MemcpyDirection`

  returns: `java.lang.Long`"
  (^java.lang.Long [^AveragingTransactionsHolder this ^org.nd4j.linalg.memory.MemcpyDirection direction]
    (-> this (.getAverageValue direction))))

