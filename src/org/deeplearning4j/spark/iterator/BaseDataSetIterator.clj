(ns org.deeplearning4j.spark.iterator.BaseDataSetIterator
  "Created by huitseeker on 2/15/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.iterator BaseDataSetIterator]))

(defn ->base-data-set-iterator
  "Constructor."
  (^BaseDataSetIterator []
    (new BaseDataSetIterator )))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^BaseDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^BaseDataSetIterator this ^Integer num]
    (-> this (.next num))))

(defn get-pre-processor
  "Description copied from interface: DataSetIterator

  returns: `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.DataSetPreProcessor [^BaseDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^BaseDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^BaseDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^BaseDataSetIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^BaseDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^BaseDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BaseDataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^BaseDataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^BaseDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^BaseDataSetIterator this]
    (-> this (.resetSupported))))

