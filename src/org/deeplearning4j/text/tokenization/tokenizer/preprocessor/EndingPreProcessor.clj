(ns org.deeplearning4j.text.tokenization.tokenizer.preprocessor.EndingPreProcessor
  "Gets rid of endings:
 ed,ing, ly, s, ."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.tokenization.tokenizer.preprocessor EndingPreProcessor]))

(defn ->ending-pre-processor
  "Constructor."
  (^EndingPreProcessor []
    (new EndingPreProcessor )))

(defn pre-process
  "Description copied from interface: TokenPreProcess

  token - the token to pre process - `java.lang.String`

  returns: the preprocessed token - `java.lang.String`"
  (^java.lang.String [^EndingPreProcessor this ^java.lang.String token]
    (-> this (.preProcess token))))

