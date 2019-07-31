(ns org.deeplearning4j.spark.impl.paramavg.ParameterAveragingTrainingResult
  "The results (parameters, optional updaters) returned by a ParameterAveragingTrainingWorker to the
 ParameterAveragingTrainingMaster"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.paramavg ParameterAveragingTrainingResult]))

(defn ->parameter-averaging-training-result
  "Constructor.

  parameters - `org.nd4j.linalg.api.ndarray.INDArray`
  updater-state - `org.nd4j.linalg.api.ndarray.INDArray`
  score - `double`
  spark-training-stats - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`
  listener-meta-data - `java.util.Collection`
  listener-static-info - `java.util.Collection`
  listener-updates - `java.util.Collection`"
  (^ParameterAveragingTrainingResult [^org.nd4j.linalg.api.ndarray.INDArray parameters ^org.nd4j.linalg.api.ndarray.INDArray updater-state ^Double score ^org.deeplearning4j.spark.api.stats.SparkTrainingStats spark-training-stats ^java.util.Collection listener-meta-data ^java.util.Collection listener-static-info ^java.util.Collection listener-updates]
    (new ParameterAveragingTrainingResult parameters updater-state score spark-training-stats listener-meta-data listener-static-info listener-updates))
  (^ParameterAveragingTrainingResult [^org.nd4j.linalg.api.ndarray.INDArray parameters ^org.nd4j.linalg.api.ndarray.INDArray updater-state ^Double score ^java.util.Collection listener-meta-data ^java.util.Collection listener-static-info ^java.util.Collection listener-updates]
    (new ParameterAveragingTrainingResult parameters updater-state score listener-meta-data listener-static-info listener-updates)))

(defn set-stats
  "spark-training-stats - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`"
  ([^ParameterAveragingTrainingResult this ^org.deeplearning4j.spark.api.stats.SparkTrainingStats spark-training-stats]
    (-> this (.setStats spark-training-stats))))

