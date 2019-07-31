(ns org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator
  "An iterator for MultiDataSet objects.
 Typical usage is for machine learning algorithms with multiple independent input (features) and output (labels)
 arrays."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.iterator MultiDataSetIterator]))

(defn next
  "Fetch the next 'num' examples. Similar to the next method, but returns a specified number of examples

  num - Number of examples to fetch - `int`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^MultiDataSetIterator this ^Integer num]
    (-> this (.next num))))

(defn set-pre-processor
  "Set the preprocessor to be applied to each MultiDataSet, before each MultiDataSet is returned.

  pre-processor - MultiDataSetPreProcessor. May be null. - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  ([^MultiDataSetIterator this ^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn get-pre-processor
  "Get the MultiDataSetPreProcessor, if one has previously been set.
  Returns null if no preprocessor has been set

  returns: Preprocessor - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor [^MultiDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn reset-supported
  "Is resetting supported by this DataSetIterator? Many DataSetIterators do support resetting,
  but some don't

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^MultiDataSetIterator this]
    (-> this (.resetSupported))))

(defn async-supported
  "Does this MultiDataSetIterator support asynchronous prefetching of multiple MultiDataSet objects?
  Most MultiDataSetIterators do, but in some cases it may not make sense to wrap this iterator in an
  iterator that does asynchronous prefetching. For example, it would not make sense to use asynchronous
  prefetching for the following types of iterators:
  (a) Iterators that store their full contents in memory already
  (b) Iterators that re-use features/labels arrays (as future next() calls will overwrite past contents)
  (c) Iterators that already implement some level of asynchronous prefetching
  (d) Iterators that may return different data depending on when the next() method is called

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^MultiDataSetIterator this]
    (-> this (.asyncSupported))))

(defn reset
  "Resets the iterator back to the beginning"
  ([^MultiDataSetIterator this]
    (-> this (.reset))))

