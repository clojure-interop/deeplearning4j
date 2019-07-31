(ns org.nd4j.linalg.dataset.api.iterator.BaseDatasetIterator
  "Baseline implementation includes
 control over the data fetcher and some basic
 getters for metadata"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.iterator BaseDatasetIterator]))

(defn ->base-dataset-iterator
  "Constructor.

  batch - `int`
  num-examples - `int`
  fetcher - `org.nd4j.linalg.dataset.api.iterator.fetcher.DataSetFetcher`"
  (^BaseDatasetIterator [^Integer batch ^Integer num-examples ^org.nd4j.linalg.dataset.api.iterator.fetcher.DataSetFetcher fetcher]
    (new BaseDatasetIterator batch num-examples fetcher)))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^BaseDatasetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^BaseDatasetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^BaseDatasetIterator this]
    (-> this (.next))))

(defn get-pre-processor
  "Description copied from interface: DataSetIterator

  returns: `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.DataSetPreProcessor [^BaseDatasetIterator this]
    (-> this (.getPreProcessor))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^BaseDatasetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^BaseDatasetIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^BaseDatasetIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^BaseDatasetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^BaseDatasetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BaseDatasetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Set a pre processor

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^BaseDatasetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^BaseDatasetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^BaseDatasetIterator this]
    (-> this (.resetSupported))))

