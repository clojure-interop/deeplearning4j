(ns org.deeplearning4j.spark.impl.multilayer.scoring.ScoreFlatMapFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.multilayer.scoring ScoreFlatMapFunction]))

(defn ->score-flat-map-function
  "Constructor.

  json - `java.lang.String`
  params - `org.apache.spark.broadcast.Broadcast`
  minibatch-size - `int`"
  (^ScoreFlatMapFunction [^java.lang.String json ^org.apache.spark.broadcast.Broadcast params ^Integer minibatch-size]
    (new ScoreFlatMapFunction json params minibatch-size)))

