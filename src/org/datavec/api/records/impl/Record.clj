(ns org.datavec.api.records.impl.Record
  "A standard implementation of the Record interface"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.impl Record]))

(defn ->record
  "Constructor."
  (^Record []
    (new Record )))

