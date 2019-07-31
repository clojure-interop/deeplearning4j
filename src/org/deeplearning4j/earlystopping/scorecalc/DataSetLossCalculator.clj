(ns org.deeplearning4j.earlystopping.scorecalc.DataSetLossCalculator
  "Given a DataSetIterator: calculate the total loss for the model on that data set.
 Can be used for both MultiLayerNetwork and ComputationGraph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.scorecalc DataSetLossCalculator]))

(defn ->data-set-loss-calculator
  "Constructor.

  Calculate the score (loss function value) on a given data set (usually a test set)

  data-set-iterator - Data set to calculate the score for - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  average - Whether to return the average (sum of loss / N) or just (sum of loss) - `boolean`"
  (^DataSetLossCalculator [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator data-set-iterator ^Boolean average]
    (new DataSetLossCalculator data-set-iterator average)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DataSetLossCalculator this]
    (-> this (.toString))))

(defn minimize-score
  "returns: If true: the score should be minimized. If false: the score should be maximized. - `boolean`"
  (^Boolean [^DataSetLossCalculator this]
    (-> this (.minimizeScore))))

