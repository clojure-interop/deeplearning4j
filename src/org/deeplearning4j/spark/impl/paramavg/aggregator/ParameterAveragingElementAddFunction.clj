(ns org.deeplearning4j.spark.impl.paramavg.aggregator.ParameterAveragingElementAddFunction
  "Add function for parameter averaging"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.paramavg.aggregator ParameterAveragingElementAddFunction]))

(defn ->parameter-averaging-element-add-function
  "Constructor."
  (^ParameterAveragingElementAddFunction []
    (new ParameterAveragingElementAddFunction )))

(defn call
  "tuple - `org.deeplearning4j.spark.impl.paramavg.aggregator.ParameterAveragingAggregationTuple`
  result - `org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingResult`

  returns: `org.deeplearning4j.spark.impl.paramavg.aggregator.ParameterAveragingAggregationTuple`

  throws: java.lang.Exception"
  (^org.deeplearning4j.spark.impl.paramavg.aggregator.ParameterAveragingAggregationTuple [^ParameterAveragingElementAddFunction this ^org.deeplearning4j.spark.impl.paramavg.aggregator.ParameterAveragingAggregationTuple tuple ^org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingResult result]
    (-> this (.call tuple result))))

