(ns org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.inmemory InMemoryLookupTable$Builder]))

(defn ->builder
  "Constructor."
  (^InMemoryLookupTable$Builder []
    (new InMemoryLookupTable$Builder )))

(defn use-ada-grad
  "use-ada-grad - `boolean`

  returns: `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable$Builder<T>`"
  (^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable$Builder [^InMemoryLookupTable$Builder this ^Boolean use-ada-grad]
    (-> this (.useAdaGrad use-ada-grad))))

(defn gen
  "gen - `org.nd4j.linalg.api.rng.Random`

  returns: `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable$Builder<T>`"
  (^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable$Builder [^InMemoryLookupTable$Builder this ^org.nd4j.linalg.api.rng.Random gen]
    (-> this (.gen gen))))

(defn lr
  "Deprecated.

  lr - `double`

  returns: `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable$Builder<T>`"
  (^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable$Builder [^InMemoryLookupTable$Builder this ^Double lr]
    (-> this (.lr lr))))

(defn negative
  "negative - `double`

  returns: `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable$Builder<T>`"
  (^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable$Builder [^InMemoryLookupTable$Builder this ^Double negative]
    (-> this (.negative negative))))

(defn use-hierarchic-softmax
  "really-use - `boolean`

  returns: `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable$Builder<T>`"
  (^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable$Builder [^InMemoryLookupTable$Builder this ^Boolean really-use]
    (-> this (.useHierarchicSoftmax really-use))))

(defn cache
  "vocab - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`

  returns: `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable$Builder<T>`"
  (^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable$Builder [^InMemoryLookupTable$Builder this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab]
    (-> this (.cache vocab))))

(defn seed
  "seed - `long`

  returns: `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable$Builder<T>`"
  (^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable$Builder [^InMemoryLookupTable$Builder this ^Long seed]
    (-> this (.seed seed))))

(defn build
  "returns: `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable<T>`"
  (^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable [^InMemoryLookupTable$Builder this]
    (-> this (.build))))

(defn vector-length
  "vector-length - `int`

  returns: `org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable$Builder<T>`"
  (^org.deeplearning4j.models.embeddings.inmemory.InMemoryLookupTable$Builder [^InMemoryLookupTable$Builder this ^Integer vector-length]
    (-> this (.vectorLength vector-length))))

