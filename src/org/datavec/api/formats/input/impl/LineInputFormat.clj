(ns org.datavec.api.formats.input.impl.LineInputFormat
  "Line input format creates an @link{LineRecordReader}"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.formats.input.impl LineInputFormat]))

(defn ->line-input-format
  "Constructor."
  (^LineInputFormat []
    (new LineInputFormat )))

(defn create-reader
  "Description copied from interface: InputFormat

  split - the split to read - `org.datavec.api.split.InputSplit`
  conf - `org.datavec.api.conf.Configuration`

  returns: the reader from the given input split - `org.datavec.api.records.reader.RecordReader`

  throws: java.io.IOException"
  (^org.datavec.api.records.reader.RecordReader [^LineInputFormat this ^org.datavec.api.split.InputSplit split ^org.datavec.api.conf.Configuration conf]
    (-> this (.createReader split conf)))
  (^org.datavec.api.records.reader.RecordReader [^LineInputFormat this ^org.datavec.api.split.InputSplit split]
    (-> this (.createReader split))))

(defn write
  "Description copied from interface: Writable

  out - DataOuput to serialize this object into. - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^LineInputFormat this ^java.io.DataOutput out]
    (-> this (.write out))))

(defn read-fields
  "Description copied from interface: Writable

  in - DataInput to deseriablize this object from. - `java.io.DataInput`

  throws: java.io.IOException"
  ([^LineInputFormat this ^java.io.DataInput in]
    (-> this (.readFields in))))

