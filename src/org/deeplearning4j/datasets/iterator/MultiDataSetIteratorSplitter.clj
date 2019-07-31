(ns org.deeplearning4j.datasets.iterator.MultiDataSetIteratorSplitter
  "This iterator virtually splits given MultiDataSetIterator into Train and Test parts.
 I.e. you have 100000 examples. Your batch size is 32. That means you have 3125 total batches. With split ratio of 0.7 that will give you 2187 training batches, and 938 test batches.
 PLEASE NOTE: You can't use Test iterator twice in a row. Train iterator should be used before Test iterator use.
 PLEASE NOTE: You can't use this iterator, if underlying iterator uses randomization/shuffle between epochs."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator MultiDataSetIteratorSplitter]))

(defn ->multi-data-set-iterator-splitter
  "Constructor.

  base-iterator - `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`
  total-batches - - total number of batches in underlying iterator. this value will be used to determine number of test/train batches - `long`
  ratio - - this value will be used as splitter. should be between in range of 0.0 > X < 1.0. I.e. if value 0.7 is provided, then 70% of total examples will be used for training, and 30% of total examples will be used for testing - `double`"
  (^MultiDataSetIteratorSplitter [^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator base-iterator ^Long total-batches ^Double ratio]
    (new MultiDataSetIteratorSplitter base-iterator total-batches ratio)))

(defn get-train-iterator
  "This method returns train iterator instance

  returns: `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`"
  (^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator [^MultiDataSetIteratorSplitter this]
    (-> this (.getTrainIterator))))

(defn get-test-iterator
  "This method returns test iterator instance

  returns: `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`"
  (^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator [^MultiDataSetIteratorSplitter this]
    (-> this (.getTestIterator))))

