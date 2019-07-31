(ns org.datavec.api.transform.metadata.ColumnMetaData
  "ColumnMetaData: metadata for each column. Used to define:
 (a) the type of each column, and
 (b) any restrictions on the allowable values in each column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.metadata ColumnMetaData]))

(defn get-name
  "Get the name of the specified column

  returns: Name of the column - `java.lang.String`"
  (^java.lang.String [^ColumnMetaData this]
    (-> this (.getName))))

(defn set-name
  "Setter for the name

  name - `java.lang.String`"
  ([^ColumnMetaData this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-column-type
  "Get the type of column

  returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^ColumnMetaData this]
    (-> this (.getColumnType))))

(defn valid?
  "Is the given Writable valid for this column, given the column type and any restrictions given by the
  ColumnMetaData object?

  writable - Writable to check - `org.datavec.api.writable.Writable`

  returns: true if value, false if invalid - `boolean`"
  (^Boolean [^ColumnMetaData this ^org.datavec.api.writable.Writable writable]
    (-> this (.isValid writable))))

(defn clone
  "returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^ColumnMetaData this]
    (-> this (.clone))))

