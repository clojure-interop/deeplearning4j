(ns org.deeplearning4j.clustering.condition.VarianceVariationCondition
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.condition VarianceVariationCondition]))

(defn ->variance-variation-condition
  "Constructor."
  (^VarianceVariationCondition []
    (new VarianceVariationCondition )))

(defn *variance-variation-less-than
  "variance-variation - `double`
  period - `int`

  returns: `org.deeplearning4j.clustering.condition.VarianceVariationCondition`"
  (^org.deeplearning4j.clustering.condition.VarianceVariationCondition [^Double variance-variation ^Integer period]
    (VarianceVariationCondition/varianceVariationLessThan variance-variation period)))

(defn satisfied?
  "iteration-history - `org.deeplearning4j.clustering.iteration.IterationHistory`

  returns: `boolean`"
  (^Boolean [^VarianceVariationCondition this ^org.deeplearning4j.clustering.iteration.IterationHistory iteration-history]
    (-> this (.isSatisfied iteration-history))))

