(ns org.deeplearning4j.api.loader.impl.SerializedMultiDataSetLoader
  "Loads DataSets using MultiDataSet.load(InputStream)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.api.loader.impl SerializedMultiDataSetLoader]))

(defn ->serialized-multi-data-set-loader
  "Constructor."
  (^SerializedMultiDataSetLoader []
    (new SerializedMultiDataSetLoader )))

(defn load
  "source - `org.nd4j.api.loader.Source`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`

  throws: java.io.IOException"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^SerializedMultiDataSetLoader this ^org.nd4j.api.loader.Source source]
    (-> this (.load source))))

