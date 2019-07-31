(ns org.deeplearning4j.clustering.condition.FixedIterationCountCondition
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.condition FixedIterationCountCondition]))

(defn *iteration-count-greater-than
  "iteration-count - `int`

  returns: `org.deeplearning4j.clustering.condition.FixedIterationCountCondition`"
  (^org.deeplearning4j.clustering.condition.FixedIterationCountCondition [^Integer iteration-count]
    (FixedIterationCountCondition/iterationCountGreaterThan iteration-count)))

(defn satisfied?
  "iteration-history - `org.deeplearning4j.clustering.iteration.IterationHistory`

  returns: `boolean`"
  (^Boolean [^FixedIterationCountCondition this ^org.deeplearning4j.clustering.iteration.IterationHistory iteration-history]
    (-> this (.isSatisfied iteration-history))))

