(ns org.deeplearning4j.arbiter.scoring.impl.TestSetAccuracyScoreFunction
  "Deprecated.
 Use EvaluationScoreFunction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.scoring.impl TestSetAccuracyScoreFunction]))

(defn ->test-set-accuracy-score-function
  "Constructor.

  Deprecated."
  (^TestSetAccuracyScoreFunction []
    (new TestSetAccuracyScoreFunction )))

(defn to-string
  "Deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^TestSetAccuracyScoreFunction this]
    (-> this (.toString))))

(defn score
  "Deprecated.

  net - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`

  returns: `double`"
  (^Double [^TestSetAccuracyScoreFunction this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork net ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.score net iterator))))

(defn minimize
  "Deprecated.

  returns: true if score should be minimized, false if score should be maximized - `boolean`"
  (^Boolean [^TestSetAccuracyScoreFunction this]
    (-> this (.minimize))))

