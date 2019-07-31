(ns org.datavec.spark.functions.EmptyRecordFunction
  "Used for filtering empty records"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.functions EmptyRecordFunction]))

(defn ->empty-record-function
  "Constructor."
  (^EmptyRecordFunction []
    (new EmptyRecordFunction )))

(defn call
  "v-1 - `java.util.List`

  returns: `java.lang.Boolean`

  throws: java.lang.Exception"
  (^java.lang.Boolean [^EmptyRecordFunction this ^java.util.List v-1]
    (-> this (.call v-1))))

