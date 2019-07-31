(ns org.deeplearning4j.spark.earlystopping.BaseSparkEarlyStoppingTrainer
  "Base/abstract class for conducting early stopping training via Spark, on a MultiLayerNetwork
 or a ComputationGraph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.earlystopping BaseSparkEarlyStoppingTrainer]))

(defn fit
  "Description copied from interface: IEarlyStoppingTrainer

  returns: `org.deeplearning4j.earlystopping.EarlyStoppingResult<T>`"
  (^org.deeplearning4j.earlystopping.EarlyStoppingResult [^BaseSparkEarlyStoppingTrainer this]
    (-> this (.fit))))

(defn set-listener
  "Description copied from interface: IEarlyStoppingTrainer

  listener - `org.deeplearning4j.earlystopping.listener.EarlyStoppingListener`"
  ([^BaseSparkEarlyStoppingTrainer this ^org.deeplearning4j.earlystopping.listener.EarlyStoppingListener listener]
    (-> this (.setListener listener))))

