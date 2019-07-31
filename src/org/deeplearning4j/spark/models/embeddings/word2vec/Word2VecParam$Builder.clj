(ns org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.embeddings.word2vec Word2VecParam$Builder]))

(defn ->builder
  "Constructor."
  (^Word2VecParam$Builder []
    (new Word2VecParam$Builder )))

(defn table
  "table - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder [^Word2VecParam$Builder this ^org.nd4j.linalg.api.ndarray.INDArray table]
    (-> this (.table table))))

(defn window
  "window - `int`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder [^Word2VecParam$Builder this ^Integer window]
    (-> this (.window window))))

(defn weights
  "weights - `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder [^Word2VecParam$Builder this ^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable weights]
    (-> this (.weights weights))))

(defn use-ada-grad
  "use-ada-grad - `boolean`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder [^Word2VecParam$Builder this ^Boolean use-ada-grad]
    (-> this (.useAdaGrad use-ada-grad))))

(defn negative
  "negative - `double`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder [^Word2VecParam$Builder this ^Double negative]
    (-> this (.negative negative))))

(defn set-vector-length
  "vector-length - `int`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder [^Word2VecParam$Builder this ^Integer vector-length]
    (-> this (.setVectorLength vector-length))))

(defn set-min-alpha
  "min-alpha - `double`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder [^Word2VecParam$Builder this ^Double min-alpha]
    (-> this (.setMinAlpha min-alpha))))

(defn build
  "returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam [^Word2VecParam$Builder this]
    (-> this (.build))))

(defn set-alpha
  "alpha - `double`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder [^Word2VecParam$Builder this ^Double alpha]
    (-> this (.setAlpha alpha))))

(defn set-next-random
  "next-random - `java.util.concurrent.atomic.AtomicLong`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder [^Word2VecParam$Builder this ^java.util.concurrent.atomic.AtomicLong next-random]
    (-> this (.setNextRandom next-random))))

(defn exp-table
  "exp-table - `org.apache.spark.broadcast.Broadcast`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder [^Word2VecParam$Builder this ^org.apache.spark.broadcast.Broadcast exp-table]
    (-> this (.expTable exp-table))))

(defn word-count
  "word-count - `org.apache.spark.broadcast.Broadcast`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder [^Word2VecParam$Builder this ^org.apache.spark.broadcast.Broadcast word-count]
    (-> this (.wordCount word-count))))

(defn last-checked
  "last-checked - `int`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder [^Word2VecParam$Builder this ^Integer last-checked]
    (-> this (.lastChecked last-checked))))

(defn num-words
  "num-words - `int`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder [^Word2VecParam$Builder this ^Integer num-words]
    (-> this (.numWords num-words))))

(defn total-words
  "total-words - `int`

  returns: `org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder`"
  (^org.deeplearning4j.spark.models.embeddings.word2vec.Word2VecParam$Builder [^Word2VecParam$Builder this ^Integer total-words]
    (-> this (.totalWords total-words))))

