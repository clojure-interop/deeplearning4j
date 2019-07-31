(ns org.datavec.api.transform.condition.column.BaseColumnCondition
  "Abstract class for column conditions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.condition.column BaseColumnCondition]))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^BaseColumnCondition this]
    (-> this (.outputColumnName))))

(defn condition-sequence
  "Description copied from interface: Condition

  list - Current sequence - `java.util.List`

  returns: true if condition satisfied, false otherwise - `boolean`"
  (^Boolean [^BaseColumnCondition this ^java.util.List list]
    (-> this (.conditionSequence list))))

(defn transform
  "Get the output schema for this transformation, given an input schema

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^BaseColumnCondition this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn condition
  "Description copied from interface: Condition

  list - Current example - `java.util.List`

  returns: true if condition satisfied, false otherwise - `boolean`"
  (^Boolean [^BaseColumnCondition this ^java.util.List list]
    (-> this (.condition list))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseColumnCondition this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: Condition

  schema - `org.datavec.api.transform.schema.Schema`"
  ([^BaseColumnCondition this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.setInputSchema schema))))

(defn get-input-schema
  "Description copied from interface: Condition

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^BaseColumnCondition this]
    (-> this (.getInputSchema))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^BaseColumnCondition this]
    (-> this (.columnNames))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^BaseColumnCondition this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^BaseColumnCondition this]
    (-> this (.columnName))))

