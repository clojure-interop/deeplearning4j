(ns org.deeplearning4j.earlystopping.EarlyStoppingResult
  "EarlyStoppingResult: contains the results of the early stopping training, such as:
 - Why the training was terminated
 - Score vs. epoch
 - Epoch that the best model was found
 - Score of the best model
 - The best model (MultiLayerNetwork) itself"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping EarlyStoppingResult]))

(defn ->early-stopping-result
  "Constructor.

  termination-reason - `org.deeplearning4j.earlystopping.EarlyStoppingResult$TerminationReason`
  termination-details - `java.lang.String`
  score-vs-epoch - `java.util.Map`
  best-model-epoch - `int`
  best-model-score - `double`
  total-epochs - `int`
  best-model - `T`"
  (^EarlyStoppingResult [^org.deeplearning4j.earlystopping.EarlyStoppingResult$TerminationReason termination-reason ^java.lang.String termination-details ^java.util.Map score-vs-epoch ^Integer best-model-epoch ^Double best-model-score ^Integer total-epochs best-model]
    (new EarlyStoppingResult termination-reason termination-details score-vs-epoch best-model-epoch best-model-score total-epochs best-model)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^EarlyStoppingResult this]
    (-> this (.toString))))

(defn get-best-model
  "returns: `T`"
  ([^EarlyStoppingResult this]
    (-> this (.getBestModel))))

