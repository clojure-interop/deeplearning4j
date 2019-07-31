(ns org.deeplearning4j.spark.earlystopping.SparkLossCalculatorComputationGraph
  "Score calculator to calculate the total loss for the ComputationGraph on that data set (data set
 as a JavaRDD), using Spark.
 Typically used to calculate the loss on a test set.
 Note: to test a ComputationGraph on a DataSet use DataSetToMultiDataSetFn"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.earlystopping SparkLossCalculatorComputationGraph]))

(defn ->spark-loss-calculator-computation-graph
  "Constructor.

  Calculate the score (loss function value) on a given data set (usually a test set)

  data - Data set to calculate the score for - `org.apache.spark.api.java.JavaRDD`
  average - Whether to return the average (sum of loss / N) or just (sum of loss) - `boolean`
  sc - `org.apache.spark.SparkContext`"
  (^SparkLossCalculatorComputationGraph [^org.apache.spark.api.java.JavaRDD data ^Boolean average ^org.apache.spark.SparkContext sc]
    (new SparkLossCalculatorComputationGraph data average sc)))

(defn calculate-score
  "Description copied from interface: ScoreCalculator

  network - `org.deeplearning4j.nn.graph.ComputationGraph`

  returns: `double`"
  (^Double [^SparkLossCalculatorComputationGraph this ^org.deeplearning4j.nn.graph.ComputationGraph network]
    (-> this (.calculateScore network))))

(defn minimize-score
  "returns: If true: the score should be minimized. If false: the score should be maximized. - `boolean`"
  (^Boolean [^SparkLossCalculatorComputationGraph this]
    (-> this (.minimizeScore))))

