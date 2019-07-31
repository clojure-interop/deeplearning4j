(ns org.deeplearning4j.iterator.provider.CollectionLabeledSentenceProvider
  "Iterate over a set of sentences/documents,
 where the sentences and labels are provided in lists."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.iterator.provider CollectionLabeledSentenceProvider]))

(defn ->collection-labeled-sentence-provider
  "Constructor.

  sentences - `java.util.List`
  labels-for-sentences - `java.util.List`
  rng - `java.util.Random`"
  (^CollectionLabeledSentenceProvider [^java.util.List sentences ^java.util.List labels-for-sentences ^java.util.Random rng]
    (new CollectionLabeledSentenceProvider sentences labels-for-sentences rng))
  (^CollectionLabeledSentenceProvider [^java.util.List sentences ^java.util.List labels-for-sentences]
    (new CollectionLabeledSentenceProvider sentences labels-for-sentences)))

(defn has-next?
  "Description copied from interface: LabeledSentenceProvider

  returns: `boolean`"
  (^Boolean [^CollectionLabeledSentenceProvider this]
    (-> this (.hasNext))))

(defn next-sentence
  "returns: Pair: sentence/document text and label - `org.nd4j.linalg.primitives.Pair<java.lang.String,java.lang.String>`"
  (^org.nd4j.linalg.primitives.Pair [^CollectionLabeledSentenceProvider this]
    (-> this (.nextSentence))))

(defn reset
  "Description copied from interface: LabeledSentenceProvider"
  ([^CollectionLabeledSentenceProvider this]
    (-> this (.reset))))

(defn total-num-sentences
  "Description copied from interface: LabeledSentenceProvider

  returns: `int`"
  (^Integer [^CollectionLabeledSentenceProvider this]
    (-> this (.totalNumSentences))))

(defn all-labels
  "Description copied from interface: LabeledSentenceProvider

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CollectionLabeledSentenceProvider this]
    (-> this (.allLabels))))

(defn num-label-classes
  "Description copied from interface: LabeledSentenceProvider

  returns: `int`"
  (^Integer [^CollectionLabeledSentenceProvider this]
    (-> this (.numLabelClasses))))

