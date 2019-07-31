(ns org.deeplearning4j.datasets.iterator.IteratorMultiDataSetIterator
  "A DataSetIterator that works on an Iterator, combining and splitting the input DataSet objects as
 required to get a consistent batch size.
 Typically used in Spark training, but may be used elsewhere.
 NOTE: reset method is not supported here."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator IteratorMultiDataSetIterator]))

(defn ->iterator-multi-data-set-iterator
  "Constructor.

  iterator - `java.util.Iterator`
  batch-size - `int`"
  (^IteratorMultiDataSetIterator [^java.util.Iterator iterator ^Integer batch-size]
    (new IteratorMultiDataSetIterator iterator batch-size)))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^IteratorMultiDataSetIterator this]
    (-> this (.hasNext))))

(defn next
  "Description copied from interface: MultiDataSetIterator

  num - Number of examples to fetch - `int`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^IteratorMultiDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^IteratorMultiDataSetIterator this]
    (-> this (.next))))

(defn reset-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^IteratorMultiDataSetIterator this]
    (-> this (.resetSupported))))

(defn async-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^IteratorMultiDataSetIterator this]
    (-> this (.asyncSupported))))

(defn reset
  "Description copied from interface: MultiDataSetIterator"
  ([^IteratorMultiDataSetIterator this]
    (-> this (.reset))))

(defn set-pre-processor
  "Description copied from interface: MultiDataSetIterator

  pre-processor - MultiDataSetPreProcessor. May be null. - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  ([^IteratorMultiDataSetIterator this ^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn get-pre-processor
  "Description copied from interface: MultiDataSetIterator

  returns: Preprocessor - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor [^IteratorMultiDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn remove
  ""
  ([^IteratorMultiDataSetIterator this]
    (-> this (.remove))))

