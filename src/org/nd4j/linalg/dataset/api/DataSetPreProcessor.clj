(ns org.nd4j.linalg.dataset.api.DataSetPreProcessor
  "Pre process a dataset"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api DataSetPreProcessor]))

(defn pre-process
  "Pre process a dataset

  to-pre-process - the data set to pre process - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^DataSetPreProcessor this ^org.nd4j.linalg.dataset.api.DataSet to-pre-process]
    (-> this (.preProcess to-pre-process))))

