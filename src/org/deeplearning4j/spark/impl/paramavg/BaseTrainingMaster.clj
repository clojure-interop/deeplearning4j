(ns org.deeplearning4j.spark.impl.paramavg.BaseTrainingMaster
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.paramavg BaseTrainingMaster]))

(defn delete-temp-files
  "Description copied from interface: TrainingMaster

  sc - JavaSparkContext (used to access HDFS etc file systems, when required) - `org.apache.spark.api.java.JavaSparkContext`

  returns: True if deletion was successful (or, no files to delete); false otherwise. - `boolean`"
  (^Boolean [^BaseTrainingMaster this ^org.apache.spark.api.java.JavaSparkContext sc]
    (-> this (.deleteTempFiles sc))))

