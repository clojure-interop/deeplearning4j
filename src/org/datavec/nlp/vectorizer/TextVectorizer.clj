(ns org.datavec.nlp.vectorizer.TextVectorizer
  "Baseline text vectorizer that includes some common elements
 to text analysis such as the tokenizer factory"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.vectorizer TextVectorizer]))

(defn ->text-vectorizer
  "Constructor."
  (^TextVectorizer []
    (new TextVectorizer )))

(def *-min-word-frequency
  "Static Constant.

  type: java.lang.String"
  TextVectorizer/MIN_WORD_FREQUENCY)

(def *-stop-words
  "Static Constant.

  type: java.lang.String"
  TextVectorizer/STOP_WORDS)

(def *-tokenizer
  "Static Constant.

  type: java.lang.String"
  TextVectorizer/TOKENIZER)

(def *-vocab-cache
  "Static Constant.

  type: java.lang.String"
  TextVectorizer/VOCAB_CACHE)

(defn initialize
  "Description copied from interface: Vectorizer

  conf - the configuration to use - `org.datavec.api.conf.Configuration`"
  ([^TextVectorizer this ^org.datavec.api.conf.Configuration conf]
    (-> this (.initialize conf))))

(defn fit
  "Description copied from interface: Vectorizer

  reader - `org.datavec.api.records.reader.RecordReader`
  call-back - `org.datavec.api.vector.Vectorizer$RecordCallBack`"
  ([^TextVectorizer this ^org.datavec.api.records.reader.RecordReader reader ^org.datavec.api.vector.Vectorizer$RecordCallBack call-back]
    (-> this (.fit reader call-back)))
  ([^TextVectorizer this ^org.datavec.api.records.reader.RecordReader reader]
    (-> this (.fit reader))))

(defn do-with-tokens
  "Increment counts, add to collection,...

  tokenizer - `org.datavec.nlp.tokenization.tokenizer.Tokenizer`"
  ([^TextVectorizer this ^org.datavec.nlp.tokenization.tokenizer.Tokenizer tokenizer]
    (-> this (.doWithTokens tokenizer))))

(defn create-tokenizer-factory
  "Create tokenizer factory based on the configuration

  conf - the configuration to use - `org.datavec.api.conf.Configuration`

  returns: the tokenizer factory based on the configuration - `org.datavec.nlp.tokenization.tokenizerfactory.TokenizerFactory`"
  (^org.datavec.nlp.tokenization.tokenizerfactory.TokenizerFactory [^TextVectorizer this ^org.datavec.api.conf.Configuration conf]
    (-> this (.createTokenizerFactory conf))))

