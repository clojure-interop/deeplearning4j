(ns org.datavec.spark.SequenceEmptyRecordFunction
  "Used for filtering empty records"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark SequenceEmptyRecordFunction]))

(defn ->sequence-empty-record-function
  "Constructor."
  (^SequenceEmptyRecordFunction []
    (new SequenceEmptyRecordFunction )))

(defn call
  "v-1 - `java.util.List`

  returns: `java.lang.Boolean`

  throws: java.lang.Exception"
  (^java.lang.Boolean [^SequenceEmptyRecordFunction this ^java.util.List v-1]
    (-> this (.call v-1))))

