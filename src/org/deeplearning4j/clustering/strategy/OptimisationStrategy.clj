(ns org.deeplearning4j.clustering.strategy.OptimisationStrategy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.strategy OptimisationStrategy]))

(defn *-default-iteration-count
  "Static Field.

  type: int"
  []
  OptimisationStrategy/defaultIterationCount)

(defn *setup
  "initial-cluster-count - `int`
  distance-function - `java.lang.String`

  returns: `org.deeplearning4j.clustering.strategy.OptimisationStrategy`"
  (^org.deeplearning4j.clustering.strategy.OptimisationStrategy [^Integer initial-cluster-count ^java.lang.String distance-function]
    (OptimisationStrategy/setup initial-cluster-count distance-function)))

(defn optimize
  "type - `org.deeplearning4j.clustering.optimisation.ClusteringOptimizationType`
  value - `double`

  returns: `org.deeplearning4j.clustering.strategy.OptimisationStrategy`"
  (^org.deeplearning4j.clustering.strategy.OptimisationStrategy [^OptimisationStrategy this ^org.deeplearning4j.clustering.optimisation.ClusteringOptimizationType type ^Double value]
    (-> this (.optimize type value))))

(defn optimize-when-iteration-count-multiple-of
  "value - `int`

  returns: `org.deeplearning4j.clustering.strategy.OptimisationStrategy`"
  (^org.deeplearning4j.clustering.strategy.OptimisationStrategy [^OptimisationStrategy this ^Integer value]
    (-> this (.optimizeWhenIterationCountMultipleOf value))))

(defn optimize-when-point-distribution-variation-rate-less-than
  "rate - `double`

  returns: `org.deeplearning4j.clustering.strategy.OptimisationStrategy`"
  (^org.deeplearning4j.clustering.strategy.OptimisationStrategy [^OptimisationStrategy this ^Double rate]
    (-> this (.optimizeWhenPointDistributionVariationRateLessThan rate))))

(defn get-clustering-optimization-value
  "returns: `double`"
  (^Double [^OptimisationStrategy this]
    (-> this (.getClusteringOptimizationValue))))

(defn clustering-optimization-type?
  "type - `org.deeplearning4j.clustering.optimisation.ClusteringOptimizationType`

  returns: `boolean`"
  (^Boolean [^OptimisationStrategy this ^org.deeplearning4j.clustering.optimisation.ClusteringOptimizationType type]
    (-> this (.isClusteringOptimizationType type))))

(defn optimization-defined?
  "returns: `boolean`"
  (^Boolean [^OptimisationStrategy this]
    (-> this (.isOptimizationDefined))))

(defn optimization-applicable-now?
  "iteration-history - `org.deeplearning4j.clustering.iteration.IterationHistory`

  returns: `boolean`"
  (^Boolean [^OptimisationStrategy this ^org.deeplearning4j.clustering.iteration.IterationHistory iteration-history]
    (-> this (.isOptimizationApplicableNow iteration-history))))

