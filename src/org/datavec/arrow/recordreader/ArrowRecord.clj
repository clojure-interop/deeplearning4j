(ns org.datavec.arrow.recordreader.ArrowRecord
  "An ArrowRecord is a Record
 wrapper around ArrowWritableRecordBatch
 containing an index to the individual row."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.arrow.recordreader ArrowRecord]))

(defn ->arrow-record
  "Constructor."
  (^ArrowRecord []
    (new ArrowRecord )))

(defn get-record
  "Description copied from interface: Record

  returns: Record values - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^ArrowRecord this]
    (-> this (.getRecord))))

(defn set-record
  "Description copied from interface: Record

  record - `java.util.List`"
  ([^ArrowRecord this ^java.util.List record]
    (-> this (.setRecord record))))

(defn get-meta-data
  "Description copied from interface: Record

  returns: Metadata for this record (or null, if none has been set) - `org.datavec.api.records.metadata.RecordMetaData`"
  (^org.datavec.api.records.metadata.RecordMetaData [^ArrowRecord this]
    (-> this (.getMetaData))))

(defn set-meta-data
  "Description copied from interface: Record

  record-meta-data - `org.datavec.api.records.metadata.RecordMetaData`"
  ([^ArrowRecord this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.setMetaData record-meta-data))))

