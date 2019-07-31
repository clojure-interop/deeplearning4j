(ns org.deeplearning4j.spark.impl.graph.scoring.ScoreExamplesWithKeyFunction
  "Function to score examples individually, where each example is associated with a particular key
 Note that scoring is batched for computational efficiency.
 This is the Spark implementation of the ComputationGraph.scoreExamples(MultiDataSet, boolean) method
 Note: The MultiDataSet objects passed in must have exactly one example in them (otherwise: can't have a 1:1 association
 between keys and data sets to score)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.graph.scoring ScoreExamplesWithKeyFunction]))

(defn ->score-examples-with-key-function
  "Constructor.

  params - `org.apache.spark.broadcast.Broadcast`
  json-config - `org.apache.spark.broadcast.Broadcast`
  add-regularization-terms - `boolean`
  batch-size - `int`"
  (^ScoreExamplesWithKeyFunction [^org.apache.spark.broadcast.Broadcast params ^org.apache.spark.broadcast.Broadcast json-config ^Boolean add-regularization-terms ^Integer batch-size]
    (new ScoreExamplesWithKeyFunction params json-config add-regularization-terms batch-size)))

