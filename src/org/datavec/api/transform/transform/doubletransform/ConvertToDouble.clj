(ns org.datavec.api.transform.transform.doubletransform.ConvertToDouble
  "Convert any value to an Double"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.doubletransform ConvertToDouble]))

(defn ->convert-to-double
  "Constructor.

  column - Name of the column to convert to a Double column - `java.lang.String`"
  (^ConvertToDouble [^java.lang.String column]
    (new ConvertToDouble column)))

(defn map
  "Description copied from interface: Transform

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^ConvertToDouble this ^java.lang.Object input]
    (-> this (.map input))))

(defn get-new-column-meta-data
  "new-column-name - `java.lang.String`
  old-column-type - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^ConvertToDouble this ^java.lang.String new-column-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-type]
    (-> this (.getNewColumnMetaData new-column-name old-column-type))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ConvertToDouble this]
    (-> this (.toString))))

