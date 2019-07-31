(ns org.deeplearning4j.text.sentenceiterator.labelaware.LabelAwareFileSentenceIterator
  "Label aware sentence iterator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator.labelaware LabelAwareFileSentenceIterator]))

(defn ->label-aware-file-sentence-iterator
  "Constructor.

  Takes a single file or directory

  pre-processor - the sentence pre processor - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`
  file - the file or folder to iterate over - `java.io.File`"
  (^LabelAwareFileSentenceIterator [^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor ^java.io.File file]
    (new LabelAwareFileSentenceIterator pre-processor file))
  (^LabelAwareFileSentenceIterator [^java.io.File dir]
    (new LabelAwareFileSentenceIterator dir)))

(defn current-label
  "Description copied from interface: LabelAwareSentenceIterator

  returns: the label for nextSentence() - `java.lang.String`"
  (^java.lang.String [^LabelAwareFileSentenceIterator this]
    (-> this (.currentLabel))))

(defn current-labels
  "Description copied from interface: LabelAwareSentenceIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^LabelAwareFileSentenceIterator this]
    (-> this (.currentLabels))))

