(ns org.deeplearning4j.models.word2vec.wordstore.inmemory.InMemoryLookupCache
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec.wordstore.inmemory InMemoryLookupCache]))

(defn ->in-memory-lookup-cache
  "Constructor.

  Deprecated."
  (^InMemoryLookupCache []
    (new InMemoryLookupCache ))
  (^InMemoryLookupCache [^Boolean add-unk]
    (new InMemoryLookupCache add-unk)))

(defn word-frequencies
  "Instance Field.

  Deprecated.

  type: org.nd4j.linalg.primitives.Counter<java.lang.String>"
  (^org.nd4j.linalg.primitives.Counter [^InMemoryLookupCache this]
    (-> this .-wordFrequencies)))

(defn doc-frequencies
  "Instance Field.

  Deprecated.

  type: org.nd4j.linalg.primitives.Counter<java.lang.String>"
  (^org.nd4j.linalg.primitives.Counter [^InMemoryLookupCache this]
    (-> this .-docFrequencies)))

(defn vocabs
  "Instance Field.

  Deprecated.

  type: java.util.Map<java.lang.String,org.deeplearning4j.models.word2vec.VocabWord>"
  (^java.util.Map [^InMemoryLookupCache this]
    (-> this .-vocabs)))

(defn tokens
  "Instance Field.

  Deprecated.

  type: java.util.Map<java.lang.String,org.deeplearning4j.models.word2vec.VocabWord>"
  (^java.util.Map [^InMemoryLookupCache this]
    (-> this .-tokens)))

(defn *load
  "Deprecated.

  from - the input stream to read from - `java.io.InputStream`

  returns: the in memory lookup cache - `org.deeplearning4j.models.word2vec.wordstore.inmemory.InMemoryLookupCache`"
  (^org.deeplearning4j.models.word2vec.wordstore.inmemory.InMemoryLookupCache [^java.io.InputStream from]
    (InMemoryLookupCache/load from)))

(defn get-vocabs
  "Deprecated.

  returns: `java.util.Map<java.lang.String,org.deeplearning4j.models.word2vec.VocabWord>`"
  (^java.util.Map [^InMemoryLookupCache this]
    (-> this (.getVocabs))))

(defn increment-total-doc-count
  "Deprecated.

  by - the number to increment by - `long`"
  ([^InMemoryLookupCache this ^Long by]
    (-> this (.incrementTotalDocCount by)))
  ([^InMemoryLookupCache this]
    (-> this (.incrementTotalDocCount))))

(defn vocab-exists
  "Deprecated.

  returns: `boolean`"
  (^Boolean [^InMemoryLookupCache this]
    (-> this (.vocabExists))))

(defn element-at-index
  "Deprecated.

  index - `int`

  returns: `org.deeplearning4j.models.word2vec.VocabWord`"
  (^org.deeplearning4j.models.word2vec.VocabWord [^InMemoryLookupCache this ^Integer index]
    (-> this (.elementAtIndex index))))

(defn set-tokens
  "Deprecated.

  tokens - `java.util.Map`"
  ([^InMemoryLookupCache this ^java.util.Map tokens]
    (-> this (.setTokens tokens))))

(defn word-for
  "Deprecated.

  word - `java.lang.String`

  returns: `org.deeplearning4j.models.word2vec.VocabWord`"
  (^org.deeplearning4j.models.word2vec.VocabWord [^InMemoryLookupCache this ^java.lang.String word]
    (-> this (.wordFor word))))

(defn add-token
  "Deprecated.

  word - the word to add - `org.deeplearning4j.models.word2vec.VocabWord`"
  ([^InMemoryLookupCache this ^org.deeplearning4j.models.word2vec.VocabWord word]
    (-> this (.addToken word))))

(defn get-tokens
  "Deprecated.

  returns: `java.util.Map<java.lang.String,org.deeplearning4j.models.word2vec.VocabWord>`"
  (^java.util.Map [^InMemoryLookupCache this]
    (-> this (.getTokens))))

(defn vocab-words
  "Deprecated.

  returns: `java.util.Collection<org.deeplearning4j.models.word2vec.VocabWord>`"
  (^java.util.Collection [^InMemoryLookupCache this]
    (-> this (.vocabWords))))

(defn set-vocabs
  "Deprecated.

  vocabs - `java.util.Map`"
  ([^InMemoryLookupCache this ^java.util.Map vocabs]
    (-> this (.setVocabs vocabs))))

(defn update-words-occurrences
  "Deprecated."
  ([^InMemoryLookupCache this]
    (-> this (.updateWordsOccurrences))))

(defn add-word-to-index
  "Deprecated.

  index - `int`
  word - `java.lang.String`"
  ([^InMemoryLookupCache this ^Integer index ^java.lang.String word]
    (-> this (.addWordToIndex index word))))

(defn increment-word-count
  "Deprecated.

  word - the word to increment the count for - `java.lang.String`
  increment - the amount to increment by - `int`"
  ([^InMemoryLookupCache this ^java.lang.String word ^Integer increment]
    (-> this (.incrementWordCount word increment)))
  ([^InMemoryLookupCache this ^java.lang.String word]
    (-> this (.incrementWordCount word))))

(defn to-string
  "Deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^InMemoryLookupCache this]
    (-> this (.toString))))

(defn words
  "Deprecated.

  returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^InMemoryLookupCache this]
    (-> this (.words))))

(defn word-frequency
  "Deprecated.

  word - the word to retrieve the occurrence frequency for - `java.lang.String`

  returns: 0 if hasn't occurred or the number of times
  the word occurs - `int`"
  (^Integer [^InMemoryLookupCache this ^java.lang.String word]
    (-> this (.wordFrequency word))))

(defn remove-element
  "Deprecated.

  label - label of the element to be removed - `java.lang.String`"
  ([^InMemoryLookupCache this ^java.lang.String label]
    (-> this (.removeElement label))))

(defn get-word-frequencies
  "Deprecated.

  returns: `org.nd4j.linalg.primitives.Counter<java.lang.String>`"
  (^org.nd4j.linalg.primitives.Counter [^InMemoryLookupCache this]
    (-> this (.getWordFrequencies))))

(defn doc-appeared-in
  "Deprecated.

  word - the number of documents the word appeared in - `java.lang.String`

  returns: `int`"
  (^Integer [^InMemoryLookupCache this ^java.lang.String word]
    (-> this (.docAppearedIn word))))

(defn set-count-for-doc
  "Deprecated.

  word - the word to set the count for - `java.lang.String`
  count - the count of the word - `long`"
  ([^InMemoryLookupCache this ^java.lang.String word ^Long count]
    (-> this (.setCountForDoc word count))))

(defn load-vocab
  "Deprecated."
  ([^InMemoryLookupCache this]
    (-> this (.loadVocab))))

(defn save-vocab
  "Deprecated."
  ([^InMemoryLookupCache this]
    (-> this (.saveVocab))))

(defn set-word-frequencies
  "Deprecated.

  cnt - `org.nd4j.linalg.primitives.Counter`"
  ([^InMemoryLookupCache this ^org.nd4j.linalg.primitives.Counter cnt]
    (-> this (.setWordFrequencies cnt))))

(defn import-vocabulary
  "Deprecated.

  vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`"
  ([^InMemoryLookupCache this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache]
    (-> this (.importVocabulary vocab-cache))))

(defn hash-code
  "Deprecated.

  returns: `int`"
  (^Integer [^InMemoryLookupCache this]
    (-> this (.hashCode))))

(defn increment-doc-count
  "Deprecated.

  word - the word to increment by - `java.lang.String`
  how-much - `long`"
  ([^InMemoryLookupCache this ^java.lang.String word ^Long how-much]
    (-> this (.incrementDocCount word how-much))))

(defn has-token?
  "Deprecated.

  token - the token to tes - `java.lang.String`

  returns: whether the token exists in
  the cache or not - `boolean`"
  (^Boolean [^InMemoryLookupCache this ^java.lang.String token]
    (-> this (.hasToken token))))

(defn put-vocab-word
  "Deprecated.

  word - `java.lang.String`"
  ([^InMemoryLookupCache this ^java.lang.String word]
    (-> this (.putVocabWord word))))

(defn token-for
  "Deprecated.

  word - the word to get the token for - `java.lang.String`

  returns: the vocab word for this token - `org.deeplearning4j.models.word2vec.VocabWord`"
  (^org.deeplearning4j.models.word2vec.VocabWord [^InMemoryLookupCache this ^java.lang.String word]
    (-> this (.tokenFor word))))

(defn index-of
  "Deprecated.

  word - the index of a given word - `java.lang.String`

  returns: the index of a given word or -1
  if not found - `int`"
  (^Integer [^InMemoryLookupCache this ^java.lang.String word]
    (-> this (.indexOf word))))

(defn num-words
  "Deprecated.

  returns: the number of words in the cache - `int`"
  (^Integer [^InMemoryLookupCache this]
    (-> this (.numWords))))

(defn total-number-of-docs
  "Deprecated.

  returns: the total number of docs in the corpus - `long`"
  (^Long [^InMemoryLookupCache this]
    (-> this (.totalNumberOfDocs))))

(defn equals
  "Deprecated.

  o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InMemoryLookupCache this ^java.lang.Object o]
    (-> this (.equals o))))

(defn total-word-occurrences
  "Deprecated.

  returns: the total number of word occurrences - `long`"
  (^Long [^InMemoryLookupCache this]
    (-> this (.totalWordOccurrences))))

(defn contains-word
  "Deprecated.

  word - the word to check for - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^InMemoryLookupCache this ^java.lang.String word]
    (-> this (.containsWord word))))

(defn word-at-index
  "Deprecated.

  index - the index of the word to get - `int`

  returns: the word at the given index - `java.lang.String`"
  (^java.lang.String [^InMemoryLookupCache this ^Integer index]
    (-> this (.wordAtIndex index))))

(defn tokens
  "Deprecated.

  returns: the tokens for this cache - `java.util.Collection<org.deeplearning4j.models.word2vec.VocabWord>`"
  (^java.util.Collection [^InMemoryLookupCache this]
    (-> this (.tokens))))

