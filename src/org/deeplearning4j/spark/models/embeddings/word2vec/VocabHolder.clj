(ns org.deeplearning4j.spark.models.embeddings.word2vec.VocabHolder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.word2vec VocabHolder]))

(defn *get-instance
  "returns: `org.deeplearning4j.spark.models.embeddings.word2vec.VocabHolder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.VocabHolder []
    (VocabHolder/getInstance )))

(defn set-seed
  "seed - `long`
  vector-length - `int`"
  ([^VocabHolder this ^Long seed ^Integer vector-length]
    (-> this (.setSeed seed vector-length))))

(defn get-syn-0-vector
  "word-index - `java.lang.Integer`
  vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VocabHolder this ^java.lang.Integer word-index ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache]
    (-> this (.getSyn0Vector word-index vocab-cache))))

(defn get-syn-1-vector
  "point - `java.lang.Integer`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VocabHolder this ^java.lang.Integer point]
    (-> this (.getSyn1Vector point))))

(defn get-split
  "vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`

  returns: `java.lang.Iterable<java.util.Map.Entry<org.deeplearning4j.models.word2vec.VocabWord,org.nd4j.linalg.api.ndarray.INDArray>>`"
  (^java.lang.Iterable [^VocabHolder this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache]
    (-> this (.getSplit vocab-cache))))

