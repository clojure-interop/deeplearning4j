(ns org.datavec.api.transform.transform.string.BaseStringTransform
  "Abstract String column transform"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.string BaseStringTransform]))

(defn ->base-string-transform
  "Constructor.

  column - `java.lang.String`"
  (^BaseStringTransform [^java.lang.String column]
    (new BaseStringTransform column)))

(defn map
  "Transform the writable in to a
  string

  writable - the writable to transform - `org.datavec.api.writable.Writable`

  returns: the string form of this writable - `org.datavec.api.writable.Text`"
  (^org.datavec.api.writable.Text [^BaseStringTransform this ^org.datavec.api.writable.Writable writable]
    (-> this (.map writable))))

(defn get-new-column-meta-data
  "new-name - `java.lang.String`
  old-column-type - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^BaseStringTransform this ^java.lang.String new-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-type]
    (-> this (.getNewColumnMetaData new-name old-column-type))))

