(ns org.deeplearning4j.arbiter.optimize.api.CandidateGenerator
  "A CandidateGenerator proposes candidates (i.e., hyperparameter configurations) for evaluation.
 This abstraction allows for different ways of generating the next configuration to test; for example,
 random search, grid search, Bayesian optimization methods, etc."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api CandidateGenerator]))

(defn has-more-candidates?
  "Is this candidate generator able to generate more candidates? This will always return true in some
  cases, but some search strategies have a limit (grid search, for example)

  returns: `boolean`"
  (^Boolean [^CandidateGenerator this]
    (-> this (.hasMoreCandidates))))

(defn get-candidate
  "Generate a candidate hyperparameter configuration

  returns: `org.deeplearning4j.arbiter.optimize.api.Candidate`"
  (^org.deeplearning4j.arbiter.optimize.api.Candidate [^CandidateGenerator this]
    (-> this (.getCandidate))))

(defn report-results
  "Report results for the candidate generator.

  result - The results to report - `org.deeplearning4j.arbiter.optimize.api.OptimizationResult`"
  ([^CandidateGenerator this ^org.deeplearning4j.arbiter.optimize.api.OptimizationResult result]
    (-> this (.reportResults result))))

(defn get-parameter-space
  "returns: Get the parameter space for this candidate generator - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace<?>`"
  (^org.deeplearning4j.arbiter.optimize.api.ParameterSpace [^CandidateGenerator this]
    (-> this (.getParameterSpace))))

(defn set-rng-seed
  "rng-seed - Set the random number generator seed for the candidate generator - `long`"
  ([^CandidateGenerator this ^Long rng-seed]
    (-> this (.setRngSeed rng-seed))))

(defn get-candidate-type
  "returns: The type (class) of the generated candidates - `java.lang.Class<?>`"
  (^java.lang.Class [^CandidateGenerator this]
    (-> this (.getCandidateType))))

