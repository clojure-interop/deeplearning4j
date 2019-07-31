(ns org.deeplearning4j.models.word2vec.wordstore.VocabularyHolder$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec.wordstore VocabularyHolder$Builder]))

(defn ->builder
  "Constructor."
  (^VocabularyHolder$Builder []
    (new VocabularyHolder$Builder )))

(defn external-cache
  "cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabularyHolder$Builder`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabularyHolder$Builder [^VocabularyHolder$Builder this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache cache]
    (-> this (.externalCache cache))))

(defn min-word-frequency
  "threshold - `int`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabularyHolder$Builder`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabularyHolder$Builder [^VocabularyHolder$Builder this ^Integer threshold]
    (-> this (.minWordFrequency threshold))))

(defn huge-model-expected
  "With this argument set to true, you'll have your vocab scanned for low-freq words periodically.
  Please note: this is incompatible with SPECIAL mechanics.

  really-expected - `boolean`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabularyHolder$Builder`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabularyHolder$Builder [^VocabularyHolder$Builder this ^Boolean really-expected]
    (-> this (.hugeModelExpected really-expected))))

(defn scavenger-activation-threshold
  "Activation threshold defines, how ofter scavenger will be executed, to throw away low-frequency keywords.
  Good values to start mostly depends on your workstation. Something like 1000000 looks pretty nice to start with.
  Too low values can lead to undesired removal of words from vocab.
  Please note: this is incompatible with SPECIAL mechanics.

  threshold - `int`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabularyHolder$Builder`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabularyHolder$Builder [^VocabularyHolder$Builder this ^Integer threshold]
    (-> this (.scavengerActivationThreshold threshold))))

(defn scavenger-retention-delay
  "Retention delay defines, how long low-freq word will be kept in vocab, during building.
  Good values to start with: 3,4,5. Not too high, and not too low.
  Please note: this is incompatible with SPECIAL mechanics.

  delay - `int`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabularyHolder$Builder`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabularyHolder$Builder [^VocabularyHolder$Builder this ^Integer delay]
    (-> this (.scavengerRetentionDelay delay))))

(defn build
  "returns: `org.deeplearning4j.models.word2vec.wordstore.VocabularyHolder`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabularyHolder [^VocabularyHolder$Builder this]
    (-> this (.build))))

