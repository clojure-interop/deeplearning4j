(ns org.datavec.api.transform.transform.categorical.PivotTransform
  "Pivot transform operates on two columns:
 - a categorical column that operates as a key, and
 - Another column that contains a value
 Essentially, Pivot transform takes keyvalue pairs and breaks them out into separate columns.
 For example, with schema [col0, key, value, col3]
 and values with key in {a,b,c}
 Output schema is [col0, key[a], key[b], key[c], col3]
 and input (col0Val, b, x, col3Val) gets mapped to (col0Val, 0, x, 0, col3Val).
 When expanding columns, a default value is used - for example 0 for numerical columns."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.categorical PivotTransform]))

(defn ->pivot-transform
  "Constructor.

  key-column-name - Key column to expand - `java.lang.String`
  value-column-name - Name of the column that contains the value - `java.lang.String`
  default-value - The default value to use in expanded columns. - `org.datavec.api.writable.Writable`"
  (^PivotTransform [^java.lang.String key-column-name ^java.lang.String value-column-name ^org.datavec.api.writable.Writable default-value]
    (new PivotTransform key-column-name value-column-name default-value))
  (^PivotTransform [^java.lang.String key-column-name ^java.lang.String value-column-name]
    (new PivotTransform key-column-name value-column-name)))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^PivotTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn output-column-name
  "Description copied from interface: ColumnOp

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^PivotTransform this]
    (-> this (.outputColumnName))))

(defn output-column-names
  "Description copied from interface: ColumnOp

  returns: the output column names - `java.lang.String[]`"
  ([^PivotTransform this]
    (-> this (.outputColumnNames))))

(defn column-names
  "Description copied from interface: ColumnOp

  returns: `java.lang.String[]`"
  ([^PivotTransform this]
    (-> this (.columnNames))))

(defn column-name
  "Description copied from interface: ColumnOp

  returns: `java.lang.String`"
  (^java.lang.String [^PivotTransform this]
    (-> this (.columnName))))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^PivotTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^PivotTransform this ^java.lang.Object sequence]
    (-> this (.mapSequence sequence))))

