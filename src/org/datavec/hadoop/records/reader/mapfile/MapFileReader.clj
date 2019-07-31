(ns org.datavec.hadoop.records.reader.mapfile.MapFileReader
  "A wrapper around a Hadoop MapFile.Reader, used in MapFileRecordReader and MapFileSequenceRecordReader
 Note: This also handles multiple map files, such as the output from Spark, which gives a set of map files
 in directories like /part-r-00000, /part-r-00001"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.hadoop.records.reader.mapfile MapFileReader]))

(defn ->map-file-reader
  "Constructor.

  path - Path (directory) of the MapFile - `java.lang.String`
  index-to-key - Instance used to convert long indices to key values. This allows for lookup by key - `org.datavec.hadoop.records.reader.mapfile.IndexToKey`
  record-class - Class of the records in the MapFile - `java.lang.Class`

  throws: java.io.IOException - If an error occurs during opening or initialisation"
  (^MapFileReader [^java.lang.String path ^org.datavec.hadoop.records.reader.mapfile.IndexToKey index-to-key ^java.lang.Class record-class]
    (new MapFileReader path index-to-key record-class))
  (^MapFileReader [^java.lang.String path]
    (new MapFileReader path)))

(defn num-records
  "Determine the total number of records in the map file, using the IndexToKey instance

  returns: Total number of records and the map file - `long`"
  (^Long [^MapFileReader this]
    (-> this (.numRecords))))

(defn get-record
  "It a single record from the map file for the given index

  index - Index, between 0 and numRecords()-1 - `long`

  returns: Value from the MapFile - `V`

  throws: java.io.IOException - If an error occurs during reading"
  ([^MapFileReader this ^Long index]
    (-> this (.getRecord index))))

(defn close
  "throws: java.io.IOException"
  ([^MapFileReader this]
    (-> this (.close))))

