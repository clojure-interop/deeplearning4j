(ns org.datavec.api.formats.input.impl.CSVInputFormat
  "Line input format creates an @link{LineRecordReader}"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.formats.input.impl CSVInputFormat]))

(defn ->csv-input-format
  "Constructor."
  (^CSVInputFormat []
    (new CSVInputFormat )))

(defn create-reader
  "Description copied from interface: InputFormat

  split - the split to read - `org.datavec.api.split.InputSplit`
  conf - `org.datavec.api.conf.Configuration`

  returns: the reader from the given input split - `org.datavec.api.records.reader.RecordReader`

  throws: java.io.IOException"
  (^org.datavec.api.records.reader.RecordReader [^CSVInputFormat this ^org.datavec.api.split.InputSplit split ^org.datavec.api.conf.Configuration conf]
    (-> this (.createReader split conf)))
  (^org.datavec.api.records.reader.RecordReader [^CSVInputFormat this ^org.datavec.api.split.InputSplit split]
    (-> this (.createReader split))))

(defn write
  "Description copied from interface: Writable

  out - DataOuput to serialize this object into. - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^CSVInputFormat this ^java.io.DataOutput out]
    (-> this (.write out))))

(defn read-fields
  "Description copied from interface: Writable

  in - DataInput to deseriablize this object from. - `java.io.DataInput`

  throws: java.io.IOException"
  ([^CSVInputFormat this ^java.io.DataInput in]
    (-> this (.readFields in))))

