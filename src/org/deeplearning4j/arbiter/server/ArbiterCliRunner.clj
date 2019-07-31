(ns org.deeplearning4j.arbiter.server.ArbiterCliRunner
  "Options:
 --dataSetIteratorClass
 --modelSavePath
 Default: /tmp
 --neuralNetType
 --optimizationConfigPath
 --problemType
 Default: classification
 --regressionType"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.server ArbiterCliRunner]))

(defn ->arbiter-cli-runner
  "Constructor."
  (^ArbiterCliRunner []
    (new ArbiterCliRunner )))

(def *-classification
  "Static Constant.

  type: java.lang.String"
  ArbiterCliRunner/CLASSIFICATION)

(def *-regression
  "Static Constant.

  type: java.lang.String"
  ArbiterCliRunner/REGRESSION)

(def *-comp-graph
  "Static Constant.

  type: java.lang.String"
  ArbiterCliRunner/COMP_GRAPH)

(def *-multi-layer-network
  "Static Constant.

  type: java.lang.String"
  ArbiterCliRunner/MULTI_LAYER_NETWORK)

(defn *main
  "args - `java.lang.String`

  throws: java.lang.Exception"
  ([^java.lang.String args]
    (ArbiterCliRunner/main args)))

(defn run-main
  "args - `java.lang.String`

  throws: java.lang.Exception"
  ([^ArbiterCliRunner this ^java.lang.String args]
    (-> this (.runMain args))))

