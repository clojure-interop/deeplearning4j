(ns org.deeplearning4j.datasets.fetchers.EmnistDataFetcher
  "Data fetcher for the EMNIST dataset"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.fetchers EmnistDataFetcher]))

(defn ->emnist-data-fetcher
  "Constructor.

  data-set - `org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set`
  binarize - `boolean`
  train - `boolean`
  shuffle - `boolean`
  rng-seed - `long`

  throws: java.io.IOException"
  (^EmnistDataFetcher [^org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set data-set ^Boolean binarize ^Boolean train ^Boolean shuffle ^Long rng-seed]
    (new EmnistDataFetcher data-set binarize train shuffle rng-seed)))

