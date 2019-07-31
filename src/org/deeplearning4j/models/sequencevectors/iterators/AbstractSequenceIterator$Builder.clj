(ns org.deeplearning4j.models.sequencevectors.iterators.AbstractSequenceIterator$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.iterators AbstractSequenceIterator$Builder]))

(defn ->builder
  "Constructor.

  Builds AbstractSequenceIterator on top of Iterable object

  iterable - `java.lang.Iterable`"
  (^AbstractSequenceIterator$Builder [^java.lang.Iterable iterable]
    (new AbstractSequenceIterator$Builder iterable)))

(defn build
  "Builds SequenceIterator

  returns: `org.deeplearning4j.models.sequencevectors.iterators.AbstractSequenceIterator<T>`"
  (^org.deeplearning4j.models.sequencevectors.iterators.AbstractSequenceIterator [^AbstractSequenceIterator$Builder this]
    (-> this (.build))))

