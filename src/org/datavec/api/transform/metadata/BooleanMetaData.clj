(ns org.datavec.api.transform.metadata.BooleanMetaData
  "Metadata for an integer column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.metadata BooleanMetaData]))

(defn ->boolean-meta-data
  "Constructor.

  name - `java.lang.String`"
  (^BooleanMetaData [^java.lang.String name]
    (new BooleanMetaData name)))

(defn get-column-type
  "Description copied from interface: ColumnMetaData

  returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^BooleanMetaData this]
    (-> this (.getColumnType))))

(defn valid?
  "Description copied from interface: ColumnMetaData

  writable - Writable to check - `org.datavec.api.writable.Writable`

  returns: true if value, false if invalid - `boolean`"
  (^Boolean [^BooleanMetaData this ^org.datavec.api.writable.Writable writable]
    (-> this (.isValid writable))))

(defn clone
  "returns: `org.datavec.api.transform.metadata.BooleanMetaData`"
  (^org.datavec.api.transform.metadata.BooleanMetaData [^BooleanMetaData this]
    (-> this (.clone))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BooleanMetaData this]
    (-> this (.toString))))

