(ns org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecPerformer
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.word2vec Word2VecPerformer]))

(defn ->word-2-vec-performer
  "Constructor.

  Deprecated.

  sc - `org.apache.spark.SparkConf`
  word-count - `org.apache.spark.broadcast.Broadcast`
  weights - `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable`"
  (^Word2VecPerformer [^org.apache.spark.SparkConf sc ^org.apache.spark.broadcast.Broadcast word-count ^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable weights]
    (new Word2VecPerformer sc word-count weights)))

(defn setup
  "Deprecated.

  conf - `org.apache.spark.SparkConf`"
  ([^Word2VecPerformer this ^org.apache.spark.SparkConf conf]
    (-> this (.setup conf))))

(defn train-sentence
  "Deprecated.

  sentence - the list of vocab words to train on - `java.util.List`
  alpha - `double`"
  ([^Word2VecPerformer this ^java.util.List sentence ^Double alpha]
    (-> this (.trainSentence sentence alpha))))

(defn skip-gram
  "Deprecated.

  i - `int`
  sentence - `java.util.List`
  b - `int`
  alpha - `double`"
  ([^Word2VecPerformer this ^Integer i ^java.util.List sentence ^Integer b ^Double alpha]
    (-> this (.skipGram i sentence b alpha))))

(defn iterate-sample
  "Deprecated.

  w-1 - the first word to iterate on - `org.deeplearning4j.models.word2vec.VocabWord`
  w-2 - the second word to iterate on - `org.deeplearning4j.models.word2vec.VocabWord`
  alpha - `double`"
  ([^Word2VecPerformer this ^org.deeplearning4j.models.word2vec.VocabWord w-1 ^org.deeplearning4j.models.word2vec.VocabWord w-2 ^Double alpha]
    (-> this (.iterateSample w-1 w-2 alpha))))

(defn call
  "Deprecated.

  pair - `org.nd4j.linalg.primitives.Pair`

  throws: java.lang.Exception"
  ([^Word2VecPerformer this ^org.nd4j.linalg.primitives.Pair pair]
    (-> this (.call pair))))

