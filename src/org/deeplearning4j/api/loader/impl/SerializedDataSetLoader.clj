(ns org.deeplearning4j.api.loader.impl.SerializedDataSetLoader
  "Loads DataSets using DataSet.load(InputStream)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.api.loader.impl SerializedDataSetLoader]))

(defn ->serialized-data-set-loader
  "Constructor."
  (^SerializedDataSetLoader []
    (new SerializedDataSetLoader )))

(defn load
  "source - `org.nd4j.api.loader.Source`

  returns: `org.nd4j.linalg.dataset.DataSet`

  throws: java.io.IOException"
  (^org.nd4j.linalg.dataset.DataSet [^SerializedDataSetLoader this ^org.nd4j.api.loader.Source source]
    (-> this (.load source))))

