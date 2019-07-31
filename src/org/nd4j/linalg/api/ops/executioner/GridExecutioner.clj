(ns org.nd4j.linalg.api.ops.executioner.GridExecutioner
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.executioner GridExecutioner]))

(defn flush-queue
  "This method forces all currently enqueued ops to be executed immediately
  PLEASE NOTE: This call CAN be non-blocking, if specific backend implementation supports that."
  ([^GridExecutioner this]
    (-> this (.flushQueue))))

(defn flush-queue-blocking
  "This method forces all currently enqueued ops to be executed immediately
  PLEASE NOTE: This call is always blocking, until all queued operations are finished"
  ([^GridExecutioner this]
    (-> this (.flushQueueBlocking))))

(defn get-queue-length
  "This method returns number of operations currently enqueued for execution

  returns: `int`"
  (^Integer [^GridExecutioner this]
    (-> this (.getQueueLength))))

(defn aggregate
  "This method enqueues aggregate op for future invocation.
  Key value will be used to batch individual ops

  op - `org.nd4j.linalg.api.ops.aggregates.Aggregate`
  key - `long`"
  ([^GridExecutioner this ^org.nd4j.linalg.api.ops.aggregates.Aggregate op ^Long key]
    (-> this (.aggregate op key)))
  ([^GridExecutioner this ^org.nd4j.linalg.api.ops.aggregates.Aggregate op]
    (-> this (.aggregate op))))

