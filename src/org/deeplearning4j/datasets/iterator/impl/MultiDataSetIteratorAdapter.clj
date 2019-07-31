(ns org.deeplearning4j.datasets.iterator.impl.MultiDataSetIteratorAdapter
  "Iterator that adapts a DataSetIterator to a MultiDataSetIterator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.impl MultiDataSetIteratorAdapter]))

(defn ->multi-data-set-iterator-adapter
  "Constructor.

  iter - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  (^MultiDataSetIteratorAdapter [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iter]
    (new MultiDataSetIteratorAdapter iter)))

(defn next
  "Description copied from interface: MultiDataSetIterator

  i - Number of examples to fetch - `int`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^MultiDataSetIteratorAdapter this ^Integer i]
    (-> this (.next i)))
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^MultiDataSetIteratorAdapter this]
    (-> this (.next))))

(defn set-pre-processor
  "Description copied from interface: MultiDataSetIterator

  multi-data-set-pre-processor - MultiDataSetPreProcessor. May be null. - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  ([^MultiDataSetIteratorAdapter this ^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor multi-data-set-pre-processor]
    (-> this (.setPreProcessor multi-data-set-pre-processor))))

(defn get-pre-processor
  "Description copied from interface: MultiDataSetIterator

  returns: Preprocessor - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor [^MultiDataSetIteratorAdapter this]
    (-> this (.getPreProcessor))))

(defn reset-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^MultiDataSetIteratorAdapter this]
    (-> this (.resetSupported))))

(defn async-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^MultiDataSetIteratorAdapter this]
    (-> this (.asyncSupported))))

(defn reset
  "Description copied from interface: MultiDataSetIterator"
  ([^MultiDataSetIteratorAdapter this]
    (-> this (.reset))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^MultiDataSetIteratorAdapter this]
    (-> this (.hasNext))))

(defn remove
  ""
  ([^MultiDataSetIteratorAdapter this]
    (-> this (.remove))))

