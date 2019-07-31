(ns org.deeplearning4j.spark.impl.SparkListenable
  "Created by huitseeker on 2/15/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl SparkListenable]))

(defn ->spark-listenable
  "Constructor."
  (^SparkListenable []
    (new SparkListenable )))

(defn set-listeners
  "Set the listeners, along with a StatsStorageRouter that the results will be shuffled to (in the
  case of any listeners that implement the RoutingIterationListener interface)

  stats-storage - Stats storage router to place the results into - `org.deeplearning4j.api.storage.StatsStorageRouter`
  listeners - Listeners to set - `org.deeplearning4j.optimize.api.TrainingListener`"
  ([^SparkListenable this ^org.deeplearning4j.api.storage.StatsStorageRouter stats-storage ^org.deeplearning4j.optimize.api.TrainingListener listeners]
    (-> this (.setListeners stats-storage listeners)))
  ([^SparkListenable this ^java.util.Collection listeners]
    (-> this (.setListeners listeners))))

