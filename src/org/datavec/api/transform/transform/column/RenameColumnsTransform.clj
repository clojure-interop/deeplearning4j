(ns org.datavec.api.transform.transform.column.RenameColumnsTransform
  "Rename one or more columns"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.column RenameColumnsTransform]))

(defn ->rename-columns-transform
  "Constructor.

  old-name - `java.lang.String`
  new-name - `java.lang.String`"
  (^RenameColumnsTransform [^java.lang.String old-name ^java.lang.String new-name]
    (new RenameColumnsTransform old-name new-name)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^RenameColumnsTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^RenameColumnsTransform this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^RenameColumnsTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RenameColumnsTransform this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^RenameColumnsTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^RenameColumnsTransform this]
    (-> this (.getInputSchema))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^RenameColumnsTransform this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^RenameColumnsTransform this]
    (-> this (.columnNames))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RenameColumnsTransform this]
    (-> this (.hashCode))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^RenameColumnsTransform this]
    (-> this (.outputColumnNames))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RenameColumnsTransform this ^java.lang.Object o]
    (-> this (.equals o))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^RenameColumnsTransform this]
    (-> this (.columnName))))

