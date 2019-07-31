(ns org.deeplearning4j.text.sentenceiterator.SentencePreProcessor
  "Sentence pre processor.
 Used for pre processing strings"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator SentencePreProcessor]))

(defn pre-process
  "Pre process a sentence

  sentence - the sentence to pre process - `java.lang.String`

  returns: the pre processed sentence - `java.lang.String`"
  (^java.lang.String [^SentencePreProcessor this ^java.lang.String sentence]
    (-> this (.preProcess sentence))))

