(ns org.deeplearning4j.datasets.iterator.callbacks.DataSetCallback
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.callbacks DataSetCallback]))

(defn call
  "data-set - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^DataSetCallback this ^org.nd4j.linalg.dataset.api.DataSet data-set]
    (-> this (.call data-set))))

(defn reset
  ""
  ([^DataSetCallback this]
    (-> this (.reset))))

