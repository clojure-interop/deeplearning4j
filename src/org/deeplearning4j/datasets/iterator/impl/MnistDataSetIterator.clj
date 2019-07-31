(ns org.deeplearning4j.datasets.iterator.impl.MnistDataSetIterator
  "Mnist data applyTransformToDestination iterator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.impl MnistDataSetIterator]))

(defn ->mnist-data-set-iterator
  "Constructor.

  Get the specified number of MNIST examples (test or train set), with optional shuffling and binarization.

  batch - Size of each patch - `int`
  num-examples - total number of examples to load - `int`
  binarize - whether to binarize the data or not (if false: normalize in range 0 to 1) - `boolean`
  train - Train vs. test set - `boolean`
  shuffle - whether to shuffle the examples - `boolean`
  rng-seed - random number generator seed to use when shuffling examples - `long`

  throws: java.io.IOException"
  (^MnistDataSetIterator [^Integer batch ^Integer num-examples ^Boolean binarize ^Boolean train ^Boolean shuffle ^Long rng-seed]
    (new MnistDataSetIterator batch num-examples binarize train shuffle rng-seed))
  (^MnistDataSetIterator [^Integer batch ^Integer num-examples ^Boolean binarize]
    (new MnistDataSetIterator batch num-examples binarize))
  (^MnistDataSetIterator [^Integer batch ^Integer num-examples]
    (new MnistDataSetIterator batch num-examples)))

