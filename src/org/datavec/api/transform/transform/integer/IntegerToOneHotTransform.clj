(ns org.datavec.api.transform.transform.integer.IntegerToOneHotTransform
  "Convert an integer column to a set of one-hot columns."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.integer IntegerToOneHotTransform]))

(defn ->integer-to-one-hot-transform
  "Constructor.

  column-name - `java.lang.String`
  min-value - `int`
  max-value - `int`"
  (^IntegerToOneHotTransform [^java.lang.String column-name ^Integer min-value ^Integer max-value]
    (new IntegerToOneHotTransform column-name min-value max-value)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^IntegerToOneHotTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^IntegerToOneHotTransform this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^IntegerToOneHotTransform this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.transform schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^IntegerToOneHotTransform this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^IntegerToOneHotTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn map-sequence
  "Transform a sequence

  sequence - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^IntegerToOneHotTransform this ^java.lang.Object sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^IntegerToOneHotTransform this]
    (-> this (.columnNames))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^IntegerToOneHotTransform this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^IntegerToOneHotTransform this]
    (-> this (.columnName))))

