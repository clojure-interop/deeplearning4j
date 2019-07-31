(ns org.deeplearning4j.spark.impl.graph.scoring.ScoreFlatMapFunctionCGMultiDataSet
  "Function used to score a MultiDataSet using a given ComputationGraph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.graph.scoring ScoreFlatMapFunctionCGMultiDataSet]))

(defn ->score-flat-map-function-cg-multi-data-set
  "Constructor.

  json - `java.lang.String`
  params - `org.apache.spark.broadcast.Broadcast`
  minibatch-size - `int`"
  (^ScoreFlatMapFunctionCGMultiDataSet [^java.lang.String json ^org.apache.spark.broadcast.Broadcast params ^Integer minibatch-size]
    (new ScoreFlatMapFunctionCGMultiDataSet json params minibatch-size)))

