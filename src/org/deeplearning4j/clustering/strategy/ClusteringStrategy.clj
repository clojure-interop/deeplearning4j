(ns org.deeplearning4j.clustering.strategy.ClusteringStrategy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.strategy ClusteringStrategy]))

(defn get-termination-condition
  "returns: `org.deeplearning4j.clustering.condition.ClusteringAlgorithmCondition`"
  (^org.deeplearning4j.clustering.condition.ClusteringAlgorithmCondition [^ClusteringStrategy this]
    (-> this (.getTerminationCondition))))

(defn get-initial-cluster-count
  "returns: `java.lang.Integer`"
  (^java.lang.Integer [^ClusteringStrategy this]
    (-> this (.getInitialClusterCount))))

(defn inverse-distance-calculation
  "returns: `boolean`"
  (^Boolean [^ClusteringStrategy this]
    (-> this (.inverseDistanceCalculation))))

(defn optimization-applicable-now?
  "iteration-history - `org.deeplearning4j.clustering.iteration.IterationHistory`

  returns: `boolean`"
  (^Boolean [^ClusteringStrategy this ^org.deeplearning4j.clustering.iteration.IterationHistory iteration-history]
    (-> this (.isOptimizationApplicableNow iteration-history))))

(defn get-type
  "returns: `org.deeplearning4j.clustering.strategy.ClusteringStrategyType`"
  (^org.deeplearning4j.clustering.strategy.ClusteringStrategyType [^ClusteringStrategy this]
    (-> this (.getType))))

(defn get-distance-function
  "returns: `java.lang.String`"
  (^java.lang.String [^ClusteringStrategy this]
    (-> this (.getDistanceFunction))))

(defn end-when-iteration-count-equals
  "max-iteration-count - `int`

  returns: `org.deeplearning4j.clustering.strategy.BaseClusteringStrategy`"
  (^org.deeplearning4j.clustering.strategy.BaseClusteringStrategy [^ClusteringStrategy this ^Integer max-iteration-count]
    (-> this (.endWhenIterationCountEquals max-iteration-count))))

(defn end-when-distribution-variation-rate-less-than
  "rate - `double`

  returns: `org.deeplearning4j.clustering.strategy.BaseClusteringStrategy`"
  (^org.deeplearning4j.clustering.strategy.BaseClusteringStrategy [^ClusteringStrategy this ^Double rate]
    (-> this (.endWhenDistributionVariationRateLessThan rate))))

(defn strategy-of-type?
  "type - `org.deeplearning4j.clustering.strategy.ClusteringStrategyType`

  returns: `boolean`"
  (^Boolean [^ClusteringStrategy this ^org.deeplearning4j.clustering.strategy.ClusteringStrategyType type]
    (-> this (.isStrategyOfType type))))

(defn optimization-defined?
  "returns: `boolean`"
  (^Boolean [^ClusteringStrategy this]
    (-> this (.isOptimizationDefined))))

(defn allow-empty-clusters?
  "returns: `boolean`"
  (^Boolean [^ClusteringStrategy this]
    (-> this (.isAllowEmptyClusters))))

