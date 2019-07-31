(ns org.datavec.api.transform.sequence.comparator.BaseColumnComparator
  "Compare/sort a sequence by the values of a specific column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.sequence.comparator BaseColumnComparator]))

(defn compare
  "o-1 - `java.util.List`
  o-2 - `java.util.List`

  returns: `int`"
  (^Integer [^BaseColumnComparator this ^java.util.List o-1 ^java.util.List o-2]
    (-> this (.compare o-1 o-2))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^BaseColumnComparator this]
    (-> this (.outputColumnName))))

(defn transform
  "Get the output schema for this transformation, given an input schema

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^BaseColumnComparator this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn set-input-schema
  "Set the input schema.

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^BaseColumnComparator this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Getter for input schema

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^BaseColumnComparator this]
    (-> this (.getInputSchema))))

(defn set-schema
  "sequence-schema - `org.datavec.api.transform.schema.Schema`"
  ([^BaseColumnComparator this ^org.datavec.api.transform.schema.Schema sequence-schema]
    (-> this (.setSchema sequence-schema))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^BaseColumnComparator this]
    (-> this (.columnNames))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^BaseColumnComparator this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^BaseColumnComparator this]
    (-> this (.columnName))))

