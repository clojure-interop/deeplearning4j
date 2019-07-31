(ns org.deeplearning4j.text.sentenceiterator.labelaware.LabelAwareUimaSentenceIterator
  "Uima sentence iterator that is aware of the current file"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator.labelaware LabelAwareUimaSentenceIterator]))

(defn ->label-aware-uima-sentence-iterator
  "Constructor.

  pre-processor - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`
  path - `java.lang.String`
  resource - `org.deeplearning4j.text.uima.UimaResource`"
  (^LabelAwareUimaSentenceIterator [^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor ^java.lang.String path ^org.deeplearning4j.text.uima.UimaResource resource]
    (new LabelAwareUimaSentenceIterator pre-processor path resource))
  (^LabelAwareUimaSentenceIterator [^java.lang.String path ^org.apache.uima.analysis_engine.AnalysisEngine engine]
    (new LabelAwareUimaSentenceIterator path engine)))

(defn *create-with-path
  "Creates a uima sentence iterator with the given path

  path - the path to the root directory or file to read from - `java.lang.String`

  returns: the uima sentence iterator for the given root dir or file - `org.deeplearning4j.text.sentenceiterator.labelaware.LabelAwareSentenceIterator`

  throws: java.lang.Exception"
  (^org.deeplearning4j.text.sentenceiterator.labelaware.LabelAwareSentenceIterator [^java.lang.String path]
    (LabelAwareUimaSentenceIterator/createWithPath path)))

(defn current-label
  "Returns the current label for nextSentence()

  returns: the label for nextSentence() - `java.lang.String`"
  (^java.lang.String [^LabelAwareUimaSentenceIterator this]
    (-> this (.currentLabel))))

(defn current-labels
  "Description copied from interface: LabelAwareSentenceIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^LabelAwareUimaSentenceIterator this]
    (-> this (.currentLabels))))

