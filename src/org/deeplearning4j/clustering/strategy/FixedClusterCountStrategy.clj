(ns org.deeplearning4j.clustering.strategy.FixedClusterCountStrategy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.strategy FixedClusterCountStrategy]))

(defn *setup
  "cluster-count - `int`
  distance-function - `java.lang.String`
  inverse - `boolean`

  returns: `org.deeplearning4j.clustering.strategy.FixedClusterCountStrategy`"
  (^org.deeplearning4j.clustering.strategy.FixedClusterCountStrategy [^Integer cluster-count ^java.lang.String distance-function ^Boolean inverse]
    (FixedClusterCountStrategy/setup cluster-count distance-function inverse)))

(defn inverse-distance-calculation
  "returns: `boolean`"
  (^Boolean [^FixedClusterCountStrategy this]
    (-> this (.inverseDistanceCalculation))))

(defn optimization-defined?
  "returns: `boolean`"
  (^Boolean [^FixedClusterCountStrategy this]
    (-> this (.isOptimizationDefined))))

(defn optimization-applicable-now?
  "iteration-history - `org.deeplearning4j.clustering.iteration.IterationHistory`

  returns: `boolean`"
  (^Boolean [^FixedClusterCountStrategy this ^org.deeplearning4j.clustering.iteration.IterationHistory iteration-history]
    (-> this (.isOptimizationApplicableNow iteration-history))))

