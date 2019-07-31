(ns org.deeplearning4j.spark.impl.multilayer.evaluation.IEvaluateFlatMapFunction
  "Function to evaluate data (using an IEvaluation instance), in a distributed manner
 Flat map function used to batch examples for computational efficiency  reduce number of IEvaluation objects returned
 for network efficiency."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.multilayer.evaluation IEvaluateFlatMapFunction]))

(defn ->i-evaluate-flat-map-function
  "Constructor.

  is-comp-graph - `boolean`
  json - `org.apache.spark.broadcast.Broadcast`
  params - `org.apache.spark.broadcast.Broadcast`
  eval-num-workers - `int`
  eval-batch-size - `int`
  evaluations - `T`"
  (^IEvaluateFlatMapFunction [^Boolean is-comp-graph ^org.apache.spark.broadcast.Broadcast json ^org.apache.spark.broadcast.Broadcast params ^Integer eval-num-workers ^Integer eval-batch-size evaluations]
    (new IEvaluateFlatMapFunction is-comp-graph json params eval-num-workers eval-batch-size evaluations)))

