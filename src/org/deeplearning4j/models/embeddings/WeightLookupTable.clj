(ns org.deeplearning4j.models.embeddings.WeightLookupTable
  "General weight lookup table"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings WeightLookupTable]))

(defn vectors
  "Iterates through all of the vectors in the cache

  returns: an iterator for all vectors in the cache - `java.util.Iterator<org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Iterator [^WeightLookupTable this]
    (-> this (.vectors))))

(defn reset-weights
  "Clear out all weights regardless

  reset - `boolean`"
  ([^WeightLookupTable this ^Boolean reset]
    (-> this (.resetWeights reset)))
  ([^WeightLookupTable this]
    (-> this (.resetWeights))))

(defn get-vocab-cache
  "Returns corresponding vocabulary

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabCache<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabCache [^WeightLookupTable this]
    (-> this (.getVocabCache))))

(defn load-codes
  "Loads the co-occurrences for the given codes

  codes - the codes to load - `int[]`

  returns: an ndarray of code.length by layerSize - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WeightLookupTable this codes]
    (-> this (.loadCodes codes))))

(defn iterate
  "Deprecated.

  w-1 - the first word to iterate on - `T`
  w-2 - the second word to iterate on - `T`"
  ([^WeightLookupTable this w-1 w-2]
    (-> this (.iterate w-1 w-2))))

(defn plot-vocab
  "Render the words via TSNE

  tsne - the tsne to use - `org.deeplearning4j.plot.BarnesHutTsne`
  num-words - `int`
  connection-info - `org.deeplearning4j.ui.UiConnectionInfo`"
  ([^WeightLookupTable this ^org.deeplearning4j.plot.BarnesHutTsne tsne ^Integer num-words ^org.deeplearning4j.ui.UiConnectionInfo connection-info]
    (-> this (.plotVocab tsne num-words connection-info)))
  ([^WeightLookupTable this ^Integer num-words ^org.deeplearning4j.ui.UiConnectionInfo connection-info]
    (-> this (.plotVocab num-words connection-info))))

(defn get-table-id
  "Returns unique ID of this table.
  Used for JointStorage/DistributedLookupTable mechanics

  returns: ID of this table - `java.lang.Long`"
  (^java.lang.Long [^WeightLookupTable this]
    (-> this (.getTableId))))

(defn set-learning-rate
  "Sets the learning rate

  lr - `double`"
  ([^WeightLookupTable this ^Double lr]
    (-> this (.setLearningRate lr))))

(defn vector
  "word - `java.lang.String`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WeightLookupTable this ^java.lang.String word]
    (-> this (.vector word))))

(defn set-table-id
  "Set's table Id.
  Please note, it should be unique withing Joint/Distributed LookupTable

  table-id - `java.lang.Long`"
  ([^WeightLookupTable this ^java.lang.Long table-id]
    (-> this (.setTableId table-id))))

(defn get-weights
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WeightLookupTable this]
    (-> this (.getWeights))))

(defn put-code
  "code-index - `int`
  code - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^WeightLookupTable this ^Integer code-index ^org.nd4j.linalg.api.ndarray.INDArray code]
    (-> this (.putCode code-index code))))

(defn put-vector
  "Inserts a word vector

  word - the word to insert - `java.lang.String`
  vector - the vector to insert - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^WeightLookupTable this ^java.lang.String word ^org.nd4j.linalg.api.ndarray.INDArray vector]
    (-> this (.putVector word vector))))

(defn iterate-sample
  "Deprecated.

  w-1 - the first word to iterate on - `T`
  w-2 - the second word to iterate on - `T`
  next-random - nextRandom for sampling - `java.util.concurrent.atomic.AtomicLong`
  alpha - the alpha to use for learning - `double`"
  ([^WeightLookupTable this w-1 w-2 ^java.util.concurrent.atomic.AtomicLong next-random ^Double alpha]
    (-> this (.iterateSample w-1 w-2 next-random alpha))))

(defn get-gradient
  "Returns gradient for specified word

  column - `int`
  gradient - `double`

  returns: `double`"
  (^Double [^WeightLookupTable this ^Integer column ^Double gradient]
    (-> this (.getGradient column gradient))))

(defn layer-size
  "The layer size for the lookup table

  returns: the layer size for the lookup table - `int`"
  (^Integer [^WeightLookupTable this]
    (-> this (.layerSize))))

