(ns org.nd4j.linalg.dataset.api.iterator.TestDataSetIterator
  "Created by susaneraly on 5/26/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.iterator TestDataSetIterator]))

(defn ->test-data-set-iterator
  "Constructor.

  This makes an iterator from the given dataset and batchsize
  ONLY for use in tests in nd4j
  Initializes with a default batch of 5

  dataset - the dataset to make the iterator from - `org.nd4j.linalg.dataset.DataSet`"
  (^TestDataSetIterator [^org.nd4j.linalg.dataset.DataSet dataset]
    (new TestDataSetIterator dataset))
  (^TestDataSetIterator [^org.nd4j.linalg.dataset.DataSet dataset ^Integer batch]
    (new TestDataSetIterator dataset batch)))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^TestDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^TestDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^TestDataSetIterator this]
    (-> this (.next))))

(defn get-pre-processor
  "Description copied from interface: DataSetIterator

  returns: `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.DataSetPreProcessor [^TestDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^TestDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^TestDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^TestDataSetIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^TestDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^TestDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TestDataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^TestDataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^TestDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^TestDataSetIterator this]
    (-> this (.resetSupported))))

