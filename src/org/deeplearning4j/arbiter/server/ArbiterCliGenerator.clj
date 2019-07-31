(ns org.deeplearning4j.arbiter.server.ArbiterCliGenerator
  "Generate an OptimizationConfiguration
 via the command line interface.
 You can then use this configuration json file from
 ArbiterCliRunner"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.server ArbiterCliGenerator]))

(defn ->arbiter-cli-generator
  "Constructor."
  (^ArbiterCliGenerator []
    (new ArbiterCliGenerator )))

(def *-regression-multi
  "Static Constant.

  type: java.lang.String"
  ArbiterCliGenerator/REGRESSION_MULTI)

(def *-regression
  "Static Constant.

  type: java.lang.String"
  ArbiterCliGenerator/REGRESSION)

(def *-classificiation
  "Static Constant.

  type: java.lang.String"
  ArbiterCliGenerator/CLASSIFICIATION)

(def *-random-candidate
  "Static Constant.

  type: java.lang.String"
  ArbiterCliGenerator/RANDOM_CANDIDATE)

(def *-grid-search-candidate
  "Static Constant.

  type: java.lang.String"
  ArbiterCliGenerator/GRID_SEARCH_CANDIDATE)

(def *-sequential-order
  "Static Constant.

  type: java.lang.String"
  ArbiterCliGenerator/SEQUENTIAL_ORDER)

(def *-random-order
  "Static Constant.

  type: java.lang.String"
  ArbiterCliGenerator/RANDOM_ORDER)

(def *-comp-graph
  "Static Constant.

  type: java.lang.String"
  ArbiterCliGenerator/COMP_GRAPH)

(def *-multi-layer
  "Static Constant.

  type: java.lang.String"
  ArbiterCliGenerator/MULTI_LAYER)

(def *-accuracy
  "Static Constant.

  type: java.lang.String"
  ArbiterCliGenerator/ACCURACY)

(def *-f-1
  "Static Constant.

  type: java.lang.String"
  ArbiterCliGenerator/F1)

(def *-accuracy-multi
  "Static Constant.

  type: java.lang.String"
  ArbiterCliGenerator/ACCURACY_MULTI)

(def *-f-1-multi
  "Static Constant.

  type: java.lang.String"
  ArbiterCliGenerator/F1_MULTI)

(def *-regression-score
  "Static Constant.

  type: java.lang.String"
  ArbiterCliGenerator/REGRESSION_SCORE)

(def *-regression-score-multi
  "Static Constant.

  type: java.lang.String"
  ArbiterCliGenerator/REGRESSION_SCORE_MULTI)

(defn *main
  "args - `java.lang.String`

  throws: java.lang.Exception"
  ([^java.lang.String args]
    (ArbiterCliGenerator/main args)))

(defn run-main
  "args - `java.lang.String`

  throws: java.lang.Exception"
  ([^ArbiterCliGenerator this ^java.lang.String args]
    (-> this (.runMain args))))

