(ns org.nd4j.parameterserver.distributed.messages.VoidAggregation
  "This interface describes special case for distributed environment: aggregation of partial responses received from different shards"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages VoidAggregation]))

(defn get-shard-index
  "returns: `short`"
  (^Short [^VoidAggregation this]
    (-> this (.getShardIndex))))

(defn get-aggregation-type
  "returns: `short`"
  (^Short [^VoidAggregation this]
    (-> this (.getAggregationType))))

(defn accumulate-aggregation
  "aggregation - `org.nd4j.parameterserver.distributed.messages.VoidAggregation`"
  ([^VoidAggregation this ^org.nd4j.parameterserver.distributed.messages.VoidAggregation aggregation]
    (-> this (.accumulateAggregation aggregation))))

(defn get-missing-chunks
  "returns: `int`"
  (^Integer [^VoidAggregation this]
    (-> this (.getMissingChunks))))

(defn get-payload
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VoidAggregation this]
    (-> this (.getPayload))))

(defn get-accumulated-result
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VoidAggregation this]
    (-> this (.getAccumulatedResult))))

