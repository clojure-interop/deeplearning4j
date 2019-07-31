(ns org.deeplearning4j.clustering.condition.ConvergenceCondition
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.condition ConvergenceCondition]))

(defn ->convergence-condition
  "Constructor."
  (^ConvergenceCondition []
    (new ConvergenceCondition )))

(defn *distribution-variation-rate-less-than
  "points-distribution-change-rate - `double`

  returns: `org.deeplearning4j.clustering.condition.ConvergenceCondition`"
  (^org.deeplearning4j.clustering.condition.ConvergenceCondition [^Double points-distribution-change-rate]
    (ConvergenceCondition/distributionVariationRateLessThan points-distribution-change-rate)))

(defn satisfied?
  "iteration-history - `org.deeplearning4j.clustering.iteration.IterationHistory`

  returns: `boolean`"
  (^Boolean [^ConvergenceCondition this ^org.deeplearning4j.clustering.iteration.IterationHistory iteration-history]
    (-> this (.isSatisfied iteration-history))))

