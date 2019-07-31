(ns org.deeplearning4j.text.tokenization.tokenizer.preprocessor.CustomStemmingPreprocessor
  "This is StemmingPreprocessor compatible with different StemmingProcessors defined as lucene/tartarus SnowballProgram
 such as: RussianStemmer, DutchStemmer, FrenchStemmer etc.

 Note that CommonPreprocessor#preProcess(String) is first applied (i.e. punctuation marks are removed and and lower-cased), then the stemmer is applied.

 This preprocessor is synchronized, thus thread-safe."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.tokenization.tokenizer.preprocessor CustomStemmingPreprocessor]))

(defn ->custom-stemming-preprocessor
  "Constructor.

  stemmer - `org.tartarus.snowball.SnowballProgram`"
  (^CustomStemmingPreprocessor [^org.tartarus.snowball.SnowballProgram stemmer]
    (new CustomStemmingPreprocessor stemmer)))

(defn pre-process
  "Description copied from interface: TokenPreProcess

  token - the token to pre process - `java.lang.String`

  returns: the preprocessed token - `java.lang.String`"
  (^java.lang.String [^CustomStemmingPreprocessor this ^java.lang.String token]
    (-> this (.preProcess token))))

