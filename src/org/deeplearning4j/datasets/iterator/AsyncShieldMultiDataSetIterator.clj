(ns org.deeplearning4j.datasets.iterator.AsyncShieldMultiDataSetIterator
  "This wrapper takes your existing MultiDataSetIterator implementation and prevents asynchronous prefetch"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator AsyncShieldMultiDataSetIterator]))

(defn ->async-shield-multi-data-set-iterator
  "Constructor.

  iterator - `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`"
  (^AsyncShieldMultiDataSetIterator [^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator iterator]
    (new AsyncShieldMultiDataSetIterator iterator)))

(defn next
  "Fetch the next 'num' examples. Similar to the next method, but returns a specified number of examples

  num - Number of examples to fetch - `int`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^AsyncShieldMultiDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^AsyncShieldMultiDataSetIterator this]
    (-> this (.next))))

(defn set-pre-processor
  "Set the preprocessor to be applied to each MultiDataSet, before each MultiDataSet is returned.

  pre-processor - MultiDataSetPreProcessor. May be null. - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  ([^AsyncShieldMultiDataSetIterator this ^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn get-pre-processor
  "Description copied from interface: MultiDataSetIterator

  returns: Preprocessor - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor [^AsyncShieldMultiDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn reset-supported
  "Is resetting supported by this DataSetIterator? Many DataSetIterators do support resetting,
  but some don't

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^AsyncShieldMultiDataSetIterator this]
    (-> this (.resetSupported))))

(defn async-supported
  "/**
  Does this DataSetIterator support asynchronous prefetching of multiple DataSet objects?
  PLEASE NOTE: This iterator ALWAYS returns FALSE

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^AsyncShieldMultiDataSetIterator this]
    (-> this (.asyncSupported))))

(defn reset
  "Resets the iterator back to the beginning"
  ([^AsyncShieldMultiDataSetIterator this]
    (-> this (.reset))))

(defn has-next?
  "Returns true if the iteration has more elements.
  (In other words, returns true if next(int) would
  return an element rather than throwing an exception.)

  returns: true if the iteration has more elements - `boolean`"
  (^Boolean [^AsyncShieldMultiDataSetIterator this]
    (-> this (.hasNext))))

(defn remove
  "Removes from the underlying collection the last element returned
  by this iterator (optional operation). This method can be called
  only once per call to next(int). The behavior of an iterator
  is unspecified if the underlying collection is modified while the
  iteration is in progress in any way other than by calling this
  method.

  throws: java.lang.UnsupportedOperationException - if the removeoperation is not supported by this iterator"
  ([^AsyncShieldMultiDataSetIterator this]
    (-> this (.remove))))

