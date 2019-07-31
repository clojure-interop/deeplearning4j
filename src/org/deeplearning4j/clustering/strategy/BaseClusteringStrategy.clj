(ns org.deeplearning4j.clustering.strategy.BaseClusteringStrategy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.strategy BaseClusteringStrategy]))

(defn ->base-clustering-strategy
  "Constructor.

  type - `org.deeplearning4j.clustering.strategy.ClusteringStrategyType`
  initial-cluster-count - `java.lang.Integer`
  distance-function - `java.lang.String`
  allow-empty-clusters - `boolean`
  inverse - `boolean`"
  (^BaseClusteringStrategy [^org.deeplearning4j.clustering.strategy.ClusteringStrategyType type ^java.lang.Integer initial-cluster-count ^java.lang.String distance-function ^Boolean allow-empty-clusters ^Boolean inverse]
    (new BaseClusteringStrategy type initial-cluster-count distance-function allow-empty-clusters inverse))
  (^BaseClusteringStrategy [^org.deeplearning4j.clustering.strategy.ClusteringStrategyType clustering-strategy-type ^Integer initial-cluster-count ^java.lang.String distance-function ^Boolean inverse]
    (new BaseClusteringStrategy clustering-strategy-type initial-cluster-count distance-function inverse)))

(defn end-when-iteration-count-equals
  "max-iteration-count - `int`

  returns: `org.deeplearning4j.clustering.strategy.BaseClusteringStrategy`"
  (^org.deeplearning4j.clustering.strategy.BaseClusteringStrategy [^BaseClusteringStrategy this ^Integer max-iteration-count]
    (-> this (.endWhenIterationCountEquals max-iteration-count))))

(defn end-when-distribution-variation-rate-less-than
  "rate - `double`

  returns: `org.deeplearning4j.clustering.strategy.BaseClusteringStrategy`"
  (^org.deeplearning4j.clustering.strategy.BaseClusteringStrategy [^BaseClusteringStrategy this ^Double rate]
    (-> this (.endWhenDistributionVariationRateLessThan rate))))

(defn inverse-distance-calculation
  "returns: `boolean`"
  (^Boolean [^BaseClusteringStrategy this]
    (-> this (.inverseDistanceCalculation))))

(defn strategy-of-type?
  "type - `org.deeplearning4j.clustering.strategy.ClusteringStrategyType`

  returns: `boolean`"
  (^Boolean [^BaseClusteringStrategy this ^org.deeplearning4j.clustering.strategy.ClusteringStrategyType type]
    (-> this (.isStrategyOfType type))))

(defn get-initial-cluster-count
  "returns: `java.lang.Integer`"
  (^java.lang.Integer [^BaseClusteringStrategy this]
    (-> this (.getInitialClusterCount))))

