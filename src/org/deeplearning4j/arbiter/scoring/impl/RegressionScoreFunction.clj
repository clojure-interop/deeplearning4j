(ns org.deeplearning4j.arbiter.scoring.impl.RegressionScoreFunction
  "Score function for regression (including multi-label regression) for a MultiLayerNetwork or ComputationGraph
 on a test set. Supports all regression metrics: RegressionEvaluation.Metric"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.scoring.impl RegressionScoreFunction]))

(defn ->regression-score-function
  "Constructor.

  metric - `org.deeplearning4j.eval.RegressionEvaluation$Metric`"
  (^RegressionScoreFunction [^org.deeplearning4j.eval.RegressionEvaluation$Metric metric]
    (new RegressionScoreFunction metric)))

(defn minimize
  "Description copied from interface: ScoreFunction

  returns: true if score should be minimized, false if score should be maximized - `boolean`"
  (^Boolean [^RegressionScoreFunction this]
    (-> this (.minimize))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RegressionScoreFunction this]
    (-> this (.toString))))

(defn score
  "net - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`

  returns: `double`"
  (^Double [^RegressionScoreFunction this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork net ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.score net iterator))))

