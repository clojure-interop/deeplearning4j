(ns org.datavec.api.transform.transform.time.DeriveColumnsFromTimeTransform
  "Create a number of new columns by deriving their values from a Time column.
 Can be used for example to create new columns with the year, month, day, hour, minute, second etc."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.time DeriveColumnsFromTimeTransform]))

(defn ->derive-columns-from-time-transform
  "Constructor.

  column-name - `java.lang.String`
  insert-after - `java.lang.String`
  input-time-zone - `org.joda.time.DateTimeZone`
  derived-columns - `java.util.List`"
  (^DeriveColumnsFromTimeTransform [^java.lang.String column-name ^java.lang.String insert-after ^org.joda.time.DateTimeZone input-time-zone ^java.util.List derived-columns]
    (new DeriveColumnsFromTimeTransform column-name insert-after input-time-zone derived-columns)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^DeriveColumnsFromTimeTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^DeriveColumnsFromTimeTransform this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^DeriveColumnsFromTimeTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DeriveColumnsFromTimeTransform this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^DeriveColumnsFromTimeTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^DeriveColumnsFromTimeTransform this]
    (-> this (.getInputSchema))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^DeriveColumnsFromTimeTransform this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^DeriveColumnsFromTimeTransform this]
    (-> this (.columnNames))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^DeriveColumnsFromTimeTransform this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^DeriveColumnsFromTimeTransform this]
    (-> this (.columnName))))

