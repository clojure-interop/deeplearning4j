(ns org.deeplearning4j.iterator.provider.LabelAwareConverter
  "Simple class for conversion between LabelAwareIterator -> LabeledSentenceProvider for neural nets.
 Since we already have converters for all other classes - this single converter allows us to accept all possible iterators"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.iterator.provider LabelAwareConverter]))

(defn ->label-aware-converter
  "Constructor.

  iterator - `org.deeplearning4j.text.documentiterator.LabelAwareIterator`
  labels - `java.util.List`"
  (^LabelAwareConverter [^org.deeplearning4j.text.documentiterator.LabelAwareIterator iterator ^java.util.List labels]
    (new LabelAwareConverter iterator labels)))

(defn has-next?
  "Description copied from interface: LabeledSentenceProvider

  returns: `boolean`"
  (^Boolean [^LabelAwareConverter this]
    (-> this (.hasNext))))

(defn next-sentence
  "returns: Pair: sentence/document text and label - `org.nd4j.linalg.primitives.Pair<java.lang.String,java.lang.String>`"
  (^org.nd4j.linalg.primitives.Pair [^LabelAwareConverter this]
    (-> this (.nextSentence))))

(defn reset
  "Description copied from interface: LabeledSentenceProvider"
  ([^LabelAwareConverter this]
    (-> this (.reset))))

(defn total-num-sentences
  "Description copied from interface: LabeledSentenceProvider

  returns: `int`"
  (^Integer [^LabelAwareConverter this]
    (-> this (.totalNumSentences))))

(defn all-labels
  "Description copied from interface: LabeledSentenceProvider

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^LabelAwareConverter this]
    (-> this (.allLabels))))

(defn num-label-classes
  "Description copied from interface: LabeledSentenceProvider

  returns: `int`"
  (^Integer [^LabelAwareConverter this]
    (-> this (.numLabelClasses))))

