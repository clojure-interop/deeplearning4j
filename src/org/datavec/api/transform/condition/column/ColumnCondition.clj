(ns org.datavec.api.transform.condition.column.ColumnCondition
  "Created by agibsonccc on 11/26/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition.column ColumnCondition]))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^ColumnCondition this]
    (-> this (.outputColumnName))))

(defn column-condition
  "Returns whether the given element
  meets the condition set by this operation

  writable - the element to test - `org.datavec.api.writable.Writable`

  returns: true if the condition is met
  false otherwise - `boolean`"
  (^Boolean [^ColumnCondition this ^org.datavec.api.writable.Writable writable]
    (-> this (.columnCondition writable))))

(defn condition-sequence
  "Description copied from interface: Condition

  list - Current sequence - `java.util.List`

  returns: true if condition satisfied, false otherwise - `boolean`"
  (^Boolean [^ColumnCondition this ^java.util.List list]
    (-> this (.conditionSequence list))))

(defn transform
  "Get the output schema for this transformation, given an input schema

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ColumnCondition this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn condition
  "Description copied from interface: Condition

  list - Current example - `java.util.List`

  returns: true if condition satisfied, false otherwise - `boolean`"
  (^Boolean [^ColumnCondition this ^java.util.List list]
    (-> this (.condition list))))

(defn set-input-schema
  "Description copied from interface: Condition

  schema - `org.datavec.api.transform.schema.Schema`"
  ([^ColumnCondition this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.setInputSchema schema))))

(defn get-input-schema
  "Description copied from interface: Condition

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ColumnCondition this]
    (-> this (.getInputSchema))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^ColumnCondition this]
    (-> this (.columnNames))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^ColumnCondition this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^ColumnCondition this]
    (-> this (.columnName))))

