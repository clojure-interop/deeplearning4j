(ns org.datavec.api.formats.input.BaseInputFormat
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.formats.input BaseInputFormat]))

(defn ->base-input-format
  "Constructor."
  (^BaseInputFormat []
    (new BaseInputFormat )))

(defn get-type
  "Description copied from interface: Writable

  returns: `org.datavec.api.writable.WritableType`"
  (^org.datavec.api.writable.WritableType [^BaseInputFormat this]
    (-> this (.getType))))

(defn write-type
  "Description copied from interface: Writable

  out - DataOutput to write to - `java.io.DataOutput`

  throws: java.io.IOException - For errors during writing"
  ([^BaseInputFormat this ^java.io.DataOutput out]
    (-> this (.writeType out))))

(defn read-fields
  "Description copied from interface: Writable

  in - DataInput to deseriablize this object from. - `java.io.DataInput`

  throws: java.io.IOException"
  ([^BaseInputFormat this ^java.io.DataInput in]
    (-> this (.readFields in))))

(defn to-double
  "Description copied from interface: Writable

  returns: `double`"
  (^Double [^BaseInputFormat this]
    (-> this (.toDouble))))

(defn to-float
  "Description copied from interface: Writable

  returns: `float`"
  (^Float [^BaseInputFormat this]
    (-> this (.toFloat))))

(defn create-reader
  "Description copied from interface: InputFormat

  split - the split to read - `org.datavec.api.split.InputSplit`

  returns: the reader from the given input split - `org.datavec.api.records.reader.RecordReader`

  throws: java.io.IOException"
  (^org.datavec.api.records.reader.RecordReader [^BaseInputFormat this ^org.datavec.api.split.InputSplit split]
    (-> this (.createReader split))))

(defn to-long
  "Description copied from interface: Writable

  returns: `long`"
  (^Long [^BaseInputFormat this]
    (-> this (.toLong))))

(defn to-int
  "Description copied from interface: Writable

  returns: `int`"
  (^Integer [^BaseInputFormat this]
    (-> this (.toInt))))

(defn write
  "Description copied from interface: Writable

  out - DataOuput to serialize this object into. - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^BaseInputFormat this ^java.io.DataOutput out]
    (-> this (.write out))))

