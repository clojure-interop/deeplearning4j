(ns org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator RandomMultiDataSetIterator$Builder]))

(defn ->builder
  "Constructor.

  num-mini-batches - Number of minibatches per epoch - `int`"
  (^RandomMultiDataSetIterator$Builder [^Integer num-mini-batches]
    (new RandomMultiDataSetIterator$Builder num-mini-batches)))

(defn add-features
  "Add a new features array to the iterator

  shape - Shape of the features - `long[]`
  order - Order ('c' or 'f') for the array - `char`
  values - Values to fill the array with - `org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Values`

  returns: `org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Builder [^RandomMultiDataSetIterator$Builder this shape ^Character order ^org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Values values]
    (-> this (.addFeatures shape order values)))
  (^org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Builder [^RandomMultiDataSetIterator$Builder this shape ^org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Values values]
    (-> this (.addFeatures shape values))))

(defn add-labels
  "Add a new labels array to the iterator

  shape - Shape of the features - `long[]`
  order - Order ('c' or 'f') for the array - `char`
  values - Values to fill the array with - `org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Values`

  returns: `org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Builder [^RandomMultiDataSetIterator$Builder this shape ^Character order ^org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Values values]
    (-> this (.addLabels shape order values)))
  (^org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Builder [^RandomMultiDataSetIterator$Builder this shape ^org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Values values]
    (-> this (.addLabels shape values))))

(defn build
  "returns: `org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator`"
  (^org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator [^RandomMultiDataSetIterator$Builder this]
    (-> this (.build))))

