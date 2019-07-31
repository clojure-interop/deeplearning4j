(ns org.deeplearning4j.spark.impl.paramavg.aggregator.ParameterAveragingElementCombineFunction
  "Function used in ParameterAveraging TrainingMaster, for doing parameter averaging, and handling updaters"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.paramavg.aggregator ParameterAveragingElementCombineFunction]))

(defn ->parameter-averaging-element-combine-function
  "Constructor."
  (^ParameterAveragingElementCombineFunction []
    (new ParameterAveragingElementCombineFunction )))

(defn call
  "v-1 - `org.deeplearning4j.spark.impl.paramavg.aggregator.ParameterAveragingAggregationTuple`
  v-2 - `org.deeplearning4j.spark.impl.paramavg.aggregator.ParameterAveragingAggregationTuple`

  returns: `org.deeplearning4j.spark.impl.paramavg.aggregator.ParameterAveragingAggregationTuple`

  throws: java.lang.Exception"
  (^org.deeplearning4j.spark.impl.paramavg.aggregator.ParameterAveragingAggregationTuple [^ParameterAveragingElementCombineFunction this ^org.deeplearning4j.spark.impl.paramavg.aggregator.ParameterAveragingAggregationTuple v-1 ^org.deeplearning4j.spark.impl.paramavg.aggregator.ParameterAveragingAggregationTuple v-2]
    (-> this (.call v-1 v-2))))

