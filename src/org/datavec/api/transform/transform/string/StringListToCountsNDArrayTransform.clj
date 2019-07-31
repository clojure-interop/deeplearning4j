(ns org.datavec.api.transform.transform.string.StringListToCountsNDArrayTransform
  "Converts String column into a bag-of-words (BOW) represented as an NDArray of \"counts.\"
 Note that the original column is removed in the process"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.string StringListToCountsNDArrayTransform]))

(defn ->string-list-to-counts-nd-array-transform
  "Constructor.

  column-name - The name of the column to convert - `java.lang.String`
  new-column-name - `java.lang.String`
  vocabulary - The possible tokens that may be present. - `java.util.List`
  delimiter - The delimiter for the Strings to convert - `java.lang.String`
  binary - `boolean`
  ignore-unknown - Whether to ignore unknown tokens - `boolean`"
  (^StringListToCountsNDArrayTransform [^java.lang.String column-name ^java.lang.String new-column-name ^java.util.List vocabulary ^java.lang.String delimiter ^Boolean binary ^Boolean ignore-unknown]
    (new StringListToCountsNDArrayTransform column-name new-column-name vocabulary delimiter binary ignore-unknown))
  (^StringListToCountsNDArrayTransform [^java.lang.String column-name ^java.util.List vocabulary ^java.lang.String delimiter ^Boolean binary ^Boolean ignore-unknown]
    (new StringListToCountsNDArrayTransform column-name vocabulary delimiter binary ignore-unknown)))

(defn *read-vocab-from-file
  "path - `java.lang.String`

  returns: `java.util.List<java.lang.String>`

  throws: java.io.IOException"
  (^java.util.List [^java.lang.String path]
    (StringListToCountsNDArrayTransform/readVocabFromFile path)))

(defn map
  "Description copied from interface: Transform

  writables - the record to transform - `java.util.List`

  returns: the transformed writable - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^StringListToCountsNDArrayTransform this ^java.util.List writables]
    (-> this (.map writables))))

(defn output-column-name
  "The output column name
  after the operation has been applied

  returns: the output column name - `java.lang.String`"
  (^java.lang.String [^StringListToCountsNDArrayTransform this]
    (-> this (.outputColumnName))))

(defn transform
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`

  returns: `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^StringListToCountsNDArrayTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.transform input-schema))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StringListToCountsNDArrayTransform this]
    (-> this (.toString))))

(defn set-input-schema
  "Description copied from interface: ColumnOp

  input-schema - `org.datavec.api.transform.schema.Schema`"
  ([^StringListToCountsNDArrayTransform this ^org.datavec.api.transform.schema.Schema input-schema]
    (-> this (.setInputSchema input-schema))))

(defn map-sequence
  "Transform a sequence

  sequence - `java.lang.Object`

  returns: `java.lang.Object`"
  (^java.lang.Object [^StringListToCountsNDArrayTransform this ^java.lang.Object sequence]
    (-> this (.mapSequence sequence))))

(defn column-names
  "Returns column names
  this op is meant to run on

  returns: `java.lang.String[]`"
  ([^StringListToCountsNDArrayTransform this]
    (-> this (.columnNames))))

(defn output-column-names
  "The output column names
  This will often be the same as the input

  returns: the output column names - `java.lang.String[]`"
  ([^StringListToCountsNDArrayTransform this]
    (-> this (.outputColumnNames))))

(defn column-name
  "Returns a singular column name
  this op is meant to run on

  returns: `java.lang.String`"
  (^java.lang.String [^StringListToCountsNDArrayTransform this]
    (-> this (.columnName))))

