(ns org.datavec.spark.transform.sparkfunction.ToRecord
  "Converts a row to a record"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.sparkfunction ToRecord]))

(defn ->to-record
  "Constructor."
  (^ToRecord []
    (new ToRecord )))

(defn call
  "v-1 - `org.apache.spark.sql.Row`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.lang.Exception"
  (^java.util.List [^ToRecord this ^org.apache.spark.sql.Row v-1]
    (-> this (.call v-1))))

