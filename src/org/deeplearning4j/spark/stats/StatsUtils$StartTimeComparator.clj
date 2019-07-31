(ns org.deeplearning4j.spark.stats.StatsUtils$StartTimeComparator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.stats StatsUtils$StartTimeComparator]))

(defn ->start-time-comparator
  "Constructor."
  (^StatsUtils$StartTimeComparator []
    (new StatsUtils$StartTimeComparator )))

(defn compare
  "o-1 - `org.deeplearning4j.spark.stats.EventStats`
  o-2 - `org.deeplearning4j.spark.stats.EventStats`

  returns: `int`"
  (^Integer [^StatsUtils$StartTimeComparator this ^org.deeplearning4j.spark.stats.EventStats o-1 ^org.deeplearning4j.spark.stats.EventStats o-2]
    (-> this (.compare o-1 o-2))))

