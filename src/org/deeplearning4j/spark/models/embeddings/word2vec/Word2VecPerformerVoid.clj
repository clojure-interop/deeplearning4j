(ns org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecPerformerVoid
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.word2vec Word2VecPerformerVoid]))

(defn ->word-2-vec-performer-void
  "Constructor.

  Deprecated.

  sc - `org.apache.spark.SparkConf`
  word-count - `org.apache.spark.broadcast.Broadcast`
  weights - `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable`"
  (^Word2VecPerformerVoid [^org.apache.spark.SparkConf sc ^org.apache.spark.broadcast.Broadcast word-count ^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable weights]
    (new Word2VecPerformerVoid sc word-count weights)))

(def *-name-space
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecPerformerVoid/NAME_SPACE)

(def *-vector-length
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecPerformerVoid/VECTOR_LENGTH)

(def *-adagrad
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecPerformerVoid/ADAGRAD)

(def *-negative
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecPerformerVoid/NEGATIVE)

(def *-num-words
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecPerformerVoid/NUM_WORDS)

(def *-table
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecPerformerVoid/TABLE)

(def *-window
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecPerformerVoid/WINDOW)

(def *-alpha
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecPerformerVoid/ALPHA)

(def *-min-alpha
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecPerformerVoid/MIN_ALPHA)

(def *-iterations
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  Word2VecPerformerVoid/ITERATIONS)

(defn *get-log
  "Deprecated.

  returns: `org.slf4j.Logger`"
  (^org.slf4j.Logger []
    (Word2VecPerformerVoid/getLog )))

(defn *get-max-exp
  "Deprecated.

  returns: `double`"
  (^Double []
    (Word2VecPerformerVoid/getMAX_EXP )))

(defn *set-max-exp
  "Deprecated.

  max-exp - `double`"
  ([^Double max-exp]
    (Word2VecPerformerVoid/setMAX_EXP max-exp)))

(defn train-sentence
  "Deprecated.

  sentence - the list of vocab words to train on - `java.util.List`
  alpha - `double`"
  ([^Word2VecPerformerVoid this ^java.util.List sentence ^Double alpha]
    (-> this (.trainSentence sentence alpha))))

(defn set-exp-table
  "Deprecated.

  exp-table - `double[]`"
  ([^Word2VecPerformerVoid this exp-table]
    (-> this (.setExpTable exp-table))))

(defn get-last-checked
  "Deprecated.

  returns: `int`"
  (^Integer [^Word2VecPerformerVoid this]
    (-> this (.getLastChecked))))

(defn get-negative
  "Deprecated.

  returns: `double`"
  (^Double [^Word2VecPerformerVoid this]
    (-> this (.getNegative))))

(defn set-num-words
  "Deprecated.

  num-words - `int`"
  ([^Word2VecPerformerVoid this ^Integer num-words]
    (-> this (.setNumWords num-words))))

(defn call
  "Deprecated.

  pair - `org.nd4j.linalg.primitives.Pair`

  throws: java.lang.Exception"
  ([^Word2VecPerformerVoid this ^org.nd4j.linalg.primitives.Pair pair]
    (-> this (.call pair))))

(defn set-use-ada-grad
  "Deprecated.

  use-ada-grad - `boolean`"
  ([^Word2VecPerformerVoid this ^Boolean use-ada-grad]
    (-> this (.setUseAdaGrad use-ada-grad))))

(defn get-min-alpha
  "Deprecated.

  returns: `double`"
  (^Double [^Word2VecPerformerVoid this]
    (-> this (.getMinAlpha))))

(defn get-alpha
  "Deprecated.

  returns: `double`"
  (^Double [^Word2VecPerformerVoid this]
    (-> this (.getAlpha))))

(defn use-ada-grad?
  "Deprecated.

  returns: `boolean`"
  (^Boolean [^Word2VecPerformerVoid this]
    (-> this (.isUseAdaGrad))))

(defn set-word-count
  "Deprecated.

  word-count - `org.apache.spark.broadcast.Broadcast`"
  ([^Word2VecPerformerVoid this ^org.apache.spark.broadcast.Broadcast word-count]
    (-> this (.setWordCount word-count))))

(defn get-exp-table
  "Deprecated.

  returns: `double[]`"
  ([^Word2VecPerformerVoid this]
    (-> this (.getExpTable))))

(defn set-last-checked
  "Deprecated.

  last-checked - `int`"
  ([^Word2VecPerformerVoid this ^Integer last-checked]
    (-> this (.setLastChecked last-checked))))

(defn set-total-words
  "Deprecated.

  total-words - `int`"
  ([^Word2VecPerformerVoid this ^Integer total-words]
    (-> this (.setTotalWords total-words))))

(defn get-vector-length
  "Deprecated.

  returns: `int`"
  (^Integer [^Word2VecPerformerVoid this]
    (-> this (.getVectorLength))))

(defn set-table
  "Deprecated.

  table - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Word2VecPerformerVoid this ^org.nd4j.linalg.api.ndarray.INDArray table]
    (-> this (.setTable table))))

(defn set-weights
  "Deprecated.

  weights - `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable`"
  ([^Word2VecPerformerVoid this ^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable weights]
    (-> this (.setWeights weights))))

(defn set-vector-length
  "Deprecated.

  vector-length - `int`"
  ([^Word2VecPerformerVoid this ^Integer vector-length]
    (-> this (.setVectorLength vector-length))))

(defn get-iterations
  "Deprecated.

  returns: `int`"
  (^Integer [^Word2VecPerformerVoid this]
    (-> this (.getIterations))))

(defn get-word-count
  "Deprecated.

  returns: `org.apache.spark.broadcast.Broadcast<java.util.concurrent.atomic.AtomicLong>`"
  (^org.apache.spark.broadcast.Broadcast [^Word2VecPerformerVoid this]
    (-> this (.getWordCount))))

(defn get-num-words
  "Deprecated.

  returns: `int`"
  (^Integer [^Word2VecPerformerVoid this]
    (-> this (.getNumWords))))

(defn set-min-alpha
  "Deprecated.

  min-alpha - `double`"
  ([^Word2VecPerformerVoid this ^Double min-alpha]
    (-> this (.setMinAlpha min-alpha))))

(defn skip-gram
  "Deprecated.

  i - `int`
  sentence - `java.util.List`
  b - `int`
  alpha - `double`"
  ([^Word2VecPerformerVoid this ^Integer i ^java.util.List sentence ^Integer b ^Double alpha]
    (-> this (.skipGram i sentence b alpha))))

(defn get-window
  "Deprecated.

  returns: `int`"
  (^Integer [^Word2VecPerformerVoid this]
    (-> this (.getWindow))))

(defn set-alpha
  "Deprecated.

  alpha - `double`"
  ([^Word2VecPerformerVoid this ^Double alpha]
    (-> this (.setAlpha alpha))))

(defn setup
  "Deprecated.

  conf - `org.apache.spark.SparkConf`"
  ([^Word2VecPerformerVoid this ^org.apache.spark.SparkConf conf]
    (-> this (.setup conf))))

(defn set-negative
  "Deprecated.

  negative - `double`"
  ([^Word2VecPerformerVoid this ^Double negative]
    (-> this (.setNegative negative))))

(defn get-weights
  "Deprecated.

  returns: `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable`"
  (^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable [^Word2VecPerformerVoid this]
    (-> this (.getWeights))))

(defn get-next-random
  "Deprecated.

  returns: `java.util.concurrent.atomic.AtomicLong`"
  (^java.util.concurrent.atomic.AtomicLong [^Word2VecPerformerVoid this]
    (-> this (.getNextRandom))))

(defn set-next-random
  "Deprecated.

  next-random - `java.util.concurrent.atomic.AtomicLong`"
  ([^Word2VecPerformerVoid this ^java.util.concurrent.atomic.AtomicLong next-random]
    (-> this (.setNextRandom next-random))))

(defn iterate-sample
  "Deprecated.

  w-1 - the first word to iterate on - `org.deeplearning4j.models.word2vec.VocabWord`
  w-2 - the second word to iterate on - `org.deeplearning4j.models.word2vec.VocabWord`
  alpha - `double`"
  ([^Word2VecPerformerVoid this ^org.deeplearning4j.models.word2vec.VocabWord w-1 ^org.deeplearning4j.models.word2vec.VocabWord w-2 ^Double alpha]
    (-> this (.iterateSample w-1 w-2 alpha))))

(defn get-table
  "Deprecated.

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Word2VecPerformerVoid this]
    (-> this (.getTable))))

(defn set-window
  "Deprecated.

  window - `int`"
  ([^Word2VecPerformerVoid this ^Integer window]
    (-> this (.setWindow window))))

(defn set-iterations
  "Deprecated.

  iterations - `int`"
  ([^Word2VecPerformerVoid this ^Integer iterations]
    (-> this (.setIterations iterations))))

(defn get-total-words
  "Deprecated.

  returns: `int`"
  (^Integer [^Word2VecPerformerVoid this]
    (-> this (.getTotalWords))))

