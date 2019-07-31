(ns org.datavec.api.transform.transform.column.AddConstantColumnTransform
  "Add a new column, where the values in that column for all records are identical (according to the specified value)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.column AddConstantColumnTransform]))

(defn ->add-constant-column-transform
  "Constructor.

  new-column-name - `java.lang.String`
  new-column-type - `org.datavec.api.transform.ColumnType`
  fixed-value - `org.datavec.api.writable.Writable`"
  (^AddConstantColumnTransform [^java.lang.String new-column-name ^org.datavec.api.transform.ColumnType new-column-type ^org.datavec.api.writable.Writable fixed-value]
    (new AddConstantColumnTransform new-column-name new-column-type fixed-value)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^AddConstantColumnTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "Description copied from interface: ColumnOp

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^AddConstantColumnTransform this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^AddConstantColumnTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^AddConstantColumnTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^AddConstantColumnTransform this]
    (-> this (.getInputSchema))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^AddConstantColumnTransform this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Description copied from interface: ColumnOp

  returns: `java.lang.String[]`"
  ([^AddConstantColumnTransform this]
    (-> this (.columnNames))))

(defn output-column-names
  "Description copied from interface: ColumnOp

  returns: the output column names - `java.lang.String[]`"
  ([^AddConstantColumnTransform this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Description copied from interface: ColumnOp

  returns: `java.lang.String`"
  (^java.lang.String [^AddConstantColumnTransform this]
    (-> this (.columnName))))

