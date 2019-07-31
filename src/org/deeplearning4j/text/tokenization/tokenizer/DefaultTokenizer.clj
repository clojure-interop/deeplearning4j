(ns org.deeplearning4j.text.tokenization.tokenizer.DefaultTokenizer
  "Default tokenizer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.tokenization.tokenizer DefaultTokenizer]))

(defn ->default-tokenizer
  "Constructor.

  tokens - `java.lang.String`"
  (^DefaultTokenizer [^java.lang.String tokens]
    (new DefaultTokenizer tokens)))

(defn has-more-tokens?
  "Description copied from interface: Tokenizer

  returns: whether there is anymore tokens
  to iterate over - `boolean`"
  (^Boolean [^DefaultTokenizer this]
    (-> this (.hasMoreTokens))))

(defn count-tokens
  "Description copied from interface: Tokenizer

  returns: the number of tokens - `int`"
  (^Integer [^DefaultTokenizer this]
    (-> this (.countTokens))))

(defn next-token
  "Description copied from interface: Tokenizer

  returns: the next token in the string if any - `java.lang.String`"
  (^java.lang.String [^DefaultTokenizer this]
    (-> this (.nextToken))))

(defn get-tokens
  "Description copied from interface: Tokenizer

  returns: a list of all the tokens - `java.util.List<java.lang.String>`"
  (^java.util.List [^DefaultTokenizer this]
    (-> this (.getTokens))))

(defn set-token-pre-processor
  "Description copied from interface: Tokenizer

  token-pre-processor - the token pre processor to set - `org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess`"
  ([^DefaultTokenizer this ^org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess token-pre-processor]
    (-> this (.setTokenPreProcessor token-pre-processor))))

