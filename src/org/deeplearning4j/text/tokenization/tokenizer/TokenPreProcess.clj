(ns org.deeplearning4j.text.tokenization.tokenizer.TokenPreProcess
  "Token preprocessing"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.tokenization.tokenizer TokenPreProcess]))

(defn pre-process
  "Pre process a token

  token - the token to pre process - `java.lang.String`

  returns: the preprocessed token - `java.lang.String`"
  (^java.lang.String [^TokenPreProcess this ^java.lang.String token]
    (-> this (.preProcess token))))

