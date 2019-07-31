(ns org.datavec.api.transform.filter.FilterInvalidValues
  "FilterInvalidValues: a filter operation that removes any examples (or sequences)
 if the examples/sequences contains
 invalid values in any of a specified set of columns.
 Invalid values are determined with respect to the schema"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.filter FilterInvalidValues]))

(defn ->filter-invalid-values
  "Constructor.

  Filter examples that have invalid values in ANY columns."
  (^FilterInvalidValues []
    (new FilterInvalidValues ))
  (^FilterInvalidValues [^java.lang.String columns-to-filter-if-invalid]
    (new FilterInvalidValues columns-to-filter-if-invalid)))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^FilterInvalidValues this]
    (-> this (.outputColumnName))))

(defn remove-sequence
  "sequence - sequence example - `java.lang.Object`

  returns: true if example should be removed, false to keep - `boolean`"
  (^Boolean [^FilterInvalidValues this ^java.lang.Object sequence]
    (-> this (.removeSequence sequence))))

(defn transform
  "Get the output schema for this transformation, given an input schema

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^FilterInvalidValues this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  schema - `org.datavec.api.transform.schema.Schema`"
  ([^FilterInvalidValues this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.setInputSchema schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^FilterInvalidValues this]
    (-> this (.getInputSchema))))

(defn remove-example
  "writables - Example - `java.lang.Object`

  returns: true if example should be removed, false to keep - `boolean`"
  (^Boolean [^FilterInvalidValues this ^java.lang.Object writables]
    (-> this (.removeExample writables))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^FilterInvalidValues this]
    (-> this (.columnNames))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^FilterInvalidValues this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^FilterInvalidValues this]
    (-> this (.columnName))))

