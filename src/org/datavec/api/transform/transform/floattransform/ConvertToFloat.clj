(ns org.datavec.api.transform.transform.floattransform.ConvertToFloat
  "Convert any value to a Float"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.floattransform ConvertToFloat]))

(defn ->convert-to-float
  "Constructor.

  column - Name of the column to convert to a Float column - `java.lang.String`"
  (^ConvertToFloat [^java.lang.String column]
    (new ConvertToFloat column)))

(defn map
  "Description copied from interface: Transform

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^ConvertToFloat this ^java.lang.Object input]
    (-> this (.map input))))

(defn get-new-column-meta-data
  "new-column-name - `java.lang.String`
  old-column-type - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^ConvertToFloat this ^java.lang.String new-column-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-type]
    (-> this (.getNewColumnMetaData new-column-name old-column-type))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ConvertToFloat this]
    (-> this (.toString))))

