(ns org.deeplearning4j.spark.parameterserver.accumulation.SharedTrainingAggregateFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.accumulation SharedTrainingAggregateFunction]))

(defn ->shared-training-aggregate-function
  "Constructor."
  (^SharedTrainingAggregateFunction []
    (new SharedTrainingAggregateFunction )))

(defn call
  "tuple - `org.deeplearning4j.spark.parameterserver.accumulation.SharedTrainingAccumulationTuple`
  result - `org.deeplearning4j.spark.parameterserver.training.SharedTrainingResult`

  returns: `org.deeplearning4j.spark.parameterserver.accumulation.SharedTrainingAccumulationTuple`

  throws: java.lang.Exception"
  (^org.deeplearning4j.spark.parameterserver.accumulation.SharedTrainingAccumulationTuple [^SharedTrainingAggregateFunction this ^org.deeplearning4j.spark.parameterserver.accumulation.SharedTrainingAccumulationTuple tuple ^org.deeplearning4j.spark.parameterserver.training.SharedTrainingResult result]
    (-> this (.call tuple result))))

