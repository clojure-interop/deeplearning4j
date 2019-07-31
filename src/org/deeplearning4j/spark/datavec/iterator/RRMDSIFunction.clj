(ns org.deeplearning4j.spark.datavec.iterator.RRMDSIFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.datavec.iterator RRMDSIFunction]))

(defn ->rrmdsi-function
  "Constructor."
  (^RRMDSIFunction []
    (new RRMDSIFunction )))

(defn call
  "records - `org.deeplearning4j.spark.datavec.iterator.DataVecRecords`

  returns: `org.nd4j.linalg.dataset.api.MultiDataSet`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.dataset.api.MultiDataSet [^RRMDSIFunction this ^org.deeplearning4j.spark.datavec.iterator.DataVecRecords records]
    (-> this (.call records))))

