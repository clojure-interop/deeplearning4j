(ns org.datavec.api.transform.metadata.BinaryMetaData
  "Metadata for an integer column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.metadata BinaryMetaData]))

(defn ->binary-meta-data
  "Constructor.

  name - `java.lang.String`"
  (^BinaryMetaData [^java.lang.String name]
    (new BinaryMetaData name)))

(defn get-column-type
  "Description copied from interface: ColumnMetaData

  returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^BinaryMetaData this]
    (-> this (.getColumnType))))

(defn valid?
  "Description copied from interface: ColumnMetaData

  writable - Writable to check - `org.datavec.api.writable.Writable`

  returns: true if value, false if invalid - `boolean`"
  (^Boolean [^BinaryMetaData this ^org.datavec.api.writable.Writable writable]
    (-> this (.isValid writable))))

(defn clone
  "returns: `org.datavec.api.transform.metadata.BinaryMetaData`"
  (^org.datavec.api.transform.metadata.BinaryMetaData [^BinaryMetaData this]
    (-> this (.clone))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BinaryMetaData this]
    (-> this (.toString))))

