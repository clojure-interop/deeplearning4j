(ns org.datavec.api.util.RecordUtils
  "Create records from the specified input"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.util RecordUtils]))

(defn ->record-utils
  "Constructor."
  (^RecordUtils []
    (new RecordUtils )))

(defn *to-record
  "record - `double[]`

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [record]
    (RecordUtils/toRecord record)))

