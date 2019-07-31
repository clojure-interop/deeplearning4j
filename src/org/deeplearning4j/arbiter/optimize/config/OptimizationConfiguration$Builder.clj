(ns org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.config OptimizationConfiguration$Builder]))

(defn ->builder
  "Constructor."
  (^OptimizationConfiguration$Builder []
    (new OptimizationConfiguration$Builder )))

(defn data-provider
  "Deprecated. Use dataSource(Class, Properties)

  data-provider - `org.deeplearning4j.arbiter.optimize.api.data.DataProvider`

  returns: `org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration$Builder`"
  (^org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration$Builder [^OptimizationConfiguration$Builder this ^org.deeplearning4j.arbiter.optimize.api.data.DataProvider data-provider]
    (-> this (.dataProvider data-provider))))

(defn data-source
  "DataSource: defines where the data should come from for training and testing.
  Note that implementations must have a no-argument contsructor

  data-source - Class for the data source - `java.lang.Class`
  data-source-properties - May be null. Properties for configuring the data source - `java.util.Properties`

  returns: `org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration$Builder`"
  (^org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration$Builder [^OptimizationConfiguration$Builder this ^java.lang.Class data-source ^java.util.Properties data-source-properties]
    (-> this (.dataSource data-source data-source-properties))))

(defn candidate-generator
  "candidate-generator - `org.deeplearning4j.arbiter.optimize.api.CandidateGenerator`

  returns: `org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration$Builder`"
  (^org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration$Builder [^OptimizationConfiguration$Builder this ^org.deeplearning4j.arbiter.optimize.api.CandidateGenerator candidate-generator]
    (-> this (.candidateGenerator candidate-generator))))

(defn model-saver
  "result-saver - `org.deeplearning4j.arbiter.optimize.api.saving.ResultSaver`

  returns: `org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration$Builder`"
  (^org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration$Builder [^OptimizationConfiguration$Builder this ^org.deeplearning4j.arbiter.optimize.api.saving.ResultSaver result-saver]
    (-> this (.modelSaver result-saver))))

(defn score-function
  "score-function - `org.deeplearning4j.arbiter.optimize.api.score.ScoreFunction`

  returns: `org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration$Builder`"
  (^org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration$Builder [^OptimizationConfiguration$Builder this ^org.deeplearning4j.arbiter.optimize.api.score.ScoreFunction score-function]
    (-> this (.scoreFunction score-function))))

(defn termination-conditions
  "Termination conditions to use

  conditions - `org.deeplearning4j.arbiter.optimize.api.termination.TerminationCondition`

  returns: `org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration$Builder`"
  (^org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration$Builder [^OptimizationConfiguration$Builder this ^org.deeplearning4j.arbiter.optimize.api.termination.TerminationCondition conditions]
    (-> this (.terminationConditions conditions))))

(defn rng-seed
  "rng-seed - `long`

  returns: `org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration$Builder`"
  (^org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration$Builder [^OptimizationConfiguration$Builder this ^Long rng-seed]
    (-> this (.rngSeed rng-seed))))

(defn build
  "returns: `org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration`"
  (^org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration [^OptimizationConfiguration$Builder this]
    (-> this (.build))))

