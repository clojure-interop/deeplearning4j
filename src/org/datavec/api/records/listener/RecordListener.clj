(ns org.datavec.api.records.listener.RecordListener
  "Each time a record is read or written, mainly used for debugging or visualization."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.listener RecordListener]))

(defn invoked
  "Get if listener invoked.

  returns: `boolean`"
  (^Boolean [^RecordListener this]
    (-> this (.invoked))))

(defn invoke
  "Change invoke to true."
  ([^RecordListener this]
    (-> this (.invoke))))

(defn record-read
  "Event listener for each record to be read.

  reader - the record reader - `org.datavec.api.records.reader.RecordReader`
  record - in raw format (Collection, File, String, Writable, etc) - `java.lang.Object`"
  ([^RecordListener this ^org.datavec.api.records.reader.RecordReader reader ^java.lang.Object record]
    (-> this (.recordRead reader record))))

(defn record-write
  "Event listener for each record to be written.

  writer - the record writer - `org.datavec.api.records.writer.RecordWriter`
  record - in raw format (Collection, File, String, Writable, etc) - `java.lang.Object`"
  ([^RecordListener this ^org.datavec.api.records.writer.RecordWriter writer ^java.lang.Object record]
    (-> this (.recordWrite writer record))))

