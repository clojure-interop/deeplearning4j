(ns org.datavec.codec.reader.BaseCodecRecordReader
  "Codec record reader for parsing videos"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.codec.reader BaseCodecRecordReader]))

(defn ->base-codec-record-reader
  "Constructor."
  (^BaseCodecRecordReader []
    (new BaseCodecRecordReader )))

(def *-name-space
  "Static Constant.

  type: java.lang.String"
  BaseCodecRecordReader/NAME_SPACE)

(def *-rows
  "Static Constant.

  type: java.lang.String"
  BaseCodecRecordReader/ROWS)

(def *-columns
  "Static Constant.

  type: java.lang.String"
  BaseCodecRecordReader/COLUMNS)

(def *-start-frame
  "Static Constant.

  type: java.lang.String"
  BaseCodecRecordReader/START_FRAME)

(def *-total-frames
  "Static Constant.

  type: java.lang.String"
  BaseCodecRecordReader/TOTAL_FRAMES)

(def *-time-slice
  "Static Constant.

  type: java.lang.String"
  BaseCodecRecordReader/TIME_SLICE)

(def *-ravel
  "Static Constant.

  type: java.lang.String"
  BaseCodecRecordReader/RAVEL)

(def *-video-duration
  "Static Constant.

  type: java.lang.String"
  BaseCodecRecordReader/VIDEO_DURATION)

(defn sequence-record
  "Description copied from interface: SequenceRecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^BaseCodecRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.sequenceRecord uri data-input-stream)))
  (^java.util.List [^BaseCodecRecordReader this]
    (-> this (.sequenceRecord))))

(defn initialize
  "Description copied from interface: RecordReader

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^BaseCodecRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split))))

(defn next
  "Description copied from interface: RecordReader

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^BaseCodecRecordReader this]
    (-> this (.next))))

(defn record
  "Description copied from interface: RecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^BaseCodecRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn set-conf
  "Description copied from interface: Configurable

  conf - `org.datavec.api.conf.Configuration`"
  ([^BaseCodecRecordReader this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn get-conf
  "Description copied from interface: Configurable

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^BaseCodecRecordReader this]
    (-> this (.getConf))))

(defn next-sequence
  "Description copied from interface: SequenceRecordReader

  returns: next sequence record - `org.datavec.api.records.SequenceRecord`"
  (^org.datavec.api.records.SequenceRecord [^BaseCodecRecordReader this]
    (-> this (.nextSequence))))

(defn load-sequence-from-meta-data
  "Description copied from interface: SequenceRecordReader

  record-meta-data - Metadata for the sequence record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single sequence record for the given RecordMetaData instance - `org.datavec.api.records.SequenceRecord`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.SequenceRecord [^BaseCodecRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadSequenceFromMetaData record-meta-data))))

