(ns org.deeplearning4j.spark.earlystopping.SparkDataSetLossCalculator
  "Score calculator to calculate the total loss for the MultiLayerNetwork on that data set (data set
 as a JavaRDD), using Spark.
 Typically used to calculate the loss on a test set."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.earlystopping SparkDataSetLossCalculator]))

(defn ->spark-data-set-loss-calculator
  "Constructor.

  Calculate the score (loss function value) on a given data set (usually a test set)

  data - Data set to calculate the score for - `org.apache.spark.api.java.JavaRDD`
  average - Whether to return the average (sum of loss / N) or just (sum of loss) - `boolean`
  sc - `org.apache.spark.SparkContext`"
  (^SparkDataSetLossCalculator [^org.apache.spark.api.java.JavaRDD data ^Boolean average ^org.apache.spark.SparkContext sc]
    (new SparkDataSetLossCalculator data average sc)))

(defn calculate-score
  "Description copied from interface: ScoreCalculator

  network - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`

  returns: `double`"
  (^Double [^SparkDataSetLossCalculator this ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork network]
    (-> this (.calculateScore network))))

(defn minimize-score
  "returns: If true: the score should be minimized. If false: the score should be maximized. - `boolean`"
  (^Boolean [^SparkDataSetLossCalculator this]
    (-> this (.minimizeScore))))

