(ns org.deeplearning4j.earlystopping.scorecalc.ClassificationScoreCalculator
  "Score function for evaluating a MultiLayerNetwork according to an evaluation metric (Evaluation.Metric such
 as accuracy, F1 score, etc.
 Used for both MultiLayerNetwork and ComputationGraph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.scorecalc ClassificationScoreCalculator]))

(defn ->classification-score-calculator
  "Constructor.

  metric - `org.deeplearning4j.eval.Evaluation$Metric`
  iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  (^ClassificationScoreCalculator [^org.deeplearning4j.eval.Evaluation$Metric metric ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (new ClassificationScoreCalculator metric iterator)))

(defn minimize-score
  "returns: If true: the score should be minimized. If false: the score should be maximized. - `boolean`"
  (^Boolean [^ClassificationScoreCalculator this]
    (-> this (.minimizeScore))))

