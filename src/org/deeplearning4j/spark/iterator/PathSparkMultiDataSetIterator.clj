(ns org.deeplearning4j.spark.iterator.PathSparkMultiDataSetIterator
  "A DataSetIterator that loads serialized DataSet objects (saved with MultiDataSet.save(OutputStream)) from
 a String that represents the path (for example, on HDFS)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.iterator PathSparkMultiDataSetIterator]))

(defn ->path-spark-multi-data-set-iterator
  "Constructor.

  iter - `java.util.Iterator`
  loader - `org.deeplearning4j.api.loader.MultiDataSetLoader`"
  (^PathSparkMultiDataSetIterator [^java.util.Iterator iter ^org.deeplearning4j.api.loader.MultiDataSetLoader loader]
    (new PathSparkMultiDataSetIterator iter loader)))

(def *-buffer-size
  "Static Constant.

  type: int"
  PathSparkMultiDataSetIterator/BUFFER_SIZE)

(defn next
  "Description copied from interface: MultiDataSetIterator

  num - Number of examples to fetch - `int`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^PathSparkMultiDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^PathSparkMultiDataSetIterator this]
    (-> this (.next))))

(defn reset-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^PathSparkMultiDataSetIterator this]
    (-> this (.resetSupported))))

(defn async-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^PathSparkMultiDataSetIterator this]
    (-> this (.asyncSupported))))

(defn reset
  "Description copied from interface: MultiDataSetIterator"
  ([^PathSparkMultiDataSetIterator this]
    (-> this (.reset))))

(defn set-pre-processor
  "Description copied from interface: MultiDataSetIterator

  pre-processor - MultiDataSetPreProcessor. May be null. - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  ([^PathSparkMultiDataSetIterator this ^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn get-pre-processor
  "Description copied from interface: MultiDataSetIterator

  returns: Preprocessor - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor [^PathSparkMultiDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^PathSparkMultiDataSetIterator this]
    (-> this (.hasNext))))

(defn remove
  ""
  ([^PathSparkMultiDataSetIterator this]
    (-> this (.remove))))

