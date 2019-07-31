(ns org.deeplearning4j.spark.iterator.PortableDataStreamMultiDataSetIterator
  "A DataSetIterator that loads serialized MultiDataSet objects (saved with MultiDataSet.save(OutputStream)) from
 a PortableDataStream, usually obtained from SparkContext.binaryFiles()"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.iterator PortableDataStreamMultiDataSetIterator]))

(defn ->portable-data-stream-multi-data-set-iterator
  "Constructor.

  iter - `java.util.Iterator`"
  (^PortableDataStreamMultiDataSetIterator [^java.util.Iterator iter]
    (new PortableDataStreamMultiDataSetIterator iter)))

(defn next
  "Description copied from interface: MultiDataSetIterator

  num - Number of examples to fetch - `int`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^PortableDataStreamMultiDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^PortableDataStreamMultiDataSetIterator this]
    (-> this (.next))))

(defn reset-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^PortableDataStreamMultiDataSetIterator this]
    (-> this (.resetSupported))))

(defn async-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^PortableDataStreamMultiDataSetIterator this]
    (-> this (.asyncSupported))))

(defn reset
  "Description copied from interface: MultiDataSetIterator"
  ([^PortableDataStreamMultiDataSetIterator this]
    (-> this (.reset))))

(defn set-pre-processor
  "Description copied from interface: MultiDataSetIterator

  pre-processor - MultiDataSetPreProcessor. May be null. - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  ([^PortableDataStreamMultiDataSetIterator this ^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn get-pre-processor
  "Description copied from interface: MultiDataSetIterator

  returns: Preprocessor - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor [^PortableDataStreamMultiDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^PortableDataStreamMultiDataSetIterator this]
    (-> this (.hasNext))))

(defn remove
  ""
  ([^PortableDataStreamMultiDataSetIterator this]
    (-> this (.remove))))

