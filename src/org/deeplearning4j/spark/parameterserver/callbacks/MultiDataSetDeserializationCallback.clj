(ns org.deeplearning4j.spark.parameterserver.callbacks.MultiDataSetDeserializationCallback
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.callbacks MultiDataSetDeserializationCallback]))

(defn ->multi-data-set-deserialization-callback
  "Constructor."
  (^MultiDataSetDeserializationCallback []
    (new MultiDataSetDeserializationCallback )))

(defn compute
  "Description copied from interface: PortableDataStreamMDSCallback

  pds - `org.apache.spark.input.PortableDataStream`

  returns: `org.nd4j.linalg.dataset.MultiDataSet`"
  (^org.nd4j.linalg.dataset.MultiDataSet [^MultiDataSetDeserializationCallback this ^org.apache.spark.input.PortableDataStream pds]
    (-> this (.compute pds))))

