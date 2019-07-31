(ns org.datavec.nlp.tokenization.tokenizerfactory.DefaultTokenizerFactory
  "Default tokenizer based on string tokenizer or stream tokenizer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.tokenization.tokenizerfactory DefaultTokenizerFactory]))

(defn ->default-tokenizer-factory
  "Constructor."
  (^DefaultTokenizerFactory []
    (new DefaultTokenizerFactory )))

(defn create
  "Description copied from interface: TokenizerFactory

  to-tokenize - the string to createComplex the tokenizer with - `java.lang.String`

  returns: the new tokenizer - `org.datavec.nlp.tokenization.tokenizer.Tokenizer`"
  (^org.datavec.nlp.tokenization.tokenizer.Tokenizer [^DefaultTokenizerFactory this ^java.lang.String to-tokenize]
    (-> this (.create to-tokenize))))

(defn set-token-pre-processor
  "Description copied from interface: TokenizerFactory

  pre-processor - the token pre processor to use - `org.datavec.nlp.tokenization.tokenizer.TokenPreProcess`"
  ([^DefaultTokenizerFactory this ^org.datavec.nlp.tokenization.tokenizer.TokenPreProcess pre-processor]
    (-> this (.setTokenPreProcessor pre-processor))))

