(ns org.deeplearning4j.spark.text.functions.MapPerPartitionVoidFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.text.functions MapPerPartitionVoidFunction]))

(defn ->map-per-partition-void-function
  "Constructor."
  (^MapPerPartitionVoidFunction []
    (new MapPerPartitionVoidFunction )))

(defn call
  "integer-iterator - `java.util.Iterator`

  throws: java.lang.Exception"
  ([^MapPerPartitionVoidFunction this ^java.util.Iterator integer-iterator]
    (-> this (.call integer-iterator))))

