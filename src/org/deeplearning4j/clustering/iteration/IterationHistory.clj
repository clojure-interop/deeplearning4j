(ns org.deeplearning4j.clustering.iteration.IterationHistory
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.iteration IterationHistory]))

(defn ->iteration-history
  "Constructor."
  (^IterationHistory []
    (new IterationHistory )))

(defn get-most-recent-cluster-set-info
  "returns: `org.deeplearning4j.clustering.info.ClusterSetInfo`"
  (^org.deeplearning4j.clustering.info.ClusterSetInfo [^IterationHistory this]
    (-> this (.getMostRecentClusterSetInfo))))

(defn get-most-recent-iteration-info
  "returns: `org.deeplearning4j.clustering.iteration.IterationInfo`"
  (^org.deeplearning4j.clustering.iteration.IterationInfo [^IterationHistory this]
    (-> this (.getMostRecentIterationInfo))))

(defn get-iteration-count
  "returns: `int`"
  (^Integer [^IterationHistory this]
    (-> this (.getIterationCount))))

(defn get-iteration-info
  "iteration-idx - `int`

  returns: `org.deeplearning4j.clustering.iteration.IterationInfo`"
  (^org.deeplearning4j.clustering.iteration.IterationInfo [^IterationHistory this ^Integer iteration-idx]
    (-> this (.getIterationInfo iteration-idx))))

