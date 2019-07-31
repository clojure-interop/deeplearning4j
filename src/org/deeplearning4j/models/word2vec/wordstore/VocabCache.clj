(ns org.deeplearning4j.models.word2vec.wordstore.VocabCache
  "A VocabCache handles the storage of information needed for the word2vec look up table."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec.wordstore VocabCache]))

(defn increment-total-doc-count
  "Increment the doc count

  by - the number to increment by - `long`"
  ([^VocabCache this ^Long by]
    (-> this (.incrementTotalDocCount by)))
  ([^VocabCache this]
    (-> this (.incrementTotalDocCount))))

(defn vocab-exists
  "Vocab exists already

  returns: `boolean`"
  (^Boolean [^VocabCache this]
    (-> this (.vocabExists))))

(defn element-at-index
  "Returns SequenceElement at the given index or null

  index - `int`

  returns: `T`"
  ([^VocabCache this ^Integer index]
    (-> this (.elementAtIndex index))))

(defn word-for
  "word - `java.lang.String`

  returns: `T`"
  ([^VocabCache this ^java.lang.String word]
    (-> this (.wordFor word))))

(defn add-token
  "Adds a token
  to the cache

  element - the word to add - `T`"
  ([^VocabCache this element]
    (-> this (.addToken element))))

(defn vocab-words
  "Returns all of the vocab word nodes

  returns: `java.util.Collection<T>`"
  (^java.util.Collection [^VocabCache this]
    (-> this (.vocabWords))))

(defn update-words-occurrences
  "Updates counters"
  ([^VocabCache this]
    (-> this (.updateWordsOccurrences))))

(defn add-word-to-index
  "index - `int`
  word - `java.lang.String`"
  ([^VocabCache this ^Integer index ^java.lang.String word]
    (-> this (.addWordToIndex index word))))

(defn increment-word-count
  "Increment the count for the given word by
  the amount increment

  word - the word to increment the count for - `java.lang.String`
  increment - the amount to increment by - `int`"
  ([^VocabCache this ^java.lang.String word ^Integer increment]
    (-> this (.incrementWordCount word increment)))
  ([^VocabCache this ^java.lang.String word]
    (-> this (.incrementWordCount word))))

(defn words
  "Returns all of the words in the vocab

  returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^VocabCache this]
    (-> this (.words))))

(defn word-frequency
  "Returns the number of times the word has occurred

  word - the word to retrieve the occurrence frequency for - `java.lang.String`

  returns: 0 if hasn't occurred or the number of times
  the word occurs - `int`"
  (^Integer [^VocabCache this ^java.lang.String word]
    (-> this (.wordFrequency word))))

(defn remove-element
  "Removes element with specified label from vocabulary
  Please note: Huffman index should be updated after element removal

  label - label of the element to be removed - `java.lang.String`"
  ([^VocabCache this ^java.lang.String label]
    (-> this (.removeElement label))))

(defn doc-appeared-in
  "Count of documents a word appeared in

  word - the number of documents the word appeared in - `java.lang.String`

  returns: `int`"
  (^Integer [^VocabCache this ^java.lang.String word]
    (-> this (.docAppearedIn word))))

(defn set-count-for-doc
  "Set the count for the number of documents the word appears in

  word - the word to set the count for - `java.lang.String`
  count - the count of the word - `long`"
  ([^VocabCache this ^java.lang.String word ^Long count]
    (-> this (.setCountForDoc word count))))

(defn load-vocab
  "Load vocab"
  ([^VocabCache this]
    (-> this (.loadVocab))))

(defn save-vocab
  "Saves the vocab: this allow for reuse of word frequencies"
  ([^VocabCache this]
    (-> this (.saveVocab))))

(defn import-vocabulary
  "imports vocabulary

  vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`"
  ([^VocabCache this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache]
    (-> this (.importVocabulary vocab-cache))))

(defn increment-doc-count
  "Increment the document count

  word - the word to increment by - `java.lang.String`
  how-much - `long`"
  ([^VocabCache this ^java.lang.String word ^Long how-much]
    (-> this (.incrementDocCount word how-much))))

(defn has-token?
  "Returns whether the cache
  contains this token or not

  token - the token to tes - `java.lang.String`

  returns: whether the token exists in
  the cache or not - `boolean`"
  (^Boolean [^VocabCache this ^java.lang.String token]
    (-> this (.hasToken token))))

(defn put-vocab-word
  "Deprecated.

  word - the word to add to the vocab - `java.lang.String`"
  ([^VocabCache this ^java.lang.String word]
    (-> this (.putVocabWord word))))

(defn token-for
  "Returns the token (again not necessarily in the vocab)
  for this word

  word - the word to get the token for - `java.lang.String`

  returns: the vocab word for this token - `T`"
  ([^VocabCache this ^java.lang.String word]
    (-> this (.tokenFor word))))

(defn index-of
  "Returns the index of a given word

  word - the index of a given word - `java.lang.String`

  returns: the index of a given word or -1
  if not found - `int`"
  (^Integer [^VocabCache this ^java.lang.String word]
    (-> this (.indexOf word))))

(defn num-words
  "Returns the number of words in the cache

  returns: the number of words in the cache - `int`"
  (^Integer [^VocabCache this]
    (-> this (.numWords))))

(defn total-number-of-docs
  "Returns the total of number of documents encountered in the corpus

  returns: the total number of docs in the corpus - `long`"
  (^Long [^VocabCache this]
    (-> this (.totalNumberOfDocs))))

(defn total-word-occurrences
  "The total number of word occurrences

  returns: the total number of word occurrences - `long`"
  (^Long [^VocabCache this]
    (-> this (.totalWordOccurrences))))

(defn contains-word
  "Returns true if the cache contains the given word

  word - the word to check for - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^VocabCache this ^java.lang.String word]
    (-> this (.containsWord word))))

(defn word-at-index
  "Returns the word contained at the given index or null

  index - the index of the word to get - `int`

  returns: the word at the given index - `java.lang.String`"
  (^java.lang.String [^VocabCache this ^Integer index]
    (-> this (.wordAtIndex index))))

(defn tokens
  "All of the tokens in the cache, (not necessarily apart of the vocab)

  returns: the tokens for this cache - `java.util.Collection<T>`"
  (^java.util.Collection [^VocabCache this]
    (-> this (.tokens))))

