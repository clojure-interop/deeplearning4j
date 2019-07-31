(ns org.nd4j.linalg.dataset.api.iterator.fetcher.DataSetFetcher
  "A low level interface for loading datasets in to memory.

 This is used by an DataSetIterator to

 handle the specifics of loading data in to memory."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.iterator.fetcher DataSetFetcher]))

(defn has-more?
  "Whether the dataset has more to load

  returns: whether the data applyTransformToDestination has more to load - `boolean`"
  (^Boolean [^DataSetFetcher this]
    (-> this (.hasMore))))

(defn next
  "Returns the next data applyTransformToDestination

  returns: the next dataset - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^DataSetFetcher this]
    (-> this (.next))))

(defn fetch
  "Fetches the next dataset. You need to call this
  to getFromOrigin a new dataset, otherwise next()
  just returns the last data applyTransformToDestination fetch

  num-examples - the number of examples to fetch - `int`"
  ([^DataSetFetcher this ^Integer num-examples]
    (-> this (.fetch num-examples))))

(defn total-outcomes
  "The number of labels for a dataset

  returns: the number of labels for a dataset - `int`"
  (^Integer [^DataSetFetcher this]
    (-> this (.totalOutcomes))))

(defn input-columns
  "The length of a feature vector for an individual example

  returns: the length of a feature vector for an individual example - `int`"
  (^Integer [^DataSetFetcher this]
    (-> this (.inputColumns))))

(defn total-examples
  "The total number of examples

  returns: the total number of examples - `int`"
  (^Integer [^DataSetFetcher this]
    (-> this (.totalExamples))))

(defn reset
  "Returns the fetcher back to the beginning of the dataset"
  ([^DataSetFetcher this]
    (-> this (.reset))))

(defn cursor
  "Direct access to a number represenative of iterating through a dataset

  returns: a cursor similar to an index - `int`"
  (^Integer [^DataSetFetcher this]
    (-> this (.cursor))))

