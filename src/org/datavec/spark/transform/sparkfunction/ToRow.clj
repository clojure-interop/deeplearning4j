(ns org.datavec.spark.transform.sparkfunction.ToRow
  "Convert a record to a row"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.sparkfunction ToRow]))

(defn ->to-row
  "Constructor.

  schema - `org.datavec.api.transform.schema.Schema`"
  (^ToRow [^org.datavec.api.transform.schema.Schema schema]
    (new ToRow schema)))

(defn call
  "v-1 - `java.util.List`

  returns: `org.apache.spark.sql.Row`

  throws: java.lang.Exception"
  (^org.apache.spark.sql.Row [^ToRow this ^java.util.List v-1]
    (-> this (.call v-1))))

