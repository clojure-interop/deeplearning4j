(ns org.datavec.api.writable.batch.AbstractTimeSeriesWritableRecordBatch
  "Simple base class for List>
 implementations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable.batch AbstractTimeSeriesWritableRecordBatch]))

(defn ->abstract-time-series-writable-record-batch
  "Constructor."
  (^AbstractTimeSeriesWritableRecordBatch []
    (new AbstractTimeSeriesWritableRecordBatch )))

(defn add-all
  "i - `int`
  collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractTimeSeriesWritableRecordBatch this ^Integer i ^java.util.Collection collection]
    (-> this (.addAll i collection)))
  (^Boolean [^AbstractTimeSeriesWritableRecordBatch this ^java.util.Collection collection]
    (-> this (.addAll collection))))

(defn contains
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractTimeSeriesWritableRecordBatch this ^java.lang.Object o]
    (-> this (.contains o))))

(defn list-iterator
  "i - `int`

  returns: `java.util.ListIterator<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^java.util.ListIterator [^AbstractTimeSeriesWritableRecordBatch this ^Integer i]
    (-> this (.listIterator i)))
  (^java.util.ListIterator [^AbstractTimeSeriesWritableRecordBatch this]
    (-> this (.listIterator))))

(defn iterator
  "returns: `java.util.Iterator<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^java.util.Iterator [^AbstractTimeSeriesWritableRecordBatch this]
    (-> this (.iterator))))

(defn sub-list
  "i - `int`
  i-1 - `int`

  returns: `java.util.List<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`"
  (^java.util.List [^AbstractTimeSeriesWritableRecordBatch this ^Integer i ^Integer i-1]
    (-> this (.subList i i-1))))

(defn last-index-of
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^AbstractTimeSeriesWritableRecordBatch this ^java.lang.Object o]
    (-> this (.lastIndexOf o))))

(defn remove
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractTimeSeriesWritableRecordBatch this ^java.lang.Object o]
    (-> this (.remove o))))

(defn add
  "i - `int`
  writable - `java.util.List`"
  ([^AbstractTimeSeriesWritableRecordBatch this ^Integer i ^java.util.List writable]
    (-> this (.add i writable)))
  (^Boolean [^AbstractTimeSeriesWritableRecordBatch this ^java.util.List writable]
    (-> this (.add writable))))

(defn set
  "i - `int`
  writable - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^AbstractTimeSeriesWritableRecordBatch this ^Integer i ^java.util.List writable]
    (-> this (.set i writable))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^AbstractTimeSeriesWritableRecordBatch this]
    (-> this (.isEmpty))))

(defn retain-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractTimeSeriesWritableRecordBatch this ^java.util.Collection collection]
    (-> this (.retainAll collection))))

(defn clear
  ""
  ([^AbstractTimeSeriesWritableRecordBatch this]
    (-> this (.clear))))

(defn index-of
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^AbstractTimeSeriesWritableRecordBatch this ^java.lang.Object o]
    (-> this (.indexOf o))))

(defn to-array
  "ts - `T[]`

  returns: `<T> T[]`"
  ([^AbstractTimeSeriesWritableRecordBatch this ts]
    (-> this (.toArray ts)))
  ([^AbstractTimeSeriesWritableRecordBatch this]
    (-> this (.toArray))))

(defn remove-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractTimeSeriesWritableRecordBatch this ^java.util.Collection collection]
    (-> this (.removeAll collection))))

(defn contains-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractTimeSeriesWritableRecordBatch this ^java.util.Collection collection]
    (-> this (.containsAll collection))))

