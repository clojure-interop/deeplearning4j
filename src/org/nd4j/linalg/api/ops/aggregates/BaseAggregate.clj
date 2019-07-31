(ns org.nd4j.linalg.api.ops.aggregates.BaseAggregate
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.aggregates BaseAggregate]))

(defn ->base-aggregate
  "Constructor."
  (^BaseAggregate []
    (new BaseAggregate )))

(defn get-arguments
  "returns: `java.util.List<org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.List [^BaseAggregate this]
    (-> this (.getArguments))))

(defn get-final-result
  "returns: `java.lang.Number`"
  (^java.lang.Number [^BaseAggregate this]
    (-> this (.getFinalResult))))

(defn set-final-result
  "result - `java.lang.Number`"
  ([^BaseAggregate this ^java.lang.Number result]
    (-> this (.setFinalResult result))))

(defn get-shapes
  "returns: `java.util.List<org.nd4j.linalg.api.buffer.DataBuffer>`"
  (^java.util.List [^BaseAggregate this]
    (-> this (.getShapes))))

(defn get-indexing-arguments
  "returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^BaseAggregate this]
    (-> this (.getIndexingArguments))))

(defn get-real-arguments
  "returns: `java.util.List<java.lang.Number>`"
  (^java.util.List [^BaseAggregate this]
    (-> this (.getRealArguments))))

(defn get-int-array-arguments
  "returns: `java.util.List<int[]>`"
  ([^BaseAggregate this]
    (-> this (.getIntArrayArguments))))

(defn get-required-batch-memory-size
  "Description copied from interface: Aggregate

  returns: `long`"
  (^Long [^BaseAggregate this]
    (-> this (.getRequiredBatchMemorySize))))

