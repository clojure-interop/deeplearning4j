(ns org.deeplearning4j.datasets.iterator.SamplingDataSetIterator
  "A wrapper for a dataset to sample from.
 This will randomly sample from the given dataset."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator SamplingDataSetIterator]))

(defn ->sampling-data-set-iterator
  "Constructor.

  sample-from - the dataset to sample from - `org.nd4j.linalg.dataset.DataSet`
  batch-size - the batch size to sample - `int`
  total-number-samples - the sample size - `int`"
  (^SamplingDataSetIterator [^org.nd4j.linalg.dataset.DataSet sample-from ^Integer batch-size ^Integer total-number-samples]
    (new SamplingDataSetIterator sample-from batch-size total-number-samples)))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^SamplingDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^SamplingDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^SamplingDataSetIterator this]
    (-> this (.next))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^SamplingDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^SamplingDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^SamplingDataSetIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^SamplingDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^SamplingDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SamplingDataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^SamplingDataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^SamplingDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^SamplingDataSetIterator this]
    (-> this (.resetSupported))))

