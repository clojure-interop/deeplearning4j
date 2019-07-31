(ns org.datavec.arrow.recordreader.ArrowWritableRecordTimeSeriesBatch
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.arrow.recordreader ArrowWritableRecordTimeSeriesBatch]))

(defn ->arrow-writable-record-time-series-batch
  "Constructor.

  An index in to an individual
  ArrowRecordBatch

  list - the list of field vectors to use - `java.util.List`
  schema - the schema to use - `org.datavec.api.transform.schema.Schema`
  time-series-stride - `int`"
  (^ArrowWritableRecordTimeSeriesBatch [^java.util.List list ^org.datavec.api.transform.schema.Schema schema ^Integer time-series-stride]
    (new ArrowWritableRecordTimeSeriesBatch list schema time-series-stride)))

(defn add-all
  "i - `int`
  collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^ArrowWritableRecordTimeSeriesBatch this ^Integer i ^java.util.Collection collection]
    (-> this (.addAll i collection)))
  (^Boolean [^ArrowWritableRecordTimeSeriesBatch this ^java.util.Collection collection]
    (-> this (.addAll collection))))

(defn to-array-list
  "returns: `java.util.List<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^java.util.List [^ArrowWritableRecordTimeSeriesBatch this]
    (-> this (.toArrayList))))

(defn contains
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ArrowWritableRecordTimeSeriesBatch this ^java.lang.Object o]
    (-> this (.contains o))))

(defn list-iterator
  "i - `int`

  returns: `java.util.ListIterator<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^java.util.ListIterator [^ArrowWritableRecordTimeSeriesBatch this ^Integer i]
    (-> this (.listIterator i)))
  (^java.util.ListIterator [^ArrowWritableRecordTimeSeriesBatch this]
    (-> this (.listIterator))))

(defn iterator
  "returns: `java.util.Iterator<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^java.util.Iterator [^ArrowWritableRecordTimeSeriesBatch this]
    (-> this (.iterator))))

(defn sub-list
  "i - `int`
  i-1 - `int`

  returns: `java.util.List<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^java.util.List [^ArrowWritableRecordTimeSeriesBatch this ^Integer i ^Integer i-1]
    (-> this (.subList i i-1))))

(defn last-index-of
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^ArrowWritableRecordTimeSeriesBatch this ^java.lang.Object o]
    (-> this (.lastIndexOf o))))

(defn remove
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ArrowWritableRecordTimeSeriesBatch this ^java.lang.Object o]
    (-> this (.remove o))))

(defn close
  "throws: java.io.IOException"
  ([^ArrowWritableRecordTimeSeriesBatch this]
    (-> this (.close))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ArrowWritableRecordTimeSeriesBatch this]
    (-> this (.hashCode))))

(defn add
  "i - `int`
  writable - `java.util.List`"
  ([^ArrowWritableRecordTimeSeriesBatch this ^Integer i ^java.util.List writable]
    (-> this (.add i writable)))
  (^Boolean [^ArrowWritableRecordTimeSeriesBatch this ^java.util.List writable]
    (-> this (.add writable))))

(defn set
  "i - `int`
  writable - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^ArrowWritableRecordTimeSeriesBatch this ^Integer i ^java.util.List writable]
    (-> this (.set i writable))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^ArrowWritableRecordTimeSeriesBatch this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^ArrowWritableRecordTimeSeriesBatch this]
    (-> this (.size))))

(defn retain-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^ArrowWritableRecordTimeSeriesBatch this ^java.util.Collection collection]
    (-> this (.retainAll collection))))

(defn clear
  ""
  ([^ArrowWritableRecordTimeSeriesBatch this]
    (-> this (.clear))))

(defn index-of
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^ArrowWritableRecordTimeSeriesBatch this ^java.lang.Object o]
    (-> this (.indexOf o))))

(defn to-array
  "ts - `T[]`

  returns: `<T> T[]`"
  ([^ArrowWritableRecordTimeSeriesBatch this ts]
    (-> this (.toArray ts)))
  ([^ArrowWritableRecordTimeSeriesBatch this]
    (-> this (.toArray))))

(defn remove-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^ArrowWritableRecordTimeSeriesBatch this ^java.util.Collection collection]
    (-> this (.removeAll collection))))

(defn get
  "i - `int`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^ArrowWritableRecordTimeSeriesBatch this ^Integer i]
    (-> this (.get i))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ArrowWritableRecordTimeSeriesBatch this ^java.lang.Object o]
    (-> this (.equals o))))

(defn contains-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^ArrowWritableRecordTimeSeriesBatch this ^java.util.Collection collection]
    (-> this (.containsAll collection))))

