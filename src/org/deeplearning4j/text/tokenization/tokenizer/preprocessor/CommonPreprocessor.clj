(ns org.deeplearning4j.text.tokenization.tokenizer.preprocessor.CommonPreprocessor
  "A TokenPreProcess implementation that removes puncuation marks and lower-cases.

 Note that the implementation uses String#toLowerCase(String) and its behavior depends on the default locale."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.tokenization.tokenizer.preprocessor CommonPreprocessor]))

(defn ->common-preprocessor
  "Constructor."
  (^CommonPreprocessor []
    (new CommonPreprocessor )))

(defn pre-process
  "Description copied from interface: TokenPreProcess

  token - the token to pre process - `java.lang.String`

  returns: the preprocessed token - `java.lang.String`"
  (^java.lang.String [^CommonPreprocessor this ^java.lang.String token]
    (-> this (.preProcess token))))

