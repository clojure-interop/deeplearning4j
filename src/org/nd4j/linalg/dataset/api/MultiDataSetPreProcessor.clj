(ns org.nd4j.linalg.dataset.api.MultiDataSetPreProcessor
  "PreProcessor interface for MultiDataSets"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api MultiDataSetPreProcessor]))

(defn pre-process
  "Preprocess the MultiDataSet

  multi-data-set - `org.nd4j.linalg.dataset.api.MultiDataSet`"
  ([^MultiDataSetPreProcessor this ^org.nd4j.linalg.dataset.api.MultiDataSet multi-data-set]
    (-> this (.preProcess multi-data-set))))

