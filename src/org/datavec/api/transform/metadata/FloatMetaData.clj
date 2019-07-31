(ns org.datavec.api.transform.metadata.FloatMetaData
  "MetaData for a Float column."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.metadata FloatMetaData]))

(defn ->float-meta-data
  "Constructor.

  name - `java.lang.String`
  min - Min allowed value. If null: no restriction on minAllowedValue value value in this column - `java.lang.Float`
  max-allowed-value - Max allowed value. If null: no restiction on maxAllowedValue value in this column - `java.lang.Float`
  allow-na-n - Are NaN values ok? - `boolean`
  allow-infinite - Are /- infinite values ok? - `boolean`"
  (^FloatMetaData [^java.lang.String name ^java.lang.Float min ^java.lang.Float max-allowed-value ^Boolean allow-na-n ^Boolean allow-infinite]
    (new FloatMetaData name min max-allowed-value allow-na-n allow-infinite))
  (^FloatMetaData [^java.lang.String name ^java.lang.Float min-allowed-value ^java.lang.Float max-allowed-value]
    (new FloatMetaData name min-allowed-value max-allowed-value))
  (^FloatMetaData [^java.lang.String name]
    (new FloatMetaData name)))

(defn get-column-type
  "Description copied from interface: ColumnMetaData

  returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^FloatMetaData this]
    (-> this (.getColumnType))))

(defn valid?
  "Description copied from interface: ColumnMetaData

  writable - Writable to check - `org.datavec.api.writable.Writable`

  returns: true if value, false if invalid - `boolean`"
  (^Boolean [^FloatMetaData this ^org.datavec.api.writable.Writable writable]
    (-> this (.isValid writable))))

(defn clone
  "returns: `org.datavec.api.transform.metadata.FloatMetaData`"
  (^org.datavec.api.transform.metadata.FloatMetaData [^FloatMetaData this]
    (-> this (.clone))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FloatMetaData this]
    (-> this (.toString))))

