(ns org.datavec.api.records.reader.impl.misc.MatlabRecordReader
  "Matlab record reader"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.misc MatlabRecordReader]))

(defn ->matlab-record-reader
  "Constructor."
  (^MatlabRecordReader []
    (new MatlabRecordReader )))

(defn has-next?
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^MatlabRecordReader this]
    (-> this (.hasNext))))

(defn next
  "Description copied from interface: RecordReader

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^MatlabRecordReader this]
    (-> this (.next))))

(defn record
  "Description copied from interface: RecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^MatlabRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

