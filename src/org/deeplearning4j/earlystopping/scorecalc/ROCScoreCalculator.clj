(ns org.deeplearning4j.earlystopping.scorecalc.ROCScoreCalculator
  "Calculate ROC AUC (area under ROC curve) or AUCPR (area under precision recall curve) for a MultiLayerNetwork or
 ComputationGraph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.scorecalc ROCScoreCalculator]))

(defn ->roc-score-calculator
  "Constructor.

  type - `org.deeplearning4j.earlystopping.scorecalc.ROCScoreCalculator$ROCType`
  metric - `org.deeplearning4j.earlystopping.scorecalc.ROCScoreCalculator$Metric`
  iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  (^ROCScoreCalculator [^org.deeplearning4j.earlystopping.scorecalc.ROCScoreCalculator$ROCType type ^org.deeplearning4j.earlystopping.scorecalc.ROCScoreCalculator$Metric metric ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (new ROCScoreCalculator type metric iterator))
  (^ROCScoreCalculator [^org.deeplearning4j.earlystopping.scorecalc.ROCScoreCalculator$ROCType type ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (new ROCScoreCalculator type iterator)))

(defn minimize-score
  "returns: If true: the score should be minimized. If false: the score should be maximized. - `boolean`"
  (^Boolean [^ROCScoreCalculator this]
    (-> this (.minimizeScore))))

