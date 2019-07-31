(ns org.datavec.api.transform.transform.string.AppendStringColumnTransform
  "Append a String to the
 values in a single column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.string AppendStringColumnTransform]))

(defn ->append-string-column-transform
  "Constructor.

  column-name - `java.lang.String`
  to-append - `java.lang.String`"
  (^AppendStringColumnTransform [^java.lang.String column-name ^java.lang.String to-append]
    (new AppendStringColumnTransform column-name to-append)))

(defn get-new-column-meta-data
  "new-name - `java.lang.String`
  old-column-type - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^AppendStringColumnTransform this ^java.lang.String new-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-type]
    (-> this (.getNewColumnMetaData new-name old-column-type))))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^AppendStringColumnTransform this ^java.lang.Object input]
    (-> this (.map input))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AppendStringColumnTransform this]
    (-> this (.toString))))

