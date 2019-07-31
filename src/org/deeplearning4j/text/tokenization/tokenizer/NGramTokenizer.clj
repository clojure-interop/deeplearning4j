(ns org.deeplearning4j.text.tokenization.tokenizer.NGramTokenizer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.tokenization.tokenizer NGramTokenizer]))

(defn ->n-gram-tokenizer
  "Constructor.

  tokenizer - `org.deeplearning4j.text.tokenization.tokenizer.Tokenizer`
  min-n - `java.lang.Integer`
  max-n - `java.lang.Integer`"
  (^NGramTokenizer [^org.deeplearning4j.text.tokenization.tokenizer.Tokenizer tokenizer ^java.lang.Integer min-n ^java.lang.Integer max-n]
    (new NGramTokenizer tokenizer min-n max-n)))

(defn has-more-tokens?
  "Description copied from interface: Tokenizer

  returns: whether there is anymore tokens
  to iterate over - `boolean`"
  (^Boolean [^NGramTokenizer this]
    (-> this (.hasMoreTokens))))

(defn count-tokens
  "Description copied from interface: Tokenizer

  returns: the number of tokens - `int`"
  (^Integer [^NGramTokenizer this]
    (-> this (.countTokens))))

(defn next-token
  "Description copied from interface: Tokenizer

  returns: the next token in the string if any - `java.lang.String`"
  (^java.lang.String [^NGramTokenizer this]
    (-> this (.nextToken))))

(defn get-tokens
  "Description copied from interface: Tokenizer

  returns: a list of all the tokens - `java.util.List<java.lang.String>`"
  (^java.util.List [^NGramTokenizer this]
    (-> this (.getTokens))))

(defn set-token-pre-processor
  "Description copied from interface: Tokenizer

  token-pre-processor - the token pre processor to set - `org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess`"
  ([^NGramTokenizer this ^org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess token-pre-processor]
    (-> this (.setTokenPreProcessor token-pre-processor))))

