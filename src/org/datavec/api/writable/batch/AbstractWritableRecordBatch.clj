(ns org.datavec.api.writable.batch.AbstractWritableRecordBatch
  "Simple base class for List>
 implementations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable.batch AbstractWritableRecordBatch]))

(defn ->abstract-writable-record-batch
  "Constructor."
  (^AbstractWritableRecordBatch []
    (new AbstractWritableRecordBatch )))

(defn add-all
  "i - `int`
  collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractWritableRecordBatch this ^Integer i ^java.util.Collection collection]
    (-> this (.addAll i collection)))
  (^Boolean [^AbstractWritableRecordBatch this ^java.util.Collection collection]
    (-> this (.addAll collection))))

(defn contains
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractWritableRecordBatch this ^java.lang.Object o]
    (-> this (.contains o))))

(defn list-iterator
  "i - `int`

  returns: `java.util.ListIterator<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.ListIterator [^AbstractWritableRecordBatch this ^Integer i]
    (-> this (.listIterator i)))
  (^java.util.ListIterator [^AbstractWritableRecordBatch this]
    (-> this (.listIterator))))

(defn iterator
  "returns: `java.util.Iterator<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.Iterator [^AbstractWritableRecordBatch this]
    (-> this (.iterator))))

(defn sub-list
  "i - `int`
  i-1 - `int`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^AbstractWritableRecordBatch this ^Integer i ^Integer i-1]
    (-> this (.subList i i-1))))

(defn last-index-of
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^AbstractWritableRecordBatch this ^java.lang.Object o]
    (-> this (.lastIndexOf o))))

(defn remove
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AbstractWritableRecordBatch this ^java.lang.Object o]
    (-> this (.remove o))))

(defn add
  "i - `int`
  writable - `java.util.List`"
  ([^AbstractWritableRecordBatch this ^Integer i ^java.util.List writable]
    (-> this (.add i writable)))
  (^Boolean [^AbstractWritableRecordBatch this ^java.util.List writable]
    (-> this (.add writable))))

(defn set
  "i - `int`
  writable - `java.util.List`

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^AbstractWritableRecordBatch this ^Integer i ^java.util.List writable]
    (-> this (.set i writable))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^AbstractWritableRecordBatch this]
    (-> this (.isEmpty))))

(defn retain-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractWritableRecordBatch this ^java.util.Collection collection]
    (-> this (.retainAll collection))))

(defn clear
  ""
  ([^AbstractWritableRecordBatch this]
    (-> this (.clear))))

(defn index-of
  "o - `java.lang.Object`

  returns: `int`"
  (^Integer [^AbstractWritableRecordBatch this ^java.lang.Object o]
    (-> this (.indexOf o))))

(defn to-array
  "ts - `T[]`

  returns: `<T> T[]`"
  ([^AbstractWritableRecordBatch this ts]
    (-> this (.toArray ts)))
  ([^AbstractWritableRecordBatch this]
    (-> this (.toArray))))

(defn remove-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractWritableRecordBatch this ^java.util.Collection collection]
    (-> this (.removeAll collection))))

(defn contains-all
  "collection - `java.util.Collection`

  returns: `boolean`"
  (^Boolean [^AbstractWritableRecordBatch this ^java.util.Collection collection]
    (-> this (.containsAll collection))))

