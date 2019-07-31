(ns org.datavec.spark.transform.model.BatchImageRecord
  "Created by kepricon on 17. 5. 24."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.model BatchImageRecord]))

(defn ->batch-image-record
  "Constructor."
  (^BatchImageRecord []
    (new BatchImageRecord )))

(defn add
  "Add a record

  record - `org.datavec.spark.transform.model.SingleImageRecord`"
  ([^BatchImageRecord this ^org.datavec.spark.transform.model.SingleImageRecord record]
    (-> this (.add record))))

