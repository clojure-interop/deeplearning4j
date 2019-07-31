(ns org.deeplearning4j.spark.impl.multilayer.evaluation.IEvaluateAggregateFunction
  "A simple function to merge IEvaluation instances"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.multilayer.evaluation IEvaluateAggregateFunction]))

(defn ->i-evaluate-aggregate-function
  "Constructor."
  (^IEvaluateAggregateFunction []
    (new IEvaluateAggregateFunction )))

(defn call
  "v-1 - `T[]`
  v-2 - `T[]`

  returns: `T[]`

  throws: java.lang.Exception"
  ([^IEvaluateAggregateFunction this v-1 v-2]
    (-> this (.call v-1 v-2))))

