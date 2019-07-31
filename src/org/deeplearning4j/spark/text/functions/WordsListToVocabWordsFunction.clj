(ns org.deeplearning4j.spark.text.functions.WordsListToVocabWordsFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.text.functions WordsListToVocabWordsFunction]))

(defn ->words-list-to-vocab-words-function
  "Constructor.

  vocab-cache-broadcast - `org.apache.spark.broadcast.Broadcast`"
  (^WordsListToVocabWordsFunction [^org.apache.spark.broadcast.Broadcast vocab-cache-broadcast]
    (new WordsListToVocabWordsFunction vocab-cache-broadcast)))

(defn call
  "pair - `org.nd4j.linalg.primitives.Pair`

  returns: `java.util.List<org.deeplearning4j.models.word2vec.VocabWord>`

  throws: java.lang.Exception"
  (^java.util.List [^WordsListToVocabWordsFunction this ^org.nd4j.linalg.primitives.Pair pair]
    (-> this (.call pair))))

