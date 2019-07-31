(ns org.deeplearning4j.datasets.iterator.callbacks.InterleavedDataSetCallback
  "This callback migrates incoming datasets in round-robin manner, to ensure TDA for ParallelWrapper"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator.callbacks InterleavedDataSetCallback]))

(defn ->interleaved-data-set-callback
  "Constructor.

  buffer-size - `int`"
  (^InterleavedDataSetCallback [^Integer buffer-size]
    (new InterleavedDataSetCallback buffer-size)))

(defn call
  "data-set - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^InterleavedDataSetCallback this ^org.nd4j.linalg.dataset.api.DataSet data-set]
    (-> this (.call data-set))))

(defn reset
  ""
  ([^InterleavedDataSetCallback this]
    (-> this (.reset))))

