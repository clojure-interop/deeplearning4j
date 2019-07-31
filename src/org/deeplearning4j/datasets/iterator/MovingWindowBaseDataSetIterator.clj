(ns org.deeplearning4j.datasets.iterator.MovingWindowBaseDataSetIterator
  "DataSetIterator for moving window (rotating matrices)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator MovingWindowBaseDataSetIterator]))

(defn ->moving-window-base-data-set-iterator
  "Constructor.

  batch - `int`
  num-examples - `int`
  data - `org.nd4j.linalg.dataset.DataSet`
  window-rows - `int`
  window-columns - `int`"
  (^MovingWindowBaseDataSetIterator [^Integer batch ^Integer num-examples ^org.nd4j.linalg.dataset.DataSet data ^Integer window-rows ^Integer window-columns]
    (new MovingWindowBaseDataSetIterator batch num-examples data window-rows window-columns)))

