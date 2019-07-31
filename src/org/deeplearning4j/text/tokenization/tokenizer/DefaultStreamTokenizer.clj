(ns org.deeplearning4j.text.tokenization.tokenizer.DefaultStreamTokenizer
  "Tokenizer based on the StreamTokenizer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.tokenization.tokenizer DefaultStreamTokenizer]))

(defn ->default-stream-tokenizer
  "Constructor.

  is - `java.io.InputStream`"
  (^DefaultStreamTokenizer [^java.io.InputStream is]
    (new DefaultStreamTokenizer is)))

(defn has-more-tokens?
  "Checks, if any prebuffered tokens left, otherswise checks underlying stream

  returns: `boolean`"
  (^Boolean [^DefaultStreamTokenizer this]
    (-> this (.hasMoreTokens))))

(defn count-tokens
  "Returns number of tokens
  PLEASE NOTE: this method effectively preloads all tokens. So use it with caution, since on large streams it will consume big amount of memory

  returns: `int`"
  (^Integer [^DefaultStreamTokenizer this]
    (-> this (.countTokens))))

(defn next-token
  "This method returns next token from prebuffered list of tokens or underlying InputStream

  returns: next token as String - `java.lang.String`"
  (^java.lang.String [^DefaultStreamTokenizer this]
    (-> this (.nextToken))))

(defn get-tokens
  "Returns all tokens as list of Strings

  returns: List of tokens - `java.util.List<java.lang.String>`"
  (^java.util.List [^DefaultStreamTokenizer this]
    (-> this (.getTokens))))

(defn set-token-pre-processor
  "Description copied from interface: Tokenizer

  token-pre-processor - the token pre processor to set - `org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess`"
  ([^DefaultStreamTokenizer this ^org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess token-pre-processor]
    (-> this (.setTokenPreProcessor token-pre-processor))))

