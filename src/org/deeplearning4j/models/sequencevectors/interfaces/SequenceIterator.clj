(ns org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator
  "SequenceIterator is basic interface for learning abstract data that can be represented as sequence of some elements."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.interfaces SequenceIterator]))

(defn has-more-sequences?
  "returns: `boolean`"
  (^Boolean [^SequenceIterator this]
    (-> this (.hasMoreSequences))))

(defn next-sequence
  "returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<T>`"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^SequenceIterator this]
    (-> this (.nextSequence))))

(defn reset
  ""
  ([^SequenceIterator this]
    (-> this (.reset))))

