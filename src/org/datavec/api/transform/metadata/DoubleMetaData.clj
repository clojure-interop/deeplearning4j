(ns org.datavec.api.transform.metadata.DoubleMetaData
  "MetaData for a double column."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.metadata DoubleMetaData]))

(defn ->double-meta-data
  "Constructor.

  name - `java.lang.String`
  min - Min allowed value. If null: no restriction on minAllowedValue value value in this column - `java.lang.Double`
  max-allowed-value - Max allowed value. If null: no restiction on maxAllowedValue value in this column - `java.lang.Double`
  allow-na-n - Are NaN values ok? - `boolean`
  allow-infinite - Are /- infinite values ok? - `boolean`"
  (^DoubleMetaData [^java.lang.String name ^java.lang.Double min ^java.lang.Double max-allowed-value ^Boolean allow-na-n ^Boolean allow-infinite]
    (new DoubleMetaData name min max-allowed-value allow-na-n allow-infinite))
  (^DoubleMetaData [^java.lang.String name ^java.lang.Double min-allowed-value ^java.lang.Double max-allowed-value]
    (new DoubleMetaData name min-allowed-value max-allowed-value))
  (^DoubleMetaData [^java.lang.String name]
    (new DoubleMetaData name)))

(defn get-column-type
  "Description copied from interface: ColumnMetaData

  returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^DoubleMetaData this]
    (-> this (.getColumnType))))

(defn valid?
  "Description copied from interface: ColumnMetaData

  writable - Writable to check - `org.datavec.api.writable.Writable`

  returns: true if value, false if invalid - `boolean`"
  (^Boolean [^DoubleMetaData this ^org.datavec.api.writable.Writable writable]
    (-> this (.isValid writable))))

(defn clone
  "returns: `org.datavec.api.transform.metadata.DoubleMetaData`"
  (^org.datavec.api.transform.metadata.DoubleMetaData [^DoubleMetaData this]
    (-> this (.clone))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DoubleMetaData this]
    (-> this (.toString))))

