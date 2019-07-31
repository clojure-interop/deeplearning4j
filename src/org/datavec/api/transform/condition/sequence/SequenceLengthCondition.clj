(ns org.datavec.api.transform.condition.sequence.SequenceLengthCondition
  "A condition on sequence lengths"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition.sequence SequenceLengthCondition]))

(defn ->sequence-length-condition
  "Constructor.

  op - `org.datavec.api.transform.condition.ConditionOp`
  length - `int`"
  (^SequenceLengthCondition [^org.datavec.api.transform.condition.ConditionOp op ^Integer length]
    (new SequenceLengthCondition op length)))

(defn output-column-name
  "Description copied from interface: ColumnOp

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^SequenceLengthCondition this]
    (-> this (.outputColumnName))))

(defn condition-sequence
  "Description copied from interface: Condition

  sequence - Current sequence - `java.util.List`

  returns: true if condition satisfied, false otherwise - `boolean`"
  (^Boolean [^SequenceLengthCondition this ^java.util.List sequence]
    (-> this (.conditionSequence sequence))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^SequenceLengthCondition this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn condition
  "Description copied from interface: Condition

  list - Current example - `java.util.List`

  returns: true if condition satisfied, false otherwise - `boolean`"
  (^Boolean [^SequenceLengthCondition this ^java.util.List list]
    (-> this (.condition list))))

(defn set-input-schema
  "Description copied from interface: Condition

  schema - `org.datavec.api.transform.schema.Schema`"
  ([^SequenceLengthCondition this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.setInputSchema schema))))

(defn get-input-schema
  "Description copied from interface: Condition

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^SequenceLengthCondition this]
    (-> this (.getInputSchema))))

(defn column-names
  "Description copied from interface: ColumnOp

  returns: `java.lang.String[]`"
  ([^SequenceLengthCondition this]
    (-> this (.columnNames))))

(defn output-column-names
  "Description copied from interface: ColumnOp

  returns: the output column names - `java.lang.String[]`"
  ([^SequenceLengthCondition this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Description copied from interface: ColumnOp

  returns: `java.lang.String`"
  (^java.lang.String [^SequenceLengthCondition this]
    (-> this (.columnName))))

