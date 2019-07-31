(ns org.deeplearning4j.datasets.iterator.EarlyTerminationDataSetIterator
  "Builds an iterator that terminates once the number of minibatches returned with .next() is equal to a specified number
 Note that a call to .next(num) is counted as a call to return a minibatch regardless of the value of num
 This essentially restricts the data to this specified number of minibatches."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator EarlyTerminationDataSetIterator]))

(defn ->early-termination-data-set-iterator
  "Constructor.

  Constructor takes the iterator to wrap and the number of minibatches after which the call to hasNext()
  will return false

  underlying-iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  termination-point - `int`"
  (^EarlyTerminationDataSetIterator [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator underlying-iterator ^Integer termination-point]
    (new EarlyTerminationDataSetIterator underlying-iterator termination-point)))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^EarlyTerminationDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^EarlyTerminationDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^EarlyTerminationDataSetIterator this]
    (-> this (.next))))

(defn get-pre-processor
  "Description copied from interface: DataSetIterator

  returns: `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.DataSetPreProcessor [^EarlyTerminationDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^EarlyTerminationDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^EarlyTerminationDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^EarlyTerminationDataSetIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^EarlyTerminationDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^EarlyTerminationDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^EarlyTerminationDataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^EarlyTerminationDataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^EarlyTerminationDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^EarlyTerminationDataSetIterator this]
    (-> this (.resetSupported))))

