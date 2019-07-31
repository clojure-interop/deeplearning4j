(ns org.deeplearning4j.arbiter.scoring.impl.TestSetRegressionScoreFunction
  "Deprecated.
 Use RegressionScoreFunction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.scoring.impl TestSetRegressionScoreFunction]))

(defn ->test-set-regression-score-function
  "Constructor.

  Deprecated.

  regression-value - The type of evaluation to do: MSE, MAE, RMSE, etc - `org.deeplearning4j.arbiter.scoring.RegressionValue`"
  (^TestSetRegressionScoreFunction [^org.deeplearning4j.arbiter.scoring.RegressionValue regression-value]
    (new TestSetRegressionScoreFunction regression-value)))

(defn minimize
  "Deprecated.

  returns: true if score should be minimized, false if score should be maximized - `boolean`"
  (^Boolean [^TestSetRegressionScoreFunction this]
    (-> this (.minimize))))

(defn to-string
  "Deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^TestSetRegressionScoreFunction this]
    (-> this (.toString))))

(defn score
  "Deprecated.

  net - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`

  returns: `double`"
  (^Double [^TestSetRegressionScoreFunction this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork net ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (-> this (.score net iterator))))

