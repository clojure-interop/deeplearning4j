(ns org.datavec.hadoop.records.writer.mapfile.AbstractMapFileWriter
  "An abstract class For creating Hadoop map files, that underlies MapFileRecordWriter and
 MapFileSequenceRecordWriter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.hadoop.records.writer.mapfile AbstractMapFileWriter]))

(defn ->abstract-map-file-writer
  "Constructor.

  Constructor for most default values. Specified number of output MapFile s, no text writable conversion, default
  index interval (1), default naming pattern.

  output-dir - Output directory for the map file(s) - `java.io.File`
  map-file-split-size - Split size for the map file: if 0, use a single map file for all output. If > 0,multiple map files will be used: each will contain a maximum of mapFileSplitSize.This can be used to avoid having a single multi gigabyte map file, which may beundesirable in some cases (transfer across the network, for example) - `int`"
  (^AbstractMapFileWriter [^java.io.File output-dir ^Integer map-file-split-size]
    (new AbstractMapFileWriter output-dir map-file-split-size))
  (^AbstractMapFileWriter [^java.io.File output-dir]
    (new AbstractMapFileWriter output-dir))
  (^AbstractMapFileWriter [^java.io.File output-dir ^Integer map-file-split-size ^org.datavec.api.writable.WritableType convert-text-to ^Integer index-interval ^java.lang.String filename-pattern ^org.apache.hadoop.conf.Configuration hadoop-configuration]
    (new AbstractMapFileWriter output-dir map-file-split-size convert-text-to index-interval filename-pattern hadoop-configuration))
  (^AbstractMapFileWriter [^java.io.File output-dir ^Integer map-file-split-size ^org.datavec.api.writable.WritableType convert-text-to ^Integer index-interval ^org.apache.hadoop.conf.Configuration hadoop-configuration]
    (new AbstractMapFileWriter output-dir map-file-split-size convert-text-to index-interval hadoop-configuration))
  (^AbstractMapFileWriter [^java.io.File output-dir ^Integer map-file-split-size ^org.datavec.api.writable.WritableType convert-text-to]
    (new AbstractMapFileWriter output-dir map-file-split-size convert-text-to)))

(def *-default-filename-pattern
  "Static Constant.

  type: java.lang.String"
  AbstractMapFileWriter/DEFAULT_FILENAME_PATTERN)

(def *-key-class
  "Static Constant.

  type: java.lang.Class<? extends org.apache.hadoop.io.WritableComparable>"
  AbstractMapFileWriter/KEY_CLASS)

(def *-map-file-index-interval-key
  "Static Constant.

  Configuration key for the map file interval.
  This is defined in MapFile.Writer.INDEX_INTERVAL but unfortunately that field is private, hence cannot be
  referenced here.

  type: java.lang.String"
  AbstractMapFileWriter/MAP_FILE_INDEX_INTERVAL_KEY)

(def *-default-map-file-split-size
  "Static Constant.

  type: int"
  AbstractMapFileWriter/DEFAULT_MAP_FILE_SPLIT_SIZE)

(def *-default-index-interval
  "Static Constant.

  type: int"
  AbstractMapFileWriter/DEFAULT_INDEX_INTERVAL)

(defn set-conf
  "conf - `org.datavec.api.conf.Configuration`"
  ([^AbstractMapFileWriter this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn get-conf
  "returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^AbstractMapFileWriter this]
    (-> this (.getConf))))

(defn write
  "record - `T`

  returns: `org.datavec.api.split.partition.PartitionMetaData`

  throws: java.io.IOException"
  (^org.datavec.api.split.partition.PartitionMetaData [^AbstractMapFileWriter this record]
    (-> this (.write record))))

(defn close
  ""
  ([^AbstractMapFileWriter this]
    (-> this (.close))))

