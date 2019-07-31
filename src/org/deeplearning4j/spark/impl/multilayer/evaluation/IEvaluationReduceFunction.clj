(ns org.deeplearning4j.spark.impl.multilayer.evaluation.IEvaluationReduceFunction
  "Reduction function for use with IEvaluateFlatMapFunction for distributed evaluation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.multilayer.evaluation IEvaluationReduceFunction]))

(defn ->i-evaluation-reduce-function
  "Constructor."
  (^IEvaluationReduceFunction []
    (new IEvaluationReduceFunction )))

(defn call
  "eval-1 - `T[]`
  eval-2 - `T[]`

  returns: `T[]`

  throws: java.lang.Exception"
  ([^IEvaluationReduceFunction this eval-1 eval-2]
    (-> this (.call eval-1 eval-2))))

