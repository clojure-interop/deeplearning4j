(ns org.datavec.arrow.recordreader.ArrowRecordReader
  "Implements a record reader using arrow.
 The ArrowRecordReader minimizes memory footprint by
 using an ArrowWritableRecordBatch as the current in memory
 batch during iteration rather than the normal of objects
 you would find with the traditional record readers with List>"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.arrow.recordreader ArrowRecordReader]))

(defn ->arrow-record-reader
  "Constructor."
  (^ArrowRecordReader []
    (new ArrowRecordReader )))

(defn next
  "Description copied from interface: RecordReader

  num - `int`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^ArrowRecordReader this ^Integer num]
    (-> this (.next num)))
  (^java.util.List [^ArrowRecordReader this]
    (-> this (.next))))

(defn set-conf
  "Description copied from interface: Configurable

  conf - `org.datavec.api.conf.Configuration`"
  ([^ArrowRecordReader this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn get-conf
  "Description copied from interface: Configurable

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^ArrowRecordReader this]
    (-> this (.getConf))))

(defn record
  "Description copied from interface: RecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^ArrowRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn reset
  "Description copied from interface: RecordReader"
  ([^ArrowRecordReader this]
    (-> this (.reset))))

(defn next-record
  "Description copied from interface: RecordReader

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^ArrowRecordReader this]
    (-> this (.nextRecord))))

(defn batches-supported
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^ArrowRecordReader this]
    (-> this (.batchesSupported))))

(defn set-listeners
  "Description copied from interface: RecordReader

  listeners - `org.datavec.api.records.listener.RecordListener`"
  ([^ArrowRecordReader this ^org.datavec.api.records.listener.RecordListener listeners]
    (-> this (.setListeners listeners))))

(defn get-labels
  "Description copied from interface: RecordReader

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ArrowRecordReader this]
    (-> this (.getLabels))))

(defn has-next?
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^ArrowRecordReader this]
    (-> this (.hasNext))))

(defn load-from-meta-data
  "Description copied from interface: RecordReader

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^ArrowRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn reset-supported
  "returns: True if the record reader can be reset, false otherwise. Note that some record readers cannot be reset -
  for example, if they are backed by a non-resettable input split (such as certain types of streams) - `boolean`"
  (^Boolean [^ArrowRecordReader this]
    (-> this (.resetSupported))))

(defn close
  ""
  ([^ArrowRecordReader this]
    (-> this (.close))))

(defn initialize
  "Description copied from interface: RecordReader

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`"
  ([^ArrowRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split)))
  ([^ArrowRecordReader this ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize split))))

(defn get-listeners
  "Description copied from interface: RecordReader

  returns: `java.util.List<org.datavec.api.records.listener.RecordListener>`"
  (^java.util.List [^ArrowRecordReader this]
    (-> this (.getListeners))))

