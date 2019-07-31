(ns org.datavec.api.vector.Vectorizer$RecordCallBack
  "On record call back.
 This allows for neat inheritance and polymorphism
 for fit and fit/transform among other things"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.vector Vectorizer$RecordCallBack]))

(defn on-record
  "The record callback

  record - `org.datavec.api.records.Record`"
  ([^Vectorizer$RecordCallBack this ^org.datavec.api.records.Record record]
    (-> this (.onRecord record))))

