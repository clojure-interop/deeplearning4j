(ns org.datavec.spark.transform.sparkfunction.SequenceToRows
  "Convert a record to a row"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.sparkfunction SequenceToRows]))

(defn ->sequence-to-rows
  "Constructor.

  schema - `org.datavec.api.transform.schema.Schema`"
  (^SequenceToRows [^org.datavec.api.transform.schema.Schema schema]
    (new SequenceToRows schema)))

