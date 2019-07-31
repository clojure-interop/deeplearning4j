(ns org.nd4j.linalg.dataset.ViewIterator
  "Iterate over a dataset
 with views"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset ViewIterator]))

(defn ->view-iterator
  "Constructor.

  data - `org.nd4j.linalg.dataset.DataSet`
  batch-size - `int`"
  (^ViewIterator [^org.nd4j.linalg.dataset.DataSet data ^Integer batch-size]
    (new ViewIterator data batch-size)))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^ViewIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^ViewIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^ViewIterator this]
    (-> this (.next))))

(defn get-pre-processor
  "Description copied from interface: DataSetIterator

  returns: `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.DataSetPreProcessor [^ViewIterator this]
    (-> this (.getPreProcessor))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^ViewIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^ViewIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^ViewIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^ViewIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^ViewIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ViewIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^ViewIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^ViewIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^ViewIterator this]
    (-> this (.resetSupported))))

