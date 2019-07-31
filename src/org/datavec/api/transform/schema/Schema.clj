(ns org.datavec.api.transform.schema.Schema
  "A Schema defines the layout of tabular data. Specifically, it contains names f
 or each column, as well as details of types
 (Integer, String, Long, Double, etc).
 Type information for each column may optionally include
 restrictions on the allowable values for each column.

 See also: SequenceSchema"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.schema Schema]))

(defn ->schema
  "Constructor.

  Create a schema based on the
  given metadata

  column-meta-data - the metadata to create theschema from - `java.util.List`"
  (^Schema [^java.util.List column-meta-data]
    (new Schema column-meta-data)))

(defn *from-json
  "Create a schema from a given json string

  json - the json to create the schema from - `java.lang.String`

  returns: the created schema based on the json - `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^java.lang.String json]
    (Schema/fromJson json)))

(defn *from-yaml
  "Create a schema from the given
  yaml string

  yaml - the yaml to create the schema from - `java.lang.String`

  returns: the created schema based on the yaml - `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^java.lang.String yaml]
    (Schema/fromYaml yaml)))

(defn *infer-multiple
  "Infers a schema based on the record.
  The column names are based on indexing.

  record - the record to infer from - `java.util.List`

  returns: the infered schema - `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^java.util.List record]
    (Schema/inferMultiple record)))

(defn *infer
  "Infers a schema based on the record.
  The column names are based on indexing.

  record - the record to infer from - `java.util.List`

  returns: the infered schema - `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^java.util.List record]
    (Schema/infer record)))

(defn same-types
  "Returns true if the given schema
  has the same types at each index

  schema - the schema to compare the types to - `org.datavec.api.transform.schema.Schema`

  returns: true if the schema has the same types
  at every index as this one,false otherwise - `boolean`"
  (^Boolean [^Schema this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.sameTypes schema))))

(defn get-type
  "Returns the ColumnType
  for the column at the specified index

  column - the index of the column to get the type for - `int`

  returns: the type of the column to at the specified inde - `org.datavec.api.transform.ColumnType`"
  (^org.datavec.api.transform.ColumnType [^Schema this ^Integer column]
    (-> this (.getType column))))

(defn get-index-of-columns
  "Return the indices of the columns, given their namess

  column-names - Name of the columns to get indices for - `java.util.Collection`

  returns: Column indexes - `int[]`"
  ([^Schema this ^java.util.Collection column-names]
    (-> this (.getIndexOfColumns column-names))))

(defn get-column-names
  "Return a copy of the list column names

  returns: a copy of the list of column names
  for this schema - `java.util.List<java.lang.String>`"
  (^java.util.List [^Schema this]
    (-> this (.getColumnNames))))

(defn get-column-types
  "A copy of the list of ColumnType
  for this schema

  returns: the list of column types in order based
  on column index for this schema - `java.util.List<org.datavec.api.transform.ColumnType>`"
  (^java.util.List [^Schema this]
    (-> this (.getColumnTypes))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Schema this]
    (-> this (.toString))))

(defn differences
  "Compute the difference in ColumnMetaData
  between this schema and the passed in schema.
  This is useful during the TransformProcess
  to identify what a process will do to a given Schema.

  schema - the schema to compute the difference for - `org.datavec.api.transform.schema.Schema`

  returns: the metadata that is different (in order)
  between this schema and the other schema - `java.util.List<org.datavec.api.transform.metadata.ColumnMetaData>`"
  (^java.util.List [^Schema this ^org.datavec.api.transform.schema.Schema schema]
    (-> this (.differences schema))))

(defn get-column-meta-data
  "Returns a copy of the underlying
  schema ColumnMetaData

  returns: the list of schema metadata - `java.util.List<org.datavec.api.transform.metadata.ColumnMetaData>`"
  (^java.util.List [^Schema this]
    (-> this (.getColumnMetaData))))

(defn get-name
  "Returns the name of a
  given column at the specified index

  column - the index of the columnto get the name for - `int`

  returns: the name of the column at the specified index - `java.lang.String`"
  (^java.lang.String [^Schema this ^Integer column]
    (-> this (.getName column))))

(defn get-meta-data
  "Returns the ColumnMetaData
  at the specified column index

  column - the indexto get the metadata for - `int`

  returns: the metadata at ths specified index - `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^Schema this ^Integer column]
    (-> this (.getMetaData column))))

(defn to-yaml
  "Serialize this schema to yaml

  returns: the yaml representation of this schema - `java.lang.String`"
  (^java.lang.String [^Schema this]
    (-> this (.toYaml))))

(defn to-json
  "Serialize this schema to json

  returns: a json representation of this schema - `java.lang.String`"
  (^java.lang.String [^Schema this]
    (-> this (.toJson))))

(defn new-schema
  "Create a new schema based on the new metadata

  column-meta-data - the new metadata to create theschema from - `java.util.List`

  returns: the new schema - `org.datavec.api.transform.schema.Schema`"
  (^org.datavec.api.transform.schema.Schema [^Schema this ^java.util.List column-meta-data]
    (-> this (.newSchema column-meta-data))))

(defn num-columns
  "Returns the number of columns or fields
  for this schema

  returns: the number of columns or fields for this schema - `int`"
  (^Integer [^Schema this]
    (-> this (.numColumns))))

(defn get-index-of-column
  "Returns the index for the given
  column name

  column-name - the column name to get theindex for - `java.lang.String`

  returns: the index of the given column name
  for the schema - `int`"
  (^Integer [^Schema this ^java.lang.String column-name]
    (-> this (.getIndexOfColumn column-name))))

(defn has-column?
  "Determine if the schema has a column with the specified name

  column-name - Name to see if the column exists - `java.lang.String`

  returns: True if a column exists for that name, false otherwise - `boolean`"
  (^Boolean [^Schema this ^java.lang.String column-name]
    (-> this (.hasColumn column-name))))

