(ns org.deeplearning4j.clustering.algorithm.ClusteringAlgorithm
  "An interface for a clustering
 algorithm.
 This is for applying a clustering
 algorithm to a list of points."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.algorithm ClusteringAlgorithm]))

(defn apply-to
  "Apply a clustering
  algorithm for a given result

  points - `java.util.List`

  returns: `org.deeplearning4j.clustering.cluster.ClusterSet`"
  (^org.deeplearning4j.clustering.cluster.ClusterSet [^ClusteringAlgorithm this ^java.util.List points]
    (-> this (.applyTo points))))

