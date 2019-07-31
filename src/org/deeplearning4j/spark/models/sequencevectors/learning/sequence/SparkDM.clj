(ns org.deeplearning4j.spark.models.sequencevectors.learning.sequence.SparkDM
  "Spark implementation for PV-DM training algorithm"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.learning.sequence SparkDM]))

(defn ->spark-dm
  "Constructor."
  (^SparkDM []
    (new SparkDM )))

(defn get-code-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SparkDM this]
    (-> this (.getCodeName))))

(defn frame-sequence
  "sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`
  next-random - `java.util.concurrent.atomic.AtomicLong`
  learning-rate - `double`

  returns: `org.nd4j.parameterserver.distributed.messages.Frame<? extends org.nd4j.parameterserver.distributed.messages.TrainingMessage>`"
  ([^SparkDM this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence ^java.util.concurrent.atomic.AtomicLong next-random ^Double learning-rate]
    (-> this (.frameSequence sequence next-random learning-rate))))

(defn get-training-driver
  "returns: `org.nd4j.parameterserver.distributed.training.TrainingDriver<? extends org.nd4j.parameterserver.distributed.messages.TrainingMessage>`"
  ([^SparkDM this]
    (-> this (.getTrainingDriver))))

