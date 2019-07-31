(ns org.datavec.hadoop.records.reader.mapfile.index.LongIndexToKey
  "A default implementation of IndexToKey that assumes (strictly requires) keys that are
 LongWritable values, where all values are both unique and contiguous (0 to numRecords()-1)
 This allows for easy inference of the number of records, and identify mapping between indexes and keys."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.hadoop.records.reader.mapfile.index LongIndexToKey]))

(defn ->long-index-to-key
  "Constructor."
  (^LongIndexToKey []
    (new LongIndexToKey )))

(defn initialize
  "Description copied from interface: IndexToKey

  readers - The underlying map file readers - `org.apache.hadoop.io.MapFile.Reader[]`
  value-class - `java.lang.Class`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<java.lang.Long,java.lang.Long>>`

  throws: java.io.IOException"
  (^java.util.List [^LongIndexToKey this readers ^java.lang.Class value-class]
    (-> this (.initialize readers value-class))))

(defn get-key-for-index
  "Description copied from interface: IndexToKey

  index - 0 to getNumRecords(reader) - `long`

  returns: The key for the given index - `org.apache.hadoop.io.LongWritable`"
  (^org.apache.hadoop.io.LongWritable [^LongIndexToKey this ^Long index]
    (-> this (.getKeyForIndex index))))

(defn get-num-records
  "Description copied from interface: IndexToKey

  returns: Number of records in the map file(s) - `long`

  throws: java.io.IOException"
  (^Long [^LongIndexToKey this]
    (-> this (.getNumRecords))))

