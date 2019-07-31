(ns org.datavec.api.transform.rank.CalculateSortedRank
  "CalculateSortedRank: calculate the rank of each example, after sorting example.
 For example, we might have some numerical \"score\" column, and we want to know for the rank (sort order) for each
 example, according to that column.
 The rank of each example (after sorting) will be added in a new Long column. Indexing is done from 0; examples will have
 values 0 to dataSetSize - 1.
 Currently, CalculateSortedRank can only be applied on standard (i.e., non-sequence) data.
 Furthermore, the current implementation can only sort on one column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.rank CalculateSortedRank]))

(defn ->calculate-sorted-rank
  "Constructor.

  new-column-name - Name of the new column (will contain the rank for each example) - `java.lang.String`
  sort-on-column - Name of the column to sort on - `java.lang.String`
  comparator - Comparator used to sort examples - `org.datavec.api.writable.comparator.WritableComparator`
  ascending - Whether examples should be ascending or descending, using the comparator - `boolean`"
  (^CalculateSortedRank [^java.lang.String new-column-name ^java.lang.String sort-on-column ^org.datavec.api.writable.comparator.WritableComparator comparator ^Boolean ascending]
    (new CalculateSortedRank new-column-name sort-on-column comparator ascending))
  (^CalculateSortedRank [^java.lang.String new-column-name ^java.lang.String sort-on-column ^org.datavec.api.writable.comparator.WritableComparator comparator]
    (new CalculateSortedRank new-column-name sort-on-column comparator)))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^CalculateSortedRank this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  schema - `org.datavec.api.transform.schema.Schema`"
  ([^CalculateSortedRank this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.setInputSchema schema))))

(defn get-input-schema
  "Description copied from interface: ColumnOp

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^CalculateSortedRank this]
    (-> this (.getInputSchema))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^CalculateSortedRank this]
    (-> this (.outputColumnName))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^CalculateSortedRank this]
    (-> this (.outputColumnNames))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^CalculateSortedRank this]
    (-> this (.columnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^CalculateSortedRank this]
    (-> this (.columnName))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CalculateSortedRank this]
    (-> this (.toString))))

