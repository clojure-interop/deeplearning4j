(ns org.deeplearning4j.earlystopping.scorecalc.base.BaseIEvaluationScoreCalculator
  "Base score function based on an IEvaluation instance. Used for both MultiLayerNetwork and ComputationGraph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.scorecalc.base BaseIEvaluationScoreCalculator]))

(defn calculate-score
  "Description copied from interface: ScoreCalculator

  network - `T`

  returns: `double`"
  (^Double [^BaseIEvaluationScoreCalculator this network]
    (-> this (.calculateScore network))))

