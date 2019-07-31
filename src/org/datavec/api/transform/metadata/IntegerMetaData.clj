(ns org.datavec.api.transform.metadata.IntegerMetaData
  "Metadata for an integer column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.metadata IntegerMetaData]))

(defn ->integer-meta-data
  "Constructor.

  name - `java.lang.String`
  min - Min allowed value. If null: no restriction on min value value in this column - `java.lang.Integer`
  max - Max allowed value. If null: no restiction on max value in this column - `java.lang.Integer`"
  (^IntegerMetaData [^java.lang.String name ^java.lang.Integer min ^java.lang.Integer max]
    (new IntegerMetaData name min max))
  (^IntegerMetaData [^java.lang.String name]
    (new IntegerMetaData name)))

(defn get-column-type
  "Description copied from interface: ColumnMetaData

  returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^IntegerMetaData this]
    (-> this (.getColumnType))))

(defn valid?
  "Description copied from interface: ColumnMetaData

  writable - Writable to check - `org.datavec.api.writable.Writable`

  returns: true if value, false if invalid - `boolean`"
  (^Boolean [^IntegerMetaData this ^org.datavec.api.writable.Writable writable]
    (-> this (.isValid writable))))

(defn clone
  "returns: `org.datavec.api.transform.metadata.IntegerMetaData`"
  (^org.datavec.api.transform.metadata.IntegerMetaData [^IntegerMetaData this]
    (-> this (.clone))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^IntegerMetaData this]
    (-> this (.toString))))

