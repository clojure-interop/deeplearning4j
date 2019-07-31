(ns org.deeplearning4j.spark.models.sequencevectors.SparkSequenceVectors
  "Generic SequenceVectors implementation for dl4j-spark-nlp"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors SparkSequenceVectors]))

(defn fit
  "Deprecated."
  ([^SparkSequenceVectors this]
    (-> this (.fit))))

(defn fit-lists
  "Utility method. fitSequences() used within.
  PLEASE NOTE: This method can't be used to train for labels, since List can't hold labels. If you need labels - consider manual Sequence creation instead.

  corpus - `org.apache.spark.api.java.JavaRDD`"
  ([^SparkSequenceVectors this ^org.apache.spark.api.java.JavaRDD corpus]
    (-> this (.fitLists corpus))))

(defn fit-sequences
  "Base training entry point

  corpus - `org.apache.spark.api.java.JavaRDD`"
  ([^SparkSequenceVectors this ^org.apache.spark.api.java.JavaRDD corpus]
    (-> this (.fitSequences corpus))))

