(ns org.deeplearning4j.text.tokenization.tokenizer.JapaneseTokenizer
  "A thin wrapper for Japanese Morphological Analyzer Kuromoji (ver.0.9.0),
 it tokenizes texts which is written in languages
 that words are not separated by whitespaces.
 In thenory, Kuromoji is a language-independent Morphological Analyzer library,
 so if you want to tokenize non-Japanese texts (Chinese, Korean etc.),
 you can do it with MeCab style dictionary for each languages."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.tokenization.tokenizer JapaneseTokenizer]))

(defn ->japanese-tokenizer
  "Constructor.

  Tokenize the string with Kuromoji, optionally using baseForms.
  Note: It is safe to create new instances from multiple threads.

  kuromoji - The kuromoji instance. - `com.atilika.kuromoji.ipadic.Tokenizer`
  to-tokenize - The string to tokenize. - `java.lang.String`
  use-base-form - normalize conjugations \"走った\" -> \"走る\" instead of \"走っ\" - `boolean`"
  (^JapaneseTokenizer [^com.atilika.kuromoji.ipadic.Tokenizer kuromoji ^java.lang.String to-tokenize ^Boolean use-base-form]
    (new JapaneseTokenizer kuromoji to-tokenize use-base-form)))

(defn has-more-tokens?
  "Description copied from interface: Tokenizer

  returns: whether there is anymore tokens
  to iterate over - `boolean`"
  (^Boolean [^JapaneseTokenizer this]
    (-> this (.hasMoreTokens))))

(defn count-tokens
  "Description copied from interface: Tokenizer

  returns: the number of tokens - `int`"
  (^Integer [^JapaneseTokenizer this]
    (-> this (.countTokens))))

(defn next-token
  "Description copied from interface: Tokenizer

  returns: the next token in the string if any - `java.lang.String`"
  (^java.lang.String [^JapaneseTokenizer this]
    (-> this (.nextToken))))

(defn get-tokens
  "Description copied from interface: Tokenizer

  returns: a list of all the tokens - `java.util.List<java.lang.String>`"
  (^java.util.List [^JapaneseTokenizer this]
    (-> this (.getTokens))))

(defn set-token-pre-processor
  "Description copied from interface: Tokenizer

  token-pre-processor - the token pre processor to set - `org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess`"
  ([^JapaneseTokenizer this ^org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess token-pre-processor]
    (-> this (.setTokenPreProcessor token-pre-processor))))

