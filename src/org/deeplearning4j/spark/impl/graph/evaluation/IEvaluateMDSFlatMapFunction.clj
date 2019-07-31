(ns org.deeplearning4j.spark.impl.graph.evaluation.IEvaluateMDSFlatMapFunction
  "Function to evaluate data (using one or more IEvaluation instances), in a distributed manner
 Flat map function used to batch examples for computational efficiency  reduce number of IEvaluation objects returned
 for network efficiency."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.graph.evaluation IEvaluateMDSFlatMapFunction]))

(defn ->i-evaluate-mds-flat-map-function
  "Constructor.

  json - `org.apache.spark.broadcast.Broadcast`
  params - `org.apache.spark.broadcast.Broadcast`
  eval-num-workers - `int`
  eval-batch-size - `int`
  evaluations - `T`"
  (^IEvaluateMDSFlatMapFunction [^org.apache.spark.broadcast.Broadcast json ^org.apache.spark.broadcast.Broadcast params ^Integer eval-num-workers ^Integer eval-batch-size evaluations]
    (new IEvaluateMDSFlatMapFunction json params eval-num-workers eval-batch-size evaluations)))

