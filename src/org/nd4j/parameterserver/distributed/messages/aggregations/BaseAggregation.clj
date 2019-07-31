(ns org.nd4j.parameterserver.distributed.messages.aggregations.BaseAggregation
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.aggregations BaseAggregation]))

(defn set-shard-index
  "shard-index - `short`"
  ([^BaseAggregation this ^Short shard-index]
    (-> this (.setShardIndex shard-index))))

(defn accumulate-aggregation
  "aggregation - `org.nd4j.parameterserver.distributed.messages.VoidAggregation`"
  ([^BaseAggregation this ^org.nd4j.parameterserver.distributed.messages.VoidAggregation aggregation]
    (-> this (.accumulateAggregation aggregation))))

(defn get-accumulated-result
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseAggregation this]
    (-> this (.getAccumulatedResult))))

(defn get-missing-chunks
  "returns: `int`"
  (^Integer [^BaseAggregation this]
    (-> this (.getMissingChunks))))

(defn get-message-type
  "returns: `int`"
  (^Integer [^BaseAggregation this]
    (-> this (.getMessageType))))

(defn as-bytes
  "returns: `byte[]`"
  ([^BaseAggregation this]
    (-> this (.asBytes))))

(defn as-unsafe-buffer
  "returns: `org.agrona.concurrent.UnsafeBuffer`"
  (^org.agrona.concurrent.UnsafeBuffer [^BaseAggregation this]
    (-> this (.asUnsafeBuffer))))

(defn get-target-id
  "returns: `short`"
  (^Short [^BaseAggregation this]
    (-> this (.getTargetId))))

