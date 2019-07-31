(ns org.datavec.api.records.reader.impl.ComposableRecordReader
  "RecordReader for each pipeline. Individual record is a concatenation of the two collections.
 Create a recordreader that takes recordreaders and iterates over them and concatenates them
 hasNext would be the & of all the recordreaders
 concatenation would be next & addAll on the collection
 return one record"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl ComposableRecordReader]))

(defn ->composable-record-reader
  "Constructor.

  readers - `org.datavec.api.records.reader.RecordReader`"
  (^ComposableRecordReader [^org.datavec.api.records.reader.RecordReader readers]
    (new ComposableRecordReader readers)))

(defn next
  "Description copied from interface: RecordReader

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^ComposableRecordReader this]
    (-> this (.next))))

(defn set-conf
  "Description copied from interface: Configurable

  conf - `org.datavec.api.conf.Configuration`"
  ([^ComposableRecordReader this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn get-conf
  "Description copied from interface: Configurable

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^ComposableRecordReader this]
    (-> this (.getConf))))

(defn record
  "Description copied from interface: RecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^ComposableRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn reset
  "Description copied from interface: RecordReader"
  ([^ComposableRecordReader this]
    (-> this (.reset))))

(defn next-record
  "Description copied from interface: RecordReader

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^ComposableRecordReader this]
    (-> this (.nextRecord))))

(defn get-labels
  "Description copied from interface: RecordReader

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ComposableRecordReader this]
    (-> this (.getLabels))))

(defn has-next?
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^ComposableRecordReader this]
    (-> this (.hasNext))))

(defn load-from-meta-data
  "Description copied from interface: RecordReader

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.Record [^ComposableRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn reset-supported
  "returns: True if the record reader can be reset, false otherwise. Note that some record readers cannot be reset -
  for example, if they are backed by a non-resettable input split (such as certain types of streams) - `boolean`"
  (^Boolean [^ComposableRecordReader this]
    (-> this (.resetSupported))))

(defn close
  "throws: java.io.IOException"
  ([^ComposableRecordReader this]
    (-> this (.close))))

(defn initialize
  "Description copied from interface: RecordReader

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^ComposableRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split)))
  ([^ComposableRecordReader this ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize split))))

