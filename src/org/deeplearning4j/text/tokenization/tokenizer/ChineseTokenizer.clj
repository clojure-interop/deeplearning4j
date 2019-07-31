(ns org.deeplearning4j.text.tokenization.tokenizer.ChineseTokenizer
  "The ansj_seg of the open source segmentation algorithm comes form github,the link: https://github.com/NLPchina/ansj_seg
 When the open source code that obeyed the Apache 2.0 license is reused, its latest commit ID is dedc45fdf85dfd2d4c691fb1f147d7cbf9a5d7fb
 and its copyright 2011-2016"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.tokenization.tokenizer ChineseTokenizer]))

(defn ->chinese-tokenizer
  "Constructor.

  to-tokenize - `java.lang.String`"
  (^ChineseTokenizer [^java.lang.String to-tokenize]
    (new ChineseTokenizer to-tokenize))
  (^ChineseTokenizer []
    (new ChineseTokenizer )))

(defn has-more-tokens?
  "Description copied from interface: Tokenizer

  returns: whether there is anymore tokens
  to iterate over - `boolean`"
  (^Boolean [^ChineseTokenizer this]
    (-> this (.hasMoreTokens))))

(defn count-tokens
  "Description copied from interface: Tokenizer

  returns: the number of tokens - `int`"
  (^Integer [^ChineseTokenizer this]
    (-> this (.countTokens))))

(defn next-token
  "Description copied from interface: Tokenizer

  returns: the next token in the string if any - `java.lang.String`"
  (^java.lang.String [^ChineseTokenizer this]
    (-> this (.nextToken))))

(defn get-tokens
  "Description copied from interface: Tokenizer

  returns: a list of all the tokens - `java.util.List<java.lang.String>`"
  (^java.util.List [^ChineseTokenizer this]
    (-> this (.getTokens))))

(defn set-token-pre-processor
  "Description copied from interface: Tokenizer

  token-pre-processor - the token pre processor to set - `org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess`"
  ([^ChineseTokenizer this ^org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess token-pre-processor]
    (-> this (.setTokenPreProcessor token-pre-processor))))

