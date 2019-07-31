(ns org.deeplearning4j.spark.models.sequencevectors.export.SparkModelExporter
  "This interface describes"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.export SparkModelExporter]))

(defn export
  "This method will be called at final stage of SequenceVectors training, and JavaRDD being passed as argument will

  rdd - `org.apache.spark.api.java.JavaRDD`"
  ([^SparkModelExporter this ^org.apache.spark.api.java.JavaRDD rdd]
    (-> this (.export rdd))))

