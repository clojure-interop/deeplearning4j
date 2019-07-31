(ns org.deeplearning4j.datasets.iterator.DataSetFetcher
  "Deprecated.
 Retained for legacy purposes, will be removed in a future release"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator DataSetFetcher]))

(defn has-more?
  "Deprecated.

  returns: whether the data applyTransformToDestination has more to load - `boolean`"
  (^Boolean [^DataSetFetcher this]
    (-> this (.hasMore))))

(defn next
  "Deprecated.

  returns: the next dataset - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^DataSetFetcher this]
    (-> this (.next))))

(defn fetch
  "Deprecated.

  num-examples - the number of examples to fetch - `int`"
  ([^DataSetFetcher this ^Integer num-examples]
    (-> this (.fetch num-examples))))

(defn total-outcomes
  "Deprecated.

  returns: the number of labels for a dataset - `int`"
  (^Integer [^DataSetFetcher this]
    (-> this (.totalOutcomes))))

(defn input-columns
  "Deprecated.

  returns: the length of a feature vector for an individual example - `int`"
  (^Integer [^DataSetFetcher this]
    (-> this (.inputColumns))))

(defn total-examples
  "Deprecated.

  returns: the total number of examples - `int`"
  (^Integer [^DataSetFetcher this]
    (-> this (.totalExamples))))

(defn reset
  "Deprecated."
  ([^DataSetFetcher this]
    (-> this (.reset))))

(defn cursor
  "Deprecated.

  returns: a cursor similar to an index - `int`"
  (^Integer [^DataSetFetcher this]
    (-> this (.cursor))))

