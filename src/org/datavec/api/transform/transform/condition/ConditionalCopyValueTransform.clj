(ns org.datavec.api.transform.transform.condition.ConditionalCopyValueTransform
  "Replace the value in a specified column with a new value taken from another column, if a condition is satisfied/true.
 Note that the condition can be any generic condition, including on other column(s), different to the column
 that will be modified if the condition is satisfied/true.

 Note: For sequences, this
 transform use the convention that
 each step in the sequence is passed
 to the condition,
 and replaced (or not) separately (i.e., Condition.condition(List)
 is used on each time step individually)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.condition ConditionalCopyValueTransform]))

(defn ->conditional-copy-value-transform
  "Constructor.

  column-to-replace - Name of the column in which to replace the old value - `java.lang.String`
  source-column - Name of the column to get the new value from - `java.lang.String`
  condition - Condition - `org.datavec.api.transform.condition.Condition`"
  (^ConditionalCopyValueTransform [^java.lang.String column-to-replace ^java.lang.String source-column ^org.datavec.api.transform.condition.Condition condition]
    (new ConditionalCopyValueTransform column-to-replace source-column condition)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^ConditionalCopyValueTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^ConditionalCopyValueTransform this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ConditionalCopyValueTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ConditionalCopyValueTransform this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^ConditionalCopyValueTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ConditionalCopyValueTransform this]
    (-> this (.getInputSchema))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^ConditionalCopyValueTransform this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^ConditionalCopyValueTransform this]
    (-> this (.columnNames))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^ConditionalCopyValueTransform this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^ConditionalCopyValueTransform this]
    (-> this (.columnName))))

