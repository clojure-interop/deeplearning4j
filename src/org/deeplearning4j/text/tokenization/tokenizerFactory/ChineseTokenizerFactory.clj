(ns org.deeplearning4j.text.tokenization.tokenizerFactory.ChineseTokenizerFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.tokenization.tokenizerFactory ChineseTokenizerFactory]))

(defn ->chinese-tokenizer-factory
  "Constructor."
  (^ChineseTokenizerFactory []
    (new ChineseTokenizerFactory )))

(defn create
  "Description copied from interface: TokenizerFactory

  to-tokenize - the string to createComplex the tokenizer with - `java.lang.String`

  returns: the new tokenizer - `org.deeplearning4j.text.tokenization.tokenizer.Tokenizer`"
  (^org.deeplearning4j.text.tokenization.tokenizer.Tokenizer [^ChineseTokenizerFactory this ^java.lang.String to-tokenize]
    (-> this (.create to-tokenize))))

(defn set-token-pre-processor
  "Description copied from interface: TokenizerFactory

  token-pre-process - the token pre processor to use - `org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess`"
  ([^ChineseTokenizerFactory this ^org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess token-pre-process]
    (-> this (.setTokenPreProcessor token-pre-process))))

(defn get-token-pre-processor
  "Description copied from interface: TokenizerFactory

  returns: TokenPreProcessor instance, or null if no preprocessor was defined - `org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess`"
  (^org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess [^ChineseTokenizerFactory this]
    (-> this (.getTokenPreProcessor))))

