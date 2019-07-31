(ns org.deeplearning4j.spark.models.sequencevectors.learning.elements.SparkSkipGram
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.learning.elements SparkSkipGram]))

(defn ->spark-skip-gram
  "Constructor."
  (^SparkSkipGram []
    (new SparkSkipGram )))

(defn get-code-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SparkSkipGram this]
    (-> this (.getCodeName))))

(defn frame-sequence
  "sequence - `org.deeplearning4j.models.sequencevectors.sequence.Sequence`
  next-random - `java.util.concurrent.atomic.AtomicLong`
  learning-rate - `double`

  returns: `org.nd4j.parameterserver.distributed.messages.Frame<? extends org.nd4j.parameterserver.distributed.messages.TrainingMessage>`"
  ([^SparkSkipGram this ^org.deeplearning4j.models.sequencevectors.sequence.Sequence sequence ^java.util.concurrent.atomic.AtomicLong next-random ^Double learning-rate]
    (-> this (.frameSequence sequence next-random learning-rate))))

(defn get-training-driver
  "returns: `org.nd4j.parameterserver.distributed.training.TrainingDriver<? extends org.nd4j.parameterserver.distributed.messages.TrainingMessage>`"
  ([^SparkSkipGram this]
    (-> this (.getTrainingDriver))))

