(ns org.datavec.api.transform.metadata.StringMetaData
  "Metadata for an String column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.metadata StringMetaData]))

(defn ->string-meta-data
  "Constructor.

  Default constructor with no restrictions on allowable strings

  name - `java.lang.String`"
  (^StringMetaData [^java.lang.String name]
    (new StringMetaData name))
  (^StringMetaData [^java.lang.String name ^java.lang.String must-match-regex ^java.lang.Integer min-length ^java.lang.Integer max-length]
    (new StringMetaData name must-match-regex min-length max-length))
  (^StringMetaData []
    (new StringMetaData )))

(defn get-column-type
  "Description copied from interface: ColumnMetaData

  returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^StringMetaData this]
    (-> this (.getColumnType))))

(defn valid?
  "Description copied from interface: ColumnMetaData

  writable - Writable to check - `org.datavec.api.writable.Writable`

  returns: true if value, false if invalid - `boolean`"
  (^Boolean [^StringMetaData this ^org.datavec.api.writable.Writable writable]
    (-> this (.isValid writable))))

(defn clone
  "returns: `org.datavec.api.transform.metadata.StringMetaData`"
  (^org.datavec.api.transform.metadata.StringMetaData [^StringMetaData this]
    (-> this (.clone))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StringMetaData this]
    (-> this (.toString))))

