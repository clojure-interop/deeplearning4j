(ns org.datavec.api.transform.transform.floattransform.BaseFloatTransform
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.floattransform BaseFloatTransform]))

(defn ->base-float-transform
  "Constructor.

  column - `java.lang.String`"
  (^BaseFloatTransform [^java.lang.String column]
    (new BaseFloatTransform column)))

(defn map
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^BaseFloatTransform this ^org.datavec.api.writable.Writable writable]
    (-> this (.map writable))))

(defn get-new-column-meta-data
  "new-column-name - `java.lang.String`
  old-column-meta - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^BaseFloatTransform this ^java.lang.String new-column-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-meta]
    (-> this (.getNewColumnMetaData new-column-name old-column-meta))))

