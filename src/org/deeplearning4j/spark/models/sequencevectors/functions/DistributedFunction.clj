(ns org.deeplearning4j.spark.models.sequencevectors.functions.DistributedFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.functions DistributedFunction]))

(defn ->distributed-function
  "Constructor.

  configuration-broadcast - `org.apache.spark.broadcast.Broadcast`
  vectors-configuration-broadcast - `org.apache.spark.broadcast.Broadcast`
  shallow-vocab-broadcast - `org.apache.spark.broadcast.Broadcast`"
  (^DistributedFunction [^org.apache.spark.broadcast.Broadcast configuration-broadcast ^org.apache.spark.broadcast.Broadcast vectors-configuration-broadcast ^org.apache.spark.broadcast.Broadcast shallow-vocab-broadcast]
    (new DistributedFunction configuration-broadcast vectors-configuration-broadcast shallow-vocab-broadcast)))

(defn call
  "word - `T`

  returns: `org.deeplearning4j.spark.models.sequencevectors.export.ExportContainer<T>`

  throws: java.lang.Exception"
  (^org.deeplearning4j.spark.models.sequencevectors.export.ExportContainer [^DistributedFunction this word]
    (-> this (.call word))))

