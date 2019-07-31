(ns org.deeplearning4j.arbiter.scoring.ScoreFunctions
  "ScoreFunctions provides static methods for getting score functions for DL4J MultiLayerNetwork and ComputationGraph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.scoring ScoreFunctions]))

(defn *test-set-loss
  "Calculate the loss (score/loss function value) on a test set, for a MultiLayerNetwork

  average - Average (divide by number of examples) - `boolean`

  returns: `org.deeplearning4j.arbiter.optimize.api.score.ScoreFunction`"
  (^org.deeplearning4j.arbiter.optimize.api.score.ScoreFunction [^Boolean average]
    (ScoreFunctions/testSetLoss average)))

(defn *test-set-accuracy
  "Calculate the accuracy on a test set, for a MultiLayerNetwork

  returns: `org.deeplearning4j.arbiter.optimize.api.score.ScoreFunction`"
  (^org.deeplearning4j.arbiter.optimize.api.score.ScoreFunction []
    (ScoreFunctions/testSetAccuracy )))

(defn *test-set-f-1
  "Calculate the f1 score on a test set

  returns: `org.deeplearning4j.arbiter.optimize.api.score.ScoreFunction`"
  (^org.deeplearning4j.arbiter.optimize.api.score.ScoreFunction []
    (ScoreFunctions/testSetF1 )))

(defn *test-set-regression
  "Calculate a regression value (MSE, MAE etc) on a test set

  regression-value - `org.deeplearning4j.arbiter.scoring.RegressionValue`

  returns: `org.deeplearning4j.arbiter.optimize.api.score.ScoreFunction`"
  (^org.deeplearning4j.arbiter.optimize.api.score.ScoreFunction [^org.deeplearning4j.arbiter.scoring.RegressionValue regression-value]
    (ScoreFunctions/testSetRegression regression-value)))

