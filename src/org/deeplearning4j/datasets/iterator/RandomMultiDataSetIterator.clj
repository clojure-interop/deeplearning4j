(ns org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator
  "RandomMultiDataSetIterator: Generates random values (or zeros, ones, integers, etc) according to some distribution.
 Note: This is typically used for testing, debugging and benchmarking purposes."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator RandomMultiDataSetIterator]))

(defn ->random-multi-data-set-iterator
  "Constructor.

  num-mini-batches - `int`
  features - `java.util.List`
  labels - `java.util.List`"
  (^RandomMultiDataSetIterator [^Integer num-mini-batches ^java.util.List features ^java.util.List labels]
    (new RandomMultiDataSetIterator num-mini-batches features labels)))

(defn *generate
  "Generate a random array with the specified shape and order

  shape - Shape of the array - `long[]`
  order - Order of array ('c' or 'f') - `char`
  values - Values to fill the array with - `org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Values`

  returns: Random array of specified shape  contents - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [shape ^Character order ^org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Values values]
    (RandomMultiDataSetIterator/generate shape order values))
  (^org.nd4j.linalg.api.ndarray.INDArray [shape ^org.deeplearning4j.datasets.iterator.RandomMultiDataSetIterator$Values values]
    (RandomMultiDataSetIterator/generate shape values)))

(defn next
  "Description copied from interface: MultiDataSetIterator

  i - Number of examples to fetch - `int`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^RandomMultiDataSetIterator this ^Integer i]
    (-> this (.next i)))
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^RandomMultiDataSetIterator this]
    (-> this (.next))))

(defn reset-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^RandomMultiDataSetIterator this]
    (-> this (.resetSupported))))

(defn async-supported
  "Description copied from interface: MultiDataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^RandomMultiDataSetIterator this]
    (-> this (.asyncSupported))))

(defn reset
  "Description copied from interface: MultiDataSetIterator"
  ([^RandomMultiDataSetIterator this]
    (-> this (.reset))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^RandomMultiDataSetIterator this]
    (-> this (.hasNext))))

(defn remove
  ""
  ([^RandomMultiDataSetIterator this]
    (-> this (.remove))))

