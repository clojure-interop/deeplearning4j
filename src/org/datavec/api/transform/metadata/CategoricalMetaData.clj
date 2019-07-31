(ns org.datavec.api.transform.metadata.CategoricalMetaData
  "Metadata for categorical columns."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.metadata CategoricalMetaData]))

(defn ->categorical-meta-data
  "Constructor.

  name - `java.lang.String`
  state-names - `java.lang.String`"
  (^CategoricalMetaData [^java.lang.String name ^java.lang.String state-names]
    (new CategoricalMetaData name state-names)))

(defn get-column-type
  "Description copied from interface: ColumnMetaData

  returns: `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^CategoricalMetaData this]
    (-> this (.getColumnType))))

(defn valid?
  "Description copied from interface: ColumnMetaData

  writable - Writable to check - `org.datavec.api.writable.Writable`

  returns: true if value, false if invalid - `boolean`"
  (^Boolean [^CategoricalMetaData this ^org.datavec.api.writable.Writable writable]
    (-> this (.isValid writable))))

(defn clone
  "returns: `org.datavec.api.transform.metadata.CategoricalMetaData`"
  (^org.datavec.api.transform.metadata.CategoricalMetaData [^CategoricalMetaData this]
    (-> this (.clone))))

(defn get-state-names
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CategoricalMetaData this]
    (-> this (.getStateNames))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CategoricalMetaData this]
    (-> this (.toString))))

