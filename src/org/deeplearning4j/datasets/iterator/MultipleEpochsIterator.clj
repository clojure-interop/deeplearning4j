(ns org.deeplearning4j.datasets.iterator.MultipleEpochsIterator
  "Deprecated.
 Does not properly trigger the incrementing of epoch counts in MultiLayerNetwork/ComputationGraph.
 Use MultiLayerNetwork/ComputationGraph.fit(DataSetIterator, int numEpochs) instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator MultipleEpochsIterator]))

(defn ->multiple-epochs-iterator
  "Constructor.

  Deprecated.

  num-epochs - `int`
  iter - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  (^MultipleEpochsIterator [^Integer num-epochs ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iter]
    (new MultipleEpochsIterator num-epochs iter))
  (^MultipleEpochsIterator [^Integer num-epochs ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iter ^Integer queue-size]
    (new MultipleEpochsIterator num-epochs iter queue-size)))

(defn input-columns
  "Deprecated.

  returns: `int`"
  (^Integer [^MultipleEpochsIterator this]
    (-> this (.inputColumns))))

(defn next
  "Deprecated.

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^MultipleEpochsIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^MultipleEpochsIterator this]
    (-> this (.next))))

(defn total-outcomes
  "Deprecated.

  returns: `int`"
  (^Integer [^MultipleEpochsIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Deprecated."
  ([^MultipleEpochsIterator this]
    (-> this (.reset))))

(defn batch
  "Deprecated.

  returns: `int`"
  (^Integer [^MultipleEpochsIterator this]
    (-> this (.batch))))

(defn async-supported
  "Deprecated.

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^MultipleEpochsIterator this]
    (-> this (.asyncSupported))))

(defn remove
  "Deprecated.

  throws: java.lang.UnsupportedOperationException - if the removeoperation is not supported by this iterator"
  ([^MultipleEpochsIterator this]
    (-> this (.remove))))

(defn get-labels
  "Deprecated.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^MultipleEpochsIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Deprecated.

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^MultipleEpochsIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "Deprecated.

  returns: true if the iteration has more elements - `boolean`"
  (^Boolean [^MultipleEpochsIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Deprecated.

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^MultipleEpochsIterator this]
    (-> this (.resetSupported))))

(defn track-epochs
  "Deprecated."
  ([^MultipleEpochsIterator this]
    (-> this (.trackEpochs))))

