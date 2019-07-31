(ns org.datavec.hadoop.records.writer.mapfile.MapFileRecordWriter
  "MapFileRecordWriter is used to write values to a Hadoop MapFile, that can then be read by:
 MapFileRecordReader"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.hadoop.records.writer.mapfile MapFileRecordWriter]))

(defn ->map-file-record-writer
  "Constructor.

  Constructor for most default values. Specified number of output MapFile s, no text writable conversion, default
  index interval (1), default naming pattern.

  output-dir - Output directory for the map file(s) - `java.io.File`
  map-file-split-size - Split size for the map file: if 0, use a single map file for all output. If > 0,multiple map files will be used: each will contain a maximum of mapFileSplitSizeexamples. This can be used to avoid having a single multi gigabyte map file, which maybe undesirable in some cases (transfer across the network, for example). - `int`"
  (^MapFileRecordWriter [^java.io.File output-dir ^Integer map-file-split-size]
    (new MapFileRecordWriter output-dir map-file-split-size))
  (^MapFileRecordWriter [^java.io.File output-dir]
    (new MapFileRecordWriter output-dir))
  (^MapFileRecordWriter [^java.io.File output-dir ^Integer map-file-split-size ^org.datavec.api.writable.WritableType convert-text-to ^Integer index-interval ^java.lang.String filename-pattern ^org.apache.hadoop.conf.Configuration hadoop-configuration]
    (new MapFileRecordWriter output-dir map-file-split-size convert-text-to index-interval filename-pattern hadoop-configuration))
  (^MapFileRecordWriter [^java.io.File output-dir ^Integer map-file-split-size ^org.datavec.api.writable.WritableType convert-text-to ^Integer index-interval ^org.apache.hadoop.conf.Configuration hadoop-configuration]
    (new MapFileRecordWriter output-dir map-file-split-size convert-text-to index-interval hadoop-configuration))
  (^MapFileRecordWriter [^java.io.File output-dir ^Integer map-file-split-size ^org.datavec.api.writable.WritableType convert-text-to ^org.apache.hadoop.conf.Configuration hadoop-configuration]
    (new MapFileRecordWriter output-dir map-file-split-size convert-text-to hadoop-configuration))
  (^MapFileRecordWriter [^java.io.File output-dir ^Integer map-file-split-size ^org.datavec.api.writable.WritableType convert-text-to]
    (new MapFileRecordWriter output-dir map-file-split-size convert-text-to)))

(defn supports-batch
  "Description copied from interface: RecordWriter

  returns: `boolean`"
  (^Boolean [^MapFileRecordWriter this]
    (-> this (.supportsBatch))))

(defn initialize
  "Description copied from interface: RecordWriter

  configuration - the configuration to iniailize with - `org.datavec.api.conf.Configuration`
  split - the split to use - `org.datavec.api.split.InputSplit`
  partitioner - `org.datavec.api.split.partition.Partitioner`

  throws: java.lang.Exception"
  ([^MapFileRecordWriter this ^org.datavec.api.conf.Configuration configuration ^org.datavec.api.split.InputSplit split ^org.datavec.api.split.partition.Partitioner partitioner]
    (-> this (.initialize configuration split partitioner)))
  ([^MapFileRecordWriter this ^org.datavec.api.split.InputSplit input-split ^org.datavec.api.split.partition.Partitioner partitioner]
    (-> this (.initialize input-split partitioner))))

(defn write-batch
  "Description copied from interface: RecordWriter

  batch - the batch to write - `java.util.List`

  returns: `org.datavec.api.split.partition.PartitionMetaData`

  throws: java.io.IOException"
  (^org.datavec.api.split.partition.PartitionMetaData [^MapFileRecordWriter this ^java.util.List batch]
    (-> this (.writeBatch batch))))

