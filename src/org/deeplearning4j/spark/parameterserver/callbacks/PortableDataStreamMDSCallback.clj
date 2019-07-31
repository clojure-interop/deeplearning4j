(ns org.deeplearning4j.spark.parameterserver.callbacks.PortableDataStreamMDSCallback
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.callbacks PortableDataStreamMDSCallback]))

(defn compute
  "This method should do something, and return DataSet after all

  pds - `org.apache.spark.input.PortableDataStream`

  returns: `org.nd4j.linalg.dataset.MultiDataSet`"
  (^org.nd4j.linalg.dataset.MultiDataSet [^PortableDataStreamMDSCallback this ^org.apache.spark.input.PortableDataStream pds]
    (-> this (.compute pds))))

