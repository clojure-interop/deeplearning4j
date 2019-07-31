(ns org.nd4j.linalg.util.SynchronizedTable
  "Synchronized table"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util SynchronizedTable]))

(defn ->synchronized-table
  "Constructor.

  wrapped - `com.google.common.collect.Table`"
  (^SynchronizedTable [^com.google.common.collect.Table wrapped]
    (new SynchronizedTable wrapped)))

(defn values
  "returns: `java.util.Collection<V>`"
  (^java.util.Collection [^SynchronizedTable this]
    (-> this (.values))))

(defn put-all
  "table - `com.google.common.collect.Table`"
  ([^SynchronizedTable this ^com.google.common.collect.Table table]
    (-> this (.putAll table))))

(defn contains-column
  "column-key - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SynchronizedTable this ^java.lang.Object column-key]
    (-> this (.containsColumn column-key))))

(defn put
  "row-key - `R`
  column-key - `C`
  value - `V`

  returns: `V`"
  ([^SynchronizedTable this row-key column-key value]
    (-> this (.put row-key column-key value))))

(defn column-key-set
  "returns: `java.util.Set<C>`"
  (^java.util.Set [^SynchronizedTable this]
    (-> this (.columnKeySet))))

(defn contains
  "row-key - `java.lang.Object`
  column-key - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SynchronizedTable this ^java.lang.Object row-key ^java.lang.Object column-key]
    (-> this (.contains row-key column-key))))

(defn contains-value
  "value - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SynchronizedTable this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn contains-row
  "row-key - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SynchronizedTable this ^java.lang.Object row-key]
    (-> this (.containsRow row-key))))

(defn remove
  "row-key - `java.lang.Object`
  column-key - `java.lang.Object`

  returns: `V`"
  ([^SynchronizedTable this ^java.lang.Object row-key ^java.lang.Object column-key]
    (-> this (.remove row-key column-key))))

(defn column
  "column-key - `C`

  returns: `java.util.Map<R,V>`"
  (^java.util.Map [^SynchronizedTable this column-key]
    (-> this (.column column-key))))

(defn row
  "row-key - `R`

  returns: `java.util.Map<C,V>`"
  (^java.util.Map [^SynchronizedTable this row-key]
    (-> this (.row row-key))))

(defn column-map
  "returns: `java.util.Map<C,java.util.Map<R,V>>`"
  (^java.util.Map [^SynchronizedTable this]
    (-> this (.columnMap))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^SynchronizedTable this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^SynchronizedTable this]
    (-> this (.size))))

(defn clear
  ""
  ([^SynchronizedTable this]
    (-> this (.clear))))

(defn cell-set
  "returns: `java.util.Set<com.google.common.collect.Table.Cell<R,C,V>>`"
  (^java.util.Set [^SynchronizedTable this]
    (-> this (.cellSet))))

(defn get
  "row-key - `java.lang.Object`
  column-key - `java.lang.Object`

  returns: `V`"
  ([^SynchronizedTable this ^java.lang.Object row-key ^java.lang.Object column-key]
    (-> this (.get row-key column-key))))

(defn row-key-set
  "returns: `java.util.Set<R>`"
  (^java.util.Set [^SynchronizedTable this]
    (-> this (.rowKeySet))))

(defn row-map
  "returns: `java.util.Map<R,java.util.Map<C,V>>`"
  (^java.util.Map [^SynchronizedTable this]
    (-> this (.rowMap))))

