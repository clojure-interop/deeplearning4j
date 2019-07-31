(ns org.deeplearning4j.text.tokenization.tokenizer.Tokenizer
  "A representation of a tokenizer.
 Different applications may require
 different kind of tokenization (say rules based vs more formal NLP approaches)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.tokenization.tokenizer Tokenizer]))

(defn has-more-tokens?
  "An iterator for tracking whether
  more tokens are left in the iterator not

  returns: whether there is anymore tokens
  to iterate over - `boolean`"
  (^Boolean [^Tokenizer this]
    (-> this (.hasMoreTokens))))

(defn count-tokens
  "The number of tokens in the tokenizer

  returns: the number of tokens - `int`"
  (^Integer [^Tokenizer this]
    (-> this (.countTokens))))

(defn next-token
  "The next token (word usually) in the string

  returns: the next token in the string if any - `java.lang.String`"
  (^java.lang.String [^Tokenizer this]
    (-> this (.nextToken))))

(defn get-tokens
  "Returns a list of all the tokens

  returns: a list of all the tokens - `java.util.List<java.lang.String>`"
  (^java.util.List [^Tokenizer this]
    (-> this (.getTokens))))

(defn set-token-pre-processor
  "Set the token pre process

  token-pre-processor - the token pre processor to set - `org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess`"
  ([^Tokenizer this ^org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess token-pre-processor]
    (-> this (.setTokenPreProcessor token-pre-processor))))

