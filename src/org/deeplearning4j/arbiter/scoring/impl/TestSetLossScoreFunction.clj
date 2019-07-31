(ns org.deeplearning4j.arbiter.scoring.impl.TestSetLossScoreFunction
  "Score function that calculates the test set loss
 on a test set for a MultiLayerNetwork or ComputationGraph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.scoring.impl TestSetLossScoreFunction]))

(defn ->test-set-loss-score-function
  "Constructor.

  average - `boolean`"
  (^TestSetLossScoreFunction [^Boolean average]
    (new TestSetLossScoreFunction average))
  (^TestSetLossScoreFunction []
    (new TestSetLossScoreFunction )))

(defn minimize
  "Description copied from interface: ScoreFunction

  returns: true if score should be minimized, false if score should be maximized - `boolean`"
  (^Boolean [^TestSetLossScoreFunction this]
    (-> this (.minimize))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TestSetLossScoreFunction this]
    (-> this (.toString))))

(defn score
  "net - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`

  returns: `double`"
  (^Double [^TestSetLossScoreFunction this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork net ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.score net iterator))))

