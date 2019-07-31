(ns org.datavec.nlp.metadata.VocabCache
  "Track metadata about vocabs"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.metadata VocabCache]))

(defn increment-count
  "Increment count for a word

  word - the word to increment the count for - `java.lang.String`
  by - the amount to increment by - `double`"
  ([^VocabCache this ^java.lang.String word ^Double by]
    (-> this (.incrementCount word by)))
  ([^VocabCache this ^java.lang.String word]
    (-> this (.incrementCount word))))

(defn vocab-words
  "All of the vocab words (ordered)
  note that these are not all the possible tokens

  returns: the list of vocab words - `org.nd4j.util.Index`"
  (^org.nd4j.util.Index [^VocabCache this]
    (-> this (.vocabWords))))

(defn tfidf
  "Calculate the tfidf of the word given the document frequency

  word - the word to get frequency for - `java.lang.String`
  frequency - the frequency - `double`

  returns: the tfidf for a word - `double`"
  (^Double [^VocabCache this ^java.lang.String word ^Double frequency]
    (-> this (.tfidf word frequency))))

(defn idf
  "Number of documents word has occurred in

  word - the word to get the idf for - `java.lang.String`

  returns: `double`"
  (^Double [^VocabCache this ^java.lang.String word]
    (-> this (.idf word))))

(defn word-frequency
  "Get the word frequency for a word

  word - the word to get frequency for - `java.lang.String`

  returns: the frequency for a given word - `double`"
  (^Double [^VocabCache this ^java.lang.String word]
    (-> this (.wordFrequency word))))

(defn initialize
  "Configuration for initializing

  conf - the configuration to initialize with - `org.datavec.api.conf.Configuration`"
  ([^VocabCache this ^org.datavec.api.conf.Configuration conf]
    (-> this (.initialize conf))))

(defn min-word-frequency
  "The min word frequency
  needed to be included in the vocab
  (default 5)

  returns: the min word frequency to
  be included in the vocab - `int`"
  (^Integer [^VocabCache this]
    (-> this (.minWordFrequency))))

(defn increment-doc-count
  "Increment the document count for a particular word

  word - the word to increment the count for - `java.lang.String`
  by - the amount to increment by - `double`"
  ([^VocabCache this ^java.lang.String word ^Double by]
    (-> this (.incrementDocCount word by)))
  ([^VocabCache this ^java.lang.String word]
    (-> this (.incrementDocCount word))))

(defn num-docs
  "Number of documents

  returns: the number of documents - `double`"
  (^Double [^VocabCache this]
    (-> this (.numDocs))))

(defn increment-num-docs
  "Increment the number of documents

  by - `double`"
  ([^VocabCache this ^Double by]
    (-> this (.incrementNumDocs by))))

(defn word-at
  "Returns a word in the vocab at a particular index

  i - the index to get - `int`

  returns: the word at that index in the vocab - `java.lang.String`"
  (^java.lang.String [^VocabCache this ^Integer i]
    (-> this (.wordAt i))))

