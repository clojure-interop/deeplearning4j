(ns org.deeplearning4j.spark.impl.paramavg.aggregator.ParameterAveragingAggregationTuple
  "Simple helper tuple used to execute parameter averaging"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.paramavg.aggregator ParameterAveragingAggregationTuple]))

(defn ->parameter-averaging-aggregation-tuple
  "Constructor."
  (^ParameterAveragingAggregationTuple []
    (new ParameterAveragingAggregationTuple )))

