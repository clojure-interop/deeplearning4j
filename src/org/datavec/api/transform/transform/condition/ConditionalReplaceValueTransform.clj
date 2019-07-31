(ns org.datavec.api.transform.transform.condition.ConditionalReplaceValueTransform
  "Replace the value in a specified column with a new value, if a condition is satisfied/true.
 Note that the condition can be any generic condition, including on other column(s), different to the column
 that will be modified if the condition is satisfied/true.

 Note: For sequences, this transform use the convention that each step in the sequence is passed to the condition,
 and replaced (or not) separately (i.e., Condition.condition(List) is used on each time step individually)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.condition ConditionalReplaceValueTransform]))

(defn ->conditional-replace-value-transform
  "Constructor.

  column-to-replace - Name of the column in which to replace the old value with 'newValue', if the condition holds - `java.lang.String`
  new-value - New value to use - `org.datavec.api.writable.Writable`
  condition - Condition - `org.datavec.api.transform.condition.Condition`"
  (^ConditionalReplaceValueTransform [^java.lang.String column-to-replace ^org.datavec.api.writable.Writable new-value ^org.datavec.api.transform.condition.Condition condition]
    (new ConditionalReplaceValueTransform column-to-replace new-value condition)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^ConditionalReplaceValueTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^ConditionalReplaceValueTransform this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ConditionalReplaceValueTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ConditionalReplaceValueTransform this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^ConditionalReplaceValueTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ConditionalReplaceValueTransform this]
    (-> this (.getInputSchema))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^ConditionalReplaceValueTransform this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^ConditionalReplaceValueTransform this]
    (-> this (.columnNames))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^ConditionalReplaceValueTransform this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^ConditionalReplaceValueTransform this]
    (-> this (.columnName))))

