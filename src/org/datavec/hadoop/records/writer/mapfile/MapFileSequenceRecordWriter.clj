(ns org.datavec.hadoop.records.writer.mapfile.MapFileSequenceRecordWriter
  "MapFileSequenceRecordWriter is used to write sequence values to a Hadoop MapFile, that can then be read by:
 MapFileSequenceRecordReader"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.hadoop.records.writer.mapfile MapFileSequenceRecordWriter]))

(defn ->map-file-sequence-record-writer
  "Constructor.

  Constructor for most default values. Specified number of output MapFile s, no text writable conversion, default
  index interval (1), default naming pattern.

  output-dir - Output directory for the map file(s) - `java.io.File`
  map-file-split-size - Split size for the map file: if 0, use a single map file for all output. If > 0,multiple map files will be used: each will contain a maximum of mapFileSplitSizeexamples. This can be used to avoid having a single multi gigabyte map file, which maybe undesirable in some cases (transfer across the network, for example). - `int`"
  (^MapFileSequenceRecordWriter [^java.io.File output-dir ^Integer map-file-split-size]
    (new MapFileSequenceRecordWriter output-dir map-file-split-size))
  (^MapFileSequenceRecordWriter [^java.io.File output-dir]
    (new MapFileSequenceRecordWriter output-dir))
  (^MapFileSequenceRecordWriter [^java.io.File output-dir ^Integer map-file-split-size ^org.datavec.api.writable.WritableType convert-text-to ^Integer index-interval ^java.lang.String filename-pattern ^org.apache.hadoop.conf.Configuration hadoop-configuration]
    (new MapFileSequenceRecordWriter output-dir map-file-split-size convert-text-to index-interval filename-pattern hadoop-configuration))
  (^MapFileSequenceRecordWriter [^java.io.File output-dir ^Integer map-file-split-size ^org.datavec.api.writable.WritableType convert-text-to ^Integer index-interval ^org.apache.hadoop.conf.Configuration hadoop-configuration]
    (new MapFileSequenceRecordWriter output-dir map-file-split-size convert-text-to index-interval hadoop-configuration))
  (^MapFileSequenceRecordWriter [^java.io.File output-dir ^Integer map-file-split-size ^org.datavec.api.writable.WritableType convert-text-to ^org.apache.hadoop.conf.Configuration hadoop-configuration]
    (new MapFileSequenceRecordWriter output-dir map-file-split-size convert-text-to hadoop-configuration))
  (^MapFileSequenceRecordWriter [^java.io.File output-dir ^Integer map-file-split-size ^org.datavec.api.writable.WritableType convert-text-to]
    (new MapFileSequenceRecordWriter output-dir map-file-split-size convert-text-to)))

