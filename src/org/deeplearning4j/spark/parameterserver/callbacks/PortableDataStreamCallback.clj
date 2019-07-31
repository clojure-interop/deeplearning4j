(ns org.deeplearning4j.spark.parameterserver.callbacks.PortableDataStreamCallback
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.callbacks PortableDataStreamCallback]))

(defn compute
  "This method should do something, and return DataSet after all

  pds - `org.apache.spark.input.PortableDataStream`

  returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^PortableDataStreamCallback this ^org.apache.spark.input.PortableDataStream pds]
    (-> this (.compute pds))))

