(ns org.deeplearning4j.arbiter.scoring.impl.EvaluationScoreFunction
  "Score function that calculates an evaluation Evaluation.Metric on the test set for a
 MultiLayerNetwork or ComputationGraph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.scoring.impl EvaluationScoreFunction]))

(defn ->evaluation-score-function
  "Constructor.

  metric - Evaluation metric to calculate - `org.deeplearning4j.eval.Evaluation$Metric`"
  (^EvaluationScoreFunction [^org.deeplearning4j.eval.Evaluation$Metric metric]
    (new EvaluationScoreFunction metric)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^EvaluationScoreFunction this]
    (-> this (.toString))))

(defn score
  "net - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`

  returns: `double`"
  (^Double [^EvaluationScoreFunction this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork net ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.score net iterator))))

(defn minimize
  "Description copied from interface: ScoreFunction

  returns: true if score should be minimized, false if score should be maximized - `boolean`"
  (^Boolean [^EvaluationScoreFunction this]
    (-> this (.minimize))))

