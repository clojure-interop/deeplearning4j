(ns org.nd4j.linalg.dataset.ExistingMiniBatchDataSetIterator
  "Read in existing mini batches created
 by the mini batch file datasetiterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset ExistingMiniBatchDataSetIterator]))

(defn ->existing-mini-batch-data-set-iterator
  "Constructor.

  Create with the given root directory, using the default filename pattern DEFAULT_PATTERN

  root-dir - the root directory to use - `java.io.File`"
  (^ExistingMiniBatchDataSetIterator [^java.io.File root-dir]
    (new ExistingMiniBatchDataSetIterator root-dir))
  (^ExistingMiniBatchDataSetIterator [^java.io.File root-dir ^java.lang.String pattern]
    (new ExistingMiniBatchDataSetIterator root-dir pattern)))

(def *-default-pattern
  "Static Constant.

  type: java.lang.String"
  ExistingMiniBatchDataSetIterator/DEFAULT_PATTERN)

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^ExistingMiniBatchDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^ExistingMiniBatchDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^ExistingMiniBatchDataSetIterator this]
    (-> this (.next))))

(defn get-pre-processor
  "Description copied from interface: DataSetIterator

  returns: `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.DataSetPreProcessor [^ExistingMiniBatchDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^ExistingMiniBatchDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^ExistingMiniBatchDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^ExistingMiniBatchDataSetIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^ExistingMiniBatchDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^ExistingMiniBatchDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ExistingMiniBatchDataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^ExistingMiniBatchDataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^ExistingMiniBatchDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^ExistingMiniBatchDataSetIterator this]
    (-> this (.resetSupported))))

