(ns org.deeplearning4j.text.tokenization.tokenizer.preprocessor.EmbeddedStemmingPreprocessor
  "This tokenizer preprocessor uses given preprocessor  does english Porter stemming on tokens on top of it"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.tokenization.tokenizer.preprocessor EmbeddedStemmingPreprocessor]))

(defn ->embedded-stemming-preprocessor
  "Constructor.

  pre-process - `org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess`"
  (^EmbeddedStemmingPreprocessor [^org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess pre-process]
    (new EmbeddedStemmingPreprocessor pre-process)))

(defn pre-process
  "Description copied from interface: TokenPreProcess

  token - the token to pre process - `java.lang.String`

  returns: the preprocessed token - `java.lang.String`"
  (^java.lang.String [^EmbeddedStemmingPreprocessor this ^java.lang.String token]
    (-> this (.preProcess token))))

