(ns org.deeplearning4j.arbiter.optimize.generator.RandomSearchGenerator
  "RandomSearchGenerator: generates candidates at random.
 Note: if a probability distribution is provided for continuous hyperparameters,
 this will be taken into account
 when generating candidates. This allows the search to be weighted more towards
 certain values according to a probability
 density. For example: generate samples for learning rate according to log uniform distribution"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.generator RandomSearchGenerator]))

(defn ->random-search-generator
  "Constructor.

  parameter-space - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  data-parameters - `java.util.Map`
  init-done - `boolean`"
  (^RandomSearchGenerator [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace parameter-space ^java.util.Map data-parameters ^Boolean init-done]
    (new RandomSearchGenerator parameter-space data-parameters init-done))
  (^RandomSearchGenerator [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace parameter-space ^java.util.Map data-parameters]
    (new RandomSearchGenerator parameter-space data-parameters))
  (^RandomSearchGenerator [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace parameter-space]
    (new RandomSearchGenerator parameter-space)))

(defn has-more-candidates?
  "Description copied from interface: CandidateGenerator

  returns: `boolean`"
  (^Boolean [^RandomSearchGenerator this]
    (-> this (.hasMoreCandidates))))

(defn get-candidate
  "Description copied from interface: CandidateGenerator

  returns: `org.deeplearning4j.arbiter.optimize.api.Candidate`"
  (^org.deeplearning4j.arbiter.optimize.api.Candidate [^RandomSearchGenerator this]
    (-> this (.getCandidate))))

(defn get-candidate-type
  "returns: The type (class) of the generated candidates - `java.lang.Class<?>`"
  (^java.lang.Class [^RandomSearchGenerator this]
    (-> this (.getCandidateType))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RandomSearchGenerator this]
    (-> this (.toString))))

