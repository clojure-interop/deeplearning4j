(ns org.deeplearning4j.datasets.iterator.impl.SingletonDataSetIterator
  "A very simple adapter class for converting a single DataSet to a DataSetIterator.
 Returns a single DataSet as-is, for each epoch"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.impl SingletonDataSetIterator]))

(defn ->singleton-data-set-iterator
  "Constructor.

  multi-data-set - `org.nd4j.linalg.dataset.DataSet`"
  (^SingletonDataSetIterator [^org.nd4j.linalg.dataset.DataSet multi-data-set]
    (new SingletonDataSetIterator multi-data-set)))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^SingletonDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^SingletonDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^SingletonDataSetIterator this]
    (-> this (.next))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^SingletonDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^SingletonDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^SingletonDataSetIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^SingletonDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^SingletonDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SingletonDataSetIterator this]
    (-> this (.getLabels))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^SingletonDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^SingletonDataSetIterator this]
    (-> this (.resetSupported))))

