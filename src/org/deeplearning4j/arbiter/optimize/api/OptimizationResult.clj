(ns org.deeplearning4j.arbiter.optimize.api.OptimizationResult
  "An optimization result represents the results of an optimization run, including the canditate configuration, the
 trained model, the score for that model, and index of the model"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api OptimizationResult]))

(defn ->optimization-result
  "Constructor.

  candidate - `org.deeplearning4j.arbiter.optimize.api.Candidate`
  score - `java.lang.Double`
  index - `int`
  model-specific-results - `java.lang.Object`
  candidate-info - `org.deeplearning4j.arbiter.optimize.runner.CandidateInfo`
  result-reference - `org.deeplearning4j.arbiter.optimize.api.saving.ResultReference`"
  (^OptimizationResult [^org.deeplearning4j.arbiter.optimize.api.Candidate candidate ^java.lang.Double score ^Integer index ^java.lang.Object model-specific-results ^org.deeplearning4j.arbiter.optimize.runner.CandidateInfo candidate-info ^org.deeplearning4j.arbiter.optimize.api.saving.ResultReference result-reference]
    (new OptimizationResult candidate score index model-specific-results candidate-info result-reference)))

