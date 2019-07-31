(ns org.datavec.api.transform.transform.categorical.StringToCategoricalTransform
  "Convert a String column
 to a categorical column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.categorical StringToCategoricalTransform]))

(defn ->string-to-categorical-transform
  "Constructor.

  column-name - `java.lang.String`
  state-names - `java.util.List`"
  (^StringToCategoricalTransform [^java.lang.String column-name ^java.util.List state-names]
    (new StringToCategoricalTransform column-name state-names)))

(defn get-new-column-meta-data
  "new-column-name - `java.lang.String`
  old-column-type - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^StringToCategoricalTransform this ^java.lang.String new-column-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-type]
    (-> this (.getNewColumnMetaData new-column-name old-column-type))))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^StringToCategoricalTransform this ^java.lang.Object input]
    (-> this (.map input))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StringToCategoricalTransform this]
    (-> this (.toString))))

(defn map-sequence
  "Transform a sequence

  sequence - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^StringToCategoricalTransform this ^java.lang.Object sequence]
    (-> this (.mapSequence sequence))))

