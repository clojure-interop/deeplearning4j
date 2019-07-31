(ns org.deeplearning4j.clustering.condition.ClusteringAlgorithmCondition
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.condition ClusteringAlgorithmCondition]))

(defn satisfied?
  "iteration-history - `org.deeplearning4j.clustering.iteration.IterationHistory`

  returns: `boolean`"
  (^Boolean [^ClusteringAlgorithmCondition this ^org.deeplearning4j.clustering.iteration.IterationHistory iteration-history]
    (-> this (.isSatisfied iteration-history))))

