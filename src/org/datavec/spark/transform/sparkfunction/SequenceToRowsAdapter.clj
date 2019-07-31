(ns org.datavec.spark.transform.sparkfunction.SequenceToRowsAdapter
  "Convert a record to a row"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.sparkfunction SequenceToRowsAdapter]))

(defn ->sequence-to-rows-adapter
  "Constructor.

  schema - `org.datavec.api.transform.schema.Schema`"
  (^SequenceToRowsAdapter [^org.datavec.api.transform.schema.Schema schema]
    (new SequenceToRowsAdapter schema)))

(defn call
  "sequence - `java.util.List`

  returns: `java.lang.Iterable<org.apache.spark.sql.Row>`

  throws: java.lang.Exception"
  (^java.lang.Iterable [^SequenceToRowsAdapter this ^java.util.List sequence]
    (-> this (.call sequence))))

