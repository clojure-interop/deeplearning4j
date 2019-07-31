(ns org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.word2vec Word2VecParam]))

(defn ->word-2-vec-param
  "Constructor.

  Deprecated.

  use-ada-grad - `boolean`
  negative - `double`
  num-words - `int`
  table - `org.nd4j.linalg.api.ndarray.INDArray`
  window - `int`
  next-random - `java.util.concurrent.atomic.AtomicLong`
  alpha - `double`
  min-alpha - `double`
  total-words - `int`
  last-checked - `int`
  word-count - `org.apache.spark.broadcast.Broadcast`
  weights - `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable`
  vector-length - `int`
  exp-table - `org.apache.spark.broadcast.Broadcast`"
  (^Word2VecParam [^Boolean use-ada-grad ^Double negative ^Integer num-words ^org.nd4j.linalg.api.ndarray.INDArray table ^Integer window ^java.util.concurrent.atomic.AtomicLong next-random ^Double alpha ^Double min-alpha ^Integer total-words ^Integer last-checked ^org.apache.spark.broadcast.Broadcast word-count ^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable weights ^Integer vector-length ^org.apache.spark.broadcast.Broadcast exp-table]
    (new Word2VecParam use-ada-grad negative num-words table window next-random alpha min-alpha total-words last-checked word-count weights vector-length exp-table)))

(defn *get-log
  "Deprecated.

  returns: `org.slf4j.Logger`"
  (^org.slf4j.Logger []
    (Word2VecParam/getLog )))

(defn set-exp-table
  "Deprecated.

  exp-table - `org.apache.spark.broadcast.Broadcast`"
  ([^Word2VecParam this ^org.apache.spark.broadcast.Broadcast exp-table]
    (-> this (.setExpTable exp-table))))

(defn get-last-checked
  "Deprecated.

  returns: `int`"
  (^Integer [^Word2VecParam this]
    (-> this (.getLastChecked))))

(defn get-negative
  "Deprecated.

  returns: `double`"
  (^Double [^Word2VecParam this]
    (-> this (.getNegative))))

(defn set-num-words
  "Deprecated.

  num-words - `int`"
  ([^Word2VecParam this ^Integer num-words]
    (-> this (.setNumWords num-words))))

(defn set-use-ada-grad
  "Deprecated.

  use-ada-grad - `boolean`"
  ([^Word2VecParam this ^Boolean use-ada-grad]
    (-> this (.setUseAdaGrad use-ada-grad))))

(defn get-min-alpha
  "Deprecated.

  returns: `double`"
  (^Double [^Word2VecParam this]
    (-> this (.getMinAlpha))))

(defn get-alpha
  "Deprecated.

  returns: `double`"
  (^Double [^Word2VecParam this]
    (-> this (.getAlpha))))

(defn set-last-words
  "Deprecated.

  last-words - `java.util.concurrent.atomic.AtomicLong`"
  ([^Word2VecParam this ^java.util.concurrent.atomic.AtomicLong last-words]
    (-> this (.setLastWords last-words))))

(defn use-ada-grad?
  "Deprecated.

  returns: `boolean`"
  (^Boolean [^Word2VecParam this]
    (-> this (.isUseAdaGrad))))

(defn set-word-count
  "Deprecated.

  word-count - `org.apache.spark.broadcast.Broadcast`"
  ([^Word2VecParam this ^org.apache.spark.broadcast.Broadcast word-count]
    (-> this (.setWordCount word-count))))

(defn get-exp-table
  "Deprecated.

  returns: `org.apache.spark.broadcast.Broadcast<double[]>`"
  ([^Word2VecParam this]
    (-> this (.getExpTable))))

(defn set-last-checked
  "Deprecated.

  last-checked - `int`"
  ([^Word2VecParam this ^Integer last-checked]
    (-> this (.setLastChecked last-checked))))

(defn set-total-words
  "Deprecated.

  total-words - `int`"
  ([^Word2VecParam this ^Integer total-words]
    (-> this (.setTotalWords total-words))))

(defn get-vector-length
  "Deprecated.

  returns: `int`"
  (^Integer [^Word2VecParam this]
    (-> this (.getVectorLength))))

(defn set-table
  "Deprecated.

  table - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Word2VecParam this ^org.nd4j.linalg.api.ndarray.INDArray table]
    (-> this (.setTable table))))

(defn set-weights
  "Deprecated.

  weights - `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable`"
  ([^Word2VecParam this ^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable weights]
    (-> this (.setWeights weights))))

(defn set-vector-length
  "Deprecated.

  vector-length - `int`"
  ([^Word2VecParam this ^Integer vector-length]
    (-> this (.setVectorLength vector-length))))

(defn get-word-count
  "Deprecated.

  returns: `org.apache.spark.broadcast.Broadcast<java.util.concurrent.atomic.AtomicLong>`"
  (^org.apache.spark.broadcast.Broadcast [^Word2VecParam this]
    (-> this (.getWordCount))))

(defn get-num-words
  "Deprecated.

  returns: `int`"
  (^Integer [^Word2VecParam this]
    (-> this (.getNumWords))))

(defn set-min-alpha
  "Deprecated.

  min-alpha - `double`"
  ([^Word2VecParam this ^Double min-alpha]
    (-> this (.setMinAlpha min-alpha))))

(defn get-window
  "Deprecated.

  returns: `int`"
  (^Integer [^Word2VecParam this]
    (-> this (.getWindow))))

(defn set-alpha
  "Deprecated.

  alpha - `double`"
  ([^Word2VecParam this ^Double alpha]
    (-> this (.setAlpha alpha))))

(defn set-negative
  "Deprecated.

  negative - `double`"
  ([^Word2VecParam this ^Double negative]
    (-> this (.setNegative negative))))

(defn get-words-seen
  "Deprecated.

  returns: `java.util.concurrent.atomic.AtomicLong`"
  (^java.util.concurrent.atomic.AtomicLong [^Word2VecParam this]
    (-> this (.getWordsSeen))))

(defn get-weights
  "Deprecated.

  returns: `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable`"
  (^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable [^Word2VecParam this]
    (-> this (.getWeights))))

(defn get-last-words
  "Deprecated.

  returns: `java.util.concurrent.atomic.AtomicLong`"
  (^java.util.concurrent.atomic.AtomicLong [^Word2VecParam this]
    (-> this (.getLastWords))))

(defn get-next-random
  "Deprecated.

  returns: `java.util.concurrent.atomic.AtomicLong`"
  (^java.util.concurrent.atomic.AtomicLong [^Word2VecParam this]
    (-> this (.getNextRandom))))

(defn set-next-random
  "Deprecated.

  next-random - `java.util.concurrent.atomic.AtomicLong`"
  ([^Word2VecParam this ^java.util.concurrent.atomic.AtomicLong next-random]
    (-> this (.setNextRandom next-random))))

(defn set-words-seen
  "Deprecated.

  words-seen - `java.util.concurrent.atomic.AtomicLong`"
  ([^Word2VecParam this ^java.util.concurrent.atomic.AtomicLong words-seen]
    (-> this (.setWordsSeen words-seen))))

(defn get-table
  "Deprecated.

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Word2VecParam this]
    (-> this (.getTable))))

(defn set-window
  "Deprecated.

  window - `int`"
  ([^Word2VecParam this ^Integer window]
    (-> this (.setWindow window))))

(defn get-total-words
  "Deprecated.

  returns: `int`"
  (^Integer [^Word2VecParam this]
    (-> this (.getTotalWords))))

