(ns org.deeplearning4j.clustering.algorithm.BaseClusteringAlgorithm
  "adapted to ndarray matrices"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.algorithm BaseClusteringAlgorithm]))

(defn *setup
  "clustering-strategy - `org.deeplearning4j.clustering.strategy.ClusteringStrategy`

  returns: `org.deeplearning4j.clustering.algorithm.BaseClusteringAlgorithm`"
  (^org.deeplearning4j.clustering.algorithm.BaseClusteringAlgorithm [^org.deeplearning4j.clustering.strategy.ClusteringStrategy clustering-strategy]
    (BaseClusteringAlgorithm/setup clustering-strategy)))

(defn apply-to
  "Description copied from interface: ClusteringAlgorithm

  points - `java.util.List`

  returns: `org.deeplearning4j.clustering.cluster.ClusterSet`"
  (^org.deeplearning4j.clustering.cluster.ClusterSet [^BaseClusteringAlgorithm this ^java.util.List points]
    (-> this (.applyTo points))))

