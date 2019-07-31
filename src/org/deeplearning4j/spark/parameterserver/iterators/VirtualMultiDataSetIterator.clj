(ns org.deeplearning4j.spark.parameterserver.iterators.VirtualMultiDataSetIterator
  "This MultiDataSetIterator implementation does accumulation of MultiDataSets from different Spark executors, wrt Thread/Device Affinity"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.iterators VirtualMultiDataSetIterator]))

(defn ->virtual-multi-data-set-iterator
  "Constructor.

  iterators - `java.util.List`"
  (^VirtualMultiDataSetIterator [^java.util.List iterators]
    (new VirtualMultiDataSetIterator iterators)))

(defn next-for
  "Description copied from interface: ParallelMultiDataSetIterator

  consumer - `int`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^VirtualMultiDataSetIterator this ^Integer consumer]
    (-> this (.nextFor consumer)))
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^VirtualMultiDataSetIterator this]
    (-> this (.nextFor))))

(defn next
  "Description copied from interface: MultiDataSetIterator

  num - Number of examples to fetch - `int`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^VirtualMultiDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^VirtualMultiDataSetIterator this]
    (-> this (.next))))

(defn has-next-for?
  "Description copied from interface: ParallelMultiDataSetIterator

  consumer - `int`

  returns: `boolean`"
  (^Boolean [^VirtualMultiDataSetIterator this ^Integer consumer]
    (-> this (.hasNextFor consumer)))
  (^Boolean [^VirtualMultiDataSetIterator this]
    (-> this (.hasNextFor))))

(defn get-pre-processor
  "Description copied from interface: MultiDataSetIterator

  returns: Preprocessor - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor [^VirtualMultiDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn reset
  "Description copied from interface: MultiDataSetIterator"
  ([^VirtualMultiDataSetIterator this]
    (-> this (.reset))))

(defn async-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^VirtualMultiDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^VirtualMultiDataSetIterator this]
    (-> this (.remove))))

(defn set-pre-processor
  "Description copied from interface: MultiDataSetIterator

  pre-processor - MultiDataSetPreProcessor. May be null. - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  ([^VirtualMultiDataSetIterator this ^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^VirtualMultiDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^VirtualMultiDataSetIterator this]
    (-> this (.resetSupported))))

(defn attach-thread
  "Description copied from interface: ParallelMultiDataSetIterator

  producer - `int`"
  ([^VirtualMultiDataSetIterator this ^Integer producer]
    (-> this (.attachThread producer))))

