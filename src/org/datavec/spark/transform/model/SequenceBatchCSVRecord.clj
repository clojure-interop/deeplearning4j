(ns org.datavec.spark.transform.model.SequenceBatchCSVRecord
  "Created by agibsonccc on 1/21/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.model SequenceBatchCSVRecord]))

(defn ->sequence-batch-csv-record
  "Constructor."
  (^SequenceBatchCSVRecord []
    (new SequenceBatchCSVRecord )))

(defn *from-writables
  "Convert a writables time series to a sequence batch

  input - `java.util.List`

  returns: `org.datavec.spark.transform.model.SequenceBatchCSVRecord`"
  (^org.datavec.spark.transform.model.SequenceBatchCSVRecord [^java.util.List input]
    (SequenceBatchCSVRecord/fromWritables input)))

(defn *from-data-set
  "Return a batch record based on a dataset

  data-set - the dataset to get the batch record for - `org.nd4j.linalg.dataset.MultiDataSet`

  returns: the batch record - `org.datavec.spark.transform.model.SequenceBatchCSVRecord`"
  (^org.datavec.spark.transform.model.SequenceBatchCSVRecord [^org.nd4j.linalg.dataset.MultiDataSet data-set]
    (SequenceBatchCSVRecord/fromDataSet data-set)))

(defn add
  "Add a record

  record - `java.util.List`"
  ([^SequenceBatchCSVRecord this ^java.util.List record]
    (-> this (.add record))))

(defn get-records-as-string
  "Get the records as a list of strings directly
  (this basically \"unpacks\" the objects)

  returns: `java.util.List<java.util.List<java.util.List<java.lang.String>>>`"
  (^java.util.List [^SequenceBatchCSVRecord this]
    (-> this (.getRecordsAsString))))

