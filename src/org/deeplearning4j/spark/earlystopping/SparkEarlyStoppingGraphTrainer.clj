(ns org.deeplearning4j.spark.earlystopping.SparkEarlyStoppingGraphTrainer
  "Class for conducting early stopping training via Spark on a ComputationGraph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.earlystopping SparkEarlyStoppingGraphTrainer]))

(defn ->spark-early-stopping-graph-trainer
  "Constructor.

  sc - `org.apache.spark.SparkContext`
  training-master - `org.deeplearning4j.spark.api.TrainingMaster`
  es-config - `org.deeplearning4j.earlystopping.EarlyStoppingConfiguration`
  net - `org.deeplearning4j.nn.graph.ComputationGraph`
  train - `org.apache.spark.api.java.JavaRDD`
  examples-per-fit - `int`
  total-examples - `int`"
  (^SparkEarlyStoppingGraphTrainer [^org.apache.spark.SparkContext sc ^org.deeplearning4j.spark.api.TrainingMaster training-master ^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration es-config ^org.deeplearning4j.nn.graph.ComputationGraph net ^org.apache.spark.api.java.JavaRDD train ^Integer examples-per-fit ^Integer total-examples]
    (new SparkEarlyStoppingGraphTrainer sc training-master es-config net train examples-per-fit total-examples))
  (^SparkEarlyStoppingGraphTrainer [^org.apache.spark.api.java.JavaSparkContext sc ^org.deeplearning4j.spark.api.TrainingMaster training-master ^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration es-config ^org.deeplearning4j.nn.graph.ComputationGraph net ^org.apache.spark.api.java.JavaRDD train ^org.deeplearning4j.earlystopping.listener.EarlyStoppingListener listener]
    (new SparkEarlyStoppingGraphTrainer sc training-master es-config net train listener))
  (^SparkEarlyStoppingGraphTrainer [^org.apache.spark.SparkContext sc ^org.deeplearning4j.spark.api.TrainingMaster training-master ^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration es-config ^org.deeplearning4j.nn.graph.ComputationGraph net ^org.apache.spark.api.java.JavaRDD train]
    (new SparkEarlyStoppingGraphTrainer sc training-master es-config net train)))

