(ns org.deeplearning4j.datasets.iterator.impl.UciSequenceDataSetIterator
  "UCI synthetic control chart time series dataset. This dataset is useful for classification of univariate
 time series with six categories:
 Normal, Cyclic, Increasing trend, Decreasing trend, Upward shift, Downward shift
 Details: https://archive.ics.uci.edu/ml/datasets/Synthetic+Control+Chart+Time+Series
 Data: https://archive.ics.uci.edu/ml/machine-learning-databases/synthetic_control-mld/synthetic_control.data
 Image: https://archive.ics.uci.edu/ml/machine-learning-databases/synthetic_control-mld/data.jpeg"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.impl UciSequenceDataSetIterator]))

(defn ->uci-sequence-data-set-iterator
  "Constructor.

  batch-size - `int`
  set - `org.deeplearning4j.datasets.fetchers.DataSetType`
  rng-seed - `long`"
  (^UciSequenceDataSetIterator [^Integer batch-size ^org.deeplearning4j.datasets.fetchers.DataSetType set ^Long rng-seed]
    (new UciSequenceDataSetIterator batch-size set rng-seed))
  (^UciSequenceDataSetIterator [^Integer batch-size ^org.deeplearning4j.datasets.fetchers.DataSetType set]
    (new UciSequenceDataSetIterator batch-size set))
  (^UciSequenceDataSetIterator [^Integer batch-size]
    (new UciSequenceDataSetIterator batch-size)))

