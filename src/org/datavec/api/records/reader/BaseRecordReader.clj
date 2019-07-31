(ns org.datavec.api.records.reader.BaseRecordReader
  "Manages record listeners."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader BaseRecordReader]))

(defn ->base-record-reader
  "Constructor."
  (^BaseRecordReader []
    (new BaseRecordReader )))

(defn get-listeners
  "Description copied from interface: RecordReader

  returns: `java.util.List<org.datavec.api.records.listener.RecordListener>`"
  (^java.util.List [^BaseRecordReader this]
    (-> this (.getListeners))))

(defn set-listeners
  "Description copied from interface: RecordReader

  listeners - `java.util.Collection`"
  ([^BaseRecordReader this ^java.util.Collection listeners]
    (-> this (.setListeners listeners))))

(defn batches-supported
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^BaseRecordReader this]
    (-> this (.batchesSupported))))

(defn next
  "Description copied from interface: RecordReader

  num - `int`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^BaseRecordReader this ^Integer num]
    (-> this (.next num))))

