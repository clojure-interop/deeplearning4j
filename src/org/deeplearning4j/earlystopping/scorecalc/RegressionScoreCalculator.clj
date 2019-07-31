(ns org.deeplearning4j.earlystopping.scorecalc.RegressionScoreCalculator
  "Calculate the regression score of the network (MultiLayerNetwork or ComputationGraph) on a test set, using the
 specified regression metric - RegressionEvaluation.Metric"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.scorecalc RegressionScoreCalculator]))

(defn ->regression-score-calculator
  "Constructor.

  metric - `org.deeplearning4j.eval.RegressionEvaluation$Metric`
  iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  (^RegressionScoreCalculator [^org.deeplearning4j.eval.RegressionEvaluation$Metric metric ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (new RegressionScoreCalculator metric iterator)))

(defn minimize-score
  "returns: If true: the score should be minimized. If false: the score should be maximized. - `boolean`"
  (^Boolean [^RegressionScoreCalculator this]
    (-> this (.minimizeScore))))

