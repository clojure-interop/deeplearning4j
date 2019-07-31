(ns org.deeplearning4j.spark.parameterserver.accumulation.SharedTrainingAccumulationFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.accumulation SharedTrainingAccumulationFunction]))

(defn ->shared-training-accumulation-function
  "Constructor."
  (^SharedTrainingAccumulationFunction []
    (new SharedTrainingAccumulationFunction )))

(defn call
  "tuple-1 - `org.deeplearning4j.spark.parameterserver.accumulation.SharedTrainingAccumulationTuple`
  tuple-2 - `org.deeplearning4j.spark.parameterserver.accumulation.SharedTrainingAccumulationTuple`

  returns: `org.deeplearning4j.spark.parameterserver.accumulation.SharedTrainingAccumulationTuple`

  throws: java.lang.Exception"
  (^org.deeplearning4j.spark.parameterserver.accumulation.SharedTrainingAccumulationTuple [^SharedTrainingAccumulationFunction this ^org.deeplearning4j.spark.parameterserver.accumulation.SharedTrainingAccumulationTuple tuple-1 ^org.deeplearning4j.spark.parameterserver.accumulation.SharedTrainingAccumulationTuple tuple-2]
    (-> this (.call tuple-1 tuple-2))))

