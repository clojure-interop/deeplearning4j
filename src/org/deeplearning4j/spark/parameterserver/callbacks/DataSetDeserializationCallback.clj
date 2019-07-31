(ns org.deeplearning4j.spark.parameterserver.callbacks.DataSetDeserializationCallback
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.callbacks DataSetDeserializationCallback]))

(defn ->data-set-deserialization-callback
  "Constructor."
  (^DataSetDeserializationCallback []
    (new DataSetDeserializationCallback )))

(defn compute
  "Description copied from interface: PortableDataStreamCallback

  pds - `org.apache.spark.input.PortableDataStream`

  returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^DataSetDeserializationCallback this ^org.apache.spark.input.PortableDataStream pds]
    (-> this (.compute pds))))

