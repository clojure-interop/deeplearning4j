(ns org.deeplearning4j.text.tokenization.tokenizer.KoreanTokenizer
  "Created by kepricon on 16. 10. 20.
 KoreanTokenizer using KoreanTwitterText (https://github.com/twitter/twitter-korean-text)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.tokenization.tokenizer KoreanTokenizer]))

(defn ->korean-tokenizer
  "Constructor.

  to-tokenize - `java.lang.String`"
  (^KoreanTokenizer [^java.lang.String to-tokenize]
    (new KoreanTokenizer to-tokenize)))

(defn has-more-tokens?
  "Description copied from interface: Tokenizer

  returns: whether there is anymore tokens
  to iterate over - `boolean`"
  (^Boolean [^KoreanTokenizer this]
    (-> this (.hasMoreTokens))))

(defn count-tokens
  "Description copied from interface: Tokenizer

  returns: the number of tokens - `int`"
  (^Integer [^KoreanTokenizer this]
    (-> this (.countTokens))))

(defn next-token
  "Description copied from interface: Tokenizer

  returns: the next token in the string if any - `java.lang.String`"
  (^java.lang.String [^KoreanTokenizer this]
    (-> this (.nextToken))))

(defn get-tokens
  "Description copied from interface: Tokenizer

  returns: a list of all the tokens - `java.util.List<java.lang.String>`"
  (^java.util.List [^KoreanTokenizer this]
    (-> this (.getTokens))))

(defn set-token-pre-processor
  "Description copied from interface: Tokenizer

  token-pre-process - the token pre processor to set - `org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess`"
  ([^KoreanTokenizer this ^org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess token-pre-process]
    (-> this (.setTokenPreProcessor token-pre-process))))

