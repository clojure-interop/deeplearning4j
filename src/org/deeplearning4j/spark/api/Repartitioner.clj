(ns org.deeplearning4j.spark.api.Repartitioner
  "Repartitioner interface: controls how data should be repartitioned before training.
 Currently used only in SharedTrainingMaster"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.api Repartitioner]))

(defn repartition
  "input - `org.apache.spark.api.java.JavaRDD`
  min-objects-per-partition - `int`
  num-executors - `int`

  returns: `<T> org.apache.spark.api.java.JavaRDD<T>`"
  ([^Repartitioner this ^org.apache.spark.api.java.JavaRDD input ^Integer min-objects-per-partition ^Integer num-executors]
    (-> this (.repartition input min-objects-per-partition num-executors))))

