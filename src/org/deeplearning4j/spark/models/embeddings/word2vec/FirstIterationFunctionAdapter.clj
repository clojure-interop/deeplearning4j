(ns org.deeplearning4j.spark.models.embeddings.word2vec.FirstIterationFunctionAdapter
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.word2vec FirstIterationFunctionAdapter]))

(defn ->first-iteration-function-adapter
  "Constructor.

  word-2vec-var-map-broadcast - `org.apache.spark.broadcast.Broadcast`
  exp-table-broadcast - `org.apache.spark.broadcast.Broadcast`
  vocab-cache-broadcast - `org.apache.spark.broadcast.Broadcast`"
  (^FirstIterationFunctionAdapter [^org.apache.spark.broadcast.Broadcast word-2vec-var-map-broadcast ^org.apache.spark.broadcast.Broadcast exp-table-broadcast ^org.apache.spark.broadcast.Broadcast vocab-cache-broadcast]
    (new FirstIterationFunctionAdapter word-2vec-var-map-broadcast exp-table-broadcast vocab-cache-broadcast)))

(defn call
  "pair-iter - `java.util.Iterator`

  returns: `java.lang.Iterable<java.util.Map.Entry<org.deeplearning4j.models.word2vec.VocabWord,org.nd4j.linalg.api.ndarray.INDArray>>`"
  (^java.lang.Iterable [^FirstIterationFunctionAdapter this ^java.util.Iterator pair-iter]
    (-> this (.call pair-iter))))

(defn train-sentence
  "vocab-words-list - `java.util.List`
  current-sentence-alpha - `double`"
  ([^FirstIterationFunctionAdapter this ^java.util.List vocab-words-list ^Double current-sentence-alpha]
    (-> this (.trainSentence vocab-words-list current-sentence-alpha))))

(defn skip-gram
  "ith-word-in-sentence - `int`
  vocab-words-list - `java.util.List`
  b - `int`
  current-sentence-alpha - `double`"
  ([^FirstIterationFunctionAdapter this ^Integer ith-word-in-sentence ^java.util.List vocab-words-list ^Integer b ^Double current-sentence-alpha]
    (-> this (.skipGram ith-word-in-sentence vocab-words-list b current-sentence-alpha))))

(defn iterate-sample
  "w-1 - `org.deeplearning4j.models.word2vec.VocabWord`
  w-2 - `org.deeplearning4j.models.word2vec.VocabWord`
  current-sentence-alpha - `double`"
  ([^FirstIterationFunctionAdapter this ^org.deeplearning4j.models.word2vec.VocabWord w-1 ^org.deeplearning4j.models.word2vec.VocabWord w-2 ^Double current-sentence-alpha]
    (-> this (.iterateSample w-1 w-2 current-sentence-alpha))))

