(ns org.deeplearning4j.earlystopping.scorecalc.DataSetLossCalculatorCG
  "Deprecated.
 Use DataSetLossCalculator instead for both MultiLayerNetwork and ComputationGraph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.scorecalc DataSetLossCalculatorCG]))

(defn ->data-set-loss-calculator-cg
  "Constructor.

  Deprecated.

  data-set-iterator - Data set to calculate the score for - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  average - Whether to return the average (sum of loss / N) or just (sum of loss) - `boolean`"
  (^DataSetLossCalculatorCG [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator data-set-iterator ^Boolean average]
    (new DataSetLossCalculatorCG data-set-iterator average)))

(defn calculate-score
  "Deprecated.

  network - `org.deeplearning4j.nn.graph.ComputationGraph`

  returns: `double`"
  (^Double [^DataSetLossCalculatorCG this ^org.deeplearning4j.nn.graph.ComputationGraph network]
    (-> this (.calculateScore network))))

(defn minimize-score
  "Deprecated.

  returns: If true: the score should be minimized. If false: the score should be maximized. - `boolean`"
  (^Boolean [^DataSetLossCalculatorCG this]
    (-> this (.minimizeScore))))

(defn to-string
  "Deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^DataSetLossCalculatorCG this]
    (-> this (.toString))))

