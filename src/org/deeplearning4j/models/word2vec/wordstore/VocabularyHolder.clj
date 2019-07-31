(ns org.deeplearning4j.models.word2vec.wordstore.VocabularyHolder
  "This class is used as simplified VocabCache for vocabulary building routines.
 As soon as vocab is built, all words will be transferred into VocabCache."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec.wordstore VocabularyHolder]))

(defn *build-node
  "codes - `java.util.List`
  points - `java.util.List`
  code-len - `int`
  index - `int`

  returns: `org.deeplearning4j.models.word2vec.wordstore.HuffmanNode`"
  (^org.deeplearning4j.models.word2vec.wordstore.HuffmanNode [^java.util.List codes ^java.util.List points ^Integer code-len ^Integer index]
    (VocabularyHolder/buildNode codes points code-len index)))

(defn *array-to-list
  "This method is used only for VocabCache compatibility purposes

  array - `byte[]`
  code-len - `int`

  returns: `java.util.List<java.lang.Byte>`"
  (^java.util.List [array ^Integer code-len]
    (VocabularyHolder/arrayToList array code-len)))

(defn *list-to-array
  "points - `java.util.List`
  code-len - `int`

  returns: `int[]`"
  ([^java.util.List points ^Integer code-len]
    (VocabularyHolder/listToArray points code-len))
  ([^java.util.List code]
    (VocabularyHolder/listToArray code)))

(defn get-vocabulary-word-by-string
  "word - `java.lang.String`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabularyWord`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabularyWord [^VocabularyHolder this ^java.lang.String word]
    (-> this (.getVocabularyWordByString word))))

(defn truncate-vocabulary
  "All words with frequency below threshold wii be removed

  threshold - exclusive threshold for removal - `int`"
  ([^VocabularyHolder this ^Integer threshold]
    (-> this (.truncateVocabulary threshold)))
  ([^VocabularyHolder this]
    (-> this (.truncateVocabulary))))

(defn add-word
  "Adds new word to vocabulary

  word - to be added - `java.lang.String`"
  ([^VocabularyHolder this ^java.lang.String word]
    (-> this (.addWord word))))

(defn total-words-beyond-limit
  "returns: `long`"
  (^Long [^VocabularyHolder this]
    (-> this (.totalWordsBeyondLimit))))

(defn words
  "Returns sorted list of words in vocabulary.
  Sort is DESCENDING.

  returns: list of VocabularyWord - `java.util.List<org.deeplearning4j.models.word2vec.wordstore.VocabularyWord>`"
  (^java.util.List [^VocabularyHolder this]
    (-> this (.words))))

(defn get-vocabulary-word-by-idx
  "id - `java.lang.Integer`

  returns: `org.deeplearning4j.models.word2vec.wordstore.VocabularyWord`"
  (^org.deeplearning4j.models.word2vec.wordstore.VocabularyWord [^VocabularyHolder this ^java.lang.Integer id]
    (-> this (.getVocabularyWordByIdx id))))

(defn update-huffman-codes
  "build binary tree ordered by counter.
  Based on original w2v by google

  returns: `java.util.List<org.deeplearning4j.models.word2vec.wordstore.VocabularyWord>`"
  (^java.util.List [^VocabularyHolder this]
    (-> this (.updateHuffmanCodes))))

(defn get-vocabulary
  "returns: `java.util.Collection<org.deeplearning4j.models.word2vec.wordstore.VocabularyWord>`"
  (^java.util.Collection [^VocabularyHolder this]
    (-> this (.getVocabulary))))

(defn transfer-back-to-vocab-cache
  "This method is required for compatibility purposes.
  It just transfers vocabulary from VocabHolder into VocabCache

  cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`
  empty-holder - `boolean`"
  ([^VocabularyHolder this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache cache ^Boolean empty-holder]
    (-> this (.transferBackToVocabCache cache empty-holder)))
  ([^VocabularyHolder this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache cache]
    (-> this (.transferBackToVocabCache cache)))
  ([^VocabularyHolder this]
    (-> this (.transferBackToVocabCache))))

(defn increment-word-counter
  "Increments by one number of occurrences of the word in corpus

  word - whose counter is to be incremented - `java.lang.String`"
  ([^VocabularyHolder this ^java.lang.String word]
    (-> this (.incrementWordCounter word))))

(defn consume-vocabulary
  "holder - `org.deeplearning4j.models.word2vec.wordstore.VocabularyHolder`"
  ([^VocabularyHolder this ^org.deeplearning4j.models.word2vec.wordstore.VocabularyHolder holder]
    (-> this (.consumeVocabulary holder))))

(defn index-of
  "This method returns index of word in sorted list.

  word - `java.lang.String`

  returns: `int`"
  (^Integer [^VocabularyHolder this ^java.lang.String word]
    (-> this (.indexOf word))))

(defn num-words
  "returns: number of words in vocabulary - `int`"
  (^Integer [^VocabularyHolder this]
    (-> this (.numWords))))

(defn reset-word-counters
  "This methods reset counters for all words in vocabulary"
  ([^VocabularyHolder this]
    (-> this (.resetWordCounters))))

(defn contains-word
  "Checks vocabulary for the word existence

  word - to be looked for - `java.lang.String`

  returns: TRUE of contains, FALSE otherwise - `boolean`"
  (^Boolean [^VocabularyHolder this ^java.lang.String word]
    (-> this (.containsWord word))))

