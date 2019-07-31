(ns org.deeplearning4j.text.tokenization.tokenizer.preprocessor.StemmingPreprocessor
  "This tokenizer preprocessor implements basic cleaning inherited from CommonPreprocessor  does english Porter stemming on tokens
 PLEASE NOTE: This preprocessor is thread-safe by using synchronized method"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.tokenization.tokenizer.preprocessor StemmingPreprocessor]))

(defn ->stemming-preprocessor
  "Constructor."
  (^StemmingPreprocessor []
    (new StemmingPreprocessor )))

(defn pre-process
  "Description copied from interface: TokenPreProcess

  token - the token to pre process - `java.lang.String`

  returns: the preprocessed token - `java.lang.String`"
  (^java.lang.String [^StemmingPreprocessor this ^java.lang.String token]
    (-> this (.preProcess token))))

