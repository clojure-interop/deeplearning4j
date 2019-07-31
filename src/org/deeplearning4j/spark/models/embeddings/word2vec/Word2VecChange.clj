(ns org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecChange
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.word2vec Word2VecChange]))

(defn ->word-2-vec-change
  "Constructor.

  Deprecated.

  counter-map - `java.util.List`
  param - `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam`"
  (^Word2VecChange [^java.util.List counter-map ^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam param]
    (new Word2VecChange counter-map param)))

(defn apply
  "Deprecated.

  table - the memory lookup tableto apply the changes to - `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable`"
  ([^Word2VecChange this ^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable table]
    (-> this (.apply table))))

