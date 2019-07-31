(ns org.deeplearning4j.datasets.iterator.callbacks.DefaultCallback
  "This callback ensures that memory on device is up-to-date with host memory.
 PLEASE NOTE: This callback is used by default, no need to set it explicitly in AsyncDataSet iterators"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.callbacks DefaultCallback]))

(defn ->default-callback
  "Constructor."
  (^DefaultCallback []
    (new DefaultCallback )))

(defn call
  "data-set - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^DefaultCallback this ^org.nd4j.linalg.dataset.api.DataSet data-set]
    (-> this (.call data-set))))

(defn reset
  ""
  ([^DefaultCallback this]
    (-> this (.reset))))

