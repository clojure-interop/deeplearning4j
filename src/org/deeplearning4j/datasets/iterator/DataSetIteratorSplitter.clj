(ns org.deeplearning4j.datasets.iterator.DataSetIteratorSplitter
  "This iterator virtually splits given MultiDataSetIterator into Train and Test parts.
 I.e. you have 100000 examples. Your batch size is 32. That means you have 3125 total batches. With split ratio of 0.7 that will give you 2187 training batches, and 938 test batches.
 PLEASE NOTE: You can't use Test iterator twice in a row. Train iterator should be used before Test iterator use.
 PLEASE NOTE: You can't use this iterator, if underlying iterator uses randomization/shuffle between epochs."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator DataSetIteratorSplitter]))

(defn ->data-set-iterator-splitter
  "Constructor.

  The only constructor

  base-iterator - - iterator to be wrapped and split - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  total-batches - - total batches in baseIterator - `long`
  ratio - - train/test split ratio - `double`"
  (^DataSetIteratorSplitter [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator base-iterator ^Long total-batches ^Double ratio]
    (new DataSetIteratorSplitter base-iterator total-batches ratio)))

(defn get-train-iterator
  "This method returns train iterator instance

  returns: `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  (^org.nd4j.linalg.dataset.api.iterator.DataSetIterator [^DataSetIteratorSplitter this]
    (-> this (.getTrainIterator))))

(defn get-test-iterator
  "This method returns test iterator instance

  returns: `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  (^org.nd4j.linalg.dataset.api.iterator.DataSetIterator [^DataSetIteratorSplitter this]
    (-> this (.getTestIterator))))

