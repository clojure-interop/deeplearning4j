(ns org.datavec.api.transform.transform.BaseColumnTransform
  "Map the values in a single column to new values.
 For example: string -> string, or empty -> x type
 transforms for a single column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform BaseColumnTransform]))

(defn ->base-column-transform
  "Constructor.

  column-name - `java.lang.String`"
  (^BaseColumnTransform [^java.lang.String column-name]
    (new BaseColumnTransform column-name)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^BaseColumnTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^BaseColumnTransform this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^BaseColumnTransform this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.transform schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseColumnTransform this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^BaseColumnTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-new-column-meta-data
  "new-name - `java.lang.String`
  old-column-type - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^BaseColumnTransform this ^java.lang.String new-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-type]
    (-> this (.getNewColumnMetaData new-name old-column-type))))

(defn map-sequence
  "Transform a sequence

  sequence - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^BaseColumnTransform this ^java.lang.Object sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^BaseColumnTransform this]
    (-> this (.columnNames))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BaseColumnTransform this]
    (-> this (.hashCode))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^BaseColumnTransform this]
    (-> this (.outputColumnNames))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BaseColumnTransform this ^java.lang.Object o]
    (-> this (.equals o))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^BaseColumnTransform this]
    (-> this (.columnName))))

