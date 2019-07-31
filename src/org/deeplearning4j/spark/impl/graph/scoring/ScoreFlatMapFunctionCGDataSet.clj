(ns org.deeplearning4j.spark.impl.graph.scoring.ScoreFlatMapFunctionCGDataSet
  "Function used to score a DataSet using a ComputationGraph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.graph.scoring ScoreFlatMapFunctionCGDataSet]))

(defn ->score-flat-map-function-cg-data-set
  "Constructor.

  json - `java.lang.String`
  params - `org.apache.spark.broadcast.Broadcast`
  minibatch-size - `int`"
  (^ScoreFlatMapFunctionCGDataSet [^java.lang.String json ^org.apache.spark.broadcast.Broadcast params ^Integer minibatch-size]
    (new ScoreFlatMapFunctionCGDataSet json params minibatch-size)))

