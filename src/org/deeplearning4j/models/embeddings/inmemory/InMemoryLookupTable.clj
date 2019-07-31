(ns org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable
  "Default word lookup table"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.inmemory InMemoryLookupTable]))

(defn ->in-memory-lookup-table
  "Constructor.

  vocab - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`
  vector-length - `int`
  use-ada-grad - `boolean`
  lr - `double`
  gen - `org.nd4j.linalg.api.rng.Random`
  negative - `double`
  use-hs - `boolean`"
  (^InMemoryLookupTable [^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab ^Integer vector-length ^Boolean use-ada-grad ^Double lr ^org.nd4j.linalg.api.rng.Random gen ^Double negative ^Boolean use-hs]
    (new InMemoryLookupTable vocab vector-length use-ada-grad lr gen negative use-hs))
  (^InMemoryLookupTable [^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab ^Integer vector-length ^Boolean use-ada-grad ^Double lr ^org.nd4j.linalg.api.rng.Random gen ^Double negative]
    (new InMemoryLookupTable vocab vector-length use-ada-grad lr gen negative))
  (^InMemoryLookupTable []
    (new InMemoryLookupTable )))

(defn get-syn-1-neg
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^InMemoryLookupTable this]
    (-> this (.getSyn1Neg))))

(defn vectors
  "Description copied from interface: WeightLookupTable

  returns: an iterator for all vectors in the cache - `java.util.Iterator<org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Iterator [^InMemoryLookupTable this]
    (-> this (.vectors))))

(defn set-exp-table
  "exp-table - `double[]`"
  ([^InMemoryLookupTable this exp-table]
    (-> this (.setExpTable exp-table))))

(defn consume
  "This method consumes weights of a given InMemoryLookupTable
  PLEASE NOTE: this method explicitly resets current weights

  src-table - `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable`"
  ([^InMemoryLookupTable this ^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable src-table]
    (-> this (.consume src-table))))

(defn reset-weights
  "Description copied from interface: WeightLookupTable

  reset - `boolean`"
  ([^InMemoryLookupTable this ^Boolean reset]
    (-> this (.resetWeights reset)))
  ([^InMemoryLookupTable this]
    (-> this (.resetWeights))))

(defn get-negative
  "returns: `double`"
  (^Double [^InMemoryLookupTable this]
    (-> this (.getNegative))))

(defn get-vocab-cache
  "Description copied from interface: WeightLookupTable

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabCache<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabCache [^InMemoryLookupTable this]
    (-> this (.getVocabCache))))

(defn init-negative
  ""
  ([^InMemoryLookupTable this]
    (-> this (.initNegative))))

(defn load-codes
  "Loads the co-occurrences for the given codes

  codes - the codes to load - `int[]`

  returns: an ndarray of code.length by layerSize - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^InMemoryLookupTable this codes]
    (-> this (.loadCodes codes))))

(defn get-codes
  "returns: `java.util.Map<java.lang.Integer,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^InMemoryLookupTable this]
    (-> this (.getCodes))))

(defn iterate
  "Deprecated.

  w-1 - the first word to iterate on - `T`
  w-2 - the second word to iterate on - `T`"
  ([^InMemoryLookupTable this w-1 w-2]
    (-> this (.iterate w-1 w-2))))

(defn set-use-ada-grad
  "use-ada-grad - `boolean`"
  ([^InMemoryLookupTable this ^Boolean use-ada-grad]
    (-> this (.setUseAdaGrad use-ada-grad))))

(defn plot-vocab
  "Description copied from interface: WeightLookupTable

  tsne - the tsne to use - `org.deeplearning4j.plot.BarnesHutTsne`
  num-words - `int`
  file - `java.io.File`"
  ([^InMemoryLookupTable this ^org.deeplearning4j.plot.BarnesHutTsne tsne ^Integer num-words ^java.io.File file]
    (-> this (.plotVocab tsne num-words file)))
  ([^InMemoryLookupTable this ^Integer num-words ^java.io.File file]
    (-> this (.plotVocab num-words file))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InMemoryLookupTable this]
    (-> this (.toString))))

(defn set-lr
  "lr - `com.google.common.util.concurrent.AtomicDouble`"
  ([^InMemoryLookupTable this ^com.google.common.util.concurrent.AtomicDouble lr]
    (-> this (.setLr lr))))

(defn use-ada-grad?
  "returns: `boolean`"
  (^Boolean [^InMemoryLookupTable this]
    (-> this (.isUseAdaGrad))))

(defn get-exp-table
  "returns: `double[]`"
  ([^InMemoryLookupTable this]
    (-> this (.getExpTable))))

(defn set-learning-rate
  "Description copied from interface: WeightLookupTable

  lr - `double`"
  ([^InMemoryLookupTable this ^Double lr]
    (-> this (.setLearningRate lr))))

(defn get-lr
  "Deprecated.

  returns: initial learning rate - `com.google.common.util.concurrent.AtomicDouble`"
  (^com.google.common.util.concurrent.AtomicDouble [^InMemoryLookupTable this]
    (-> this (.getLr))))

(defn set-table
  "table - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^InMemoryLookupTable this ^org.nd4j.linalg.api.ndarray.INDArray table]
    (-> this (.setTable table))))

(defn set-vector-length
  "vector-length - `int`"
  ([^InMemoryLookupTable this ^Integer vector-length]
    (-> this (.setVectorLength vector-length))))

(defn vector
  "word - `java.lang.String`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^InMemoryLookupTable this ^java.lang.String word]
    (-> this (.vector word))))

(defn set-negative
  "negative - `double`"
  ([^InMemoryLookupTable this ^Double negative]
    (-> this (.setNegative negative))))

(defn get-weights
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^InMemoryLookupTable this]
    (-> this (.getWeights))))

(defn put-code
  "code-index - `int`
  code - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^InMemoryLookupTable this ^Integer code-index ^org.nd4j.linalg.api.ndarray.INDArray code]
    (-> this (.putCode code-index code))))

(defn set-syn-1-neg
  "syn-1-neg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^InMemoryLookupTable this ^org.nd4j.linalg.api.ndarray.INDArray syn-1-neg]
    (-> this (.setSyn1Neg syn-1-neg))))

(defn set-vocab
  "vocab - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`"
  ([^InMemoryLookupTable this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab]
    (-> this (.setVocab vocab))))

(defn set-use-hs
  "use-hs - `boolean`"
  ([^InMemoryLookupTable this ^Boolean use-hs]
    (-> this (.setUseHS use-hs))))

(defn set-syn-0
  "syn-0 - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^InMemoryLookupTable this ^org.nd4j.linalg.api.ndarray.INDArray syn-0]
    (-> this (.setSyn0 syn-0))))

(defn put-vector
  "Inserts a word vector

  word - the word to insert - `java.lang.String`
  vector - the vector to insert - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^InMemoryLookupTable this ^java.lang.String word ^org.nd4j.linalg.api.ndarray.INDArray vector]
    (-> this (.putVector word vector))))

(defn iterate-sample
  "Deprecated.

  w-1 - the first word to iterate on - `T`
  w-2 - the second word to iterate on - `T`
  next-random - next random for sampling - `java.util.concurrent.atomic.AtomicLong`
  alpha - the alpha to use for learning - `double`"
  ([^InMemoryLookupTable this w-1 w-2 ^java.util.concurrent.atomic.AtomicLong next-random ^Double alpha]
    (-> this (.iterateSample w-1 w-2 next-random alpha))))

(defn get-vocab
  "returns: `org.deeplearning4j.models.word2vec.wordstore.VocabCache`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabCache [^InMemoryLookupTable this]
    (-> this (.getVocab))))

(defn get-syn-0
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^InMemoryLookupTable this]
    (-> this (.getSyn0))))

(defn set-syn-1
  "syn-1 - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^InMemoryLookupTable this ^org.nd4j.linalg.api.ndarray.INDArray syn-1]
    (-> this (.setSyn1 syn-1))))

(defn get-table
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^InMemoryLookupTable this]
    (-> this (.getTable))))

(defn get-gradient
  "Description copied from interface: WeightLookupTable

  column - `int`
  gradient - `double`

  returns: `double`"
  (^Double [^InMemoryLookupTable this ^Integer column ^Double gradient]
    (-> this (.getGradient column gradient))))

(defn layer-size
  "Description copied from interface: WeightLookupTable

  returns: the layer size for the lookup table - `int`"
  (^Integer [^InMemoryLookupTable this]
    (-> this (.layerSize))))

(defn get-syn-1
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^InMemoryLookupTable this]
    (-> this (.getSyn1))))

(defn set-codes
  "codes - `java.util.Map`"
  ([^InMemoryLookupTable this ^java.util.Map codes]
    (-> this (.setCodes codes))))

