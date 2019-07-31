(ns org.deeplearning4j.spark.models.embeddings.word2vec.SentenceBatch
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.word2vec SentenceBatch]))

(defn ->sentence-batch
  "Constructor.

  Deprecated."
  (^SentenceBatch []
    (new SentenceBatch )))

(defn call
  "Deprecated.

  sentence - `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecFuncCall`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecChange`

  throws: java.lang.Exception"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecChange [^SentenceBatch this ^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecFuncCall sentence]
    (-> this (.call sentence))))

(defn train-sentence
  "Deprecated.

  param - `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam`
  sentence - the list of vocab words to train on - `java.util.List`
  alpha - `double`
  changed - `java.util.List`"
  ([^SentenceBatch this ^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam param ^java.util.List sentence ^Double alpha ^java.util.List changed]
    (-> this (.trainSentence param sentence alpha changed))))

(defn skip-gram
  "Deprecated.

  param - `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam`
  i - the current word - `int`
  sentence - the sentence to train on - `java.util.List`
  b - `int`
  alpha - the learning rate - `double`
  changed - `java.util.List`"
  ([^SentenceBatch this ^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam param ^Integer i ^java.util.List sentence ^Integer b ^Double alpha ^java.util.List changed]
    (-> this (.skipGram param i sentence b alpha changed))))

(defn iterate-sample
  "Deprecated.

  param - `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam`
  w-1 - the first word to iterate on - `org.deeplearning4j.models.word2vec.VocabWord`
  w-2 - the second word to iterate on - `org.deeplearning4j.models.word2vec.VocabWord`
  alpha - `double`
  changed - `java.util.List`"
  ([^SentenceBatch this ^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam param ^org.deeplearning4j.models.word2vec.VocabWord w-1 ^org.deeplearning4j.models.word2vec.VocabWord w-2 ^Double alpha ^java.util.List changed]
    (-> this (.iterateSample param w-1 w-2 alpha changed))))

