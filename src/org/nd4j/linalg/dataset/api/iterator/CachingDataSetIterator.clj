(ns org.nd4j.linalg.dataset.api.iterator.CachingDataSetIterator
  "Created by anton on 7/16/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.iterator CachingDataSetIterator]))

(defn ->caching-data-set-iterator
  "Constructor.

  source-iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  cache - `org.nd4j.linalg.dataset.api.iterator.cache.DataSetCache`
  namespace - `java.lang.String`
  allow-prefetching - `boolean`"
  (^CachingDataSetIterator [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator source-iterator ^org.nd4j.linalg.dataset.api.iterator.cache.DataSetCache cache ^java.lang.String namespace ^Boolean allow-prefetching]
    (new CachingDataSetIterator source-iterator cache namespace allow-prefetching))
  (^CachingDataSetIterator [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator source-iterator ^org.nd4j.linalg.dataset.api.iterator.cache.DataSetCache cache ^java.lang.String namespace]
    (new CachingDataSetIterator source-iterator cache namespace))
  (^CachingDataSetIterator [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator source-iterator ^org.nd4j.linalg.dataset.api.iterator.cache.DataSetCache cache]
    (new CachingDataSetIterator source-iterator cache)))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^CachingDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^CachingDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^CachingDataSetIterator this]
    (-> this (.next))))

(defn get-pre-processor
  "Description copied from interface: DataSetIterator

  returns: `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.DataSetPreProcessor [^CachingDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^CachingDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^CachingDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^CachingDataSetIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^CachingDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^CachingDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CachingDataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^CachingDataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^CachingDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^CachingDataSetIterator this]
    (-> this (.resetSupported))))

