(ns org.deeplearning4j.datasets.iterator.DummyPreProcessor
  "This is special dummy preProcessor, that does nothing."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator DummyPreProcessor]))

(defn ->dummy-pre-processor
  "Constructor."
  (^DummyPreProcessor []
    (new DummyPreProcessor )))

(defn pre-process
  "Pre process a dataset

  to-pre-process - the data set to pre process - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^DummyPreProcessor this ^org.nd4j.linalg.dataset.api.DataSet to-pre-process]
    (-> this (.preProcess to-pre-process))))

