(ns org.deeplearning4j.arbiter.scoring.impl.ROCScoreFunction
  "Score function that calculates AUC (area under ROC curve) or AUPRC (area under precision/recall curve) on a test set
 for a MultiLayerNetwork or ComputationGraph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.scoring.impl ROCScoreFunction]))

(defn ->roc-score-function
  "Constructor.

  type - ROC type to use for evaluation - `org.deeplearning4j.arbiter.scoring.impl.ROCScoreFunction$ROCType`
  metric - Evaluation metric to calculate - `org.deeplearning4j.arbiter.scoring.impl.ROCScoreFunction$Metric`"
  (^ROCScoreFunction [^org.deeplearning4j.arbiter.scoring.impl.ROCScoreFunction$ROCType type ^org.deeplearning4j.arbiter.scoring.impl.ROCScoreFunction$Metric metric]
    (new ROCScoreFunction type metric)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ROCScoreFunction this]
    (-> this (.toString))))

(defn score
  "net - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`

  returns: `double`"
  (^Double [^ROCScoreFunction this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork net ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.score net iterator))))

(defn minimize
  "Description copied from interface: ScoreFunction

  returns: true if score should be minimized, false if score should be maximized - `boolean`"
  (^Boolean [^ROCScoreFunction this]
    (-> this (.minimize))))

