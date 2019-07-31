(ns org.deeplearning4j.spark.models.embeddings.word2vec.Word2Vec
  "Spark version of word2vec"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.word2vec Word2Vec]))

(defn get-tokenizer-var-map
  "returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^Word2Vec this]
    (-> this (.getTokenizerVarMap))))

(defn get-word-2vec-var-map
  "returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^Word2Vec this]
    (-> this (.getWord2vecVarMap))))

(defn train
  "Training word2vec model on a given text corpus

  corpus-rdd - training corpus - `org.apache.spark.api.java.JavaRDD`

  throws: java.lang.Exception"
  ([^Word2Vec this ^org.apache.spark.api.java.JavaRDD corpus-rdd]
    (-> this (.train corpus-rdd))))

