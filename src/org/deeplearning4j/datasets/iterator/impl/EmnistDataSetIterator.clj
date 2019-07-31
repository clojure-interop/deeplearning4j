(ns org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator
  "EMNIST DataSetIterator
 EMNIST is similar to the common MNIST dataset (available via MnistDataSetIterator), with 6 different splits/
 variants, specified by EmnistDataSetIterator.Set:

 COMPLETE: Also known as 'ByClass' split. 814,255 examples total (train  test), 62 classes
 MERGE: Also known as 'ByMerge' split. 814,255 examples total. 47 unbalanced classes. Combines lower and upper
 case characters (that are difficult to distinguish) into one class for each letter (instead of 2), for letters
 C, I, J, K, L, M, O, P, S, U, V, W, X, Y and Z
 BALANCED: 131,600 examples total. 47 classes (equal number of examples in each class)
 LETTERS: 145,600 examples total. 26 balanced classes
 DIGITS: 280,000 examples total. 10 balanced classes
 MNIST: 70,000 examples total. 10 balanced classes. Equivalent to the original MNIST dataset in
 MnistDataSetIterator


 See:
 https://www.nist.gov/itl/iad/image-group/emnist-dataset and
 https://arxiv.org/abs/1702.05373"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.impl EmnistDataSetIterator]))

(defn ->emnist-data-set-iterator
  "Constructor.

  Get the specified number of MNIST examples (test or train set), with optional shuffling and binarization.

  data-set - `org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set`
  batch - Size of each patch - `int`
  binarize - whether to binarize the data or not (if false: normalize in range 0 to 1) - `boolean`
  train - Train vs. test set - `boolean`
  shuffle - whether to shuffle the examples - `boolean`
  rng-seed - random number generator seed to use when shuffling examples - `long`

  throws: java.io.IOException"
  (^EmnistDataSetIterator [^org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set data-set ^Integer batch ^Boolean binarize ^Boolean train ^Boolean shuffle ^Long rng-seed]
    (new EmnistDataSetIterator data-set batch binarize train shuffle rng-seed))
  (^EmnistDataSetIterator [^org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set data-set ^Integer batch-size ^Boolean train ^Long seed]
    (new EmnistDataSetIterator data-set batch-size train seed))
  (^EmnistDataSetIterator [^org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set data-set ^Integer batch ^Boolean train]
    (new EmnistDataSetIterator data-set batch train)))

(defn *num-examples-train
  "Get the number of training examples for the specified subset

  data-set - Subset to get - `org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set`

  returns: Number of examples for the specified subset - `int`"
  (^Integer [^org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set data-set]
    (EmnistDataSetIterator/numExamplesTrain data-set)))

(defn *num-examples-test
  "Get the number of test examples for the specified subset

  data-set - Subset to get - `org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set`

  returns: Number of examples for the specified subset - `int`"
  (^Integer [^org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set data-set]
    (EmnistDataSetIterator/numExamplesTest data-set)))

(defn *num-labels
  "Get the number of labels for the specified subset

  data-set - Subset to get - `org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set`

  returns: Number of labels for the specified subset - `int`"
  (^Integer [^org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set data-set]
    (EmnistDataSetIterator/numLabels data-set)))

(defn *get-labels-array
  "Get the label assignments for the given set as a character array.

  data-set - DataSet to get the label assignment for - `org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set`

  returns: Label assignment and given dataset - `char[]`"
  ([^org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set data-set]
    (EmnistDataSetIterator/getLabelsArray data-set)))

(defn *get-labels
  "Get the label assignments for the given set as a List

  data-set - DataSet to get the label assignment for - `org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set`

  returns: Label assignment and given dataset - `java.util.List<java.lang.String>`"
  (^java.util.List [^org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set data-set]
    (EmnistDataSetIterator/getLabels data-set)))

(defn *balanced?
  "Are the labels balanced in the training set (that is: are the number of examples for each label equal?)

  data-set - Set to get balanced value for - `org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set`

  returns: True if balanced dataset, false otherwise - `boolean`"
  (^Boolean [^org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set data-set]
    (EmnistDataSetIterator/isBalanced data-set)))

(defn get-labels-arrays
  "Get the labels as a character array

  returns: Labels - `char[]`"
  ([^EmnistDataSetIterator this]
    (-> this (.getLabelsArrays))))

(defn get-labels
  "Get the labels as a List

  returns: Labels - `java.util.List<java.lang.String>`"
  (^java.util.List [^EmnistDataSetIterator this]
    (-> this (.getLabels))))

