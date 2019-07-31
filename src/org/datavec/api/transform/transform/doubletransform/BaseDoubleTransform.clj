(ns org.datavec.api.transform.transform.doubletransform.BaseDoubleTransform
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.doubletransform BaseDoubleTransform]))

(defn ->base-double-transform
  "Constructor.

  column - `java.lang.String`"
  (^BaseDoubleTransform [^java.lang.String column]
    (new BaseDoubleTransform column)))

(defn map
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^BaseDoubleTransform this ^org.datavec.api.writable.Writable writable]
    (-> this (.map writable))))

(defn get-new-column-meta-data
  "new-column-name - `java.lang.String`
  old-column-meta - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^BaseDoubleTransform this ^java.lang.String new-column-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-meta]
    (-> this (.getNewColumnMetaData new-column-name old-column-meta))))

