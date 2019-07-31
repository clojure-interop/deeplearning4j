(ns org.deeplearning4j.datasets.iterator.DoublesDataSetIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator DoublesDataSetIterator]))

(defn ->doubles-data-set-iterator
  "Constructor.

  iterable - `java.lang.Iterable`
  batch-size - `int`"
  (^DoublesDataSetIterator [^java.lang.Iterable iterable ^Integer batch-size]
    (new DoublesDataSetIterator iterable batch-size)))

