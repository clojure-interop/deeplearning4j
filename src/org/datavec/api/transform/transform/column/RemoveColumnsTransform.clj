(ns org.datavec.api.transform.transform.column.RemoveColumnsTransform
  "Remove the specified columns from the data.
 To specify only the columns to keep,
 use RemoveAllColumnsExceptForTransform"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.column RemoveColumnsTransform]))

(defn ->remove-columns-transform
  "Constructor.

  columns-to-remove - `java.lang.String`"
  (^RemoveColumnsTransform [^java.lang.String columns-to-remove]
    (new RemoveColumnsTransform columns-to-remove)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^RemoveColumnsTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^RemoveColumnsTransform this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^RemoveColumnsTransform this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.transform schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RemoveColumnsTransform this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  schema - `org.datavec.api.transform.schema.Schema`"
  ([^RemoveColumnsTransform this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.setInputSchema schema))))

(defn map-sequence
  "Transform a sequence

  sequence - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RemoveColumnsTransform this ^java.lang.Object sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^RemoveColumnsTransform this]
    (-> this (.columnNames))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RemoveColumnsTransform this]
    (-> this (.hashCode))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^RemoveColumnsTransform this]
    (-> this (.outputColumnNames))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RemoveColumnsTransform this ^java.lang.Object o]
    (-> this (.equals o))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^RemoveColumnsTransform this]
    (-> this (.columnName))))

