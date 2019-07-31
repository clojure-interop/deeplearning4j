(ns org.deeplearning4j.datasets.fetchers.MnistDataFetcher
  "Data fetcher for the MNIST dataset"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.fetchers MnistDataFetcher]))

(defn ->mnist-data-fetcher
  "Constructor.

  Constructor telling whether to binarize the dataset or not

  binarize - whether to binarize the dataset or not - `boolean`

  throws: java.io.IOException"
  (^MnistDataFetcher [^Boolean binarize]
    (new MnistDataFetcher binarize))
  (^MnistDataFetcher [^Boolean binarize ^Boolean train ^Boolean shuffle ^Long rng-seed]
    (new MnistDataFetcher binarize train shuffle rng-seed))
  (^MnistDataFetcher []
    (new MnistDataFetcher )))

(def *-num-examples
  "Static Constant.

  type: int"
  MnistDataFetcher/NUM_EXAMPLES)

(def *-num-examples-test
  "Static Constant.

  type: int"
  MnistDataFetcher/NUM_EXAMPLES_TEST)

(defn fetch
  "Description copied from interface: DataSetFetcher

  num-examples - the number of examples to fetch - `int`"
  ([^MnistDataFetcher this ^Integer num-examples]
    (-> this (.fetch num-examples))))

(defn reset
  "Description copied from interface: DataSetFetcher"
  ([^MnistDataFetcher this]
    (-> this (.reset))))

(defn next
  "Description copied from interface: DataSetFetcher

  returns: the next dataset - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^MnistDataFetcher this]
    (-> this (.next))))

