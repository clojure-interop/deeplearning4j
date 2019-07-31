(ns org.deeplearning4j.spark.impl.graph.evaluation.IEvaluateMDSPathsFlatMapFunction
  "Function to evaluate data (using one or more IEvaluation instances), in a distributed manner
 Flat map function used to batch examples for computational efficiency  reduce number of IEvaluation objects returned
 for network efficiency."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.graph.evaluation IEvaluateMDSPathsFlatMapFunction]))

(defn ->i-evaluate-mds-paths-flat-map-function
  "Constructor.

  json - `org.apache.spark.broadcast.Broadcast`
  params - `org.apache.spark.broadcast.Broadcast`
  eval-num-workers - `int`
  eval-batch-size - `int`
  ds-loader - `org.deeplearning4j.api.loader.DataSetLoader`
  mds-loader - `org.deeplearning4j.api.loader.MultiDataSetLoader`
  evaluations - `org.deeplearning4j.eval.IEvaluation`"
  (^IEvaluateMDSPathsFlatMapFunction [^org.apache.spark.broadcast.Broadcast json ^org.apache.spark.broadcast.Broadcast params ^Integer eval-num-workers ^Integer eval-batch-size ^org.deeplearning4j.api.loader.DataSetLoader ds-loader ^org.deeplearning4j.api.loader.MultiDataSetLoader mds-loader ^org.deeplearning4j.eval.IEvaluation evaluations]
    (new IEvaluateMDSPathsFlatMapFunction json params eval-num-workers eval-batch-size ds-loader mds-loader evaluations)))

