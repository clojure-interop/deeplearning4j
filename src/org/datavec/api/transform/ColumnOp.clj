(ns org.datavec.api.transform.ColumnOp
  "ColumnOp
 is a transform meant
 to run over 1 or more columns"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform ColumnOp]))

(defn transform
  "Get the output schema for this transformation, given an input schema

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ColumnOp this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn set-input-schema
  "Set the input schema.

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^ColumnOp this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn get-input-schema
  "Getter for input schema

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^ColumnOp this]
    (-> this (.getInputSchema))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^ColumnOp this]
    (-> this (.outputColumnName))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^ColumnOp this]
    (-> this (.outputColumnNames))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^ColumnOp this]
    (-> this (.columnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^ColumnOp this]
    (-> this (.columnName))))

