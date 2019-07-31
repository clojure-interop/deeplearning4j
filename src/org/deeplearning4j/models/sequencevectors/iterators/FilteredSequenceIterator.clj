(ns org.deeplearning4j.models.sequencevectors.iterators.FilteredSequenceIterator
  "This implementation of SequenceIterator passes each sequence through specified vocabulary, filtering out SequenceElements that are not available in Vocabulary.
 Please note: nextSequence() method can return empty sequence, if none of elements were found in attached vocabulary."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.iterators FilteredSequenceIterator]))

(defn ->filtered-sequence-iterator
  "Constructor.

  Creates Filtered SequenceIterator on top of another SequenceIterator and appropriate VocabCache instance

  iterator - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator`
  vocab-cache - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`"
  (^FilteredSequenceIterator [^org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator iterator ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab-cache]
    (new FilteredSequenceIterator iterator vocab-cache)))

(defn has-more-sequences?
  "Checks, if there's any more sequences left in underlying iterator

  returns: `boolean`"
  (^Boolean [^FilteredSequenceIterator this]
    (-> this (.hasMoreSequences))))

(defn next-sequence
  "Returns filtered sequence, that contains sequence elements from vocabulary only.
  Please note: it can return empty sequence, if no elements were found in vocabulary

  returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<T>`"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^FilteredSequenceIterator this]
    (-> this (.nextSequence))))

(defn reset
  "Resets iterator down to first sequence"
  ([^FilteredSequenceIterator this]
    (-> this (.reset))))

