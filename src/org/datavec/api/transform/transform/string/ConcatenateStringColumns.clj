(ns org.datavec.api.transform.transform.string.ConcatenateStringColumns
  "Concatenate values of one or more String columns into
 a new String column. Retains the constituent String
 columns so user must remove those manually, if desired.
 TODO: use new String Reduce functionality in DataVec?"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.string ConcatenateStringColumns]))

(defn ->concatenate-string-columns
  "Constructor.

  new-column-name - `java.lang.String`
  delimiter - `java.lang.String`
  columns-to-concatenate - A partial or complete order of the columns in the output - `java.lang.String`"
  (^ConcatenateStringColumns [^java.lang.String new-column-name ^java.lang.String delimiter ^java.lang.String columns-to-concatenate]
    (new ConcatenateStringColumns new-column-name delimiter columns-to-concatenate)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^ConcatenateStringColumns this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^ConcatenateStringColumns this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ConcatenateStringColumns this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ConcatenateStringColumns this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^ConcatenateStringColumns this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ConcatenateStringColumns this]
    (-> this (.getInputSchema))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^ConcatenateStringColumns this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^ConcatenateStringColumns this]
    (-> this (.columnNames))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ConcatenateStringColumns this]
    (-> this (.hashCode))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^ConcatenateStringColumns this]
    (-> this (.outputColumnNames))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ConcatenateStringColumns this ^java.lang.Object o]
    (-> this (.equals o))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^ConcatenateStringColumns this]
    (-> this (.columnName))))

