(ns org.datavec.api.transform.transform.string.StringListToCategoricalSetTransform
  "Convert a delimited String to a list of binary categorical columns.
 Suppose the possible String values were {\"a\",\"b\",\"c\",\"d\"} and the String column value to be converted contained
 the String \"a,c\", then the 4 output columns would have values [\"true\",\"false\",\"true\",\"false\"]"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.string StringListToCategoricalSetTransform]))

(defn ->string-list-to-categorical-set-transform
  "Constructor.

  column-name - The name of the column to convert - `java.lang.String`
  new-column-names - The names of the new columns to create - `java.util.List`
  category-tokens - The possible tokens that may be present. Note this list must have the same length and orderas the newColumnNames list - `java.util.List`
  delimiter - The delimiter for the Strings to convert - `java.lang.String`"
  (^StringListToCategoricalSetTransform [^java.lang.String column-name ^java.util.List new-column-names ^java.util.List category-tokens ^java.lang.String delimiter]
    (new StringListToCategoricalSetTransform column-name new-column-names category-tokens delimiter)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^StringListToCategoricalSetTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^StringListToCategoricalSetTransform this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^StringListToCategoricalSetTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StringListToCategoricalSetTransform this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^StringListToCategoricalSetTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn map-sequence
  "Transform a sequence

  sequence - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^StringListToCategoricalSetTransform this ^java.lang.Object sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^StringListToCategoricalSetTransform this]
    (-> this (.columnNames))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^StringListToCategoricalSetTransform this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^StringListToCategoricalSetTransform this]
    (-> this (.columnName))))

