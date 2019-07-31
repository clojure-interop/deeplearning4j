(ns org.deeplearning4j.models.word2vec.wordstore.inmemory.AbstractCache$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec.wordstore.inmemory AbstractCache$Builder]))

(defn ->builder
  "Constructor."
  (^AbstractCache$Builder []
    (new AbstractCache$Builder )))

(defn huge-model-expected
  "really-expected - `boolean`

  returns: `org.deeplearning4j.models.word2vec.wordstore.inmemory.AbstractCache$Builder<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.inmemory.AbstractCache$Builder [^AbstractCache$Builder this ^Boolean really-expected]
    (-> this (.hugeModelExpected really-expected))))

(defn scavenger-threshold
  "threshold - `int`

  returns: `org.deeplearning4j.models.word2vec.wordstore.inmemory.AbstractCache$Builder<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.inmemory.AbstractCache$Builder [^AbstractCache$Builder this ^Integer threshold]
    (-> this (.scavengerThreshold threshold))))

(defn scavenger-retention-delay
  "delay - `int`

  returns: `org.deeplearning4j.models.word2vec.wordstore.inmemory.AbstractCache$Builder<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.inmemory.AbstractCache$Builder [^AbstractCache$Builder this ^Integer delay]
    (-> this (.scavengerRetentionDelay delay))))

(defn min-element-frequency
  "min-frequency - `int`

  returns: `org.deeplearning4j.models.word2vec.wordstore.inmemory.AbstractCache$Builder<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.inmemory.AbstractCache$Builder [^AbstractCache$Builder this ^Integer min-frequency]
    (-> this (.minElementFrequency min-frequency))))

(defn build
  "returns: `org.deeplearning4j.models.word2vec.wordstore.inmemory.AbstractCache<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.inmemory.AbstractCache [^AbstractCache$Builder this]
    (-> this (.build))))

