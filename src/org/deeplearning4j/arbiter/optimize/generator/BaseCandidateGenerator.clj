(ns org.deeplearning4j.arbiter.optimize.generator.BaseCandidateGenerator
  "BaseCandidateGenerator: abstract class upon which RandomSearchGenerator
 and GridSearchCandidateGenerator
 are built."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.generator BaseCandidateGenerator]))

(defn ->base-candidate-generator
  "Constructor.

  parameter-space - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  data-parameters - `java.util.Map`
  init-done - `boolean`"
  (^BaseCandidateGenerator [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace parameter-space ^java.util.Map data-parameters ^Boolean init-done]
    (new BaseCandidateGenerator parameter-space data-parameters init-done)))

(defn get-parameter-space
  "returns: Get the parameter space for this candidate generator - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace<T>`"
  (^org.deeplearning4j.arbiter.optimize.api.ParameterSpace [^BaseCandidateGenerator this]
    (-> this (.getParameterSpace))))

(defn report-results
  "Description copied from interface: CandidateGenerator

  result - The results to report - `org.deeplearning4j.arbiter.optimize.api.OptimizationResult`"
  ([^BaseCandidateGenerator this ^org.deeplearning4j.arbiter.optimize.api.OptimizationResult result]
    (-> this (.reportResults result))))

(defn set-rng-seed
  "rng-seed - Set the random number generator seed for the candidate generator - `long`"
  ([^BaseCandidateGenerator this ^Long rng-seed]
    (-> this (.setRngSeed rng-seed))))

