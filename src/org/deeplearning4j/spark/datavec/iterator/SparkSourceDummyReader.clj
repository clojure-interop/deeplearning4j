(ns org.deeplearning4j.spark.datavec.iterator.SparkSourceDummyReader
  "Dummy reader for use in IteratorUtils"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.datavec.iterator SparkSourceDummyReader]))

(defn ->spark-source-dummy-reader
  "Constructor.

  reader-idx - Index of the reader, in terms of the RDD that matches it. For a single RDD as input, thisis always 0; for 2 RDDs used as input, this would be 0 or 1, depending on whether it should pullvalues from the first or second RDD. Note that the indexing for RDDs doesn't depend on thepresence of sequence RDDs - they are indexed separately. - `int`"
  (^SparkSourceDummyReader [^Integer reader-idx]
    (new SparkSourceDummyReader reader-idx)))

(defn next
  "Description copied from interface: RecordReader

  i - `int`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^SparkSourceDummyReader this ^Integer i]
    (-> this (.next i)))
  (^java.util.List [^SparkSourceDummyReader this]
    (-> this (.next))))

(defn set-conf
  "Description copied from interface: Configurable

  configuration - `org.datavec.api.conf.Configuration`"
  ([^SparkSourceDummyReader this ^org.datavec.api.conf.Configuration configuration]
    (-> this (.setConf configuration))))

(defn get-conf
  "Description copied from interface: Configurable

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^SparkSourceDummyReader this]
    (-> this (.getConf))))

(defn record
  "Description copied from interface: RecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^SparkSourceDummyReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn reset
  "Description copied from interface: RecordReader"
  ([^SparkSourceDummyReader this]
    (-> this (.reset))))

(defn next-record
  "Description copied from interface: RecordReader

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^SparkSourceDummyReader this]
    (-> this (.nextRecord))))

(defn batches-supported
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^SparkSourceDummyReader this]
    (-> this (.batchesSupported))))

(defn set-listeners
  "Description copied from interface: RecordReader

  record-listeners - `org.datavec.api.records.listener.RecordListener`"
  ([^SparkSourceDummyReader this ^org.datavec.api.records.listener.RecordListener record-listeners]
    (-> this (.setListeners record-listeners))))

(defn get-labels
  "Description copied from interface: RecordReader

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SparkSourceDummyReader this]
    (-> this (.getLabels))))

(defn has-next?
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^SparkSourceDummyReader this]
    (-> this (.hasNext))))

(defn load-from-meta-data
  "Description copied from interface: RecordReader

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.Record [^SparkSourceDummyReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn reset-supported
  "returns: True if the record reader can be reset, false otherwise. Note that some record readers cannot be reset -
  for example, if they are backed by a non-resettable input split (such as certain types of streams) - `boolean`"
  (^Boolean [^SparkSourceDummyReader this]
    (-> this (.resetSupported))))

(defn close
  "throws: java.io.IOException"
  ([^SparkSourceDummyReader this]
    (-> this (.close))))

(defn initialize
  "Description copied from interface: RecordReader

  configuration - a configuration for initialization - `org.datavec.api.conf.Configuration`
  input-split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^SparkSourceDummyReader this ^org.datavec.api.conf.Configuration configuration ^org.datavec.api.split.InputSplit input-split]
    (-> this (.initialize configuration input-split)))
  ([^SparkSourceDummyReader this ^org.datavec.api.split.InputSplit input-split]
    (-> this (.initialize input-split))))

(defn get-listeners
  "Description copied from interface: RecordReader

  returns: `java.util.List<org.datavec.api.records.listener.RecordListener>`"
  (^java.util.List [^SparkSourceDummyReader this]
    (-> this (.getListeners))))

