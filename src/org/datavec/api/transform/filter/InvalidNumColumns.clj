(ns org.datavec.api.transform.filter.InvalidNumColumns
  "Remove invalid records of a certain size."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.filter InvalidNumColumns]))

(defn ->invalid-num-columns
  "Constructor."
  (^InvalidNumColumns []
    (new InvalidNumColumns )))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^InvalidNumColumns this]
    (-> this (.outputColumnName))))

(defn remove-sequence
  "sequence - sequence example - `java.lang.Object`

  returns: true if example should be removed, false to keep - `boolean`"
  (^Boolean [^InvalidNumColumns this ^java.lang.Object sequence]
    (-> this (.removeSequence sequence))))

(defn transform
  "Get the output schema for this transformation, given an input schema

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^InvalidNumColumns this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  schema - `org.datavec.api.transform.schema.Schema`"
  ([^InvalidNumColumns this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.setInputSchema schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^InvalidNumColumns this]
    (-> this (.getInputSchema))))

(defn remove-example
  "writables - Example - `java.lang.Object`

  returns: true if example should be removed, false to keep - `boolean`"
  (^Boolean [^InvalidNumColumns this ^java.lang.Object writables]
    (-> this (.removeExample writables))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^InvalidNumColumns this]
    (-> this (.columnNames))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^InvalidNumColumns this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^InvalidNumColumns this]
    (-> this (.columnName))))

