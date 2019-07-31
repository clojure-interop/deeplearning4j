(ns org.datavec.api.transform.transform.condition.ConditionalReplaceValueTransformWithDefault
  "Replace the value in a specified column with a 'yes' value, if a condition is satisfied/true.
 Replace the value of this same column with a 'no' value otherwise.
 Note that the condition can be any generic condition, including on other column(s), different to the column
 that will be modified if the condition is satisfied/true.

 Note: For sequences, this transform use the convention that each step in the sequence is passed to the condition,
 and replaced (or not) separately (i.e., Condition.condition(List) is used on each time step individually)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.condition ConditionalReplaceValueTransformWithDefault]))

(defn ->conditional-replace-value-transform-with-default
  "Constructor.

  column-to-replace - `java.lang.String`
  yes-val - `org.datavec.api.writable.Writable`
  no-val - `org.datavec.api.writable.Writable`
  condition - `org.datavec.api.transform.condition.Condition`"
  (^ConditionalReplaceValueTransformWithDefault [^java.lang.String column-to-replace ^org.datavec.api.writable.Writable yes-val ^org.datavec.api.writable.Writable no-val ^org.datavec.api.transform.condition.Condition condition]
    (new ConditionalReplaceValueTransformWithDefault column-to-replace yes-val no-val condition)))

(defn map
  "Description copied from interface: Transform

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^ConditionalReplaceValueTransformWithDefault this ^java.lang.Object input]
    (-> this (.map input))))

(defn output-column-name
  "Description copied from interface: ColumnOp

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^ConditionalReplaceValueTransformWithDefault this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ConditionalReplaceValueTransformWithDefault this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ConditionalReplaceValueTransformWithDefault this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^ConditionalReplaceValueTransformWithDefault this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ConditionalReplaceValueTransformWithDefault this]
    (-> this (.getInputSchema))))

(defn map-sequence
  "Description copied from interface: Transform

  sequence - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^ConditionalReplaceValueTransformWithDefault this ^java.util.List sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Description copied from interface: ColumnOp

  returns: `java.lang.String[]`"
  ([^ConditionalReplaceValueTransformWithDefault this]
    (-> this (.columnNames))))

(defn output-column-names
  "Description copied from interface: ColumnOp

  returns: the output column names - `java.lang.String[]`"
  ([^ConditionalReplaceValueTransformWithDefault this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Description copied from interface: ColumnOp

  returns: `java.lang.String`"
  (^java.lang.String [^ConditionalReplaceValueTransformWithDefault this]
    (-> this (.columnName))))

