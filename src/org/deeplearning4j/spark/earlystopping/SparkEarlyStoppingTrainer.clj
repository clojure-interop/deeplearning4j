(ns org.deeplearning4j.spark.earlystopping.SparkEarlyStoppingTrainer
  "Class for conducting early stopping training via Spark on a MultiLayerNetwork"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.earlystopping SparkEarlyStoppingTrainer]))

(defn ->spark-early-stopping-trainer
  "Constructor.

  sc - `org.apache.spark.SparkContext`
  training-master - `org.deeplearning4j.spark.api.TrainingMaster`
  es-config - `org.deeplearning4j.earlystopping.EarlyStoppingConfiguration`
  net - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  train - `org.apache.spark.api.java.JavaRDD`
  listener - `org.deeplearning4j.earlystopping.listener.EarlyStoppingListener`"
  (^SparkEarlyStoppingTrainer [^org.apache.spark.SparkContext sc ^org.deeplearning4j.spark.api.TrainingMaster training-master ^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration es-config ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork net ^org.apache.spark.api.java.JavaRDD train ^org.deeplearning4j.earlystopping.listener.EarlyStoppingListener listener]
    (new SparkEarlyStoppingTrainer sc training-master es-config net train listener))
  (^SparkEarlyStoppingTrainer [^org.apache.spark.SparkContext sc ^org.deeplearning4j.spark.api.TrainingMaster training-master ^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration es-config ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork net ^org.apache.spark.api.java.JavaRDD train]
    (new SparkEarlyStoppingTrainer sc training-master es-config net train)))

