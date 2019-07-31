(ns org.deeplearning4j.arbiter.optimize.generator.GridSearchCandidateGenerator
  "GridSearchCandidateGenerator: generates candidates in an exhaustive grid search manner.
 Note that:
 - For discrete parameters: the grid size (# values to check per hyperparameter) is equal to the number of values for
 that hyperparameter
 - For integer parameters: the grid size is equal to min(discretizationCount,max-min+1). Some integer ranges can
 be large, and we don't necessarily want to exhaustively search them. discretizationCount is a constructor argument
 - For continuous parameters: the grid size is equal to discretizationCount.
 In all cases, the minimum, maximum and gridSize-2 values between the min/max will be generated.
 Also note that: if a probability distribution is provided for continuous hyperparameters, this will be taken into account
 when generating candidates. This allows the grid for a hyperparameter to be non-linear: i.e., for example, linear in log space"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.generator GridSearchCandidateGenerator]))

(defn ->grid-search-candidate-generator
  "Constructor.

  parameter-space - ParameterSpace from which to generate candidates - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  discretization-count - For continuous parameters: into how many values should we discretize them into?For example, suppose continuous parameter is in range [0,1] with 3 bins:do [0.0, 0.5, 1.0]. Note that if all values - `int`
  mode - GridSearchCandidateGenerator.Mode specifies the orderin which candidates should be generated. - `org.deeplearning4j.arbiter.optimize.generator.GridSearchCandidateGenerator$Mode`
  data-parameters - `java.util.Map`
  init-done - `boolean`"
  (^GridSearchCandidateGenerator [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace parameter-space ^Integer discretization-count ^org.deeplearning4j.arbiter.optimize.generator.GridSearchCandidateGenerator$Mode mode ^java.util.Map data-parameters ^Boolean init-done]
    (new GridSearchCandidateGenerator parameter-space discretization-count mode data-parameters init-done))
  (^GridSearchCandidateGenerator [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace parameter-space ^Integer discretization-count ^org.deeplearning4j.arbiter.optimize.generator.GridSearchCandidateGenerator$Mode mode ^java.util.Map data-parameters]
    (new GridSearchCandidateGenerator parameter-space discretization-count mode data-parameters)))

(defn *index-to-values
  "num-values-per-param - `int[]`
  candidate-idx - `int`
  product - `int`

  returns: `double[]`"
  ([num-values-per-param ^Integer candidate-idx ^Integer product]
    (GridSearchCandidateGenerator/indexToValues num-values-per-param candidate-idx product)))

(defn has-more-candidates?
  "Description copied from interface: CandidateGenerator

  returns: `boolean`"
  (^Boolean [^GridSearchCandidateGenerator this]
    (-> this (.hasMoreCandidates))))

(defn get-candidate
  "Description copied from interface: CandidateGenerator

  returns: `org.deeplearning4j.arbiter.optimize.api.Candidate`"
  (^org.deeplearning4j.arbiter.optimize.api.Candidate [^GridSearchCandidateGenerator this]
    (-> this (.getCandidate))))

(defn get-candidate-type
  "returns: The type (class) of the generated candidates - `java.lang.Class<?>`"
  (^java.lang.Class [^GridSearchCandidateGenerator this]
    (-> this (.getCandidateType))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GridSearchCandidateGenerator this]
    (-> this (.toString))))

