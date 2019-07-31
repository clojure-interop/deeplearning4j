(ns org.nd4j.parameterserver.distributed.messages.aggregations.InitializationAggregation
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.aggregations InitializationAggregation]))

(defn ->initialization-aggregation
  "Constructor.

  aggregation-width - `int`
  shard-index - `int`"
  (^InitializationAggregation [^Integer aggregation-width ^Integer shard-index]
    (new InitializationAggregation aggregation-width shard-index)))

(defn process-message
  "Description copied from interface: VoidMessage"
  ([^InitializationAggregation this]
    (-> this (.processMessage))))

