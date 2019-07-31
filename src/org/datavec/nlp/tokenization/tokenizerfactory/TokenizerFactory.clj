(ns org.datavec.nlp.tokenization.tokenizerfactory.TokenizerFactory
  "Generates a tokenizer for a given string"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.tokenization.tokenizerfactory TokenizerFactory]))

(defn create
  "The tokenizer to createComplex

  to-tokenize - the string to createComplex the tokenizer with - `java.lang.String`

  returns: the new tokenizer - `org.datavec.nlp.tokenization.tokenizer.Tokenizer`"
  (^org.datavec.nlp.tokenization.tokenizer.Tokenizer [^TokenizerFactory this ^java.lang.String to-tokenize]
    (-> this (.create to-tokenize))))

(defn set-token-pre-processor
  "Sets a token pre processor to be used
  with every tokenizer

  pre-processor - the token pre processor to use - `org.datavec.nlp.tokenization.tokenizer.TokenPreProcess`"
  ([^TokenizerFactory this ^org.datavec.nlp.tokenization.tokenizer.TokenPreProcess pre-processor]
    (-> this (.setTokenPreProcessor pre-processor))))

