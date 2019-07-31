(ns org.deeplearning4j.text.sentenceiterator.UimaSentenceIterator
  "Iterates over and returns sentences
 based on the passed in analysis engine"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator UimaSentenceIterator]))

(defn ->uima-sentence-iterator
  "Constructor.

  pre-processor - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`
  path - `java.lang.String`
  resource - `org.deeplearning4j.text.uima.UimaResource`"
  (^UimaSentenceIterator [^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor ^java.lang.String path ^org.deeplearning4j.text.uima.UimaResource resource]
    (new UimaSentenceIterator pre-processor path resource))
  (^UimaSentenceIterator [^java.lang.String path ^org.deeplearning4j.text.uima.UimaResource resource]
    (new UimaSentenceIterator path resource)))

(defn *create-with-path
  "Creates a uima sentence iterator with the given path

  path - the path to the root directory or file to read from - `java.lang.String`

  returns: the uima sentence iterator for the given root dir or file - `org.deeplearning4j.text.sentenceiterator.SentenceIterator`

  throws: java.lang.Exception"
  (^org.deeplearning4j.text.sentenceiterator.SentenceIterator [^java.lang.String path]
    (UimaSentenceIterator/createWithPath path)))

(defn *segmenter
  "Return a sentence segmenter

  returns: a sentence segmenter - `org.apache.uima.analysis_engine.AnalysisEngine`"
  (^org.apache.uima.analysis_engine.AnalysisEngine []
    (UimaSentenceIterator/segmenter )))

(defn next-sentence
  "Description copied from interface: SentenceIterator

  returns: the next sentence in the iterator - `java.lang.String`"
  (^java.lang.String [^UimaSentenceIterator this]
    (-> this (.nextSentence))))

(defn get-resource
  "returns: `org.deeplearning4j.text.uima.UimaResource`"
  (^org.deeplearning4j.text.uima.UimaResource [^UimaSentenceIterator this]
    (-> this (.getResource))))

(defn has-next?
  "Description copied from interface: SentenceIterator

  returns: whether there's anymore sentences left - `boolean`"
  (^Boolean [^UimaSentenceIterator this]
    (-> this (.hasNext))))

(defn reset
  "Description copied from interface: SentenceIterator"
  ([^UimaSentenceIterator this]
    (-> this (.reset))))

