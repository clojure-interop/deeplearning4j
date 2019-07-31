(ns org.datavec.api.records.listener.impl.LogRecordListener
  "A record listener that logs every record to be read or written."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.listener.impl LogRecordListener]))

(defn ->log-record-listener
  "Constructor."
  (^LogRecordListener []
    (new LogRecordListener )))

(defn invoked
  "Description copied from interface: RecordListener

  returns: `boolean`"
  (^Boolean [^LogRecordListener this]
    (-> this (.invoked))))

(defn invoke
  "Description copied from interface: RecordListener"
  ([^LogRecordListener this]
    (-> this (.invoke))))

(defn record-read
  "Description copied from interface: RecordListener

  reader - the record reader - `org.datavec.api.records.reader.RecordReader`
  record - in raw format (Collection, File, String, Writable, etc) - `java.lang.Object`"
  ([^LogRecordListener this ^org.datavec.api.records.reader.RecordReader reader ^java.lang.Object record]
    (-> this (.recordRead reader record))))

(defn record-write
  "Description copied from interface: RecordListener

  writer - the record writer - `org.datavec.api.records.writer.RecordWriter`
  record - in raw format (Collection, File, String, Writable, etc) - `java.lang.Object`"
  ([^LogRecordListener this ^org.datavec.api.records.writer.RecordWriter writer ^java.lang.Object record]
    (-> this (.recordWrite writer record))))

