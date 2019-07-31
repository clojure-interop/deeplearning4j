(ns org.deeplearning4j.models.sequencevectors.sequence.Sequence
  "Sequence for SequenceVectors is defined as limited set of SequenceElements. It can also contain label, if you're going to learn Sequence features as well."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.sequence Sequence]))

(defn ->sequence
  "Constructor.

  Creates new sequence from collection of elements

  set - `java.util.Collection`"
  (^Sequence [^java.util.Collection set]
    (new Sequence set))
  (^Sequence []
    (new Sequence )))

(defn get-element-by-label
  "Returns single element out of this sequence by its label

  label - `java.lang.String`

  returns: `T`"
  ([^Sequence this ^java.lang.String label]
    (-> this (.getElementByLabel label))))

(defn set-sequence-label
  "Set sequence label

  label - `T`"
  ([^Sequence this label]
    (-> this (.setSequenceLabel label))))

(defn add-element
  "Adds single element to sequence

  element - `T`"
  ([^Sequence this element]
    (-> this (.addElement element))))

(defn as-labels
  "Returns this sequence as list of labels

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Sequence this]
    (-> this (.asLabels))))

(defn get-sequence-labels
  "Returns all labels for this sequence

  returns: `java.util.List<T>`"
  (^java.util.List [^Sequence this]
    (-> this (.getSequenceLabels))))

(defn add-elements
  "Adds collection of elements to the sequence

  set - `java.util.Collection`"
  ([^Sequence this ^java.util.Collection set]
    (-> this (.addElements set))))

(defn get-elements
  "Returns an ordered unmodifiable list of elements from this sequence

  returns: `java.util.List<T>`"
  (^java.util.List [^Sequence this]
    (-> this (.getElements))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Sequence this]
    (-> this (.hashCode))))

(defn empty?
  "Checks, if sequence is empty

  returns: TRUE if empty, FALSE otherwise - `boolean`"
  (^Boolean [^Sequence this]
    (-> this (.isEmpty))))

(defn set-sequence-labels
  "Sets sequence labels

  labels - `java.util.List`"
  ([^Sequence this ^java.util.List labels]
    (-> this (.setSequenceLabels labels))))

(defn size
  "This method returns number of elements in this sequence

  returns: `int`"
  (^Integer [^Sequence this]
    (-> this (.size))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Sequence this ^java.lang.Object o]
    (-> this (.equals o))))

(defn add-sequence-label
  "Adds sequence label. In this case sequence will have multiple labels

  label - `T`"
  ([^Sequence this label]
    (-> this (.addSequenceLabel label))))

(defn get-sequence-label
  "Returns label for this sequence

  returns: label for this sequence, null if label was not defined - `T`"
  ([^Sequence this]
    (-> this (.getSequenceLabel))))

(defn get-element-by-index
  "This method returns sequence element by index

  index - `int`

  returns: `T`"
  ([^Sequence this ^Integer index]
    (-> this (.getElementByIndex index))))

