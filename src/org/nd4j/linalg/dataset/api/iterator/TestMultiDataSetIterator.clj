(ns org.nd4j.linalg.dataset.api.iterator.TestMultiDataSetIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.iterator TestMultiDataSetIterator]))

(defn ->test-multi-data-set-iterator
  "Constructor.

  Makes an iterator from the given datasets. DataSets are expected to are batches of exactly 1 example.
  ONLY for use in tests in nd4j

  batch - `int`
  dataset - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^TestMultiDataSetIterator [^Integer batch ^org.nd4j.linalg.dataset.api.MultiDataSet dataset]
    (new TestMultiDataSetIterator batch dataset)))

(defn next
  "Description copied from interface: MultiDataSetIterator

  num - Number of examples to fetch - `int`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^TestMultiDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^TestMultiDataSetIterator this]
    (-> this (.next))))

(defn set-pre-processor
  "Description copied from interface: MultiDataSetIterator

  pre-processor - MultiDataSetPreProcessor. May be null. - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  ([^TestMultiDataSetIterator this ^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn get-pre-processor
  "Description copied from interface: MultiDataSetIterator

  returns: Preprocessor - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor [^TestMultiDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn reset-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^TestMultiDataSetIterator this]
    (-> this (.resetSupported))))

(defn async-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^TestMultiDataSetIterator this]
    (-> this (.asyncSupported))))

(defn reset
  "Description copied from interface: MultiDataSetIterator"
  ([^TestMultiDataSetIterator this]
    (-> this (.reset))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^TestMultiDataSetIterator this]
    (-> this (.hasNext))))

(defn remove
  ""
  ([^TestMultiDataSetIterator this]
    (-> this (.remove))))

