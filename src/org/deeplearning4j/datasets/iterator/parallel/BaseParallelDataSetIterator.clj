(ns org.deeplearning4j.datasets.iterator.parallel.BaseParallelDataSetIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.parallel BaseParallelDataSetIterator]))

(defn next-for
  "Description copied from interface: ParallelDataSetIterator

  consumer - `int`

  returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^BaseParallelDataSetIterator this ^Integer consumer]
    (-> this (.nextFor consumer)))
  (^org.nd4j.linalg.dataset.DataSet [^BaseParallelDataSetIterator this]
    (-> this (.nextFor))))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^BaseParallelDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^BaseParallelDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^BaseParallelDataSetIterator this]
    (-> this (.next))))

(defn has-next-for?
  "Description copied from interface: ParallelDataSetIterator

  consumer - `int`

  returns: `boolean`"
  (^Boolean [^BaseParallelDataSetIterator this ^Integer consumer]
    (-> this (.hasNextFor consumer)))
  (^Boolean [^BaseParallelDataSetIterator this]
    (-> this (.hasNextFor))))

(defn get-pre-processor
  "Description copied from interface: DataSetIterator

  returns: `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.DataSetPreProcessor [^BaseParallelDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^BaseParallelDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^BaseParallelDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^BaseParallelDataSetIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^BaseParallelDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^BaseParallelDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BaseParallelDataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^BaseParallelDataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^BaseParallelDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^BaseParallelDataSetIterator this]
    (-> this (.resetSupported))))

(defn attach-thread
  "Description copied from interface: ParallelDataSetIterator

  producer - `int`"
  ([^BaseParallelDataSetIterator this ^Integer producer]
    (-> this (.attachThread producer))))

