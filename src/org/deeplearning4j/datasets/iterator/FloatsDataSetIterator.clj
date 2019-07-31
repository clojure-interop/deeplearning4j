(ns org.deeplearning4j.datasets.iterator.FloatsDataSetIterator
  "float[] wrapper for DataSetIterator impementation.
 This iterator creates DataSets out of externally-originated pairs of floats."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator FloatsDataSetIterator]))

(defn ->floats-data-set-iterator
  "Constructor.

  iterable - `java.lang.Iterable`
  batch-size - `int`"
  (^FloatsDataSetIterator [^java.lang.Iterable iterable ^Integer batch-size]
    (new FloatsDataSetIterator iterable batch-size)))

