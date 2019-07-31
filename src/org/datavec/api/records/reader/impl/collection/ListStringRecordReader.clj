(ns org.datavec.api.records.reader.impl.collection.ListStringRecordReader
  "Iterates through a list of strings return a record.
 Only accepts an @link {ListStringInputSplit} as input."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.collection ListStringRecordReader]))

(defn ->list-string-record-reader
  "Constructor."
  (^ListStringRecordReader []
    (new ListStringRecordReader )))

(defn next
  "Get the next record

  returns: The list of next record - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^ListStringRecordReader this]
    (-> this (.next))))

(defn set-conf
  "Set the configuration to be used by this object.

  conf - `org.datavec.api.conf.Configuration`"
  ([^ListStringRecordReader this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn get-conf
  "Return the configuration used by this object.

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^ListStringRecordReader this]
    (-> this (.getConf))))

(defn record
  "Load the record from the given DataInputStream
  Unlike next() the internal state of the RecordReader is not modified
  Implementations of this method should not close the DataInputStream

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^ListStringRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn reset
  "Reset record reader iterator"
  ([^ListStringRecordReader this]
    (-> this (.reset))))

(defn next-record
  "Description copied from interface: RecordReader

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^ListStringRecordReader this]
    (-> this (.nextRecord))))

(defn get-labels
  "List of label strings

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ListStringRecordReader this]
    (-> this (.getLabels))))

(defn has-next?
  "Check whether there are anymore records

  returns: Whether there are more records - `boolean`"
  (^Boolean [^ListStringRecordReader this]
    (-> this (.hasNext))))

(defn load-from-meta-data
  "Description copied from interface: RecordReader

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.Record [^ListStringRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn reset-supported
  "returns: True if the record reader can be reset, false otherwise. Note that some record readers cannot be reset -
  for example, if they are backed by a non-resettable input split (such as certain types of streams) - `boolean`"
  (^Boolean [^ListStringRecordReader this]
    (-> this (.resetSupported))))

(defn close
  "Closes this stream and releases any system resources associated
  with it. If the stream is already closed then invoking this
  method has no effect.

   As noted in AutoCloseable.close(), cases where the
  close may fail require careful attention. It is strongly advised
  to relinquish the underlying resources and to internally
  mark the Closeable as closed, prior to throwing
  the IOException.

  throws: java.io.IOException - if an I/O error occurs"
  ([^ListStringRecordReader this]
    (-> this (.close))))

(defn initialize
  "Called once at initialization.

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^ListStringRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split)))
  ([^ListStringRecordReader this ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize split))))

