(ns org.deeplearning4j.parallelism.ParallelWrapper
  "This is simple data-parallel wrapper
 suitable for multi-cpu/multi-gpu environments.
 PLEASE NOTE: This implementation is NOT NUMA-aware."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism ParallelWrapper]))

(defn close
  "throws: java.lang.Exception"
  ([^ParallelWrapper this]
    (-> this (.close))))

(defn shutdown
  "This method causes all threads used for parallel training to stop"
  ([^ParallelWrapper this]
    (-> this (.shutdown))))

(defn stop-fit
  "Will stop a fit operation from continuing to iterate."
  ([^ParallelWrapper this]
    (-> this (.stopFit))))

(defn fit
  "This method takes DataSetIterator, and starts training over it by scheduling DataSets to different executors

  source - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  ([^ParallelWrapper this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator source]
    (-> this (.fit source))))

(defn set-listeners
  "Set the listeners, along with a StatsStorageRouter that the results will be shuffled to (in the case of any listeners
  that implement the RoutingIterationListener interface)

  stats-storage - Stats storage router to place the results into - `org.deeplearning4j.api.storage.StatsStorageRouter`
  listeners - Listeners to set - `org.deeplearning4j.optimize.api.TrainingListener`"
  ([^ParallelWrapper this ^org.deeplearning4j.api.storage.StatsStorageRouter stats-storage ^org.deeplearning4j.optimize.api.TrainingListener listeners]
    (-> this (.setListeners stats-storage listeners)))
  ([^ParallelWrapper this ^java.util.Collection listeners]
    (-> this (.setListeners listeners))))

(defn broadcast-gradients
  "This method will propagate gradients across all workers

  gradients - `org.deeplearning4j.optimize.listeners.SharedGradient`"
  ([^ParallelWrapper this ^org.deeplearning4j.optimize.listeners.SharedGradient gradients]
    (-> this (.broadcastGradients gradients))))

