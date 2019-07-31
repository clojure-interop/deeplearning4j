(ns org.datavec.api.records.Record
  "A Record contains a set of values for a single example or instance. Each value in the Record is represented by
 a Writable object. The record may (optionally) also have a RecordMetaData instance, that represents
 metadata (source location, etc) for the record.
 For sequences, see SequenceRecord"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records Record]))

(defn get-record
  "Get the record values, as a List<Writable>

  returns: Record values - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^Record this]
    (-> this (.getRecord))))

(defn set-record
  "Get the record values for this Record

  record - `java.util.List`"
  ([^Record this ^java.util.List record]
    (-> this (.setRecord record))))

(defn get-meta-data
  "Get the RecordMetaData for this record

  returns: Metadata for this record (or null, if none has been set) - `org.datavec.api.records.metadata.RecordMetaData`"
  (^org.datavec.api.records.metadata.RecordMetaData [^Record this]
    (-> this (.getMetaData))))

(defn set-meta-data
  "Set the Record metadata

  record-meta-data - `org.datavec.api.records.metadata.RecordMetaData`"
  ([^Record this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.setMetaData record-meta-data))))

