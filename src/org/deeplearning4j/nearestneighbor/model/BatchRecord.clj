(ns org.deeplearning4j.nearestneighbor.model.BatchRecord
  "Created by agibsonccc on 1/21/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nearestneighbor.model BatchRecord]))

(defn ->batch-record
  "Constructor."
  (^BatchRecord []
    (new BatchRecord )))

(defn *from-data-set
  "Return a batch record based on a dataset

  data-set - the dataset to get the batch record for - `org.nd4j.linalg.dataset.DataSet`

  returns: the batch record - `org.deeplearning4j.nearestneighbor.model.BatchRecord`"
  (^org.deeplearning4j.nearestneighbor.model.BatchRecord [^org.nd4j.linalg.dataset.DataSet data-set]
    (BatchRecord/fromDataSet data-set)))

(defn add
  "Add a record

  record - `org.deeplearning4j.nearestneighbor.model.CSVRecord`"
  ([^BatchRecord this ^org.deeplearning4j.nearestneighbor.model.CSVRecord record]
    (-> this (.add record))))

