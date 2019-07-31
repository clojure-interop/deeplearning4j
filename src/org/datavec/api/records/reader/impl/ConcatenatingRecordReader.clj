(ns org.datavec.api.records.reader.impl.ConcatenatingRecordReader
  "Combine multiple readers into a single reader. Records are read sequentially - thus if the first reader has
 100 records, and the second reader has 200 records, ConcatenatingRecordReader will have 300 records.
 See also ComposableRecordReader for a version that combines each record from underlying readers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl ConcatenatingRecordReader]))

(defn ->concatenating-record-reader
  "Constructor.

  readers - `org.datavec.api.records.reader.RecordReader`"
  (^ConcatenatingRecordReader [^org.datavec.api.records.reader.RecordReader readers]
    (new ConcatenatingRecordReader readers)))

(defn next
  "Description copied from interface: RecordReader

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^ConcatenatingRecordReader this]
    (-> this (.next))))

(defn set-conf
  "Description copied from interface: Configurable

  conf - `org.datavec.api.conf.Configuration`"
  ([^ConcatenatingRecordReader this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn get-conf
  "Description copied from interface: Configurable

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^ConcatenatingRecordReader this]
    (-> this (.getConf))))

(defn record
  "Description copied from interface: RecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^ConcatenatingRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn reset
  "Description copied from interface: RecordReader"
  ([^ConcatenatingRecordReader this]
    (-> this (.reset))))

(defn next-record
  "Description copied from interface: RecordReader

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^ConcatenatingRecordReader this]
    (-> this (.nextRecord))))

(defn get-labels
  "Description copied from interface: RecordReader

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ConcatenatingRecordReader this]
    (-> this (.getLabels))))

(defn has-next?
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^ConcatenatingRecordReader this]
    (-> this (.hasNext))))

(defn load-from-meta-data
  "Description copied from interface: RecordReader

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.Record [^ConcatenatingRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn reset-supported
  "returns: True if the record reader can be reset, false otherwise. Note that some record readers cannot be reset -
  for example, if they are backed by a non-resettable input split (such as certain types of streams) - `boolean`"
  (^Boolean [^ConcatenatingRecordReader this]
    (-> this (.resetSupported))))

(defn close
  "throws: java.io.IOException"
  ([^ConcatenatingRecordReader this]
    (-> this (.close))))

(defn initialize
  "Description copied from interface: RecordReader

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^ConcatenatingRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split)))
  ([^ConcatenatingRecordReader this ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize split))))

