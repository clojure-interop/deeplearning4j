(ns org.deeplearning4j.datasets.iterator.CombinedPreProcessor
  "This is special preProcessor, that allows to combine multiple prerpocessors, and apply them to data sequentially."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.iterator CombinedPreProcessor]))

(defn pre-process
  "Pre process a dataset sequentially

  to-pre-process - the data set to pre process - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^CombinedPreProcessor this ^org.nd4j.linalg.dataset.api.DataSet to-pre-process]
    (-> this (.preProcess to-pre-process))))

