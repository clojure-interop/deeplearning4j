(ns org.datavec.api.records.reader.impl.inmemory.InMemoryRecordReader
  "This is a RecordReader
 primarily meant for unit tests.
 It carries records in memory and uses a list iterator internally."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.inmemory InMemoryRecordReader]))

(defn ->in-memory-record-reader
  "Constructor.

  records - `java.util.List`"
  (^InMemoryRecordReader [^java.util.List records]
    (new InMemoryRecordReader records)))

(defn next
  "Description copied from interface: RecordReader

  num - `int`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^InMemoryRecordReader this ^Integer num]
    (-> this (.next num)))
  (^java.util.List [^InMemoryRecordReader this]
    (-> this (.next))))

(defn set-conf
  "Set the configuration to be used by this object.

  conf - `org.datavec.api.conf.Configuration`"
  ([^InMemoryRecordReader this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn get-conf
  "Return the configuration used by this object.

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^InMemoryRecordReader this]
    (-> this (.getConf))))

(defn record
  "Load the record from the given DataInputStream
  Unlike next() the internal state of the RecordReader is not modified
  Implementations of this method should not close the DataInputStream

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^InMemoryRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn reset
  "Reset record reader iterator"
  ([^InMemoryRecordReader this]
    (-> this (.reset))))

(defn next-record
  "Similar to next(), but returns a Record object, that may include metadata such as the source
  of the data

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^InMemoryRecordReader this]
    (-> this (.nextRecord))))

(defn batches-supported
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^InMemoryRecordReader this]
    (-> this (.batchesSupported))))

(defn set-listeners
  "Set the record listeners for this record reader.

  listeners - `org.datavec.api.records.listener.RecordListener`"
  ([^InMemoryRecordReader this ^org.datavec.api.records.listener.RecordListener listeners]
    (-> this (.setListeners listeners))))

(defn get-labels
  "List of label strings

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InMemoryRecordReader this]
    (-> this (.getLabels))))

(defn has-next?
  "Whether there are anymore records

  returns: `boolean`"
  (^Boolean [^InMemoryRecordReader this]
    (-> this (.hasNext))))

(defn load-from-meta-data
  "Load a single record from the given RecordMetaData instance
  Note: that for data that isn't splittable (i.e., text data that needs to be scanned/split), it is more efficient to
  load multiple records at once using loadFromMetaData(List)

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.Record [^InMemoryRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn reset-supported
  "returns: True if the record reader can be reset, false otherwise. Note that some record readers cannot be reset -
  for example, if they are backed by a non-resettable input split (such as certain types of streams) - `boolean`"
  (^Boolean [^InMemoryRecordReader this]
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
  ([^InMemoryRecordReader this]
    (-> this (.close))))

(defn initialize
  "Called once at initialization.

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^InMemoryRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split)))
  ([^InMemoryRecordReader this ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize split))))

(defn get-listeners
  "Get the record listeners for this record reader.

  returns: `java.util.List<org.datavec.api.records.listener.RecordListener>`"
  (^java.util.List [^InMemoryRecordReader this]
    (-> this (.getListeners))))

