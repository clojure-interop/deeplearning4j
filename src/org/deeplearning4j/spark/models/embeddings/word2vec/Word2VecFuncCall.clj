(ns org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecFuncCall
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.word2vec Word2VecFuncCall]))

(defn ->word-2-vec-func-call
  "Constructor.

  Deprecated.

  param - `org.apache.spark.broadcast.Broadcast`
  words-seen - `java.lang.Long`
  sentence - `java.util.List`"
  (^Word2VecFuncCall [^org.apache.spark.broadcast.Broadcast param ^java.lang.Long words-seen ^java.util.List sentence]
    (new Word2VecFuncCall param words-seen sentence)))

(defn get-param
  "Deprecated.

  returns: `org.apache.spark.broadcast.Broadcast<org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam>`"
  (^org.apache.spark.broadcast.Broadcast [^Word2VecFuncCall this]
    (-> this (.getParam))))

(defn set-param
  "Deprecated.

  param - `org.apache.spark.broadcast.Broadcast`"
  ([^Word2VecFuncCall this ^org.apache.spark.broadcast.Broadcast param]
    (-> this (.setParam param))))

(defn get-words-seen
  "Deprecated.

  returns: `java.lang.Long`"
  (^java.lang.Long [^Word2VecFuncCall this]
    (-> this (.getWordsSeen))))

(defn set-words-seen
  "Deprecated.

  words-seen - `java.lang.Long`"
  ([^Word2VecFuncCall this ^java.lang.Long words-seen]
    (-> this (.setWordsSeen words-seen))))

(defn get-sentence
  "Deprecated.

  returns: `java.util.List<org.deeplearning4j.models.word2vec.VocabWord>`"
  (^java.util.List [^Word2VecFuncCall this]
    (-> this (.getSentence))))

(defn set-sentence
  "Deprecated.

  sentence - `java.util.List`"
  ([^Word2VecFuncCall this ^java.util.List sentence]
    (-> this (.setSentence sentence))))

