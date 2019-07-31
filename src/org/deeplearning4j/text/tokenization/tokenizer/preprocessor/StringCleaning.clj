(ns org.deeplearning4j.text.tokenization.tokenizer.preprocessor.StringCleaning
  "Various string cleaning utils"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.tokenization.tokenizer.preprocessor StringCleaning]))

(defn *strip-punct
  "Removes ASCII punctuation marks, which are: 0123456789.:,\"'()[]|/?!;

  base - the base string - `java.lang.String`

  returns: the cleaned string - `java.lang.String`"
  (^java.lang.String [^java.lang.String base]
    (StringCleaning/stripPunct base)))

