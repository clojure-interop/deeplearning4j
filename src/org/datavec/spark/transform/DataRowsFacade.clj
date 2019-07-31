(ns org.datavec.spark.transform.DataRowsFacade
  "Dataframe facade to hide incompatibilities between Spark 1.x and Spark 2.x
 This class should be used instead of direct referral to DataFrame / Dataset"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform DataRowsFacade]))

(defn *data-rows
  "df - `org.apache.spark.sql.DataFrame`

  returns: `org.datavec.spark.transform.DataRowsFacade`"
  (^org.datavec.spark.transform.DataRowsFacade [^org.apache.spark.sql.DataFrame df]
    (DataRowsFacade/dataRows df)))

(defn get
  "returns: `org.apache.spark.sql.DataFrame`"
  (^org.apache.spark.sql.DataFrame [^DataRowsFacade this]
    (-> this (.get))))

