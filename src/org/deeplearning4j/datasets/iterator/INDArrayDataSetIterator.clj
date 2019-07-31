(ns org.deeplearning4j.datasets.iterator.INDArrayDataSetIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator INDArrayDataSetIterator]))

(defn ->ind-array-data-set-iterator
  "Constructor.

  iterable - `java.lang.Iterable`
  batch-size - `int`"
  (^INDArrayDataSetIterator [^java.lang.Iterable iterable ^Integer batch-size]
    (new INDArrayDataSetIterator iterable batch-size)))

