(ns org.deeplearning4j.datasets.iterator.impl.IrisDataSetIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.impl IrisDataSetIterator]))

(defn ->iris-data-set-iterator
  "Constructor.

  IrisDataSetIterator handles
  traversing through the Iris Data Set.

  batch - `int`
  num-examples - `int`"
  (^IrisDataSetIterator [^Integer batch ^Integer num-examples]
    (new IrisDataSetIterator batch num-examples)))

(defn next
  "returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^IrisDataSetIterator this]
    (-> this (.next))))

