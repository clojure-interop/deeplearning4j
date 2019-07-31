(ns org.deeplearning4j.models.word2vec.wordstore.VocabConstructor
  "This class can be used to build joint vocabulary from special sources, that should be treated separately.
 I.e. words from one source should have minWordFrequency set to 1, while the rest of corpus should have minWordFrequency set to 5.
 So, here's the way to deal with it.
 It also can be used to simply build vocabulary out of arbitrary number of Sequences derived from arbitrary number of SequenceIterators"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec.wordstore VocabConstructor]))

(defn build-merged-vocabulary
  "This method transfers existing WordVectors model into current one

  word-vectors - `org.deeplearning4j.models.embeddings.wordvectors.WordVectors`
  fetch-labels - `boolean`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabCache<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabCache [^VocabConstructor this ^org.deeplearning4j.models.embeddings.wordvectors.WordVectors word-vectors ^Boolean fetch-labels]
    (-> this (.buildMergedVocabulary word-vectors fetch-labels))))

(defn get-number-of-sequences
  "This method returns total number of sequences passed through VocabConstructor

  returns: `long`"
  (^Long [^VocabConstructor this]
    (-> this (.getNumberOfSequences))))

(defn transfer-vocabulary
  "vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`
  build-huffman - `boolean`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabCache<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabCache [^VocabConstructor this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache ^Boolean build-huffman]
    (-> this (.transferVocabulary vocab-cache build-huffman))))

(defn build-joint-vocabulary
  "This method scans all sources passed through builder, and returns all words as vocab.
  If TargetVocabCache was set during instance creation, it'll be filled too.

  reset-counters - `boolean`
  build-huffman-tree - `boolean`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabCache<T>`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabCache [^VocabConstructor this ^Boolean reset-counters ^Boolean build-huffman-tree]
    (-> this (.buildJointVocabulary reset-counters build-huffman-tree))))

