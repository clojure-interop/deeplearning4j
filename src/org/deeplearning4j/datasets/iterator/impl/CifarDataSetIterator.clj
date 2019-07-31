(ns org.deeplearning4j.datasets.iterator.impl.CifarDataSetIterator
  "CifarDataSetIterator is an iterator for Cifar10 dataset explicitly
 There is a special preProcessor used to normalize the dataset based on Sergey Zagoruyko example
 https://github.com/szagoruyko/cifar.torch"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.impl CifarDataSetIterator]))

(defn ->cifar-data-set-iterator
  "Constructor.

  Create Cifar data specific iterator

  batch-size - the batch size of the examples - `int`
  num-examples - the overall number of examples - `int`
  img-dim - an array of height, width and channels - `int[]`
  num-possible-lables - `int`
  image-transform - the transformation to apply to the images - `org.datavec.image.transform.ImageTransform`
  use-special-pre-process-cifar - use Zagoruyko's preprocess for Cifar - `boolean`
  train - true if use training set and false for test - `boolean`
  rng-seed - Seed for RNG repeatability - `long`
  randomize - If true: randomize the iteration order of the images - `boolean`"
  (^CifarDataSetIterator [^Integer batch-size ^Integer num-examples img-dim ^Integer num-possible-lables ^org.datavec.image.transform.ImageTransform image-transform ^Boolean use-special-pre-process-cifar ^Boolean train ^Long rng-seed ^Boolean randomize]
    (new CifarDataSetIterator batch-size num-examples img-dim num-possible-lables image-transform use-special-pre-process-cifar train rng-seed randomize))
  (^CifarDataSetIterator [^Integer batch-size ^Integer num-examples img-dim ^Integer num-possible-lables ^org.datavec.image.transform.ImageTransform image-transform ^Boolean use-special-pre-process-cifar ^Boolean train]
    (new CifarDataSetIterator batch-size num-examples img-dim num-possible-lables image-transform use-special-pre-process-cifar train))
  (^CifarDataSetIterator [^Integer batch-size ^Integer num-examples img-dim ^Boolean use-special-pre-process-cifar ^Boolean train]
    (new CifarDataSetIterator batch-size num-examples img-dim use-special-pre-process-cifar train))
  (^CifarDataSetIterator [^Integer batch-size ^Integer num-examples img-dim ^Boolean train]
    (new CifarDataSetIterator batch-size num-examples img-dim train))
  (^CifarDataSetIterator [^Integer batch-size ^Integer num-examples ^Boolean train]
    (new CifarDataSetIterator batch-size num-examples train))
  (^CifarDataSetIterator [^Integer batch-size ^Integer num-examples]
    (new CifarDataSetIterator batch-size num-examples)))

(defn next
  "Description copied from interface: DataSetIterator

  batch-size - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^CifarDataSetIterator this ^Integer batch-size]
    (-> this (.next batch-size))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^CifarDataSetIterator this]
    (-> this (.hasNext))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^CifarDataSetIterator this]
    (-> this (.reset))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^CifarDataSetIterator this]
    (-> this (.resetSupported))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CifarDataSetIterator this]
    (-> this (.getLabels))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^CifarDataSetIterator this]
    (-> this (.asyncSupported))))

