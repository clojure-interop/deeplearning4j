(ns org.datavec.api.transform.transform.integer.BaseIntegerTransform
  "Abstract integer transformation (single column)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.integer BaseIntegerTransform]))

(defn ->base-integer-transform
  "Constructor.

  column - `java.lang.String`"
  (^BaseIntegerTransform [^java.lang.String column]
    (new BaseIntegerTransform column)))

(defn map
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^BaseIntegerTransform this ^org.datavec.api.writable.Writable writable]
    (-> this (.map writable))))

(defn get-new-column-meta-data
  "new-name - `java.lang.String`
  old-column-meta - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^BaseIntegerTransform this ^java.lang.String new-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-meta]
    (-> this (.getNewColumnMetaData new-name old-column-meta))))

