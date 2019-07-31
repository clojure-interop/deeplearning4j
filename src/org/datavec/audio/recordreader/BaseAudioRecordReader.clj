(ns org.datavec.audio.recordreader.BaseAudioRecordReader
  "Base audio file loader"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.recordreader BaseAudioRecordReader]))

(defn ->base-audio-record-reader
  "Constructor.

  append-label - `boolean`
  labels - `java.util.List`"
  (^BaseAudioRecordReader [^Boolean append-label ^java.util.List labels]
    (new BaseAudioRecordReader append-label labels))
  (^BaseAudioRecordReader [^java.util.List labels]
    (new BaseAudioRecordReader labels))
  (^BaseAudioRecordReader []
    (new BaseAudioRecordReader )))

(defn next
  "Description copied from interface: RecordReader

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^BaseAudioRecordReader this]
    (-> this (.next))))

(defn set-conf
  "Description copied from interface: Configurable

  conf - `org.datavec.api.conf.Configuration`"
  ([^BaseAudioRecordReader this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn get-conf
  "Description copied from interface: Configurable

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^BaseAudioRecordReader this]
    (-> this (.getConf))))

(defn record
  "Description copied from interface: RecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^BaseAudioRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn reset
  "Description copied from interface: RecordReader"
  ([^BaseAudioRecordReader this]
    (-> this (.reset))))

(defn next-record
  "Description copied from interface: RecordReader

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^BaseAudioRecordReader this]
    (-> this (.nextRecord))))

(defn get-labels
  "Description copied from interface: RecordReader

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BaseAudioRecordReader this]
    (-> this (.getLabels))))

(defn has-next?
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^BaseAudioRecordReader this]
    (-> this (.hasNext))))

(defn load-from-meta-data
  "Description copied from interface: RecordReader

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.Record [^BaseAudioRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn reset-supported
  "returns: True if the record reader can be reset, false otherwise. Note that some record readers cannot be reset -
  for example, if they are backed by a non-resettable input split (such as certain types of streams) - `boolean`"
  (^Boolean [^BaseAudioRecordReader this]
    (-> this (.resetSupported))))

(defn close
  "throws: java.io.IOException"
  ([^BaseAudioRecordReader this]
    (-> this (.close))))

(defn initialize
  "Description copied from interface: RecordReader

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^BaseAudioRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split)))
  ([^BaseAudioRecordReader this ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize split))))

