(ns org.datavec.api.formats.input.impl.ListStringInputFormat
  "Input format for the @link {ListStringRecordReader}"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.formats.input.impl ListStringInputFormat]))

(defn ->list-string-input-format
  "Constructor."
  (^ListStringInputFormat []
    (new ListStringInputFormat )))

(defn get-type
  "Description copied from interface: Writable

  returns: `org.datavec.api.writable.WritableType`"
  (^org.datavec.api.writable.WritableType [^ListStringInputFormat this]
    (-> this (.getType))))

(defn write-type
  "Description copied from interface: Writable

  out - DataOutput to write to - `java.io.DataOutput`

  throws: java.io.IOException - For errors during writing"
  ([^ListStringInputFormat this ^java.io.DataOutput out]
    (-> this (.writeType out))))

(defn read-fields
  "Deserialize the fields of this object from in.

  For efficiency, implementations should attempt to re-use storage in the
  existing object where possible.

  in - DataInput to deseriablize this object from. - `java.io.DataInput`

  throws: java.io.IOException"
  ([^ListStringInputFormat this ^java.io.DataInput in]
    (-> this (.readFields in))))

(defn to-double
  "Convert Writable to double. Whether this is supported depends on the specific writable.

  returns: `double`"
  (^Double [^ListStringInputFormat this]
    (-> this (.toDouble))))

(defn to-float
  "Convert Writable to float. Whether this is supported depends on the specific writable.

  returns: `float`"
  (^Float [^ListStringInputFormat this]
    (-> this (.toFloat))))

(defn create-reader
  "Creates a reader from an input split

  split - the split to read - `org.datavec.api.split.InputSplit`
  conf - `org.datavec.api.conf.Configuration`

  returns: the reader from the given input split - `org.datavec.api.records.reader.RecordReader`

  throws: java.io.IOException"
  (^org.datavec.api.records.reader.RecordReader [^ListStringInputFormat this ^org.datavec.api.split.InputSplit split ^org.datavec.api.conf.Configuration conf]
    (-> this (.createReader split conf)))
  (^org.datavec.api.records.reader.RecordReader [^ListStringInputFormat this ^org.datavec.api.split.InputSplit split]
    (-> this (.createReader split))))

(defn to-long
  "Convert Writable to long. Whether this is supported depends on the specific writable.

  returns: `long`"
  (^Long [^ListStringInputFormat this]
    (-> this (.toLong))))

(defn to-int
  "Convert Writable to int. Whether this is supported depends on the specific writable.

  returns: `int`"
  (^Integer [^ListStringInputFormat this]
    (-> this (.toInt))))

(defn write
  "Serialize the fields of this object to out.

  out - DataOuput to serialize this object into. - `java.io.DataOutput`

  throws: java.io.IOException"
  ([^ListStringInputFormat this ^java.io.DataOutput out]
    (-> this (.write out))))

