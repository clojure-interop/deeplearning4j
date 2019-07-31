(ns org.deeplearning4j.text.tokenization.tokenizer.preprocessor.LowCasePreProcessor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.tokenization.tokenizer.preprocessor LowCasePreProcessor]))

(defn ->low-case-pre-processor
  "Constructor."
  (^LowCasePreProcessor []
    (new LowCasePreProcessor )))

(defn pre-process
  "Pre process a token

  token - the token to pre process - `java.lang.String`

  returns: the preprocessed token - `java.lang.String`"
  (^java.lang.String [^LowCasePreProcessor this ^java.lang.String token]
    (-> this (.preProcess token))))

