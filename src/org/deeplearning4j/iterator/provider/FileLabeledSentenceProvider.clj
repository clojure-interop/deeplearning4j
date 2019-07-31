(ns org.deeplearning4j.iterator.provider.FileLabeledSentenceProvider
  "Iterate over a set of sentences/documents, where the sentences are to be loaded (as required) from the provided files."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.iterator.provider FileLabeledSentenceProvider]))

(defn ->file-labeled-sentence-provider
  "Constructor.

  files-by-label - Key: label. Value: list of files for that label - `java.util.Map`
  rng - Random number generator. May be null. - `java.util.Random`"
  (^FileLabeledSentenceProvider [^java.util.Map files-by-label ^java.util.Random rng]
    (new FileLabeledSentenceProvider files-by-label rng))
  (^FileLabeledSentenceProvider [^java.util.Map files-by-label]
    (new FileLabeledSentenceProvider files-by-label)))

(defn has-next?
  "Description copied from interface: LabeledSentenceProvider

  returns: `boolean`"
  (^Boolean [^FileLabeledSentenceProvider this]
    (-> this (.hasNext))))

(defn next-sentence
  "returns: Pair: sentence/document text and label - `org.nd4j.linalg.primitives.Pair<java.lang.String,java.lang.String>`"
  (^org.nd4j.linalg.primitives.Pair [^FileLabeledSentenceProvider this]
    (-> this (.nextSentence))))

(defn reset
  "Description copied from interface: LabeledSentenceProvider"
  ([^FileLabeledSentenceProvider this]
    (-> this (.reset))))

(defn total-num-sentences
  "Description copied from interface: LabeledSentenceProvider

  returns: `int`"
  (^Integer [^FileLabeledSentenceProvider this]
    (-> this (.totalNumSentences))))

(defn all-labels
  "Description copied from interface: LabeledSentenceProvider

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^FileLabeledSentenceProvider this]
    (-> this (.allLabels))))

(defn num-label-classes
  "Description copied from interface: LabeledSentenceProvider

  returns: `int`"
  (^Integer [^FileLabeledSentenceProvider this]
    (-> this (.numLabelClasses))))

