(ns org.datavec.nlp.tokenization.tokenizer.DefaultStreamTokenizer
  "Tokenizer based on the StreamTokenizer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.tokenization.tokenizer DefaultStreamTokenizer]))

(defn ->default-stream-tokenizer
  "Constructor.

  is - `java.io.InputStream`"
  (^DefaultStreamTokenizer [^java.io.InputStream is]
    (new DefaultStreamTokenizer is)))

(defn has-more-tokens?
  "Description copied from interface: Tokenizer

  returns: whether there is anymore tokens
  to iterate over - `boolean`"
  (^Boolean [^DefaultStreamTokenizer this]
    (-> this (.hasMoreTokens))))

(defn count-tokens
  "Description copied from interface: Tokenizer

  returns: the number of tokens - `int`"
  (^Integer [^DefaultStreamTokenizer this]
    (-> this (.countTokens))))

(defn next-token
  "Description copied from interface: Tokenizer

  returns: the next token in the string if any - `java.lang.String`"
  (^java.lang.String [^DefaultStreamTokenizer this]
    (-> this (.nextToken))))

(defn get-tokens
  "Description copied from interface: Tokenizer

  returns: a list of all the tokens - `java.util.List<java.lang.String>`"
  (^java.util.List [^DefaultStreamTokenizer this]
    (-> this (.getTokens))))

(defn set-token-pre-processor
  "Description copied from interface: Tokenizer

  token-pre-processor - the token pre processor to set - `org.datavec.nlp.tokenization.tokenizer.TokenPreProcess`"
  ([^DefaultStreamTokenizer this ^org.datavec.nlp.tokenization.tokenizer.TokenPreProcess token-pre-processor]
    (-> this (.setTokenPreProcessor token-pre-processor))))

