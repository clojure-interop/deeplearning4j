(ns org.deeplearning4j.models.sequencevectors.iterators.AbstractSequenceIterator
  "This is basic generic SequenceIterator implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.iterators AbstractSequenceIterator]))

(defn has-more-sequences?
  "Checks, if there's more sequences available

  returns: `boolean`"
  (^Boolean [^AbstractSequenceIterator this]
    (-> this (.hasMoreSequences))))

(defn next-sequence
  "Returns next sequence out of iterator

  returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<T>`"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^AbstractSequenceIterator this]
    (-> this (.nextSequence))))

(defn reset
  "Resets iterator to first position"
  ([^AbstractSequenceIterator this]
    (-> this (.reset))))

