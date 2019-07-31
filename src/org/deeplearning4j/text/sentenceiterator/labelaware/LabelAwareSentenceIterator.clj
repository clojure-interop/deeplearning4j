(ns org.deeplearning4j.text.sentenceiterator.labelaware.LabelAwareSentenceIterator
  "SentenceIterator that is aware of its label. This is useful
 for creating datasets all at once or on the fly."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator.labelaware LabelAwareSentenceIterator]))

(defn current-label
  "Returns the current label for nextSentence()

  returns: the label for nextSentence() - `java.lang.String`"
  (^java.lang.String [^LabelAwareSentenceIterator this]
    (-> this (.currentLabel))))

(defn current-labels
  "For multi label problems

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^LabelAwareSentenceIterator this]
    (-> this (.currentLabels))))

