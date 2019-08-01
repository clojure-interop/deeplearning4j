(ns org.deeplearning4j.iterator.LabeledSentenceProvider
  "LabeledSentenceProvider: a simple iterator interface over sentences/documents that have a label.
 This is intended for use with CnnSentenceDataSetIterator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.iterator LabeledSentenceProvider]))

(defn has-next?
  "Are there more sentences/documents available?

  returns: `boolean`"
  (^Boolean [^LabeledSentenceProvider this]
    (-> this (.hasNext))))

(defn next-sentence
  "returns: Pair: sentence/document text and label - `org.nd4j.linalg.primitives.Pair<java.lang.String,java.lang.String>`"
  (^org.nd4j.linalg.primitives.Pair [^LabeledSentenceProvider this]
    (-> this (.nextSentence))))

(defn reset
  "Reset the iterator - including shuffling the order, if necessary/appropriate"
  ([^LabeledSentenceProvider this]
    (-> this (.reset))))

(defn total-num-sentences
  "Return the total number of sentences, or -1 if not available

  returns: `int`"
  (^Integer [^LabeledSentenceProvider this]
    (-> this (.totalNumSentences))))

(defn all-labels
  "Return the list of labels - this also defines the class/integer label assignment order

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^LabeledSentenceProvider this]
    (-> this (.allLabels))))

(defn num-label-classes
  "Equivalent to allLabels().size()

  returns: `int`"
  (^Integer [^LabeledSentenceProvider this]
    (-> this (.numLabelClasses))))

