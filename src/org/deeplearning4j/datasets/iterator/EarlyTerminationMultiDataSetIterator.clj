(ns org.deeplearning4j.datasets.iterator.EarlyTerminationMultiDataSetIterator
  "Builds an iterator that terminates once the number of minibatches returned with .next() is equal to a specified number
 Note that a call to .next(num) is counted as a call to return a minibatch regardless of the value of num
 This essentially restricts the data to this specified number of minibatches."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator EarlyTerminationMultiDataSetIterator]))

(defn ->early-termination-multi-data-set-iterator
  "Constructor.

  Constructor takes the iterator to wrap and the number of minibatches after which the call to hasNext()
  will return false

  underlying-iterator - `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`
  termination-point - `int`"
  (^EarlyTerminationMultiDataSetIterator [^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator underlying-iterator ^Integer termination-point]
    (new EarlyTerminationMultiDataSetIterator underlying-iterator termination-point)))

(defn next
  "Description copied from interface: MultiDataSetIterator

  num - Number of examples to fetch - `int`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^EarlyTerminationMultiDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^EarlyTerminationMultiDataSetIterator this]
    (-> this (.next))))

(defn set-pre-processor
  "Description copied from interface: MultiDataSetIterator

  pre-processor - MultiDataSetPreProcessor. May be null. - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  ([^EarlyTerminationMultiDataSetIterator this ^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn get-pre-processor
  "Description copied from interface: MultiDataSetIterator

  returns: Preprocessor - `org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor [^EarlyTerminationMultiDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn reset-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^EarlyTerminationMultiDataSetIterator this]
    (-> this (.resetSupported))))

(defn async-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^EarlyTerminationMultiDataSetIterator this]
    (-> this (.asyncSupported))))

(defn reset
  "Description copied from interface: MultiDataSetIterator"
  ([^EarlyTerminationMultiDataSetIterator this]
    (-> this (.reset))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^EarlyTerminationMultiDataSetIterator this]
    (-> this (.hasNext))))

(defn remove
  ""
  ([^EarlyTerminationMultiDataSetIterator this]
    (-> this (.remove))))

