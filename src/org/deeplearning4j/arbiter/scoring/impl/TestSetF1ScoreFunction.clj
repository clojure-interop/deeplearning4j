(ns org.deeplearning4j.arbiter.scoring.impl.TestSetF1ScoreFunction
  "Deprecated.
 Use EvaluationScoreFunction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.scoring.impl TestSetF1ScoreFunction]))

(defn ->test-set-f-1-score-function
  "Constructor.

  Deprecated."
  (^TestSetF1ScoreFunction []
    (new TestSetF1ScoreFunction )))

(defn minimize
  "Deprecated.

  returns: true if score should be minimized, false if score should be maximized - `boolean`"
  (^Boolean [^TestSetF1ScoreFunction this]
    (-> this (.minimize))))

(defn to-string
  "Deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^TestSetF1ScoreFunction this]
    (-> this (.toString))))

(defn score
  "Deprecated.

  net - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`

  returns: `double`"
  (^Double [^TestSetF1ScoreFunction this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork net ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.score net iterator))))

