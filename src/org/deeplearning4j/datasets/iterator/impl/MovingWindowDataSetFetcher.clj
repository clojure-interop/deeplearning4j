(ns org.deeplearning4j.datasets.iterator.impl.MovingWindowDataSetFetcher
  "Moving window data fetcher. Handles rotation of matrices in all directions
 to generate more examples."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.impl MovingWindowDataSetFetcher]))

(defn ->moving-window-data-set-fetcher
  "Constructor.

  data - `org.nd4j.linalg.dataset.DataSet`
  window-rows - `int`
  window-columns - `int`"
  (^MovingWindowDataSetFetcher [^org.nd4j.linalg.dataset.DataSet data ^Integer window-rows ^Integer window-columns]
    (new MovingWindowDataSetFetcher data window-rows window-columns)))

(defn fetch
  "Fetches the next dataset. You need to call this
  to get a new dataset, otherwise BaseDataFetcher.next()
  just returns the last data applyTransformToDestination fetch

  num-examples - the number of examples to fetch - `int`"
  ([^MovingWindowDataSetFetcher this ^Integer num-examples]
    (-> this (.fetch num-examples))))

