(ns org.deeplearning4j.models.glove.GloveWeightLookupTable
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.glove GloveWeightLookupTable]))

(defn ->glove-weight-lookup-table
  "Constructor.

  Deprecated.

  vocab - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`
  vector-length - `int`
  use-ada-grad - `boolean`
  lr - `double`
  gen - `org.nd4j.linalg.api.rng.Random`
  negative - `double`
  x-max - `double`
  max-count - `double`"
  (^GloveWeightLookupTable [^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab ^Integer vector-length ^Boolean use-ada-grad ^Double lr ^org.nd4j.linalg.api.rng.Random gen ^Double negative ^Double x-max ^Double max-count]
    (new GloveWeightLookupTable vocab vector-length use-ada-grad lr gen negative x-max max-count)))

(defn *load
  "Deprecated.

  is - the input stream to read from for the weights - `java.io.InputStream`
  vocab - the vocab for the lookuptable - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`

  returns: the loaded model - `org.deeplearning4j.models.glove.GloveWeightLookupTable`

  throws: java.io.IOException - if one occurs"
  (^org.deeplearning4j.models.glove.GloveWeightLookupTable [^java.io.InputStream is ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab]
    (GloveWeightLookupTable/load is vocab)))

(defn reset-weights
  "Deprecated.

  reset - `boolean`"
  ([^GloveWeightLookupTable this ^Boolean reset]
    (-> this (.resetWeights reset)))
  ([^GloveWeightLookupTable this]
    (-> this (.resetWeights))))

(defn set-max-count
  "Deprecated.

  max-count - `double`"
  ([^GloveWeightLookupTable this ^Double max-count]
    (-> this (.setMaxCount max-count))))

(defn getx-max
  "Deprecated.

  returns: `double`"
  (^Double [^GloveWeightLookupTable this]
    (-> this (.getxMax))))

(defn get-bias
  "Deprecated.

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GloveWeightLookupTable this]
    (-> this (.getBias))))

(defn get-max-count
  "Deprecated.

  returns: `double`"
  (^Double [^GloveWeightLookupTable this]
    (-> this (.getMaxCount))))

(defn setx-max
  "Deprecated.

  x-max - `double`"
  ([^GloveWeightLookupTable this ^Double x-max]
    (-> this (.setxMax x-max))))

(defn set-bias
  "Deprecated.

  bias - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^GloveWeightLookupTable this ^org.nd4j.linalg.api.ndarray.INDArray bias]
    (-> this (.setBias bias))))

(defn iterate-sample
  "Deprecated.

  w-1 - the first word to iterate on - `T`
  w-2 - the second word to iterate on - `T`
  next-random - next random for sampling - `java.util.concurrent.atomic.AtomicLong`
  alpha - the alpha to use for learning - `double`"
  ([^GloveWeightLookupTable this w-1 w-2 ^java.util.concurrent.atomic.AtomicLong next-random ^Double alpha]
    (-> this (.iterateSample w-1 w-2 next-random alpha)))
  (^Double [^GloveWeightLookupTable this w-1 w-2 ^Double score]
    (-> this (.iterateSample w-1 w-2 score))))

(defn get-bias-ada-grad
  "Deprecated.

  returns: `org.nd4j.linalg.learning.legacy.AdaGrad`"
  (^org.nd4j.linalg.learning.legacy.AdaGrad [^GloveWeightLookupTable this]
    (-> this (.getBiasAdaGrad))))

(defn get-weight-ada-grad
  "Deprecated.

  returns: `org.nd4j.linalg.learning.legacy.AdaGrad`"
  (^org.nd4j.linalg.learning.legacy.AdaGrad [^GloveWeightLookupTable this]
    (-> this (.getWeightAdaGrad))))

