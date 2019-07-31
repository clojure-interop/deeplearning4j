(ns org.deeplearning4j.datasets.iterator.impl.SingletonMultiDataSetIterator
  "A very simple adapter class for converting a single MultiDataSet to a MultiDataSetIterator.
 Returns a single MultiDataSet"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.impl SingletonMultiDataSetIterator]))

(defn ->singleton-multi-data-set-iterator
  "Constructor.

  multi-data-set - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^SingletonMultiDataSetIterator [^org.nd4j.linalg.dataset.api.MultiDataSet multi-data-set]
    (new SingletonMultiDataSetIterator multi-data-set)))

(defn next
  "Description copied from interface: MultiDataSetIterator

  num - Number of examples to fetch - `int`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^SingletonMultiDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^SingletonMultiDataSetIterator this]
    (-> this (.next))))

(defn set-pre-processor
  "Description copied from interface: MultiDataSetIterator

  pre-processor - MultiDataSetPreProcessor. May be null. - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  ([^SingletonMultiDataSetIterator this ^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn get-pre-processor
  "Description copied from interface: MultiDataSetIterator

  returns: Preprocessor - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor [^SingletonMultiDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn reset-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^SingletonMultiDataSetIterator this]
    (-> this (.resetSupported))))

(defn async-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^SingletonMultiDataSetIterator this]
    (-> this (.asyncSupported))))

(defn reset
  "Description copied from interface: MultiDataSetIterator"
  ([^SingletonMultiDataSetIterator this]
    (-> this (.reset))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^SingletonMultiDataSetIterator this]
    (-> this (.hasNext))))

(defn remove
  ""
  ([^SingletonMultiDataSetIterator this]
    (-> this (.remove))))

