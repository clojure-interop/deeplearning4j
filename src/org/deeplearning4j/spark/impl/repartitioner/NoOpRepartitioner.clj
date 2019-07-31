(ns org.deeplearning4j.spark.impl.repartitioner.NoOpRepartitioner
  "No-op repartitioner. Returns the input un-modified"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.repartitioner NoOpRepartitioner]))

(defn ->no-op-repartitioner
  "Constructor."
  (^NoOpRepartitioner []
    (new NoOpRepartitioner )))

(defn repartition
  "input - `org.apache.spark.api.java.JavaRDD`
  min-objects-per-partition - `int`
  num-executors - `int`

  returns: `<T> org.apache.spark.api.java.JavaRDD<T>`"
  ([^NoOpRepartitioner this ^org.apache.spark.api.java.JavaRDD input ^Integer min-objects-per-partition ^Integer num-executors]
    (-> this (.repartition input min-objects-per-partition num-executors))))

