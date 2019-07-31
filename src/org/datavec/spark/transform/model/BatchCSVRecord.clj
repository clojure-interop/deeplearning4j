(ns org.datavec.spark.transform.model.BatchCSVRecord
  "Created by agibsonccc on 1/21/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.model BatchCSVRecord]))

(defn ->batch-csv-record
  "Constructor."
  (^BatchCSVRecord []
    (new BatchCSVRecord )))

(defn *from-writables
  "Create a batch csv record
  from a list of writables.

  batch - `java.util.List`

  returns: `org.datavec.spark.transform.model.BatchCSVRecord`"
  (^org.datavec.spark.transform.model.BatchCSVRecord [^java.util.List batch]
    (BatchCSVRecord/fromWritables batch)))

(defn *from-data-set
  "Return a batch record based on a dataset

  data-set - the dataset to get the batch record for - `org.nd4j.linalg.dataset.DataSet`

  returns: the batch record - `org.datavec.spark.transform.model.BatchCSVRecord`"
  (^org.datavec.spark.transform.model.BatchCSVRecord [^org.nd4j.linalg.dataset.DataSet data-set]
    (BatchCSVRecord/fromDataSet data-set)))

(defn get-records-as-string
  "Get the records as a list of strings
  (basically the underlying values for
  SingleCSVRecord)

  returns: `java.util.List<java.util.List<java.lang.String>>`"
  (^java.util.List [^BatchCSVRecord this]
    (-> this (.getRecordsAsString))))

(defn add
  "Add a record

  record - `org.datavec.spark.transform.model.SingleCSVRecord`"
  ([^BatchCSVRecord this ^org.datavec.spark.transform.model.SingleCSVRecord record]
    (-> this (.add record))))

