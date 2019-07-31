(ns org.datavec.nlp.metadata.DefaultVocabCache
  "Vocab cache used for storing information
 about vocab"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.metadata DefaultVocabCache]))

(defn ->default-vocab-cache
  "Constructor.

  Instantiate with a given min word frequency

  min-word-frequency - `int`"
  (^DefaultVocabCache [^Integer min-word-frequency]
    (new DefaultVocabCache min-word-frequency))
  (^DefaultVocabCache []
    (new DefaultVocabCache )))

(defn set-min-word-frequency
  "min-word-frequency - `int`"
  ([^DefaultVocabCache this ^Integer min-word-frequency]
    (-> this (.setMinWordFrequency min-word-frequency))))

(defn increment-count
  "Description copied from interface: VocabCache

  word - the word to increment the count for - `java.lang.String`
  by - the amount to increment by - `double`"
  ([^DefaultVocabCache this ^java.lang.String word ^Double by]
    (-> this (.incrementCount word by)))
  ([^DefaultVocabCache this ^java.lang.String word]
    (-> this (.incrementCount word))))

(defn vocab-words
  "Description copied from interface: VocabCache

  returns: the list of vocab words - `org.nd4j.util.Index`"
  (^org.nd4j.util.Index [^DefaultVocabCache this]
    (-> this (.vocabWords))))

(defn tfidf
  "Description copied from interface: VocabCache

  word - the word to get frequency for - `java.lang.String`
  frequency - the frequency - `double`

  returns: the tfidf for a word - `double`"
  (^Double [^DefaultVocabCache this ^java.lang.String word ^Double frequency]
    (-> this (.tfidf word frequency))))

(defn idf
  "Description copied from interface: VocabCache

  word - the word to get the idf for - `java.lang.String`

  returns: `double`"
  (^Double [^DefaultVocabCache this ^java.lang.String word]
    (-> this (.idf word))))

(defn get-min-word-frequency
  "returns: `int`"
  (^Integer [^DefaultVocabCache this]
    (-> this (.getMinWordFrequency))))

(defn word-frequency
  "Description copied from interface: VocabCache

  word - the word to get frequency for - `java.lang.String`

  returns: the frequency for a given word - `double`"
  (^Double [^DefaultVocabCache this ^java.lang.String word]
    (-> this (.wordFrequency word))))

(defn initialize
  "Description copied from interface: VocabCache

  conf - the configuration to initialize with - `org.datavec.api.conf.Configuration`"
  ([^DefaultVocabCache this ^org.datavec.api.conf.Configuration conf]
    (-> this (.initialize conf))))

(defn min-word-frequency
  "Description copied from interface: VocabCache

  returns: the min word frequency to
  be included in the vocab - `int`"
  (^Integer [^DefaultVocabCache this]
    (-> this (.minWordFrequency))))

(defn increment-doc-count
  "Description copied from interface: VocabCache

  word - the word to increment the count for - `java.lang.String`
  by - the amount to increment by - `double`"
  ([^DefaultVocabCache this ^java.lang.String word ^Double by]
    (-> this (.incrementDocCount word by)))
  ([^DefaultVocabCache this ^java.lang.String word]
    (-> this (.incrementDocCount word))))

(defn num-docs
  "Description copied from interface: VocabCache

  returns: the number of documents - `double`"
  (^Double [^DefaultVocabCache this]
    (-> this (.numDocs))))

(defn increment-num-docs
  "Description copied from interface: VocabCache

  by - `double`"
  ([^DefaultVocabCache this ^Double by]
    (-> this (.incrementNumDocs by))))

(defn word-at
  "Description copied from interface: VocabCache

  i - the index to get - `int`

  returns: the word at that index in the vocab - `java.lang.String`"
  (^java.lang.String [^DefaultVocabCache this ^Integer i]
    (-> this (.wordAt i))))

