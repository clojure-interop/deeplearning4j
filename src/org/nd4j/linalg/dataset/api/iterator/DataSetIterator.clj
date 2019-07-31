(ns org.nd4j.linalg.dataset.api.iterator.DataSetIterator
  "A DataSetIterator handles
 traversing through a dataset and preparing

 data for a neural network.

 Typical usage of an iterator is akin to:

 DataSetIterator iter = ..;

 while(iter.hasNext()) {
 DataSet d = iter.next();
 //iterate network...
 }


 For custom numbers of examples/batch sizes you can call:

 iter.next(num)

 where num is the number of examples to fetch"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.iterator DataSetIterator]))

(defn input-columns
  "Input columns for the dataset

  returns: `int`"
  (^Integer [^DataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Like the standard next method but allows a
  customizable number of examples returned

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^DataSetIterator this ^Integer num]
    (-> this (.next num))))

(defn get-pre-processor
  "Returns preprocessors, if defined

  returns: `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.DataSetPreProcessor [^DataSetIterator this]
    (-> this (.getPreProcessor))))

(defn total-outcomes
  "The number of labels for the dataset

  returns: `int`"
  (^Integer [^DataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Resets the iterator back to the beginning"
  ([^DataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Batch size

  returns: `int`"
  (^Integer [^DataSetIterator this]
    (-> this (.batch))))

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
  (^Boolean [^DataSetIterator this]
    (-> this (.asyncSupported))))

(defn get-labels
  "Get dataset iterator class labels, if any.
  Note that implementations are not required to implement this, and can simply return null

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Set a pre processor

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^DataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn reset-supported
  "Is resetting supported by this DataSetIterator? Many DataSetIterators do support resetting,
  but some don't

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^DataSetIterator this]
    (-> this (.resetSupported))))

