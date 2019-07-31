(ns org.deeplearning4j.spark.models.sequencevectors.learning.elements.SparkCBOW
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.learning.elements SparkCBOW]))

(defn ->spark-cbow
  "Constructor."
  (^SparkCBOW []
    (new SparkCBOW )))

(defn get-code-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SparkCBOW this]
    (-> this (.getCodeName))))

(defn frame-sequence
  "sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`
  next-random - `java.util.concurrent.atomic.AtomicLong`
  learning-rate - `double`

  returns: `org.nd4j.parameterserver.distributed.messages.Frame<? extends org.nd4j.parameterserver.distributed.messages.TrainingMessage>`"
  ([^SparkCBOW this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence ^java.util.concurrent.atomic.AtomicLong next-random ^Double learning-rate]
    (-> this (.frameSequence sequence next-random learning-rate))))

(defn get-training-driver
  "returns: `org.nd4j.parameterserver.distributed.training.TrainingDriver<? extends org.nd4j.parameterserver.distributed.messages.TrainingMessage>`"
  ([^SparkCBOW this]
    (-> this (.getTrainingDriver))))

