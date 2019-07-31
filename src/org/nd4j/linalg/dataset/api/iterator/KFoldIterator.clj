(ns org.nd4j.linalg.dataset.api.iterator.KFoldIterator
  "Splits a dataset (represented as a single DataSet object) into k folds.
 DataSet is duplicated in memory once
 call .next() to get the k-1 folds to train on and call .testfold() to get the corresponding kth fold for testing"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.iterator KFoldIterator]))

(defn ->k-fold-iterator
  "Constructor.

  Create an iterator given the dataset and a value of k (optional, defaults to 10)
  If number of samples in the dataset is not a multiple of k, the last fold will have less samples with the rest having the same number of samples.

  k - number of folds (optional, defaults to 10) - `int`
  all-data - DataSet to split into k folds - `org.nd4j.linalg.dataset.DataSet`"
  (^KFoldIterator [^Integer k ^org.nd4j.linalg.dataset.DataSet all-data]
    (new KFoldIterator k all-data))
  (^KFoldIterator [^org.nd4j.linalg.dataset.DataSet all-data]
    (new KFoldIterator all-data)))

(defn test-fold
  "returns: the held out fold as a dataset - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^KFoldIterator this]
    (-> this (.testFold))))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^KFoldIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`

  throws: java.lang.UnsupportedOperationException"
  (^org.nd4j.linalg.dataset.DataSet [^KFoldIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^KFoldIterator this]
    (-> this (.next))))

(defn total-examples
  "Returns total number of examples in the dataset (all k folds)

  returns: total number of examples in the dataset including all k folds - `int`"
  (^Integer [^KFoldIterator this]
    (-> this (.totalExamples))))

(defn get-pre-processor
  "Description copied from interface: DataSetIterator

  returns: `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.DataSetPreProcessor [^KFoldIterator this]
    (-> this (.getPreProcessor))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^KFoldIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Shuffles the dataset and resets to the first fold"
  ([^KFoldIterator this]
    (-> this (.reset))))

(defn batch
  "The number of examples in every fold, except the last if totalexamples % k !=0

  returns: examples in a fold - `int`"
  (^Integer [^KFoldIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^KFoldIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^KFoldIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^KFoldIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^KFoldIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^KFoldIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^KFoldIterator this]
    (-> this (.resetSupported))))

(defn last-batch
  "The number of examples in the last fold
  if totalexamples % k == 0 same as the number of examples in every other fold

  returns: examples in the last fold - `int`"
  (^Integer [^KFoldIterator this]
    (-> this (.lastBatch))))

