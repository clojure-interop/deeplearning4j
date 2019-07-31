(ns org.deeplearning4j.models.word2vec.wordstore.inmemory.AbstractCache
  "This is generic VocabCache implementation designed as abstract SequenceElements vocabulary"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec.wordstore.inmemory AbstractCache]))

(defn ->abstract-cache
  "Constructor."
  (^AbstractCache []
    (new AbstractCache )))

(defn increment-total-doc-count
  "Increment total number of documents observed by specified value

  by - the number to increment by - `long`"
  ([^AbstractCache this ^Long by]
    (-> this (.incrementTotalDocCount by)))
  ([^AbstractCache this]
    (-> this (.incrementTotalDocCount))))

(defn vocab-exists
  "Returns true, if number of elements in vocabulary > 0, false otherwise

  returns: `boolean`"
  (^Boolean [^AbstractCache this]
    (-> this (.vocabExists))))

(defn element-at-index
  "Returns SequenceElement at specified index

  index - `int`

  returns: `T`"
  ([^AbstractCache this ^Integer index]
    (-> this (.elementAtIndex index))))

(defn set-total-doc-count
  "This method allows to set total number of documents

  by - `long`"
  ([^AbstractCache this ^Long by]
    (-> this (.setTotalDocCount by))))

(defn word-for
  "Returns SequenceElement for specified label

  label - to fetch element for - `java.lang.String`

  returns: `T`"
  ([^AbstractCache this ^java.lang.String label]
    (-> this (.wordFor label))))

(defn add-token
  "This method adds specified SequenceElement to vocabulary

  element - the word to add - `T`"
  ([^AbstractCache this element]
    (-> this (.addToken element))))

(defn set-total-word-occurences
  "value - `long`"
  ([^AbstractCache this ^Long value]
    (-> this (.setTotalWordOccurences value))))

(defn vocab-words
  "Returns collection of SequenceElements stored in this vocabulary

  returns: `java.util.Collection<T>`"
  (^java.util.Collection [^AbstractCache this]
    (-> this (.vocabWords))))

(defn update-words-occurrences
  "Description copied from interface: VocabCache"
  ([^AbstractCache this]
    (-> this (.updateWordsOccurrences))))

(defn add-word-to-index
  "This method allows to insert specified label to specified Huffman tree position.
  CAUTION: Never use this, unless you 100% sure what are you doing.

  index - `int`
  label - `java.lang.String`"
  ([^AbstractCache this ^Integer index ^java.lang.String label]
    (-> this (.addWordToIndex index label))))

(defn increment-word-count
  "Increment frequency for specified label by specified value

  word - the word to increment the count for - `java.lang.String`
  increment - the amount to increment by - `int`"
  ([^AbstractCache this ^java.lang.String word ^Integer increment]
    (-> this (.incrementWordCount word increment)))
  ([^AbstractCache this ^java.lang.String word]
    (-> this (.incrementWordCount word))))

(defn words
  "Returns collection of labels available in this vocabulary

  returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^AbstractCache this]
    (-> this (.words))))

(defn word-frequency
  "Returns the SequenceElement's frequency over training corpus

  word - the word to retrieve the occurrence frequency for - `java.lang.String`

  returns: `int`"
  (^Integer [^AbstractCache this ^java.lang.String word]
    (-> this (.wordFrequency word))))

(defn remove-element
  "Description copied from interface: VocabCache

  label - label of the element to be removed - `java.lang.String`"
  ([^AbstractCache this ^java.lang.String label]
    (-> this (.removeElement label))))

(defn doc-appeared-in
  "Returns number of documents (if applicable) the label was observed in.

  word - the number of documents the word appeared in - `java.lang.String`

  returns: `int`"
  (^Integer [^AbstractCache this ^java.lang.String word]
    (-> this (.docAppearedIn word))))

(defn set-count-for-doc
  "Set exact number of observed documents that contain specified word
  Please note: this method is NOT thread-safe

  word - the word to set the count for - `java.lang.String`
  count - the count of the word - `long`"
  ([^AbstractCache this ^java.lang.String word ^Long count]
    (-> this (.setCountForDoc word count))))

(defn load-vocab
  "Deserialize vocabulary from specified path"
  ([^AbstractCache this]
    (-> this (.loadVocab))))

(defn save-vocab
  "Serialize vocabulary to specified path"
  ([^AbstractCache this]
    (-> this (.saveVocab))))

(defn import-vocabulary
  "This method imports all elements from VocabCache passed as argument
  If element already exists,

  vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`"
  ([^AbstractCache this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache]
    (-> this (.importVocabulary vocab-cache))))

(defn increment-doc-count
  "Increment number of documents the label was observed in
  Please note: this method is NOT thread-safe

  word - the word to increment by - `java.lang.String`
  how-much - `long`"
  ([^AbstractCache this ^java.lang.String word ^Long how-much]
    (-> this (.incrementDocCount word how-much))))

(defn has-token?
  "Checks, if specified label already exists in vocabulary. The same as containsWord() method.

  label - the token to test - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^AbstractCache this ^java.lang.String label]
    (-> this (.hasToken label))))

(defn put-vocab-word
  "Deprecated.

  word - the word to add to the vocab - `java.lang.String`"
  ([^AbstractCache this ^java.lang.String word]
    (-> this (.putVocabWord word))))

(defn token-for
  "Returns SequenceElement for specified label. The same as wordFor() method.

  label - the label to get the token for - `java.lang.String`

  returns: `T`"
  ([^AbstractCache this ^java.lang.String label]
    (-> this (.tokenFor label))))

(defn index-of
  "Returns Huffman index for specified label

  label - the label to get index for - `java.lang.String`

  returns: >=0 if label exists, -1 if Huffman tree wasn't built yet, -2 if specified label wasn't found - `int`"
  (^Integer [^AbstractCache this ^java.lang.String label]
    (-> this (.indexOf label))))

(defn num-words
  "Returns number of elements in this vocabulary

  returns: `int`"
  (^Integer [^AbstractCache this]
    (-> this (.numWords))))

(defn total-number-of-docs
  "Returns total number of documents observed (if applicable)

  returns: `long`"
  (^Long [^AbstractCache this]
    (-> this (.totalNumberOfDocs))))

(defn total-word-occurrences
  "Returns total number of elements observed

  returns: `long`"
  (^Long [^AbstractCache this]
    (-> this (.totalWordOccurrences))))

(defn contains-word
  "Checks, if specified label exists in vocabulary

  word - the word to check for - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^AbstractCache this ^java.lang.String word]
    (-> this (.containsWord word))))

(defn word-at-index
  "Returns the label of the element at specified Huffman index

  index - the index of the word to get - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^AbstractCache this ^Integer index]
    (-> this (.wordAtIndex index))))

(defn contains-element
  "Checks, if specified element exists in vocabulary

  element - `T`

  returns: `boolean`"
  (^Boolean [^AbstractCache this element]
    (-> this (.containsElement element))))

(defn tokens
  "Returns collection of SequenceElements from this vocabulary. The same as vocabWords() method

  returns: collection of SequenceElements - `java.util.Collection<T>`"
  (^java.util.Collection [^AbstractCache this]
    (-> this (.tokens))))

