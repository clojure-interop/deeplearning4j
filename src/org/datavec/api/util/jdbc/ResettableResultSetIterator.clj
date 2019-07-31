(ns org.datavec.api.util.jdbc.ResettableResultSetIterator
  "Encapsulation of ResultSetIterator to allow resetting"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.util.jdbc ResettableResultSetIterator]))

(defn ->resettable-result-set-iterator
  "Constructor.

  rs - `java.sql.ResultSet`"
  (^ResettableResultSetIterator [^java.sql.ResultSet rs]
    (new ResettableResultSetIterator rs)))

(defn reset
  ""
  ([^ResettableResultSetIterator this]
    (-> this (.reset))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^ResettableResultSetIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `java.lang.Object[]`"
  ([^ResettableResultSetIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^ResettableResultSetIterator this]
    (-> this (.remove))))

