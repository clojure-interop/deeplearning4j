(ns org.deeplearning4j.spark.models.word2vec.SparkWord2Vec
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.word2vec SparkWord2Vec]))

(defn ->spark-word-2-vec
  "Constructor.

  ps-configuration - `org.nd4j.parameterserver.distributed.conf.VoidConfiguration`
  configuration - `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`"
  (^SparkWord2Vec [^org.nd4j.parameterserver.distributed.conf.VoidConfiguration ps-configuration ^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration configuration]
    (new SparkWord2Vec ps-configuration configuration)))

(defn fit
  "Deprecated."
  ([^SparkWord2Vec this]
    (-> this (.fit))))

(defn fit-sentences
  "sentences - `org.apache.spark.api.java.JavaRDD`"
  ([^SparkWord2Vec this ^org.apache.spark.api.java.JavaRDD sentences]
    (-> this (.fitSentences sentences))))

