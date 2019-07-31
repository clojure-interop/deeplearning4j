(ns org.deeplearning4j.spark.models.sequencevectors.functions.ExportFunction
  "This function is used to"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.functions ExportFunction]))

(defn ->export-function
  "Constructor.

  vocab-cache-broadcast - `org.apache.spark.broadcast.Broadcast`
  hdfs-file-path - `java.lang.String`"
  (^ExportFunction [^org.apache.spark.broadcast.Broadcast vocab-cache-broadcast ^java.lang.String hdfs-file-path]
    (new ExportFunction vocab-cache-broadcast hdfs-file-path)))

(defn call
  "t - `T`

  throws: java.lang.Exception"
  ([^ExportFunction this t]
    (-> this (.call t))))

