(ns org.deeplearning4j.datasets.fetchers.IrisDataFetcher
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.fetchers IrisDataFetcher]))

(defn ->iris-data-fetcher
  "Constructor."
  (^IrisDataFetcher []
    (new IrisDataFetcher )))

(def *-num-examples
  "Static Constant.

  type: int"
  IrisDataFetcher/NUM_EXAMPLES)

(defn fetch
  "Description copied from interface: DataSetFetcher

  num-examples - the number of examples to fetch - `int`"
  ([^IrisDataFetcher this ^Integer num-examples]
    (-> this (.fetch num-examples))))

