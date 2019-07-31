(ns org.deeplearning4j.datasets.iterator.ExistingDataSetIterator
  "This wrapper provides DataSetIterator interface to existing java Iterable and Iterator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator ExistingDataSetIterator]))

(defn ->existing-data-set-iterator
  "Constructor.

  iterable - `java.lang.Iterable`
  total-examples - `int`
  num-features - `int`
  num-labels - `int`"
  (^ExistingDataSetIterator [^java.lang.Iterable iterable ^Integer total-examples ^Integer num-features ^Integer num-labels]
    (new ExistingDataSetIterator iterable total-examples num-features num-labels))
  (^ExistingDataSetIterator [^java.util.Iterator iterator ^java.util.List labels]
    (new ExistingDataSetIterator iterator labels))
  (^ExistingDataSetIterator [^java.util.Iterator iterator]
    (new ExistingDataSetIterator iterator)))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^ExistingDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^ExistingDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^ExistingDataSetIterator this]
    (-> this (.next))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^ExistingDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^ExistingDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^ExistingDataSetIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^ExistingDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^ExistingDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ExistingDataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^ExistingDataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^ExistingDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^ExistingDataSetIterator this]
    (-> this (.resetSupported))))

