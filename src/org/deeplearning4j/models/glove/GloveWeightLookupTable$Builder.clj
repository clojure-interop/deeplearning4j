(ns org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.glove GloveWeightLookupTable$Builder]))

(defn ->builder
  "Constructor."
  (^GloveWeightLookupTable$Builder []
    (new GloveWeightLookupTable$Builder )))

(defn use-ada-grad
  "use-ada-grad - `boolean`

  returns: `org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder<T>`"
  (^org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder [^GloveWeightLookupTable$Builder this ^Boolean use-ada-grad]
    (-> this (.useAdaGrad use-ada-grad))))

(defn max-count
  "max-count - `double`

  returns: `org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder<T>`"
  (^org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder [^GloveWeightLookupTable$Builder this ^Double max-count]
    (-> this (.maxCount max-count))))

(defn gen
  "gen - `org.nd4j.linalg.api.rng.Random`

  returns: `org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder<T>`"
  (^org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder [^GloveWeightLookupTable$Builder this ^org.nd4j.linalg.api.rng.Random gen]
    (-> this (.gen gen))))

(defn lr
  "Description copied from class: InMemoryLookupTable.Builder

  lr - `double`

  returns: `org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder<T>`"
  (^org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder [^GloveWeightLookupTable$Builder this ^Double lr]
    (-> this (.lr lr))))

(defn negative
  "negative - `double`

  returns: `org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder<T>`"
  (^org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder [^GloveWeightLookupTable$Builder this ^Double negative]
    (-> this (.negative negative))))

(defn cache
  "vocab - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`

  returns: `org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder<T>`"
  (^org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder [^GloveWeightLookupTable$Builder this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab]
    (-> this (.cache vocab))))

(defn seed
  "seed - `long`

  returns: `org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder<T>`"
  (^org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder [^GloveWeightLookupTable$Builder this ^Long seed]
    (-> this (.seed seed))))

(defn build
  "returns: `org.deeplearning4j.models.glove.GloveWeightLookupTable<T>`"
  (^org.deeplearning4j.models.glove.GloveWeightLookupTable [^GloveWeightLookupTable$Builder this]
    (-> this (.build))))

(defn x-max
  "x-max - `double`

  returns: `org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder<T>`"
  (^org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder [^GloveWeightLookupTable$Builder this ^Double x-max]
    (-> this (.xMax x-max))))

(defn vector-length
  "vector-length - `int`

  returns: `org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder<T>`"
  (^org.deeplearning4j.models.glove.GloveWeightLookupTable$Builder [^GloveWeightLookupTable$Builder this ^Integer vector-length]
    (-> this (.vectorLength vector-length))))

