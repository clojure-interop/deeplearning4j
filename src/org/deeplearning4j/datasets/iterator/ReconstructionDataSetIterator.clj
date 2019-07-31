(ns org.deeplearning4j.datasets.iterator.ReconstructionDataSetIterator
  "Wraps a data applyTransformToDestination iterator setting the first (feature matrix) as
 the labels."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator ReconstructionDataSetIterator]))

(defn ->reconstruction-data-set-iterator
  "Constructor.

  iter - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  (^ReconstructionDataSetIterator [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iter]
    (new ReconstructionDataSetIterator iter)))

(defn input-columns
  "Input columns for the dataset

  returns: `int`"
  (^Integer [^ReconstructionDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Like the standard next method but allows a
  customizable number of examples returned

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^ReconstructionDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^ReconstructionDataSetIterator this]
    (-> this (.next))))

(defn total-outcomes
  "The number of labels for the dataset

  returns: `int`"
  (^Integer [^ReconstructionDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Resets the iterator back to the beginning"
  ([^ReconstructionDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Batch size

  returns: `int`"
  (^Integer [^ReconstructionDataSetIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^ReconstructionDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  "Removes from the underlying collection the last element returned
  by this iterator (optional operation). This method can be called
  only once per call to next(int). The behavior of an iterator
  is unspecified if the underlying collection is modified while the
  iteration is in progress in any way other than by calling this
  method.

  throws: java.lang.UnsupportedOperationException - if the removeoperation is not supported by this iterator"
  ([^ReconstructionDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ReconstructionDataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^ReconstructionDataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "Returns true if the iteration has more elements.
  (In other words, returns true if next(int) would
  return an element rather than throwing an exception.)

  returns: true if the iteration has more elements - `boolean`"
  (^Boolean [^ReconstructionDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^ReconstructionDataSetIterator this]
    (-> this (.resetSupported))))

