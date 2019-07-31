(ns org.deeplearning4j.models.sequencevectors.iterators.SynchronizedSequenceIterator
  "Synchronized version of AbstractSeuqenceIterator, implemented on top of it.
 Suitable for cases with non-strict multithreading environment, since it's just synchronized wrapper"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.iterators SynchronizedSequenceIterator]))

(defn ->synchronized-sequence-iterator
  "Constructor.

  Creates SynchronizedSequenceIterator on top of any SequenceIterator

  iterator - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator`"
  (^SynchronizedSequenceIterator [^org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator iterator]
    (new SynchronizedSequenceIterator iterator)))

(defn has-more-sequences?
  "Checks, if there's any more sequences left in data source

  returns: `boolean`"
  (^Boolean [^SynchronizedSequenceIterator this]
    (-> this (.hasMoreSequences))))

(defn next-sequence
  "Returns next sequence from data source

  returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<T>`"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^SynchronizedSequenceIterator this]
    (-> this (.nextSequence))))

(defn reset
  "This method resets underlying iterator"
  ([^SynchronizedSequenceIterator this]
    (-> this (.reset))))

