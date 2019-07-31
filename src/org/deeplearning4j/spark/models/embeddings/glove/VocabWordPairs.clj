(ns org.deeplearning4j.spark.models.embeddings.glove.VocabWordPairs
  "Convert string to vocab words"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.glove VocabWordPairs]))

(defn ->vocab-word-pairs
  "Constructor.

  vocab - `org.apache.spark.broadcast.Broadcast`"
  (^VocabWordPairs [^org.apache.spark.broadcast.Broadcast vocab]
    (new VocabWordPairs vocab)))

(defn call
  "v-1 - `org.nd4j.linalg.primitives.Triple`

  returns: `org.nd4j.linalg.primitives.Triple<org.deeplearning4j.models.word2vec.VocabWord,org.deeplearning4j.models.word2vec.VocabWord,java.lang.Double>`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.primitives.Triple [^VocabWordPairs this ^org.nd4j.linalg.primitives.Triple v-1]
    (-> this (.call v-1))))

