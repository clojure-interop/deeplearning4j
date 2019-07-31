(ns org.deeplearning4j.nn.graph.util.ComputationGraphUtil
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.graph.util ComputationGraphUtil]))

(defn *to-multi-data-set
  "Convert a DataSet to the equivalent MultiDataSet

  data-set - `org.nd4j.linalg.dataset.api.DataSet`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^org.nd4j.linalg.dataset.api.DataSet data-set]
    (ComputationGraphUtil/toMultiDataSet data-set)))

(defn *to-multi-data-set-iterator
  "Convert a DataSetIterator to a MultiDataSetIterator, via an adaptor class

  iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`

  returns: `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`"
  (^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (ComputationGraphUtil/toMultiDataSetIterator iterator)))

