(ns org.deeplearning4j.datasets.iterator.CombinedMultiDataSetPreProcessor
  "Combines various multidataset preprocessors
 Applied in the order they are specified to in the builder"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator CombinedMultiDataSetPreProcessor]))

(defn pre-process
  "Description copied from interface: MultiDataSetPreProcessor

  multi-data-set - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  ([^CombinedMultiDataSetPreProcessor this ^org.nd4j.linalg.dataset.api.MultiDataSet multi-data-set]
    (-> this (.preProcess multi-data-set))))

