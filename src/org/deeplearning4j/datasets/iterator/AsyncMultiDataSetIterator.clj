(ns org.deeplearning4j.datasets.iterator.AsyncMultiDataSetIterator
  "Async prefetching iterator wrapper for MultiDataSetIterator implementations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator AsyncMultiDataSetIterator]))

(defn ->async-multi-data-set-iterator
  "Constructor.

  iterator - `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`
  queue-size - `int`
  queue - `java.util.concurrent.BlockingQueue`
  use-workspace - `boolean`
  callback - `org.deeplearning4j.datasets.iterator.callbacks.DataSetCallback`
  device-id - `java.lang.Integer`"
  (^AsyncMultiDataSetIterator [^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator iterator ^Integer queue-size ^java.util.concurrent.BlockingQueue queue ^Boolean use-workspace ^org.deeplearning4j.datasets.iterator.callbacks.DataSetCallback callback ^java.lang.Integer device-id]
    (new AsyncMultiDataSetIterator iterator queue-size queue use-workspace callback device-id))
  (^AsyncMultiDataSetIterator [^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator iterator ^Integer queue-size ^java.util.concurrent.BlockingQueue queue ^Boolean use-workspace ^org.deeplearning4j.datasets.iterator.callbacks.DataSetCallback callback]
    (new AsyncMultiDataSetIterator iterator queue-size queue use-workspace callback))
  (^AsyncMultiDataSetIterator [^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator base-iterator ^Integer queue-size ^Boolean use-workspace ^java.lang.Integer device-id]
    (new AsyncMultiDataSetIterator base-iterator queue-size use-workspace device-id))
  (^AsyncMultiDataSetIterator [^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator iterator ^Integer queue-size ^java.util.concurrent.BlockingQueue queue]
    (new AsyncMultiDataSetIterator iterator queue-size queue))
  (^AsyncMultiDataSetIterator [^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator base-iterator ^Integer queue-size]
    (new AsyncMultiDataSetIterator base-iterator queue-size))
  (^AsyncMultiDataSetIterator [^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator base-iterator]
    (new AsyncMultiDataSetIterator base-iterator)))

(defn next
  "Like the standard next method but allows a
  customizable number of examples returned

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^AsyncMultiDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^AsyncMultiDataSetIterator this]
    (-> this (.next))))

(defn get-pre-processor
  "Description copied from interface: MultiDataSetIterator

  returns: Preprocessor - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor [^AsyncMultiDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn reset
  "Resets the iterator back to the beginning"
  ([^AsyncMultiDataSetIterator this]
    (-> this (.reset))))

(defn shutdown
  "This method will terminate background thread AND will destroy attached workspace (if any)
  PLEASE NOTE: After shutdown() call, this instance can't be used anymore"
  ([^AsyncMultiDataSetIterator this]
    (-> this (.shutdown))))

(defn async-supported
  "Does this DataSetIterator support asynchronous prefetching of multiple DataSet objects?
  Most DataSetIterators do, but in some cases it may not make sense to wrap this iterator in an
  iterator that does asynchronous prefetching. For example, it would not make sense to use asynchronous
  prefetching for the following types of iterators:
  (a) Iterators that store their full contents in memory already
  (b) Iterators that re-use features/labels arrays (as future next() calls will overwrite past contents)
  (c) Iterators that already implement some level of asynchronous prefetching
  (d) Iterators that may return different data depending on when the next() method is called

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^AsyncMultiDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  "Removes from the underlying collection the last element returned
  by this iterator (optional operation). This method can be called
  only once per call to next(int). The behavior of an iterator
  is unspecified if the underlying collection is modified while the
  iteration is in progress in any way other than by calling this
  method.

  throws: java.lang.UnsupportedOperationException - if the removeoperation is not supported by this iterator"
  ([^AsyncMultiDataSetIterator this]
    (-> this (.remove))))

(defn set-pre-processor
  "Set the preprocessor to be applied to each MultiDataSet, before each MultiDataSet is returned.

  pre-processor - MultiDataSetPreProcessor. May be null. - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  ([^AsyncMultiDataSetIterator this ^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "Returns true if the iteration has more elements.
  (In other words, returns true if next(int) would
  return an element rather than throwing an exception.)

  returns: true if the iteration has more elements - `boolean`"
  (^Boolean [^AsyncMultiDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Is resetting supported by this DataSetIterator? Many DataSetIterators do support resetting,
  but some don't

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^AsyncMultiDataSetIterator this]
    (-> this (.resetSupported))))

