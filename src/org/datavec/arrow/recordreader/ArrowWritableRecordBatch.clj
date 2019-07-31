(ns org.datavec.arrow.recordreader.ArrowWritableRecordBatch
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.arrow.recordreader ArrowWritableRecordBatch]))

(defn ->arrow-writable-record-batch
  "Constructor.

  An index in to an individual
  ArrowRecordBatch

  list - the list of field vectors to use - `java.util.List`
  schema - the schema to use - `org.datavec.api.transform.schema.Schema`"
  (^ArrowWritableRecordBatch [^java.util.List list ^org.datavec.api.transform.schema.Schema schema]
    (new ArrowWritableRecordBatch list schema))
  (^ArrowWritableRecordBatch [^java.util.List list ^org.datavec.api.transform.schema.Schema schema ^Integer offset ^Integer rows]
    (new ArrowWritableRecordBatch list schema offset rows)))

(defn add-all
  "i - `int`
  collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^ArrowWritableRecordBatch this ^Integer i ^java.util.Collection collection]
    (-> this (.addAll i collection)))
  (^Boolean [^ArrowWritableRecordBatch this ^java.util.Collection collection]
    (-> this (.addAll collection))))

(defn to-array-list
  "returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^ArrowWritableRecordBatch this]
    (-> this (.toArrayList))))

(defn contains
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ArrowWritableRecordBatch this ^java.lang.Object o]
    (-> this (.contains o))))

(defn list-iterator
  "i - `int`

  returns: `java.util.ListIterator<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.ListIterator [^ArrowWritableRecordBatch this ^Integer i]
    (-> this (.listIterator i)))
  (^java.util.ListIterator [^ArrowWritableRecordBatch this]
    (-> this (.listIterator))))

(defn iterator
  "returns: `java.util.Iterator<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.Iterator [^ArrowWritableRecordBatch this]
    (-> this (.iterator))))

(defn sub-list
  "i - `int`
  i-1 - `int`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^ArrowWritableRecordBatch this ^Integer i ^Integer i-1]
    (-> this (.subList i i-1))))

(defn last-index-of
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^ArrowWritableRecordBatch this ^java.lang.Object o]
    (-> this (.lastIndexOf o))))

(defn remove
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ArrowWritableRecordBatch this ^java.lang.Object o]
    (-> this (.remove o))))

(defn close
  "throws: java.io.IOException"
  ([^ArrowWritableRecordBatch this]
    (-> this (.close))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ArrowWritableRecordBatch this]
    (-> this (.hashCode))))

(defn add
  "i - `int`
  writable - `java.util.List`"
  ([^ArrowWritableRecordBatch this ^Integer i ^java.util.List writable]
    (-> this (.add i writable)))
  (^Boolean [^ArrowWritableRecordBatch this ^java.util.List writable]
    (-> this (.add writable))))

(defn set
  "i - `int`
  writable - `java.util.List`

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^ArrowWritableRecordBatch this ^Integer i ^java.util.List writable]
    (-> this (.set i writable))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^ArrowWritableRecordBatch this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^ArrowWritableRecordBatch this]
    (-> this (.size))))

(defn retain-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^ArrowWritableRecordBatch this ^java.util.Collection collection]
    (-> this (.retainAll collection))))

(defn clear
  ""
  ([^ArrowWritableRecordBatch this]
    (-> this (.clear))))

(defn index-of
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^ArrowWritableRecordBatch this ^java.lang.Object o]
    (-> this (.indexOf o))))

(defn to-array
  "ts - `T[]`

  returns: `<T> T[]`"
  ([^ArrowWritableRecordBatch this ts]
    (-> this (.toArray ts)))
  ([^ArrowWritableRecordBatch this]
    (-> this (.toArray))))

(defn remove-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^ArrowWritableRecordBatch this ^java.util.Collection collection]
    (-> this (.removeAll collection))))

(defn get
  "i - `int`

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^ArrowWritableRecordBatch this ^Integer i]
    (-> this (.get i))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ArrowWritableRecordBatch this ^java.lang.Object o]
    (-> this (.equals o))))

(defn contains-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^ArrowWritableRecordBatch this ^java.util.Collection collection]
    (-> this (.containsAll collection))))

