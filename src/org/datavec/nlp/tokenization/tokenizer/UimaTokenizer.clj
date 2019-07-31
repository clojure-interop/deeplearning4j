(ns org.datavec.nlp.tokenization.tokenizer.UimaTokenizer
  "Tokenizer based on the passed in analysis engine"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.tokenization.tokenizer UimaTokenizer]))

(defn ->uima-tokenizer
  "Constructor.

  tokens - `java.lang.String`
  resource - `org.datavec.nlp.uima.UimaResource`
  check-for-label - `boolean`"
  (^UimaTokenizer [^java.lang.String tokens ^org.datavec.nlp.uima.UimaResource resource ^Boolean check-for-label]
    (new UimaTokenizer tokens resource check-for-label)))

(defn has-more-tokens?
  "Description copied from interface: Tokenizer

  returns: whether there is anymore tokens
  to iterate over - `boolean`"
  (^Boolean [^UimaTokenizer this]
    (-> this (.hasMoreTokens))))

(defn count-tokens
  "Description copied from interface: Tokenizer

  returns: the number of tokens - `int`"
  (^Integer [^UimaTokenizer this]
    (-> this (.countTokens))))

(defn next-token
  "Description copied from interface: Tokenizer

  returns: the next token in the string if any - `java.lang.String`"
  (^java.lang.String [^UimaTokenizer this]
    (-> this (.nextToken))))

(defn get-tokens
  "Description copied from interface: Tokenizer

  returns: a list of all the tokens - `java.util.List<java.lang.String>`"
  (^java.util.List [^UimaTokenizer this]
    (-> this (.getTokens))))

(defn set-token-pre-processor
  "Description copied from interface: Tokenizer

  token-pre-processor - the token pre processor to set - `org.datavec.nlp.tokenization.tokenizer.TokenPreProcess`"
  ([^UimaTokenizer this ^org.datavec.nlp.tokenization.tokenizer.TokenPreProcess token-pre-processor]
    (-> this (.setTokenPreProcessor token-pre-processor))))

