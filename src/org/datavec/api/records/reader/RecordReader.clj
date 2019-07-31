(ns org.datavec.api.records.reader.RecordReader
  "Record reader"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader RecordReader]))

(defn next
  "This method will be used, if batchesSupported() returns true.

  num - `int`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^RecordReader this ^Integer num]
    (-> this (.next num)))
  (^java.util.List [^RecordReader this]
    (-> this (.next))))

(defn record
  "Load the record from the given DataInputStream
  Unlike next() the internal state of the RecordReader is not modified
  Implementations of this method should not close the DataInputStream

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^RecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn reset
  "Reset record reader iterator"
  ([^RecordReader this]
    (-> this (.reset))))

(defn next-record
  "Similar to next(), but returns a Record object, that may include metadata such as the source
  of the data

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^RecordReader this]
    (-> this (.nextRecord))))

(defn batches-supported
  "This method returns true, if next(int) signature is supported by this RecordReader implementation.

  returns: `boolean`"
  (^Boolean [^RecordReader this]
    (-> this (.batchesSupported))))

(defn set-listeners
  "Set the record listeners for this record reader.

  listeners - `org.datavec.api.records.listener.RecordListener`"
  ([^RecordReader this ^org.datavec.api.records.listener.RecordListener listeners]
    (-> this (.setListeners listeners))))

(defn get-labels
  "List of label strings

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RecordReader this]
    (-> this (.getLabels))))

(defn has-next?
  "Whether there are anymore records

  returns: `boolean`"
  (^Boolean [^RecordReader this]
    (-> this (.hasNext))))

(defn load-from-meta-data
  "Load a single record from the given RecordMetaData instance
  Note: that for data that isn't splittable (i.e., text data that needs to be scanned/split), it is more efficient to
  load multiple records at once using loadFromMetaData(List)

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.Record [^RecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn reset-supported
  "returns: True if the record reader can be reset, false otherwise. Note that some record readers cannot be reset -
  for example, if they are backed by a non-resettable input split (such as certain types of streams) - `boolean`"
  (^Boolean [^RecordReader this]
    (-> this (.resetSupported))))

(defn initialize
  "Called once at initialization.

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^RecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split)))
  ([^RecordReader this ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize split))))

(defn get-listeners
  "Get the record listeners for this record reader.

  returns: `java.util.List<org.datavec.api.records.listener.RecordListener>`"
  (^java.util.List [^RecordReader this]
    (-> this (.getListeners))))

