(ns org.deeplearning4j.spark.impl.graph.scoring.ScoreExamplesFunction
  "Function to score examples individually. Note that scoring is batched for computational efficiency.
 This is essentially a Spark implementation of the ComputationGraph.scoreExamples(MultiDataSet, boolean) method
 Note: This method returns a score for each example, but the association between examples and scores is lost. In
 cases where we need to know the score for particular examples, use ScoreExamplesWithKeyFunction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.graph.scoring ScoreExamplesFunction]))

(defn ->score-examples-function
  "Constructor.

  params - `org.apache.spark.broadcast.Broadcast`
  json-config - `org.apache.spark.broadcast.Broadcast`
  add-regularization-terms - `boolean`
  batch-size - `int`"
  (^ScoreExamplesFunction [^org.apache.spark.broadcast.Broadcast params ^org.apache.spark.broadcast.Broadcast json-config ^Boolean add-regularization-terms ^Integer batch-size]
    (new ScoreExamplesFunction params json-config add-regularization-terms batch-size)))

