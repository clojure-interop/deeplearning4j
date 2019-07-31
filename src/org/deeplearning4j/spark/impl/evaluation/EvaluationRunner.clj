(ns org.deeplearning4j.spark.impl.evaluation.EvaluationRunner
  "Singleton evaluation hrunner class for performing evaluation on Spark.
 Allows fewer evaluation networks (and hence memory/cache thrashing) than one network per spark thread"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.evaluation EvaluationRunner]))

(defn *get-instance
  "returns: `org.deeplearning4j.spark.impl.evaluation.EvaluationRunner`"
  (^org.deeplearning4j.spark.impl.evaluation.EvaluationRunner []
    (EvaluationRunner/getInstance )))

(defn execute
  "Evaluate the data using the specified evaluations

  evals - Evaluations to perform - `org.deeplearning4j.eval.IEvaluation[]`
  eval-workers - Number of concurrent workers - `int`
  eval-batch-size - Evaluation batch size to use - `int`
  ds - DataSet iterator - `java.util.Iterator`
  mds - MultiDataSet iterator - `java.util.Iterator`
  is-cg - True if ComputationGraph, false otherwise - `boolean`
  json - JSON for the network - `org.apache.spark.broadcast.Broadcast`
  params - Parameters for the network - `org.apache.spark.broadcast.Broadcast`

  returns: Future for the results - `java.util.concurrent.Future<org.deeplearning4j.eval.IEvaluation[]>`"
  ([^EvaluationRunner this evals ^Integer eval-workers ^Integer eval-batch-size ^java.util.Iterator ds ^java.util.Iterator mds ^Boolean is-cg ^org.apache.spark.broadcast.Broadcast json ^org.apache.spark.broadcast.Broadcast params]
    (-> this (.execute evals eval-workers eval-batch-size ds mds is-cg json params))))

