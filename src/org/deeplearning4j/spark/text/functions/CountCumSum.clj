(ns org.deeplearning4j.spark.text.functions.CountCumSum
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.text.functions CountCumSum]))

(defn ->count-cum-sum
  "Constructor.

  sentence-count-rdd - `org.apache.spark.api.java.JavaRDD`"
  (^CountCumSum [^org.apache.spark.api.java.JavaRDD sentence-count-rdd]
    (new CountCumSum sentence-count-rdd)))

(defn get-cum-sum-rdd
  "returns: `org.apache.spark.api.java.JavaRDD<java.lang.Long>`"
  (^org.apache.spark.api.java.JavaRDD [^CountCumSum this]
    (-> this (.getCumSumRDD))))

(defn action-for-map-partition
  "rdd - `org.apache.spark.api.java.JavaRDD`"
  ([^CountCumSum this ^org.apache.spark.api.java.JavaRDD rdd]
    (-> this (.actionForMapPartition rdd))))

(defn cum-sum-within-partition
  ""
  ([^CountCumSum this]
    (-> this (.cumSumWithinPartition))))

(defn cum-sum-between-partition
  ""
  ([^CountCumSum this]
    (-> this (.cumSumBetweenPartition))))

(defn build-cum-sum
  "returns: `org.apache.spark.api.java.JavaRDD<java.lang.Long>`"
  (^org.apache.spark.api.java.JavaRDD [^CountCumSum this]
    (-> this (.buildCumSum))))

