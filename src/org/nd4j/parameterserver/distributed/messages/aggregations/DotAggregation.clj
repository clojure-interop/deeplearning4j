(ns org.nd4j.parameterserver.distributed.messages.aggregations.DotAggregation
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.aggregations DotAggregation]))

(defn ->dot-aggregation
  "Constructor.

  task-id - `long`
  aggregation-width - `short`
  shard-index - `short`
  scalar - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^DotAggregation [^Long task-id ^Short aggregation-width ^Short shard-index ^org.nd4j.linalg.api.ndarray.INDArray scalar]
    (new DotAggregation task-id aggregation-width shard-index scalar)))

(defn get-accumulated-result
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DotAggregation this]
    (-> this (.getAccumulatedResult))))

(defn process-message
  "This method will be started in context of executor, either Shard, Client or Backup node"
  ([^DotAggregation this]
    (-> this (.processMessage))))

