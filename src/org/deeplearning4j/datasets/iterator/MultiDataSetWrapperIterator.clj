(ns org.deeplearning4j.datasets.iterator.MultiDataSetWrapperIterator
  "This class is simple wrapper that takes single-input MultiDataSets and converts them to DataSets on the fly
 PLEASE NOTE: This only works if number of features/labels/masks is 1"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator MultiDataSetWrapperIterator]))

(defn ->multi-data-set-wrapper-iterator
  "Constructor.

  iterator - `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`"
  (^MultiDataSetWrapperIterator [^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator iterator]
    (new MultiDataSetWrapperIterator iterator)))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^MultiDataSetWrapperIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^MultiDataSetWrapperIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^MultiDataSetWrapperIterator this]
    (-> this (.next))))

(defn get-pre-processor
  "Description copied from interface: DataSetIterator

  returns: `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.DataSetPreProcessor [^MultiDataSetWrapperIterator this]
    (-> this (.getPreProcessor))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^MultiDataSetWrapperIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^MultiDataSetWrapperIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^MultiDataSetWrapperIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^MultiDataSetWrapperIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^MultiDataSetWrapperIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^MultiDataSetWrapperIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^MultiDataSetWrapperIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^MultiDataSetWrapperIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^MultiDataSetWrapperIterator this]
    (-> this (.resetSupported))))

