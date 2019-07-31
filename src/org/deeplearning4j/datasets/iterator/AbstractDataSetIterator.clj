(ns org.deeplearning4j.datasets.iterator.AbstractDataSetIterator
  "This is simple DataSetIterator implementation, that builds DataSetIterator out of INDArray/float[]/double[] pairs.
 Suitable for model feeding with externally originated data.
 PLEASE NOTE: If total number of input elements % batchSize != 0, reminder will be ignored"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator AbstractDataSetIterator]))

(defn input-columns
  "Input columns for the dataset

  returns: `int`"
  (^Integer [^AbstractDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Like the standard next method but allows a
  customizable number of examples returned

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^AbstractDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^AbstractDataSetIterator this]
    (-> this (.next))))

(defn get-pre-processor
  "Description copied from interface: DataSetIterator

  returns: `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.DataSetPreProcessor [^AbstractDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn total-outcomes
  "The number of labels for the dataset

  returns: `int`"
  (^Integer [^AbstractDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Resets the iterator back to the beginning"
  ([^AbstractDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Batch size

  returns: `int`"
  (^Integer [^AbstractDataSetIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^AbstractDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  "Removes from the underlying collection the last element returned
  by this iterator (optional operation). This method can be called
  only once per call to next(int). The behavior of an iterator
  is unspecified if the underlying collection is modified while the
  iteration is in progress in any way other than by calling this
  method.

  throws: java.lang.UnsupportedOperationException - if the removeoperation is not supported by this iterator"
  ([^AbstractDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Get dataset iterator record reader labels

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AbstractDataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Set a pre processor

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^AbstractDataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "Returns true if the iteration has more elements.
  (In other words, returns true if next(int) would
  return an element rather than throwing an exception.)

  returns: true if the iteration has more elements - `boolean`"
  (^Boolean [^AbstractDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^AbstractDataSetIterator this]
    (-> this (.resetSupported))))

