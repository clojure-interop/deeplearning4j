(ns org.datavec.nlp.vectorizer.AbstractTfidfVectorizer
  "Tf idf vectorizer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.vectorizer AbstractTfidfVectorizer]))

(defn ->abstract-tfidf-vectorizer
  "Constructor."
  (^AbstractTfidfVectorizer []
    (new AbstractTfidfVectorizer )))

(defn do-with-tokens
  "Description copied from class: TextVectorizer

  tokenizer - `org.datavec.nlp.tokenization.tokenizer.Tokenizer`"
  ([^AbstractTfidfVectorizer this ^org.datavec.nlp.tokenization.tokenizer.Tokenizer tokenizer]
    (-> this (.doWithTokens tokenizer))))

(defn create-tokenizer-factory
  "Description copied from class: TextVectorizer

  conf - the configuration to use - `org.datavec.api.conf.Configuration`

  returns: the tokenizer factory based on the configuration - `org.datavec.nlp.tokenization.tokenizerfactory.TokenizerFactory`"
  (^org.datavec.nlp.tokenization.tokenizerfactory.TokenizerFactory [^AbstractTfidfVectorizer this ^org.datavec.api.conf.Configuration conf]
    (-> this (.createTokenizerFactory conf))))

(defn create-vector
  "Description copied from interface: Vectorizer

  args - the arguments to create a vector with - `java.lang.Object[]`

  returns: the created vector - `VECTOR_TYPE`"
  ([^AbstractTfidfVectorizer this args]
    (-> this (.createVector args))))

(defn fit-transform
  "Description copied from interface: Vectorizer

  reader - `org.datavec.api.records.reader.RecordReader`

  returns: `VECTOR_TYPE`"
  ([^AbstractTfidfVectorizer this ^org.datavec.api.records.reader.RecordReader reader]
    (-> this (.fitTransform reader))))

(defn transform
  "Description copied from interface: Vectorizer

  record - the record to write - `org.datavec.api.records.Record`

  returns: `VECTOR_TYPE`"
  ([^AbstractTfidfVectorizer this ^org.datavec.api.records.Record record]
    (-> this (.transform record))))

