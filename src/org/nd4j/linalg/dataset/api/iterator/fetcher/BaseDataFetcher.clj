(ns org.nd4j.linalg.dataset.api.iterator.fetcher.BaseDataFetcher
  "A base class for assisting with creation of matrices
 with the data transform fetcher"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.iterator.fetcher BaseDataFetcher]))

(defn ->base-data-fetcher
  "Constructor."
  (^BaseDataFetcher []
    (new BaseDataFetcher )))

(defn has-more?
  "Description copied from interface: DataSetFetcher

  returns: whether the data applyTransformToDestination has more to load - `boolean`"
  (^Boolean [^BaseDataFetcher this]
    (-> this (.hasMore))))

(defn next
  "Description copied from interface: DataSetFetcher

  returns: the next dataset - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^BaseDataFetcher this]
    (-> this (.next))))

(defn total-outcomes
  "Description copied from interface: DataSetFetcher

  returns: the number of labels for a dataset - `int`"
  (^Integer [^BaseDataFetcher this]
    (-> this (.totalOutcomes))))

(defn input-columns
  "Description copied from interface: DataSetFetcher

  returns: the length of a feature vector for an individual example - `int`"
  (^Integer [^BaseDataFetcher this]
    (-> this (.inputColumns))))

(defn total-examples
  "Description copied from interface: DataSetFetcher

  returns: the total number of examples - `int`"
  (^Integer [^BaseDataFetcher this]
    (-> this (.totalExamples))))

(defn reset
  "Description copied from interface: DataSetFetcher"
  ([^BaseDataFetcher this]
    (-> this (.reset))))

(defn cursor
  "Description copied from interface: DataSetFetcher

  returns: a cursor similar to an index - `int`"
  (^Integer [^BaseDataFetcher this]
    (-> this (.cursor))))

