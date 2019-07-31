(ns org.deeplearning4j.datasets.iterator.impl.ListDataSetIterator
  "Wraps a data applyTransformToDestination collection"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.impl ListDataSetIterator]))

(defn ->list-data-set-iterator
  "Constructor.

  Initializes with a batch of 5

  coll - the collection to iterate over - `java.util.Collection`"
  (^ListDataSetIterator [^java.util.Collection coll]
    (new ListDataSetIterator coll))
  (^ListDataSetIterator [^java.util.Collection coll ^Integer batch]
    (new ListDataSetIterator coll batch)))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^ListDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^ListDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^ListDataSetIterator this]
    (-> this (.next))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^ListDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^ListDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^ListDataSetIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^ListDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^ListDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ListDataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^ListDataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^ListDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^ListDataSetIterator this]
    (-> this (.resetSupported))))

