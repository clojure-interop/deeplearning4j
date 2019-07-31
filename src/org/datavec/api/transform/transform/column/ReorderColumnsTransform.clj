(ns org.datavec.api.transform.transform.column.ReorderColumnsTransform
  "Rearrange the order of the columns.
 Note: A partial list of columns can be used here. Any columns that are not explicitly mentioned
 will be placed after those that are in the output, without changing their relative order."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.column ReorderColumnsTransform]))

(defn ->reorder-columns-transform
  "Constructor.

  new-order - A partial or complete order of the columns in the output - `java.lang.String`"
  (^ReorderColumnsTransform [^java.lang.String new-order]
    (new ReorderColumnsTransform new-order)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^ReorderColumnsTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^ReorderColumnsTransform this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ReorderColumnsTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ReorderColumnsTransform this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^ReorderColumnsTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ReorderColumnsTransform this]
    (-> this (.getInputSchema))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^ReorderColumnsTransform this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^ReorderColumnsTransform this]
    (-> this (.columnNames))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ReorderColumnsTransform this]
    (-> this (.hashCode))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^ReorderColumnsTransform this]
    (-> this (.outputColumnNames))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ReorderColumnsTransform this ^java.lang.Object o]
    (-> this (.equals o))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^ReorderColumnsTransform this]
    (-> this (.columnName))))

