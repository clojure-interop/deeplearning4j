(ns org.nd4j.parameterserver.distributed.messages.aggregations.VectorAggregation
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.aggregations VectorAggregation]))

(defn ->vector-aggregation
  "Constructor.

  task-id - `long`
  aggregation-width - `short`
  shard-index - `short`
  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^VectorAggregation [^Long task-id ^Short aggregation-width ^Short shard-index ^org.nd4j.linalg.api.ndarray.INDArray array]
    (new VectorAggregation task-id aggregation-width shard-index array)))

(defn process-message
  "Vector aggregations are saved only by Shards started aggregation process. All other Shards are ignoring this meesage"
  ([^VectorAggregation this]
    (-> this (.processMessage))))

