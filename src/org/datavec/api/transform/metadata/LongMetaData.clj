(ns org.datavec.api.transform.metadata.LongMetaData
  "Metadata for a long column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.metadata LongMetaData]))

(defn ->long-meta-data
  "Constructor.

  name - `java.lang.String`
  min-allowed-value - `java.lang.Long`
  max-allowed-value - `java.lang.Long`"
  (^LongMetaData [^java.lang.String name ^java.lang.Long min-allowed-value ^java.lang.Long max-allowed-value]
    (new LongMetaData name min-allowed-value max-allowed-value))
  (^LongMetaData [^java.lang.String name]
    (new LongMetaData name)))

(defn get-column-type
  "Description copied from interface: ColumnMetaData

  returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^LongMetaData this]
    (-> this (.getColumnType))))

(defn valid?
  "Description copied from interface: ColumnMetaData

  writable - Writable to check - `org.datavec.api.writable.Writable`

  returns: true if value, false if invalid - `boolean`"
  (^Boolean [^LongMetaData this ^org.datavec.api.writable.Writable writable]
    (-> this (.isValid writable))))

(defn clone
  "returns: `org.datavec.api.transform.metadata.LongMetaData`"
  (^org.datavec.api.transform.metadata.LongMetaData [^LongMetaData this]
    (-> this (.clone))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LongMetaData this]
    (-> this (.toString))))

