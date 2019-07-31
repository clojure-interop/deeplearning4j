(ns org.datavec.api.transform.metadata.NDArrayMetaData
  "Meta data class for NDArray columns"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.metadata NDArrayMetaData]))

(defn ->nd-array-meta-data
  "Constructor.

  name - Name of the NDArray column - `java.lang.String`
  shape - shape of the NDArray column. Use -1 in entries to specify as \"variable length\" in that dimension - `long[]`"
  (^NDArrayMetaData [^java.lang.String name shape]
    (new NDArrayMetaData name shape)))

(defn get-column-type
  "Description copied from interface: ColumnMetaData

  returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^NDArrayMetaData this]
    (-> this (.getColumnType))))

(defn valid?
  "Description copied from interface: ColumnMetaData

  writable - Writable to check - `org.datavec.api.writable.Writable`

  returns: true if value, false if invalid - `boolean`"
  (^Boolean [^NDArrayMetaData this ^org.datavec.api.writable.Writable writable]
    (-> this (.isValid writable))))

(defn clone
  "returns: `org.datavec.api.transform.metadata.NDArrayMetaData`"
  (^org.datavec.api.transform.metadata.NDArrayMetaData [^NDArrayMetaData this]
    (-> this (.clone))))

