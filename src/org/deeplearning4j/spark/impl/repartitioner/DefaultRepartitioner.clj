(ns org.deeplearning4j.spark.impl.repartitioner.DefaultRepartitioner
  "DefaultRepartitioner: Repartition data so that we exactly the minimum number of objects per partition, up to a
 specified maximum number of partitions partitions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.repartitioner DefaultRepartitioner]))

(defn ->default-repartitioner
  "Constructor.

  Create a DefaultRepartitioner with the default maximum number of partitions, DEFAULT_MAX_PARTITIONS"
  (^DefaultRepartitioner []
    (new DefaultRepartitioner ))
  (^DefaultRepartitioner [^Integer max-partitions]
    (new DefaultRepartitioner max-partitions)))

(def *-default-max-partitions
  "Static Constant.

  type: int"
  DefaultRepartitioner/DEFAULT_MAX_PARTITIONS)

(defn repartition
  "rdd - `org.apache.spark.api.java.JavaRDD`
  min-objects-per-partition - `int`
  num-executors - `int`

  returns: `<T> org.apache.spark.api.java.JavaRDD<T>`"
  ([^DefaultRepartitioner this ^org.apache.spark.api.java.JavaRDD rdd ^Integer min-objects-per-partition ^Integer num-executors]
    (-> this (.repartition rdd min-objects-per-partition num-executors))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DefaultRepartitioner this]
    (-> this (.toString))))

