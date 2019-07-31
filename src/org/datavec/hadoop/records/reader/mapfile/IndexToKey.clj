(ns org.datavec.hadoop.records.reader.mapfile.IndexToKey
  "An interface to handle Index to key conversion, for use in MapFileReader"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.hadoop.records.reader.mapfile IndexToKey]))

(defn initialize
  "Initialise the instance, and return the first and last record indexes (inclusive) for each reader

  readers - The underlying map file readers - `org.apache.hadoop.io.MapFile.Reader[]`
  value-class - `java.lang.Class`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<java.lang.Long,java.lang.Long>>`

  throws: java.io.IOException"
  (^java.util.List [^IndexToKey this readers ^java.lang.Class value-class]
    (-> this (.initialize readers value-class))))

(defn get-key-for-index
  "Get the key for the given index

  index - 0 to getNumRecords(reader) - `long`

  returns: The key for the given index - `org.apache.hadoop.io.WritableComparable`"
  (^org.apache.hadoop.io.WritableComparable [^IndexToKey this ^Long index]
    (-> this (.getKeyForIndex index))))

(defn get-num-records
  "Getter infer the number of records in the given map file(s)

  returns: Number of records in the map file(s) - `long`

  throws: java.io.IOException"
  (^Long [^IndexToKey this]
    (-> this (.getNumRecords))))

