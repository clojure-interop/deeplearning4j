(ns org.deeplearning4j.datasets.iterator.RandomDataSetIterator
  "RandomDataSetIterator: Generates random values (or zeros, ones, integers, etc) according to some distribution.
 Note: This is typically used for testing, debugging and benchmarking purposes."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator RandomDataSetIterator]))

(defn ->random-data-set-iterator
  "Constructor.

  num-mini-batches - `int`
  features-shape - `long[]`
  labels-shape - `long[]`
  feature-values - `org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values`
  label-values - `org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values`
  features-order - `char`
  labels-order - `char`"
  (^RandomDataSetIterator [^Integer num-mini-batches features-shape labels-shape ^org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values feature-values ^org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values label-values ^Character features-order ^Character labels-order]
    (new RandomDataSetIterator num-mini-batches features-shape labels-shape feature-values label-values features-order labels-order))
  (^RandomDataSetIterator [^Integer num-mini-batches features-shape labels-shape ^org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values feature-values ^org.deeplearning4j.datasets.iterator.RandomDataSetIterator$Values label-values]
    (new RandomDataSetIterator num-mini-batches features-shape labels-shape feature-values label-values)))

