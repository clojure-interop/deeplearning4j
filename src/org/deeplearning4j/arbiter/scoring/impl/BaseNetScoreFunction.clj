(ns org.deeplearning4j.arbiter.scoring.impl.BaseNetScoreFunction
  "Created by Alex on 23/07/2017."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.scoring.impl BaseNetScoreFunction]))

(defn ->base-net-score-function
  "Constructor."
  (^BaseNetScoreFunction []
    (new BaseNetScoreFunction )))

(defn score
  "Description copied from interface: ScoreFunction

  model - Model to score - `java.lang.Object`
  data-provider - Data provider - data to use - `org.deeplearning4j.arbiter.optimize.api.data.DataProvider`
  data-parameters - Parameters for data - `java.util.Map`

  returns: Calculated score - `double`"
  (^Double [^BaseNetScoreFunction this ^java.lang.Object model ^org.deeplearning4j.arbiter.optimize.api.data.DataProvider data-provider ^java.util.Map data-parameters]
    (-> this (.score model data-provider data-parameters)))
  (^Double [^BaseNetScoreFunction this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork net ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.score net iterator))))

(defn get-supported-model-types
  "returns: The model types supported by this class - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^BaseNetScoreFunction this]
    (-> this (.getSupportedModelTypes))))

(defn get-supported-data-types
  "returns: The data types supported by this class - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^BaseNetScoreFunction this]
    (-> this (.getSupportedDataTypes))))

