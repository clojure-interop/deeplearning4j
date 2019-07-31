(ns org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec.wordstore VocabConstructor$Builder]))

(defn ->builder
  "Constructor."
  (^VocabConstructor$Builder []
    (new VocabConstructor$Builder )))

(defn set-entries-limit
  "This method sets the limit to resulting vocabulary size.
  PLEASE NOTE: This method is applicable only if huffman tree is built.

  limit - `int`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder [^VocabConstructor$Builder this ^Integer limit]
    (-> this (.setEntriesLimit limit))))

(defn add-source
  "Adds SequenceIterator for vocabulary construction.
  Please note, you can add as many sources, as you wish.

  iterator - SequenceIterator to build vocabulary from - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator`
  min-element-frequency - elements with frequency below this value will be removed from vocabulary - `int`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder [^VocabConstructor$Builder this ^org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator iterator ^Integer min-element-frequency]
    (-> this (.addSource iterator min-element-frequency))))

(defn fetch-labels
  "Sets, if labels should be fetched, during vocab building

  really-fetch - `boolean`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder [^VocabConstructor$Builder this ^Boolean really-fetch]
    (-> this (.fetchLabels really-fetch))))

(defn allow-parallel-tokenization
  "really-allow - `boolean`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder [^VocabConstructor$Builder this ^Boolean really-allow]
    (-> this (.allowParallelTokenization really-allow))))

(defn set-target-vocab-cache
  "After temporary internal vocabulary is built, it will be transferred to target VocabCache you pass here

  cache - target VocabCache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder [^VocabConstructor$Builder this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache cache]
    (-> this (.setTargetVocabCache cache))))

(defn build
  "returns: `org.deeplearning4j.models.word2vec.wordstore.VocabConstructor<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabConstructor [^VocabConstructor$Builder this]
    (-> this (.build))))

(defn set-unk
  "unk - `T`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder [^VocabConstructor$Builder this unk]
    (-> this (.setUnk unk))))

(defn set-index
  "index - `org.deeplearning4j.text.invertedindex.InvertedIndex`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder [^VocabConstructor$Builder this ^org.deeplearning4j.text.invertedindex.InvertedIndex index]
    (-> this (.setIndex index))))

(defn set-stop-words
  "stop-words - `java.util.Collection`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder [^VocabConstructor$Builder this ^java.util.Collection stop-words]
    (-> this (.setStopWords stop-words))))

(defn enable-scavenger
  "really-enable - `boolean`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabConstructor$Builder [^VocabConstructor$Builder this ^Boolean really-enable]
    (-> this (.enableScavenger really-enable))))

